package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.c0l;
import defpackage.jle;
import defpackage.jpe;
import defpackage.mio;
import defpackage.vo4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzagd implements zzagn {
    public static final int[] c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final c0l d = new c0l(jpe.b);
    public static final c0l e = new c0l(jle.b);
    public s a;
    public final zzans b = new zzans();

    public final void a(ArrayList arrayList, int i) {
        zzans zzansVar = this.b;
        switch (i) {
            case 0:
                arrayList.add(new zzapw());
                break;
            case 1:
                arrayList.add(new zzapz());
                break;
            case 2:
                arrayList.add(new zzaqc(0));
                break;
            case 3:
                arrayList.add(new zzahy(0));
                break;
            case 4:
                zzagh n = d.n(0);
                if (n == null) {
                    arrayList.add(new zzaip(0));
                    break;
                } else {
                    arrayList.add(n);
                    break;
                }
            case 5:
                arrayList.add(new zzais());
                break;
            case 6:
                arrayList.add(new zzakt(new vo4(2), 0, zzansVar));
                break;
            case 7:
                arrayList.add(new zzalb(0));
                break;
            case 8:
                mio mioVar = zzgxm.b;
                arrayList.add(new zzamd(zzansVar, IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED, s.e));
                arrayList.add(new zzamp(160, zzansVar));
                break;
            case 9:
                arrayList.add(new zzang());
                break;
            case 10:
                arrayList.add(new zzarg());
                break;
            case 11:
                if (this.a == null) {
                    mio mioVar2 = zzgxm.b;
                    this.a = s.e;
                }
                arrayList.add(new zzarr(0, zzansVar, new zzfj(), new zzaqe(this.a)));
                break;
            case 12:
                arrayList.add(new zzase());
                break;
            case 14:
                arrayList.add(new zzaja(0));
                break;
            case 15:
                zzagh n2 = e.n(new Object[0]);
                if (n2 != null) {
                    arrayList.add(n2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new zzaic(0, zzansVar));
                break;
            case 17:
                arrayList.add(new zzanq());
                break;
            case 18:
                arrayList.add(new zzasj());
                break;
            case 19:
                arrayList.add(new zzaik());
                break;
            case 20:
                arrayList.add(new zzaiy(0));
                break;
            case 21:
                arrayList.add(new zzaij());
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0364, code lost:
    
        if (r12 == r4) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0366, code lost:
    
        a(r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0142, code lost:
    
        if (r4.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_MP4) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x016d, code lost:
    
        if (r4.equals("image/heic") != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0181, code lost:
    
        if (r4.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AMR_WB) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x018b, code lost:
    
        if (r4.equals("video/webm") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x01aa, code lost:
    
        if (r4.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3_JOC) != false) goto L113;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01af A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01af, B:15:0x01b2, B:20:0x0366, B:21:0x0369, B:23:0x036e, B:26:0x0374, B:28:0x0377, B:32:0x037a, B:37:0x01bb, B:39:0x01c3, B:41:0x01ce, B:44:0x01da, B:46:0x01e4, B:49:0x01ed, B:52:0x01f8, B:55:0x0203, B:58:0x020e, B:60:0x0216, B:62:0x021e, B:64:0x022a, B:66:0x0238, B:69:0x0242, B:72:0x024d, B:74:0x0255, B:76:0x0263, B:78:0x0271, B:80:0x0283, B:82:0x0291, B:84:0x029d, B:86:0x02a5, B:88:0x02ad, B:90:0x02b5, B:92:0x02c1, B:94:0x02c9, B:96:0x02da, B:98:0x02e2, B:100:0x02ee, B:102:0x02f6, B:104:0x0302, B:106:0x030a, B:108:0x0314, B:111:0x031f, B:114:0x0329, B:117:0x0334, B:119:0x033c, B:121:0x0347, B:123:0x034f, B:125:0x0359, B:139:0x004c, B:140:0x0054, B:142:0x0058, B:146:0x0062, B:149:0x006c, B:152:0x0077, B:155:0x0083, B:158:0x008e, B:162:0x0098, B:166:0x00a2, B:170:0x00ac, B:173:0x00b8, B:176:0x00c4, B:179:0x00ce, B:182:0x00d8, B:185:0x00e4, B:188:0x00ee, B:191:0x00f9, B:194:0x0103, B:197:0x010d, B:200:0x0118, B:203:0x0124, B:206:0x0130, B:209:0x013c, B:211:0x0148, B:214:0x0154, B:217:0x015e, B:221:0x0167, B:223:0x0171, B:226:0x017b, B:228:0x0185, B:230:0x018f, B:233:0x0199, B:236:0x01a4), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x036e A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01af, B:15:0x01b2, B:20:0x0366, B:21:0x0369, B:23:0x036e, B:26:0x0374, B:28:0x0377, B:32:0x037a, B:37:0x01bb, B:39:0x01c3, B:41:0x01ce, B:44:0x01da, B:46:0x01e4, B:49:0x01ed, B:52:0x01f8, B:55:0x0203, B:58:0x020e, B:60:0x0216, B:62:0x021e, B:64:0x022a, B:66:0x0238, B:69:0x0242, B:72:0x024d, B:74:0x0255, B:76:0x0263, B:78:0x0271, B:80:0x0283, B:82:0x0291, B:84:0x029d, B:86:0x02a5, B:88:0x02ad, B:90:0x02b5, B:92:0x02c1, B:94:0x02c9, B:96:0x02da, B:98:0x02e2, B:100:0x02ee, B:102:0x02f6, B:104:0x0302, B:106:0x030a, B:108:0x0314, B:111:0x031f, B:114:0x0329, B:117:0x0334, B:119:0x033c, B:121:0x0347, B:123:0x034f, B:125:0x0359, B:139:0x004c, B:140:0x0054, B:142:0x0058, B:146:0x0062, B:149:0x006c, B:152:0x0077, B:155:0x0083, B:158:0x008e, B:162:0x0098, B:166:0x00a2, B:170:0x00ac, B:173:0x00b8, B:176:0x00c4, B:179:0x00ce, B:182:0x00d8, B:185:0x00e4, B:188:0x00ee, B:191:0x00f9, B:194:0x0103, B:197:0x010d, B:200:0x0118, B:203:0x0124, B:206:0x0130, B:209:0x013c, B:211:0x0148, B:214:0x0154, B:217:0x015e, B:221:0x0167, B:223:0x0171, B:226:0x017b, B:228:0x0185, B:230:0x018f, B:233:0x0199, B:236:0x01a4), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01bb A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01af, B:15:0x01b2, B:20:0x0366, B:21:0x0369, B:23:0x036e, B:26:0x0374, B:28:0x0377, B:32:0x037a, B:37:0x01bb, B:39:0x01c3, B:41:0x01ce, B:44:0x01da, B:46:0x01e4, B:49:0x01ed, B:52:0x01f8, B:55:0x0203, B:58:0x020e, B:60:0x0216, B:62:0x021e, B:64:0x022a, B:66:0x0238, B:69:0x0242, B:72:0x024d, B:74:0x0255, B:76:0x0263, B:78:0x0271, B:80:0x0283, B:82:0x0291, B:84:0x029d, B:86:0x02a5, B:88:0x02ad, B:90:0x02b5, B:92:0x02c1, B:94:0x02c9, B:96:0x02da, B:98:0x02e2, B:100:0x02ee, B:102:0x02f6, B:104:0x0302, B:106:0x030a, B:108:0x0314, B:111:0x031f, B:114:0x0329, B:117:0x0334, B:119:0x033c, B:121:0x0347, B:123:0x034f, B:125:0x0359, B:139:0x004c, B:140:0x0054, B:142:0x0058, B:146:0x0062, B:149:0x006c, B:152:0x0077, B:155:0x0083, B:158:0x008e, B:162:0x0098, B:166:0x00a2, B:170:0x00ac, B:173:0x00b8, B:176:0x00c4, B:179:0x00ce, B:182:0x00d8, B:185:0x00e4, B:188:0x00ee, B:191:0x00f9, B:194:0x0103, B:197:0x010d, B:200:0x0118, B:203:0x0124, B:206:0x0130, B:209:0x013c, B:211:0x0148, B:214:0x0154, B:217:0x015e, B:221:0x0167, B:223:0x0171, B:226:0x017b, B:228:0x0185, B:230:0x018f, B:233:0x0199, B:236:0x01a4), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzagn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzagh[] d(Uri uri, Map map) {
        ArrayList arrayList;
        int i;
        String lastPathSegment;
        int i2;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
            }
            int i3 = 6;
            int i4 = 1;
            if (str != null) {
                String h = zzas.h(str);
                switch (h.hashCode()) {
                    case -2123537834:
                        break;
                    case -1662384011:
                        if (h.equals("video/mp2p")) {
                            i = 10;
                            break;
                        }
                        break;
                    case -1662384007:
                        if (h.equals("video/mp2t")) {
                            i = 11;
                            break;
                        }
                        break;
                    case -1662095187:
                        break;
                    case -1606874997:
                        break;
                    case -1487656890:
                        if (h.equals("image/avif")) {
                            i = 21;
                            break;
                        }
                        break;
                    case -1487464693:
                        break;
                    case -1487464690:
                        if (h.equals("image/heif")) {
                            i = 20;
                            break;
                        }
                        break;
                    case -1487394660:
                        if (h.equals("image/jpeg")) {
                            i = 14;
                            break;
                        }
                        break;
                    case -1487018032:
                        if (h.equals("image/webp")) {
                            i = 18;
                            break;
                        }
                        break;
                    case -1248337486:
                        break;
                    case -1079884372:
                        if (h.equals("video/x-msvideo")) {
                            i = 16;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (h.equals(MimeTypes.TEXT_VTT)) {
                            i = 13;
                            break;
                        }
                        break;
                    case -879272239:
                        if (h.equals("image/bmp")) {
                            i = 19;
                            break;
                        }
                        break;
                    case -879258763:
                        if (h.equals("image/png")) {
                            i = 17;
                            break;
                        }
                        break;
                    case -387023398:
                        if (h.equals("audio/x-matroska")) {
                            i = 6;
                            break;
                        }
                        break;
                    case -43467528:
                        if (h.equals(MimeTypes.APPLICATION_WEBM)) {
                            i = 6;
                            break;
                        }
                        break;
                    case 13915911:
                        if (h.equals("video/x-flv")) {
                            i = 5;
                            break;
                        }
                        break;
                    case 187078296:
                        if (h.equals(MimeTypes.AUDIO_AC3)) {
                            i = 0;
                            break;
                        }
                        break;
                    case 187078297:
                        if (h.equals("audio/ac4")) {
                            i = 1;
                            break;
                        }
                        break;
                    case 187078669:
                        if (h.equals("audio/amr")) {
                            i = 3;
                            break;
                        }
                        break;
                    case 187090232:
                        if (h.equals(MimeTypes.AUDIO_MP4)) {
                            i = 8;
                            break;
                        }
                        break;
                    case 187091926:
                        if (h.equals("audio/ogg")) {
                            i = 9;
                            break;
                        }
                        break;
                    case 187099443:
                        if (h.equals("audio/wav")) {
                            i = 12;
                            break;
                        }
                        break;
                    case 1331848029:
                        if (h.equals(MimeTypes.VIDEO_MP4)) {
                            i = 8;
                            break;
                        }
                        break;
                    case 1503095341:
                        if (h.equals(MimeTypes.AUDIO_AMR_NB)) {
                            i = 3;
                            break;
                        }
                        break;
                    case 1504578661:
                        if (h.equals(MimeTypes.AUDIO_E_AC3)) {
                            i = 0;
                            break;
                        }
                        break;
                    case 1504619009:
                        if (h.equals(MimeTypes.AUDIO_FLAC)) {
                            i = 4;
                            break;
                        }
                        break;
                    case 1504824762:
                        if (h.equals("audio/midi")) {
                            i = 15;
                            break;
                        }
                        break;
                    case 1504831518:
                        if (h.equals(MimeTypes.AUDIO_MPEG)) {
                            i = 7;
                            break;
                        }
                        break;
                    case 1505118770:
                        if (h.equals(MimeTypes.AUDIO_WEBM)) {
                            i = 6;
                            break;
                        }
                        break;
                    case 2039520277:
                        if (h.equals("video/x-matroska")) {
                            i = 6;
                            break;
                        }
                        break;
                }
                if (i != -1) {
                    a(arrayList, i);
                }
                lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                        i3 = 0;
                    } else {
                        if (!lastPathSegment.endsWith(".ac4")) {
                            i4 = 2;
                            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                                if (lastPathSegment.endsWith(".amr")) {
                                    i3 = 3;
                                } else if (lastPathSegment.endsWith(".flac")) {
                                    i3 = 4;
                                } else if (lastPathSegment.endsWith(".flv")) {
                                    i3 = 5;
                                } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                                    i3 = 15;
                                } else if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                                    if (lastPathSegment.endsWith(".mp3")) {
                                        i3 = 7;
                                    } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                                        i3 = 8;
                                    } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                                        i3 = 9;
                                    } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                                        i3 = 10;
                                    } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        i3 = 11;
                                    } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                                        i3 = 12;
                                    } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                                        i3 = 13;
                                    } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                                        i3 = 14;
                                    } else if (lastPathSegment.endsWith(".avi")) {
                                        i3 = 16;
                                    } else if (lastPathSegment.endsWith(".png")) {
                                        i3 = 17;
                                    } else if (lastPathSegment.endsWith(".webp")) {
                                        i3 = 18;
                                    } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                                        i3 = 19;
                                    } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
                                        i3 = 20;
                                    } else if (lastPathSegment.endsWith(".avif")) {
                                        i3 = 21;
                                    }
                                }
                            }
                        }
                        i3 = i4;
                    }
                    int[] iArr = c;
                    for (i2 = 0; i2 < 21; i2++) {
                        int i5 = iArr[i2];
                        if (i5 != i && i5 != i3) {
                            a(arrayList, i5);
                        }
                    }
                }
                i3 = -1;
                int[] iArr2 = c;
                while (i2 < 21) {
                }
            }
            i = -1;
            if (i != -1) {
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
            }
            i3 = -1;
            int[] iArr22 = c;
            while (i2 < 21) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzagh[]) arrayList.toArray(new zzagh[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    public final synchronized zzagh[] zza() {
        return d(Uri.EMPTY, new HashMap());
    }
}
