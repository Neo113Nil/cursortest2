package ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation;

import B0.A0;
import B0.C2454a;
import C.o0;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Ns.b;
import Ve.C4598rp;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002,-B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JN\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "heightPx", "", "size", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;", "state", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$ActionIcon;", "adultActionIcon", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$CustomStyle;", "customStyle", "<init>", "(JILjava/lang/String;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$ActionIcon;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$CustomStyle;)V", "copy", "(JILjava/lang/String;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$ActionIcon;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$CustomStyle;)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getHeightPx", "Ljava/lang/String;", "getSize", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;", "getState", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$ActionIcon;", "getAdultActionIcon", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$ActionIcon;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$CustomStyle;", "getCustomStyle", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$CustomStyle;", "State", "CustomStyle", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProductActionBarVO implements c {
    private final State.ActionIcon adultActionIcon;

    @NotNull
    private final CustomStyle customStyle;
    private final int heightPx;
    private final long id;

    @NotNull
    private final String size;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$CustomStyle;", "", "", "backgroundColorToken", "pressedBgToken", "iconColorToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColorToken", "getPressedBgToken", "getIconColorToken", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomStyle {
        private final String backgroundColorToken;
        private final String iconColorToken;
        private final String pressedBgToken;

        public CustomStyle(String str, String str2, String str3) {
            this.backgroundColorToken = str;
            this.pressedBgToken = str2;
            this.iconColorToken = str3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomStyle)) {
                return false;
            }
            CustomStyle customStyle = (CustomStyle) other;
            return Intrinsics.d(this.backgroundColorToken, customStyle.backgroundColorToken) && Intrinsics.d(this.pressedBgToken, customStyle.pressedBgToken) && Intrinsics.d(this.iconColorToken, customStyle.iconColorToken);
        }

        public final String getBackgroundColorToken() {
            return this.backgroundColorToken;
        }

        public final String getIconColorToken() {
            return this.iconColorToken;
        }

        public int hashCode() {
            String str = this.backgroundColorToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.pressedBgToken;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.iconColorToken;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColorToken;
            String str2 = this.pressedBgToken;
            return o0.c(C3660k.d("CustomStyle(backgroundColorToken=", str, ", pressedBgToken=", str2, ", iconColorToken="), this.iconColorToken, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;", "", "", "shouldAnimate", "<init>", "(Z)V", "Z", "getShouldAnimate", "()Z", "ActionIcon", "QuantityControl", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$ActionIcon;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$QuantityControl;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class State {
        private final boolean shouldAnimate;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$ActionIcon;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;", "", "iconToken", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "shouldAnimate", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIconToken", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "getShouldAnimate", "()Z", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ActionIcon extends State {

            @NotNull
            private final AtomAction action;

            @NotNull
            private final String iconToken;
            private final boolean shouldAnimate;
            private final t tokenizedEvent;

            public /* synthetic */ ActionIcon(String str, AtomAction atomAction, t tVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, atomAction, tVar, (i11 & 8) != 0 ? false : z11);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionIcon)) {
                    return false;
                }
                ActionIcon actionIcon = (ActionIcon) other;
                return Intrinsics.d(this.iconToken, actionIcon.iconToken) && Intrinsics.d(this.action, actionIcon.action) && Intrinsics.d(this.tokenizedEvent, actionIcon.tokenizedEvent) && this.shouldAnimate == actionIcon.shouldAnimate;
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final String getIconToken() {
                return this.iconToken;
            }

            public final t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int a11 = C4598rp.a(this.action, this.iconToken.hashCode() * 31, 31);
                t tVar = this.tokenizedEvent;
                return Boolean.hashCode(this.shouldAnimate) + ((a11 + (tVar == null ? 0 : tVar.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                return "ActionIcon(iconToken=" + this.iconToken + ", action=" + this.action + ", tokenizedEvent=" + this.tokenizedEvent + ", shouldAnimate=" + this.shouldAnimate + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionIcon(@NotNull String iconToken, @NotNull AtomAction action, t tVar, boolean z11) {
                super(z11, null);
                Intrinsics.checkNotNullParameter(iconToken, "iconToken");
                Intrinsics.checkNotNullParameter(action, "action");
                this.iconToken = iconToken;
                this.action = action;
                this.tokenizedEvent = tVar;
                this.shouldAnimate = z11;
            }
        }

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ¸\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u00103R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u00106R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b7\u0010!R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b8\u0010!R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b9\u0010!R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b:\u0010!R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b=\u0010\u001fR%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\b\u0018\u0010BR\u001a\u0010\u0019\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010A\u001a\u0004\bC\u0010B¨\u0006D"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$QuantityControl;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;", "", "sku", "selectedDeliverySchema", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/atoms/data/text/TextDTO;", "valueText", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$ActionIcon;", "cartActionIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "additionalAction", "minValue", "maxValue", "multiplicity", "quantSize", "", "decrementIconToken", "incrementIconToken", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "", "isIncrementDisabled", "shouldAnimate", "<init>", "(JLjava/lang/Long;ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$ActionIcon;Lru/ozon/uni/atoms/af/AtomAction;IIIILjava/lang/String;Ljava/lang/String;Ljava/util/Map;ZZ)V", "copy", "(JLjava/lang/Long;ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$ActionIcon;Lru/ozon/uni/atoms/af/AtomAction;IIIILjava/lang/String;Ljava/lang/String;Ljava/util/Map;ZZ)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$QuantityControl;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getSku", "()J", "Ljava/lang/Long;", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "I", "getValue", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getValueText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$ActionIcon;", "getCartActionIcon", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$ActionIcon;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAdditionalAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getMinValue", "getMaxValue", "getMultiplicity", "getQuantSize", "Ljava/lang/String;", "getDecrementIconToken", "getIncrementIconToken", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Z", "()Z", "getShouldAnimate", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class QuantityControl extends State {
            private final AtomAction additionalAction;

            @NotNull
            private final ActionIcon cartActionIcon;

            @NotNull
            private final String decrementIconToken;

            @NotNull
            private final String incrementIconToken;
            private final boolean isIncrementDisabled;
            private final int maxValue;
            private final int minValue;
            private final int multiplicity;
            private final int quantSize;
            private final Long selectedDeliverySchema;
            private final boolean shouldAnimate;
            private final long sku;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;
            private final int value;

            @NotNull
            private final TextDTO valueText;

            public /* synthetic */ QuantityControl(long j11, Long l11, int i11, TextDTO textDTO, ActionIcon actionIcon, AtomAction atomAction, int i12, int i13, int i14, int i15, String str, String str2, Map map, boolean z11, boolean z12, int i16, DefaultConstructorMarker defaultConstructorMarker) {
                this(j11, l11, i11, textDTO, actionIcon, atomAction, i12, i13, i14, i15, str, str2, map, (i16 & 8192) != 0 ? false : z11, (i16 & 16384) != 0 ? false : z12);
            }

            @NotNull
            public final QuantityControl copy(long sku, Long selectedDeliverySchema, int value, @NotNull TextDTO valueText, @NotNull ActionIcon cartActionIcon, AtomAction additionalAction, int minValue, int maxValue, int multiplicity, int quantSize, @NotNull String decrementIconToken, @NotNull String incrementIconToken, Map<String, TokenizedTrackingInfo> trackingInfo, boolean isIncrementDisabled, boolean shouldAnimate) {
                Intrinsics.checkNotNullParameter(valueText, "valueText");
                Intrinsics.checkNotNullParameter(cartActionIcon, "cartActionIcon");
                Intrinsics.checkNotNullParameter(decrementIconToken, "decrementIconToken");
                Intrinsics.checkNotNullParameter(incrementIconToken, "incrementIconToken");
                return new QuantityControl(sku, selectedDeliverySchema, value, valueText, cartActionIcon, additionalAction, minValue, maxValue, multiplicity, quantSize, decrementIconToken, incrementIconToken, trackingInfo, isIncrementDisabled, shouldAnimate);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof QuantityControl)) {
                    return false;
                }
                QuantityControl quantityControl = (QuantityControl) other;
                return this.sku == quantityControl.sku && Intrinsics.d(this.selectedDeliverySchema, quantityControl.selectedDeliverySchema) && this.value == quantityControl.value && Intrinsics.d(this.valueText, quantityControl.valueText) && Intrinsics.d(this.cartActionIcon, quantityControl.cartActionIcon) && Intrinsics.d(this.additionalAction, quantityControl.additionalAction) && this.minValue == quantityControl.minValue && this.maxValue == quantityControl.maxValue && this.multiplicity == quantityControl.multiplicity && this.quantSize == quantityControl.quantSize && Intrinsics.d(this.decrementIconToken, quantityControl.decrementIconToken) && Intrinsics.d(this.incrementIconToken, quantityControl.incrementIconToken) && Intrinsics.d(this.trackingInfo, quantityControl.trackingInfo) && this.isIncrementDisabled == quantityControl.isIncrementDisabled && this.shouldAnimate == quantityControl.shouldAnimate;
            }

            public final AtomAction getAdditionalAction() {
                return this.additionalAction;
            }

            @NotNull
            public final ActionIcon getCartActionIcon() {
                return this.cartActionIcon;
            }

            @NotNull
            public final String getDecrementIconToken() {
                return this.decrementIconToken;
            }

            @NotNull
            public final String getIncrementIconToken() {
                return this.incrementIconToken;
            }

            public final int getMaxValue() {
                return this.maxValue;
            }

            public final int getMinValue() {
                return this.minValue;
            }

            public final int getMultiplicity() {
                return this.multiplicity;
            }

            public final int getQuantSize() {
                return this.quantSize;
            }

            public final Long getSelectedDeliverySchema() {
                return this.selectedDeliverySchema;
            }

            public boolean getShouldAnimate() {
                return this.shouldAnimate;
            }

            public final long getSku() {
                return this.sku;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public final int getValue() {
                return this.value;
            }

            @NotNull
            public final TextDTO getValueText() {
                return this.valueText;
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.sku) * 31;
                Long l11 = this.selectedDeliverySchema;
                int hashCode2 = (this.cartActionIcon.hashCode() + b.a(this.valueText, C2454a.a(this.value, (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31, 31), 31)) * 31;
                AtomAction atomAction = this.additionalAction;
                int a11 = g.a(g.a(C2454a.a(this.quantSize, C2454a.a(this.multiplicity, C2454a.a(this.maxValue, C2454a.a(this.minValue, (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31), 31), 31), 31), 31, this.decrementIconToken), 31, this.incrementIconToken);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return Boolean.hashCode(this.shouldAnimate) + C3532b.a((a11 + (map != null ? map.hashCode() : 0)) * 31, 31, this.isIncrementDisabled);
            }

            /* renamed from: isIncrementDisabled, reason: from getter */
            public final boolean getIsIncrementDisabled() {
                return this.isIncrementDisabled;
            }

            @NotNull
            public String toString() {
                long j11 = this.sku;
                Long l11 = this.selectedDeliverySchema;
                int i11 = this.value;
                TextDTO textDTO = this.valueText;
                ActionIcon actionIcon = this.cartActionIcon;
                AtomAction atomAction = this.additionalAction;
                int i12 = this.minValue;
                int i13 = this.maxValue;
                int i14 = this.multiplicity;
                int i15 = this.quantSize;
                String str = this.decrementIconToken;
                String str2 = this.incrementIconToken;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                boolean z11 = this.isIncrementDisabled;
                boolean z12 = this.shouldAnimate;
                StringBuilder sb2 = new StringBuilder("QuantityControl(sku=");
                sb2.append(j11);
                sb2.append(", selectedDeliverySchema=");
                sb2.append(l11);
                sb2.append(", value=");
                sb2.append(i11);
                sb2.append(", valueText=");
                sb2.append(textDTO);
                sb2.append(", cartActionIcon=");
                sb2.append(actionIcon);
                sb2.append(", additionalAction=");
                sb2.append(atomAction);
                A0.c(i12, i13, ", minValue=", ", maxValue=", sb2);
                A0.c(i14, i15, ", multiplicity=", ", quantSize=", sb2);
                a.h(sb2, ", decrementIconToken=", str, ", incrementIconToken=", str2);
                sb2.append(", trackingInfo=");
                sb2.append(map);
                sb2.append(", isIncrementDisabled=");
                sb2.append(z11);
                return Bi.b.f(sb2, ", shouldAnimate=", z12, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QuantityControl(long j11, Long l11, int i11, @NotNull TextDTO valueText, @NotNull ActionIcon cartActionIcon, AtomAction atomAction, int i12, int i13, int i14, int i15, @NotNull String decrementIconToken, @NotNull String incrementIconToken, Map<String, TokenizedTrackingInfo> map, boolean z11, boolean z12) {
                super(false, null);
                Intrinsics.checkNotNullParameter(valueText, "valueText");
                Intrinsics.checkNotNullParameter(cartActionIcon, "cartActionIcon");
                Intrinsics.checkNotNullParameter(decrementIconToken, "decrementIconToken");
                Intrinsics.checkNotNullParameter(incrementIconToken, "incrementIconToken");
                this.sku = j11;
                this.selectedDeliverySchema = l11;
                this.value = i11;
                this.valueText = valueText;
                this.cartActionIcon = cartActionIcon;
                this.additionalAction = atomAction;
                this.minValue = i12;
                this.maxValue = i13;
                this.multiplicity = i14;
                this.quantSize = i15;
                this.decrementIconToken = decrementIconToken;
                this.incrementIconToken = incrementIconToken;
                this.trackingInfo = map;
                this.isIncrementDisabled = z11;
                this.shouldAnimate = z12;
            }
        }

        public /* synthetic */ State(boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11);
        }

        private State(boolean z11) {
            this.shouldAnimate = z11;
        }
    }

    public ProductActionBarVO(long j11, int i11, @NotNull String size, @NotNull State state, State.ActionIcon actionIcon, @NotNull CustomStyle customStyle) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(customStyle, "customStyle");
        this.id = j11;
        this.heightPx = i11;
        this.size = size;
        this.state = state;
        this.adultActionIcon = actionIcon;
        this.customStyle = customStyle;
    }

    public static /* synthetic */ ProductActionBarVO copy$default(ProductActionBarVO productActionBarVO, long j11, int i11, String str, State state, State.ActionIcon actionIcon, CustomStyle customStyle, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = productActionBarVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            i11 = productActionBarVO.heightPx;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            str = productActionBarVO.size;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            state = productActionBarVO.state;
        }
        State state2 = state;
        if ((i12 & 16) != 0) {
            actionIcon = productActionBarVO.adultActionIcon;
        }
        State.ActionIcon actionIcon2 = actionIcon;
        if ((i12 & 32) != 0) {
            customStyle = productActionBarVO.customStyle;
        }
        return productActionBarVO.copy(j12, i13, str2, state2, actionIcon2, customStyle);
    }

    @NotNull
    public final ProductActionBarVO copy(long id2, int heightPx, @NotNull String size, @NotNull State state, State.ActionIcon adultActionIcon, @NotNull CustomStyle customStyle) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(customStyle, "customStyle");
        return new ProductActionBarVO(id2, heightPx, size, state, adultActionIcon, customStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductActionBarVO)) {
            return false;
        }
        ProductActionBarVO productActionBarVO = (ProductActionBarVO) other;
        return this.id == productActionBarVO.id && this.heightPx == productActionBarVO.heightPx && Intrinsics.d(this.size, productActionBarVO.size) && Intrinsics.d(this.state, productActionBarVO.state) && Intrinsics.d(this.adultActionIcon, productActionBarVO.adultActionIcon) && Intrinsics.d(this.customStyle, productActionBarVO.customStyle);
    }

    public final State.ActionIcon getAdultActionIcon() {
        return this.adultActionIcon;
    }

    @NotNull
    public final CustomStyle getCustomStyle() {
        return this.customStyle;
    }

    public final int getHeightPx() {
        return this.heightPx;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.state.hashCode() + g.a(C2454a.a(this.heightPx, Long.hashCode(this.id) * 31, 31), 31, this.size)) * 31;
        State.ActionIcon actionIcon = this.adultActionIcon;
        return this.customStyle.hashCode() + ((hashCode + (actionIcon == null ? 0 : actionIcon.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.heightPx;
        String str = this.size;
        State state = this.state;
        State.ActionIcon actionIcon = this.adultActionIcon;
        CustomStyle customStyle = this.customStyle;
        StringBuilder b11 = Ql.c.b(j11, "ProductActionBarVO(id=", i11, ", heightPx=");
        b11.append(", size=");
        b11.append(str);
        b11.append(", state=");
        b11.append(state);
        b11.append(", adultActionIcon=");
        b11.append(actionIcon);
        b11.append(", customStyle=");
        b11.append(customStyle);
        b11.append(")");
        return b11.toString();
    }
}
