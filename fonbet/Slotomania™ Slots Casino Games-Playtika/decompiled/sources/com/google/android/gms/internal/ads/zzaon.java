package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzaon {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzes zzc = new zzes();
    private final StringBuilder zzd = new StringBuilder();

    static void zzb(zzes zzesVar) {
        while (true) {
            for (boolean z = true; zzesVar.zzd() > 0 && z; z = false) {
                char c = (char) zzesVar.zzi()[zzesVar.zzg()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzesVar.zzk(1);
                } else {
                    int zzg = zzesVar.zzg();
                    int zze = zzesVar.zze();
                    byte[] zzi = zzesVar.zzi();
                    if (zzg + 2 <= zze) {
                        int i = zzg + 1;
                        if (zzi[zzg] == 47) {
                            int i2 = zzg + 2;
                            if (zzi[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= zze) {
                                        break;
                                    }
                                    if (((char) zzi[i2]) == '*' && ((char) zzi[i3]) == '/') {
                                        zze = i2 + 2;
                                        i2 = zze;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzesVar.zzk(zze - zzesVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    static String zzc(zzes zzesVar, StringBuilder sb) {
        zzb(zzesVar);
        if (zzesVar.zzd() == 0) {
            return null;
        }
        String zzd = zzd(zzesVar, sb);
        if (!zzd.isEmpty()) {
            return zzd;
        }
        char zzs = (char) zzesVar.zzs();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zzs).length());
        sb2.append(zzs);
        return sb2.toString();
    }

    private static String zzd(zzes zzesVar, StringBuilder sb) {
        sb.setLength(0);
        int zzg = zzesVar.zzg();
        int zze = zzesVar.zze();
        loop0: while (true) {
            for (boolean z = false; zzg < zze && !z; z = true) {
                char c = (char) zzesVar.zzi()[zzg];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    sb.append(c);
                    zzg++;
                }
            }
        }
        zzesVar.zzk(zzg - zzesVar.zzg());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x031d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00aa, code lost:
    
        if (")".equals(zzc(r4, r1)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zza(zzes zzesVar) {
        String str;
        String sb;
        char c;
        StringBuilder sb2 = this.zzd;
        int i = 0;
        sb2.setLength(0);
        int zzg = zzesVar.zzg();
        while (!TextUtils.isEmpty(zzesVar.zzN(StandardCharsets.UTF_8))) {
        }
        zzes zzesVar2 = this.zzc;
        zzesVar2.zzb(zzesVar.zzi(), zzesVar.zzg());
        zzesVar2.zzh(zzg);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzb(zzesVar2);
            if (zzesVar2.zzd() >= 5 && "::cue".equals(zzesVar2.zzK(5, StandardCharsets.UTF_8))) {
                int zzg2 = zzesVar2.zzg();
                String zzc = zzc(zzesVar2, sb2);
                if (zzc != null) {
                    if ("{".equals(zzc)) {
                        zzesVar2.zzh(zzg2);
                        str = "";
                    } else if ("(".equals(zzc)) {
                        int zzg3 = zzesVar2.zzg();
                        int zze = zzesVar2.zze();
                        int i2 = i;
                        while (zzg3 < zze && i2 == 0) {
                            int i3 = zzg3 + 1;
                            i2 = ((char) zzesVar2.zzi()[zzg3]) == ')' ? 1 : i;
                            zzg3 = i3;
                        }
                        str = zzesVar2.zzK((zzg3 - 1) - zzesVar2.zzg(), StandardCharsets.UTF_8).trim();
                    } else {
                        str = null;
                    }
                    if (str == null || !"{".equals(zzc(zzesVar2, sb2))) {
                        break;
                    }
                    zzaoo zzaooVar = new zzaoo();
                    if (!str.isEmpty()) {
                        int indexOf = str.indexOf(91);
                        if (indexOf != -1) {
                            Matcher matcher = zza.matcher(str.substring(indexOf));
                            if (matcher.matches()) {
                                String group = matcher.group(1);
                                group.getClass();
                                zzaooVar.zzd(group);
                            }
                            str = str.substring(i, indexOf);
                        }
                        String str2 = zzfk.zza;
                        String[] split = str.split("\\.", -1);
                        String str3 = split[i];
                        int indexOf2 = str3.indexOf(35);
                        if (indexOf2 != -1) {
                            zzaooVar.zzb(str3.substring(i, indexOf2));
                            zzaooVar.zza(str3.substring(indexOf2 + 1));
                        } else {
                            zzaooVar.zzb(str3);
                        }
                        int length = split.length;
                        if (length > 1) {
                            zzaooVar.zzc((String[]) Arrays.copyOfRange(split, 1, length));
                        }
                    }
                    int i4 = i;
                    String str4 = null;
                    while (i4 == 0) {
                        int zzg4 = zzesVar2.zzg();
                        str4 = zzc(zzesVar2, sb2);
                        int i5 = (str4 == null || "}".equals(str4)) ? 1 : i;
                        if (i5 == 0) {
                            zzesVar2.zzh(zzg4);
                            zzb(zzesVar2);
                            String zzd = zzd(zzesVar2, sb2);
                            if (!zzd.isEmpty() && ":".equals(zzc(zzesVar2, sb2))) {
                                zzb(zzesVar2);
                                StringBuilder sb3 = new StringBuilder();
                                int i6 = i;
                                while (true) {
                                    if (i6 != 0) {
                                        sb = sb3.toString();
                                        break;
                                    }
                                    int zzg5 = zzesVar2.zzg();
                                    String zzc2 = zzc(zzesVar2, sb2);
                                    if (zzc2 == null) {
                                        sb = null;
                                        break;
                                    }
                                    if ("}".equals(zzc2) || ";".equals(zzc2)) {
                                        zzesVar2.zzh(zzg5);
                                        i6 = 1;
                                    } else {
                                        sb3.append(zzc2);
                                    }
                                }
                                if (sb != null && !sb.isEmpty()) {
                                    int zzg6 = zzesVar2.zzg();
                                    String zzc3 = zzc(zzesVar2, sb2);
                                    if (!";".equals(zzc3)) {
                                        if ("}".equals(zzc3)) {
                                            zzesVar2.zzh(zzg6);
                                        } else {
                                            continue;
                                        }
                                    }
                                    if ("color".equals(zzd)) {
                                        zzaooVar.zzn(zzdq.zzb(sb));
                                    } else if ("background-color".equals(zzd)) {
                                        zzaooVar.zzq(zzdq.zzb(sb));
                                    } else if ("ruby-position".equals(zzd)) {
                                        if ("over".equals(sb)) {
                                            zzaooVar.zzw(1);
                                        } else if ("under".equals(sb)) {
                                            zzaooVar.zzw(2);
                                        }
                                    } else if ("text-combine-upright".equals(zzd)) {
                                        zzaooVar.zzy(TtmlNode.COMBINE_ALL.equals(sb) || sb.startsWith("digits"));
                                    } else if ("text-decoration".equals(zzd)) {
                                        if (TtmlNode.UNDERLINE.equals(sb)) {
                                            zzaooVar.zzh(true);
                                        }
                                    } else if ("font-family".equals(zzd)) {
                                        zzaooVar.zzl(sb);
                                    } else if ("font-weight".equals(zzd)) {
                                        if (TtmlNode.BOLD.equals(sb)) {
                                            zzaooVar.zzi(true);
                                        }
                                    } else if ("font-style".equals(zzd)) {
                                        if (TtmlNode.ITALIC.equals(sb)) {
                                            zzaooVar.zzj(true);
                                        }
                                    } else if ("font-size".equals(zzd)) {
                                        Matcher matcher2 = zzb.matcher(zzgsf.zza(sb));
                                        if (matcher2.matches()) {
                                            String group2 = matcher2.group(2);
                                            group2.getClass();
                                            int hashCode = group2.hashCode();
                                            if (hashCode == 37) {
                                                if (group2.equals("%")) {
                                                    c = 2;
                                                    if (c != 0) {
                                                    }
                                                    String group3 = matcher2.group(1);
                                                    group3.getClass();
                                                    zzaooVar.zzs(Float.parseFloat(group3));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                String group32 = matcher2.group(1);
                                                group32.getClass();
                                                zzaooVar.zzs(Float.parseFloat(group32));
                                            } else if (hashCode != 3240) {
                                                if (hashCode == 3592 && group2.equals("px")) {
                                                    c = 0;
                                                    if (c != 0) {
                                                        zzaooVar.zzt(1);
                                                    } else if (c == 1) {
                                                        zzaooVar.zzt(2);
                                                    } else {
                                                        if (c != 2) {
                                                            throw new IllegalStateException();
                                                        }
                                                        zzaooVar.zzt(3);
                                                    }
                                                    String group322 = matcher2.group(1);
                                                    group322.getClass();
                                                    zzaooVar.zzs(Float.parseFloat(group322));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                String group3222 = matcher2.group(1);
                                                group3222.getClass();
                                                zzaooVar.zzs(Float.parseFloat(group3222));
                                            } else {
                                                if (group2.equals(UserDataStore.EMAIL)) {
                                                    c = 1;
                                                    if (c != 0) {
                                                    }
                                                    String group32222 = matcher2.group(1);
                                                    group32222.getClass();
                                                    zzaooVar.zzs(Float.parseFloat(group32222));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                String group322222 = matcher2.group(1);
                                                group322222.getClass();
                                                zzaooVar.zzs(Float.parseFloat(group322222));
                                            }
                                        } else {
                                            StringBuilder sb4 = new StringBuilder(sb.length() + 22);
                                            sb4.append("Invalid font-size: '");
                                            sb4.append(sb);
                                            sb4.append("'.");
                                            zzef.zzc("WebvttCssParser", sb4.toString());
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        i4 = i5;
                        i = 0;
                    }
                    if ("}".equals(str4)) {
                        arrayList.add(zzaooVar);
                    }
                    i = 0;
                }
            }
            str = null;
            if (str == null) {
                break;
            }
            break;
        }
    }
}
