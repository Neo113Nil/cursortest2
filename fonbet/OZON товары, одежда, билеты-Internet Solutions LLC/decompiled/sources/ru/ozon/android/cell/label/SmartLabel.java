package ru.ozon.android.cell.label;

import Pj.EnumC3823a;
import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/android/cell/label/SmartLabel;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SmartLabel extends AppCompatTextView {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private CharSequence f83784a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f83785b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83786a;

        static {
            int[] iArr = new int[EnumC3823a.values().length];
            try {
                iArr[EnumC3823a.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3823a.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[TextUtils.TruncateAt.values().length];
            try {
                iArr2[TextUtils.TruncateAt.MIDDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TextUtils.TruncateAt.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TextUtils.TruncateAt.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f83786a = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartLabel(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        EnumC3823a enumC3823a = EnumC3823a.START;
        this.f83784a = "";
        setContentDescription("smartLabel");
    }

    private final void setTextInternal(CharSequence charSequence) {
        this.f83785b = true;
        try {
            setText(charSequence);
        } finally {
            this.f83785b = false;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected final void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int min = Integer.min((getMaxWidth() - getPaddingLeft()) - getPaddingRight(), (mode == Integer.MIN_VALUE || mode == 1073741824) ? (View.MeasureSpec.getSize(i11) - getPaddingLeft()) - getPaddingRight() : Integer.MAX_VALUE);
        float desiredWidth = Layout.getDesiredWidth(this.f83784a, getPaint());
        if (getMaxLines() > 0 && min > 0) {
            float f7 = min;
            if (desiredWidth > f7) {
                CharSequence charSequence = this.f83784a;
                if (getMaxLines() > 1) {
                    StaticLayout build = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), min).setBreakStrategy(getBreakStrategy()).setHyphenationFrequency(getHyphenationFrequency()).build();
                    Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                    if (build.getLineCount() > getMaxLines()) {
                        TextUtils.TruncateAt ellipsize = getEllipsize();
                        int i13 = ellipsize == null ? -1 : a.f83786a[ellipsize.ordinal()];
                        if (i13 == 1 || i13 == 2) {
                            int lineStart = build.getLineStart(getMaxLines() - 1);
                            CharSequence concat = TextUtils.concat(charSequence.subSequence(0, lineStart), TextUtils.ellipsize(charSequence.subSequence(lineStart, charSequence.length()), getPaint(), f7, getEllipsize()));
                            Intrinsics.checkNotNullExpressionValue(concat, "concat(...)");
                            setTextInternal(concat);
                        } else if (i13 == 3) {
                            int lineStart2 = build.getLineStart((build.getLineCount() + 1) - getMaxLines());
                            CharSequence concat2 = TextUtils.concat(TextUtils.ellipsize(charSequence.subSequence(0, lineStart2), getPaint(), f7, getEllipsize()), System.lineSeparator(), charSequence.subSequence(lineStart2, charSequence.length()));
                            Intrinsics.checkNotNullExpressionValue(concat2, "concat(...)");
                            setTextInternal(concat2);
                        }
                    }
                } else {
                    CharSequence ellipsize2 = TextUtils.ellipsize(charSequence, getPaint(), f7, getEllipsize());
                    Intrinsics.checkNotNullExpressionValue(ellipsize2, "ellipsize(...)");
                    setTextInternal(ellipsize2);
                }
                super.onMeasure(i11, i12);
            }
        }
        setTextInternal(this.f83784a);
        super.onMeasure(i11, i12);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.f83785b) {
            CharSequence value = charSequence == null ? "" : charSequence;
            Intrinsics.checkNotNullParameter(value, "value");
            this.f83784a = value;
            setTextInternal(value);
        }
        super.setText(charSequence, bufferType);
    }
}
