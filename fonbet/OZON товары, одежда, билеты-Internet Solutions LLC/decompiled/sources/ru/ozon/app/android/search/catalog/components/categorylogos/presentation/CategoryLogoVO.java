package ru.ozon.app.android.search.catalog.components.categorylogos.presentation;

import De.C2859b;
import G.g;
import HY.b;
import Kk.C3532b;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO;", "", "<init>", "()V", "Logo", "Button", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO$Button;", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO$Logo;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CategoryLogoVO {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO$Button;", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "button", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button extends CategoryLogoVO {
        public static final int $stable = ButtonV3Atom.LargeIconButton.$stable;

        @NotNull
        private final ButtonV3Atom.LargeIconButton button;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Button(@NotNull ButtonV3Atom.LargeIconButton button) {
            super(null);
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Button) && Intrinsics.d(this.button, ((Button) other).button);
        }

        @NotNull
        public final ButtonV3Atom.LargeIconButton getButton() {
            return this.button;
        }

        public int hashCode() {
            return this.button.hashCode();
        }

        @NotNull
        public String toString() {
            return "Button(button=" + this.button + ")";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u0005\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b$\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010\u0015R\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\"\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b,\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO$Logo;", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "id", SelectionItemFormDTO.TITLE_FIELD_NAME, "image", "deeplink", "hasChildren", "subtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShouldBlur", "()Z", "setShouldBlur", "(Z)V", "Ljava/lang/String;", "getId", "getTitle", "getImage", "getDeeplink", "getDeeplink$annotations", "()V", "Ljava/lang/Boolean;", "getHasChildren", "()Ljava/lang/Boolean;", "getSubtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Logo extends CategoryLogoVO implements AdultVO {
        private final AtomAction action;
        private final String deeplink;
        private final Boolean hasChildren;

        @NotNull
        private final String id;

        @NotNull
        private final String image;
        private final boolean isAdult;
        private boolean shouldBlur;
        private final String subtitle;

        @NotNull
        private final String title;
        private final t tokenizedEvent;

        public /* synthetic */ Logo(boolean z11, boolean z12, String str, String str2, String str3, String str4, Boolean bool, String str5, AtomAction atomAction, t tVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11, (i11 & 2) != 0 ? z11 : z12, str, str2, str3, str4, bool, str5, atomAction, tVar);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Logo)) {
                return false;
            }
            Logo logo = (Logo) other;
            return this.shouldBlur == logo.shouldBlur && this.isAdult == logo.isAdult && Intrinsics.d(this.id, logo.id) && Intrinsics.d(this.title, logo.title) && Intrinsics.d(this.image, logo.image) && Intrinsics.d(this.deeplink, logo.deeplink) && Intrinsics.d(this.hasChildren, logo.hasChildren) && Intrinsics.d(this.subtitle, logo.subtitle) && Intrinsics.d(this.action, logo.action) && Intrinsics.d(this.tokenizedEvent, logo.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public boolean getShouldBlur() {
            return this.shouldBlur;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = g.a(g.a(g.a(C3532b.a(Boolean.hashCode(this.shouldBlur) * 31, 31, this.isAdult), 31, this.id), 31, this.title), 31, this.image);
            String str = this.deeplink;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.hasChildren;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode4 = (hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        /* renamed from: isAdult, reason: from getter */
        public boolean getIsAdult() {
            return this.isAdult;
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        public void setShouldBlur(boolean z11) {
            this.shouldBlur = z11;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.shouldBlur;
            boolean z12 = this.isAdult;
            String str = this.id;
            String str2 = this.title;
            String str3 = this.image;
            String str4 = this.deeplink;
            Boolean bool = this.hasChildren;
            String str5 = this.subtitle;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder d11 = a.d("Logo(shouldBlur=", ", isAdult=", ", id=", z11, z12);
            Nh.a.h(d11, str, ", title=", str2, ", image=");
            Nh.a.h(d11, str3, ", deeplink=", str4, ", hasChildren=");
            b.c(bool, ", subtitle=", str5, ", action=", d11);
            return C2859b.e(tVar, ", tokenizedEvent=", ")", d11, atomAction);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Logo(boolean z11, boolean z12, @NotNull String id2, @NotNull String title, @NotNull String image, String str, Boolean bool, String str2, AtomAction atomAction, t tVar) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            this.shouldBlur = z11;
            this.isAdult = z12;
            this.id = id2;
            this.title = title;
            this.image = image;
            this.deeplink = str;
            this.hasChildren = bool;
            this.subtitle = str2;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }
    }

    public /* synthetic */ CategoryLogoVO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CategoryLogoVO() {
    }
}
