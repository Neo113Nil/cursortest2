package com.socure.docv.capturesdk.common.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import io.sentry.Session;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnimatedTextView.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0013R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/socure/docv/capturesdk/common/view/AnimatedTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "characterAdder", "Ljava/lang/Runnable;", "mDelay", "", "mHandler", "Landroid/os/Handler;", "mIndex", "mText", "", "animateText", "", "text", "endAnimation", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AnimatedTextView extends AppCompatTextView {
    public static final int $stable = 8;
    private final Runnable characterAdder;
    private long mDelay;
    private final Handler mHandler;
    private int mIndex;
    private String mText;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedTextView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AnimatedTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDelay = 100L;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.characterAdder = new Runnable() { // from class: com.socure.docv.capturesdk.common.view.AnimatedTextView$characterAdder$1
            @Override // java.lang.Runnable
            public void run() {
                String str;
                int i2;
                int i3;
                String str2;
                Handler handler;
                long j;
                AnimatedTextView animatedTextView = AnimatedTextView.this;
                str = animatedTextView.mText;
                String str3 = null;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mText");
                    str = null;
                }
                AnimatedTextView animatedTextView2 = AnimatedTextView.this;
                i2 = animatedTextView2.mIndex;
                animatedTextView2.mIndex = i2 + 1;
                animatedTextView.setText(str.subSequence(0, i2));
                i3 = AnimatedTextView.this.mIndex;
                str2 = AnimatedTextView.this.mText;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mText");
                } else {
                    str3 = str2;
                }
                if (i3 <= str3.length()) {
                    handler = AnimatedTextView.this.mHandler;
                    j = AnimatedTextView.this.mDelay;
                    handler.postDelayed(this, j);
                }
            }
        };
    }

    public final void animateText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.mText = text;
        this.mIndex = 0;
        setText("");
        this.mHandler.removeCallbacks(this.characterAdder);
        this.mHandler.postDelayed(this.characterAdder, this.mDelay);
    }

    public final void endAnimation() {
        this.mHandler.removeCallbacks(this.characterAdder);
    }
}
