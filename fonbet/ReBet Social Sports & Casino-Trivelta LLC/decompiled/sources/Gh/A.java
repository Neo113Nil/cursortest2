package Gh;

import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import io.radar.sdk.R0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class A {

    /* renamed from: g, reason: collision with root package name */
    public static final a f3959g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f3960a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3961b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3962c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f3963d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3964e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3965f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final A a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                String id2 = jSONObject.getString(StackTraceHelper.ID_KEY);
                String name = jSONObject.getString("name");
                String code = jSONObject.getString(EventKeys.ERROR_CODE);
                int i10 = jSONObject.getInt("utcOffset");
                int i11 = jSONObject.getInt("dstOffset");
                Date o10 = R0.f49781a.o(jSONObject.getString("currentTime"));
                if (o10 == null) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(id2, "id");
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(code, "code");
                return new A(id2, name, code, o10, i10, i11);
            } catch (Exception unused) {
                return null;
            }
        }

        public a() {
        }
    }

    public A(String id2, String name, String code, Date currentTime, int i10, int i11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        this.f3960a = id2;
        this.f3961b = name;
        this.f3962c = code;
        this.f3963d = currentTime;
        this.f3964e = i10;
        this.f3965f = i11;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(StackTraceHelper.ID_KEY, this.f3960a);
        jSONObject.putOpt("name", this.f3961b);
        jSONObject.putOpt(EventKeys.ERROR_CODE, this.f3962c);
        SimpleDateFormat simpleDateFormat = this.f3964e == 0 ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US) : new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.US);
        simpleDateFormat.setTimeZone(this.f3964e == 0 ? TimeZone.getTimeZone("UTC") : TimeZone.getTimeZone(this.f3960a));
        String formattedTime = simpleDateFormat.format(this.f3963d);
        if (this.f3964e != 0) {
            StringBuilder sb2 = new StringBuilder();
            Intrinsics.checkNotNullExpressionValue(formattedTime, "formattedTime");
            String substring = formattedTime.substring(0, formattedTime.length() - 2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring);
            sb2.append(':');
            String substring2 = formattedTime.substring(formattedTime.length() - 2);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring2);
            formattedTime = sb2.toString();
        }
        jSONObject.putOpt("currentTime", formattedTime);
        jSONObject.putOpt("utcOffset", Integer.valueOf(this.f3964e));
        jSONObject.putOpt("dstOffset", Integer.valueOf(this.f3965f));
        return jSONObject;
    }
}
