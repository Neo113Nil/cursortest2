package ru.ozon.app.android.pdp.widgets.brand.presentation;

import Ak.C2436a;
import G.g;
import WZ.t;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.UncontainedIconLabelButtonDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\"\u0010\u000e¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/presentation/SimpleBrandVO;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/BrandVO;", "", "id", "", "background", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "button", "json", "<init>", "(JLjava/lang/String;LWZ/t;Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackground", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "getJson", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SimpleBrandVO extends BrandVO {

    @NotNull
    private final String background;

    @NotNull
    private final UncontainedIconLabelButtonDTO button;
    private final long id;

    @NotNull
    private final String json;
    private final t tokenizedEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBrandVO(long j11, @NotNull String background, t tVar, @NotNull UncontainedIconLabelButtonDTO button, @NotNull String json) {
        super(j11, background, tVar);
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(json, "json");
        this.id = j11;
        this.background = background;
        this.tokenizedEvent = tVar;
        this.button = button;
        this.json = json;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleBrandVO)) {
            return false;
        }
        SimpleBrandVO simpleBrandVO = (SimpleBrandVO) other;
        return this.id == simpleBrandVO.id && Intrinsics.d(this.background, simpleBrandVO.background) && Intrinsics.d(this.tokenizedEvent, simpleBrandVO.tokenizedEvent) && Intrinsics.d(this.button, simpleBrandVO.button) && Intrinsics.d(this.json, simpleBrandVO.json);
    }

    @NotNull
    public String getBackground() {
        return this.background;
    }

    @NotNull
    public final UncontainedIconLabelButtonDTO getButton() {
        return this.button;
    }

    @Override // ru.ozon.app.android.pdp.widgets.brand.presentation.BrandVO, l20.c
    public long getId() {
        return this.id;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetPlaceholderViewObject
    @NotNull
    public String getJson() {
        return this.json;
    }

    @Override // ru.ozon.app.android.pdp.widgets.brand.presentation.BrandVO
    public t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.background);
        t tVar = this.tokenizedEvent;
        return this.json.hashCode() + ((this.button.hashCode() + ((a11 + (tVar == null ? 0 : tVar.hashCode())) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.background;
        t tVar = this.tokenizedEvent;
        UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO = this.button;
        String str2 = this.json;
        StringBuilder c11 = C2436a.c(j11, "SimpleBrandVO(id=", ", background=", str);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", button=");
        c11.append(uncontainedIconLabelButtonDTO);
        return C6594f.a(", json=", str2, ")", c11);
    }
}
