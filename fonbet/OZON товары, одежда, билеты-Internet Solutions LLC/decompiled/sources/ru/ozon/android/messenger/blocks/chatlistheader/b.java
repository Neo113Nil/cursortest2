package ru.ozon.android.messenger.blocks.chatlistheader;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f84732a = ResourceExtKt.toPx(44);

    public static void a(@NotNull LinearLayout menuContainer, @NotNull ru.ozon.android.messenger.framework.core.d references, @NotNull List headerMenuItems) {
        CharSequence contentDescription;
        Intrinsics.checkNotNullParameter(menuContainer, "menuContainer");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(headerMenuItems, "headerMenuItems");
        menuContainer.removeAllViews();
        Iterator it = headerMenuItems.iterator();
        while (it.hasNext()) {
            f.b bVar = (f.b) it.next();
            FrameLayout frameLayout = new FrameLayout(ru.ozon.android.messenger.framework.core.f.a(references));
            int i11 = f84732a;
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(i11, i11));
            frameLayout.setBackground(androidx.core.content.a.getDrawable(frameLayout.getContext(), R$drawable.ripple_rect_round_whitewave));
            frameLayout.setOnClickListener(new FK.b(4, bVar, references));
            IconView iconView = new IconView(ru.ozon.android.messenger.framework.core.f.a(references), null, 0, 6, null);
            iconView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            CommonAtomIconDTO icon = bVar.a().getIcon();
            if (icon == null || (contentDescription = icon.getIcon()) == null) {
                contentDescription = iconView.getContentDescription();
            }
            iconView.setContentDescription(contentDescription);
            IconHolderKt.bind(iconView, bVar.a(), new a(bVar, references));
            frameLayout.addView(iconView);
            menuContainer.addView(frameLayout);
        }
    }
}
