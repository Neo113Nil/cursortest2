package com.facebook.react.views.unimplementedview;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C2068x;
import com.facebook.react.common.build.ReactBuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/views/unimplementedview/ReactUnimplementedView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "name", "", "setName$ReactAndroid_release", "(Ljava/lang/String;)V", "setName", "Landroidx/appcompat/widget/x;", "textView", "Landroidx/appcompat/widget/x;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReactUnimplementedView extends LinearLayout {

    @NotNull
    private final C2068x textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactUnimplementedView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        C2068x c2068x = new C2068x(context);
        this.textView = c2068x;
        c2068x.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        c2068x.setGravity(17);
        c2068x.setTextColor(-1);
        c2068x.setText("");
        if (ReactBuildConfig.DEBUG) {
            setBackgroundColor(1442775040);
        }
        setGravity(1);
        setOrientation(1);
        addView(c2068x);
    }

    public final void setName$ReactAndroid_release(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (ReactBuildConfig.DEBUG) {
            this.textView.setText("'" + name + "' is not registered.");
        }
    }
}
