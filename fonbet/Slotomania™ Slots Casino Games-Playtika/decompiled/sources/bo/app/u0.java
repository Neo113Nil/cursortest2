package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.braze.Constants;
import com.braze.support.DateTimeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lbo/app/u0;", "", "Lbo/app/a5;", TypedValues.AttributesType.S_TARGET, "", Constants.BRAZE_PUSH_CONTENT_KEY, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class u0 {
    public static final a b = new a(null);
    private final SharedPreferences a;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lbo/app/u0$a;", "", "", "LAST_REQUEST_AT_MAX_VALUE", "J", "getLAST_REQUEST_AT_MAX_VALUE$android_sdk_base_release$annotations", "()V", "", "STORAGE_FILE", "Ljava/lang/String;", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public u0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("persistent.com.braze.requests.metadata.last_req_at", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…LE, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }

    public final long a(a5 target) {
        Intrinsics.checkNotNullParameter(target, "target");
        String stringPlus = Intrinsics.stringPlus("uri-", Integer.valueOf(target.getA().hashCode()));
        long j = this.a.getLong(stringPlus, 0L);
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.a.edit().putLong(stringPlus, nowInMilliseconds).apply();
        return Math.min(nowInMilliseconds - j, 7200000L);
    }
}
