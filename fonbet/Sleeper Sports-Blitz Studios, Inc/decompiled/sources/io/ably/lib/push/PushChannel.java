package io.ably.lib.push;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.JsonObject;
import io.ably.lib.http.BasePaginatedQuery;
import io.ably.lib.http.Http;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpScheduler;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.push.PushBase;
import io.ably.lib.realtime.CompletionListener;
import io.ably.lib.realtime.Presence;
import io.ably.lib.rest.AblyRest;
import io.ably.lib.rest.Channel;
import io.ably.lib.rest.DeviceDetails;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;
import io.ably.lib.util.ParamsUtils;

/* loaded from: classes9.dex */
public class PushChannel {
    protected final Channel channel;
    protected final AblyRest rest;

    public PushChannel(Channel channel, AblyRest ablyRest) {
        this.channel = channel;
        this.rest = ablyRest;
    }

    public void subscribeClient() throws AblyException {
        subscribeClientImpl().sync();
    }

    public void subscribeClientAsync(CompletionListener completionListener) {
        subscribeClientImpl().async(new CompletionListener.ToCallback(completionListener));
    }

    protected Http.Request<Void> subscribeClientImpl() {
        JsonObject jsonObject = new JsonObject();
        try {
            jsonObject.addProperty(Presence.GET_CLIENTID, getClientId());
            return postSubscription(jsonObject);
        } catch (AblyException e) {
            return this.rest.http.failedRequest(e);
        }
    }

    public void subscribeDevice() throws AblyException {
        subscribeDeviceImpl().sync();
    }

    public void subscribeDeviceAsync(CompletionListener completionListener) {
        subscribeDeviceImpl().async(new CompletionListener.ToCallback(completionListener));
    }

    protected Http.Request<Void> subscribeDeviceImpl() {
        try {
            DeviceDetails device = getDevice();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("deviceId", device.id);
            return postSubscription(jsonObject);
        } catch (AblyException e) {
            return this.rest.http.failedRequest(e);
        }
    }

    protected Http.Request<Void> postSubscription(JsonObject jsonObject) {
        jsonObject.addProperty(AppsFlyerProperties.CHANNEL, this.channel.name);
        final HttpCore.RequestBody requestBodyFromGson = HttpUtils.requestBodyFromGson(jsonObject, this.rest.options.useBinaryProtocol);
        return this.rest.http.request(new Http.Execute<Void>() { // from class: io.ably.lib.push.PushChannel.1
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, Callback<Void> callback) throws AblyException {
                httpScheduler.post("/push/channelSubscriptions", PushChannel.this.rest.push.pushRequestHeaders(true), ParamsUtils.enrichParams(null, PushChannel.this.rest.options), requestBodyFromGson, null, true, callback);
            }
        });
    }

    public void unsubscribeClient() throws AblyException {
        unsubscribeClientImpl().sync();
    }

    public void unsubscribeClientAsync(CompletionListener completionListener) {
        unsubscribeClientImpl().async(new CompletionListener.ToCallback(completionListener));
    }

    protected Http.Request<Void> unsubscribeClientImpl() {
        try {
            return delSubscription(new Param[]{new Param(AppsFlyerProperties.CHANNEL, this.channel.name), new Param(Presence.GET_CLIENTID, getClientId())});
        } catch (AblyException e) {
            return this.rest.http.failedRequest(e);
        }
    }

    public void unsubscribeDevice() throws AblyException {
        unsubscribeDeviceImpl().sync();
    }

    public void unsubscribeDeviceAsync(CompletionListener completionListener) {
        unsubscribeDeviceImpl().async(new CompletionListener.ToCallback(completionListener));
    }

    protected Http.Request<Void> unsubscribeDeviceImpl() {
        try {
            return delSubscription(new Param[]{new Param(AppsFlyerProperties.CHANNEL, this.channel.name), new Param("deviceId", getDevice().id)});
        } catch (AblyException e) {
            return this.rest.http.failedRequest(e);
        }
    }

    protected Http.Request<Void> delSubscription(Param[] paramArr) {
        final Param[] enrichParams = ParamsUtils.enrichParams(paramArr, this.rest.options);
        return this.rest.http.request(new Http.Execute<Void>() { // from class: io.ably.lib.push.PushChannel.2
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, Callback<Void> callback) throws AblyException {
                httpScheduler.del("/push/channelSubscriptions", PushChannel.this.rest.push.pushRequestHeaders(true), enrichParams, null, true, callback);
            }
        });
    }

    public PaginatedResult<PushBase.ChannelSubscription> listSubscriptions() throws AblyException {
        return listSubscriptions(new Param[0]);
    }

    public PaginatedResult<PushBase.ChannelSubscription> listSubscriptions(Param[] paramArr) throws AblyException {
        return listSubscriptionsImpl(paramArr).sync();
    }

    public void listSubscriptionsAsync(Callback<AsyncPaginatedResult<PushBase.ChannelSubscription>> callback) {
        listSubscriptionsAsync(new Param[0], callback);
    }

    public void listSubscriptionsAsync(Param[] paramArr, Callback<AsyncPaginatedResult<PushBase.ChannelSubscription>> callback) {
        listSubscriptionsImpl(paramArr).async(callback);
    }

    protected BasePaginatedQuery.ResultRequest<PushBase.ChannelSubscription> listSubscriptionsImpl(Param[] paramArr) {
        return new BasePaginatedQuery(this.rest.http, "/push/channelSubscriptions", this.rest.push.pushRequestHeaders(true), Param.set(paramArr, "concatFilters", "true"), PushBase.ChannelSubscription.httpBodyHandler).get();
    }

    protected String getClientId() throws AblyException {
        String str = getDevice().clientId;
        if (str != null) {
            return str;
        }
        throw AblyException.fromThrowable(new Exception("cannot subscribe with null client ID"));
    }

    protected DeviceDetails getDevice() throws AblyException {
        LocalDevice localDevice = this.rest.push.getActivationContext().getLocalDevice();
        if (localDevice == null || localDevice.deviceIdentityToken == null) {
            throw AblyException.fromThrowable(new Exception("cannot use device before AblyRest.push.activate has finished"));
        }
        return localDevice;
    }
}
