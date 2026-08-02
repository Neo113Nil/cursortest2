package spay.seamlessAuth.core.data.model;

import Ve.Em;
import Ve.Wk;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lspay/seamlessAuth/core/data/model/OIDCStand;", "", ImagesContract.URL, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "IFT", "PSI", "PROD", "Companion", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum OIDCStand {
    IFT("aHR0cHM6Ly9pZC1pZnQuc2Jlci5ydS9vaWRj"),
    PSI("aHR0cHM6Ly9pZC1wc2kuc2Jlci5ydS9vaWRj"),
    PROD("aHR0cHM6Ly9pZC5zYmVyLnJ1L29pZGM=");


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String url;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lspay/seamlessAuth/core/data/model/OIDCStand$Companion;", "", "()V", "getActualOIDCStand", "Lspay/seamlessAuth/core/data/model/OIDCStand;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                System.arraycopy(Em.f28942a, 0, new int[7], 0, 7);
                int[] iArr = new int[7];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OIDCStand getActualOIDCStand() {
            int a11 = Em.a(Wk.f30290b);
            return a11 != 0 ? a11 != 1 ? a11 != 2 ? OIDCStand.IFT : OIDCStand.IFT : OIDCStand.PSI : OIDCStand.PROD;
        }

        private Companion() {
        }
    }

    OIDCStand(String str) {
        this.url = str;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }
}
