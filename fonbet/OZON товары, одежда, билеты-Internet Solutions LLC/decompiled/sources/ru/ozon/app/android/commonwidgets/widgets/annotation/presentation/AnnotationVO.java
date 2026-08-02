package ru.ozon.app.android.commonwidgets.widgets.annotation.presentation;

import B0.C2454a;
import G.g;
import Kk.C3532b;
import WZ.t;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001:By\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0007\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b\u000f\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b2\u0010\u001bR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b3\u0010\u001dR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106R\u001f\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u00107\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "text", "", "linkTextColor", "Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationVO$Style;", "style", "", "icon", "defaultIcon", "", "isFullWidth", "bgColor", "textColor", "", "Lru/ozon/uni/atoms/data/deprecated/Button;", "actionButtons", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/CharSequence;ILru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationVO$Style;Ljava/lang/String;IZLjava/lang/String;ILjava/util/List;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "I", "getLinkTextColor", "Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationVO$Style;", "getStyle", "()Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationVO$Style;", "Ljava/lang/String;", "getIcon", "getDefaultIcon", "Z", "()Z", "getBgColor", "getTextColor", "Ljava/util/List;", "getActionButtons", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Style", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AnnotationVO implements c {

    @NotNull
    private final List<Button> actionButtons;
    private final String bgColor;
    private final int defaultIcon;
    private final String icon;
    private final long id;
    private final boolean isFullWidth;
    private final int linkTextColor;

    @NotNull
    private final Style style;

    @NotNull
    private final CharSequence text;
    private final int textColor;
    private final t tokenizedEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationVO$Style;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_TYPE_DEFAULT", "STYLE_TYPE_NEGATIVE", "STYLE_TYPE_POSITIVE", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style STYLE_TYPE_DEFAULT = new Style("STYLE_TYPE_DEFAULT", 0);
        public static final Style STYLE_TYPE_NEGATIVE = new Style("STYLE_TYPE_NEGATIVE", 1);
        public static final Style STYLE_TYPE_POSITIVE = new Style("STYLE_TYPE_POSITIVE", 2);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{STYLE_TYPE_DEFAULT, STYLE_TYPE_NEGATIVE, STYLE_TYPE_POSITIVE};
        }

        static {
            Style[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Style(String str, int i11) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public AnnotationVO(long j11, @NotNull CharSequence text, int i11, @NotNull Style style, String str, int i12, boolean z11, String str2, int i13, @NotNull List<Button> actionButtons, t tVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(actionButtons, "actionButtons");
        this.id = j11;
        this.text = text;
        this.linkTextColor = i11;
        this.style = style;
        this.icon = str;
        this.defaultIcon = i12;
        this.isFullWidth = z11;
        this.bgColor = str2;
        this.textColor = i13;
        this.actionButtons = actionButtons;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotationVO)) {
            return false;
        }
        AnnotationVO annotationVO = (AnnotationVO) other;
        return this.id == annotationVO.id && Intrinsics.d(this.text, annotationVO.text) && this.linkTextColor == annotationVO.linkTextColor && this.style == annotationVO.style && Intrinsics.d(this.icon, annotationVO.icon) && this.defaultIcon == annotationVO.defaultIcon && this.isFullWidth == annotationVO.isFullWidth && Intrinsics.d(this.bgColor, annotationVO.bgColor) && this.textColor == annotationVO.textColor && Intrinsics.d(this.actionButtons, annotationVO.actionButtons) && Intrinsics.d(this.tokenizedEvent, annotationVO.tokenizedEvent);
    }

    @NotNull
    public final List<Button> getActionButtons() {
        return this.actionButtons;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final int getDefaultIcon() {
        return this.defaultIcon;
    }

    public final String getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getLinkTextColor() {
        return this.linkTextColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final CharSequence getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.style.hashCode() + C2454a.a(this.linkTextColor, (this.text.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31)) * 31;
        String str = this.icon;
        int a11 = C3532b.a(C2454a.a(this.defaultIcon, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.isFullWidth);
        String str2 = this.bgColor;
        int b11 = g.b(C2454a.a(this.textColor, (a11 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.actionButtons);
        t tVar = this.tokenizedEvent;
        return b11 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isFullWidth, reason: from getter */
    public final boolean getIsFullWidth() {
        return this.isFullWidth;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CharSequence charSequence = this.text;
        int i11 = this.linkTextColor;
        Style style = this.style;
        String str = this.icon;
        int i12 = this.defaultIcon;
        boolean z11 = this.isFullWidth;
        String str2 = this.bgColor;
        int i13 = this.textColor;
        List<Button> list = this.actionButtons;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("AnnotationVO(id=");
        sb2.append(j11);
        sb2.append(", text=");
        sb2.append((Object) charSequence);
        sb2.append(", linkTextColor=");
        sb2.append(i11);
        sb2.append(", style=");
        sb2.append(style);
        sb2.append(", icon=");
        sb2.append(str);
        sb2.append(", defaultIcon=");
        sb2.append(i12);
        sb2.append(", isFullWidth=");
        sb2.append(z11);
        sb2.append(", bgColor=");
        sb2.append(str2);
        sb2.append(", textColor=");
        sb2.append(i13);
        sb2.append(", actionButtons=");
        sb2.append(list);
        return Lh.a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
