package io.agora.rtc2;

import io.agora.utils2.internal.Logging;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PublisherConfiguration {
    private JSONObject jsonObject;

    public static class Builder {
        private PublisherParameters params = new PublisherParameters();

        public Builder bitRate(int i10) {
            this.params.bitrate = i10;
            return this;
        }

        public PublisherConfiguration build() {
            return new PublisherConfiguration(this);
        }

        public Builder defaultLayout(int i10) {
            this.params.defaultLayout = i10;
            return this;
        }

        public Builder extraInfo(String str) {
            this.params.extraInfo = str;
            return this;
        }

        public Builder frameRate(int i10) {
            this.params.framerate = i10;
            return this;
        }

        public Builder injectStream(String str, int i10, int i11) {
            if (str != null && i10 != 0 && i11 != 0) {
                PublisherParameters publisherParameters = this.params;
                publisherParameters.injectStreamUrl = str;
                publisherParameters.injectStreamWidth = i10;
                publisherParameters.injectStreamHeight = i11;
            }
            return this;
        }

        public Builder owner(boolean z10) {
            this.params.owner = z10;
            return this;
        }

        public Builder publishUrl(String str) {
            this.params.publishUrl = str;
            return this;
        }

        public Builder rawStreamUrl(String str) {
            this.params.rawStreamUrl = str;
            return this;
        }

        public Builder size(int i10, int i11) {
            PublisherParameters publisherParameters = this.params;
            publisherParameters.width = i10;
            publisherParameters.height = i11;
            return this;
        }

        public Builder streamLifeCycle(int i10) {
            this.params.lifecycle = i10;
            return this;
        }
    }

    private PublisherConfiguration(Builder builder) {
        try {
            this.jsonObject = new JSONObject().put("owner", builder.params.owner).put("lifecycle", builder.params.lifecycle).put("defaultLayout", builder.params.defaultLayout).put("width", builder.params.width).put("height", builder.params.height).put("framerate", builder.params.framerate).put("bitrate", builder.params.bitrate).put("mosaicStream", builder.params.publishUrl).put("rawStream", builder.params.rawStreamUrl).put("extraInfo", builder.params.extraInfo);
            if (builder.params.injectStreamUrl == null || builder.params.injectStreamWidth == 0 || builder.params.injectStreamHeight == 0) {
                return;
            }
            this.jsonObject.put("injectInfo", new JSONObject().put("injectStream", builder.params.injectStreamUrl).put("width", builder.params.injectStreamWidth).put("height", builder.params.injectStreamHeight));
        } catch (JSONException unused) {
            this.jsonObject = null;
            Logging.e("failed to create PublisherConfiguration");
        }
    }

    public String toJsonString() {
        if (validate()) {
            return this.jsonObject.toString();
        }
        return null;
    }

    public boolean validate() {
        return this.jsonObject != null;
    }
}
