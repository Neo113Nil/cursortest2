package ru.ozon.fintech.features.camera.ui.tips;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.camera.domain.tips.TipsType;
import ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperState;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/features/camera/ui/tips/TextTipsState;", "", "textAtoms", "", "Lru/ozon/fintech/ui/textatomV2/TextAtomV2WrapperState;", "type", "Lru/ozon/fintech/features/camera/domain/tips/TipsType;", "onClick", "Lkotlin/Function0;", "", "<init>", "(Ljava/util/List;Lru/ozon/fintech/features/camera/domain/tips/TipsType;Lkotlin/jvm/functions/Function0;)V", "getTextAtoms", "()Ljava/util/List;", "getType", "()Lru/ozon/fintech/features/camera/domain/tips/TipsType;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextTipsState {
    private final Function0<Unit> onClick;

    @NotNull
    private final List<TextAtomV2WrapperState> textAtoms;

    @NotNull
    private final TipsType type;

    public TextTipsState(@NotNull List<TextAtomV2WrapperState> textAtoms, @NotNull TipsType type, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(textAtoms, "textAtoms");
        Intrinsics.checkNotNullParameter(type, "type");
        this.textAtoms = textAtoms;
        this.type = type;
        this.onClick = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextTipsState copy$default(TextTipsState textTipsState, List list, TipsType tipsType, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = textTipsState.textAtoms;
        }
        if ((i11 & 2) != 0) {
            tipsType = textTipsState.type;
        }
        if ((i11 & 4) != 0) {
            function0 = textTipsState.onClick;
        }
        return textTipsState.copy(list, tipsType, function0);
    }

    @NotNull
    public final List<TextAtomV2WrapperState> component1() {
        return this.textAtoms;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TipsType getType() {
        return this.type;
    }

    public final Function0<Unit> component3() {
        return this.onClick;
    }

    @NotNull
    public final TextTipsState copy(@NotNull List<TextAtomV2WrapperState> textAtoms, @NotNull TipsType type, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(textAtoms, "textAtoms");
        Intrinsics.checkNotNullParameter(type, "type");
        return new TextTipsState(textAtoms, type, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextTipsState)) {
            return false;
        }
        TextTipsState textTipsState = (TextTipsState) other;
        return Intrinsics.d(this.textAtoms, textTipsState.textAtoms) && this.type == textTipsState.type && Intrinsics.d(this.onClick, textTipsState.onClick);
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    @NotNull
    public final List<TextAtomV2WrapperState> getTextAtoms() {
        return this.textAtoms;
    }

    @NotNull
    public final TipsType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() + (this.textAtoms.hashCode() * 31)) * 31;
        Function0<Unit> function0 = this.onClick;
        return hashCode + (function0 == null ? 0 : function0.hashCode());
    }

    @NotNull
    public String toString() {
        return "TextTipsState(textAtoms=" + this.textAtoms + ", type=" + this.type + ", onClick=" + this.onClick + ")";
    }

    public /* synthetic */ TextTipsState(List list, TipsType tipsType, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, tipsType, (i11 & 4) != 0 ? null : function0);
    }
}
