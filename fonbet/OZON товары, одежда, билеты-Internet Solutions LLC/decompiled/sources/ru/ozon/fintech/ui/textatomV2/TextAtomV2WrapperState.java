package ru.ozon.fintech.ui.textatomV2;

import Ak.C2436a;
import B90.C2619v;
import E30.i;
import Kk.C3532b;
import Kk.d;
import android.graphics.Rect;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Gravity;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!Jl\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u001bR+\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010!¨\u0006:"}, d2 = {"Lru/ozon/fintech/ui/textatomV2/TextAtomV2WrapperState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomDTO", "Lru/ozon/fintech/ui/utils/Gravity;", "gravity", "Landroid/graphics/Rect;", "paddings", "Lkotlin/Function2;", "", "", "onClick", "closeOnClick", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/fintech/ui/utils/Gravity;Landroid/graphics/Rect;Lkotlin/jvm/functions/Function2;ZLandroid/text/TextUtils$TruncateAt;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component3", "()Lru/ozon/fintech/ui/utils/Gravity;", "component4", "()Landroid/graphics/Rect;", "component5", "()Lkotlin/jvm/functions/Function2;", "component6", "()Z", "component7", "()Landroid/text/TextUtils$TruncateAt;", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/fintech/ui/utils/Gravity;Landroid/graphics/Rect;Lkotlin/jvm/functions/Function2;ZLandroid/text/TextUtils$TruncateAt;)Lru/ozon/fintech/ui/textatomV2/TextAtomV2WrapperState;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTextAtomDTO", "Lru/ozon/fintech/ui/utils/Gravity;", "getGravity", "Landroid/graphics/Rect;", "getPaddings", "Lkotlin/jvm/functions/Function2;", "getOnClick", "Z", "getCloseOnClick", "Landroid/text/TextUtils$TruncateAt;", "getEllipsize", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextAtomV2WrapperState implements RecyclerItem {
    private final boolean closeOnClick;
    private final TextUtils.TruncateAt ellipsize;

    @NotNull
    private final Gravity gravity;

    @NotNull
    private final String id;
    private final Function2<String, Boolean, Unit> onClick;

    @NotNull
    private final Rect paddings;

    @NotNull
    private final TextAtom textAtomDTO;

    /* JADX WARN: Multi-variable type inference failed */
    public TextAtomV2WrapperState(@NotNull String id2, @NotNull TextAtom textAtomDTO, @NotNull Gravity gravity, @NotNull Rect paddings, Function2<? super String, ? super Boolean, Unit> function2, boolean z11, TextUtils.TruncateAt truncateAt) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(textAtomDTO, "textAtomDTO");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.textAtomDTO = textAtomDTO;
        this.gravity = gravity;
        this.paddings = paddings;
        this.onClick = function2;
        this.closeOnClick = z11;
        this.ellipsize = truncateAt;
    }

    public static /* synthetic */ TextAtomV2WrapperState copy$default(TextAtomV2WrapperState textAtomV2WrapperState, String str, TextAtom textAtom, Gravity gravity, Rect rect, Function2 function2, boolean z11, TextUtils.TruncateAt truncateAt, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = textAtomV2WrapperState.id;
        }
        if ((i11 & 2) != 0) {
            textAtom = textAtomV2WrapperState.textAtomDTO;
        }
        if ((i11 & 4) != 0) {
            gravity = textAtomV2WrapperState.gravity;
        }
        if ((i11 & 8) != 0) {
            rect = textAtomV2WrapperState.paddings;
        }
        if ((i11 & 16) != 0) {
            function2 = textAtomV2WrapperState.onClick;
        }
        if ((i11 & 32) != 0) {
            z11 = textAtomV2WrapperState.closeOnClick;
        }
        if ((i11 & 64) != 0) {
            truncateAt = textAtomV2WrapperState.ellipsize;
        }
        boolean z12 = z11;
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        Function2 function22 = function2;
        Gravity gravity2 = gravity;
        return textAtomV2WrapperState.copy(str, textAtom, gravity2, rect, function22, z12, truncateAt2);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getTextAtomDTO() {
        return this.textAtomDTO;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Gravity getGravity() {
        return this.gravity;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    public final Function2<String, Boolean, Unit> component5() {
        return this.onClick;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    /* renamed from: component7, reason: from getter */
    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    @NotNull
    public final TextAtomV2WrapperState copy(@NotNull String id2, @NotNull TextAtom textAtomDTO, @NotNull Gravity gravity, @NotNull Rect paddings, Function2<? super String, ? super Boolean, Unit> onClick, boolean closeOnClick, TextUtils.TruncateAt ellipsize) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(textAtomDTO, "textAtomDTO");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new TextAtomV2WrapperState(id2, textAtomDTO, gravity, paddings, onClick, closeOnClick, ellipsize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAtomV2WrapperState)) {
            return false;
        }
        TextAtomV2WrapperState textAtomV2WrapperState = (TextAtomV2WrapperState) other;
        return Intrinsics.d(this.id, textAtomV2WrapperState.id) && Intrinsics.d(this.textAtomDTO, textAtomV2WrapperState.textAtomDTO) && this.gravity == textAtomV2WrapperState.gravity && Intrinsics.d(this.paddings, textAtomV2WrapperState.paddings) && Intrinsics.d(this.onClick, textAtomV2WrapperState.onClick) && this.closeOnClick == textAtomV2WrapperState.closeOnClick && this.ellipsize == textAtomV2WrapperState.ellipsize;
    }

    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    @NotNull
    public final Gravity getGravity() {
        return this.gravity;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final Function2<String, Boolean, Unit> getOnClick() {
        return this.onClick;
    }

    @NotNull
    public final Rect getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final TextAtom getTextAtomDTO() {
        return this.textAtomDTO;
    }

    public int hashCode() {
        int a11 = d.a(this.paddings, (this.gravity.hashCode() + C2619v.b(this.id.hashCode() * 31, 31, this.textAtomDTO)) * 31, 31);
        Function2<String, Boolean, Unit> function2 = this.onClick;
        int a12 = C3532b.a((a11 + (function2 == null ? 0 : function2.hashCode())) * 31, 31, this.closeOnClick);
        TextUtils.TruncateAt truncateAt = this.ellipsize;
        return a12 + (truncateAt != null ? truncateAt.hashCode() : 0);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        TextAtom textAtom = this.textAtomDTO;
        Gravity gravity = this.gravity;
        Rect rect = this.paddings;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        boolean z11 = this.closeOnClick;
        TextUtils.TruncateAt truncateAt = this.ellipsize;
        StringBuilder d11 = C2436a.d("TextAtomV2WrapperState(id=", str, ", textAtomDTO=", ", gravity=", textAtom);
        d11.append(gravity);
        d11.append(", paddings=");
        d11.append(rect);
        d11.append(", onClick=");
        d11.append(function2);
        d11.append(", closeOnClick=");
        d11.append(z11);
        d11.append(", ellipsize=");
        d11.append(truncateAt);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ TextAtomV2WrapperState(String str, TextAtom textAtom, Gravity gravity, Rect rect, Function2 function2, boolean z11, TextUtils.TruncateAt truncateAt, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textAtom, gravity, (i11 & 8) != 0 ? i.a() : rect, function2, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? TextUtils.TruncateAt.END : truncateAt);
    }
}
