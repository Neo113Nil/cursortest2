package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data;

import Ak.C2436a;
import C.o0;
import Cm.e;
import De.C2859b;
import De.C2860c;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Ns.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorAtomDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00046789BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jr\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0018R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105¨\u0006:"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "backgroundImage", "", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$Lootbox;", "leftItems", "rightItems", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;", "progressBlock", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$UpdateProgressAnimation;", "updateProgressAnimation", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$UpdateProgressAnimation;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "copy", "(JLjava/lang/String;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$UpdateProgressAnimation;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundImage", "Ljava/util/List;", "getLeftItems", "()Ljava/util/List;", "getRightItems", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;", "getProgressBlock", "()Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$UpdateProgressAnimation;", "getUpdateProgressAnimation", "()Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$UpdateProgressAnimation;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lootbox", "ProgressBlock", "ProgressBar", "UpdateProgressAnimation", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MainDrawMajorScreenVO implements c {
    private final AtomAction action;

    @NotNull
    private final String backgroundImage;
    private final long id;

    @NotNull
    private final List<Lootbox> leftItems;

    @NotNull
    private final ProgressBlock progressBlock;

    @NotNull
    private final List<Lootbox> rightItems;
    private final t tokenizedEvent;
    private final UpdateProgressAnimation updateProgressAnimation;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\t\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b#\u0010\u0012R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$Lootbox;", "", "", "image", "Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;", "indicator", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "badgeCounter", "", "isSingleImage", "bottomImage", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;ZLjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;", "getIndicator", "()Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "getBadgeCounter", "()Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "Z", "()Z", "getBottomImage", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Lootbox {
        private final AtomAction action;
        private final MorkovskCurrencyBadgeVO badgeCounter;
        private final String bottomImage;

        @NotNull
        private final String image;
        private final IndicatorAtomDTO indicator;
        private final boolean isSingleImage;
        private final t tokenizedEvent;

        public Lootbox(@NotNull String image, IndicatorAtomDTO indicatorAtomDTO, MorkovskCurrencyBadgeVO morkovskCurrencyBadgeVO, boolean z11, String str, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.indicator = indicatorAtomDTO;
            this.badgeCounter = morkovskCurrencyBadgeVO;
            this.isSingleImage = z11;
            this.bottomImage = str;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Lootbox)) {
                return false;
            }
            Lootbox lootbox = (Lootbox) other;
            return Intrinsics.d(this.image, lootbox.image) && Intrinsics.d(this.indicator, lootbox.indicator) && Intrinsics.d(this.badgeCounter, lootbox.badgeCounter) && this.isSingleImage == lootbox.isSingleImage && Intrinsics.d(this.bottomImage, lootbox.bottomImage) && Intrinsics.d(this.action, lootbox.action) && Intrinsics.d(this.tokenizedEvent, lootbox.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final MorkovskCurrencyBadgeVO getBadgeCounter() {
            return this.badgeCounter;
        }

        public final String getBottomImage() {
            return this.bottomImage;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final IndicatorAtomDTO getIndicator() {
            return this.indicator;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            IndicatorAtomDTO indicatorAtomDTO = this.indicator;
            int hashCode2 = (hashCode + (indicatorAtomDTO == null ? 0 : indicatorAtomDTO.hashCode())) * 31;
            MorkovskCurrencyBadgeVO morkovskCurrencyBadgeVO = this.badgeCounter;
            int a11 = C3532b.a((hashCode2 + (morkovskCurrencyBadgeVO == null ? 0 : morkovskCurrencyBadgeVO.hashCode())) * 31, 31, this.isSingleImage);
            String str = this.bottomImage;
            int hashCode3 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode4 = (hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
        }

        /* renamed from: isSingleImage, reason: from getter */
        public final boolean getIsSingleImage() {
            return this.isSingleImage;
        }

        @NotNull
        public String toString() {
            String str = this.image;
            IndicatorAtomDTO indicatorAtomDTO = this.indicator;
            MorkovskCurrencyBadgeVO morkovskCurrencyBadgeVO = this.badgeCounter;
            boolean z11 = this.isSingleImage;
            String str2 = this.bottomImage;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("Lootbox(image=");
            sb2.append(str);
            sb2.append(", indicator=");
            sb2.append(indicatorAtomDTO);
            sb2.append(", badgeCounter=");
            sb2.append(morkovskCurrencyBadgeVO);
            sb2.append(", isSingleImage=");
            sb2.append(z11);
            sb2.append(", bottomImage=");
            b.d(str2, ", action=", ", tokenizedEvent=", sb2, atomAction);
            return Tl.b.d(sb2, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBar;", "", "", "percent", "", "text", "icon", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBar;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPercent", "Ljava/lang/String;", "getText", "getIcon", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressBar {

        @NotNull
        private final String icon;
        private final int percent;

        @NotNull
        private final String text;

        public ProgressBar(int i11, @NotNull String text, @NotNull String icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.percent = i11;
            this.text = text;
            this.icon = icon;
        }

        public static /* synthetic */ ProgressBar copy$default(ProgressBar progressBar, int i11, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = progressBar.percent;
            }
            if ((i12 & 2) != 0) {
                str = progressBar.text;
            }
            if ((i12 & 4) != 0) {
                str2 = progressBar.icon;
            }
            return progressBar.copy(i11, str, str2);
        }

        @NotNull
        public final ProgressBar copy(int percent, @NotNull String text, @NotNull String icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new ProgressBar(percent, text, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressBar)) {
                return false;
            }
            ProgressBar progressBar = (ProgressBar) other;
            return this.percent == progressBar.percent && Intrinsics.d(this.text, progressBar.text) && Intrinsics.d(this.icon, progressBar.icon);
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final int getPercent() {
            return this.percent;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.icon.hashCode() + g.a(Integer.hashCode(this.percent) * 31, 31, this.text);
        }

        @NotNull
        public String toString() {
            int i11 = this.percent;
            String str = this.text;
            return o0.c(e.g(i11, "ProgressBar(percent=", ", text=", str, ", icon="), this.icon, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u001e\u001fBA\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0001\u0002 !¨\u0006\""}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;", "", "", "infoText", "centralText", "Lru/ozon/uni/atoms/af/AtomAction;", "progressAction", "infoIcon", "infoAction", "LWZ/t;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "percent", "text", "updateProgressData", "(ILjava/lang/String;)Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;", "Ljava/lang/String;", "getInfoText", "()Ljava/lang/String;", "getCentralText", "Lru/ozon/uni/atoms/af/AtomAction;", "getProgressAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getInfoIcon", "getInfoAction", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Progress", "Empty", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock$Empty;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock$Progress;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ProgressBlock {

        @NotNull
        private final String centralText;
        private final AtomAction infoAction;
        private final String infoIcon;

        @NotNull
        private final String infoText;
        private final AtomAction progressAction;
        private final t tokenizedEvent;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001d\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock$Empty;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;", "", "infoText", "centralText", "Lru/ozon/uni/atoms/af/AtomAction;", "progressAction", "infoIcon", "infoAction", "LWZ/t;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInfoText", "getCentralText", "Lru/ozon/uni/atoms/af/AtomAction;", "getProgressAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getInfoIcon", "getInfoAction", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Empty extends ProgressBlock {

            @NotNull
            private final String centralText;
            private final AtomAction infoAction;
            private final String infoIcon;

            @NotNull
            private final String infoText;
            private final AtomAction progressAction;
            private final t tokenizedEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Empty(@NotNull String infoText, @NotNull String centralText, AtomAction atomAction, String str, AtomAction atomAction2, t tVar) {
                super(infoText, centralText, atomAction, str, atomAction2, tVar, null);
                Intrinsics.checkNotNullParameter(infoText, "infoText");
                Intrinsics.checkNotNullParameter(centralText, "centralText");
                this.infoText = infoText;
                this.centralText = centralText;
                this.progressAction = atomAction;
                this.infoIcon = str;
                this.infoAction = atomAction2;
                this.tokenizedEvent = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Empty)) {
                    return false;
                }
                Empty empty = (Empty) other;
                return Intrinsics.d(this.infoText, empty.infoText) && Intrinsics.d(this.centralText, empty.centralText) && Intrinsics.d(this.progressAction, empty.progressAction) && Intrinsics.d(this.infoIcon, empty.infoIcon) && Intrinsics.d(this.infoAction, empty.infoAction) && Intrinsics.d(this.tokenizedEvent, empty.tokenizedEvent);
            }

            @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO.ProgressBlock
            @NotNull
            public String getCentralText() {
                return this.centralText;
            }

            @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO.ProgressBlock
            public AtomAction getInfoAction() {
                return this.infoAction;
            }

            @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO.ProgressBlock
            public String getInfoIcon() {
                return this.infoIcon;
            }

            @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO.ProgressBlock
            @NotNull
            public String getInfoText() {
                return this.infoText;
            }

            @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO.ProgressBlock
            public AtomAction getProgressAction() {
                return this.progressAction;
            }

            @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO.ProgressBlock
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int a11 = g.a(this.infoText.hashCode() * 31, 31, this.centralText);
                AtomAction atomAction = this.progressAction;
                int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                String str = this.infoIcon;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                AtomAction atomAction2 = this.infoAction;
                int hashCode3 = (hashCode2 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.infoText;
                String str2 = this.centralText;
                AtomAction atomAction = this.progressAction;
                String str3 = this.infoIcon;
                AtomAction atomAction2 = this.infoAction;
                t tVar = this.tokenizedEvent;
                StringBuilder d11 = C3660k.d("Empty(infoText=", str, ", centralText=", str2, ", progressAction=");
                d11.append(atomAction);
                d11.append(", infoIcon=");
                d11.append(str3);
                d11.append(", infoAction=");
                return C2859b.e(tVar, ", tokenizedEvent=", ")", d11, atomAction2);
            }
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015Jv\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b'\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b(\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b/\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b0\u0010\u0019¨\u00061"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock$Progress;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;", "", "infoText", "centralText", "Lru/ozon/uni/atoms/af/AtomAction;", "progressAction", "infoIcon", "infoAction", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBar;", "progressBar", "leftImage", "rightFinalText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBar;Ljava/lang/String;Ljava/lang/String;)V", "", "percent", "text", "updateProgressData", "(ILjava/lang/String;)Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBar;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock$Progress;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInfoText", "getCentralText", "Lru/ozon/uni/atoms/af/AtomAction;", "getProgressAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getInfoIcon", "getInfoAction", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBar;", "getProgressBar", "()Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBar;", "getLeftImage", "getRightFinalText", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Progress extends ProgressBlock {

            @NotNull
            private final String centralText;
            private final AtomAction infoAction;
            private final String infoIcon;

            @NotNull
            private final String infoText;
            private final String leftImage;
            private final AtomAction progressAction;

            @NotNull
            private final ProgressBar progressBar;
            private final String rightFinalText;
            private final t tokenizedEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Progress(@NotNull String infoText, @NotNull String centralText, AtomAction atomAction, String str, AtomAction atomAction2, t tVar, @NotNull ProgressBar progressBar, String str2, String str3) {
                super(infoText, centralText, atomAction, str, atomAction2, tVar, null);
                Intrinsics.checkNotNullParameter(infoText, "infoText");
                Intrinsics.checkNotNullParameter(centralText, "centralText");
                Intrinsics.checkNotNullParameter(progressBar, "progressBar");
                this.infoText = infoText;
                this.centralText = centralText;
                this.progressAction = atomAction;
                this.infoIcon = str;
                this.infoAction = atomAction2;
                this.tokenizedEvent = tVar;
                this.progressBar = progressBar;
                this.leftImage = str2;
                this.rightFinalText = str3;
            }

            public static /* synthetic */ Progress copy$default(Progress progress, String str, String str2, AtomAction atomAction, String str3, AtomAction atomAction2, t tVar, ProgressBar progressBar, String str4, String str5, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = progress.infoText;
                }
                if ((i11 & 2) != 0) {
                    str2 = progress.centralText;
                }
                if ((i11 & 4) != 0) {
                    atomAction = progress.progressAction;
                }
                if ((i11 & 8) != 0) {
                    str3 = progress.infoIcon;
                }
                if ((i11 & 16) != 0) {
                    atomAction2 = progress.infoAction;
                }
                if ((i11 & 32) != 0) {
                    tVar = progress.tokenizedEvent;
                }
                if ((i11 & 64) != 0) {
                    progressBar = progress.progressBar;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    str4 = progress.leftImage;
                }
                if ((i11 & 256) != 0) {
                    str5 = progress.rightFinalText;
                }
                String str6 = str4;
                String str7 = str5;
                t tVar2 = tVar;
                ProgressBar progressBar2 = progressBar;
                AtomAction atomAction3 = atomAction2;
                AtomAction atomAction4 = atomAction;
                return progress.copy(str, str2, atomAction4, str3, atomAction3, tVar2, progressBar2, str6, str7);
            }

            @NotNull
            public final Progress copy(@NotNull String infoText, @NotNull String centralText, AtomAction progressAction, String infoIcon, AtomAction infoAction, t tokenizedEvent, @NotNull ProgressBar progressBar, String leftImage, String rightFinalText) {
                Intrinsics.checkNotNullParameter(infoText, "infoText");
                Intrinsics.checkNotNullParameter(centralText, "centralText");
                Intrinsics.checkNotNullParameter(progressBar, "progressBar");
                return new Progress(infoText, centralText, progressAction, infoIcon, infoAction, tokenizedEvent, progressBar, leftImage, rightFinalText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Progress)) {
                    return false;
                }
                Progress progress = (Progress) other;
                return Intrinsics.d(this.infoText, progress.infoText) && Intrinsics.d(this.centralText, progress.centralText) && Intrinsics.d(this.progressAction, progress.progressAction) && Intrinsics.d(this.infoIcon, progress.infoIcon) && Intrinsics.d(this.infoAction, progress.infoAction) && Intrinsics.d(this.tokenizedEvent, progress.tokenizedEvent) && Intrinsics.d(this.progressBar, progress.progressBar) && Intrinsics.d(this.leftImage, progress.leftImage) && Intrinsics.d(this.rightFinalText, progress.rightFinalText);
            }

            @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO.ProgressBlock
            @NotNull
            public String getCentralText() {
                return this.centralText;
            }

            @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO.ProgressBlock
            public AtomAction getInfoAction() {
                return this.infoAction;
            }

            @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO.ProgressBlock
            public String getInfoIcon() {
                return this.infoIcon;
            }

            @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO.ProgressBlock
            @NotNull
            public String getInfoText() {
                return this.infoText;
            }

            public final String getLeftImage() {
                return this.leftImage;
            }

            @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO.ProgressBlock
            public AtomAction getProgressAction() {
                return this.progressAction;
            }

            @NotNull
            public final ProgressBar getProgressBar() {
                return this.progressBar;
            }

            public final String getRightFinalText() {
                return this.rightFinalText;
            }

            @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO.ProgressBlock
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int a11 = g.a(this.infoText.hashCode() * 31, 31, this.centralText);
                AtomAction atomAction = this.progressAction;
                int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                String str = this.infoIcon;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                AtomAction atomAction2 = this.infoAction;
                int hashCode3 = (hashCode2 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                int hashCode4 = (this.progressBar.hashCode() + ((hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31)) * 31;
                String str2 = this.leftImage;
                int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.rightFinalText;
                return hashCode5 + (str3 != null ? str3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.infoText;
                String str2 = this.centralText;
                AtomAction atomAction = this.progressAction;
                String str3 = this.infoIcon;
                AtomAction atomAction2 = this.infoAction;
                t tVar = this.tokenizedEvent;
                ProgressBar progressBar = this.progressBar;
                String str4 = this.leftImage;
                String str5 = this.rightFinalText;
                StringBuilder d11 = C3660k.d("Progress(infoText=", str, ", centralText=", str2, ", progressAction=");
                d11.append(atomAction);
                d11.append(", infoIcon=");
                d11.append(str3);
                d11.append(", infoAction=");
                d11.append(atomAction2);
                d11.append(", tokenizedEvent=");
                d11.append(tVar);
                d11.append(", progressBar=");
                d11.append(progressBar);
                d11.append(", leftImage=");
                d11.append(str4);
                d11.append(", rightFinalText=");
                return o0.c(d11, str5, ")");
            }

            @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO.ProgressBlock
            @NotNull
            public ProgressBlock updateProgressData(int percent, @NotNull String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return copy$default(this, null, null, null, null, null, null, ProgressBar.copy$default(this.progressBar, percent, text, null, 4, null), null, null, 447, null);
            }
        }

        public /* synthetic */ ProgressBlock(String str, String str2, AtomAction atomAction, String str3, AtomAction atomAction2, t tVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, atomAction, str3, atomAction2, tVar);
        }

        @NotNull
        public abstract String getCentralText();

        public abstract AtomAction getInfoAction();

        public abstract String getInfoIcon();

        @NotNull
        public abstract String getInfoText();

        public abstract AtomAction getProgressAction();

        public abstract t getTokenizedEvent();

        @NotNull
        public ProgressBlock updateProgressData(int percent, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return this;
        }

        private ProgressBlock(String str, String str2, AtomAction atomAction, String str3, AtomAction atomAction2, t tVar) {
            this.infoText = str;
            this.centralText = str2;
            this.progressAction = atomAction;
            this.infoIcon = str3;
            this.infoAction = atomAction2;
            this.tokenizedEvent = tVar;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$UpdateProgressAnimation;", "", "", "delay", "Lru/ozon/uni/atoms/af/AtomAction;", "progressDataAction", "<init>", "(JLru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDelay", "()J", "Lru/ozon/uni/atoms/af/AtomAction;", "getProgressDataAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateProgressAnimation {
        public static final int $stable = AtomAction.$stable;
        private final long delay;

        @NotNull
        private final AtomAction progressDataAction;

        public UpdateProgressAnimation(long j11, @NotNull AtomAction progressDataAction) {
            Intrinsics.checkNotNullParameter(progressDataAction, "progressDataAction");
            this.delay = j11;
            this.progressDataAction = progressDataAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateProgressAnimation)) {
                return false;
            }
            UpdateProgressAnimation updateProgressAnimation = (UpdateProgressAnimation) other;
            return this.delay == updateProgressAnimation.delay && Intrinsics.d(this.progressDataAction, updateProgressAnimation.progressDataAction);
        }

        public final long getDelay() {
            return this.delay;
        }

        @NotNull
        public final AtomAction getProgressDataAction() {
            return this.progressDataAction;
        }

        public int hashCode() {
            return this.progressDataAction.hashCode() + (Long.hashCode(this.delay) * 31);
        }

        @NotNull
        public String toString() {
            return "UpdateProgressAnimation(delay=" + this.delay + ", progressDataAction=" + this.progressDataAction + ")";
        }
    }

    public MainDrawMajorScreenVO(long j11, @NotNull String backgroundImage, @NotNull List<Lootbox> leftItems, @NotNull List<Lootbox> rightItems, @NotNull ProgressBlock progressBlock, UpdateProgressAnimation updateProgressAnimation, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(leftItems, "leftItems");
        Intrinsics.checkNotNullParameter(rightItems, "rightItems");
        Intrinsics.checkNotNullParameter(progressBlock, "progressBlock");
        this.id = j11;
        this.backgroundImage = backgroundImage;
        this.leftItems = leftItems;
        this.rightItems = rightItems;
        this.progressBlock = progressBlock;
        this.updateProgressAnimation = updateProgressAnimation;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ MainDrawMajorScreenVO copy$default(MainDrawMajorScreenVO mainDrawMajorScreenVO, long j11, String str, List list, List list2, ProgressBlock progressBlock, UpdateProgressAnimation updateProgressAnimation, AtomAction atomAction, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = mainDrawMajorScreenVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = mainDrawMajorScreenVO.backgroundImage;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            list = mainDrawMajorScreenVO.leftItems;
        }
        List list3 = list;
        if ((i11 & 8) != 0) {
            list2 = mainDrawMajorScreenVO.rightItems;
        }
        return mainDrawMajorScreenVO.copy(j12, str2, list3, list2, (i11 & 16) != 0 ? mainDrawMajorScreenVO.progressBlock : progressBlock, (i11 & 32) != 0 ? mainDrawMajorScreenVO.updateProgressAnimation : updateProgressAnimation, (i11 & 64) != 0 ? mainDrawMajorScreenVO.action : atomAction, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? mainDrawMajorScreenVO.tokenizedEvent : tVar);
    }

    @NotNull
    public final MainDrawMajorScreenVO copy(long id2, @NotNull String backgroundImage, @NotNull List<Lootbox> leftItems, @NotNull List<Lootbox> rightItems, @NotNull ProgressBlock progressBlock, UpdateProgressAnimation updateProgressAnimation, AtomAction action, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(leftItems, "leftItems");
        Intrinsics.checkNotNullParameter(rightItems, "rightItems");
        Intrinsics.checkNotNullParameter(progressBlock, "progressBlock");
        return new MainDrawMajorScreenVO(id2, backgroundImage, leftItems, rightItems, progressBlock, updateProgressAnimation, action, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainDrawMajorScreenVO)) {
            return false;
        }
        MainDrawMajorScreenVO mainDrawMajorScreenVO = (MainDrawMajorScreenVO) other;
        return this.id == mainDrawMajorScreenVO.id && Intrinsics.d(this.backgroundImage, mainDrawMajorScreenVO.backgroundImage) && Intrinsics.d(this.leftItems, mainDrawMajorScreenVO.leftItems) && Intrinsics.d(this.rightItems, mainDrawMajorScreenVO.rightItems) && Intrinsics.d(this.progressBlock, mainDrawMajorScreenVO.progressBlock) && Intrinsics.d(this.updateProgressAnimation, mainDrawMajorScreenVO.updateProgressAnimation) && Intrinsics.d(this.action, mainDrawMajorScreenVO.action) && Intrinsics.d(this.tokenizedEvent, mainDrawMajorScreenVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<Lootbox> getLeftItems() {
        return this.leftItems;
    }

    @NotNull
    public final ProgressBlock getProgressBlock() {
        return this.progressBlock;
    }

    @NotNull
    public final List<Lootbox> getRightItems() {
        return this.rightItems;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final UpdateProgressAnimation getUpdateProgressAnimation() {
        return this.updateProgressAnimation;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.progressBlock.hashCode() + g.b(g.b(g.a(Long.hashCode(this.id) * 31, 31, this.backgroundImage), 31, this.leftItems), 31, this.rightItems)) * 31;
        UpdateProgressAnimation updateProgressAnimation = this.updateProgressAnimation;
        int hashCode2 = (hashCode + (updateProgressAnimation == null ? 0 : updateProgressAnimation.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundImage;
        List<Lootbox> list = this.leftItems;
        List<Lootbox> list2 = this.rightItems;
        ProgressBlock progressBlock = this.progressBlock;
        UpdateProgressAnimation updateProgressAnimation = this.updateProgressAnimation;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "MainDrawMajorScreenVO(id=", ", backgroundImage=", str);
        C2860c.g(", leftItems=", ", rightItems=", c11, list, list2);
        c11.append(", progressBlock=");
        c11.append(progressBlock);
        c11.append(", updateProgressAnimation=");
        c11.append(updateProgressAnimation);
        Fj.c.e(tVar, ", action=", ", tokenizedEvent=", c11, atomAction);
        c11.append(")");
        return c11.toString();
    }
}
