package ru.ozon.fintech.ui.textareaV20;

import B0.C2454a;
import C.o0;
import D3.h;
import De.C2860c;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;
import ru.ozon.uni.android.textArea.TextAreaView;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b4\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\b\u00101\u001a\u00020\u000eH\u0016J\t\u00102\u001a\u00020\u0004HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010:\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010<\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010=\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010>\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000eHÆ\u0003J¼\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\n2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020\u0010HÖ\u0001J\t\u0010G\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b$\u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010)\u001a\u0004\b+\u0010(R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010)\u001a\u0004\b,\u0010(R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b-\u0010!R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&¨\u0006H"}, d2 = {"Lru/ozon/fintech/ui/textareaV20/TextAreaWrapperState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "state", "Lru/ozon/uni/android/textArea/TextAreaView$State;", "status", "Lru/ozon/uni/android/textArea/TextAreaView$Status;", "hasBottomBar", "", "hasInfoIcon", "hasCounter", "currentCountColor", "", "maxLength", "", "inputText", "minLines", "maxLines", "scrollbarEnabled", "caption", "captionColor", "label", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Lru/ozon/uni/android/textArea/TextAreaView$State;Lru/ozon/uni/android/textArea/TextAreaView$Status;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getState", "()Lru/ozon/uni/android/textArea/TextAreaView$State;", "getStatus", "()Lru/ozon/uni/android/textArea/TextAreaView$Status;", "getHasBottomBar", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasInfoIcon", "getHasCounter", "getCurrentCountColor", "()Ljava/lang/String;", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInputText", "getMinLines", "getMaxLines", "getScrollbarEnabled", "getCaption", "getCaptionColor", "getLabel", "provideId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lru/ozon/fintech/ui/utils/Common;Lru/ozon/uni/android/textArea/TextAreaView$State;Lru/ozon/uni/android/textArea/TextAreaView$Status;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/fintech/ui/textareaV20/TextAreaWrapperState;", "equals", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextAreaWrapperState implements RecyclerItem, WidgetState {
    private final String caption;
    private final String captionColor;

    @NotNull
    private final Common common;
    private final String currentCountColor;
    private final Boolean hasBottomBar;
    private final Boolean hasCounter;
    private final Boolean hasInfoIcon;
    private final String inputText;
    private final String label;
    private final Integer maxLength;
    private final Integer maxLines;
    private final Integer minLines;
    private final Boolean scrollbarEnabled;

    @NotNull
    private final TextAreaView.State state;

    @NotNull
    private final TextAreaView.Status status;

    public TextAreaWrapperState(@NotNull Common common, @NotNull TextAreaView.State state, @NotNull TextAreaView.Status status, Boolean bool, Boolean bool2, Boolean bool3, String str, Integer num, String str2, Integer num2, Integer num3, Boolean bool4, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        this.common = common;
        this.state = state;
        this.status = status;
        this.hasBottomBar = bool;
        this.hasInfoIcon = bool2;
        this.hasCounter = bool3;
        this.currentCountColor = str;
        this.maxLength = num;
        this.inputText = str2;
        this.minLines = num2;
        this.maxLines = num3;
        this.scrollbarEnabled = bool4;
        this.caption = str3;
        this.captionColor = str4;
        this.label = str5;
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Common getCommon() {
        return this.common;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getMinLines() {
        return this.minLines;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getScrollbarEnabled() {
        return this.scrollbarEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* renamed from: component14, reason: from getter */
    public final String getCaptionColor() {
        return this.captionColor;
    }

    /* renamed from: component15, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAreaView.State getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAreaView.Status getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getHasInfoIcon() {
        return this.hasInfoIcon;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getHasCounter() {
        return this.hasCounter;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCurrentCountColor() {
        return this.currentCountColor;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    /* renamed from: component9, reason: from getter */
    public final String getInputText() {
        return this.inputText;
    }

    @NotNull
    public final TextAreaWrapperState copy(@NotNull Common common, @NotNull TextAreaView.State state, @NotNull TextAreaView.Status status, Boolean hasBottomBar, Boolean hasInfoIcon, Boolean hasCounter, String currentCountColor, Integer maxLength, String inputText, Integer minLines, Integer maxLines, Boolean scrollbarEnabled, String caption, String captionColor, String label) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        return new TextAreaWrapperState(common, state, status, hasBottomBar, hasInfoIcon, hasCounter, currentCountColor, maxLength, inputText, minLines, maxLines, scrollbarEnabled, caption, captionColor, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAreaWrapperState)) {
            return false;
        }
        TextAreaWrapperState textAreaWrapperState = (TextAreaWrapperState) other;
        return Intrinsics.d(this.common, textAreaWrapperState.common) && this.state == textAreaWrapperState.state && this.status == textAreaWrapperState.status && Intrinsics.d(this.hasBottomBar, textAreaWrapperState.hasBottomBar) && Intrinsics.d(this.hasInfoIcon, textAreaWrapperState.hasInfoIcon) && Intrinsics.d(this.hasCounter, textAreaWrapperState.hasCounter) && Intrinsics.d(this.currentCountColor, textAreaWrapperState.currentCountColor) && Intrinsics.d(this.maxLength, textAreaWrapperState.maxLength) && Intrinsics.d(this.inputText, textAreaWrapperState.inputText) && Intrinsics.d(this.minLines, textAreaWrapperState.minLines) && Intrinsics.d(this.maxLines, textAreaWrapperState.maxLines) && Intrinsics.d(this.scrollbarEnabled, textAreaWrapperState.scrollbarEnabled) && Intrinsics.d(this.caption, textAreaWrapperState.caption) && Intrinsics.d(this.captionColor, textAreaWrapperState.captionColor) && Intrinsics.d(this.label, textAreaWrapperState.label);
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getCaptionColor() {
        return this.captionColor;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    public final String getCurrentCountColor() {
        return this.currentCountColor;
    }

    public final Boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    public final Boolean getHasCounter() {
        return this.hasCounter;
    }

    public final Boolean getHasInfoIcon() {
        return this.hasInfoIcon;
    }

    public final String getInputText() {
        return this.inputText;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final Integer getMaxLines() {
        return this.maxLines;
    }

    public final Integer getMinLines() {
        return this.minLines;
    }

    public final Boolean getScrollbarEnabled() {
        return this.scrollbarEnabled;
    }

    @NotNull
    public final TextAreaView.State getState() {
        return this.state;
    }

    @NotNull
    public final TextAreaView.Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() + ((this.state.hashCode() + (this.common.hashCode() * 31)) * 31)) * 31;
        Boolean bool = this.hasBottomBar;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasInfoIcon;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasCounter;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.currentCountColor;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.maxLength;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.inputText;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.minLines;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxLines;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool4 = this.scrollbarEnabled;
        int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str3 = this.caption;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.captionColor;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.label;
        return hashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return getCommon().getWidgetId();
    }

    @NotNull
    public String toString() {
        Common common = this.common;
        TextAreaView.State state = this.state;
        TextAreaView.Status status = this.status;
        Boolean bool = this.hasBottomBar;
        Boolean bool2 = this.hasInfoIcon;
        Boolean bool3 = this.hasCounter;
        String str = this.currentCountColor;
        Integer num = this.maxLength;
        String str2 = this.inputText;
        Integer num2 = this.minLines;
        Integer num3 = this.maxLines;
        Boolean bool4 = this.scrollbarEnabled;
        String str3 = this.caption;
        String str4 = this.captionColor;
        String str5 = this.label;
        StringBuilder sb2 = new StringBuilder("TextAreaWrapperState(common=");
        sb2.append(common);
        sb2.append(", state=");
        sb2.append(state);
        sb2.append(", status=");
        sb2.append(status);
        sb2.append(", hasBottomBar=");
        sb2.append(bool);
        sb2.append(", hasInfoIcon=");
        h.h(sb2, bool2, ", hasCounter=", bool3, ", currentCountColor=");
        C2454a.f(num, str, ", maxLength=", ", inputText=", sb2);
        C2454a.f(num2, str2, ", minLines=", ", maxLines=", sb2);
        C2860c.f(bool4, num3, ", scrollbarEnabled=", ", caption=", sb2);
        Nh.a.h(sb2, str3, ", captionColor=", str4, ", label=");
        return o0.c(sb2, str5, ")");
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
