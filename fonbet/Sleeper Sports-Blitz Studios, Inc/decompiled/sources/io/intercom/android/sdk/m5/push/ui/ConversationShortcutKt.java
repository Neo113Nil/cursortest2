package io.intercom.android.sdk.m5.push.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.intercom.twig.Twig;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationShortcut.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a@\u0010\u0000\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000\u001a2\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¨\u0006\u0011"}, d2 = {"createTemporaryShortcut", "Lkotlin/Pair;", "", "Landroidx/core/content/pm/ShortcutInfoCompat;", "context", "Landroid/content/Context;", "conversationId", "", "conversationTitle", "avatarBitmap", "Landroid/graphics/Bitmap;", "resetShortcuts", "", "dynamicShortcuts", "temporaryShortcut", "twig", "Lcom/intercom/twig/Twig;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConversationShortcutKt {
    public static final Pair<List<ShortcutInfoCompat>, ShortcutInfoCompat> createTemporaryShortcut(Context context, String conversationId, String conversationTitle, Bitmap bitmap) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(conversationTitle, "conversationTitle");
        List<ShortcutInfoCompat> shortcuts = ShortcutManagerCompat.getShortcuts(context, 8);
        Intrinsics.checkNotNullExpressionValue(shortcuts, "getShortcuts(...)");
        List<ShortcutInfoCompat> dynamicShortcuts = ShortcutManagerCompat.getDynamicShortcuts(context);
        Intrinsics.checkNotNullExpressionValue(dynamicShortcuts, "getDynamicShortcuts(...)");
        Iterator<T> it = shortcuts.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ShortcutInfoCompat shortcutInfoCompat = (ShortcutInfoCompat) obj;
            if (Intrinsics.areEqual(shortcutInfoCompat.getId(), conversationId) && Intrinsics.areEqual(shortcutInfoCompat.getShortLabel(), conversationTitle)) {
                break;
            }
        }
        ShortcutInfoCompat shortcutInfoCompat2 = (ShortcutInfoCompat) obj;
        if (shortcutInfoCompat2 != null) {
            return TuplesKt.to(null, shortcutInfoCompat2);
        }
        Iterator<T> it2 = dynamicShortcuts.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            ShortcutInfoCompat shortcutInfoCompat3 = (ShortcutInfoCompat) obj2;
            if (Intrinsics.areEqual(shortcutInfoCompat3.getId(), conversationId) && Intrinsics.areEqual(shortcutInfoCompat3.getShortLabel(), conversationTitle)) {
                break;
            }
        }
        ShortcutInfoCompat shortcutInfoCompat4 = (ShortcutInfoCompat) obj2;
        if (shortcutInfoCompat4 != null) {
            return TuplesKt.to(null, shortcutInfoCompat4);
        }
        ShortcutInfoCompat.Builder isConversation = new ShortcutInfoCompat.Builder(context, conversationId).setLongLived(true).setShortLabel(conversationTitle).setIntent(new Intent("android.intent.action.VIEW")).setIsConversation();
        if (bitmap != null) {
            IconCompat createWithAdaptiveBitmap = IconCompat.createWithAdaptiveBitmap(bitmap);
            Intrinsics.checkNotNullExpressionValue(createWithAdaptiveBitmap, "createWithAdaptiveBitmap(...)");
            isConversation.setIcon(createWithAdaptiveBitmap);
        }
        ShortcutInfoCompat build = isConversation.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        ShortcutManagerCompat.pushDynamicShortcut(context, build);
        return TuplesKt.to(dynamicShortcuts, build);
    }

    public static final void resetShortcuts(Context context, List<? extends ShortcutInfoCompat> list, ShortcutInfoCompat shortcutInfoCompat, Twig twig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(twig, "twig");
        if (shortcutInfoCompat != null) {
            ShortcutManagerCompat.removeDynamicShortcuts(context, CollectionsKt.listOf(shortcutInfoCompat.getId()));
        }
        if (list != null) {
            try {
                Boolean.valueOf(ShortcutManagerCompat.setDynamicShortcuts(context, list));
            } catch (IllegalArgumentException e) {
                twig.i(e, "Could not set dynamic shortcuts, max number of dynamic shortcuts exceeded.", new Object[0]);
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
