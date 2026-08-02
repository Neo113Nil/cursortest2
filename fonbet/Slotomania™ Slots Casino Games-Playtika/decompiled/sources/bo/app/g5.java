package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.support.StringUtils;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004J&\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00042\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004¨\u0006\u0011"}, d2 = {"Lbo/app/g5;", "", "Ljava/util/EnumSet;", "Lcom/braze/enums/BrazeSdkMetadata;", "Lcom/braze/enums/MetadataTags;", "sdkMetadata", "", Constants.BRAZE_PUSH_CONTENT_KEY, "newSdkMetadata", "b", "Landroid/content/Context;", "context", "", "userId", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class g5 {
    public static final a b = new a(null);
    private final SharedPreferences a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lbo/app/g5$a;", "", "", "DATA_KEY", "Ljava/lang/String;", "STORAGE_PREFIX", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g5(Context context, String userId, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.braze.storage.sdk_metadata_cache", StringUtils.getCacheFileSuffix(context, userId, apiKey)), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }

    public final void a(EnumSet<BrazeSdkMetadata> sdkMetadata) {
        Intrinsics.checkNotNullParameter(sdkMetadata, "sdkMetadata");
        this.a.edit().putStringSet("tags", w0.a(sdkMetadata)).apply();
    }

    public final EnumSet<BrazeSdkMetadata> b(EnumSet<BrazeSdkMetadata> newSdkMetadata) {
        Intrinsics.checkNotNullParameter(newSdkMetadata, "newSdkMetadata");
        if (Intrinsics.areEqual(w0.a(newSdkMetadata), this.a.getStringSet("tags", SetsKt.emptySet()))) {
            return null;
        }
        return newSdkMetadata;
    }
}
