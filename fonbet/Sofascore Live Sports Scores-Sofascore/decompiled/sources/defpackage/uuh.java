package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.service.notification.StatusBarNotification;
import com.sofascore.model.notifications.NotificationData;
import com.sofascore.model.notifications.NotificationOpen;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uuh extends hoi implements Function2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ NotificationData C;
    public final /* synthetic */ efd D;
    public final /* synthetic */ NotificationManager E;
    public final /* synthetic */ vuh F;
    public final /* synthetic */ int G;
    public NotificationData r;
    public efd s;
    public NotificationManager t;
    public vuh u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uuh(NotificationData notificationData, efd efdVar, NotificationManager notificationManager, vuh vuhVar, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.C = notificationData;
        this.D = efdVar;
        this.E = notificationManager;
        this.F = vuhVar;
        this.G = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        uuh uuhVar = new uuh(this.C, this.D, this.E, this.F, this.G, rq3Var);
        uuhVar.B = obj;
        return uuhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((uuh) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0135 A[Catch: all -> 0x036e, CancellationException -> 0x0371, TryCatch #2 {CancellationException -> 0x0371, all -> 0x036e, blocks: (B:8:0x001e, B:10:0x012d, B:12:0x0135, B:14:0x0138, B:16:0x034a, B:18:0x0354, B:20:0x0360, B:28:0x008b, B:32:0x004f, B:34:0x0176, B:36:0x017a, B:38:0x0180, B:39:0x018c, B:46:0x01af, B:47:0x01bd, B:50:0x0067, B:52:0x0228, B:54:0x0230, B:56:0x0233, B:58:0x0078, B:60:0x029b, B:62:0x02a3, B:64:0x02a6, B:67:0x0098, B:69:0x02fe, B:71:0x0306, B:73:0x0309, B:75:0x00a9, B:77:0x033a, B:79:0x0342, B:81:0x0345, B:83:0x00b9, B:85:0x00bf, B:87:0x00c2, B:90:0x00d1, B:94:0x00db, B:96:0x00e6, B:101:0x00fb, B:104:0x0100, B:106:0x0103, B:110:0x013e, B:114:0x014c, B:118:0x01c0, B:123:0x01e5, B:125:0x01ed, B:127:0x01f0, B:132:0x023a, B:134:0x023d, B:137:0x0260, B:141:0x0250, B:143:0x02ad, B:145:0x02b0, B:149:0x02ce, B:151:0x02d1, B:156:0x0310, B:158:0x0313, B:161:0x00ee), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0138 A[Catch: all -> 0x036e, CancellationException -> 0x0371, TryCatch #2 {CancellationException -> 0x0371, all -> 0x036e, blocks: (B:8:0x001e, B:10:0x012d, B:12:0x0135, B:14:0x0138, B:16:0x034a, B:18:0x0354, B:20:0x0360, B:28:0x008b, B:32:0x004f, B:34:0x0176, B:36:0x017a, B:38:0x0180, B:39:0x018c, B:46:0x01af, B:47:0x01bd, B:50:0x0067, B:52:0x0228, B:54:0x0230, B:56:0x0233, B:58:0x0078, B:60:0x029b, B:62:0x02a3, B:64:0x02a6, B:67:0x0098, B:69:0x02fe, B:71:0x0306, B:73:0x0309, B:75:0x00a9, B:77:0x033a, B:79:0x0342, B:81:0x0345, B:83:0x00b9, B:85:0x00bf, B:87:0x00c2, B:90:0x00d1, B:94:0x00db, B:96:0x00e6, B:101:0x00fb, B:104:0x0100, B:106:0x0103, B:110:0x013e, B:114:0x014c, B:118:0x01c0, B:123:0x01e5, B:125:0x01ed, B:127:0x01f0, B:132:0x023a, B:134:0x023d, B:137:0x0260, B:141:0x0250, B:143:0x02ad, B:145:0x02b0, B:149:0x02ce, B:151:0x02d1, B:156:0x0310, B:158:0x0313, B:161:0x00ee), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0354 A[Catch: all -> 0x036e, CancellationException -> 0x0371, TryCatch #2 {CancellationException -> 0x0371, all -> 0x036e, blocks: (B:8:0x001e, B:10:0x012d, B:12:0x0135, B:14:0x0138, B:16:0x034a, B:18:0x0354, B:20:0x0360, B:28:0x008b, B:32:0x004f, B:34:0x0176, B:36:0x017a, B:38:0x0180, B:39:0x018c, B:46:0x01af, B:47:0x01bd, B:50:0x0067, B:52:0x0228, B:54:0x0230, B:56:0x0233, B:58:0x0078, B:60:0x029b, B:62:0x02a3, B:64:0x02a6, B:67:0x0098, B:69:0x02fe, B:71:0x0306, B:73:0x0309, B:75:0x00a9, B:77:0x033a, B:79:0x0342, B:81:0x0345, B:83:0x00b9, B:85:0x00bf, B:87:0x00c2, B:90:0x00d1, B:94:0x00db, B:96:0x00e6, B:101:0x00fb, B:104:0x0100, B:106:0x0103, B:110:0x013e, B:114:0x014c, B:118:0x01c0, B:123:0x01e5, B:125:0x01ed, B:127:0x01f0, B:132:0x023a, B:134:0x023d, B:137:0x0260, B:141:0x0250, B:143:0x02ad, B:145:0x02b0, B:149:0x02ce, B:151:0x02d1, B:156:0x0310, B:158:0x0313, B:161:0x00ee), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017a A[Catch: all -> 0x036e, CancellationException -> 0x0371, TryCatch #2 {CancellationException -> 0x0371, all -> 0x036e, blocks: (B:8:0x001e, B:10:0x012d, B:12:0x0135, B:14:0x0138, B:16:0x034a, B:18:0x0354, B:20:0x0360, B:28:0x008b, B:32:0x004f, B:34:0x0176, B:36:0x017a, B:38:0x0180, B:39:0x018c, B:46:0x01af, B:47:0x01bd, B:50:0x0067, B:52:0x0228, B:54:0x0230, B:56:0x0233, B:58:0x0078, B:60:0x029b, B:62:0x02a3, B:64:0x02a6, B:67:0x0098, B:69:0x02fe, B:71:0x0306, B:73:0x0309, B:75:0x00a9, B:77:0x033a, B:79:0x0342, B:81:0x0345, B:83:0x00b9, B:85:0x00bf, B:87:0x00c2, B:90:0x00d1, B:94:0x00db, B:96:0x00e6, B:101:0x00fb, B:104:0x0100, B:106:0x0103, B:110:0x013e, B:114:0x014c, B:118:0x01c0, B:123:0x01e5, B:125:0x01ed, B:127:0x01f0, B:132:0x023a, B:134:0x023d, B:137:0x0260, B:141:0x0250, B:143:0x02ad, B:145:0x02b0, B:149:0x02ce, B:151:0x02d1, B:156:0x0310, B:158:0x0313, B:161:0x00ee), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bd A[Catch: all -> 0x036e, CancellationException -> 0x0371, TryCatch #2 {CancellationException -> 0x0371, all -> 0x036e, blocks: (B:8:0x001e, B:10:0x012d, B:12:0x0135, B:14:0x0138, B:16:0x034a, B:18:0x0354, B:20:0x0360, B:28:0x008b, B:32:0x004f, B:34:0x0176, B:36:0x017a, B:38:0x0180, B:39:0x018c, B:46:0x01af, B:47:0x01bd, B:50:0x0067, B:52:0x0228, B:54:0x0230, B:56:0x0233, B:58:0x0078, B:60:0x029b, B:62:0x02a3, B:64:0x02a6, B:67:0x0098, B:69:0x02fe, B:71:0x0306, B:73:0x0309, B:75:0x00a9, B:77:0x033a, B:79:0x0342, B:81:0x0345, B:83:0x00b9, B:85:0x00bf, B:87:0x00c2, B:90:0x00d1, B:94:0x00db, B:96:0x00e6, B:101:0x00fb, B:104:0x0100, B:106:0x0103, B:110:0x013e, B:114:0x014c, B:118:0x01c0, B:123:0x01e5, B:125:0x01ed, B:127:0x01f0, B:132:0x023a, B:134:0x023d, B:137:0x0260, B:141:0x0250, B:143:0x02ad, B:145:0x02b0, B:149:0x02ce, B:151:0x02d1, B:156:0x0310, B:158:0x0313, B:161:0x00ee), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0230 A[Catch: all -> 0x036e, CancellationException -> 0x0371, TryCatch #2 {CancellationException -> 0x0371, all -> 0x036e, blocks: (B:8:0x001e, B:10:0x012d, B:12:0x0135, B:14:0x0138, B:16:0x034a, B:18:0x0354, B:20:0x0360, B:28:0x008b, B:32:0x004f, B:34:0x0176, B:36:0x017a, B:38:0x0180, B:39:0x018c, B:46:0x01af, B:47:0x01bd, B:50:0x0067, B:52:0x0228, B:54:0x0230, B:56:0x0233, B:58:0x0078, B:60:0x029b, B:62:0x02a3, B:64:0x02a6, B:67:0x0098, B:69:0x02fe, B:71:0x0306, B:73:0x0309, B:75:0x00a9, B:77:0x033a, B:79:0x0342, B:81:0x0345, B:83:0x00b9, B:85:0x00bf, B:87:0x00c2, B:90:0x00d1, B:94:0x00db, B:96:0x00e6, B:101:0x00fb, B:104:0x0100, B:106:0x0103, B:110:0x013e, B:114:0x014c, B:118:0x01c0, B:123:0x01e5, B:125:0x01ed, B:127:0x01f0, B:132:0x023a, B:134:0x023d, B:137:0x0260, B:141:0x0250, B:143:0x02ad, B:145:0x02b0, B:149:0x02ce, B:151:0x02d1, B:156:0x0310, B:158:0x0313, B:161:0x00ee), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0233 A[Catch: all -> 0x036e, CancellationException -> 0x0371, TryCatch #2 {CancellationException -> 0x0371, all -> 0x036e, blocks: (B:8:0x001e, B:10:0x012d, B:12:0x0135, B:14:0x0138, B:16:0x034a, B:18:0x0354, B:20:0x0360, B:28:0x008b, B:32:0x004f, B:34:0x0176, B:36:0x017a, B:38:0x0180, B:39:0x018c, B:46:0x01af, B:47:0x01bd, B:50:0x0067, B:52:0x0228, B:54:0x0230, B:56:0x0233, B:58:0x0078, B:60:0x029b, B:62:0x02a3, B:64:0x02a6, B:67:0x0098, B:69:0x02fe, B:71:0x0306, B:73:0x0309, B:75:0x00a9, B:77:0x033a, B:79:0x0342, B:81:0x0345, B:83:0x00b9, B:85:0x00bf, B:87:0x00c2, B:90:0x00d1, B:94:0x00db, B:96:0x00e6, B:101:0x00fb, B:104:0x0100, B:106:0x0103, B:110:0x013e, B:114:0x014c, B:118:0x01c0, B:123:0x01e5, B:125:0x01ed, B:127:0x01f0, B:132:0x023a, B:134:0x023d, B:137:0x0260, B:141:0x0250, B:143:0x02ad, B:145:0x02b0, B:149:0x02ce, B:151:0x02d1, B:156:0x0310, B:158:0x0313, B:161:0x00ee), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02a3 A[Catch: all -> 0x036e, CancellationException -> 0x0371, TryCatch #2 {CancellationException -> 0x0371, all -> 0x036e, blocks: (B:8:0x001e, B:10:0x012d, B:12:0x0135, B:14:0x0138, B:16:0x034a, B:18:0x0354, B:20:0x0360, B:28:0x008b, B:32:0x004f, B:34:0x0176, B:36:0x017a, B:38:0x0180, B:39:0x018c, B:46:0x01af, B:47:0x01bd, B:50:0x0067, B:52:0x0228, B:54:0x0230, B:56:0x0233, B:58:0x0078, B:60:0x029b, B:62:0x02a3, B:64:0x02a6, B:67:0x0098, B:69:0x02fe, B:71:0x0306, B:73:0x0309, B:75:0x00a9, B:77:0x033a, B:79:0x0342, B:81:0x0345, B:83:0x00b9, B:85:0x00bf, B:87:0x00c2, B:90:0x00d1, B:94:0x00db, B:96:0x00e6, B:101:0x00fb, B:104:0x0100, B:106:0x0103, B:110:0x013e, B:114:0x014c, B:118:0x01c0, B:123:0x01e5, B:125:0x01ed, B:127:0x01f0, B:132:0x023a, B:134:0x023d, B:137:0x0260, B:141:0x0250, B:143:0x02ad, B:145:0x02b0, B:149:0x02ce, B:151:0x02d1, B:156:0x0310, B:158:0x0313, B:161:0x00ee), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a6 A[Catch: all -> 0x036e, CancellationException -> 0x0371, TryCatch #2 {CancellationException -> 0x0371, all -> 0x036e, blocks: (B:8:0x001e, B:10:0x012d, B:12:0x0135, B:14:0x0138, B:16:0x034a, B:18:0x0354, B:20:0x0360, B:28:0x008b, B:32:0x004f, B:34:0x0176, B:36:0x017a, B:38:0x0180, B:39:0x018c, B:46:0x01af, B:47:0x01bd, B:50:0x0067, B:52:0x0228, B:54:0x0230, B:56:0x0233, B:58:0x0078, B:60:0x029b, B:62:0x02a3, B:64:0x02a6, B:67:0x0098, B:69:0x02fe, B:71:0x0306, B:73:0x0309, B:75:0x00a9, B:77:0x033a, B:79:0x0342, B:81:0x0345, B:83:0x00b9, B:85:0x00bf, B:87:0x00c2, B:90:0x00d1, B:94:0x00db, B:96:0x00e6, B:101:0x00fb, B:104:0x0100, B:106:0x0103, B:110:0x013e, B:114:0x014c, B:118:0x01c0, B:123:0x01e5, B:125:0x01ed, B:127:0x01f0, B:132:0x023a, B:134:0x023d, B:137:0x0260, B:141:0x0250, B:143:0x02ad, B:145:0x02b0, B:149:0x02ce, B:151:0x02d1, B:156:0x0310, B:158:0x0313, B:161:0x00ee), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0306 A[Catch: all -> 0x036e, CancellationException -> 0x0371, TryCatch #2 {CancellationException -> 0x0371, all -> 0x036e, blocks: (B:8:0x001e, B:10:0x012d, B:12:0x0135, B:14:0x0138, B:16:0x034a, B:18:0x0354, B:20:0x0360, B:28:0x008b, B:32:0x004f, B:34:0x0176, B:36:0x017a, B:38:0x0180, B:39:0x018c, B:46:0x01af, B:47:0x01bd, B:50:0x0067, B:52:0x0228, B:54:0x0230, B:56:0x0233, B:58:0x0078, B:60:0x029b, B:62:0x02a3, B:64:0x02a6, B:67:0x0098, B:69:0x02fe, B:71:0x0306, B:73:0x0309, B:75:0x00a9, B:77:0x033a, B:79:0x0342, B:81:0x0345, B:83:0x00b9, B:85:0x00bf, B:87:0x00c2, B:90:0x00d1, B:94:0x00db, B:96:0x00e6, B:101:0x00fb, B:104:0x0100, B:106:0x0103, B:110:0x013e, B:114:0x014c, B:118:0x01c0, B:123:0x01e5, B:125:0x01ed, B:127:0x01f0, B:132:0x023a, B:134:0x023d, B:137:0x0260, B:141:0x0250, B:143:0x02ad, B:145:0x02b0, B:149:0x02ce, B:151:0x02d1, B:156:0x0310, B:158:0x0313, B:161:0x00ee), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0309 A[Catch: all -> 0x036e, CancellationException -> 0x0371, TryCatch #2 {CancellationException -> 0x0371, all -> 0x036e, blocks: (B:8:0x001e, B:10:0x012d, B:12:0x0135, B:14:0x0138, B:16:0x034a, B:18:0x0354, B:20:0x0360, B:28:0x008b, B:32:0x004f, B:34:0x0176, B:36:0x017a, B:38:0x0180, B:39:0x018c, B:46:0x01af, B:47:0x01bd, B:50:0x0067, B:52:0x0228, B:54:0x0230, B:56:0x0233, B:58:0x0078, B:60:0x029b, B:62:0x02a3, B:64:0x02a6, B:67:0x0098, B:69:0x02fe, B:71:0x0306, B:73:0x0309, B:75:0x00a9, B:77:0x033a, B:79:0x0342, B:81:0x0345, B:83:0x00b9, B:85:0x00bf, B:87:0x00c2, B:90:0x00d1, B:94:0x00db, B:96:0x00e6, B:101:0x00fb, B:104:0x0100, B:106:0x0103, B:110:0x013e, B:114:0x014c, B:118:0x01c0, B:123:0x01e5, B:125:0x01ed, B:127:0x01f0, B:132:0x023a, B:134:0x023d, B:137:0x0260, B:141:0x0250, B:143:0x02ad, B:145:0x02b0, B:149:0x02ce, B:151:0x02d1, B:156:0x0310, B:158:0x0313, B:161:0x00ee), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0342 A[Catch: all -> 0x036e, CancellationException -> 0x0371, TryCatch #2 {CancellationException -> 0x0371, all -> 0x036e, blocks: (B:8:0x001e, B:10:0x012d, B:12:0x0135, B:14:0x0138, B:16:0x034a, B:18:0x0354, B:20:0x0360, B:28:0x008b, B:32:0x004f, B:34:0x0176, B:36:0x017a, B:38:0x0180, B:39:0x018c, B:46:0x01af, B:47:0x01bd, B:50:0x0067, B:52:0x0228, B:54:0x0230, B:56:0x0233, B:58:0x0078, B:60:0x029b, B:62:0x02a3, B:64:0x02a6, B:67:0x0098, B:69:0x02fe, B:71:0x0306, B:73:0x0309, B:75:0x00a9, B:77:0x033a, B:79:0x0342, B:81:0x0345, B:83:0x00b9, B:85:0x00bf, B:87:0x00c2, B:90:0x00d1, B:94:0x00db, B:96:0x00e6, B:101:0x00fb, B:104:0x0100, B:106:0x0103, B:110:0x013e, B:114:0x014c, B:118:0x01c0, B:123:0x01e5, B:125:0x01ed, B:127:0x01f0, B:132:0x023a, B:134:0x023d, B:137:0x0260, B:141:0x0250, B:143:0x02ad, B:145:0x02b0, B:149:0x02ce, B:151:0x02d1, B:156:0x0310, B:158:0x0313, B:161:0x00ee), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0345 A[Catch: all -> 0x036e, CancellationException -> 0x0371, TryCatch #2 {CancellationException -> 0x0371, all -> 0x036e, blocks: (B:8:0x001e, B:10:0x012d, B:12:0x0135, B:14:0x0138, B:16:0x034a, B:18:0x0354, B:20:0x0360, B:28:0x008b, B:32:0x004f, B:34:0x0176, B:36:0x017a, B:38:0x0180, B:39:0x018c, B:46:0x01af, B:47:0x01bd, B:50:0x0067, B:52:0x0228, B:54:0x0230, B:56:0x0233, B:58:0x0078, B:60:0x029b, B:62:0x02a3, B:64:0x02a6, B:67:0x0098, B:69:0x02fe, B:71:0x0306, B:73:0x0309, B:75:0x00a9, B:77:0x033a, B:79:0x0342, B:81:0x0345, B:83:0x00b9, B:85:0x00bf, B:87:0x00c2, B:90:0x00d1, B:94:0x00db, B:96:0x00e6, B:101:0x00fb, B:104:0x0100, B:106:0x0103, B:110:0x013e, B:114:0x014c, B:118:0x01c0, B:123:0x01e5, B:125:0x01ed, B:127:0x01f0, B:132:0x023a, B:134:0x023d, B:137:0x0260, B:141:0x0250, B:143:0x02ad, B:145:0x02b0, B:149:0x02ce, B:151:0x02d1, B:156:0x0310, B:158:0x0313, B:161:0x00ee), top: B:2:0x000d }] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NotificationData notificationData;
        efd efdVar;
        NotificationManager notificationManager;
        Object t;
        efd efdVar2;
        vuh vuhVar;
        Object t2;
        vuh vuhVar2;
        Object t3;
        vuh vuhVar3;
        Object t4;
        vuh vuhVar4;
        int forTeam;
        Object t5;
        int i;
        int i2;
        int i3;
        vuh vuhVar5;
        int i4;
        Object t6;
        vuh vuhVar6;
        NotificationManager notificationManager2;
        efd efdVar3;
        NotificationData notificationData2;
        Bitmap bitmap;
        lu3 lu3Var = lu3.a;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        switch (this.A) {
            case 0:
                y6a.M(obj);
                notificationData = this.C;
                efdVar = this.D;
                if (notificationData.getOpen() == null) {
                    return Unit.a;
                }
                efdVar.e(8, true);
                String imageUrl = notificationData.getImageUrl();
                notificationManager = this.E;
                vuh vuhVar7 = this.F;
                if (imageUrl != null) {
                    if (imageUrl.length() <= 0) {
                        imageUrl = null;
                    }
                    if (imageUrl != null) {
                        efdVar.f(inb.w(vuhVar7.b, imageUrl));
                        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                        activeNotifications.getClass();
                        for (StatusBarNotification statusBarNotification : activeNotifications) {
                            if (statusBarNotification.getId() == notificationData.getGroupKey()) {
                                notificationManager.notify(notificationData.getGroupKey(), efdVar.b());
                            }
                        }
                        return Unit.a;
                    }
                }
                NotificationOpen open = notificationData.getOpen();
                int i5 = open == null ? -1 : tuh.a[open.ordinal()];
                int i6 = this.G;
                switch (i5) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        if (i6 > 1) {
                            return Unit.a;
                        }
                        Context context = vuhVar7.b;
                        String R = pco.R(notificationData.getId());
                        this.B = null;
                        this.r = notificationData;
                        this.s = efdVar;
                        this.t = notificationManager;
                        this.u = vuhVar7;
                        this.v = 0;
                        this.w = 0;
                        this.x = 0;
                        this.y = 0;
                        this.A = 1;
                        t = inb.t(context, R, null, this);
                        if (t != lu3Var) {
                            efdVar2 = efdVar;
                            vuhVar = vuhVar7;
                            Bitmap bitmap2 = (Bitmap) t;
                            if (vuhVar.b(efdVar2, notificationData) <= 1) {
                                return Unit.a;
                            }
                            efdVar2.f(bitmap2);
                            efdVar = efdVar2;
                            StatusBarNotification[] activeNotifications2 = notificationManager.getActiveNotifications();
                            activeNotifications2.getClass();
                            while (r3 < r1) {
                            }
                            return Unit.a;
                        }
                        return lu3Var;
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        if (i6 > 1) {
                            return Unit.a;
                        }
                        Context context2 = vuhVar7.b;
                        String M = pco.M(notificationData.getId());
                        urh urhVar = new urh();
                        this.B = null;
                        this.r = notificationData;
                        this.s = efdVar;
                        this.t = notificationManager;
                        this.u = vuhVar7;
                        this.v = 0;
                        this.w = 0;
                        this.x = 0;
                        this.y = 0;
                        this.A = 2;
                        t2 = inb.t(context2, M, urhVar, this);
                        if (t2 == lu3Var) {
                            return lu3Var;
                        }
                        efdVar2 = efdVar;
                        vuhVar2 = vuhVar7;
                        Bitmap bitmap3 = (Bitmap) t2;
                        if (vuhVar2.b(efdVar2, notificationData) <= 1) {
                            return Unit.a;
                        }
                        efdVar2.f(bitmap3);
                        efdVar = efdVar2;
                        StatusBarNotification[] activeNotifications22 = notificationManager.getActiveNotifications();
                        activeNotifications22.getClass();
                        while (r3 < r1) {
                        }
                        return Unit.a;
                    case 15:
                        if (i6 > 1) {
                            return Unit.a;
                        }
                        this.B = null;
                        this.r = notificationData;
                        this.s = efdVar;
                        this.t = notificationManager;
                        this.u = null;
                        this.v = 0;
                        this.w = 0;
                        this.x = 0;
                        this.y = 0;
                        this.A = 3;
                        if (vuhVar7.a(efdVar, notificationData, this) == lu3Var) {
                            return lu3Var;
                        }
                        notificationData2 = notificationData;
                        efdVar3 = efdVar;
                        notificationManager2 = notificationManager;
                        notificationManager = notificationManager2;
                        efdVar = efdVar3;
                        notificationData = notificationData2;
                        StatusBarNotification[] activeNotifications222 = notificationManager.getActiveNotifications();
                        activeNotifications222.getClass();
                        while (r3 < r1) {
                        }
                        return Unit.a;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        if (i6 > 1) {
                            return Unit.a;
                        }
                        Context context3 = vuhVar7.b;
                        String str = (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : "https://" + uaa.c).concat("api/v1/") + "category/" + notificationData.getCategoryId() + "/image";
                        this.B = null;
                        this.r = notificationData;
                        this.s = efdVar;
                        this.t = notificationManager;
                        this.u = vuhVar7;
                        this.v = 0;
                        this.w = 0;
                        this.x = 0;
                        this.y = 0;
                        this.A = 4;
                        t3 = inb.t(context3, str, null, this);
                        if (t3 == lu3Var) {
                            return lu3Var;
                        }
                        efdVar2 = efdVar;
                        vuhVar3 = vuhVar7;
                        Bitmap bitmap4 = (Bitmap) t3;
                        if (vuhVar3.b(efdVar2, notificationData) <= 1) {
                            return Unit.a;
                        }
                        efdVar2.f(bitmap4);
                        efdVar = efdVar2;
                        StatusBarNotification[] activeNotifications2222 = notificationManager.getActiveNotifications();
                        activeNotifications2222.getClass();
                        while (r3 < r1) {
                        }
                        return Unit.a;
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                        if (i6 > 1) {
                            return Unit.a;
                        }
                        Context context4 = vuhVar7.b;
                        String I = pco.I(notificationData.getId(), new Integer(notificationData.getUniqueId()), hkg.b0(vuhVar7.b));
                        this.B = null;
                        this.r = notificationData;
                        this.s = efdVar;
                        this.t = notificationManager;
                        this.u = vuhVar7;
                        this.v = 0;
                        this.w = 0;
                        this.x = 0;
                        this.y = 0;
                        this.A = 5;
                        t4 = inb.t(context4, I, null, this);
                        if (t4 == lu3Var) {
                            return lu3Var;
                        }
                        efdVar2 = efdVar;
                        vuhVar4 = vuhVar7;
                        Bitmap bitmap5 = (Bitmap) t4;
                        if (vuhVar4.b(efdVar2, notificationData) <= 1) {
                            return Unit.a;
                        }
                        efdVar2.f(bitmap5);
                        efdVar = efdVar2;
                        StatusBarNotification[] activeNotifications22222 = notificationManager.getActiveNotifications();
                        activeNotifications22222.getClass();
                        while (r3 < r1) {
                        }
                        return Unit.a;
                    case 34:
                    case 35:
                    case 36:
                        forTeam = notificationData.getForTeam();
                        if (notificationData.getPlayerId() != 0 || forTeam == 0 || i6 != 1) {
                            this.B = null;
                            this.r = notificationData;
                            this.s = efdVar;
                            this.t = notificationManager;
                            this.u = null;
                            this.v = 0;
                            this.w = 0;
                            this.x = 0;
                            this.y = 0;
                            this.z = forTeam;
                            this.A = 8;
                            vuhVar7.getClass();
                            Object r = s9a.r(new eqe(notificationData, vuhVar7, efdVar, null), this);
                            if (r != lu3Var) {
                                r = Unit.a;
                            }
                            if (r == lu3Var) {
                            }
                            notificationData2 = notificationData;
                            efdVar3 = efdVar;
                            notificationManager2 = notificationManager;
                            notificationManager = notificationManager2;
                            efdVar = efdVar3;
                            notificationData = notificationData2;
                            StatusBarNotification[] activeNotifications222222 = notificationManager.getActiveNotifications();
                            activeNotifications222222.getClass();
                            while (r3 < r1) {
                            }
                            return Unit.a;
                        }
                        Context context5 = vuhVar7.b;
                        String R2 = pco.R(forTeam);
                        this.B = null;
                        this.r = notificationData;
                        this.s = efdVar;
                        this.t = notificationManager;
                        this.u = vuhVar7;
                        this.v = 0;
                        this.w = 0;
                        this.x = 0;
                        this.y = 0;
                        this.z = forTeam;
                        this.A = 6;
                        t5 = inb.t(context5, R2, null, this);
                        if (t5 != lu3Var) {
                            i = 0;
                            i2 = 0;
                            i3 = 0;
                            vuhVar5 = vuhVar7;
                            i4 = 0;
                            bitmap = (Bitmap) t5;
                            if (bitmap != null) {
                                return Unit.a;
                            }
                            if (vuhVar5.b(efdVar, notificationData) == 1) {
                                efdVar.f(bitmap);
                                o02.K(vuhVar5.b(efdVar, notificationData));
                                StatusBarNotification[] activeNotifications2222222 = notificationManager.getActiveNotifications();
                                activeNotifications2222222.getClass();
                                while (r3 < r1) {
                                }
                                return Unit.a;
                            }
                            this.B = null;
                            this.r = notificationData;
                            this.s = efdVar;
                            this.t = notificationManager;
                            this.u = null;
                            this.v = i3;
                            this.w = i2;
                            this.x = i;
                            this.y = i4;
                            this.z = forTeam;
                            this.A = 7;
                            Object r2 = s9a.r(new eqe(notificationData, vuhVar5, efdVar, null), this);
                            if (r2 != lu3Var) {
                                r2 = Unit.a;
                            }
                            if (r2 == lu3Var) {
                            }
                            notificationData2 = notificationData;
                            efdVar3 = efdVar;
                            notificationManager2 = notificationManager;
                            notificationManager = notificationManager2;
                            efdVar = efdVar3;
                            notificationData = notificationData2;
                            StatusBarNotification[] activeNotifications22222222 = notificationManager.getActiveNotifications();
                            activeNotifications22222222.getClass();
                            while (r3 < r1) {
                            }
                            return Unit.a;
                        }
                        return lu3Var;
                    case 37:
                        if (i6 > 1) {
                            return Unit.a;
                        }
                        Context context6 = vuhVar7.b;
                        String K = pco.K(notificationData.getId());
                        this.B = null;
                        this.r = notificationData;
                        this.s = efdVar;
                        this.t = notificationManager;
                        this.u = vuhVar7;
                        this.v = 0;
                        this.w = 0;
                        this.x = 0;
                        this.y = 0;
                        this.A = 9;
                        t6 = inb.t(context6, K, null, this);
                        if (t6 == lu3Var) {
                            return lu3Var;
                        }
                        efdVar2 = efdVar;
                        vuhVar6 = vuhVar7;
                        Bitmap bitmap6 = (Bitmap) t6;
                        if (vuhVar6.b(efdVar2, notificationData) <= 1) {
                            return Unit.a;
                        }
                        efdVar2.f(bitmap6);
                        efdVar = efdVar2;
                        StatusBarNotification[] activeNotifications222222222 = notificationManager.getActiveNotifications();
                        activeNotifications222222222.getClass();
                        while (r3 < r1) {
                        }
                        return Unit.a;
                    default:
                        return Unit.a;
                }
            case 1:
                vuhVar = this.u;
                NotificationManager notificationManager3 = this.t;
                efdVar2 = this.s;
                NotificationData notificationData3 = this.r;
                y6a.M(obj);
                notificationManager = notificationManager3;
                notificationData = notificationData3;
                t = obj;
                Bitmap bitmap22 = (Bitmap) t;
                if (vuhVar.b(efdVar2, notificationData) <= 1) {
                }
                break;
            case 2:
                vuhVar2 = this.u;
                NotificationManager notificationManager4 = this.t;
                efdVar2 = this.s;
                NotificationData notificationData4 = this.r;
                y6a.M(obj);
                notificationManager = notificationManager4;
                notificationData = notificationData4;
                t2 = obj;
                Bitmap bitmap32 = (Bitmap) t2;
                if (vuhVar2.b(efdVar2, notificationData) <= 1) {
                }
                break;
            case 3:
                notificationManager2 = this.t;
                efdVar3 = this.s;
                notificationData2 = this.r;
                y6a.M(obj);
                notificationManager = notificationManager2;
                efdVar = efdVar3;
                notificationData = notificationData2;
                StatusBarNotification[] activeNotifications2222222222 = notificationManager.getActiveNotifications();
                activeNotifications2222222222.getClass();
                while (r3 < r1) {
                }
                return Unit.a;
            case 4:
                vuhVar3 = this.u;
                NotificationManager notificationManager5 = this.t;
                efdVar2 = this.s;
                NotificationData notificationData5 = this.r;
                y6a.M(obj);
                notificationManager = notificationManager5;
                notificationData = notificationData5;
                t3 = obj;
                Bitmap bitmap42 = (Bitmap) t3;
                if (vuhVar3.b(efdVar2, notificationData) <= 1) {
                }
                break;
            case 5:
                vuhVar4 = this.u;
                NotificationManager notificationManager6 = this.t;
                efdVar2 = this.s;
                NotificationData notificationData6 = this.r;
                y6a.M(obj);
                notificationManager = notificationManager6;
                notificationData = notificationData6;
                t4 = obj;
                Bitmap bitmap52 = (Bitmap) t4;
                if (vuhVar4.b(efdVar2, notificationData) <= 1) {
                }
                break;
            case 6:
                int i7 = this.z;
                int i8 = this.y;
                int i9 = this.x;
                int i10 = this.w;
                int i11 = this.v;
                vuh vuhVar8 = this.u;
                NotificationManager notificationManager7 = this.t;
                efd efdVar4 = this.s;
                NotificationData notificationData7 = this.r;
                y6a.M(obj);
                vuhVar5 = vuhVar8;
                i4 = i8;
                efdVar = efdVar4;
                i2 = i10;
                forTeam = i7;
                notificationData = notificationData7;
                i3 = i11;
                notificationManager = notificationManager7;
                i = i9;
                t5 = obj;
                bitmap = (Bitmap) t5;
                if (bitmap != null) {
                }
                break;
            case 7:
                notificationManager2 = this.t;
                efdVar3 = this.s;
                notificationData2 = this.r;
                y6a.M(obj);
                notificationManager = notificationManager2;
                efdVar = efdVar3;
                notificationData = notificationData2;
                StatusBarNotification[] activeNotifications22222222222 = notificationManager.getActiveNotifications();
                activeNotifications22222222222.getClass();
                while (r3 < r1) {
                }
                return Unit.a;
            case 8:
                notificationManager2 = this.t;
                efdVar3 = this.s;
                notificationData2 = this.r;
                y6a.M(obj);
                notificationManager = notificationManager2;
                efdVar = efdVar3;
                notificationData = notificationData2;
                StatusBarNotification[] activeNotifications222222222222 = notificationManager.getActiveNotifications();
                activeNotifications222222222222.getClass();
                while (r3 < r1) {
                }
                return Unit.a;
            case 9:
                vuhVar6 = this.u;
                NotificationManager notificationManager8 = this.t;
                efdVar2 = this.s;
                NotificationData notificationData8 = this.r;
                y6a.M(obj);
                notificationManager = notificationManager8;
                notificationData = notificationData8;
                t6 = obj;
                Bitmap bitmap62 = (Bitmap) t6;
                if (vuhVar6.b(efdVar2, notificationData) <= 1) {
                }
                break;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
