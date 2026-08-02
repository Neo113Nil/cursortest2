package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import io.sentry.C1;
import io.sentry.D2;
import io.sentry.EnumC7158j0;
import io.sentry.EnumC7159j1;
import io.sentry.G2;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.Y2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class a0 {
    /* JADX WARN: Removed duplicated region for block: B:109:0x04d3 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04ed A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0536 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0550 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x058a A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05a4 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05cc A[Catch: all -> 0x004d, LOOP:5: B:163:0x05c6->B:165:0x05cc, LOOP_END, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05ee A[Catch: all -> 0x004d, LOOP:6: B:172:0x05e8->B:174:0x05ee, LOOP_END, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0689 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0304 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011f A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fd A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x022f A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x026d A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0284 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ab A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e9 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0323 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x035a A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03d7 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03f6 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x043b A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0487 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04a1 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0009, B:5:0x0018, B:7:0x002b, B:9:0x0041, B:10:0x0050, B:12:0x007f, B:14:0x0089, B:15:0x0090, B:18:0x00cf, B:22:0x00d8, B:23:0x00f3, B:25:0x011f, B:26:0x0122, B:28:0x01fd, B:29:0x0202, B:31:0x022f, B:33:0x0239, B:34:0x0240, B:36:0x026d, B:38:0x0277, B:39:0x027e, B:41:0x0284, B:43:0x028e, B:44:0x0295, B:46:0x02ab, B:47:0x02b6, B:49:0x02e9, B:50:0x02f0, B:53:0x02fc, B:54:0x0307, B:56:0x0323, B:57:0x0328, B:59:0x035a, B:60:0x035e, B:62:0x0364, B:64:0x0372, B:66:0x03d7, B:68:0x03e1, B:69:0x03ec, B:71:0x03f6, B:73:0x0400, B:74:0x040b, B:76:0x043b, B:78:0x0449, B:79:0x0453, B:80:0x045c, B:82:0x046a, B:84:0x0472, B:86:0x0478, B:87:0x0481, B:89:0x0487, B:92:0x0497, B:97:0x049b, B:99:0x04a1, B:100:0x04a8, B:102:0x04b6, B:104:0x04be, B:106:0x04c4, B:107:0x04cd, B:109:0x04d3, B:112:0x04e3, B:117:0x04e7, B:119:0x04ed, B:120:0x04f4, B:122:0x051f, B:124:0x0527, B:125:0x0530, B:127:0x0536, B:130:0x0546, B:135:0x054a, B:137:0x0550, B:138:0x0557, B:140:0x056d, B:142:0x0575, B:144:0x057b, B:145:0x0584, B:147:0x058a, B:150:0x059a, B:155:0x059e, B:157:0x05a4, B:158:0x05ab, B:160:0x05bc, B:162:0x05c2, B:163:0x05c6, B:165:0x05cc, B:167:0x05d6, B:169:0x05de, B:171:0x05e4, B:172:0x05e8, B:174:0x05ee, B:176:0x05f8, B:178:0x0689, B:179:0x068c, B:181:0x0304, B:182:0x00e6, B:183:0x06a6), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void a(@NotNull Context context, @NotNull I i11, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        String g10;
        String g11;
        long f7;
        List<String> e11;
        io.sentry.protocol.r sdkVersion;
        List<String> e12;
        String g12;
        List<String> e13;
        List<String> e14;
        String g13;
        Iterator<String> it;
        Iterator<String> it2;
        List<String> e15;
        ArrayList arrayList;
        Iterator<String> it3;
        List<String> e16;
        ArrayList arrayList2;
        Iterator<String> it4;
        List<String> e17;
        ArrayList arrayList3;
        Iterator<String> it5;
        List<String> e18;
        ArrayList arrayList4;
        Iterator<String> it6;
        io.sentry.util.p.b(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle b11 = b(context, sentryAndroidOptions.getLogger(), i11);
            ILogger logger = sentryAndroidOptions.getLogger();
            if (b11 != null) {
                sentryAndroidOptions.setDebug(c(b11, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String name = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String g14 = g(b11, logger, "io.sentry.debug.level", name.toLowerCase(locale));
                    if (g14 != null) {
                        sentryAndroidOptions.setDiagnosticLevel(I2.valueOf(g14.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(c(b11, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setTombstoneEnabled(c(b11, logger, "io.sentry.tombstone.enable", sentryAndroidOptions.isTombstoneEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(c(b11, logger, "io.sentry.auto-session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking()));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    double d11 = d(b11, logger, "io.sentry.sample-rate");
                    if (d11 != -1.0d) {
                        sentryAndroidOptions.setSampleRate(Double.valueOf(d11));
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(c(b11, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(f(b11, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(c(b11, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
                String g15 = g(b11, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean c11 = c(b11, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (c11 && (g15 == null || !g15.isEmpty())) {
                    if (g15 == null) {
                        sentryAndroidOptions.getLogger().c(I2.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                    }
                    sentryAndroidOptions.setEnabled(c11);
                    sentryAndroidOptions.setDsn(g15);
                    sentryAndroidOptions.setEnableNdk(c(b11, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                    sentryAndroidOptions.setEnableScopeSync(c(b11, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                    g10 = g(b11, logger, "io.sentry.ndk.sdk-name", sentryAndroidOptions.getNativeSdkName());
                    if (g10 != null) {
                        sentryAndroidOptions.setNativeSdkName(g10);
                    }
                    sentryAndroidOptions.setRelease(g(b11, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                    sentryAndroidOptions.setDist(g(b11, logger, "io.sentry.dist", sentryAndroidOptions.getDist()));
                    sentryAndroidOptions.setEnvironment(g(b11, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                    sentryAndroidOptions.setSessionTrackingIntervalMillis(f(b11, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                    sentryAndroidOptions.setMaxBreadcrumbs((int) f(b11, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                    sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(c(b11, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                    sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(c(b11, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                    sentryAndroidOptions.setEnableSystemEventBreadcrumbs(c(b11, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                    sentryAndroidOptions.setEnableAppComponentBreadcrumbs(c(b11, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                    sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(c(b11, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                    sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(c(b11, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                    sentryAndroidOptions.setEnableUncaughtExceptionHandler(c(b11, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                    sentryAndroidOptions.setAttachThreads(c(b11, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                    sentryAndroidOptions.setAttachScreenshot(c(b11, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                    sentryAndroidOptions.setAttachViewHierarchy(c(b11, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                    sentryAndroidOptions.setSendClientReports(c(b11, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                    if (c(b11, logger, "io.sentry.auto-init", true)) {
                        sentryAndroidOptions.setInitPriority(EnumC7158j0.LOW);
                    }
                    sentryAndroidOptions.setForceInit(c(b11, logger, "io.sentry.force-init", sentryAndroidOptions.isForceInit()));
                    sentryAndroidOptions.setCollectAdditionalContext(c(b11, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                    sentryAndroidOptions.setCollectExternalStorageContext(c(b11, logger, "io.sentry.external-storage-context", sentryAndroidOptions.isCollectExternalStorageContext()));
                    if (sentryAndroidOptions.getTracesSampleRate() == null) {
                        double d12 = d(b11, logger, "io.sentry.traces.sample-rate");
                        if (d12 != -1.0d) {
                            sentryAndroidOptions.setTracesSampleRate(Double.valueOf(d12));
                        }
                    }
                    sentryAndroidOptions.setTraceSampling(c(b11, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                    sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(c(b11, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                    sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(c(b11, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                    if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                        double d13 = d(b11, logger, "io.sentry.traces.profiling.sample-rate");
                        if (d13 != -1.0d) {
                            sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(d13));
                        }
                    }
                    if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                        double d14 = d(b11, logger, "io.sentry.traces.profiling.session-sample-rate");
                        if (d14 != -1.0d) {
                            sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(d14));
                        }
                    }
                    String name2 = sentryAndroidOptions.getProfileLifecycle().name();
                    Locale locale2 = Locale.ROOT;
                    g11 = g(b11, logger, "io.sentry.traces.profiling.lifecycle", name2.toLowerCase(locale2));
                    if (g11 != null) {
                        sentryAndroidOptions.setProfileLifecycle(EnumC7159j1.valueOf(g11.toUpperCase(locale2)));
                    }
                    sentryAndroidOptions.setStartProfilerOnAppStart(c(b11, logger, "io.sentry.traces.profiling.start-on-app-start", sentryAndroidOptions.isStartProfilerOnAppStart()));
                    sentryAndroidOptions.setEnableUserInteractionTracing(c(b11, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                    sentryAndroidOptions.setEnableTimeToFullDisplayTracing(c(b11, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                    f7 = f(b11, logger, "io.sentry.traces.idle-timeout", -1L);
                    if (f7 != -1) {
                        sentryAndroidOptions.setIdleTimeout(Long.valueOf(f7));
                    }
                    e11 = e(b11, logger, "io.sentry.traces.trace-propagation-targets");
                    if (!b11.containsKey("io.sentry.traces.trace-propagation-targets") && e11 == null) {
                        sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                    } else if (e11 != null) {
                        sentryAndroidOptions.setTracePropagationTargets(e11);
                    }
                    sentryAndroidOptions.setEnableFramesTracking(c(b11, logger, "io.sentry.traces.frames-tracking", true));
                    sentryAndroidOptions.setProguardUuid(g(b11, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                    sdkVersion = sentryAndroidOptions.getSdkVersion();
                    if (sdkVersion == null) {
                        sdkVersion = new io.sentry.protocol.r("", "");
                    }
                    sdkVersion.e(h(b11, logger, "io.sentry.sdk.name", sdkVersion.c()));
                    sdkVersion.g(h(b11, logger, "io.sentry.sdk.version", sdkVersion.d()));
                    sentryAndroidOptions.setSdkVersion(sdkVersion);
                    sentryAndroidOptions.setSendDefaultPii(c(b11, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                    e12 = e(b11, logger, "io.sentry.gradle-plugin-integrations");
                    if (e12 != null) {
                        Iterator<String> it7 = e12.iterator();
                        while (it7.hasNext()) {
                            G2.d().a(it7.next());
                        }
                    }
                    sentryAndroidOptions.setEnableRootCheck(c(b11, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                    sentryAndroidOptions.setSendModules(c(b11, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                    sentryAndroidOptions.setEnablePerformanceV2(c(b11, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                    sentryAndroidOptions.setEnableAppStartProfiling(c(b11, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                    sentryAndroidOptions.setEnableScopePersistence(c(b11, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                    sentryAndroidOptions.setEnableAutoTraceIdGeneration(c(b11, logger, "io.sentry.traces.enable-auto-id-generation", sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                    sentryAndroidOptions.setDeadlineTimeout(f(b11, logger, "io.sentry.traces.deadline-timeout", sentryAndroidOptions.getDeadlineTimeout()));
                    if (sentryAndroidOptions.getSessionReplay().s() == null) {
                        double d15 = d(b11, logger, "io.sentry.session-replay.session-sample-rate");
                        if (d15 != -1.0d) {
                            sentryAndroidOptions.getSessionReplay().I(Double.valueOf(d15));
                        }
                    }
                    if (sentryAndroidOptions.getSessionReplay().n() == null) {
                        double d16 = d(b11, logger, "io.sentry.session-replay.on-error-sample-rate");
                        if (d16 != -1.0d) {
                            sentryAndroidOptions.getSessionReplay().F(Double.valueOf(d16));
                        }
                    }
                    sentryAndroidOptions.getSessionReplay().e(c(b11, logger, "io.sentry.session-replay.mask-all-text", true));
                    sentryAndroidOptions.getSessionReplay().d(c(b11, logger, "io.sentry.session-replay.mask-all-images", true));
                    sentryAndroidOptions.getSessionReplay().z(c(b11, logger, "io.sentry.session-replay.debug", false));
                    g12 = g(b11, logger, "io.sentry.session-replay.screenshot-strategy", null);
                    if (g12 != null) {
                        if ("canvas".equals(g12.toLowerCase(Locale.ROOT))) {
                            sentryAndroidOptions.getSessionReplay().G(C1.CANVAS);
                        } else {
                            sentryAndroidOptions.getSessionReplay().G(C1.PIXEL_COPY);
                        }
                    }
                    if (sentryAndroidOptions.getSessionReplay().i().isEmpty() && (e18 = e(b11, logger, "io.sentry.session-replay.network-detail-allow-urls")) != null && !e18.isEmpty()) {
                        arrayList4 = new ArrayList();
                        it6 = e18.iterator();
                        while (it6.hasNext()) {
                            String trim = it6.next().trim();
                            if (!trim.isEmpty()) {
                                arrayList4.add(trim);
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            sentryAndroidOptions.getSessionReplay().B(arrayList4);
                        }
                    }
                    if (sentryAndroidOptions.getSessionReplay().j().isEmpty() && (e17 = e(b11, logger, "io.sentry.session-replay.network-detail-deny-urls")) != null && !e17.isEmpty()) {
                        arrayList3 = new ArrayList();
                        it5 = e17.iterator();
                        while (it5.hasNext()) {
                            String trim2 = it5.next().trim();
                            if (!trim2.isEmpty()) {
                                arrayList3.add(trim2);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            sentryAndroidOptions.getSessionReplay().C(arrayList3);
                        }
                    }
                    sentryAndroidOptions.getSessionReplay().A(c(b11, logger, "io.sentry.session-replay.network-capture-bodies", sentryAndroidOptions.getSessionReplay().v()));
                    if (sentryAndroidOptions.getSessionReplay().l().size() == Y2.k().size() && (e16 = e(b11, logger, "io.sentry.session-replay.network-request-headers")) != null) {
                        arrayList2 = new ArrayList();
                        it4 = e16.iterator();
                        while (it4.hasNext()) {
                            String trim3 = it4.next().trim();
                            if (!trim3.isEmpty()) {
                                arrayList2.add(trim3);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            sentryAndroidOptions.getSessionReplay().D(arrayList2);
                        }
                    }
                    if (sentryAndroidOptions.getSessionReplay().m().size() == Y2.k().size() && (e15 = e(b11, logger, "io.sentry.session-replay.network-response-headers")) != null && !e15.isEmpty()) {
                        arrayList = new ArrayList();
                        it3 = e15.iterator();
                        while (it3.hasNext()) {
                            String trim4 = it3.next().trim();
                            if (!trim4.isEmpty()) {
                                arrayList.add(trim4);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            sentryAndroidOptions.getSessionReplay().E(arrayList);
                        }
                    }
                    sentryAndroidOptions.setIgnoredErrors(e(b11, logger, "io.sentry.ignored-errors"));
                    e13 = e(b11, logger, "io.sentry.in-app-includes");
                    if (e13 != null && !e13.isEmpty()) {
                        it2 = e13.iterator();
                        while (it2.hasNext()) {
                            sentryAndroidOptions.addInAppInclude(it2.next());
                        }
                    }
                    e14 = e(b11, logger, "io.sentry.in-app-excludes");
                    if (e14 != null && !e14.isEmpty()) {
                        it = e14.iterator();
                        while (it.hasNext()) {
                            sentryAndroidOptions.addInAppExclude(it.next());
                        }
                    }
                    sentryAndroidOptions.getLogs().c(c(b11, logger, "io.sentry.logs.enabled", sentryAndroidOptions.getLogs().b()));
                    sentryAndroidOptions.getMetrics().c(c(b11, logger, "io.sentry.metrics.enabled", sentryAndroidOptions.getMetrics().b()));
                    D2 feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                    feedbackOptions.h(c(b11, logger, "io.sentry.feedback.is-name-required", feedbackOptions.b()));
                    feedbackOptions.k(c(b11, logger, "io.sentry.feedback.show-name", feedbackOptions.e()));
                    feedbackOptions.g(c(b11, logger, "io.sentry.feedback.is-email-required", feedbackOptions.a()));
                    feedbackOptions.j(c(b11, logger, "io.sentry.feedback.show-email", feedbackOptions.d()));
                    feedbackOptions.l(c(b11, logger, "io.sentry.feedback.use-sentry-user", feedbackOptions.f()));
                    feedbackOptions.i(c(b11, logger, "io.sentry.feedback.show-branding", feedbackOptions.c()));
                    sentryAndroidOptions.setEnableSpotlight(c(b11, logger, "io.sentry.spotlight.enable", sentryAndroidOptions.isEnableSpotlight()));
                    g13 = g(b11, logger, "io.sentry.spotlight.url", null);
                    if (g13 != null) {
                        sentryAndroidOptions.setSpotlightConnectionUrl(g13);
                    }
                    sentryAndroidOptions.getScreenshot().e(c(b11, logger, "io.sentry.screenshot.mask-all-text", false));
                    sentryAndroidOptions.getScreenshot().d(c(b11, logger, "io.sentry.screenshot.mask-all-images", false));
                }
                sentryAndroidOptions.getLogger().c(I2.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                sentryAndroidOptions.setEnabled(c11);
                sentryAndroidOptions.setDsn(g15);
                sentryAndroidOptions.setEnableNdk(c(b11, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(c(b11, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                g10 = g(b11, logger, "io.sentry.ndk.sdk-name", sentryAndroidOptions.getNativeSdkName());
                if (g10 != null) {
                }
                sentryAndroidOptions.setRelease(g(b11, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setDist(g(b11, logger, "io.sentry.dist", sentryAndroidOptions.getDist()));
                sentryAndroidOptions.setEnvironment(g(b11, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(f(b11, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) f(b11, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(c(b11, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(c(b11, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(c(b11, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(c(b11, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(c(b11, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(c(b11, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(c(b11, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(c(b11, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(c(b11, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(c(b11, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(c(b11, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                if (c(b11, logger, "io.sentry.auto-init", true)) {
                }
                sentryAndroidOptions.setForceInit(c(b11, logger, "io.sentry.force-init", sentryAndroidOptions.isForceInit()));
                sentryAndroidOptions.setCollectAdditionalContext(c(b11, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                sentryAndroidOptions.setCollectExternalStorageContext(c(b11, logger, "io.sentry.external-storage-context", sentryAndroidOptions.isCollectExternalStorageContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                }
                sentryAndroidOptions.setTraceSampling(c(b11, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(c(b11, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(c(b11, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                }
                if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                }
                String name22 = sentryAndroidOptions.getProfileLifecycle().name();
                Locale locale22 = Locale.ROOT;
                g11 = g(b11, logger, "io.sentry.traces.profiling.lifecycle", name22.toLowerCase(locale22));
                if (g11 != null) {
                }
                sentryAndroidOptions.setStartProfilerOnAppStart(c(b11, logger, "io.sentry.traces.profiling.start-on-app-start", sentryAndroidOptions.isStartProfilerOnAppStart()));
                sentryAndroidOptions.setEnableUserInteractionTracing(c(b11, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(c(b11, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                f7 = f(b11, logger, "io.sentry.traces.idle-timeout", -1L);
                if (f7 != -1) {
                }
                e11 = e(b11, logger, "io.sentry.traces.trace-propagation-targets");
                if (!b11.containsKey("io.sentry.traces.trace-propagation-targets")) {
                }
                if (e11 != null) {
                }
                sentryAndroidOptions.setEnableFramesTracking(c(b11, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(g(b11, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                }
                sdkVersion.e(h(b11, logger, "io.sentry.sdk.name", sdkVersion.c()));
                sdkVersion.g(h(b11, logger, "io.sentry.sdk.version", sdkVersion.d()));
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(c(b11, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                e12 = e(b11, logger, "io.sentry.gradle-plugin-integrations");
                if (e12 != null) {
                }
                sentryAndroidOptions.setEnableRootCheck(c(b11, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(c(b11, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(c(b11, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableAppStartProfiling(c(b11, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(c(b11, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableAutoTraceIdGeneration(c(b11, logger, "io.sentry.traces.enable-auto-id-generation", sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                sentryAndroidOptions.setDeadlineTimeout(f(b11, logger, "io.sentry.traces.deadline-timeout", sentryAndroidOptions.getDeadlineTimeout()));
                if (sentryAndroidOptions.getSessionReplay().s() == null) {
                }
                if (sentryAndroidOptions.getSessionReplay().n() == null) {
                }
                sentryAndroidOptions.getSessionReplay().e(c(b11, logger, "io.sentry.session-replay.mask-all-text", true));
                sentryAndroidOptions.getSessionReplay().d(c(b11, logger, "io.sentry.session-replay.mask-all-images", true));
                sentryAndroidOptions.getSessionReplay().z(c(b11, logger, "io.sentry.session-replay.debug", false));
                g12 = g(b11, logger, "io.sentry.session-replay.screenshot-strategy", null);
                if (g12 != null) {
                }
                if (sentryAndroidOptions.getSessionReplay().i().isEmpty()) {
                    arrayList4 = new ArrayList();
                    it6 = e18.iterator();
                    while (it6.hasNext()) {
                    }
                    if (!arrayList4.isEmpty()) {
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().j().isEmpty()) {
                    arrayList3 = new ArrayList();
                    it5 = e17.iterator();
                    while (it5.hasNext()) {
                    }
                    if (!arrayList3.isEmpty()) {
                    }
                }
                sentryAndroidOptions.getSessionReplay().A(c(b11, logger, "io.sentry.session-replay.network-capture-bodies", sentryAndroidOptions.getSessionReplay().v()));
                if (sentryAndroidOptions.getSessionReplay().l().size() == Y2.k().size()) {
                    arrayList2 = new ArrayList();
                    it4 = e16.iterator();
                    while (it4.hasNext()) {
                    }
                    if (!arrayList2.isEmpty()) {
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().m().size() == Y2.k().size()) {
                    arrayList = new ArrayList();
                    it3 = e15.iterator();
                    while (it3.hasNext()) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                }
                sentryAndroidOptions.setIgnoredErrors(e(b11, logger, "io.sentry.ignored-errors"));
                e13 = e(b11, logger, "io.sentry.in-app-includes");
                if (e13 != null) {
                    it2 = e13.iterator();
                    while (it2.hasNext()) {
                    }
                }
                e14 = e(b11, logger, "io.sentry.in-app-excludes");
                if (e14 != null) {
                    it = e14.iterator();
                    while (it.hasNext()) {
                    }
                }
                sentryAndroidOptions.getLogs().c(c(b11, logger, "io.sentry.logs.enabled", sentryAndroidOptions.getLogs().b()));
                sentryAndroidOptions.getMetrics().c(c(b11, logger, "io.sentry.metrics.enabled", sentryAndroidOptions.getMetrics().b()));
                D2 feedbackOptions2 = sentryAndroidOptions.getFeedbackOptions();
                feedbackOptions2.h(c(b11, logger, "io.sentry.feedback.is-name-required", feedbackOptions2.b()));
                feedbackOptions2.k(c(b11, logger, "io.sentry.feedback.show-name", feedbackOptions2.e()));
                feedbackOptions2.g(c(b11, logger, "io.sentry.feedback.is-email-required", feedbackOptions2.a()));
                feedbackOptions2.j(c(b11, logger, "io.sentry.feedback.show-email", feedbackOptions2.d()));
                feedbackOptions2.l(c(b11, logger, "io.sentry.feedback.use-sentry-user", feedbackOptions2.f()));
                feedbackOptions2.i(c(b11, logger, "io.sentry.feedback.show-branding", feedbackOptions2.c()));
                sentryAndroidOptions.setEnableSpotlight(c(b11, logger, "io.sentry.spotlight.enable", sentryAndroidOptions.isEnableSpotlight()));
                g13 = g(b11, logger, "io.sentry.spotlight.url", null);
                if (g13 != null) {
                }
                sentryAndroidOptions.getScreenshot().e(c(b11, logger, "io.sentry.screenshot.mask-all-text", false));
                sentryAndroidOptions.getScreenshot().d(c(b11, logger, "io.sentry.screenshot.mask-all-images", false));
            }
            sentryAndroidOptions.getLogger().c(I2.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(I2.ERROR, "Failed to read configuration from android manifest metadata.", th2);
        }
    }

    private static Bundle b(@NotNull Context context, @NotNull ILogger iLogger, I i11) {
        ApplicationInfo a11 = K.a(context, i11);
        if (a11 != null) {
            return a11.metaData;
        }
        return null;
    }

    private static boolean c(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, boolean z11) {
        boolean z12 = bundle.getBoolean(str, z11);
        iLogger.c(I2.DEBUG, str + " read: " + z12, new Object[0]);
        return z12;
    }

    private static double d(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str) {
        double doubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (doubleValue == -1.0d) {
            doubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        iLogger.c(I2.DEBUG, str + " read: " + doubleValue, new Object[0]);
        return doubleValue;
    }

    private static List<String> e(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str) {
        String string = bundle.getString(str);
        iLogger.c(I2.DEBUG, G.g.c(str, " read: ", string), new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    private static long f(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, long j11) {
        long j12 = bundle.getInt(str, (int) j11);
        iLogger.c(I2.DEBUG, str + " read: " + j12, new Object[0]);
        return j12;
    }

    private static String g(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.c(I2.DEBUG, G.g.c(str, " read: ", string), new Object[0]);
        return string;
    }

    @NotNull
    private static String h(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, @NotNull String str2) {
        String string = bundle.getString(str, str2);
        iLogger.c(I2.DEBUG, G.g.c(str, " read: ", string), new Object[0]);
        return string;
    }
}
