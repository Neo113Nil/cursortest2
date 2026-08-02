package ru.ozon.android.messenger.utils.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Patterns;
import android.webkit.URLUtil;
import android.widget.TextView;
import j.C7232a;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.button.Icon;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class n {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92014a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f92014a = iArr;
        }
    }

    public static final Object b(@NotNull TextView textView, CharSequence charSequence, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(De.s.f6650a.x(), new p(textView, charSequence, null), jVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(TextView textView, Drawable drawable, b bVar) {
        int i11 = a.f92014a[bVar.ordinal()];
        if (i11 == 1) {
            textView.setCompoundDrawablesRelative(drawable, null, null, null);
        } else {
            if (i11 != 2) {
                throw new Sc.o();
            }
            textView.setCompoundDrawablesRelative(null, null, drawable, null);
        }
    }

    public static void d(TextView textView, Icon icon, b iconPosition, d.a networkConfig, int i11, Rect rect) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(iconPosition, "iconPosition");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        if (icon == null) {
            c(textView, null, iconPosition);
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, icon.getTintColor());
        if (parseColor == null) {
            parseColor = null;
        }
        String image = icon.getImage();
        Intrinsics.checkNotNullParameter(image, "<this>");
        if (Patterns.WEB_URL.matcher(image).matches() || URLUtil.isContentUrl(icon.getImage())) {
            Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ContextExtKt.load(context2, ru.ozon.android.messenger.utils.n.b(icon.getImage(), networkConfig.a(), networkConfig.b()), (r15 & 2) != 0 ? K.f71697a : null, (r15 & 4) != 0 ? null : new q(parseColor, rect, textView, iconPosition, i11), (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? LoadPriority.NORMAL : null, (r15 & 32) != 0 ? false : false, (r15 & 64) != 0 ? null : null);
            return;
        }
        Context context3 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        String name = icon.getImage();
        Intrinsics.checkNotNullParameter(context3, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context3, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int identifier = context3.getResources().getIdentifier(name, "drawable", context3.getPackageName());
        Drawable a11 = identifier != 0 ? C7232a.a(context3, identifier) : null;
        if (a11 == null) {
            c(textView, null, iconPosition);
            return;
        }
        a11.setBounds(rect);
        if (parseColor != null) {
            a11.setTint(parseColor.intValue());
        }
        c(textView, a11, iconPosition);
        textView.setCompoundDrawablePadding(i11);
    }

    public static final void e(@NotNull TextView textView, String str) {
        int i11;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (str != null) {
            if (kotlin.text.h.z0(str).length() <= 0) {
                str = null;
            }
            if (str != null) {
                textView.setText(str);
                i11 = 0;
                textView.setVisibility(i11);
            }
        }
        i11 = 8;
        textView.setVisibility(i11);
    }
}
