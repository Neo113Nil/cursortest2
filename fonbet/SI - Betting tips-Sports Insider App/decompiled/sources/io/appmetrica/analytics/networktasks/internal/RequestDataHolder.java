package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class RequestDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private NetworkTask.Method f15226a = NetworkTask.Method.GET;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f15227b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private byte[] f15228c = null;

    /* renamed from: d, reason: collision with root package name */
    private Long f15229d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f15230e;

    public void applySendTime(long j) {
        this.f15229d = Long.valueOf(j);
        this.f15230e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j) * 1000) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f15227b;
    }

    @NonNull
    public NetworkTask.Method getMethod() {
        return this.f15226a;
    }

    public byte[] getPostData() {
        return this.f15228c;
    }

    public Long getSendTimestamp() {
        return this.f15229d;
    }

    public Integer getSendTimezoneSec() {
        return this.f15230e;
    }

    public void setHeader(@NonNull String str, @NonNull String... strArr) {
        this.f15227b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(byte[] bArr) {
        this.f15226a = NetworkTask.Method.POST;
        this.f15228c = bArr;
    }
}
