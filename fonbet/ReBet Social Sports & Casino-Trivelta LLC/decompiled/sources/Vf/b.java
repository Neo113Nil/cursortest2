package Vf;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n.AbstractC5596a;
import od.p;
import rd.C6218a;

/* loaded from: classes4.dex */
public class b {
    private static final int[] DEFAULT_SMILEY_RES_IDS;
    private static final String[] MSMILEYTEXTS = {":)", ":-)", ":^)", ":]", ":(", ":-(", ":[", ":D", ":-D", ":))", ":-))", ":-@", ":@", "X-(", ":-p", ":-P", ":P", ":p", "B-)", ";)", ";-)", ":-/", ":/", ":joy:", ":o", ":O", ":-O", ":o", ":xs", ":neutral:", ":-s", ":-S", ":s", ":S", ":yummy:", ":yuck:", "|-)", "I-)", "(6.6)", "+o(", ":injured:", "*-:)", "?D", ":tensed:", ":search:", "D:", ":-#", ":-X", ":shutup:", ":angel:", "(A)", "(a)", "O-)", "O:)", "O:-)", "(Y)", "(y)", ":+1:", ":x-", "(n)", ":-1:", "(N)", ":awe:", ":bored:", ":curious:", ":evil:", ":grinning:", ":jealous:", "-_-", ":relaxed:", "-.-", ":stressed-out:", ":-?", ":thinking:", "(=_=)", ":tired:", ":upset:", ":blush:", ":bye-bye:", ":facepalm:", ":-{}", ":feeling-cold:", ":feeling-warm:", "(({..}))", ":headache:", ":namaste:", ":raising-hand:", ":super:", ":fist:", ":thug:", ":v:", ":victory:", ":clap:", ":yoyo:", ":target:", ":foosball:", ":smile:", ":sad:", ":happy:", ":angry:", ":razz:", ":cool:", ":wink:", ":smirk:", ":surprise:", ":love:", ":worry:", ":sleepy:", ":faint:", ":sick:", ":idea:", ":doubt:", ":anxious:", ":keep-quiet:", ":peace:", ":thumbsup:", ":thumbsdown:", ":flexed-biceps:", ":biceps:", ":flag:", "C(_)", ":coffee-cup:", ":food:", ":chicken:", ":gift-box:", ":champagne:", ":party:", ":poop:", ":peanuts:", ":birthday:", ":fireworks:", ":christmas-tree:", ":santa-hat:", ":new-year:", ":singing:", ":break-boy:", ":break-girl:", ":woman-dancing:", ":man-dancing:", ":yoga:", ":karate:", ":medicine:", ":first-aid-box:", ":fire-extinguisher:", ":fire:", ":man-cycling:", ":woman-cycling:", ":woman-running:", ":man-running:", ":man-swimming:", ":woman-swimming:", ":football:", ":basketball:", ":volleyball:", ":tennis:", ":badminton:", ":table-tennis:", ":pingpong:", ":cricket:", ":baseball:", ":hockey:", ":golf:", ":snooker:", ":chess:", ":football-player:", ":basketball-player:", ":male-volleyball-player:", ":female-volleyball-player:", ":female-tennis-player:", ":male-tennis-player:", ":badminton-player:", ":male-tabletennis-player:", ":female-tabletennis-player:", ":batsman:", ":bowler:", ":batter:", ":pitcher:", ":hockey-player:", ":golfer:", ":gym:", ":gymnast:", ":snooker-player:", ":chess-player:", ":eid-mubarak:", ":kaaba:", ":gold-medal:", ":silver-medal:", ":bronze-medal:", ":refugee-olympic-team:", ":running:", ":hurdler:", ":high-jump:", ":long-jump:", ":pole-vault:", ":discus-throw:", ":hammer-throw:", ":javelin-throw:", ":shotput-throw:", ":boxer:", ":fencer:", ":judo:", ":weightlifting:", ":wrestling:", ":archer:", ":shooter:", ":equestrian:", ":canoeing:", ":diver:", ":rhythmic-gymnastics:", ":bicycle:", ":sports-bike:", ":cruiser-bike:", ":motor-scooter:", ":car:", ":taxi:", ":bus:", ":train:", ":police-car:", ":ambulance:", ":fire-engine:", ":aeroplane:", ":passenger-ship:", ":rating-angry:", ":rating-sad:", ":rating-neutral:", ":rating-happy:", ":rating-excited:", ":calendar:", ":task:", ":bug:", ":laptop:", ":milestone:", ":processor:", ":report:", ":server:", ":security:", ":americas:", ":europe-africa:", ":asia-pacific:", ":parking:", ":auditorium:", ":office:", ":library:", ":home:", ":playground:", ":garden:", ":cafeteria:", ":athlete:", ":store:", ":mail-room:", ":pharmacy:"};

