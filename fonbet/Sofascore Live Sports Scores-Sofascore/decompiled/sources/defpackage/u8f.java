package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzahj;
import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzcyj;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdlb;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhgu;
import com.google.android.gms.internal.ads.zzhhf;
import com.google.android.gms.internal.ads.zzhjy;
import com.google.android.gms.internal.ads.zzhlt;
import com.google.android.gms.internal.ads.zzhlx;
import com.google.android.gms.internal.ads.zzhmw;
import com.google.android.gms.internal.ads.zzhoc;
import com.google.android.gms.internal.ads.zzhoj;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhsf;
import com.google.android.gms.internal.ads.zzhsg;
import com.google.android.gms.internal.ads.zzhsh;
import com.google.android.gms.internal.ads.zzhsi;
import com.google.android.gms.internal.ads.zzhuz;
import com.google.android.gms.internal.ads.zzhwg;
import com.google.android.gms.internal.ads.zzhwo;
import com.google.android.gms.internal.ads.zzhxn;
import com.google.android.gms.internal.ads.zzhxo;
import com.google.android.gms.internal.ads.zzhxq;
import com.google.android.gms.internal.ads.zzhxt;
import com.google.android.gms.internal.ads.zzhzk;
import com.google.android.gms.internal.ads.zzhzt;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.cast.zzje;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.InvalidProtocolBufferException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u8f implements obg, yfb, cpi, uqg, shn, don, fon, zzdjm, zzcyj, Continuation, zzhoj, zzhoc, zzhmw, zzje, zzeb {
    public static final /* synthetic */ u8f b = new u8f(9);
    public static final /* synthetic */ u8f c = new u8f(10);
    public static final /* synthetic */ u8f d = new u8f(11);
    public static final /* synthetic */ u8f e = new u8f(12);
    public static final /* synthetic */ u8f f = new u8f(13);
    public static final /* synthetic */ u8f g = new u8f(14);
    public static final /* synthetic */ u8f h = new u8f(15);
    public static final /* synthetic */ u8f i = new u8f(16);
    public static final /* synthetic */ u8f j = new u8f(17);
    public static final /* synthetic */ u8f k = new u8f(19);
    public static final /* synthetic */ u8f l = new u8f(20);
    public static final /* synthetic */ u8f m = new u8f(22);
    public static final /* synthetic */ u8f n = new u8f(23);
    public final /* synthetic */ int a;

    public static String b(ByteBuffer byteBuffer, int i2, int i3) {
        if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
            yhk.p("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)});
            return null;
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b2 = byteBuffer.get(i2);
            if (b2 < 0) {
                break;
            }
            i2++;
            cArr[i5] = (char) b2;
            i5++;
        }
        int i6 = i5;
        while (i2 < i4) {
            int i7 = i2 + 1;
            byte b3 = byteBuffer.get(i2);
            if (b3 >= 0) {
                int i8 = i6 + 1;
                cArr[i6] = (char) b3;
                int i9 = i7;
                while (i9 < i4) {
                    byte b4 = byteBuffer.get(i9);
                    if (b4 < 0) {
                        break;
                    }
                    i9++;
                    cArr[i8] = (char) b4;
                    i8++;
                }
                i6 = i8;
                i2 = i9;
            } else if (b3 < -32) {
                if (i7 >= i4) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                i2 += 2;
                ufa.v(b3, byteBuffer.get(i7), cArr, i6);
                i6++;
            } else if (b3 < -16) {
                if (i7 >= i4 - 1) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                int i10 = i2 + 2;
                i2 += 3;
                ufa.u(b3, byteBuffer.get(i7), byteBuffer.get(i10), cArr, i6);
                i6++;
            } else {
                if (i7 >= i4 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                byte b5 = byteBuffer.get(i7);
                int i11 = i2 + 3;
                byte b6 = byteBuffer.get(i2 + 2);
                i2 += 4;
                ufa.t(b3, b5, b6, byteBuffer.get(i11), cArr, i6);
                i6 += 2;
            }
        }
        return new String(cArr, 0, i6);
    }

    public static void d(String str, ByteBuffer byteBuffer) {
        int i2;
        int length = str.length();
        int position = byteBuffer.position();
        int i3 = 0;
        while (i3 < length) {
            try {
                char charAt = str.charAt(i3);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i3, (byte) charAt);
                i3++;
            } catch (IndexOutOfBoundsException unused) {
                yhk.f(str.charAt(i3), Math.max(i3, (position - byteBuffer.position()) + 1) + byteBuffer.position());
                return;
            }
        }
        if (i3 == length) {
            byteBuffer.position(position + i3);
            return;
        }
        position += i3;
        while (i3 < length) {
            char charAt2 = str.charAt(i3);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i4 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | PsExtractor.AUDIO_STREAM));
                    byteBuffer.put(i4, (byte) ((charAt2 & '?') | 128));
                    position = i4;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i4;
                    yhk.f(str.charAt(i3), Math.max(i3, (position - byteBuffer.position()) + 1) + byteBuffer.position());
                    return;
                }
            } else {
                if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i5 = i3 + 1;
                    if (i5 != length) {
                        try {
                            char charAt3 = str.charAt(i5);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i6 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    i2 = position + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i6;
                                    i3 = i5;
                                    yhk.f(str.charAt(i3), Math.max(i3, (position - byteBuffer.position()) + 1) + byteBuffer.position());
                                    return;
                                }
                                try {
                                    byteBuffer.put(i6, (byte) (((codePoint >>> 12) & 63) | 128));
                                    position += 3;
                                    byteBuffer.put(i2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                    i3 = i5;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i3 = i5;
                                    position = i2;
                                    yhk.f(str.charAt(i3), Math.max(i3, (position - byteBuffer.position()) + 1) + byteBuffer.position());
                                    return;
                                }
                            } else {
                                i3 = i5;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new cik(i3, length);
                }
                int i7 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position += 2;
                byteBuffer.put(i7, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i3++;
            position++;
        }
        byteBuffer.position(position);
    }

    public static int m(int i2, int i3, int i4, ByteBuffer byteBuffer) {
        byte b2;
        int i5;
        byte b3;
        int i6;
        int i7 = i3;
        if (i2 != 0) {
            if (i7 >= i4) {
                return i2;
            }
            byte b4 = (byte) i2;
            if (b4 < -32) {
                if (b4 < -62) {
                    return -1;
                }
                int i8 = i7 + 1;
                if (byteBuffer.get(i7) > -65) {
                    return -1;
                }
                i7 = i8;
            } else if (b4 < -16) {
                byte b5 = (byte) (~(i2 >> 8));
                if (b5 == 0) {
                    i6 = i7 + 1;
                    b3 = byteBuffer.get(i7);
                    if (i6 >= i4) {
                        return fik.e(b4, b3);
                    }
                } else {
                    b3 = b5;
                    i6 = i7;
                }
                if (b3 > -65) {
                    return -1;
                }
                if (b4 == -32 && b3 < -96) {
                    return -1;
                }
                if (b4 == -19 && b3 >= -96) {
                    return -1;
                }
                i7 = i6 + 1;
                if (byteBuffer.get(i6) > -65) {
                    return -1;
                }
            } else {
                byte b6 = (byte) (~(i2 >> 8));
                if (b6 == 0) {
                    i5 = i7 + 1;
                    b6 = byteBuffer.get(i7);
                    if (i5 >= i4) {
                        return fik.e(b4, b6);
                    }
                    b2 = 0;
                } else {
                    b2 = (byte) (i2 >> 16);
                    i5 = i7;
                }
                if (b2 == 0) {
                    int i9 = i5 + 1;
                    byte b7 = byteBuffer.get(i5);
                    if (i9 >= i4) {
                        return fik.f(b4, b6, b7);
                    }
                    b2 = b7;
                    i5 = i9;
                }
                if (b6 > -65) {
                    return -1;
                }
                if ((((b6 + 112) + (b4 << 28)) >> 30) != 0 || b2 > -65) {
                    return -1;
                }
                i7 = i5 + 1;
                if (byteBuffer.get(i5) > -65) {
                    return -1;
                }
            }
        }
        u8f u8fVar = fik.a;
        int i10 = i4 - 7;
        int i11 = i7;
        while (i11 < i10 && (byteBuffer.getLong(i11) & (-9187201950435737472L)) == 0) {
            i11 += 8;
        }
        int i12 = (i11 - i7) + i7;
        while (i12 < i4) {
            int i13 = i12 + 1;
            byte b8 = byteBuffer.get(i12);
            if (b8 >= 0) {
                i12 = i13;
            } else if (b8 < -32) {
                if (i13 >= i4) {
                    return b8;
                }
                if (b8 < -62 || byteBuffer.get(i13) > -65) {
                    return -1;
                }
                i12 += 2;
            } else if (b8 < -16) {
                if (i13 >= i4 - 1) {
                    return fik.g(b8, i13, i4 - i13, byteBuffer);
                }
                int i14 = i12 + 2;
                byte b9 = byteBuffer.get(i13);
                if (b9 > -65) {
                    return -1;
                }
                if (b8 == -32 && b9 < -96) {
                    return -1;
                }
                if ((b8 == -19 && b9 >= -96) || byteBuffer.get(i14) > -65) {
                    return -1;
                }
                i12 += 3;
            } else {
                if (i13 >= i4 - 2) {
                    return fik.g(b8, i13, i4 - i13, byteBuffer);
                }
                int i15 = i12 + 2;
                byte b10 = byteBuffer.get(i13);
                if (b10 > -65) {
                    return -1;
                }
                if ((((b10 + 112) + (b8 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i16 = i12 + 3;
                if (byteBuffer.get(i15) > -65) {
                    return -1;
                }
                i12 += 4;
                if (byteBuffer.get(i16) > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static boolean q(int i2, int i3, byte[] bArr) {
        int i4;
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 < i3) {
            while (i2 < i3) {
                int i5 = i2 + 1;
                i4 = bArr[i2];
                if (i4 < 0) {
                    if (i4 >= -32) {
                        if (i4 >= -16) {
                            if (i5 < i3 - 2) {
                                int i6 = i2 + 2;
                                int i7 = bArr[i5];
                                if (i7 <= -65) {
                                    if ((((i7 + 112) + (i4 << 28)) >> 30) == 0) {
                                        int i8 = i2 + 3;
                                        if (bArr[i6] <= 65471) {
                                            i2 += 4;
                                            if (bArr[i8] > 65471) {
                                            }
                                        }
                                    }
                                }
                                i4 = -1;
                                break;
                            }
                            i4 = cno.a(i5, i3, bArr);
                            break;
                        }
                        if (i5 < i3 - 1) {
                            int i9 = i2 + 2;
                            char c2 = bArr[i5];
                            if (c2 <= 65471 && ((i4 != -32 || c2 >= 65440) && (i4 != -19 || c2 < 65440))) {
                                i2 += 3;
                                if (bArr[i9] > 65471) {
                                }
                            }
                            i4 = -1;
                            break;
                        }
                        i4 = cno.a(i5, i3, bArr);
                        break;
                    }
                    if (i5 >= i3) {
                        break;
                    }
                    if (i4 >= -62) {
                        i2 += 2;
                        if (bArr[i5] > 65471) {
                        }
                    }
                    i4 = -1;
                    break;
                }
                i2 = i5;
            }
        }
        i4 = 0;
        return i4 == 0;
    }

    public String a(int i2, int i3, byte[] bArr) {
        if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
            yhk.p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)});
            return null;
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                break;
            }
            i2++;
            cArr[i5] = (char) b2;
            i5++;
        }
        int i6 = i5;
        while (i2 < i4) {
            int i7 = i2 + 1;
            byte b3 = bArr[i2];
            if (b3 >= 0) {
                int i8 = i6 + 1;
                cArr[i6] = (char) b3;
                int i9 = i7;
                while (i9 < i4) {
                    byte b4 = bArr[i9];
                    if (b4 < 0) {
                        break;
                    }
                    i9++;
                    cArr[i8] = (char) b4;
                    i8++;
                }
                i6 = i8;
                i2 = i9;
            } else if (b3 < -32) {
                if (i7 >= i4) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                i2 += 2;
                ufa.v(b3, bArr[i7], cArr, i6);
                i6++;
            } else if (b3 < -16) {
                if (i7 >= i4 - 1) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                int i10 = i2 + 2;
                i2 += 3;
                ufa.u(b3, bArr[i7], bArr[i10], cArr, i6);
                i6++;
            } else {
                if (i7 >= i4 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                byte b5 = bArr[i7];
                int i11 = i2 + 3;
                byte b6 = bArr[i2 + 2];
                i2 += 4;
                ufa.t(b3, b5, b6, bArr[i11], cArr, i6);
                i6 += 2;
            }
        }
        return new String(cArr, 0, i6);
    }

    @Override // defpackage.shn
    public long c(zzagi zzagiVar) {
        return -1L;
    }

    public boolean f(byte[] bArr, int i2, int i3) {
        return j(0, bArr, i2, i3) == 0;
    }

    @Override // defpackage.uqg
    public Object g(lpg lpgVar, Object obj) {
        v9f v9fVar;
        z9k z9kVar = (z9k) obj;
        xbb b2 = a.b();
        b2.add(Integer.valueOf(z9kVar.a));
        SnapshotStateList snapshotStateList = z9kVar.b;
        b2.add(Integer.valueOf(snapshotStateList.size()));
        SnapshotStateList snapshotStateList2 = z9kVar.c;
        b2.add(Integer.valueOf(snapshotStateList2.size()));
        int size = snapshotStateList.size();
        int i2 = 0;
        while (true) {
            v9fVar = kfj.i;
            if (i2 >= size) {
                break;
            }
            b2.add(v9fVar.g(lpgVar, snapshotStateList.get(i2)));
            i2++;
        }
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            b2.add(v9fVar.g(lpgVar, snapshotStateList2.get(i3)));
        }
        return a.a(b2);
    }

    public int h(int i2, int i3, int i4, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return byteBuffer.isDirect() ? m(i2, i3, i4, byteBuffer) : m(i2, i3, i4, byteBuffer);
        }
        int arrayOffset = byteBuffer.arrayOffset();
        return j(i2, byteBuffer.array(), i3 + arrayOffset, arrayOffset + i4);
    }

    @Override // defpackage.cpi
    public boolean i(SwipeRefreshLayout swipeRefreshLayout, View view) {
        usk uskVar;
        if (!(view instanceof ViewGroup)) {
            if (view != null) {
                return view.canScrollVertically(-1);
            }
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup instanceof AbsListView) {
            return ((AbsListView) view).canScrollVertically(-1);
        }
        if (viewGroup instanceof ScrollView) {
            return ((ScrollView) view).canScrollVertically(-1);
        }
        if (viewGroup instanceof NestedScrollView) {
            return ((NestedScrollView) view).canScrollVertically(-1);
        }
        Iterator it = new tsk(viewGroup).iterator();
        do {
            uskVar = (usk) it;
            if (!uskVar.hasNext()) {
                return false;
            }
        } while (!((View) uskVar.next()).canScrollVertically(-1));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r12[r13] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r12[r13] > (-65)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        if (r12[r13] > (-65)) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int j(int i2, byte[] bArr, int i3, int i4) {
        byte b2;
        int i5;
        if (i2 != 0) {
            if (i3 >= i4) {
                return i2;
            }
            byte b3 = (byte) i2;
            if (b3 < -32) {
                if (b3 >= -62) {
                    i5 = i3 + 1;
                }
                return -1;
            }
            if (b3 < -16) {
                byte b4 = (byte) (~(i2 >> 8));
                if (b4 == 0) {
                    int i6 = i3 + 1;
                    byte b5 = bArr[i3];
                    if (i6 >= i4) {
                        return fik.e(b3, b5);
                    }
                    i3 = i6;
                    b4 = b5;
                }
                if (b4 <= -65 && ((b3 != -32 || b4 >= -96) && (b3 != -19 || b4 < -96))) {
                    i5 = i3 + 1;
                }
                return -1;
            }
            byte b6 = (byte) (~(i2 >> 8));
            if (b6 == 0) {
                int i7 = i3 + 1;
                b6 = bArr[i3];
                if (i7 >= i4) {
                    return fik.e(b3, b6);
                }
                i3 = i7;
                b2 = 0;
            } else {
                b2 = (byte) (i2 >> 16);
            }
            if (b2 == 0) {
                int i8 = i3 + 1;
                byte b7 = bArr[i3];
                if (i8 >= i4) {
                    return fik.f(b3, b6, b7);
                }
                i3 = i8;
                b2 = b7;
            }
            if (b6 <= -65) {
                if ((((b6 + 112) + (b3 << 28)) >> 30) == 0 && b2 <= -65) {
                    i5 = i3 + 1;
                }
            }
            return -1;
            i3 = i5;
        }
        while (i3 < i4 && bArr[i3] >= 0) {
            i3++;
        }
        if (i3 < i4) {
            while (i3 < i4) {
                int i9 = i3 + 1;
                byte b8 = bArr[i3];
                if (b8 < 0) {
                    if (b8 < -32) {
                        if (i9 >= i4) {
                            return b8;
                        }
                        if (b8 >= -62) {
                            i3 += 2;
                            if (bArr[i9] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b8 < -16) {
                        if (i9 >= i4 - 1) {
                            return fik.h(bArr, i9, i4);
                        }
                        int i10 = i3 + 2;
                        byte b9 = bArr[i9];
                        if (b9 <= -65 && ((b8 != -32 || b9 >= -96) && (b8 != -19 || b9 < -96))) {
                            i3 += 3;
                            if (bArr[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i9 >= i4 - 2) {
                        return fik.h(bArr, i9, i4);
                    }
                    int i11 = i3 + 2;
                    byte b10 = bArr[i9];
                    if (b10 <= -65) {
                        if ((((b10 + 112) + (b8 << 28)) >> 30) == 0) {
                            int i12 = i3 + 3;
                            if (bArr[i11] <= -65) {
                                i3 += 4;
                                if (bArr[i12] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i3 = i9;
            }
        }
        return 0;
    }

    @Override // defpackage.uqg
    public Object k(Object obj) {
        v9f v9fVar;
        obj.getClass();
        List list = (List) obj;
        int intValue = ((Number) list.get(0)).intValue();
        int intValue2 = ((Number) list.get(1)).intValue();
        int intValue3 = ((Number) list.get(2)).intValue();
        xbb b2 = a.b();
        int i2 = 3;
        while (true) {
            int i3 = intValue2 + 3;
            v9fVar = kfj.i;
            if (i2 >= i3) {
                break;
            }
            b2.add(v9fVar.k(list.get(i2)));
            i2++;
        }
        xbb a = a.a(b2);
        xbb b3 = a.b();
        while (i2 < intValue2 + intValue3 + 3) {
            b3.add(v9fVar.k(list.get(i2)));
            i2++;
        }
        return new z9k(a, a.a(b3), intValue);
    }

    @Override // com.google.android.gms.internal.ads.zzhoc
    public zzhot l(zzhfj zzhfjVar) {
        zzhgu zzhguVar = (zzhgu) zzhfjVar;
        jno jnoVar = zzhjy.a;
        zzhfm a = zzhjy.a(zzhguVar.c);
        zzhsf G = zzhsg.G();
        zzhsh E = zzhsi.E();
        int i2 = zzhguVar.b;
        E.n();
        ((zzhsi) E.b).G(i2);
        zzhsi zzhsiVar = (zzhsi) E.o();
        G.n();
        ((zzhsg) G.b).H(zzhsiVar);
        int i3 = zzhguVar.a;
        G.n();
        ((zzhsg) G.b).I(i3);
        return zzhot.a("type.googleapis.com/google.crypto.tink.AesEaxKey", a, (mpo) ((zzhsg) G.o()).e());
    }

    @Override // defpackage.yfb
    public void load() {
        synchronized (td4.f) {
            Object obj = td4.g;
            synchronized (obj) {
                if (td4.h) {
                    return;
                }
                long i0 = td4.i0();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    td4.i = i0;
                    td4.h = true;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhmw
    public zzhes n(zzhos zzhosVar, zzhfr zzhfrVar) {
        jno jnoVar = zzhzt.a;
        String str = zzhosVar.a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            a70.p("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            zziei zzieiVar = zzhosVar.c;
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhuz H = zzhuz.H(zzieiVar, zziew.c);
            if (H.D() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, H.F().d());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = zzhxq.e;
            int i3 = 0;
            zzhxn zzhxnVar = new zzhxn(i3);
            zzhxnVar.c = (zzhxo) zzhzt.g.c(H.E().D());
            zzhxnVar.b = new BigInteger(1, H.G().d());
            zzhxnVar.a(bitLength);
            zzhxnVar.d = zzhzt.b(zzhosVar.e);
            zzhxq b2 = zzhxnVar.b();
            zzhxt zzhxtVar = new zzhxt(i3);
            zzhxtVar.a = b2;
            zzhxtVar.b = bigInteger;
            zzhxtVar.c = zzhosVar.f;
            return zzhxtVar.a();
        } catch (zzige | IllegalArgumentException unused) {
            zzl.x("Parsing RsaSsaPkcs1PublicKey failed");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhoj
    public Object o(zzhes zzhesVar) {
        switch (this.a) {
            case 19:
                return zzhlt.a((zzhhf) zzhesVar);
            default:
                zzhwo zzhwoVar = (zzhwo) zzhesVar;
                if (zzhlx.a(1)) {
                    try {
                        return zzhzk.a(zzhwoVar);
                    } catch (GeneralSecurityException unused) {
                        return new poo(zzhwoVar.b.b(), zzhwoVar.c.b(), zzhwoVar.a.a.equals(zzhwg.d) ? new byte[]{0} : new byte[0]);
                    }
                }
                zzl.x("Can not use Ed25519 in FIPS-mode.");
                return null;
        }
    }

    public kbg p(jag jagVar, pgg pggVar, mjg mjgVar, nig nigVar, nbg nbgVar, qcg qcgVar) {
        pgg pggVar2;
        mjg mjgVar2;
        nig nigVar2;
        nbg nbgVar2;
        String str;
        jagVar.getClass();
        pggVar.getClass();
        mjgVar.getClass();
        qcgVar.getClass();
        try {
            String str2 = jagVar.e;
            if ((str2 == null || str2.length() == 0) && ((str = jagVar.f) == null || str.length() == 0)) {
                throw new wo0("Both html content and scriptUrl are null or empty");
            }
            String str3 = jagVar.e;
            String str4 = jagVar.f;
            String str5 = jagVar.g;
            Integer num = jagVar.o;
            Integer num2 = jagVar.p;
            Boolean bool = jagVar.i;
            try {
                return new tdg(new jdg(str3, str4, str5, num, num2, bool != null ? bool.booleanValue() : false), pggVar, mjgVar, nigVar, nbgVar, qcgVar);
            } catch (Exception unused) {
                pggVar = pggVar;
                mjgVar = mjgVar;
                nigVar = nigVar;
                nbgVar = nbgVar;
                try {
                    pggVar2 = pggVar;
                    mjgVar2 = mjgVar;
                    nigVar2 = nigVar;
                    nbgVar2 = nbgVar;
                } catch (Exception unused2) {
                }
                try {
                    return new yhg(yfa.l(jagVar), pggVar2, mjgVar2, nigVar2, nbgVar2);
                } catch (Exception unused3) {
                    pggVar = pggVar2;
                    mjgVar = mjgVar2;
                    nigVar = nigVar2;
                    nbgVar = nbgVar2;
                    try {
                        return new tfg(sea.m(jagVar), pggVar, mjgVar, nigVar, nbgVar);
                    } catch (Exception unused4) {
                        throw new geg("The received ad is not valid! Check that your placement is valid and that your SDK is up-to-date.");
                    }
                }
            }
        } catch (Exception unused5) {
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        List list = (List) task.getResult();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        ((s9o) it.next()).getClass();
        throw null;
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 9:
                List list = zzfy.a;
                return zzags.b.get().F();
            case 10:
                List list2 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().t());
            case 11:
                List list3 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().N());
            case 12:
            case 13:
            default:
                List list4 = zzfy.a;
                return Boolean.valueOf(zzaif.b.get().zzf());
            case 14:
                List list5 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzu());
            case 15:
                List list6 = zzfy.a;
                return zzags.b.get().zzF();
        }
    }

    @Override // defpackage.shn
    public zzahk zzc() {
        return new zzahj(C.TIME_UNSET, 0L);
    }

    public /* synthetic */ u8f(int i2) {
        this.a = i2;
    }

    @Override // defpackage.yfb
    public void cancelLoad() {
    }

    @Override // defpackage.shn
    public void e(long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 12:
                ((zzr) obj).zzdx();
                break;
            case 13:
                ((zzdlb) obj).zzg();
                break;
            case 25:
                break;
            default:
                break;
        }
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public /* synthetic */ zzea mo792zza() {
        return null;
    }
}
