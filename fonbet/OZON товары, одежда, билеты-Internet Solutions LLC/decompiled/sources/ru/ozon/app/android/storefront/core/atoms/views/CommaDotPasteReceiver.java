package ru.ozon.app.android.storefront.core.atoms.views;

import PJ.b;
import android.content.ClipData;
import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/CommaDotPasteReceiver;", "Landroid/view/OnReceiveContentListener;", "<init>", "()V", "onReceiveContent", "Landroid/view/ContentInfo;", "view", "Landroid/view/View;", "payload", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommaDotPasteReceiver implements OnReceiveContentListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String[] MIME_TYPES = {"text/*"};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/CommaDotPasteReceiver$Companion;", "", "<init>", "()V", "MIME_TYPES", "", "", "getMIME_TYPES", "()[Ljava/lang/String;", "[Ljava/lang/String;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String[] getMIME_TYPES() {
            return CommaDotPasteReceiver.MIME_TYPES;
        }

        private Companion() {
        }
    }

    @NotNull
    public ContentInfo onReceiveContent(@NotNull View view, @NotNull ContentInfo payload) {
        CharSequence charSequence;
        ContentInfo.Builder clip;
        ContentInfo build;
        ClipData clip2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(payload, "payload");
        try {
            clip2 = payload.getClip();
            charSequence = clip2.getItemAt(0).getText();
        } catch (IndexOutOfBoundsException unused) {
            charSequence = "";
        }
        if (!h.t(charSequence.toString(), ",", false)) {
            return payload;
        }
        String X9 = h.X(charSequence.toString(), ",", ".", false);
        clip = b.b(payload).setClip(ClipData.newPlainText(X9, X9));
        build = clip.build();
        Intrinsics.f(build);
        return build;
    }
}
