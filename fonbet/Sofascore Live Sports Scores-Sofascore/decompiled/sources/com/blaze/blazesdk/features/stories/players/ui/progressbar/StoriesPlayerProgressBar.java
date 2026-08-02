package com.blaze.blazesdk.features.stories.players.ui.progressbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerProgressBarStyle;
import defpackage.vrl;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/blaze/blazesdk/features/stories/players/ui/progressbar/StoriesPlayerProgressBar;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "index", "", "setCurrentProgressbar", "(I)V", "getCurrentProgressbar", "()I", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StoriesPlayerProgressBar extends LinearLayout {
    public final ArrayList a;
    public int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesPlayerProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = new ArrayList();
        this.b = -1;
    }

    private final void setCurrentProgressbar(int index) {
        ArrayList arrayList = this.a;
        try {
            this.b = index;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i < index) {
                    ((vrl) arrayList.get(i)).f(2147483647L, 2147483647L);
                } else {
                    ((vrl) arrayList.get(i)).f(0L, 0L);
                }
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void a(int i) {
        try {
            setCurrentProgressbar(i);
            try {
                this.b = i;
                ((vrl) this.a.get(i)).a.b.c(0);
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        } catch (Throwable th2) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
        }
    }

    public final void b(BlazeStoryPlayerProgressBarStyle blazeStoryPlayerProgressBarStyle) {
        try {
            Context context = getContext();
            context.getClass();
            vrl vrlVar = new vrl(context, null, 0, 6, null);
            vrlVar.setProgressBarColors(blazeStoryPlayerProgressBarStyle);
            vrlVar.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            vrlVar.setContentDescription(null);
            vrlVar.setImportantForAccessibility(2);
            addView(vrlVar);
            this.a.add(vrlVar);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    /* renamed from: getCurrentProgressbar, reason: from getter */
    public final int getB() {
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoriesPlayerProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ StoriesPlayerProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoriesPlayerProgressBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
