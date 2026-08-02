package ru.ozon.app.android.marketing.widgets.sellerCategoryList.presentation.vo;

import Ak.C2436a;
import An.C2439a;
import B90.C2619v;
import Bl.C2639a;
import G.g;
import Kk.C3532b;
import Ve.C4598rp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u000e\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b\u000e\u0010'¨\u0006*"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/vo/CategoryVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "backgroundImage", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getBackgroundImage", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "getShouldBlur", "()Z", "setShouldBlur", "(Z)V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CategoryVO implements c, AdultVO {

    @NotNull
    private final AtomAction action;

    @NotNull
    private final String backgroundImage;
    private final long id;
    private final boolean isAdult;

    @NotNull
    private final TextAtom name;
    private boolean shouldBlur;

    public CategoryVO(long j11, @NotNull TextAtom name, @NotNull String backgroundImage, @NotNull AtomAction action, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.name = name;
        this.backgroundImage = backgroundImage;
        this.action = action;
        this.shouldBlur = z11;
        this.isAdult = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryVO)) {
            return false;
        }
        CategoryVO categoryVO = (CategoryVO) other;
        return this.id == categoryVO.id && Intrinsics.d(this.name, categoryVO.name) && Intrinsics.d(this.backgroundImage, categoryVO.backgroundImage) && Intrinsics.d(this.action, categoryVO.action) && this.shouldBlur == categoryVO.shouldBlur && this.isAdult == categoryVO.isAdult;
    }

    @NotNull
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
    public final TextAtom getName() {
        return this.name;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public boolean getShouldBlur() {
        return this.shouldBlur;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAdult) + C3532b.a(C4598rp.a(this.action, g.a(C2619v.b(Long.hashCode(this.id) * 31, 31, this.name), 31, this.backgroundImage), 31), 31, this.shouldBlur);
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
        long j11 = this.id;
        TextAtom textAtom = this.name;
        String str = this.backgroundImage;
        AtomAction atomAction = this.action;
        boolean z11 = this.shouldBlur;
        boolean z12 = this.isAdult;
        StringBuilder c11 = C2639a.c("CategoryVO(id=", j11, ", name=", textAtom);
        C2439a.c(", backgroundImage=", str, ", action=", c11, atomAction);
        C2436a.e(", shouldBlur=", ", isAdult=", c11, z11, z12);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ CategoryVO(long j11, TextAtom textAtom, String str, AtomAction atomAction, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, textAtom, str, atomAction, z11, (i11 & 32) != 0 ? z11 : z12);
    }
}
