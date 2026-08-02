package defpackage;

import com.sofascore.model.buzzer.APIBuzzerTile;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.newNetwork.mediaposts.MediaType;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qe8 implements Comparator {
    public static final qe8 b = new qe8(0);
    public static final qe8 c = new qe8(1);
    public static final qe8 d = new qe8(2);
    public static final qe8 e = new qe8(3);
    public static final qe8 f = new qe8(4);
    public static final qe8 g = new qe8(5);
    public static final qe8 h = new qe8(6);
    public static final qe8 i = new qe8(7);
    public static final qe8 j = new qe8(8);
    public final /* synthetic */ int a;

    public /* synthetic */ qe8(int i2) {
        this.a = i2;
    }

    public static int a(MediaPost mediaPost) {
        MediaType type = mediaPost.getType();
        List<String> tags = mediaPost.getTags();
        if (type == MediaType.TripleDouble || type == MediaType.TournamentWinner) {
            return 1;
        }
        if (tags == null || !tags.isEmpty()) {
            for (String str : tags) {
                if (str != null && str.equalsIgnoreCase("exceptional")) {
                    return 2;
                }
            }
        }
        int i2 = type == null ? -1 : w4c.a[type.ordinal()];
        return (i2 == 1 || i2 == 2) ? 3 : 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ne8 ne8Var = (ne8) obj;
                ne8 ne8Var2 = (ne8) obj2;
                if (l98.Y(ne8Var) && l98.Y(ne8Var2)) {
                    wma c0 = c6o.c0(ne8Var);
                    wma c02 = c6o.c0(ne8Var2);
                    if (!Intrinsics.c(c0, c02)) {
                        wma[] wmaVarArr = new wma[16];
                        int i2 = 0;
                        while (c0 != null) {
                            int i3 = i2 + 1;
                            if (wmaVarArr.length < i3) {
                                int length = wmaVarArr.length;
                                ?? r4 = new Object[Math.max(i3, length * 2)];
                                System.arraycopy(wmaVarArr, 0, r4, 0, length);
                                wmaVarArr = r4;
                            }
                            if (i2 != 0) {
                                System.arraycopy(wmaVarArr, 0, wmaVarArr, 0 + 1, i2 + 0);
                            }
                            wmaVarArr[0] = c0;
                            i2++;
                            c0 = c0.v();
                        }
                        wma[] wmaVarArr2 = new wma[16];
                        int i4 = 0;
                        while (c02 != null) {
                            int i5 = i4 + 1;
                            if (wmaVarArr2.length < i5) {
                                int length2 = wmaVarArr2.length;
                                ?? r42 = new Object[Math.max(i5, length2 * 2)];
                                System.arraycopy(wmaVarArr2, 0, r42, 0, length2);
                                wmaVarArr2 = r42;
                            }
                            if (i4 != 0) {
                                System.arraycopy(wmaVarArr2, 0, wmaVarArr2, 0 + 1, i4 + 0);
                            }
                            wmaVarArr2[0] = c02;
                            i4++;
                            c02 = c02.v();
                        }
                        int min = Math.min(i2 - 1, i4 - 1);
                        if (min >= 0) {
                            int i6 = 0;
                            while (Intrinsics.c(wmaVarArr[i6], wmaVarArr2[i6])) {
                                if (i6 != min) {
                                    i6++;
                                }
                            }
                            break;
                        }
                        a70.r("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else if (l98.Y(ne8Var)) {
                    break;
                } else if (l98.Y(ne8Var2)) {
                }
                break;
            case 1:
                oqf h2 = ((s3h) obj).h();
                oqf h3 = ((s3h) obj2).h();
                int compare = Float.compare(h2.a, h3.a);
                if (compare == 0) {
                    int compare2 = Float.compare(h2.b, h3.b);
                    if (compare2 == 0) {
                        int compare3 = Float.compare(h2.d, h3.d);
                        if (compare3 == 0) {
                            break;
                        }
                    }
                }
                break;
            case 2:
                MediaPost mediaPost = (MediaPost) obj;
                MediaPost mediaPost2 = (MediaPost) obj2;
                mediaPost.getClass();
                mediaPost2.getClass();
                break;
            case 6:
                wma wmaVar = (wma) obj;
                wma wmaVar2 = (wma) obj2;
                int d2 = Intrinsics.d(wmaVar2.p, wmaVar.p);
                if (d2 == 0) {
                    break;
                }
                break;
            case 7:
                oqf h4 = ((s3h) obj).h();
                oqf h5 = ((s3h) obj2).h();
                int compare4 = Float.compare(h5.c, h4.c);
                if (compare4 == 0) {
                    int compare5 = Float.compare(h4.b, h5.b);
                    if (compare5 == 0) {
                        int compare6 = Float.compare(h4.d, h5.d);
                        if (compare6 == 0) {
                            break;
                        }
                    }
                }
                break;
            case 8:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int compare7 = Float.compare(((oqf) pair.a).b, ((oqf) pair2.a).b);
                if (compare7 == 0) {
                    break;
                }
                break;
            case 13:
                Comparable comparable = 0;
                Comparable valueOf = obj2 instanceof Player ? Long.valueOf(((Player) obj2).getUserCount()) : obj2 instanceof Team ? Long.valueOf(((Team) obj2).getUserCount()) : obj2 instanceof UniqueTournament ? Long.valueOf(((UniqueTournament) obj2).getUserCount()) : comparable;
                if (obj instanceof Player) {
                    comparable = Long.valueOf(((Player) obj).getUserCount());
                } else if (obj instanceof Team) {
                    comparable = Long.valueOf(((Team) obj).getUserCount());
                } else if (obj instanceof UniqueTournament) {
                    comparable = Long.valueOf(((UniqueTournament) obj).getUserCount());
                }
                break;
            case 20:
                Player player = ((APIBuzzerTile) obj2).getPlayer();
                Long valueOf2 = player != null ? Long.valueOf(player.getUserCount()) : null;
                Player player2 = ((APIBuzzerTile) obj).getPlayer();
                break;
            case 26:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int min2 = Math.min(str.length(), str2.length());
                int i7 = 4;
                while (true) {
                    if (i7 >= min2) {
                        int length3 = str.length();
                        int length4 = str2.length();
                        if (length3 == length4) {
                            break;
                        } else if (length3 >= length4) {
                        }
                    } else {
                        char charAt = str.charAt(i7);
                        char charAt2 = str2.charAt(i7);
                        if (charAt == charAt2) {
                            i7++;
                        } else if (Intrinsics.d(charAt, charAt2) >= 0) {
                        }
                    }
                }
                break;
        }
        return Integer.valueOf(((e93) ((Map.Entry) obj).getKey()).ordinal()).compareTo(Integer.valueOf(((e93) ((Map.Entry) obj2).getKey()).ordinal()));
    }
}
