package ru.ozon.fintech.ui.textatom;

import Ak.C2436a;
import B90.C2619v;
import E30.i;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Gravity;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0003H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/fintech/ui/textatom/TextAtomWrapperState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", "textAtomDTO", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "gravity", "Lru/ozon/fintech/ui/utils/Gravity;", "paddings", "Landroid/graphics/Rect;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/fintech/ui/utils/Gravity;Landroid/graphics/Rect;)V", "getId", "()Ljava/lang/String;", "getTextAtomDTO", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getGravity", "()Lru/ozon/fintech/ui/utils/Gravity;", "getPaddings", "()Landroid/graphics/Rect;", "provideId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextAtomWrapperState implements RecyclerItem {

    @NotNull
    private final Gravity gravity;

    @NotNull
    private final String id;

    @NotNull
    private final Rect paddings;

    @NotNull
    private final TextAtom textAtomDTO;

    public TextAtomWrapperState(@NotNull String id2, @NotNull TextAtom textAtomDTO, @NotNull Gravity gravity, @NotNull Rect paddings) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(textAtomDTO, "textAtomDTO");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.textAtomDTO = textAtomDTO;
        this.gravity = gravity;
        this.paddings = paddings;
    }

    public static /* synthetic */ TextAtomWrapperState copy$default(TextAtomWrapperState textAtomWrapperState, String str, TextAtom textAtom, Gravity gravity, Rect rect, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = textAtomWrapperState.id;
        }
        if ((i11 & 2) != 0) {
            textAtom = textAtomWrapperState.textAtomDTO;
        }
        if ((i11 & 4) != 0) {
            gravity = textAtomWrapperState.gravity;
        }
        if ((i11 & 8) != 0) {
            rect = textAtomWrapperState.paddings;
        }
        return textAtomWrapperState.copy(str, textAtom, gravity, rect);
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

    @NotNull
    public final TextAtomWrapperState copy(@NotNull String id2, @NotNull TextAtom textAtomDTO, @NotNull Gravity gravity, @NotNull Rect paddings) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(textAtomDTO, "textAtomDTO");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new TextAtomWrapperState(id2, textAtomDTO, gravity, paddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAtomWrapperState)) {
            return false;
        }
        TextAtomWrapperState textAtomWrapperState = (TextAtomWrapperState) other;
        return Intrinsics.d(this.id, textAtomWrapperState.id) && Intrinsics.d(this.textAtomDTO, textAtomWrapperState.textAtomDTO) && this.gravity == textAtomWrapperState.gravity && Intrinsics.d(this.paddings, textAtomWrapperState.paddings);
    }

    @NotNull
    public final Gravity getGravity() {
        return this.gravity;
    }

    @NotNull
    public final String getId() {
        return this.id;
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
        return this.paddings.hashCode() + ((this.gravity.hashCode() + C2619v.b(this.id.hashCode() * 31, 31, this.textAtomDTO)) * 31);
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
        StringBuilder d11 = C2436a.d("TextAtomWrapperState(id=", str, ", textAtomDTO=", ", gravity=", textAtom);
        d11.append(gravity);
        d11.append(", paddings=");
        d11.append(rect);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ TextAtomWrapperState(String str, TextAtom textAtom, Gravity gravity, Rect rect, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textAtom, gravity, (i11 & 8) != 0 ? i.a() : rect);
    }
}
