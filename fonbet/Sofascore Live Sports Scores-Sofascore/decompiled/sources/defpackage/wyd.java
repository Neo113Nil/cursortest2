package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class wyd {
    public static final String a(String str, Intent intent, boolean z) {
        String stringExtra = intent.getStringExtra("player_broadcast_client_source_id");
        String stringExtra2 = intent.getStringExtra("player_broadcast_data_source_representation");
        if (!Intrinsics.c(str, "entry_points_broadcast_id")) {
            return str;
        }
        if (stringExtra != null) {
            return stringExtra;
        }
        if (z) {
            return stringExtra2;
        }
        return null;
    }
}
