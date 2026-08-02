package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpw;
import com.google.android.gms.internal.measurement.zzqr;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes8.dex */
final class zzgr implements Callable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgw zzc;

    zzgr(zzgw zzgwVar, zzaw zzawVar, String str) {
        this.zzc = zzgwVar;
        this.zza = zzawVar;
        this.zzb = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0378 A[Catch: all -> 0x0624, LOOP:2: B:111:0x0372->B:113:0x0378, LOOP_END, TryCatch #0 {all -> 0x0624, blocks: (B:14:0x007c, B:16:0x0088, B:19:0x00a3, B:21:0x00a9, B:24:0x00c4, B:26:0x00db, B:27:0x00e2, B:29:0x00ec, B:30:0x00f9, B:32:0x0103, B:33:0x0110, B:35:0x011b, B:36:0x0123, B:38:0x013f, B:39:0x014c, B:41:0x015d, B:42:0x0164, B:44:0x0179, B:46:0x0189, B:48:0x0191, B:50:0x0197, B:51:0x019a, B:53:0x01a9, B:55:0x01af, B:57:0x01c3, B:60:0x01cd, B:61:0x01de, B:63:0x01e2, B:66:0x01ef, B:70:0x020f, B:72:0x0246, B:74:0x024e, B:76:0x0254, B:78:0x026b, B:80:0x0275, B:81:0x0282, B:82:0x0294, B:84:0x029a, B:90:0x02b0, B:94:0x02e2, B:96:0x0305, B:98:0x0312, B:100:0x031e, B:101:0x0331, B:103:0x0337, B:107:0x0347, B:108:0x034d, B:110:0x036b, B:111:0x0372, B:113:0x0378, B:115:0x03ae, B:117:0x0411, B:118:0x0429, B:120:0x0437, B:121:0x047e, B:122:0x04b5, B:124:0x04bb, B:127:0x04ce, B:132:0x04db, B:134:0x0525, B:135:0x0533, B:137:0x053b, B:138:0x053e, B:140:0x0546, B:141:0x054f, B:144:0x0566, B:145:0x0569, B:147:0x05a8, B:148:0x05b1, B:158:0x054c, B:159:0x046e, B:160:0x02b7, B:165:0x0609, B:167:0x0143, B:169:0x0149), top: B:13:0x007c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0411 A[Catch: all -> 0x0624, TryCatch #0 {all -> 0x0624, blocks: (B:14:0x007c, B:16:0x0088, B:19:0x00a3, B:21:0x00a9, B:24:0x00c4, B:26:0x00db, B:27:0x00e2, B:29:0x00ec, B:30:0x00f9, B:32:0x0103, B:33:0x0110, B:35:0x011b, B:36:0x0123, B:38:0x013f, B:39:0x014c, B:41:0x015d, B:42:0x0164, B:44:0x0179, B:46:0x0189, B:48:0x0191, B:50:0x0197, B:51:0x019a, B:53:0x01a9, B:55:0x01af, B:57:0x01c3, B:60:0x01cd, B:61:0x01de, B:63:0x01e2, B:66:0x01ef, B:70:0x020f, B:72:0x0246, B:74:0x024e, B:76:0x0254, B:78:0x026b, B:80:0x0275, B:81:0x0282, B:82:0x0294, B:84:0x029a, B:90:0x02b0, B:94:0x02e2, B:96:0x0305, B:98:0x0312, B:100:0x031e, B:101:0x0331, B:103:0x0337, B:107:0x0347, B:108:0x034d, B:110:0x036b, B:111:0x0372, B:113:0x0378, B:115:0x03ae, B:117:0x0411, B:118:0x0429, B:120:0x0437, B:121:0x047e, B:122:0x04b5, B:124:0x04bb, B:127:0x04ce, B:132:0x04db, B:134:0x0525, B:135:0x0533, B:137:0x053b, B:138:0x053e, B:140:0x0546, B:141:0x054f, B:144:0x0566, B:145:0x0569, B:147:0x05a8, B:148:0x05b1, B:158:0x054c, B:159:0x046e, B:160:0x02b7, B:165:0x0609, B:167:0x0143, B:169:0x0149), top: B:13:0x007c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0437 A[Catch: all -> 0x0624, TryCatch #0 {all -> 0x0624, blocks: (B:14:0x007c, B:16:0x0088, B:19:0x00a3, B:21:0x00a9, B:24:0x00c4, B:26:0x00db, B:27:0x00e2, B:29:0x00ec, B:30:0x00f9, B:32:0x0103, B:33:0x0110, B:35:0x011b, B:36:0x0123, B:38:0x013f, B:39:0x014c, B:41:0x015d, B:42:0x0164, B:44:0x0179, B:46:0x0189, B:48:0x0191, B:50:0x0197, B:51:0x019a, B:53:0x01a9, B:55:0x01af, B:57:0x01c3, B:60:0x01cd, B:61:0x01de, B:63:0x01e2, B:66:0x01ef, B:70:0x020f, B:72:0x0246, B:74:0x024e, B:76:0x0254, B:78:0x026b, B:80:0x0275, B:81:0x0282, B:82:0x0294, B:84:0x029a, B:90:0x02b0, B:94:0x02e2, B:96:0x0305, B:98:0x0312, B:100:0x031e, B:101:0x0331, B:103:0x0337, B:107:0x0347, B:108:0x034d, B:110:0x036b, B:111:0x0372, B:113:0x0378, B:115:0x03ae, B:117:0x0411, B:118:0x0429, B:120:0x0437, B:121:0x047e, B:122:0x04b5, B:124:0x04bb, B:127:0x04ce, B:132:0x04db, B:134:0x0525, B:135:0x0533, B:137:0x053b, B:138:0x053e, B:140:0x0546, B:141:0x054f, B:144:0x0566, B:145:0x0569, B:147:0x05a8, B:148:0x05b1, B:158:0x054c, B:159:0x046e, B:160:0x02b7, B:165:0x0609, B:167:0x0143, B:169:0x0149), top: B:13:0x007c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04bb A[Catch: all -> 0x0624, TryCatch #0 {all -> 0x0624, blocks: (B:14:0x007c, B:16:0x0088, B:19:0x00a3, B:21:0x00a9, B:24:0x00c4, B:26:0x00db, B:27:0x00e2, B:29:0x00ec, B:30:0x00f9, B:32:0x0103, B:33:0x0110, B:35:0x011b, B:36:0x0123, B:38:0x013f, B:39:0x014c, B:41:0x015d, B:42:0x0164, B:44:0x0179, B:46:0x0189, B:48:0x0191, B:50:0x0197, B:51:0x019a, B:53:0x01a9, B:55:0x01af, B:57:0x01c3, B:60:0x01cd, B:61:0x01de, B:63:0x01e2, B:66:0x01ef, B:70:0x020f, B:72:0x0246, B:74:0x024e, B:76:0x0254, B:78:0x026b, B:80:0x0275, B:81:0x0282, B:82:0x0294, B:84:0x029a, B:90:0x02b0, B:94:0x02e2, B:96:0x0305, B:98:0x0312, B:100:0x031e, B:101:0x0331, B:103:0x0337, B:107:0x0347, B:108:0x034d, B:110:0x036b, B:111:0x0372, B:113:0x0378, B:115:0x03ae, B:117:0x0411, B:118:0x0429, B:120:0x0437, B:121:0x047e, B:122:0x04b5, B:124:0x04bb, B:127:0x04ce, B:132:0x04db, B:134:0x0525, B:135:0x0533, B:137:0x053b, B:138:0x053e, B:140:0x0546, B:141:0x054f, B:144:0x0566, B:145:0x0569, B:147:0x05a8, B:148:0x05b1, B:158:0x054c, B:159:0x046e, B:160:0x02b7, B:165:0x0609, B:167:0x0143, B:169:0x0149), top: B:13:0x007c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0525 A[Catch: all -> 0x0624, TryCatch #0 {all -> 0x0624, blocks: (B:14:0x007c, B:16:0x0088, B:19:0x00a3, B:21:0x00a9, B:24:0x00c4, B:26:0x00db, B:27:0x00e2, B:29:0x00ec, B:30:0x00f9, B:32:0x0103, B:33:0x0110, B:35:0x011b, B:36:0x0123, B:38:0x013f, B:39:0x014c, B:41:0x015d, B:42:0x0164, B:44:0x0179, B:46:0x0189, B:48:0x0191, B:50:0x0197, B:51:0x019a, B:53:0x01a9, B:55:0x01af, B:57:0x01c3, B:60:0x01cd, B:61:0x01de, B:63:0x01e2, B:66:0x01ef, B:70:0x020f, B:72:0x0246, B:74:0x024e, B:76:0x0254, B:78:0x026b, B:80:0x0275, B:81:0x0282, B:82:0x0294, B:84:0x029a, B:90:0x02b0, B:94:0x02e2, B:96:0x0305, B:98:0x0312, B:100:0x031e, B:101:0x0331, B:103:0x0337, B:107:0x0347, B:108:0x034d, B:110:0x036b, B:111:0x0372, B:113:0x0378, B:115:0x03ae, B:117:0x0411, B:118:0x0429, B:120:0x0437, B:121:0x047e, B:122:0x04b5, B:124:0x04bb, B:127:0x04ce, B:132:0x04db, B:134:0x0525, B:135:0x0533, B:137:0x053b, B:138:0x053e, B:140:0x0546, B:141:0x054f, B:144:0x0566, B:145:0x0569, B:147:0x05a8, B:148:0x05b1, B:158:0x054c, B:159:0x046e, B:160:0x02b7, B:165:0x0609, B:167:0x0143, B:169:0x0149), top: B:13:0x007c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x053b A[Catch: all -> 0x0624, TryCatch #0 {all -> 0x0624, blocks: (B:14:0x007c, B:16:0x0088, B:19:0x00a3, B:21:0x00a9, B:24:0x00c4, B:26:0x00db, B:27:0x00e2, B:29:0x00ec, B:30:0x00f9, B:32:0x0103, B:33:0x0110, B:35:0x011b, B:36:0x0123, B:38:0x013f, B:39:0x014c, B:41:0x015d, B:42:0x0164, B:44:0x0179, B:46:0x0189, B:48:0x0191, B:50:0x0197, B:51:0x019a, B:53:0x01a9, B:55:0x01af, B:57:0x01c3, B:60:0x01cd, B:61:0x01de, B:63:0x01e2, B:66:0x01ef, B:70:0x020f, B:72:0x0246, B:74:0x024e, B:76:0x0254, B:78:0x026b, B:80:0x0275, B:81:0x0282, B:82:0x0294, B:84:0x029a, B:90:0x02b0, B:94:0x02e2, B:96:0x0305, B:98:0x0312, B:100:0x031e, B:101:0x0331, B:103:0x0337, B:107:0x0347, B:108:0x034d, B:110:0x036b, B:111:0x0372, B:113:0x0378, B:115:0x03ae, B:117:0x0411, B:118:0x0429, B:120:0x0437, B:121:0x047e, B:122:0x04b5, B:124:0x04bb, B:127:0x04ce, B:132:0x04db, B:134:0x0525, B:135:0x0533, B:137:0x053b, B:138:0x053e, B:140:0x0546, B:141:0x054f, B:144:0x0566, B:145:0x0569, B:147:0x05a8, B:148:0x05b1, B:158:0x054c, B:159:0x046e, B:160:0x02b7, B:165:0x0609, B:167:0x0143, B:169:0x0149), top: B:13:0x007c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0546 A[Catch: all -> 0x0624, TryCatch #0 {all -> 0x0624, blocks: (B:14:0x007c, B:16:0x0088, B:19:0x00a3, B:21:0x00a9, B:24:0x00c4, B:26:0x00db, B:27:0x00e2, B:29:0x00ec, B:30:0x00f9, B:32:0x0103, B:33:0x0110, B:35:0x011b, B:36:0x0123, B:38:0x013f, B:39:0x014c, B:41:0x015d, B:42:0x0164, B:44:0x0179, B:46:0x0189, B:48:0x0191, B:50:0x0197, B:51:0x019a, B:53:0x01a9, B:55:0x01af, B:57:0x01c3, B:60:0x01cd, B:61:0x01de, B:63:0x01e2, B:66:0x01ef, B:70:0x020f, B:72:0x0246, B:74:0x024e, B:76:0x0254, B:78:0x026b, B:80:0x0275, B:81:0x0282, B:82:0x0294, B:84:0x029a, B:90:0x02b0, B:94:0x02e2, B:96:0x0305, B:98:0x0312, B:100:0x031e, B:101:0x0331, B:103:0x0337, B:107:0x0347, B:108:0x034d, B:110:0x036b, B:111:0x0372, B:113:0x0378, B:115:0x03ae, B:117:0x0411, B:118:0x0429, B:120:0x0437, B:121:0x047e, B:122:0x04b5, B:124:0x04bb, B:127:0x04ce, B:132:0x04db, B:134:0x0525, B:135:0x0533, B:137:0x053b, B:138:0x053e, B:140:0x0546, B:141:0x054f, B:144:0x0566, B:145:0x0569, B:147:0x05a8, B:148:0x05b1, B:158:0x054c, B:159:0x046e, B:160:0x02b7, B:165:0x0609, B:167:0x0143, B:169:0x0149), top: B:13:0x007c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05a8 A[Catch: all -> 0x0624, TryCatch #0 {all -> 0x0624, blocks: (B:14:0x007c, B:16:0x0088, B:19:0x00a3, B:21:0x00a9, B:24:0x00c4, B:26:0x00db, B:27:0x00e2, B:29:0x00ec, B:30:0x00f9, B:32:0x0103, B:33:0x0110, B:35:0x011b, B:36:0x0123, B:38:0x013f, B:39:0x014c, B:41:0x015d, B:42:0x0164, B:44:0x0179, B:46:0x0189, B:48:0x0191, B:50:0x0197, B:51:0x019a, B:53:0x01a9, B:55:0x01af, B:57:0x01c3, B:60:0x01cd, B:61:0x01de, B:63:0x01e2, B:66:0x01ef, B:70:0x020f, B:72:0x0246, B:74:0x024e, B:76:0x0254, B:78:0x026b, B:80:0x0275, B:81:0x0282, B:82:0x0294, B:84:0x029a, B:90:0x02b0, B:94:0x02e2, B:96:0x0305, B:98:0x0312, B:100:0x031e, B:101:0x0331, B:103:0x0337, B:107:0x0347, B:108:0x034d, B:110:0x036b, B:111:0x0372, B:113:0x0378, B:115:0x03ae, B:117:0x0411, B:118:0x0429, B:120:0x0437, B:121:0x047e, B:122:0x04b5, B:124:0x04bb, B:127:0x04ce, B:132:0x04db, B:134:0x0525, B:135:0x0533, B:137:0x053b, B:138:0x053e, B:140:0x0546, B:141:0x054f, B:144:0x0566, B:145:0x0569, B:147:0x05a8, B:148:0x05b1, B:158:0x054c, B:159:0x046e, B:160:0x02b7, B:165:0x0609, B:167:0x0143, B:169:0x0149), top: B:13:0x007c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x046e A[Catch: all -> 0x0624, TryCatch #0 {all -> 0x0624, blocks: (B:14:0x007c, B:16:0x0088, B:19:0x00a3, B:21:0x00a9, B:24:0x00c4, B:26:0x00db, B:27:0x00e2, B:29:0x00ec, B:30:0x00f9, B:32:0x0103, B:33:0x0110, B:35:0x011b, B:36:0x0123, B:38:0x013f, B:39:0x014c, B:41:0x015d, B:42:0x0164, B:44:0x0179, B:46:0x0189, B:48:0x0191, B:50:0x0197, B:51:0x019a, B:53:0x01a9, B:55:0x01af, B:57:0x01c3, B:60:0x01cd, B:61:0x01de, B:63:0x01e2, B:66:0x01ef, B:70:0x020f, B:72:0x0246, B:74:0x024e, B:76:0x0254, B:78:0x026b, B:80:0x0275, B:81:0x0282, B:82:0x0294, B:84:0x029a, B:90:0x02b0, B:94:0x02e2, B:96:0x0305, B:98:0x0312, B:100:0x031e, B:101:0x0331, B:103:0x0337, B:107:0x0347, B:108:0x034d, B:110:0x036b, B:111:0x0372, B:113:0x0378, B:115:0x03ae, B:117:0x0411, B:118:0x0429, B:120:0x0437, B:121:0x047e, B:122:0x04b5, B:124:0x04bb, B:127:0x04ce, B:132:0x04db, B:134:0x0525, B:135:0x0533, B:137:0x053b, B:138:0x053e, B:140:0x0546, B:141:0x054f, B:144:0x0566, B:145:0x0569, B:147:0x05a8, B:148:0x05b1, B:158:0x054c, B:159:0x046e, B:160:0x02b7, B:165:0x0609, B:167:0x0143, B:169:0x0149), top: B:13:0x007c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0305 A[Catch: all -> 0x0624, TryCatch #0 {all -> 0x0624, blocks: (B:14:0x007c, B:16:0x0088, B:19:0x00a3, B:21:0x00a9, B:24:0x00c4, B:26:0x00db, B:27:0x00e2, B:29:0x00ec, B:30:0x00f9, B:32:0x0103, B:33:0x0110, B:35:0x011b, B:36:0x0123, B:38:0x013f, B:39:0x014c, B:41:0x015d, B:42:0x0164, B:44:0x0179, B:46:0x0189, B:48:0x0191, B:50:0x0197, B:51:0x019a, B:53:0x01a9, B:55:0x01af, B:57:0x01c3, B:60:0x01cd, B:61:0x01de, B:63:0x01e2, B:66:0x01ef, B:70:0x020f, B:72:0x0246, B:74:0x024e, B:76:0x0254, B:78:0x026b, B:80:0x0275, B:81:0x0282, B:82:0x0294, B:84:0x029a, B:90:0x02b0, B:94:0x02e2, B:96:0x0305, B:98:0x0312, B:100:0x031e, B:101:0x0331, B:103:0x0337, B:107:0x0347, B:108:0x034d, B:110:0x036b, B:111:0x0372, B:113:0x0378, B:115:0x03ae, B:117:0x0411, B:118:0x0429, B:120:0x0437, B:121:0x047e, B:122:0x04b5, B:124:0x04bb, B:127:0x04ce, B:132:0x04db, B:134:0x0525, B:135:0x0533, B:137:0x053b, B:138:0x053e, B:140:0x0546, B:141:0x054f, B:144:0x0566, B:145:0x0569, B:147:0x05a8, B:148:0x05b1, B:158:0x054c, B:159:0x046e, B:160:0x02b7, B:165:0x0609, B:167:0x0143, B:169:0x0149), top: B:13:0x007c, inners: #1, #3 }] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzlg zzlgVar;
        zzlg zzlgVar2;
        byte[] bArr;
        zzlg zzlgVar3;
        zzll zzllVar;
        List list;
        zzli zzu;
        int i;
        zzas zzn;
        com.google.android.gms.internal.measurement.zzga zzgaVar;
        Bundle bundle;
        zzh zzhVar;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        zzas zzc;
        long j;
        com.google.android.gms.internal.measurement.zzgc zzgcVar2;
        com.google.android.gms.internal.measurement.zzfs zze;
        zzat zzatVar;
        long zzn2;
        long zzp;
        String zzC;
        zzlgVar = this.zzc.zza;
        zzlgVar.zzA();
        zzlgVar2 = this.zzc.zza;
        zzio zzr = zzlgVar2.zzr();
        zzaw zzawVar = this.zza;
        String str = this.zzb;
        zzr.zzg();
        zzge.zzO();
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotEmpty(str);
        if (!zzr.zzt.zzf().zzs(str, zzeh.zzU)) {
            zzr.zzt.zzaA().zzc().zzb("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(zzawVar.zza) && !"_iapx".equals(zzawVar.zza)) {
            zzr.zzt.zzaA().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str, zzawVar.zza);
            return null;
        }
        com.google.android.gms.internal.measurement.zzga zza = com.google.android.gms.internal.measurement.zzgb.zza();
        zzr.zzf.zzi().zzw();
        try {
            zzh zzj = zzr.zzf.zzi().zzj(str);
            if (zzj == null) {
                zzr.zzt.zzaA().zzc().zzb("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!zzj.zzal()) {
                zzr.zzt.zzaA().zzc().zzb("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            com.google.android.gms.internal.measurement.zzgc zzu2 = com.google.android.gms.internal.measurement.zzgd.zzu();
            zzu2.zzad(1);
            zzu2.zzZ("android");
            if (!TextUtils.isEmpty(zzj.zzu())) {
                zzu2.zzD(zzj.zzu());
            }
            if (!TextUtils.isEmpty(zzj.zzw())) {
                zzu2.zzF((String) Preconditions.checkNotNull(zzj.zzw()));
            }
            if (!TextUtils.isEmpty(zzj.zzx())) {
                zzu2.zzG((String) Preconditions.checkNotNull(zzj.zzx()));
            }
            if (zzj.zzb() != -2147483648L) {
                zzu2.zzH((int) zzj.zzb());
            }
            zzu2.zzV(zzj.zzm());
            zzu2.zzP(zzj.zzk());
            String zzz = zzj.zzz();
            String zzs = zzj.zzs();
            if (!TextUtils.isEmpty(zzz)) {
                zzu2.zzU(zzz);
            } else if (!TextUtils.isEmpty(zzs)) {
                zzu2.zzC(zzs);
            }
            zzpw.zzc();
            if (zzr.zzt.zzf().zzs(null, zzeh.zzaE)) {
                zzu2.zzaj(zzj.zzq());
            }
            zzai zzh = zzr.zzf.zzh(str);
            zzu2.zzM(zzj.zzj());
            if (zzr.zzt.zzJ() && zzr.zzt.zzf().zzt(zzu2.zzaq()) && zzh.zzi(zzah.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                zzu2.zzO(null);
            }
            zzu2.zzL(zzh.zzh());
            if (zzh.zzi(zzah.AD_STORAGE) && zzj.zzak()) {
                Pair zzd = zzr.zzf.zzs().zzd(zzj.zzu(), zzh);
                if (zzj.zzak() && !TextUtils.isEmpty((CharSequence) zzd.first)) {
                    try {
                        zzu2.zzae(zzio.zza((String) zzd.first, Long.toString(zzawVar.zzd)));
                        if (zzd.second != null) {
                            zzu2.zzX(((Boolean) zzd.second).booleanValue());
                        }
                    } catch (SecurityException e) {
                        zzr.zzt.zzaA().zzc().zzb("Resettable device id encryption failed", e.getMessage());
                        bArr = new byte[0];
                        zzlgVar3 = zzr.zzf;
                        zzlgVar3.zzi().zzx();
                        return bArr;
                    }
                }
            }
            zzr.zzt.zzg().zzv();
            zzu2.zzN(Build.MODEL);
            zzr.zzt.zzg().zzv();
            zzu2.zzY(Build.VERSION.RELEASE);
            zzu2.zzak((int) zzr.zzt.zzg().zzb());
            zzu2.zzao(zzr.zzt.zzg().zzc());
            try {
                if (zzh.zzi(zzah.ANALYTICS_STORAGE) && zzj.zzv() != null) {
                    zzu2.zzE(zzio.zza((String) Preconditions.checkNotNull(zzj.zzv()), Long.toString(zzawVar.zzd)));
                }
                if (!TextUtils.isEmpty(zzj.zzy())) {
                    zzu2.zzT((String) Preconditions.checkNotNull(zzj.zzy()));
                }
                String zzu3 = zzj.zzu();
                List zzu4 = zzr.zzf.zzi().zzu(zzu3);
                Iterator it = zzu4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzllVar = null;
                        break;
                    }
                    zzllVar = (zzll) it.next();
                    if ("_lte".equals(zzllVar.zzc)) {
                        break;
                    }
                }
                try {
                    if (zzllVar != null && zzllVar.zze != null) {
                        list = zzu4;
                        zzu = zzr.zzf.zzu();
                        zzu.zzt.zzaA().zzj().zza("Checking account type status for ad personalization signals");
                        if (zzu.zzt.zzg().zze()) {
                            String zzu5 = zzj.zzu();
                            Preconditions.checkNotNull(zzu5);
                            if (zzj.zzak() && zzu.zzf.zzo().zzn(zzu5)) {
                                zzu.zzt.zzaA().zzc().zza("Turning off ad personalization due to account type");
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    if ("_npa".equals(((zzll) it2.next()).zzc)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                list.add(new zzll(zzu5, "auto", "_npa", zzu.zzt.zzax().currentTimeMillis(), 1L));
                            }
                        }
                        com.google.android.gms.internal.measurement.zzgm[] zzgmVarArr = new com.google.android.gms.internal.measurement.zzgm[list.size()];
                        for (i = 0; i < list.size(); i++) {
                            com.google.android.gms.internal.measurement.zzgl zzd2 = com.google.android.gms.internal.measurement.zzgm.zzd();
                            zzd2.zzf(((zzll) list.get(i)).zzc);
                            zzd2.zzg(((zzll) list.get(i)).zzd);
                            zzr.zzf.zzu().zzu(zzd2, ((zzll) list.get(i)).zze);
                            zzgmVarArr[i] = (com.google.android.gms.internal.measurement.zzgm) zzd2.zzaD();
                        }
                        zzu2.zzj(Arrays.asList(zzgmVarArr));
                        zzev zzb = zzev.zzb(zzawVar);
                        zzr.zzt.zzv().zzL(zzb.zzd, zzr.zzf.zzi().zzi(str));
                        zzr.zzt.zzv().zzN(zzb, zzr.zzt.zzf().zzd(str));
                        Bundle bundle2 = zzb.zzd;
                        bundle2.putLong("_c", 1L);
                        zzr.zzt.zzaA().zzc().zza("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", zzawVar.zzc);
                        if (zzr.zzt.zzv().zzaf(zzu2.zzaq())) {
                            zzr.zzt.zzv().zzP(bundle2, "_dbg", 1L);
                            zzr.zzt.zzv().zzP(bundle2, "_r", 1L);
                        }
                        zzn = zzr.zzf.zzi().zzn(str, zzawVar.zza);
                        if (zzn != null) {
                            zzgcVar = zzu2;
                            bundle = bundle2;
                            zzc = new zzas(str, zzawVar.zza, 0L, 0L, 0L, zzawVar.zzd, 0L, null, null, null, null);
                            j = 0;
                            zzgaVar = zza;
                            zzhVar = zzj;
                        } else {
                            zzgaVar = zza;
                            bundle = bundle2;
                            zzhVar = zzj;
                            zzgcVar = zzu2;
                            long j2 = zzn.zzf;
                            zzc = zzn.zzc(zzawVar.zzd);
                            j = j2;
                        }
                        zzas zzasVar = zzc;
                        zzr.zzf.zzi().zzE(zzasVar);
                        zzgcVar2 = zzgcVar;
                        zzar zzarVar = new zzar(zzr.zzt, zzawVar.zzc, str, zzawVar.zza, zzawVar.zzd, j, bundle);
                        zze = com.google.android.gms.internal.measurement.zzft.zze();
                        zze.zzm(zzarVar.zzd);
                        zze.zzi(zzarVar.zzb);
                        zze.zzl(zzarVar.zze);
                        zzatVar = new zzat(zzarVar.zzf);
                        while (zzatVar.hasNext()) {
                            String next = zzatVar.next();
                            com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                            zze2.zzj(next);
                            Object zzf = zzarVar.zzf.zzf(next);
                            if (zzf != null) {
                                zzr.zzf.zzu().zzt(zze2, zzf);
                                zze.zze(zze2);
                            }
                        }
                        zzgcVar2.zzk(zze);
                        com.google.android.gms.internal.measurement.zzge zza2 = com.google.android.gms.internal.measurement.zzgg.zza();
                        com.google.android.gms.internal.measurement.zzfu zza3 = com.google.android.gms.internal.measurement.zzfv.zza();
                        zza3.zza(zzasVar.zzc);
                        zza3.zzb(zzawVar.zza);
                        zza2.zza(zza3);
                        zzgcVar2.zzaa(zza2);
                        zzgcVar2.zzf(zzr.zzf.zzf().zza(zzhVar.zzu(), Collections.emptyList(), zzgcVar2.zzau(), Long.valueOf(zze.zzc()), Long.valueOf(zze.zzc())));
                        if (zze.zzq()) {
                            zzgcVar2.zzai(zze.zzc());
                            zzgcVar2.zzQ(zze.zzc());
                        }
                        zzn2 = zzhVar.zzn();
                        if (zzn2 != 0) {
                            zzgcVar2.zzab(zzn2);
                        }
                        zzp = zzhVar.zzp();
                        if (zzp == 0) {
                            zzgcVar2.zzac(zzp);
                        } else if (zzn2 != 0) {
                            zzgcVar2.zzac(zzn2);
                        }
                        zzC = zzhVar.zzC();
                        zzqr.zzc();
                        if (zzr.zzt.zzf().zzs(str, zzeh.zzao) && zzC != null) {
                            zzgcVar2.zzah(zzC);
                        }
                        zzhVar.zzF();
                        zzgcVar2.zzI((int) zzhVar.zzo());
                        zzr.zzt.zzf().zzh();
                        zzgcVar2.zzam(77000L);
                        zzgcVar2.zzal(zzr.zzt.zzax().currentTimeMillis());
                        zzgcVar2.zzag(Boolean.TRUE.booleanValue());
                        if (zzr.zzt.zzf().zzs(null, zzeh.zzas)) {
                            zzr.zzf.zzC(zzgcVar2.zzaq(), zzgcVar2);
                        }
                        zzgaVar.zza(zzgcVar2);
                        zzhVar.zzac(zzgcVar2.zzd());
                        zzhVar.zzaa(zzgcVar2.zzc());
                        zzr.zzf.zzi().zzD(zzhVar);
                        zzr.zzf.zzi().zzC();
                        return zzr.zzf.zzu().zzy(((com.google.android.gms.internal.measurement.zzgb) zzgaVar.zzaD()).zzbx());
                    }
                    return zzr.zzf.zzu().zzy(((com.google.android.gms.internal.measurement.zzgb) zzgaVar.zzaD()).zzbx());
                } catch (IOException e2) {
                    zzr.zzt.zzaA().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzeu.zzn(str), e2);
                    return null;
                }
                list = zzu4;
                zzll zzllVar2 = new zzll(zzu3, "auto", "_lte", zzr.zzt.zzax().currentTimeMillis(), 0L);
                list.add(zzllVar2);
                zzr.zzf.zzi().zzL(zzllVar2);
                zzu = zzr.zzf.zzu();
                zzu.zzt.zzaA().zzj().zza("Checking account type status for ad personalization signals");
                if (zzu.zzt.zzg().zze()) {
                }
                com.google.android.gms.internal.measurement.zzgm[] zzgmVarArr2 = new com.google.android.gms.internal.measurement.zzgm[list.size()];
                while (i < list.size()) {
                }
                zzu2.zzj(Arrays.asList(zzgmVarArr2));
                zzev zzb2 = zzev.zzb(zzawVar);
                zzr.zzt.zzv().zzL(zzb2.zzd, zzr.zzf.zzi().zzi(str));
                zzr.zzt.zzv().zzN(zzb2, zzr.zzt.zzf().zzd(str));
                Bundle bundle22 = zzb2.zzd;
                bundle22.putLong("_c", 1L);
                zzr.zzt.zzaA().zzc().zza("Marking in-app purchase as real-time");
                bundle22.putLong("_r", 1L);
                bundle22.putString("_o", zzawVar.zzc);
                if (zzr.zzt.zzv().zzaf(zzu2.zzaq())) {
                }
                zzn = zzr.zzf.zzi().zzn(str, zzawVar.zza);
                if (zzn != null) {
                }
                zzas zzasVar2 = zzc;
                zzr.zzf.zzi().zzE(zzasVar2);
                zzgcVar2 = zzgcVar;
                zzar zzarVar2 = new zzar(zzr.zzt, zzawVar.zzc, str, zzawVar.zza, zzawVar.zzd, j, bundle);
                zze = com.google.android.gms.internal.measurement.zzft.zze();
                zze.zzm(zzarVar2.zzd);
                zze.zzi(zzarVar2.zzb);
                zze.zzl(zzarVar2.zze);
                zzatVar = new zzat(zzarVar2.zzf);
                while (zzatVar.hasNext()) {
                }
                zzgcVar2.zzk(zze);
                com.google.android.gms.internal.measurement.zzge zza22 = com.google.android.gms.internal.measurement.zzgg.zza();
                com.google.android.gms.internal.measurement.zzfu zza32 = com.google.android.gms.internal.measurement.zzfv.zza();
                zza32.zza(zzasVar2.zzc);
                zza32.zzb(zzawVar.zza);
                zza22.zza(zza32);
                zzgcVar2.zzaa(zza22);
                zzgcVar2.zzf(zzr.zzf.zzf().zza(zzhVar.zzu(), Collections.emptyList(), zzgcVar2.zzau(), Long.valueOf(zze.zzc()), Long.valueOf(zze.zzc())));
                if (zze.zzq()) {
                }
                zzn2 = zzhVar.zzn();
                if (zzn2 != 0) {
                }
                zzp = zzhVar.zzp();
                if (zzp == 0) {
                }
                zzC = zzhVar.zzC();
                zzqr.zzc();
                if (zzr.zzt.zzf().zzs(str, zzeh.zzao)) {
                    zzgcVar2.zzah(zzC);
                }
                zzhVar.zzF();
                zzgcVar2.zzI((int) zzhVar.zzo());
                zzr.zzt.zzf().zzh();
                zzgcVar2.zzam(77000L);
                zzgcVar2.zzal(zzr.zzt.zzax().currentTimeMillis());
                zzgcVar2.zzag(Boolean.TRUE.booleanValue());
                if (zzr.zzt.zzf().zzs(null, zzeh.zzas)) {
                }
                zzgaVar.zza(zzgcVar2);
                zzhVar.zzac(zzgcVar2.zzd());
                zzhVar.zzaa(zzgcVar2.zzc());
                zzr.zzf.zzi().zzD(zzhVar);
                zzr.zzf.zzi().zzC();
            } catch (SecurityException e3) {
                zzr.zzt.zzaA().zzc().zzb("app instance id encryption failed", e3.getMessage());
                bArr = new byte[0];
                zzlgVar3 = zzr.zzf;
                zzlgVar3.zzi().zzx();
                return bArr;
            }
        } finally {
            zzr.zzf.zzi().zzx();
        }
    }
}
