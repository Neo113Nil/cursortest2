package ci;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.c1;
import androidx.fragment.app.r;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.y3;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.messaging.w;
import com.google.firebase.messaging.x;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.activities.MainActivity;
import com.sports.insider.util.OpenMarketService;
import d4.q;
import eg.c0;
import eg.y;
import gf.k;
import gf.t;
import gh.m0;
import gh.o0;
import gh.r0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.android.core.w0;
import io.sentry.b1;
import io.sentry.exception.SentryHttpClientException;
import io.sentry.protocol.m;
import io.sentry.protocol.p;
import io.sentry.t4;
import io.sentry.util.j;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kd.e;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.u;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;
import okio.Segment;
import org.json.JSONObject;
import r4.i;
import s.g;
import s.n;
import sg.e1;
import sg.q0;
import u.h;
import u0.f;
import y1.h0;
import y1.i0;
import y1.j0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class c {
    public static int A(int i5) {
        if (i5 == 1) {
            return 0;
        }
        if (i5 == 2) {
            return 1;
        }
        if (i5 == 4) {
            return 2;
        }
        if (i5 == 8) {
            return 3;
        }
        if (i5 == 16) {
            return 4;
        }
        if (i5 == 32) {
            return 5;
        }
        if (i5 == 64) {
            return 6;
        }
        if (i5 == 128) {
            return 7;
        }
        if (i5 == 256) {
            return 8;
        }
        if (i5 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(c1.i(i5, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static boolean B(JSONObject dataJsonObject) {
        Intrinsics.checkNotNullParameter(dataJsonObject, "dataJsonObject");
        k.b(new id.a(5));
        k.b(new id.a(6));
        k.b(new id.a(7));
        try {
            if (dataJsonObject.has("notificationType")) {
                return Intrinsics.areEqual(dataJsonObject.getString("notificationType"), "Announcement");
            }
            return false;
        } catch (Exception e7) {
            zc.d.b(4, "isTypePushBase", e7);
            return false;
        }
    }

    public static boolean C(JSONObject dataJsonObject) {
        Intrinsics.checkNotNullParameter(dataJsonObject, "dataJsonObject");
        k.b(new id.a(5));
        k.b(new id.a(6));
        k.b(new id.a(7));
        try {
            if (dataJsonObject.has("notificationType")) {
                return Intrinsics.areEqual(dataJsonObject.getString("notificationType"), "ay");
            }
            return false;
        } catch (Exception e7) {
            zc.d.b(4, "isTypePushBase", e7);
            return false;
        }
    }

    public static boolean D(JSONObject dataJsonObject) {
        Intrinsics.checkNotNullParameter(dataJsonObject, "dataJsonObject");
        k.b(new id.a(5));
        k.b(new id.a(6));
        k.b(new id.a(7));
        try {
            if (dataJsonObject.has("notificationType")) {
                return Intrinsics.areEqual(dataJsonObject.getString("notificationType"), "consume");
            }
            return false;
        } catch (Exception e7) {
            zc.d.b(4, "isTypePushBase", e7);
            return false;
        }
    }

    public static boolean E(JSONObject dataJsonObject) {
        Intrinsics.checkNotNullParameter(dataJsonObject, "dataJsonObject");
        k.b(new id.a(5));
        k.b(new id.a(6));
        k.b(new id.a(7));
        try {
            if (dataJsonObject.has("notificationType")) {
                return Intrinsics.areEqual(dataJsonObject.getString("notificationType"), "live");
            }
            return false;
        } catch (Exception e7) {
            zc.d.b(4, "isTypePushBase", e7);
            return false;
        }
    }

    public static boolean F(JSONObject dataJsonObject) {
        Intrinsics.checkNotNullParameter(dataJsonObject, "dataJsonObject");
        k.b(new id.a(5));
        k.b(new id.a(6));
        k.b(new id.a(7));
        try {
            if (dataJsonObject.has("notificationType")) {
                return Intrinsics.areEqual(dataJsonObject.getString("notificationType"), "supportChatReply");
            }
            return false;
        } catch (Exception e7) {
            zc.d.b(4, "isTypePushBase", e7);
            return false;
        }
    }

    public static boolean G(JSONObject dataJsonObject) {
        Intrinsics.checkNotNullParameter(dataJsonObject, "dataJsonObject");
        k.b(new id.a(5));
        k.b(new id.a(6));
        k.b(new id.a(7));
        try {
            if (dataJsonObject.has("notificationType")) {
                return Intrinsics.areEqual(dataJsonObject.getString("notificationType"), "general");
            }
            return false;
        } catch (Exception e7) {
            zc.d.b(4, "isTypePushBase", e7);
            return false;
        }
    }

    public static boolean H(JSONObject dataJsonObject) {
        Intrinsics.checkNotNullParameter(dataJsonObject, "dataJsonObject");
        k.b(new id.a(5));
        k.b(new id.a(6));
        k.b(new id.a(7));
        try {
            if (dataJsonObject.has("notificationType")) {
                return Intrinsics.areEqual(dataJsonObject.getString("notificationType"), "needUpdate");
            }
            return false;
        } catch (Exception e7) {
            zc.d.b(4, "isTypePushBase", e7);
            return false;
        }
    }

    public static boolean I(Double d10, boolean z5) {
        return d10 == null ? z5 : !d10.isNaN() && d10.doubleValue() >= 0.0d && d10.doubleValue() <= 1.0d;
    }

    public static long J(RemoteMessage remoteMessage) {
        if (remoteMessage.t0() <= 0) {
            return 2419200000L;
        }
        return ((remoteMessage.t0() * 1000) + remoteMessage.s0()) - Instant.now().toEpochMilli();
    }

    public static final long K(long j, long j6) {
        return g.a(y(j) - y(j6), z(j) - z(j6));
    }

    public static MappedByteBuffer L(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
            FileInputStream n9 = y4.a.n(new FileInputStream(fileDescriptor), fileDescriptor);
            try {
                FileChannel channel = n9.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                n9.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final i0 M(Function1 optionsBuilder) {
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        j0 j0Var = new j0();
        optionsBuilder.invoke(j0Var);
        boolean z5 = j0Var.f25574b;
        h0 h0Var = j0Var.f25573a;
        h0Var.f25553a = z5;
        h0Var.f25554b = j0Var.f25575c;
        int i5 = j0Var.f25576d;
        boolean z7 = j0Var.f25577e;
        h0Var.f25555c = i5;
        h0Var.f25556d = false;
        h0Var.f25557e = z7;
        return new i0(h0Var.f25553a, h0Var.f25554b, h0Var.f25555c, h0Var.f25556d, h0Var.f25557e, h0Var.f25558f, h0Var.f25559g, h0Var.f25560h, h0Var.f25561i);
    }

    public static void N(RemoteMessage remoteMessage, Context context, JSONObject json) {
        String string;
        String string2;
        String W = W(remoteMessage, json);
        long J = J(remoteMessage);
        String l02 = remoteMessage.l0();
        long s02 = remoteMessage.s0();
        w o02 = remoteMessage.o0();
        String str = o02 != null ? o02.f6175a : null;
        w o03 = remoteMessage.o0();
        String str2 = o03 != null ? o03.f6176b : null;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(json, "notificationJson");
        String str3 = str2;
        kd.d dVar = new kd.d(6);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        String clickAction = W == null ? "OPEN_MAIN_ACTIVITY" : W;
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Integer d10 = dVar.d(json);
        String optString = json.optString("announcement_id", CommonUrlParts.Values.FALSE_INTEGER);
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        int intValue = intOrNull != null ? intOrNull.intValue() : 0;
        String str4 = str;
        String str5 = clickAction;
        c0.t(MyApp.f6830c, kd.c.c(), null, new cd.k(intValue, 4, new vc.a(), (Continuation) null), 2);
        new cd.b(6).n("receivedAnnouncement", String.valueOf(intValue));
        try {
            if (json.has("bodyNotify")) {
                string = json.getString("bodyNotify");
            } else if (json.has("body")) {
                string = json.getString("body");
            } else if (str3 == null) {
                string = context.getResources().getString(R.string.notifications);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else {
                string = str3;
            }
            Intrinsics.checkNotNull(string);
        } catch (Exception unused) {
            string = context.getResources().getString(R.string.notifications);
            Intrinsics.checkNotNull(string);
        }
        try {
            if (json.has("titleNotify")) {
                string2 = json.getString("titleNotify");
            } else if (json.has("title")) {
                string2 = json.getString("title");
            } else if (str4 == null) {
                string2 = context.getResources().getString(R.string.app_name);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            } else {
                string2 = str4;
            }
            Intrinsics.checkNotNull(string2);
        } catch (Exception unused2) {
            string2 = context.getResources().getString(R.string.app_name);
            Intrinsics.checkNotNull(string2);
        }
        int i5 = (int) s02;
        if (J <= 0) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("OPEN_MAIN_ACTIVITY");
        Intent putExtra = intent.putExtra("push_id", d10 != null ? d10.intValue() : -1);
        Intrinsics.checkNotNullExpressionValue(putExtra, "let(...)");
        dVar.e(i5, dVar.a(putExtra, context), string2, string, context, true, true, null, 0, null);
        kd.c.h(i5, J);
        dVar.f(l02, str5);
    }

    public static void O(RemoteMessage remoteMessage, Context context, JSONObject json) {
        String str;
        String str2;
        String W = W(remoteMessage, json);
        long J = J(remoteMessage);
        String l02 = remoteMessage.l0();
        long s02 = remoteMessage.s0();
        w o02 = remoteMessage.o0();
        String str3 = o02 != null ? o02.f6175a : null;
        w o03 = remoteMessage.o0();
        String str4 = o03 != null ? o03.f6176b : null;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(json, "notificationJson");
        kd.d dVar = new kd.d(9);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        if (W == null) {
            W = "OPEN_MAIN_ACTIVITY";
        }
        String clickAction = W;
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Integer d10 = dVar.d(json);
        try {
            str = json.has("bodyNotify") ? json.optString("bodyNotify") : json.has("body") ? json.optString("body") : str4 == null ? "Click me" : str4;
            Intrinsics.checkNotNull(str);
        } catch (Exception unused) {
            if (str4 == null) {
                str4 = "Click me";
            }
            str = str4;
        }
        try {
            if (json.has("titleNotify")) {
                str2 = json.getString("titleNotify");
            } else if (json.has("title")) {
                str2 = json.getString("title");
            } else if (str3 == null) {
                str2 = context.getResources().getString(R.string.app_name);
                Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
            } else {
                str2 = str3;
            }
            Intrinsics.checkNotNull(str2);
        } catch (Exception unused2) {
            if (str3 == null) {
                str3 = "Sports insider";
            }
            str2 = str3;
        }
        int i5 = (int) s02;
        if (J <= 0) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("ay");
        Intent putExtra = intent.putExtra("push_id", d10 != null ? d10.intValue() : -1);
        Intrinsics.checkNotNullExpressionValue(putExtra, "let(...)");
        Bundle bundle = new Bundle();
        String optString = json.optString("ay", "");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        bundle.putString("ay", optString);
        Unit unit = Unit.f19194a;
        putExtra.putExtra("args", bundle);
        dVar.e(i5, dVar.a(putExtra, context), str2, str, context, true, true, null, 0, null);
        kd.c.h(i5, J);
        dVar.f(l02, clickAction);
    }

    public static void P(RemoteMessage remoteMessage, JSONObject json) {
        String str;
        String clickAction = W(remoteMessage, json);
        remoteMessage.l0();
        Intrinsics.checkNotNullParameter(json, "notificationJson");
        kd.d dVar = new kd.d(0);
        Intrinsics.checkNotNullParameter(json, "json");
        t b10 = k.b(new id.a(8));
        if (clickAction == null) {
            clickAction = "OPEN_MAIN_ACTIVITY";
        }
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        dVar.d(json);
        Continuation continuation = null;
        try {
            str = json.getString("purchaseToken");
        } catch (Exception unused) {
            str = null;
        }
        if (str == null) {
            return;
        }
        c0.t(MyApp.f6830c, kd.c.c(), null, new androidx.lifecycle.c(str, b10, continuation, 29), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00aa, code lost:
    
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Q(RemoteMessage remoteMessage, Context context, JSONObject json) {
        String str;
        String str2;
        String str3;
        String W = W(remoteMessage, json);
        long J = J(remoteMessage);
        String l02 = remoteMessage.l0();
        w o02 = remoteMessage.o0();
        String str4 = o02 != null ? o02.f6175a : null;
        w o03 = remoteMessage.o0();
        String str5 = o03 != null ? o03.f6176b : null;
        Intrinsics.checkNotNullParameter(json, "notificationJson");
        Intrinsics.checkNotNullParameter(context, "context");
        String str6 = str5;
        kd.d dVar = new kd.d(1);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        String clickAction = W == null ? "LiveClickAction" : W;
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Integer d10 = dVar.d(json);
        String optString = json.optString("message_id", "-1");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        int intValue = intOrNull != null ? intOrNull.intValue() : -1;
        if (intValue < 0) {
            return;
        }
        str = str4;
        c0.t(MyApp.f6830c, kd.c.c(), null, new cd.k(intValue, 5, (Object) json, (Continuation) (0 == true ? 1 : 0)), 2);
        if (str6 == null) {
            try {
                String string = json.has("bodyNotify") ? json.getString("bodyNotify") : null;
                if (string == null) {
                    string = json.has("body") ? json.getString("body") : null;
                }
                str2 = string;
            } catch (Exception unused) {
            }
        } else {
            str2 = str6;
        }
        if (str != null) {
            try {
                str3 = json.has("titleNotify") ? json.getString("titleNotify") : null;
                if (str3 == null) {
                    String string2 = json.has("title") ? json.getString("title") : null;
                    if (string2 == null) {
                        str3 = context.getResources().getString(R.string.live_dash_predictions);
                        Intrinsics.checkNotNullExpressionValue(str3, "getString(...)");
                    } else {
                        str3 = string2;
                    }
                }
            } catch (Exception unused2) {
                str3 = context.getResources().getString(R.string.live_dash_predictions);
                Intrinsics.checkNotNull(str3);
            }
        } else {
            str3 = str;
        }
        if (J > 0) {
            return;
        }
        String optString2 = json.optString("message_id", "-1");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        Integer intOrNull2 = StringsKt.toIntOrNull(optString2);
        int intValue2 = intOrNull2 != null ? intOrNull2.intValue() : -1;
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("LiveClickAction");
        intent.putExtra("LiveId", intValue2);
        Intent putExtra = intent.putExtra("push_id", d10 != null ? d10.intValue() : -1);
        Intrinsics.checkNotNullExpressionValue(putExtra, "let(...)");
        PendingIntent a7 = dVar.a(putExtra, context);
        int i5 = intValue;
        dVar.e(i5, a7, str3, str2, context, true, true, null, 0, null);
        kd.c.h(i5, J);
        dVar.f(l02, clickAction);
        return;
        str2 = "";
        if (str != null) {
        }
        if (J > 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void R(RemoteMessage remoteMessage, Context context, JSONObject json) {
        String str;
        String W = W(remoteMessage, json);
        long J = J(remoteMessage);
        String l02 = remoteMessage.l0();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(json, "notificationJson");
        kd.d dVar = new kd.d(5);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        if (W == null) {
            W = "OPEN_MAIN_ACTIVITY";
        }
        String clickAction = W;
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Integer d10 = dVar.d(json);
        String optString = json.optString("version", "1");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        int intValue = intOrNull != null ? intOrNull.intValue() : 1;
        if (intValue <= 123) {
            return;
        }
        io.sentry.util.network.b bVar = new io.sentry.util.network.b(7);
        String str2 = null;
        c0.t(MyApp.f6830c, (y) bVar.f17176b, null, new androidx.lifecycle.b(intValue, 17, bVar, 0 == true ? 1 : 0), 2);
        try {
            str = json.getString("bodyNotify");
        } catch (Exception unused) {
            str = null;
        }
        if (str == null) {
            try {
                str2 = json.getString("body");
            } catch (Exception unused2) {
            }
            str = str2;
        }
        if (J <= 0) {
            return;
        }
        String string = context.getString(R.string.app_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (str == null) {
            str = context.getString(R.string.app_need_update);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        String optString2 = json.optString("version", "1");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        Integer intOrNull2 = StringsKt.toIntOrNull(optString2);
        int intValue2 = intOrNull2 != null ? intOrNull2.intValue() : 1;
        Intent intent = new Intent(context, (Class<?>) OpenMarketService.class);
        intent.putExtra("version", intValue2);
        Intent putExtra = intent.putExtra("push_id", d10 != null ? d10.intValue() : -1);
        Intrinsics.checkNotNullExpressionValue(putExtra, "let(...)");
        PendingIntent a7 = dVar.a(putExtra, context);
        int i5 = intValue;
        dVar.e(i5, a7, string, str, context, true, true, null, 0, null);
        kd.c.h(i5, J);
        dVar.f(l02, clickAction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static void S(RemoteMessage remoteMessage, Context context, JSONObject json) {
        String str;
        String W = W(remoteMessage, json);
        long J = J(remoteMessage);
        String l02 = remoteMessage.l0();
        w o02 = remoteMessage.o0();
        ?? r32 = 0;
        r32 = 0;
        String str2 = o02 != null ? o02.f6175a : null;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(json, "notificationJson");
        String str3 = str2;
        kd.d dVar = new kd.d(4);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        String clickAction = W == null ? "SupportClickAction" : W;
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Integer d10 = dVar.d(json);
        int k6 = kd.d.k(json);
        if (k6 < 0) {
            return;
        }
        c0.t(MyApp.f6830c, kd.c.c(), null, new e(dVar, json, (Continuation) r32, 0), 2);
        String optString = json.optString("bodyNotify");
        if (optString == null || optString.length() == 0) {
            optString = null;
        }
        if (optString == null) {
            String optString2 = json.optString("body");
            if (optString2 != null && optString2.length() != 0) {
                r32 = optString2;
            }
            optString = r32 == 0 ? "" : r32;
        }
        if (J <= 0) {
            return;
        }
        if (str3 == null) {
            str = context.getString(R.string.technical_support);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        } else {
            str = str3;
        }
        int k9 = kd.d.k(json);
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("SupportClickAction");
        intent.putExtra("id", k9);
        Intent putExtra = intent.putExtra("push_id", d10 != null ? d10.intValue() : -1);
        Intrinsics.checkNotNullExpressionValue(putExtra, "let(...)");
        dVar.e(k6, dVar.a(putExtra, context), str, optString, context, true, true, null, 0, null);
        kd.c.h(k6, J);
        dVar.f(l02, clickAction);
    }

    public static void T(RemoteMessage remoteMessage, Context context, JSONObject json) {
        String str;
        String W = W(remoteMessage, json);
        long J = J(remoteMessage);
        String l02 = remoteMessage.l0();
        w o02 = remoteMessage.o0();
        String str2 = o02 != null ? o02.f6175a : null;
        w o03 = remoteMessage.o0();
        String str3 = o03 != null ? o03.f6176b : null;
        long s02 = remoteMessage.s0();
        Intrinsics.checkNotNullParameter(json, "notificationJson");
        Intrinsics.checkNotNullParameter(context, "context");
        kd.d dVar = new kd.d(12);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        String clickAction = W == null ? "OPEN_TG" : W;
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Integer d10 = dVar.d(json);
        try {
            if (json.has("bodyNotify")) {
                str = json.optString("bodyNotify");
            } else if (json.has("body")) {
                str = json.optString("body");
            } else if (str3 == null) {
                str = context.getResources().getString(R.string.server_error);
                Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
            } else {
                str = str3;
            }
        } catch (Exception unused) {
            str = null;
        }
        if (str != null) {
            str3 = str;
        } else if (str3 == null) {
            str3 = context.getResources().getString(R.string.server_error);
            Intrinsics.checkNotNullExpressionValue(str3, "getString(...)");
        }
        try {
            String string = json.has("titleNotify") ? json.getString("titleNotify") : null;
            String string2 = json.has("title") ? json.getString("title") : null;
            if (string != null) {
                str2 = string;
            } else if (string2 != null) {
                str2 = string2;
            } else if (str2 == null) {
                str2 = context.getResources().getString(R.string.app_name);
                Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
            }
        } catch (Exception unused2) {
            str2 = context.getResources().getString(R.string.app_name);
            Intrinsics.checkNotNull(str2);
        }
        int i5 = (int) s02;
        if (J <= 0) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("OPEN_TG");
        Intent putExtra = intent.putExtra("push_id", d10 != null ? d10.intValue() : -1);
        Intrinsics.checkNotNullExpressionValue(putExtra, "let(...)");
        String optString = json.optString("tg_id", "");
        String str4 = optString != null ? optString : "";
        if (str4.length() > 0) {
            Bundle bundle = new Bundle();
            bundle.putString("tgId", str4);
            Unit unit = Unit.f19194a;
            putExtra.putExtra("args", bundle);
        }
        dVar.e(i5, dVar.a(putExtra, context), str2, str3, context, true, true, null, 0, null);
        new cd.d().c("open_click_push_tg_bot", null);
        kd.c.h(i5, J);
        dVar.f(l02, clickAction);
    }

    public static void U(RemoteMessage remoteMessage, Context context, JSONObject json) {
        String str;
        boolean areEqual;
        String str2;
        String clickAction;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String string;
        String W = W(remoteMessage, json);
        long J = J(remoteMessage);
        String l02 = remoteMessage.l0();
        w o02 = remoteMessage.o0();
        String str11 = o02 != null ? o02.f6175a : null;
        w o03 = remoteMessage.o0();
        String str12 = o03 != null ? o03.f6176b : null;
        long s02 = remoteMessage.s0();
        Intrinsics.checkNotNullParameter(json, "notificationJson");
        Intrinsics.checkNotNullParameter(context, "context");
        k.b(new id.a(5));
        k.b(new id.a(6));
        k.b(new id.a(7));
        boolean z5 = false;
        String str13 = str11;
        String str14 = str12;
        if (W == null ? false : Intrinsics.areEqual(W, "OPEN_NEWS")) {
            kd.d dVar = new kd.d(7);
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(context, "context");
            String clickAction2 = W == null ? "OPEN_NEWS" : W;
            Intrinsics.checkNotNullParameter(clickAction2, "clickAction");
            Integer d10 = dVar.d(json);
            try {
                if (json.has("bodyNotify")) {
                    str9 = json.optString("bodyNotify");
                } else if (json.has("body")) {
                    str9 = json.optString("body");
                } else if (str14 == null) {
                    str9 = context.getResources().getString(R.string.news);
                    Intrinsics.checkNotNullExpressionValue(str9, "getString(...)");
                } else {
                    str9 = str14;
                }
            } catch (Exception unused) {
                str9 = null;
            }
            if (str9 != null) {
                str10 = str9;
            } else if (str14 == null) {
                str10 = context.getResources().getString(R.string.news);
                Intrinsics.checkNotNullExpressionValue(str10, "getString(...)");
            } else {
                str10 = str14;
            }
            try {
                string = json.has("titleNotify") ? json.getString("titleNotify") : null;
                String string2 = json.has("title") ? json.getString("title") : null;
                if (string == null) {
                    if (string2 != null) {
                        string = string2;
                    } else if (str13 == null) {
                        string = context.getResources().getString(R.string.app_name);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    } else {
                        string = str13;
                    }
                }
            } catch (Exception unused2) {
                string = context.getResources().getString(R.string.app_name);
                Intrinsics.checkNotNull(string);
            }
            int i5 = (int) s02;
            if (J <= 0) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.setAction("OPEN_NEWS");
            Intent putExtra = intent.putExtra("push_id", d10 != null ? d10.intValue() : -1);
            Intrinsics.checkNotNullExpressionValue(putExtra, "let(...)");
            String optString = json.optString("news_id", "-1");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            Integer intOrNull = StringsKt.toIntOrNull(optString);
            int intValue = intOrNull != null ? intOrNull.intValue() : -1;
            if (intValue > 0) {
                Bundle bundle = new Bundle();
                bundle.putInt("newsId", intValue);
                Unit unit = Unit.f19194a;
                putExtra.putExtra("args", bundle);
            }
            dVar.e(i5, dVar.a(putExtra, context), string, str10, context, true, true, null, 0, null);
            kd.c.h(i5, J);
            dVar.f(l02, clickAction2);
            return;
        }
        k.b(new id.a(5));
        k.b(new id.a(6));
        k.b(new id.a(7));
        if (W == null) {
            str = W;
            areEqual = false;
        } else {
            str = W;
            areEqual = Intrinsics.areEqual(str, "LivePassedPushClick");
        }
        if (areEqual) {
            String str15 = str;
            kd.d dVar2 = new kd.d(2);
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(context, "context");
            String clickAction3 = str15 == null ? "LivePassedPushClick" : str15;
            Intrinsics.checkNotNullParameter(clickAction3, "clickAction");
            Integer d11 = dVar2.d(json);
            try {
                str6 = json.getString("bodyNotify");
            } catch (Exception unused3) {
                str6 = null;
            }
            if (str6 == null) {
                try {
                    str6 = json.getString("body");
                } catch (Exception unused4) {
                    str6 = null;
                }
                if (str6 == null) {
                    if (str14 == null) {
                        str6 = context.getString(R.string.live_it_is);
                        Intrinsics.checkNotNullExpressionValue(str6, "getString(...)");
                    } else {
                        str6 = str14;
                    }
                }
            }
            try {
                str7 = json.getString("titleNotify");
            } catch (Exception unused5) {
                str7 = null;
            }
            if (str7 == null) {
                try {
                    str8 = json.getString("title");
                } catch (Exception unused6) {
                    str8 = null;
                }
                if (str8 != null) {
                    str7 = str8;
                } else if (str13 == null) {
                    str7 = context.getString(R.string.live_dash_predictions);
                    Intrinsics.checkNotNullExpressionValue(str7, "getString(...)");
                } else {
                    str7 = str13;
                }
            }
            int i10 = (int) s02;
            if (J <= 0) {
                return;
            }
            Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
            intent2.setAction("LivePassedPushClick");
            Intent putExtra2 = intent2.putExtra("push_id", d11 != null ? d11.intValue() : -1);
            Intrinsics.checkNotNullExpressionValue(putExtra2, "let(...)");
            PendingIntent a7 = dVar2.a(putExtra2, context);
            Intent intent3 = new Intent(context, (Class<?>) MainActivity.class);
            intent3.setAction("LivePassedPushClick");
            dVar2.e(i10, a7, str7, str6, context, false, false, "LiveInfoPush", 2147483646, dVar2.a(intent3, context));
            kd.c.h(i10, J);
            dVar2.f(l02, clickAction3);
            return;
        }
        String str16 = str;
        k.b(new id.a(5));
        k.b(new id.a(6));
        k.b(new id.a(7));
        if (str16 == null) {
            str2 = str16;
        } else {
            str2 = str16;
            if (Intrinsics.areEqual(str2, "CLOSING_SALE") || Intrinsics.areEqual(str2, "OPEN_FORECAST")) {
                z5 = true;
            }
        }
        if (!z5) {
            String str17 = str2;
            kd.d dVar3 = new kd.d(11);
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(context, "context");
            clickAction = str17 != null ? str17 : "OPEN_MAIN_ACTIVITY";
            Intrinsics.checkNotNullParameter(clickAction, "clickAction");
            Integer d12 = dVar3.d(json);
            try {
                str3 = json.getString("bodyNotify");
            } catch (Exception unused7) {
                str3 = null;
            }
            if (str3 == null) {
                try {
                    str3 = json.getString("body");
                } catch (Exception unused8) {
                    str3 = null;
                }
                if (str3 == null) {
                    if (str14 == null) {
                        str3 = context.getString(R.string.notifications);
                        Intrinsics.checkNotNullExpressionValue(str3, "getString(...)");
                    } else {
                        str3 = str14;
                    }
                }
            }
            try {
                str4 = json.getString("titleNotify");
            } catch (Exception unused9) {
                str4 = null;
            }
            if (str4 == null) {
                try {
                    str5 = json.getString("title");
                } catch (Exception unused10) {
                    str5 = null;
                }
                if (str5 != null) {
                    str4 = str5;
                } else if (str13 == null) {
                    str4 = context.getString(R.string.app_name);
                    Intrinsics.checkNotNullExpressionValue(str4, "getString(...)");
                } else {
                    str4 = str13;
                }
            }
            int i11 = (int) s02;
            if (J <= 0) {
                return;
            }
            Intent intent4 = new Intent(context, (Class<?>) MainActivity.class);
            intent4.setAction(clickAction);
            Intent putExtra3 = intent4.putExtra("push_id", d12 != null ? d12.intValue() : -1);
            Intrinsics.checkNotNullExpressionValue(putExtra3, "let(...)");
            dVar3.e(i11, dVar3.a(putExtra3, context), str4, str3, context, true, true, null, 0, null);
            kd.c.h(i11, J);
            dVar3.f(l02, clickAction);
            return;
        }
        kd.d dVar4 = new kd.d(3);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        clickAction = str2 != null ? str2 : "OPEN_MAIN_ACTIVITY";
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Integer d13 = dVar4.d(json);
        String message = kd.d.i(json, str14, context);
        String title = kd.d.j(json, str13, context);
        Intrinsics.checkNotNullParameter(json, "json");
        String optString2 = json.optString("new_forecast_id", "-1");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        Integer intOrNull2 = StringsKt.toIntOrNull(optString2);
        int intValue2 = intOrNull2 != null ? intOrNull2.intValue() : -1;
        if (intValue2 <= 0) {
            intValue2 = (int) s02;
        }
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(context, "context");
        if (J <= 0) {
            return;
        }
        Intrinsics.checkNotNullParameter(json, "json");
        String optString3 = json.optString("new_forecast_id", "-1");
        Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
        Integer intOrNull3 = StringsKt.toIntOrNull(optString3);
        int intValue3 = intOrNull3 != null ? intOrNull3.intValue() : -1;
        Intrinsics.checkNotNullParameter(json, "json");
        String optString4 = json.optString("forecast_type", "-1");
        Intrinsics.checkNotNullExpressionValue(optString4, "optString(...)");
        Integer intOrNull4 = StringsKt.toIntOrNull(optString4);
        int intValue4 = intOrNull4 != null ? intOrNull4.intValue() : -1;
        if (intValue3 > 0) {
            intValue2 = intValue3;
        }
        String i12 = kd.d.i(json, message, context);
        String j = kd.d.j(json, title, context);
        Intent intent5 = new Intent(context, (Class<?>) MainActivity.class);
        intent5.setAction(clickAction);
        intent5.putExtra("push_id", d13 != null ? d13.intValue() : -1);
        if (intValue3 > 0 && 1 <= intValue4 && intValue4 < 4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("predictionId", intValue3);
            bundle2.putInt("predictionType", intValue4);
            Unit unit2 = Unit.f19194a;
            intent5.putExtra("args", bundle2);
        }
        int i13 = intValue2;
        dVar4.e(i13, dVar4.a(intent5, context), j, i12, context, true, true, null, 0, null);
        kd.c.h(i13, J);
        dVar4.f(l02, clickAction);
    }

    public static final long V(long j, long j6) {
        return g.a(y(j6) + y(j), z(j6) + z(j));
    }

    public static String W(RemoteMessage remoteMessage, JSONObject jSONObject) {
        try {
            if (!((n) remoteMessage.c()).isEmpty()) {
                return jSONObject.getString("clickAction");
            }
            w o02 = remoteMessage.o0();
            if (o02 != null) {
                return o02.f6177c;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void X(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        e1 e1Var = e1.f23623a;
    }

    public static void Y(Drawable drawable, int i5) {
        drawable.setTint(i5);
    }

    public static final long Z(long j, float f6) {
        return g.a(y(j) * f6, z(j) * f6);
    }

    public static q a(Path path, FileSystem fileSystem, String str, e4.g gVar, int i5) {
        if ((i5 & 4) != 0) {
            str = null;
        }
        if ((i5 & 8) != 0) {
            gVar = null;
        }
        return new q(path, fileSystem, str, gVar);
    }

    public static final List a0(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? DesugarCollections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.F(list)) : e0.f19204a;
    }

    public static d4.t b(BufferedSource bufferedSource, FileSystem fileSystem) {
        return new d4.t(bufferedSource, fileSystem, null);
    }

    public static final Map b0(Map map) {
        int size = map.size();
        if (size == 0) {
            return n0.c();
        }
        if (size != 1) {
            return DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.E(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final i c(int i5, int i10) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
        r4.a aVar = new r4.a(i5);
        if (i10 > 0) {
            return new i(aVar, new r4.a(i10));
        }
        throw new IllegalArgumentException("px must be > 0.");
    }

    public static final long c0(long j, io.sentry.util.network.b f6) {
        Intrinsics.checkNotNullParameter(f6, "f");
        float y5 = y(j);
        float z5 = z(j);
        float[] fArr = (float[]) f6.f17176b;
        fArr[0] = y5;
        fArr[1] = z5;
        ((Matrix) f6.f17177c).mapPoints(fArr);
        long a7 = g.a(fArr[0], fArr[1]);
        return g.a(Float.intBitsToFloat((int) (a7 >> 32)), Float.intBitsToFloat((int) (a7 & 4294967295L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable d0(Drawable drawable) {
        if (!(drawable instanceof h0.a)) {
            return drawable;
        }
        ((h0.b) ((h0.a) drawable)).getClass();
        return null;
    }

    public static c4.d e(c4.d dVar) {
        if (((Double) dVar.f3579d) != null) {
            return dVar;
        }
        return new c4.d((Boolean) dVar.f3577b, (Double) dVar.f3578c, f((Boolean) dVar.f3577b, null, (Double) dVar.f3578c), (Boolean) dVar.f3580e, (Double) dVar.f3581f);
    }

    public static void e0(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static Double f(Boolean bool, Double d10, Double d11) {
        if (d10 != null) {
            return d10;
        }
        double c2 = j.a().c();
        if (d11 == null || bool == null) {
            return Double.valueOf(c2);
        }
        if (bool.booleanValue()) {
            return Double.valueOf(d11.doubleValue() * c2);
        }
        return Double.valueOf(((1.0d - d11.doubleValue()) * c2) + d11.doubleValue());
    }

    public static void f0(String str, List list, int i5) {
        if (list.size() == i5) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i5 + " parameters found " + list.size());
    }

    public static final void g(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.core.view.e1 block = new androidx.core.view.e1(view, null);
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(block, "block");
        bg.i iVar = new bg.i();
        iVar.f3218d = lf.d.a(block, iVar, iVar);
        while (iVar.hasNext()) {
            View view2 = (View) iVar.next();
            b1.a aVar = (b1.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new b1.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f2952a;
            int e7 = u.e(arrayList);
            if (-1 < e7) {
                arrayList.get(e7).getClass();
                throw new ClassCastException();
            }
        }
    }

    public static void g0(String str, List list, int i5) {
        if (list.size() >= i5) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i5 + " parameters found " + list.size());
    }

    public static void h(b1 scopes, gh.i0 request, o0 response) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        gh.y yVar = request.f10206a;
        Headers headers = request.f10208c;
        w E = d5.E(yVar.f10337i);
        Intrinsics.checkNotNullExpressionValue(E, "parse(...)");
        m mVar = new m();
        mVar.f16855a = "SentryOkHttpInterceptor";
        StringBuilder sb2 = new StringBuilder("HTTP Client Error with status code: ");
        int i5 = response.f10276d;
        Headers headers2 = response.f10278f;
        sb2.append(i5);
        t4 t4Var = new t4(new io.sentry.exception.a(mVar, new SentryHttpClientException(sb2.toString()), Thread.currentThread(), true));
        io.sentry.h0 h0Var = new io.sentry.h0();
        h0Var.d(request, "okHttp:request");
        h0Var.d(response, "okHttp:response");
        p pVar = new p();
        pVar.f16876a = E.f6175a;
        pVar.f16878c = E.f6176b;
        pVar.j = E.f6177c;
        pVar.f16880e = scopes.m().isSendDefaultPii() ? headers.get("Cookie") : null;
        pVar.f16877b = request.f10207b;
        pVar.f16881f = com.google.android.play.core.appupdate.b.A(t(scopes, headers));
        m0 m0Var = request.f10209d;
        Long valueOf = m0Var != null ? Long.valueOf(m0Var.a()) : null;
        r rVar = new r(7, pVar);
        if (valueOf != null && valueOf.longValue() != -1) {
            rVar.invoke(valueOf);
        }
        io.sentry.protocol.r rVar2 = new io.sentry.protocol.r();
        rVar2.f16899a = scopes.m().isSendDefaultPii() ? headers2.get("Set-Cookie") : null;
        rVar2.f16900b = com.google.android.play.core.appupdate.b.A(t(scopes, headers2));
        rVar2.f16901c = Integer.valueOf(response.f10276d);
        r0 r0Var = response.f10279g;
        Long valueOf2 = r0Var != null ? Long.valueOf(r0Var.k()) : null;
        r rVar3 = new r(8, rVar2);
        if (valueOf2 != null && valueOf2.longValue() != -1) {
            rVar3.invoke(valueOf2);
        }
        t4Var.f16458d = pVar;
        t4Var.f16456b.s(rVar2);
        scopes.E(t4Var, h0Var);
    }

    public static void h0(int i5, String str, ArrayList arrayList) {
        if (arrayList.size() <= i5) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i5 + " parameters found " + arrayList.size());
    }

    public static void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean i0(com.google.android.gms.internal.measurement.n nVar) {
        if (nVar == null) {
            return false;
        }
        Double d10 = nVar.d();
        return !d10.isNaN() && d10.doubleValue() >= 0.0d && d10.equals(Double.valueOf(Math.floor(d10.doubleValue())));
    }

    public static boolean j(File file, Resources resources, int i5) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i5);
            try {
                boolean k6 = k(file, inputStream);
                i(inputStream);
                return k6;
            } catch (Throwable th2) {
                th = th2;
                i(inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    public static com.google.android.gms.internal.measurement.w j0(String str) {
        com.google.android.gms.internal.measurement.w wVar = null;
        if (str != null && !str.isEmpty()) {
            wVar = (com.google.android.gms.internal.measurement.w) com.google.android.gms.internal.measurement.w.C0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalArgumentException(c1.m("Unsupported commandId ", str));
    }

    public static boolean k(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                fileOutputStream = a.a.h(file, new FileOutputStream(file, false), false);
                byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        i(fileOutputStream);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (IOException e7) {
                w0.d("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e7.getMessage());
                i(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                return false;
            }
        } catch (Throwable th2) {
            i(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th2;
        }
    }

    public static boolean k0(com.google.android.gms.internal.measurement.n nVar, com.google.android.gms.internal.measurement.n nVar2) {
        if (!nVar.getClass().equals(nVar2.getClass())) {
            return false;
        }
        if ((nVar instanceof com.google.android.gms.internal.measurement.r) || (nVar instanceof l)) {
            return true;
        }
        if (!(nVar instanceof com.google.android.gms.internal.measurement.g)) {
            return nVar instanceof com.google.android.gms.internal.measurement.q ? nVar.h().equals(nVar2.h()) : nVar instanceof com.google.android.gms.internal.measurement.e ? nVar.c().equals(nVar2.c()) : nVar == nVar2;
        }
        if (Double.isNaN(nVar.d().doubleValue()) || Double.isNaN(nVar2.d().doubleValue())) {
            return false;
        }
        return nVar.d().equals(nVar2.d());
    }

    public static f l(String type, String str) {
        Exception a7;
        Intrinsics.checkNotNullParameter(type, "type");
        try {
            u0.e eVar = new u0.e(new v0.a(26), (String) null);
            if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                a7 = a.a.a(new v0.a(0), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                a7 = a.a.a(new v0.a(1), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_DATA_CLONE_ERROR"), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                a7 = a.a.a(new v0.a(3), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                a7 = a.a.a(new v0.a(4), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                a7 = a.a.a(new v0.a(10), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_NAMESPACE_ERROR"), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                a7 = a.a.a(new v0.a(12), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                a7 = a.a.a(new v0.a(14), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_NOT_FOUND_ERROR"), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                a7 = a.a.a(new v0.a(16), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                a7 = a.a.a(new v0.a(17), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_OPERATION_ERROR"), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_OPT_OUT_ERROR"), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_READ_ONLY_ERROR"), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                a7 = a.a.a(new v0.a(22), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_SYNTAX_ERROR"), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                a7 = a.a.a(new v0.a(24), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                a7 = a.a.a(new v0.a(26), str, eVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_VERSION_ERROR"), str, eVar);
            } else {
                if (!Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new y0.a();
                }
                a7 = a.a.a(new v0.a("androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"), str, eVar);
            }
            return (f) a7;
        } catch (y0.a unused) {
            return new u0.e(str, type);
        }
    }

    public static int l0(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) (((d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static void m(Object obj, String str, String str2) {
        String w10 = w(str);
        if (Log.isLoggable(w10, 3)) {
            Log.d(w10, String.format(str2, obj));
        }
    }

    public static double m0(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return (d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10));
    }

    public static final long n(long j, float f6) {
        return g.a(y(j) / f6, z(j) / f6);
    }

    public static Object n0(com.google.android.gms.internal.measurement.n nVar) {
        if (com.google.android.gms.internal.measurement.n.T.equals(nVar)) {
            return null;
        }
        if (com.google.android.gms.internal.measurement.n.S.equals(nVar)) {
            return "";
        }
        if (nVar instanceof com.google.android.gms.internal.measurement.k) {
            return o0((com.google.android.gms.internal.measurement.k) nVar);
        }
        if (!(nVar instanceof com.google.android.gms.internal.measurement.d)) {
            return !nVar.d().isNaN() ? nVar.d() : nVar.h();
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.gms.internal.measurement.d dVar = (com.google.android.gms.internal.measurement.d) nVar;
        int i5 = 0;
        while (i5 < dVar.m()) {
            if (i5 >= dVar.m()) {
                throw new NoSuchElementException(r4.k.o(new StringBuilder(String.valueOf(i5).length() + 21), "Out of bounds index: ", i5));
            }
            int i10 = i5 + 1;
            Object n02 = n0(dVar.o(i5));
            if (n02 != null) {
                arrayList.add(n02);
            }
            i5 = i10;
        }
        return arrayList;
    }

    public static final float o(long j, long j6) {
        return (z(j6) * z(j)) + (y(j6) * y(j));
    }

    public static HashMap o0(com.google.android.gms.internal.measurement.k kVar) {
        HashMap hashMap = new HashMap();
        Iterator it = new ArrayList(kVar.f5108a.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object n02 = n0(kVar.a(str));
            if (n02 != null) {
                hashMap.put(str, n02);
            }
        }
        return hashMap;
    }

    public static void p(String str, String str2, Exception exc) {
        String w10 = w(str);
        if (Log.isLoggable(w10, 6)) {
            w0.e(w10, str2, exc);
        }
    }

    public static void p0(x xVar) {
        int l02 = l0(xVar.a0("runtime.counter").d().doubleValue() + 1.0d);
        if (l02 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        xVar.Y("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(l02)));
    }

    public static void q(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            throw new IOException("Directory already exists as a file: " + file.getPath());
        }
        file.mkdirs();
        if (!file.exists()) {
            throw new IOException("Unable to create directory " + file.getPath());
        }
        if (file.isDirectory()) {
            return;
        }
        throw new IOException("Created directory, but we see it as a file: " + file.getPath());
    }

    public static final long r(long j) {
        float sqrt = (float) Math.sqrt((z(j) * z(j)) + (y(j) * y(j)));
        if (sqrt > 0.0f) {
            return n(j, sqrt);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    public static u.k s(u.i iVar) {
        h hVar = new h();
        hVar.f24000c = new u.m();
        u.k kVar = new u.k(hVar);
        hVar.f23999b = kVar;
        hVar.f23998a = iVar.getClass();
        try {
            Object a7 = iVar.a(hVar);
            if (a7 == null) {
                return kVar;
            }
            hVar.f23998a = a7;
            return kVar;
        } catch (Exception e7) {
            kVar.f24004b.l(e7);
            return kVar;
        }
    }

    public static LinkedHashMap t(b1 b1Var, Headers headers) {
        if (!b1Var.m().isSendDefaultPii()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = headers.size();
        for (int i5 = 0; i5 < size; i5++) {
            String name = headers.name(i5);
            if (!io.sentry.util.b.f17154a.contains(name.toUpperCase(Locale.ROOT))) {
                linkedHashMap.put(name, headers.value(i5));
            }
        }
        return linkedHashMap;
    }

    public static l0.g u(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new l0.g(new l0.j(h4.f(configuration))) : l0.g.a(configuration.locale);
    }

    public static final og.a v(og.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.d().c() ? aVar : new q0(aVar);
    }

    public static String w(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static File x(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i5 = 0; i5 < 100; i5++) {
            File file = new File(cacheDir, str + i5);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final float y(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float z(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
    
        if (r6.equals("ky") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        if (r6.equals("kk") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bf, code lost:
    
        if (r6.equals("be") == false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(String str, String str2, mf.c cVar) {
        ma.a aVar;
        int i5;
        r3.e0 e0Var;
        int hashCode;
        String language;
        String str3;
        if (cVar instanceof ma.a) {
            aVar = (ma.a) cVar;
            int i10 = aVar.f20525e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f20525e = i10 - Integer.MIN_VALUE;
                Object obj = aVar.f20523c;
                lf.a aVar2 = lf.a.f20034a;
                i5 = aVar.f20525e;
                if (i5 != 0) {
                    h8.b.B(obj);
                    ea.e eVar = (ea.e) y3.m(ea.e.class, null, 6);
                    aVar.f20521a = str;
                    aVar.f20522b = str2;
                    aVar.f20525e = 1;
                    obj = eVar.b(aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = aVar.f20522b;
                    str = aVar.f20521a;
                    h8.b.B(obj);
                }
                e0Var = (r3.e0) obj;
                hashCode = str.hashCode();
                language = "ru";
                if (hashCode == 3139) {
                    if (hashCode == 3201) {
                        str3 = "de";
                    } else if (hashCode == 3246) {
                        str3 = "es";
                    } else if (hashCode == 3276) {
                        str3 = "fr";
                    } else if (hashCode != 3424) {
                        if (hashCode != 3438) {
                            if (hashCode == 3588) {
                                str3 = "pt";
                            } else if (hashCode == 3651) {
                            }
                        }
                    }
                    str.equals(str3);
                    language = "en";
                }
                e0Var.getClass();
                Intrinsics.checkNotNullParameter(language, "language");
                if (!Intrinsics.areEqual(e0Var.f22228c, str2)) {
                    e0Var.f22228c = str2;
                }
                if (!Intrinsics.areEqual(e0Var.f22227b, language)) {
                    e0Var.f22227b = language;
                }
                return obj;
            }
        }
        aVar = new ma.a(this, cVar);
        Object obj2 = aVar.f20523c;
        lf.a aVar22 = lf.a.f20034a;
        i5 = aVar.f20525e;
        if (i5 != 0) {
        }
        e0Var = (r3.e0) obj2;
        hashCode = str.hashCode();
        language = "ru";
        if (hashCode == 3139) {
        }
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(language, "language");
        if (!Intrinsics.areEqual(e0Var.f22228c, str2)) {
        }
        if (!Intrinsics.areEqual(e0Var.f22227b, language)) {
        }
        return obj2;
    }
}