    /* renamed from: c, reason: collision with root package name */
    public static b f12890c;

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f12891a = f();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f12892b = g();

    static {
        int i10 = p.f60031R2;
        int i11 = p.f59971F2;
        int i12 = p.f60191y1;
        int i13 = p.f60038T;
        int i14 = p.f60197z2;
        int i15 = p.f59969F0;
        int i16 = p.f59987I3;
        int i17 = p.f60036S2;
        int i18 = p.f60068Z2;
        int i19 = p.f60050V1;
        int i20 = p.f59997K3;
        int i21 = p.f60026Q2;
        int i22 = p.f60034S0;
        int i23 = p.f60011N2;
        int i24 = p.f59990J1;
        int i25 = p.f59999L0;
        int i26 = p.f60043U;
        int i27 = p.f60006M2;
        int i28 = p.f60033S;
        int i29 = p.f60118j3;
        int i30 = p.f60113i3;
        int i31 = p.f59951B2;
        int i32 = p.f60060X2;
        int i33 = p.f60103g3;
        int i34 = p.f60123k3;
        int i35 = p.f60039T0;
        int i36 = p.f60196z1;
        int i37 = p.f60108h3;
        int i38 = p.f59962D3;
        int i39 = p.f60100g0;
        int i40 = p.f59964E0;
        int i41 = p.f60073a3;
        DEFAULT_SMILEY_RES_IDS = new int[]{i10, i10, i10, i10, i11, i11, i11, i12, i12, i12, i12, i13, i13, i13, i14, i14, i14, i14, i15, i16, i16, i17, i17, p.f60010N1, i18, i18, i18, i18, i19, p.f60112i2, i20, i20, i20, i20, p.f60022P3, p.f60017O3, i21, i21, i22, i23, p.f59995K1, i24, i25, p.f60098f3, p.f59981H2, i26, i27, i27, i27, i28, i28, i28, i28, i28, i28, i29, i29, i29, i29, i30, i30, i30, p.f60061Y, p.f60120k0, p.f59984I0, p.f60019P0, p.f60171u1, p.f60005M1, i31, i31, i32, i32, i33, i33, i34, i34, p.f60133m3, p.f60115j0, p.f60160s0, p.f60024Q0, i35, i35, p.f60044U0, i36, i36, p.f60107h2, p.f60192y2, p.f60064Y2, i37, i37, i38, i38, p.f59959D0, p.f60012N3, p.f60078b3, p.f60116j1, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i39, i39, p.f60106h1, i40, i40, p.f60111i1, p.f59944A0, p.f60136n1, p.f60185x0, p.f60142o2, p.f60182w2, p.f60152q2, p.f60110i0, p.f60096f1, p.f59949B0, p.f59976G2, p.f60117j2, p.f60021P2, p.f60135n0, p.f60140o0, p.f59992J3, p.f60087d2, p.f60007M3, p.f60025Q1, p.f60092e2, p.f60101g1, p.f60091e1, p.f60081c1, p.f60059X1, p.f60049V0, p.f60054W0, p.f60063Y1, p.f60067Z1, p.f60058X0, p.f60121k1, p.f60080c0, p.f59977G3, p.f60093e3, p.f60065Z, i41, i41, p.f59974G0, p.f60075b0, p.f59950B1, p.f60161s1, p.f60041T2, p.f60190y0, p.f60126l1, p.f60085d0, p.f60082c2, p.f60071a1, p.f60062Y0, p.f60072a2, p.f60070a0, p.f60077b2, p.f60066Z0, p.f60090e0, p.f60125l0, p.f60095f0, p.f60162s2, p.f59955C1, p.f60166t1, p.f60176v1, p.f60181w1, p.f60046U2, p.f60195z0, p.f60009N0, p.f60020P1, p.f60156r1, p.f60016O2, p.f60145p0, p.f59946A2, p.f59961D2, p.f59965E1, p.f59945A1, p.f60045U1, p.f60172u2, p.f59989J0, p.f60186x1, p.f60000L1, p.f60001L2, p.f60130m0, p.f60076b1, p.f60015O1, p.f59982H3, p.f60002L3, p.f60048V, p.f59996K2, p.f60014O0, p.f60175v0, p.f59994K0, p.f59966E2, p.f60105h0, p.f60051V2, p.f59979H0, p.f60102g2, p.f60180w0, p.f60088d3, p.f60155r0, p.f60128l3, p.f60177v2, p.f60028R, p.f60086d1, p.f60023Q, p.f60147p2, p.f60138n3, p.f60198z3, p.f60193y3, p.f60173u3, p.f60168t3, p.f60170u0, p.f60083c3, p.f60150q0, p.f60030R1, p.f60097f2, p.f60187x2, p.f59956C2, p.f59991J2, p.f59986I2, p.f60141o1, p.f60151q1, p.f60146p1, p.f60137n2, p.f60057X, p.f60122k2, p.f60035S1, p.f59960D1, p.f60167t2, p.f60131m1, p.f60165t0, p.f60053W, p.f60056W2, p.f60055W1, p.f60157r2};
    }

