package ru.ozon.fintech.ui.qrcode;

import E30.i;
import Kk.d;
import Nh.a;
import Pk0.b;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0088\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0015J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b6\u0010\u0015R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010 R+\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010\"¨\u0006;"}, d2 = {"Lru/ozon/fintech/ui/qrcode/QrCodeState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "", "percent", "src", "srcBase64", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subTitle", "backColor", "actionId", "Landroid/graphics/Rect;", "paddings", "Lkotlin/Function2;", "", "", "onClick", "<init>", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Rect;Lkotlin/jvm/functions/Function2;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "()F", "component3", "component4", "component5", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component6", "component7", "component8", "()Landroid/graphics/Rect;", "component9", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Rect;Lkotlin/jvm/functions/Function2;)Lru/ozon/fintech/ui/qrcode/QrCodeState;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "F", "getPercent", "getSrc", "getSrcBase64", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubTitle", "getBackColor", "getActionId", "Landroid/graphics/Rect;", "getPaddings", "Lkotlin/jvm/functions/Function2;", "getOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QrCodeState implements RecyclerItem {
    private final String actionId;
    private final String backColor;

    @NotNull
    private final String id;
    private final Function2<String, Boolean, Unit> onClick;

    @NotNull
    private final Rect paddings;
    private final float percent;
    private final String src;
    private final String srcBase64;
    private final TextAtom subTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public QrCodeState(@NotNull String id2, float f7, String str, String str2, TextAtom textAtom, String str3, String str4, @NotNull Rect paddings, Function2<? super String, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.percent = f7;
        this.src = str;
        this.srcBase64 = str2;
        this.subTitle = textAtom;
        this.backColor = str3;
        this.actionId = str4;
        this.paddings = paddings;
        this.onClick = function2;
    }

    public static /* synthetic */ QrCodeState copy$default(QrCodeState qrCodeState, String str, float f7, String str2, String str3, TextAtom textAtom, String str4, String str5, Rect rect, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = qrCodeState.id;
        }
        if ((i11 & 2) != 0) {
            f7 = qrCodeState.percent;
        }
        if ((i11 & 4) != 0) {
            str2 = qrCodeState.src;
        }
        if ((i11 & 8) != 0) {
            str3 = qrCodeState.srcBase64;
        }
        if ((i11 & 16) != 0) {
            textAtom = qrCodeState.subTitle;
        }
        if ((i11 & 32) != 0) {
            str4 = qrCodeState.backColor;
        }
        if ((i11 & 64) != 0) {
            str5 = qrCodeState.actionId;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            rect = qrCodeState.paddings;
        }
        if ((i11 & 256) != 0) {
            function2 = qrCodeState.onClick;
        }
        Rect rect2 = rect;
        Function2 function22 = function2;
        String str6 = str4;
        String str7 = str5;
        TextAtom textAtom2 = textAtom;
        String str8 = str2;
        return qrCodeState.copy(str, f7, str8, str3, textAtom2, str6, str7, rect2, function22);
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

    /* renamed from: component2, reason: from getter */
    public final float getPercent() {
        return this.percent;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSrcBase64() {
        return this.srcBase64;
    }

    /* renamed from: component5, reason: from getter */
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackColor() {
        return this.backColor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    public final Function2<String, Boolean, Unit> component9() {
        return this.onClick;
    }

    @NotNull
    public final QrCodeState copy(@NotNull String id2, float percent, String src, String srcBase64, TextAtom subTitle, String backColor, String actionId, @NotNull Rect paddings, Function2<? super String, ? super Boolean, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new QrCodeState(id2, percent, src, srcBase64, subTitle, backColor, actionId, paddings, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrCodeState)) {
            return false;
        }
        QrCodeState qrCodeState = (QrCodeState) other;
        return Intrinsics.d(this.id, qrCodeState.id) && Float.compare(this.percent, qrCodeState.percent) == 0 && Intrinsics.d(this.src, qrCodeState.src) && Intrinsics.d(this.srcBase64, qrCodeState.srcBase64) && Intrinsics.d(this.subTitle, qrCodeState.subTitle) && Intrinsics.d(this.backColor, qrCodeState.backColor) && Intrinsics.d(this.actionId, qrCodeState.actionId) && Intrinsics.d(this.paddings, qrCodeState.paddings) && Intrinsics.d(this.onClick, qrCodeState.onClick);
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getBackColor() {
        return this.backColor;
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

    public final float getPercent() {
        return this.percent;
    }

    public final String getSrc() {
        return this.src;
    }

    public final String getSrcBase64() {
        return this.srcBase64;
    }

    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    public int hashCode() {
        int a11 = b.a(this.percent, this.id.hashCode() * 31, 31);
        String str = this.src;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.srcBase64;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TextAtom textAtom = this.subTitle;
        int hashCode3 = (hashCode2 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        String str3 = this.backColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionId;
        int a12 = d.a(this.paddings, (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        Function2<String, Boolean, Unit> function2 = this.onClick;
        return a12 + (function2 != null ? function2.hashCode() : 0);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        float f7 = this.percent;
        String str2 = this.src;
        String str3 = this.srcBase64;
        TextAtom textAtom = this.subTitle;
        String str4 = this.backColor;
        String str5 = this.actionId;
        Rect rect = this.paddings;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        StringBuilder sb2 = new StringBuilder("QrCodeState(id=");
        sb2.append(str);
        sb2.append(", percent=");
        sb2.append(f7);
        sb2.append(", src=");
        a.h(sb2, str2, ", srcBase64=", str3, ", subTitle=");
        sb2.append(textAtom);
        sb2.append(", backColor=");
        sb2.append(str4);
        sb2.append(", actionId=");
        sb2.append(str5);
        sb2.append(", paddings=");
        sb2.append(rect);
        sb2.append(", onClick=");
        sb2.append(function2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ QrCodeState(String str, float f7, String str2, String str3, TextAtom textAtom, String str4, String str5, Rect rect, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f7, str2, str3, textAtom, (i11 & 32) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_CTRL_PRIMARY_PALE.getValue() : str4, str5, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? i.a() : rect, function2);
    }
}
