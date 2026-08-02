package com.google.android.gms.internal.ads;

import io.ktor.util.date.GMTDateParser;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzalz {
    private static final zzgtl zza = zzgtl.zza(zzgsk.zzc(AbstractJsonLexerKt.COLON));
    private static final zzgtl zzb = zzgtl.zza(zzgsk.zzc(GMTDateParser.ANY));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zza() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int zzb(zzafq zzafqVar, zzagp zzagpVar, List list) throws IOException {
        int i;
        char c;
        char c2;
        int i2 = this.zzd;
        if (i2 == 0) {
            long zzo = zzafqVar.zzo();
            zzagpVar.zza = (zzo == -1 || zzo < 8) ? 0L : zzo - 8;
            this.zzd = 1;
            return 1;
        }
        int i3 = 2;
        if (i2 != 1) {
            char c3 = 2819;
            short s = 2817;
            short s2 = 2816;
            short s3 = 2192;
            if (i2 != 2) {
                long zzn = zzafqVar.zzn();
                int zzo2 = (int) ((zzafqVar.zzo() - zzafqVar.zzn()) - this.zze);
                zzes zzesVar = new zzes(zzo2);
                zzafqVar.zzc(zzesVar.zzi(), 0, zzo2);
                int i4 = 0;
                while (true) {
                    List list2 = this.zzc;
                    if (i4 >= list2.size()) {
                        zzagpVar.zza = 0L;
                        return 1;
                    }
                    zzaly zzalyVar = (zzaly) list2.get(i4);
                    zzesVar.zzh((int) (zzalyVar.zza - zzn));
                    zzesVar.zzk(4);
                    int zzC = zzesVar.zzC();
                    String zzK = zzesVar.zzK(zzC, StandardCharsets.UTF_8);
                    switch (zzK.hashCode()) {
                        case -1711564334:
                            if (zzK.equals("SlowMotion_Data")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1332107749:
                            if (zzK.equals("Super_SlowMotion_Edit_Data")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1251387154:
                            if (zzK.equals("Super_SlowMotion_Data")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -830665521:
                            if (zzK.equals("Super_SlowMotion_Deflickering_On")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1760745220:
                            if (zzK.equals("Super_SlowMotion_BGM")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        c2 = 2192;
                    } else if (c == 1) {
                        c2 = 2816;
                    } else if (c == 2) {
                        c2 = 2817;
                    } else if (c == 3) {
                        c2 = c3;
                    } else {
                        if (c != 4) {
                            throw zzat.zzb("Invalid SEF name", null);
                        }
                        c2 = 2820;
                    }
                    int i5 = zzalyVar.zzb - (zzC + 8);
                    if (c2 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List zze = zzb.zze(zzesVar.zzK(i5, StandardCharsets.UTF_8));
                        for (int i6 = 0; i6 < zze.size(); i6++) {
                            List zze2 = zza.zze((CharSequence) zze.get(i6));
                            if (zze2.size() != 3) {
                                throw zzat.zzb(null, null);
                            }
                            try {
                                arrayList.add(new zzajp(Long.parseLong((String) zze2.get(0)), Long.parseLong((String) zze2.get(1)), 1 << (Integer.parseInt((String) zze2.get(2)) - 1)));
                            } catch (NumberFormatException e) {
                                throw zzat.zzb(null, e);
                            }
                        }
                        list.add(new zzajq(arrayList));
                    } else if (c2 != 2816 && c2 != 2817 && c2 != c3 && c2 != 2820) {
                        throw new IllegalStateException();
                    }
                    i4++;
                    c3 = 2819;
                }
            } else {
                long zzo3 = zzafqVar.zzo();
                int i7 = this.zze - 20;
                zzes zzesVar2 = new zzes(i7);
                zzafqVar.zzc(zzesVar2.zzi(), 0, i7);
                int i8 = 0;
                while (i8 < i7 / 12) {
                    zzesVar2.zzk(i3);
                    short zzw = zzesVar2.zzw();
                    if (zzw == s3 || zzw == s2 || zzw == s || zzw == 2819 || zzw == 2820) {
                        i = i7;
                        this.zzc.add(new zzaly(zzw, (zzo3 - this.zze) - zzesVar2.zzC(), zzesVar2.zzC()));
                    } else {
                        zzesVar2.zzk(8);
                        i = i7;
                    }
                    i8++;
                    i7 = i;
                    i3 = 2;
                    s = 2817;
                    s2 = 2816;
                    s3 = 2192;
                }
                List list3 = this.zzc;
                if (list3.isEmpty()) {
                    zzagpVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzagpVar.zza = ((zzaly) list3.get(0)).zza;
                }
            }
        } else {
            zzes zzesVar3 = new zzes(8);
            zzafqVar.zzc(zzesVar3.zzi(), 0, 8);
            this.zze = zzesVar3.zzC() + 8;
            if (zzesVar3.zzB() != 1397048916) {
                zzagpVar.zza = 0L;
            } else {
                zzagpVar.zza = zzafqVar.zzn() - (this.zze - 12);
                this.zzd = 2;
            }
        }
        return 1;
    }
}