    public static b i() {
        if (f12890c == null) {
            f12890c = new b();
        }
        return f12890c;
    }

    public Spannable a(Message.b bVar) {
        return (bVar == null || bVar.e() == null) ? new SpannableStringBuilder() : bVar.d() ? d(bVar.e(), null, false) : new SpannableStringBuilder(bVar.e());
    }

    public Spannable b(Message.b bVar, Float f10) {
        return (bVar == null || bVar.e() == null) ? new SpannableStringBuilder() : bVar.d() ? d(bVar.e(), f10, false) : new SpannableStringBuilder(bVar.e());
    }

    public Spannable c(CharSequence charSequence) {
        return d(charSequence, null, true);
    }

    public Spannable d(CharSequence charSequence, Float f10, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = null;
        if (charSequence != null) {
            try {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                try {
                    Matcher matcher = this.f12891a.matcher(charSequence.toString());
                    while (matcher.find()) {
                        Integer num = (Integer) this.f12892b.get(matcher.group().trim());
                        if (num != null) {
                            Drawable b10 = AbstractC5596a.b(MobilistenInitProvider.k().getApplicationContext(), num.intValue());
                            int b11 = z10 ? C6218a.b(2.0f) : 0;
                            int floatValue = (int) (f10 != null ? f10.floatValue() + C6218a.b(2.0f) : C6218a.b(18.0f));
                            if (b10 != null) {
                                b10.setBounds(0, b11, floatValue, floatValue + b11);
                                spannableStringBuilder2.setSpan(new ImageSpan(b10, 2), matcher.start() + matcher.group(1).length(), matcher.end(), 33);
                            }
                        }
                    }
                    return spannableStringBuilder2;
                } catch (Exception e10) {
                    e = e10;
                    spannableStringBuilder = spannableStringBuilder2;
                    LiveChatUtil.log(e);
                    return spannableStringBuilder;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return spannableStringBuilder;
    }

    public SpannableStringBuilder e(SpannableStringBuilder spannableStringBuilder, Float f10) {
        if (spannableStringBuilder != null) {
            try {
                Matcher matcher = this.f12891a.matcher(spannableStringBuilder.toString());
                while (matcher.find()) {
                    Integer num = (Integer) this.f12892b.get(matcher.group().trim());
                    if (num != null) {
                        Drawable b10 = AbstractC5596a.b(MobilistenInitProvider.k().getApplicationContext(), num.intValue());
                        int b11 = C6218a.b(2.0f);
                        int floatValue = (int) (f10 != null ? f10.floatValue() + C6218a.b(2.0f) : C6218a.b(18.0f));
                        if (b10 != null) {
                            b10.setBounds(0, b11, floatValue, floatValue + b11);
                            spannableStringBuilder.setSpan(new ImageSpan(b10, 2), matcher.start() + matcher.group(1).length(), matcher.end(), 33);
                        }
                    }
                }
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
            }
        }
        return spannableStringBuilder;
    }

    public final Pattern f() {
        String[] strArr = MSMILEYTEXTS;
        StringBuilder sb2 = new StringBuilder(strArr.length * 3);
        sb2.append("(^|[ \\n .])");
        sb2.append('(');
        for (String str : strArr) {
            sb2.append(h(str));
            sb2.append('|');
        }
        sb2.replace(sb2.length() - 1, sb2.length(), ")");
        sb2.append("(?=$|[ \\n .])");
        return Pattern.compile(sb2.toString());
    }

    public final HashMap g() {
        int length = DEFAULT_SMILEY_RES_IDS.length;
        String[] strArr = MSMILEYTEXTS;
        if (length != strArr.length) {
            throw new IllegalStateException("Smiley resource ID/text mismatch");
        }
        HashMap hashMap = new HashMap(strArr.length);
        int i10 = 0;
        while (true) {
            String[] strArr2 = MSMILEYTEXTS;
            if (i10 >= strArr2.length) {
                return hashMap;
            }
            hashMap.put(strArr2[i10], Integer.valueOf(DEFAULT_SMILEY_RES_IDS[i10]));
            i10++;
        }
    }

    public final String h(String str) {
        try {
            return str.replaceAll("\\(", "\\\\(").replaceAll("\\)", "\\\\)").replaceAll("\\|", "\\\\|").replaceAll("\\+", "\\\\+").replaceAll("\\*", "\\\\*").replaceAll("\\?", "\\\\?").replaceAll("\\[", "\\\\[").replaceAll("\\]", "\\\\]").replaceAll("\\{", "\\\\{").replaceAll("\\}", "\\\\}");
        } catch (Exception unused) {
            return str;
        }
    }

    public Pattern j() {
        return this.f12891a;
    }
}
