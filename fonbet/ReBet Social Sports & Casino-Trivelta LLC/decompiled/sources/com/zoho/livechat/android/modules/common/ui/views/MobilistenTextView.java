package com.zoho.livechat.android.modules.common.ui.views;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.C2068x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import od.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rd.C6218a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/zoho/livechat/android/modules/common/ui/views/MobilistenTextView;", "Landroidx/appcompat/widget/x;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/content/res/TypedArray;", "a", "Landroid/content/res/TypedArray;", "textStylesAttributes", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MobilistenTextView extends C2068x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public TypedArray textStylesAttributes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilistenTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        setIncludeFontPadding(false);
        setTextDirection(5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MobilistenTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
        Typeface P10;
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.MobilistenTextView, 0, 0);
        this.textStylesAttributes = obtainStyledAttributes;
        if (obtainStyledAttributes != null && obtainStyledAttributes.getInt(v.f61166b, -1) == 1) {
            P10 = C6218a.C();
        } else {
            P10 = C6218a.P();
        }
        setTypeface(P10);
    }
}
