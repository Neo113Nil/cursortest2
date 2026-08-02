package com.google.android.gms.internal.ads;

import android.net.Uri;
import coil.util.Utils;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzafl implements zzafv {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzafk zzc = new zzafk(zzafi.zza);
    private static final zzafk zzd = new zzafk(zzafh.zza);
    private zzgvz zze;
    private final zzanc zzf = new zzamx();

    @Override // com.google.android.gms.internal.ads.zzafv
    public final synchronized zzafp[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0202 A[Catch: all -> 0x03e8, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x0202, B:15:0x0205, B:20:0x03ca, B:21:0x03cd, B:23:0x03d2, B:26:0x03d8, B:28:0x03db, B:32:0x03de, B:37:0x020e, B:39:0x0216, B:42:0x0220, B:45:0x022c, B:47:0x0234, B:50:0x023e, B:53:0x0249, B:56:0x0254, B:59:0x025f, B:61:0x0267, B:63:0x026f, B:66:0x0279, B:68:0x0287, B:71:0x0291, B:74:0x029c, B:76:0x02a4, B:78:0x02b2, B:80:0x02c0, B:83:0x02d0, B:85:0x02de, B:88:0x02e8, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:97:0x030a, B:99:0x0312, B:102:0x0322, B:104:0x032a, B:107:0x0334, B:109:0x033c, B:112:0x0346, B:114:0x034e, B:117:0x0357, B:120:0x0363, B:123:0x036f, B:126:0x037b, B:128:0x0383, B:131:0x038c, B:133:0x0394, B:136:0x039d, B:152:0x0047, B:153:0x004f, B:156:0x01c8, B:179:0x0054, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b3, B:206:0x00bf, B:209:0x00ca, B:212:0x00d6, B:215:0x00e1, B:218:0x00ec, B:221:0x00f7, B:224:0x0104, B:227:0x010f, B:230:0x011b, B:233:0x0127, B:236:0x0133, B:239:0x0140, B:242:0x014d, B:245:0x0159, B:248:0x0165, B:251:0x0170, B:254:0x017b, B:257:0x0186, B:260:0x0191, B:263:0x019c, B:266:0x01a7, B:269:0x01b2, B:272:0x01bd), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0047 A[Catch: all -> 0x03e8, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x0202, B:15:0x0205, B:20:0x03ca, B:21:0x03cd, B:23:0x03d2, B:26:0x03d8, B:28:0x03db, B:32:0x03de, B:37:0x020e, B:39:0x0216, B:42:0x0220, B:45:0x022c, B:47:0x0234, B:50:0x023e, B:53:0x0249, B:56:0x0254, B:59:0x025f, B:61:0x0267, B:63:0x026f, B:66:0x0279, B:68:0x0287, B:71:0x0291, B:74:0x029c, B:76:0x02a4, B:78:0x02b2, B:80:0x02c0, B:83:0x02d0, B:85:0x02de, B:88:0x02e8, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:97:0x030a, B:99:0x0312, B:102:0x0322, B:104:0x032a, B:107:0x0334, B:109:0x033c, B:112:0x0346, B:114:0x034e, B:117:0x0357, B:120:0x0363, B:123:0x036f, B:126:0x037b, B:128:0x0383, B:131:0x038c, B:133:0x0394, B:136:0x039d, B:152:0x0047, B:153:0x004f, B:156:0x01c8, B:179:0x0054, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b3, B:206:0x00bf, B:209:0x00ca, B:212:0x00d6, B:215:0x00e1, B:218:0x00ec, B:221:0x00f7, B:224:0x0104, B:227:0x010f, B:230:0x011b, B:233:0x0127, B:236:0x0133, B:239:0x0140, B:242:0x014d, B:245:0x0159, B:248:0x0165, B:251:0x0170, B:254:0x017b, B:257:0x0186, B:260:0x0191, B:263:0x019c, B:266:0x01a7, B:269:0x01b2, B:272:0x01bd), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03d2 A[Catch: all -> 0x03e8, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x0202, B:15:0x0205, B:20:0x03ca, B:21:0x03cd, B:23:0x03d2, B:26:0x03d8, B:28:0x03db, B:32:0x03de, B:37:0x020e, B:39:0x0216, B:42:0x0220, B:45:0x022c, B:47:0x0234, B:50:0x023e, B:53:0x0249, B:56:0x0254, B:59:0x025f, B:61:0x0267, B:63:0x026f, B:66:0x0279, B:68:0x0287, B:71:0x0291, B:74:0x029c, B:76:0x02a4, B:78:0x02b2, B:80:0x02c0, B:83:0x02d0, B:85:0x02de, B:88:0x02e8, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:97:0x030a, B:99:0x0312, B:102:0x0322, B:104:0x032a, B:107:0x0334, B:109:0x033c, B:112:0x0346, B:114:0x034e, B:117:0x0357, B:120:0x0363, B:123:0x036f, B:126:0x037b, B:128:0x0383, B:131:0x038c, B:133:0x0394, B:136:0x039d, B:152:0x0047, B:153:0x004f, B:156:0x01c8, B:179:0x0054, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b3, B:206:0x00bf, B:209:0x00ca, B:212:0x00d6, B:215:0x00e1, B:218:0x00ec, B:221:0x00f7, B:224:0x0104, B:227:0x010f, B:230:0x011b, B:233:0x0127, B:236:0x0133, B:239:0x0140, B:242:0x014d, B:245:0x0159, B:248:0x0165, B:251:0x0170, B:254:0x017b, B:257:0x0186, B:260:0x0191, B:263:0x019c, B:266:0x01a7, B:269:0x01b2, B:272:0x01bd), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x020e A[Catch: all -> 0x03e8, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x0202, B:15:0x0205, B:20:0x03ca, B:21:0x03cd, B:23:0x03d2, B:26:0x03d8, B:28:0x03db, B:32:0x03de, B:37:0x020e, B:39:0x0216, B:42:0x0220, B:45:0x022c, B:47:0x0234, B:50:0x023e, B:53:0x0249, B:56:0x0254, B:59:0x025f, B:61:0x0267, B:63:0x026f, B:66:0x0279, B:68:0x0287, B:71:0x0291, B:74:0x029c, B:76:0x02a4, B:78:0x02b2, B:80:0x02c0, B:83:0x02d0, B:85:0x02de, B:88:0x02e8, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:97:0x030a, B:99:0x0312, B:102:0x0322, B:104:0x032a, B:107:0x0334, B:109:0x033c, B:112:0x0346, B:114:0x034e, B:117:0x0357, B:120:0x0363, B:123:0x036f, B:126:0x037b, B:128:0x0383, B:131:0x038c, B:133:0x0394, B:136:0x039d, B:152:0x0047, B:153:0x004f, B:156:0x01c8, B:179:0x0054, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b3, B:206:0x00bf, B:209:0x00ca, B:212:0x00d6, B:215:0x00e1, B:218:0x00ec, B:221:0x00f7, B:224:0x0104, B:227:0x010f, B:230:0x011b, B:233:0x0127, B:236:0x0133, B:239:0x0140, B:242:0x014d, B:245:0x0159, B:248:0x0165, B:251:0x0170, B:254:0x017b, B:257:0x0186, B:260:0x0191, B:263:0x019c, B:266:0x01a7, B:269:0x01b2, B:272:0x01bd), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzafv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzafp[] zzb(Uri uri, Map map) {
        ArrayList arrayList;
        String str;
        char c;
        int i;
        String lastPathSegment;
        int i2;
        int i3;
        arrayList = new ArrayList(21);
        List list = (List) map.get("Content-Type");
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
            if (str != null) {
                String zzh = zzas.zzh(str);
                switch (zzh.hashCode()) {
                    case -2123537834:
                        if (zzh.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662384011:
                        if (zzh.equals(MimeTypes.VIDEO_PS)) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662384007:
                        if (zzh.equals(MimeTypes.VIDEO_MP2T)) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662095187:
                        if (zzh.equals("video/webm")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1606874997:
                        if (zzh.equals(MimeTypes.AUDIO_AMR_WB)) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487656890:
                        if (zzh.equals("image/avif")) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487464693:
                        if (zzh.equals(Utils.MIME_TYPE_HEIC)) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487464690:
                        if (zzh.equals(Utils.MIME_TYPE_HEIF)) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487394660:
                        if (zzh.equals("image/jpeg")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487018032:
                        if (zzh.equals(Utils.MIME_TYPE_WEBP)) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1248337486:
                        if (zzh.equals(MimeTypes.APPLICATION_MP4)) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1079884372:
                        if (zzh.equals(MimeTypes.VIDEO_AVI)) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1004728940:
                        if (zzh.equals(MimeTypes.TEXT_VTT)) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -879272239:
                        if (zzh.equals("image/bmp")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case -879258763:
                        if (zzh.equals("image/png")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case -387023398:
                        if (zzh.equals(MimeTypes.AUDIO_MATROSKA)) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -43467528:
                        if (zzh.equals(MimeTypes.APPLICATION_WEBM)) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 13915911:
                        if (zzh.equals(MimeTypes.VIDEO_FLV)) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 187078296:
                        if (zzh.equals(MimeTypes.AUDIO_AC3)) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187078297:
                        if (zzh.equals(MimeTypes.AUDIO_AC4)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187078669:
                        if (zzh.equals(MimeTypes.AUDIO_AMR)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187090232:
                        if (zzh.equals(MimeTypes.AUDIO_MP4)) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187091926:
                        if (zzh.equals(MimeTypes.AUDIO_OGG)) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187099443:
                        if (zzh.equals(MimeTypes.AUDIO_WAV)) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1331848029:
                        if (zzh.equals(MimeTypes.VIDEO_MP4)) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1503095341:
                        if (zzh.equals(MimeTypes.AUDIO_AMR_NB)) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504578661:
                        if (zzh.equals(MimeTypes.AUDIO_E_AC3)) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504619009:
                        if (zzh.equals(MimeTypes.AUDIO_FLAC)) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504824762:
                        if (zzh.equals(MimeTypes.AUDIO_MIDI)) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504831518:
                        if (zzh.equals(MimeTypes.AUDIO_MPEG)) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1505118770:
                        if (zzh.equals(MimeTypes.AUDIO_WEBM)) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2039520277:
                        if (zzh.equals(MimeTypes.VIDEO_MATROSKA)) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                        i = 0;
                        break;
                    case 3:
                        i = 1;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i = 3;
                        break;
                    case 7:
                        i = 4;
                        break;
                    case '\b':
                        i = 5;
                        break;
                    case '\t':
                        i = 15;
                        break;
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                        i = 6;
                        break;
                    case 15:
                        i = 7;
                        break;
                    case 16:
                    case 17:
                    case 18:
                        i = 8;
                        break;
                    case 19:
                        i = 9;
                        break;
                    case 20:
                        i = 10;
                        break;
                    case 21:
                        i = 11;
                        break;
                    case 22:
                        i = 12;
                        break;
                    case 23:
                        i = 13;
                        break;
                    case 24:
                        i = 14;
                        break;
                    case 25:
                        i = 16;
                        break;
                    case 26:
                        i = 17;
                        break;
                    case 27:
                        i = 18;
                        break;
                    case 28:
                        i = 19;
                        break;
                    case 29:
                    case 30:
                        i = 20;
                        break;
                    case 31:
                        i = 21;
                        break;
                }
                if (i != -1) {
                    zzc(i, arrayList);
                }
                lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
                        if (lastPathSegment.endsWith(".ac4")) {
                            i2 = 1;
                        } else {
                            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                                if (lastPathSegment.endsWith(".amr")) {
                                    i2 = 3;
                                } else if (lastPathSegment.endsWith(".flac")) {
                                    i2 = 4;
                                } else if (lastPathSegment.endsWith(".flv")) {
                                    i2 = 5;
                                } else {
                                    if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                                        if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                                            if (lastPathSegment.endsWith(".mp3")) {
                                                i2 = 7;
                                            } else {
                                                if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                                                    if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                                        if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                                            if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                                                if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                                                    if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                                        if (!lastPathSegment.endsWith(BrandSafetyUtils.a) && !lastPathSegment.endsWith(".jpeg")) {
                                                                            if (lastPathSegment.endsWith(".avi")) {
                                                                                i2 = 16;
                                                                            } else if (lastPathSegment.endsWith(".png")) {
                                                                                i2 = 17;
                                                                            } else if (lastPathSegment.endsWith(".webp")) {
                                                                                i2 = 18;
                                                                            } else {
                                                                                if (!lastPathSegment.endsWith(".bmp") && !lastPathSegment.endsWith(".dib")) {
                                                                                    if (!lastPathSegment.endsWith(".heic") && !lastPathSegment.endsWith(".heif")) {
                                                                                        if (lastPathSegment.endsWith(".avif")) {
                                                                                            i2 = 21;
                                                                                        }
                                                                                    }
                                                                                    i2 = 20;
                                                                                }
                                                                                i2 = 19;
                                                                            }
                                                                        }
                                                                        i2 = 14;
                                                                    }
                                                                    i2 = 13;
                                                                }
                                                                i2 = 12;
                                                            }
                                                            i2 = 11;
                                                        }
                                                        i2 = 10;
                                                    }
                                                    i2 = 9;
                                                }
                                                i2 = 8;
                                            }
                                        }
                                        i2 = 6;
                                    }
                                    i2 = 15;
                                }
                            }
                            i2 = 2;
                        }
                        if (i2 != -1 && i2 != i) {
                            zzc(i2, arrayList);
                        }
                        int[] iArr = zzb;
                        for (i3 = 0; i3 < 21; i3++) {
                            int i4 = iArr[i3];
                            if (i4 != i && i4 != i2) {
                                zzc(i4, arrayList);
                            }
                        }
                    }
                    i2 = 0;
                    if (i2 != -1) {
                        zzc(i2, arrayList);
                    }
                    int[] iArr2 = zzb;
                    while (i3 < 21) {
                    }
                }
                i2 = -1;
                if (i2 != -1) {
                }
                int[] iArr22 = zzb;
                while (i3 < 21) {
                }
            }
            i = -1;
            if (i != -1) {
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
            }
            i2 = -1;
            if (i2 != -1) {
            }
            int[] iArr222 = zzb;
            while (i3 < 21) {
            }
        }
        str = null;
        if (str != null) {
        }
        i = -1;
        if (i != -1) {
        }
        lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
        }
        i2 = -1;
        if (i2 != -1) {
        }
        int[] iArr2222 = zzb;
        while (i3 < 21) {
        }
        return (zzafp[]) arrayList.toArray(new zzafp[0]);
    }

    private final void zzc(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzapb());
                break;
            case 1:
                list.add(new zzape());
                break;
            case 2:
                list.add(new zzaph(0));
                break;
            case 3:
                list.add(new zzahk(0));
                break;
            case 4:
                zzafp zza2 = zzc.zza(0);
                if (zza2 == null) {
                    list.add(new zzaib(0));
                    break;
                } else {
                    list.add(zza2);
                    break;
                }
            case 5:
                list.add(new zzaie());
                break;
            case 6:
                list.add(new zzakb(this.zzf, 0));
                break;
            case 7:
                list.add(new zzakj(0));
                break;
            case 8:
                zzanc zzancVar = this.zzf;
                list.add(new zzalk(zzancVar, PsExtractor.AUDIO_STREAM, null, null, zzgvz.zzi(), null));
                list.add(new zzalv(zzancVar, 160));
                break;
            case 9:
                list.add(new zzaml());
                break;
            case 10:
                list.add(new zzaql());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzgvz.zzi();
                }
                list.add(new zzaqw(1, 0, this.zzf, new zzfh(0L), new zzapj(0, this.zze), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES));
                break;
            case 12:
                list.add(new zzarj());
                break;
            case 14:
                list.add(new zzail(0));
                break;
            case 15:
                zzafp zza3 = zzd.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    break;
                }
                break;
            case 16:
                list.add(new zzaho(0, this.zzf));
                break;
            case 17:
                list.add(new zzamv());
                break;
            case 18:
                list.add(new zzaro());
                break;
            case 19:
                list.add(new zzahw());
                break;
            case 20:
                list.add(new zzaik(0));
                break;
            case 21:
                list.add(new zzahv());
                break;
        }
    }
}
