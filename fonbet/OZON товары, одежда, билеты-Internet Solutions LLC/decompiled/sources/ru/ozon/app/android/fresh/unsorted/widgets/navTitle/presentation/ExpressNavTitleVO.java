package ru.ozon.app.android.fresh.unsorted.widgets.navTitle.presentation;

import Ak.C2436a;
import G.g;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/navTitle/presentation/ExpressNavTitleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "text", "textStyle", "textColor", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getText", "getTextStyle", "getTextColor", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ExpressNavTitleVO implements c {
    private final long id;

    @NotNull
    private final String text;

    @NotNull
    private final String textColor;

    @NotNull
    private final String textStyle;

    public ExpressNavTitleVO(long j11, @NotNull String text, @NotNull String textStyle, @NotNull String textColor) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.id = j11;
        this.text = text;
        this.textStyle = textStyle;
        this.textColor = textColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpressNavTitleVO)) {
            return false;
        }
        ExpressNavTitleVO expressNavTitleVO = (ExpressNavTitleVO) other;
        return this.id == expressNavTitleVO.id && Intrinsics.d(this.text, expressNavTitleVO.text) && Intrinsics.d(this.textStyle, expressNavTitleVO.textStyle) && Intrinsics.d(this.textColor, expressNavTitleVO.textColor);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final String getTextStyle() {
        return this.textStyle;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.textColor.hashCode() + g.a(g.a(Long.hashCode(this.id) * 31, 31, this.text), 31, this.textStyle);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.text;
        String str2 = this.textStyle;
        String str3 = this.textColor;
        StringBuilder c11 = C2436a.c(j11, "ExpressNavTitleVO(id=", ", text=", str);
        a.h(c11, ", textStyle=", str2, ", textColor=", str3);
        c11.append(")");
        return c11.toString();
    }
}
