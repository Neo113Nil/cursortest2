package ru.ozon.fintech.ui.button.radio;

import B0.C2454a;
import B4.V;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0019\u0010$\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jj\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR!\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/fintech/ui/button/radio/FinRadioButtonState;", "", "titleId", "", "descriptionId", "isChecked", "", "themeId", "iconId", "iconColor", "", "onClick", "Lkotlin/Function1;", "", "<init>", "(ILjava/lang/Integer;ZILjava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getTitleId", "()I", "getDescriptionId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "setChecked", "(Z)V", "getThemeId", "getIconId", "getIconColor", "()Ljava/lang/String;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/Integer;ZILjava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lru/ozon/fintech/ui/button/radio/FinRadioButtonState;", "equals", "other", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FinRadioButtonState {
    private final Integer descriptionId;
    private final String iconColor;
    private final Integer iconId;
    private boolean isChecked;
    private final Function1<Integer, Unit> onClick;
    private final int themeId;
    private final int titleId;

    /* JADX WARN: Multi-variable type inference failed */
    public FinRadioButtonState(int i11, Integer num, boolean z11, int i12, Integer num2, String str, Function1<? super Integer, Unit> function1) {
        this.titleId = i11;
        this.descriptionId = num;
        this.isChecked = z11;
        this.themeId = i12;
        this.iconId = num2;
        this.iconColor = str;
        this.onClick = function1;
    }

    public static /* synthetic */ FinRadioButtonState copy$default(FinRadioButtonState finRadioButtonState, int i11, Integer num, boolean z11, int i12, Integer num2, String str, Function1 function1, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = finRadioButtonState.titleId;
        }
        if ((i13 & 2) != 0) {
            num = finRadioButtonState.descriptionId;
        }
        if ((i13 & 4) != 0) {
            z11 = finRadioButtonState.isChecked;
        }
        if ((i13 & 8) != 0) {
            i12 = finRadioButtonState.themeId;
        }
        if ((i13 & 16) != 0) {
            num2 = finRadioButtonState.iconId;
        }
        if ((i13 & 32) != 0) {
            str = finRadioButtonState.iconColor;
        }
        if ((i13 & 64) != 0) {
            function1 = finRadioButtonState.onClick;
        }
        String str2 = str;
        Function1 function12 = function1;
        Integer num3 = num2;
        boolean z12 = z11;
        return finRadioButtonState.copy(i11, num, z12, i12, num3, str2, function12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitleId() {
        return this.titleId;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getDescriptionId() {
        return this.descriptionId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* renamed from: component4, reason: from getter */
    public final int getThemeId() {
        return this.themeId;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getIconId() {
        return this.iconId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    public final Function1<Integer, Unit> component7() {
        return this.onClick;
    }

    @NotNull
    public final FinRadioButtonState copy(int titleId, Integer descriptionId, boolean isChecked, int themeId, Integer iconId, String iconColor, Function1<? super Integer, Unit> onClick) {
        return new FinRadioButtonState(titleId, descriptionId, isChecked, themeId, iconId, iconColor, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinRadioButtonState)) {
            return false;
        }
        FinRadioButtonState finRadioButtonState = (FinRadioButtonState) other;
        return this.titleId == finRadioButtonState.titleId && Intrinsics.d(this.descriptionId, finRadioButtonState.descriptionId) && this.isChecked == finRadioButtonState.isChecked && this.themeId == finRadioButtonState.themeId && Intrinsics.d(this.iconId, finRadioButtonState.iconId) && Intrinsics.d(this.iconColor, finRadioButtonState.iconColor) && Intrinsics.d(this.onClick, finRadioButtonState.onClick);
    }

    public final Integer getDescriptionId() {
        return this.descriptionId;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    public final Integer getIconId() {
        return this.iconId;
    }

    public final Function1<Integer, Unit> getOnClick() {
        return this.onClick;
    }

    public final int getThemeId() {
        return this.themeId;
    }

    public final int getTitleId() {
        return this.titleId;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.titleId) * 31;
        Integer num = this.descriptionId;
        int a11 = C2454a.a(this.themeId, C3532b.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.isChecked), 31);
        Integer num2 = this.iconId;
        int hashCode2 = (a11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.iconColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Function1<Integer, Unit> function1 = this.onClick;
        return hashCode3 + (function1 != null ? function1.hashCode() : 0);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z11) {
        this.isChecked = z11;
    }

    @NotNull
    public String toString() {
        int i11 = this.titleId;
        Integer num = this.descriptionId;
        boolean z11 = this.isChecked;
        int i12 = this.themeId;
        Integer num2 = this.iconId;
        String str = this.iconColor;
        Function1<Integer, Unit> function1 = this.onClick;
        StringBuilder sb2 = new StringBuilder("FinRadioButtonState(titleId=");
        sb2.append(i11);
        sb2.append(", descriptionId=");
        sb2.append(num);
        sb2.append(", isChecked=");
        sb2.append(z11);
        sb2.append(", themeId=");
        sb2.append(i12);
        sb2.append(", iconId=");
        V.f(num2, ", iconColor=", str, ", onClick=", sb2);
        sb2.append(function1);
        sb2.append(")");
        return sb2.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ FinRadioButtonState(int r9, java.lang.Integer r10, boolean r11, int r12, java.lang.Integer r13, java.lang.String r14, kotlin.jvm.functions.Function1 r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 8
            if (r0 == 0) goto L5
            r12 = -1
        L5:
            r4 = r12
            r12 = r16 & 16
            r0 = 0
            if (r12 == 0) goto Ld
            r5 = r0
            goto Le
        Ld:
            r5 = r13
        Le:
            r12 = r16 & 32
            if (r12 == 0) goto L14
            r6 = r0
            goto L15
        L14:
            r6 = r14
        L15:
            r12 = r16 & 64
            if (r12 == 0) goto L1f
            r7 = r0
            r1 = r9
            r2 = r10
            r3 = r11
            r0 = r8
            goto L24
        L1f:
            r7 = r15
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
        L24:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.ui.button.radio.FinRadioButtonState.<init>(int, java.lang.Integer, boolean, int, java.lang.Integer, java.lang.String, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
