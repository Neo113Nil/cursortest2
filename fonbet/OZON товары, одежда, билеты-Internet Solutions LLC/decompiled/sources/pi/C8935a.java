package pi;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import oi.C8737a;
import oi.InterfaceC8742f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;

/* renamed from: pi.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8935a implements l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C8935a f80807a = new C8935a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C8737a f80817b = new C8737a("bgAccentOnLight");

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C8737a f80827c = new C8737a("bgAccentOnLightSelect");

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C8737a f80837d = new C8737a("bgDarkKey");

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C8737a f80847e = new C8737a("bgLightKey");

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C8737a f80857f = new C8737a("bgMarketingOnLight");

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final C8737a f80866g = new C8737a("bgMarketingOnLightSelect");

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final C8737a f80876h = new C8737a("bgPositiveOnLight");

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final C8737a f80886i = new C8737a("bgPositiveOnLightSelect");

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final C8737a f80896j = new C8737a("bgWarningOnLight");

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final C8737a f80906k = new C8737a("bgWarningOnLightSelect");

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final C8737a f80916l = new C8737a("clearDarkKey100");

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final C8737a f80926m = new C8737a("clearDarkKey200");

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final C8737a f80936n = new C8737a("clearDarkKey300");

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final C8737a f80946o = new C8737a("clearDarkKey400");

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final C8737a f80956p = new C8737a("clearDarkKey500");

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final C8737a f80966q = new C8737a("clearDarkKey600");

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final C8737a f80976r = new C8737a("clearDarkKey700");

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private static final C8737a f80986s = new C8737a("clearDarkKey800");

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private static final C8737a f80996t = new C8737a("clearLightKey0");

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private static final C8737a f81005u = new C8737a("clearLightKey100");

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private static final C8737a f81015v = new C8737a("clearLightKey200");

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private static final C8737a f81024w = new C8737a("clearLightKey300");

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private static final C8737a f81033x = new C8737a("clearLightKey400");

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private static final C8737a f81042y = new C8737a("clearLightKey500");

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private static final C8737a f81051z = new C8737a("clearLightKey600");

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private static final C8737a f80573A = new C8737a("clearLightKey700");

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private static final C8737a f80582B = new C8737a("clearLightKey800");

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private static final C8737a f80591C = new C8737a("detectorColormine");

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private static final C8737a f80600D = new C8737a("graphicAccentOnLight");

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private static final C8737a f80609E = new C8737a("graphicAccentOnLightSelect");

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private static final C8737a f80618F = new C8737a("graphicActionOnDark");

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private static final C8737a f80627G = new C8737a("graphicActionOnDarkSelect");

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private static final C8737a f80636H = new C8737a("graphicActionOnLight");

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private static final C8737a f80645I = new C8737a("graphicActionOnLightSelect");

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private static final C8737a f80654J = new C8737a("graphicDarkKey");

    /* renamed from: K, reason: collision with root package name */
    @NotNull
    private static final C8737a f80663K = new C8737a("graphicDarkerNeutralOnLight");

    /* renamed from: L, reason: collision with root package name */
    @NotNull
    private static final C8737a f80672L = new C8737a("graphicDisabledOnDark");

    /* renamed from: M, reason: collision with root package name */
    @NotNull
    private static final C8737a f80681M = new C8737a("graphicDisabledOnLight");

    /* renamed from: N, reason: collision with root package name */
    @NotNull
    private static final C8737a f80690N = new C8737a("graphicExpressOnDark");

    /* renamed from: O, reason: collision with root package name */
    @NotNull
    private static final C8737a f80699O = new C8737a("graphicFreshOnDark");

    /* renamed from: P, reason: collision with root package name */
    @NotNull
    private static final C8737a f80708P = new C8737a("graphicLightKey");

    /* renamed from: Q, reason: collision with root package name */
    @NotNull
    private static final C8737a f80717Q = new C8737a("graphicMarketingOnLight");

    /* renamed from: R, reason: collision with root package name */
    @NotNull
    private static final C8737a f80726R = new C8737a("graphicMarketingOnLightSelect");

    /* renamed from: S, reason: collision with root package name */
    @NotNull
    private static final C8737a f80735S = new C8737a("graphicNegativeOnDark");

    /* renamed from: T, reason: collision with root package name */
    @NotNull
    private static final C8737a f80744T = new C8737a("graphicNeutralOnDark");

    /* renamed from: U, reason: collision with root package name */
    @NotNull
    private static final C8737a f80753U = new C8737a("graphicNeutralOnLight");

    /* renamed from: V, reason: collision with root package name */
    @NotNull
    private static final C8737a f80762V = new C8737a("graphicPositiveOnDark");

    /* renamed from: W, reason: collision with root package name */
    @NotNull
    private static final C8737a f80771W = new C8737a("graphicPositiveOnDarkSelect");

    /* renamed from: X, reason: collision with root package name */
    @NotNull
    private static final C8737a f80780X = new C8737a("graphicPrimaryOnDark");

    /* renamed from: Y, reason: collision with root package name */
    @NotNull
    private static final C8737a f80789Y = new C8737a("graphicPrimaryOnLight");

    /* renamed from: Z, reason: collision with root package name */
    @NotNull
    private static final C8737a f80798Z = new C8737a("graphicSecondaryOnDark");

    /* renamed from: a0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80808a0 = new C8737a("graphicSecondaryOnLight");

    /* renamed from: b0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80818b0 = new C8737a("graphicSolidNeutral");

    /* renamed from: c0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80828c0 = new C8737a("graphicTertiaryOnDark");

    /* renamed from: d0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80838d0 = new C8737a("graphicTertiaryOnLight");

    /* renamed from: e0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80848e0 = new C8737a("graphicWarningOnDark");

    /* renamed from: f0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80858f0 = new C8737a("graphicWarningOnDarkSelect");

    /* renamed from: g0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80867g0 = new C8737a("layerFloor1OnDark");

    /* renamed from: h0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80877h0 = new C8737a("textAccentOnLight");

    /* renamed from: i0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80887i0 = new C8737a("textAccentOnLightSelect");

    /* renamed from: j0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80897j0 = new C8737a("textActionOnDark");

    /* renamed from: k0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80907k0 = new C8737a("textActionOnDarkSelect");

    /* renamed from: l0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80917l0 = new C8737a("textActionOnLight");

    /* renamed from: m0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80927m0 = new C8737a("textActionOnLightSelect");

    /* renamed from: n0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80937n0 = new C8737a("textDarkKey");

    /* renamed from: o0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80947o0 = new C8737a("textExpressOnDark");

    /* renamed from: p0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80957p0 = new C8737a("textFreshOnDark");

    /* renamed from: q0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80967q0 = new C8737a("textLightKey");

    /* renamed from: r0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80977r0 = new C8737a("textMarketingOnLight");

    /* renamed from: s0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80987s0 = new C8737a("textMarketingOnLightSelect");

    /* renamed from: t0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80997t0 = new C8737a("textNegativeOnDark");

    /* renamed from: u0, reason: collision with root package name */
    @NotNull
    private static final C8737a f81006u0 = new C8737a("textPositiveOnDark");

    /* renamed from: v0, reason: collision with root package name */
    @NotNull
    private static final C8737a f81016v0 = new C8737a("textPositiveOnDarkSelect");

    /* renamed from: w0, reason: collision with root package name */
    @NotNull
    private static final C8737a f81025w0 = new C8737a("textPositiveOnLight");

    /* renamed from: x0, reason: collision with root package name */
    @NotNull
    private static final C8737a f81034x0 = new C8737a("textPositiveOnLightSelect");

    /* renamed from: y0, reason: collision with root package name */
    @NotNull
    private static final C8737a f81043y0 = new C8737a("textPrimaryOnDark");

    /* renamed from: z0, reason: collision with root package name */
    @NotNull
    private static final C8737a f81052z0 = new C8737a("textPrimaryOnLight");

    /* renamed from: A0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80574A0 = new C8737a("textSecondaryOnDark");

    /* renamed from: B0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80583B0 = new C8737a("textSecondaryOnLight");

    /* renamed from: C0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80592C0 = new C8737a("textTertiaryOnDark");

    /* renamed from: D0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80601D0 = new C8737a("textTertiaryOnLight");

    /* renamed from: E0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80610E0 = new C8737a("textWarningOnDark");

    /* renamed from: F0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80619F0 = new C8737a("textWarningOnDarkSelect");

    /* renamed from: G0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80628G0 = new C8737a("bgActiveAccentPrimary");

    /* renamed from: H0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80637H0 = new C8737a("bgActiveAccentPrimarySelect");

    /* renamed from: I0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80646I0 = new C8737a("bgActiveAccentPrimaryInverted");

    /* renamed from: J0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80655J0 = new C8737a("bgActiveAccentPrimaryInvertedSelect");

    /* renamed from: K0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80664K0 = new C8737a("bgActiveAccentSecondary");

    /* renamed from: L0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80673L0 = new C8737a("bgActiveAccentSecondarySelect");

    /* renamed from: M0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80682M0 = new C8737a("bgActiveAccentSecondaryInverted");

    /* renamed from: N0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80691N0 = new C8737a("bgActiveAccentSecondaryInvertedSelect");

    /* renamed from: O0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80700O0 = new C8737a("bgActiveActionPrimary");

    /* renamed from: P0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80709P0 = new C8737a("bgActiveActionPrimarySelect");

    /* renamed from: Q0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80718Q0 = new C8737a("bgActiveActionPrimaryInverted");

    /* renamed from: R0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80727R0 = new C8737a("bgActiveActionPrimaryInvertedSelect");

    /* renamed from: S0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80736S0 = new C8737a("bgActiveActionSecondary");

    /* renamed from: T0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80745T0 = new C8737a("bgActiveActionSecondarySelect");

    /* renamed from: U0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80754U0 = new C8737a("bgActiveActionSecondaryInverted");

    /* renamed from: V0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80763V0 = new C8737a("bgActiveActionSecondaryInvertedSelect");

    /* renamed from: W0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80772W0 = new C8737a("bgActiveApparelPrimary");

    /* renamed from: X0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80781X0 = new C8737a("bgActiveApparelPrimaryInverted");

    /* renamed from: Y0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80790Y0 = new C8737a("bgActiveApparelSecondary");

    /* renamed from: Z0, reason: collision with root package name */
    @NotNull
    private static final C8737a f80799Z0 = new C8737a("bgActiveApparelSecondaryInverted");

    /* renamed from: a1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80809a1 = new C8737a("bgActiveAquaPrimary");

    /* renamed from: b1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80819b1 = new C8737a("bgActiveBestpricePrimary");

    /* renamed from: c1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80829c1 = new C8737a("bgActiveBestpricePrimaryInverted");

    /* renamed from: d1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80839d1 = new C8737a("bgActiveBestpriceSecondary");

    /* renamed from: e1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80849e1 = new C8737a("bgActiveBestpriceSecondaryInverted");

    /* renamed from: f1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80859f1 = new C8737a("bgActiveExpressPrimary");

    /* renamed from: g1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80868g1 = new C8737a("bgActiveExpressPrimaryInverted");

    /* renamed from: h1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80878h1 = new C8737a("bgActiveExpressSecondary");

    /* renamed from: i1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80888i1 = new C8737a("bgActiveExpressSecondaryInverted");

    /* renamed from: j1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80898j1 = new C8737a("bgActiveFreshPrimary");

    /* renamed from: k1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80908k1 = new C8737a("bgActiveFreshPrimaryInverted");

    /* renamed from: l1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80918l1 = new C8737a("bgActiveFreshSecondary");

    /* renamed from: m1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80928m1 = new C8737a("bgActiveFreshSecondaryInverted");

    /* renamed from: n1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80938n1 = new C8737a("bgActiveMarketingPrimary");

    /* renamed from: o1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80948o1 = new C8737a("bgActiveMarketingPrimarySelect");

    /* renamed from: p1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80958p1 = new C8737a("bgActiveMarketingPrimaryInverted");

    /* renamed from: q1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80968q1 = new C8737a("bgActiveMarketingPrimaryInvertedSelect");

    /* renamed from: r1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80978r1 = new C8737a("bgActiveMarketingSecondary");

    /* renamed from: s1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80988s1 = new C8737a("bgActiveMarketingSecondarySelect");

    /* renamed from: t1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80998t1 = new C8737a("bgActiveMarketingSecondaryInverted");

    /* renamed from: u1, reason: collision with root package name */
    @NotNull
    private static final C8737a f81007u1 = new C8737a("bgActiveMarketingSecondaryInvertedSelect");

    /* renamed from: v1, reason: collision with root package name */
    @NotNull
    private static final C8737a f81017v1 = new C8737a("bgActiveNegativePrimary");

    /* renamed from: w1, reason: collision with root package name */
    @NotNull
    private static final C8737a f81026w1 = new C8737a("bgActiveNegativePrimaryInverted");

    /* renamed from: x1, reason: collision with root package name */
    @NotNull
    private static final C8737a f81035x1 = new C8737a("bgActiveNegativeSecondary");

    /* renamed from: y1, reason: collision with root package name */
    @NotNull
    private static final C8737a f81044y1 = new C8737a("bgActiveNegativeSecondaryInverted");

    /* renamed from: z1, reason: collision with root package name */
    @NotNull
    private static final C8737a f81053z1 = new C8737a("bgActiveOzonPrimary");

    /* renamed from: A1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80575A1 = new C8737a("bgActiveOzonSecondary");

    /* renamed from: B1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80584B1 = new C8737a("bgActivePositivePrimary");

    /* renamed from: C1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80593C1 = new C8737a("bgActivePositivePrimarySelect");

    /* renamed from: D1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80602D1 = new C8737a("bgActivePositivePrimaryInverted");

    /* renamed from: E1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80611E1 = new C8737a("bgActivePositivePrimaryInvertedSelect");

    /* renamed from: F1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80620F1 = new C8737a("bgActivePositiveSecondary");

    /* renamed from: G1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80629G1 = new C8737a("bgActivePositiveSecondarySelect");

    /* renamed from: H1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80638H1 = new C8737a("bgActivePositiveSecondaryInverted");

    /* renamed from: I1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80647I1 = new C8737a("bgActivePositiveSecondaryInvertedSelect");

    /* renamed from: J1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80656J1 = new C8737a("bgActivePremiumPrimary");

    /* renamed from: K1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80665K1 = new C8737a("bgActivePremiumPrimaryInverted");

    /* renamed from: L1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80674L1 = new C8737a("bgActivePremiumSecondary");

    /* renamed from: M1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80683M1 = new C8737a("bgActivePremiumSecondaryInverted");

    /* renamed from: N1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80692N1 = new C8737a("bgActivePrimary");

    /* renamed from: O1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80701O1 = new C8737a("bgActivePrimaryInverted");

    /* renamed from: P1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80710P1 = new C8737a("bgActiveSecondary");

    /* renamed from: Q1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80719Q1 = new C8737a("bgActiveSecondaryInverted");

    /* renamed from: R1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80728R1 = new C8737a("bgActiveSelect");

    /* renamed from: S1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80737S1 = new C8737a("bgActiveSelectInverted");

    /* renamed from: T1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80746T1 = new C8737a("bgActiveWarningPrimary");

    /* renamed from: U1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80755U1 = new C8737a("bgActiveWarningPrimarySelect");

    /* renamed from: V1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80764V1 = new C8737a("bgActiveWarningPrimaryInverted");

    /* renamed from: W1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80773W1 = new C8737a("bgActiveWarningPrimaryInvertedSelect");

    /* renamed from: X1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80782X1 = new C8737a("bgActiveWarningSecondary");

    /* renamed from: Y1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80791Y1 = new C8737a("bgActiveWarningSecondarySelect");

    /* renamed from: Z1, reason: collision with root package name */
    @NotNull
    private static final C8737a f80800Z1 = new C8737a("bgActiveWarningSecondaryInverted");

    /* renamed from: a2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80810a2 = new C8737a("bgActiveWarningSecondaryInvertedSelect");

    /* renamed from: b2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80820b2 = new C8737a("bgOpaqueAccentSecondary");

    /* renamed from: c2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80830c2 = new C8737a("bgOpaqueAccentSecondarySelect");

    /* renamed from: d2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80840d2 = new C8737a("bgOpaqueActionSecondary");

    /* renamed from: e2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80850e2 = new C8737a("bgOpaqueActionSecondarySelect");

    /* renamed from: f2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80860f2 = new C8737a("bgOpaqueApparelSecondary");

    /* renamed from: g2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80869g2 = new C8737a("bgOpaqueFreshSecondary");

    /* renamed from: h2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80879h2 = new C8737a("bgOpaqueMarketingSecondary");

    /* renamed from: i2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80889i2 = new C8737a("bgOpaqueMarketingSecondarySelect");

    /* renamed from: j2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80899j2 = new C8737a("bgOpaqueNegativeSecondary");

    /* renamed from: k2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80909k2 = new C8737a("bgOpaqueOzonSecondary");

    /* renamed from: l2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80919l2 = new C8737a("bgOpaquePositiveSecondary");

    /* renamed from: m2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80929m2 = new C8737a("bgOpaquePositiveSecondarySelect");

    /* renamed from: n2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80939n2 = new C8737a("bgOpaqueSecondary");

    /* renamed from: o2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80949o2 = new C8737a("bgOpaqueWarningSecondary");

    /* renamed from: p2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80959p2 = new C8737a("bgOpaqueWarningSecondarySelect");

    /* renamed from: q2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80969q2 = new C8737a("bgAccentPrimary");

    /* renamed from: r2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80979r2 = new C8737a("bgAccentPrimarySelect");

    /* renamed from: s2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80989s2 = new C8737a("bgAccentPrimaryInverted");

    @NotNull
    private static final C8737a t2 = new C8737a("bgAccentPrimaryInvertedSelect");

    /* renamed from: u2, reason: collision with root package name */
    @NotNull
    private static final C8737a f81008u2 = new C8737a("bgAccentSecondary");

    /* renamed from: v2, reason: collision with root package name */
    @NotNull
    private static final C8737a f81018v2 = new C8737a("bgAccentSecondarySelect");

    /* renamed from: w2, reason: collision with root package name */
    @NotNull
    private static final C8737a f81027w2 = new C8737a("bgAccentSecondaryInverted");

    /* renamed from: x2, reason: collision with root package name */
    @NotNull
    private static final C8737a f81036x2 = new C8737a("bgAccentSecondaryInvertedSelect");

    /* renamed from: y2, reason: collision with root package name */
    @NotNull
    private static final C8737a f81045y2 = new C8737a("bgActionPrimary");

    /* renamed from: z2, reason: collision with root package name */
    @NotNull
    private static final C8737a f81054z2 = new C8737a("bgActionPrimarySelect");

    /* renamed from: A2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80576A2 = new C8737a("bgActionPrimaryInverted");

    /* renamed from: B2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80585B2 = new C8737a("bgActionPrimaryInvertedSelect");

    /* renamed from: C2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80594C2 = new C8737a("bgActionSecondary");

    /* renamed from: D2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80603D2 = new C8737a("bgActionSecondarySelect");

    /* renamed from: E2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80612E2 = new C8737a("bgActionSecondaryInverted");

    /* renamed from: F2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80621F2 = new C8737a("bgActionSecondaryInvertedSelect");

    /* renamed from: G2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80630G2 = new C8737a("bgActionSecondarySolid");

    /* renamed from: H2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80639H2 = new C8737a("bgApparelPiggy");

    /* renamed from: I2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80648I2 = new C8737a("bgApparelPrimary");

    /* renamed from: J2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80657J2 = new C8737a("bgApparelPrimaryInverted");

    /* renamed from: K2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80666K2 = new C8737a("bgApparelSecondary");

    /* renamed from: L2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80675L2 = new C8737a("bgApparelSecondaryInverted");

    /* renamed from: M2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80684M2 = new C8737a("bgAquaPrimary");

    /* renamed from: N2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80693N2 = new C8737a("bgAttentionPrimary");

    /* renamed from: O2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80702O2 = new C8737a("bgBestpricePrimary");

    /* renamed from: P2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80711P2 = new C8737a("bgBestpricePrimaryInverted");

    /* renamed from: Q2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80720Q2 = new C8737a("bgBestpriceSecondary");

    /* renamed from: R2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80729R2 = new C8737a("bgBestpriceSecondaryInverted");

    /* renamed from: S2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80738S2 = new C8737a("bgDarkCerulean");

    /* renamed from: T2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80747T2 = new C8737a("bgDoubtfullPrimary");

    /* renamed from: U2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80756U2 = new C8737a("bgExpressPrimary");

    /* renamed from: V2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80765V2 = new C8737a("bgExpressPrimaryInverted");

    /* renamed from: W2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80774W2 = new C8737a("bgExpressSecondary");

    /* renamed from: X2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80783X2 = new C8737a("bgExpressSecondaryInverted");

    /* renamed from: Y2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80792Y2 = new C8737a("bgFreshPrimary");

    /* renamed from: Z2, reason: collision with root package name */
    @NotNull
    private static final C8737a f80801Z2 = new C8737a("bgFreshPrimaryInverted");

    /* renamed from: a3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80811a3 = new C8737a("bgFreshSecondary");

    /* renamed from: b3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80821b3 = new C8737a("bgFreshSecondaryInverted");

    /* renamed from: c3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80831c3 = new C8737a("bgGuaranteePrimary");

    /* renamed from: d3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80841d3 = new C8737a("bgInstalmentPrimary");

    /* renamed from: e3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80851e3 = new C8737a("bgInstalmentSecondary");

    /* renamed from: f3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80861f3 = new C8737a("bgMarketingPrimary");

    /* renamed from: g3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80870g3 = new C8737a("bgMarketingPrimarySelect");

    /* renamed from: h3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80880h3 = new C8737a("bgMarketingPrimaryInverted");

    /* renamed from: i3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80890i3 = new C8737a("bgMarketingPrimaryInvertedSelect");

    /* renamed from: j3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80900j3 = new C8737a("bgMarketingSecondary");

    /* renamed from: k3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80910k3 = new C8737a("bgMarketingSecondarySelect");

    /* renamed from: l3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80920l3 = new C8737a("bgMarketingSecondaryInverted");

    /* renamed from: m3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80930m3 = new C8737a("bgMarketingSecondaryInvertedSelect");

    /* renamed from: n3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80940n3 = new C8737a("bgMarketingSecondarySolid");

    /* renamed from: o3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80950o3 = new C8737a("bgNegativePrimary");

    /* renamed from: p3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80960p3 = new C8737a("bgNegativePrimaryInverted");

    /* renamed from: q3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80970q3 = new C8737a("bgNegativeSecondary");

    /* renamed from: r3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80980r3 = new C8737a("bgNegativeSecondaryInverted");

    /* renamed from: s3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80990s3 = new C8737a("bgOverlap");

    /* renamed from: t3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80999t3 = new C8737a("bgOxford");

    /* renamed from: u3, reason: collision with root package name */
    @NotNull
    private static final C8737a f81009u3 = new C8737a("bgOzonPrimary");

    /* renamed from: v3, reason: collision with root package name */
    @NotNull
    private static final C8737a f81019v3 = new C8737a("bgOzonSecondary");

    /* renamed from: w3, reason: collision with root package name */
    @NotNull
    private static final C8737a f81028w3 = new C8737a("bgPositivePrimary");

    /* renamed from: x3, reason: collision with root package name */
    @NotNull
    private static final C8737a f81037x3 = new C8737a("bgPositivePrimarySelect");

    /* renamed from: y3, reason: collision with root package name */
    @NotNull
    private static final C8737a f81046y3 = new C8737a("bgPositivePrimaryInverted");

    /* renamed from: z3, reason: collision with root package name */
    @NotNull
    private static final C8737a f81055z3 = new C8737a("bgPositivePrimaryInvertedSelect");

    /* renamed from: A3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80577A3 = new C8737a("bgPositiveSecondary");

    /* renamed from: B3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80586B3 = new C8737a("bgPositiveSecondarySelect");

    /* renamed from: C3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80595C3 = new C8737a("bgPositiveSecondaryInverted");

    /* renamed from: D3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80604D3 = new C8737a("bgPositiveSecondaryInvertedSelect");

    /* renamed from: E3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80613E3 = new C8737a("bgPremiumPrimary");

    /* renamed from: F3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80622F3 = new C8737a("bgPremiumPrimaryInverted");

    /* renamed from: G3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80631G3 = new C8737a("bgPremiumSecondary");

    /* renamed from: H3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80640H3 = new C8737a("bgPremiumSecondaryInverted");

    /* renamed from: I3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80649I3 = new C8737a("bgPrimary");

    /* renamed from: J3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80658J3 = new C8737a("bgPrimaryInverted");

    /* renamed from: K3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80667K3 = new C8737a("bgPrussian");

    /* renamed from: L3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80676L3 = new C8737a("bgSbp");

    /* renamed from: M3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80685M3 = new C8737a("bgSecondary");

    /* renamed from: N3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80694N3 = new C8737a("bgSecondaryDynamic");

    /* renamed from: O3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80703O3 = new C8737a("bgSecondaryDynamicSelect");

    /* renamed from: P3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80712P3 = new C8737a("bgSecondaryDynamicInverted");

    /* renamed from: Q3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80721Q3 = new C8737a("bgSecondaryDynamicInvertedSelect");

    /* renamed from: R3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80730R3 = new C8737a("bgSecondaryInverted");

    /* renamed from: S3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80739S3 = new C8737a("bgSelect");

    /* renamed from: T3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80748T3 = new C8737a("bgSelectInverted");

    /* renamed from: U3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80757U3 = new C8737a("bgTabbarPrimary");

    /* renamed from: V3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80766V3 = new C8737a("bgTech");

    /* renamed from: W3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80775W3 = new C8737a("bgUltraPrimary");

    /* renamed from: X3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80784X3 = new C8737a("bgWarningPrimary");

    /* renamed from: Y3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80793Y3 = new C8737a("bgWarningPrimarySelect");

    /* renamed from: Z3, reason: collision with root package name */
    @NotNull
    private static final C8737a f80802Z3 = new C8737a("bgWarningPrimaryInverted");

    /* renamed from: a4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80812a4 = new C8737a("bgWarningPrimaryInvertedSelect");

    /* renamed from: b4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80822b4 = new C8737a("bgWarningSecondary");

    /* renamed from: c4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80832c4 = new C8737a("bgWarningSecondarySelect");

    /* renamed from: d4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80842d4 = new C8737a("bgWarningSecondaryInverted");

    /* renamed from: e4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80852e4 = new C8737a("bgWarningSecondaryInvertedSelect");

    /* renamed from: f4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80862f4 = new C8737a("graphicActiveAccentPrimary");

    /* renamed from: g4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80871g4 = new C8737a("graphicActiveAccentPrimarySelect");

    /* renamed from: h4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80881h4 = new C8737a("graphicActiveAccentPrimaryInverted");

    /* renamed from: i4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80891i4 = new C8737a("graphicActiveAccentPrimaryInvertedSelect");

    /* renamed from: j4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80901j4 = new C8737a("graphicActiveActionPrimary");

    /* renamed from: k4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80911k4 = new C8737a("graphicActiveActionPrimarySelect");

    /* renamed from: l4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80921l4 = new C8737a("graphicActiveActionPrimaryInverted");

    /* renamed from: m4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80931m4 = new C8737a("graphicActiveActionPrimaryInvertedSelect");

    /* renamed from: n4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80941n4 = new C8737a("graphicActiveApparel");

    /* renamed from: o4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80951o4 = new C8737a("graphicActiveApparelInverted");

    /* renamed from: p4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80961p4 = new C8737a("graphicActiveBestprice");

    /* renamed from: q4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80971q4 = new C8737a("graphicActiveBestpriceInverted");

    /* renamed from: r4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80981r4 = new C8737a("graphicActiveExpress");

    /* renamed from: s4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80991s4 = new C8737a("graphicActiveExpressInverted");

    /* renamed from: t4, reason: collision with root package name */
    @NotNull
    private static final C8737a f81000t4 = new C8737a("graphicActiveFresh");

    /* renamed from: u4, reason: collision with root package name */
    @NotNull
    private static final C8737a f81010u4 = new C8737a("graphicActiveFreshInverted");

    /* renamed from: v4, reason: collision with root package name */
    @NotNull
    private static final C8737a f81020v4 = new C8737a("graphicActiveMarketing");

    /* renamed from: w4, reason: collision with root package name */
    @NotNull
    private static final C8737a f81029w4 = new C8737a("graphicActiveMarketingSelect");

    /* renamed from: x4, reason: collision with root package name */
    @NotNull
    private static final C8737a f81038x4 = new C8737a("graphicActiveMarketingInverted");

    /* renamed from: y4, reason: collision with root package name */
    @NotNull
    private static final C8737a f81047y4 = new C8737a("graphicActiveMarketingInvertedSelect");

    /* renamed from: z4, reason: collision with root package name */
    @NotNull
    private static final C8737a f81056z4 = new C8737a("graphicActiveNegativePrimary");

    /* renamed from: A4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80578A4 = new C8737a("graphicActiveNegativePrimaryInverted");

    /* renamed from: B4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80587B4 = new C8737a("graphicActiveOzon");

    /* renamed from: C4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80596C4 = new C8737a("graphicActivePositivePrimary");

    /* renamed from: D4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80605D4 = new C8737a("graphicActivePositivePrimarySelect");

    /* renamed from: E4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80614E4 = new C8737a("graphicActivePositivePrimaryInverted");

    /* renamed from: F4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80623F4 = new C8737a("graphicActivePositivePrimaryInvertedSelect");

    /* renamed from: G4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80632G4 = new C8737a("graphicActivePremium");

    /* renamed from: H4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80641H4 = new C8737a("graphicActivePremiumBlue");

    /* renamed from: I4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80650I4 = new C8737a("graphicActivePremiumInverted");

    /* renamed from: J4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80659J4 = new C8737a("graphicActiveRating");

    /* renamed from: K4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80668K4 = new C8737a("graphicActiveRatingSelect");

    /* renamed from: L4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80677L4 = new C8737a("graphicActiveRatingInverted");

    /* renamed from: M4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80686M4 = new C8737a("graphicActiveRatingInvertedSelect");

    /* renamed from: N4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80695N4 = new C8737a("graphicActiveWarningPrimary");

    /* renamed from: O4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80704O4 = new C8737a("graphicActiveWarningPrimarySelect");

    /* renamed from: P4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80713P4 = new C8737a("graphicActiveWarningPrimaryInverted");

    /* renamed from: Q4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80722Q4 = new C8737a("graphicActiveWarningPrimaryInvertedSelect");

    /* renamed from: R4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80731R4 = new C8737a("graphicAccentPrimary");

    /* renamed from: S4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80740S4 = new C8737a("graphicAccentPrimarySelect");

    /* renamed from: T4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80749T4 = new C8737a("graphicAccentPrimaryInverted");

    /* renamed from: U4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80758U4 = new C8737a("graphicAccentPrimaryInvertedSelect");

    /* renamed from: V4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80767V4 = new C8737a("graphicActionPrimary");

    /* renamed from: W4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80776W4 = new C8737a("graphicActionPrimarySelect");

    /* renamed from: X4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80785X4 = new C8737a("graphicActionPrimaryInverted");

    /* renamed from: Y4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80794Y4 = new C8737a("graphicActionPrimaryInvertedSelect");

    /* renamed from: Z4, reason: collision with root package name */
    @NotNull
    private static final C8737a f80803Z4 = new C8737a("graphicApparel");

    /* renamed from: a5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80813a5 = new C8737a("graphicApparelInverted");

    /* renamed from: b5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80823b5 = new C8737a("graphicBestprice");

    /* renamed from: c5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80833c5 = new C8737a("graphicBestpriceInverted");

    /* renamed from: d5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80843d5 = new C8737a("graphicDisabled");

    /* renamed from: e5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80853e5 = new C8737a("graphicDisabledInverted");

    /* renamed from: f5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80863f5 = new C8737a("graphicExpress");

    /* renamed from: g5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80872g5 = new C8737a("graphicExpressInverted");

    /* renamed from: h5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80882h5 = new C8737a("graphicFintechGracePrimary");

    /* renamed from: i5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80892i5 = new C8737a("graphicFintechGraceSecondary");

    /* renamed from: j5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80902j5 = new C8737a("graphicFresh");

    /* renamed from: k5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80912k5 = new C8737a("graphicFreshInverted");

    /* renamed from: l5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80922l5 = new C8737a("graphicGuarantee");

    /* renamed from: m5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80932m5 = new C8737a("graphicKey");

    /* renamed from: n5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80942n5 = new C8737a("graphicKeyInverted");

    /* renamed from: o5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80952o5 = new C8737a("graphicMarketing");

    /* renamed from: p5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80962p5 = new C8737a("graphicMarketingSelect");

    /* renamed from: q5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80972q5 = new C8737a("graphicMarketingInverted");

    /* renamed from: r5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80982r5 = new C8737a("graphicMarketingInvertedSelect");

    /* renamed from: s5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80992s5 = new C8737a("graphicNegativePrimary");

    /* renamed from: t5, reason: collision with root package name */
    @NotNull
    private static final C8737a f81001t5 = new C8737a("graphicNegativePrimaryInverted");

    /* renamed from: u5, reason: collision with root package name */
    @NotNull
    private static final C8737a f81011u5 = new C8737a("graphicNeutral");

    /* renamed from: v5, reason: collision with root package name */
    @NotNull
    private static final C8737a f81021v5 = new C8737a("graphicNeutralInverted");

    /* renamed from: w5, reason: collision with root package name */
    @NotNull
    private static final C8737a f81030w5 = new C8737a("graphicOverlapPrimary");

    /* renamed from: x5, reason: collision with root package name */
    @NotNull
    private static final C8737a f81039x5 = new C8737a("graphicOverlapPrimarySelect");

    /* renamed from: y5, reason: collision with root package name */
    @NotNull
    private static final C8737a f81048y5 = new C8737a("graphicOxford");

    /* renamed from: z5, reason: collision with root package name */
    @NotNull
    private static final C8737a f81057z5 = new C8737a("graphicOzon");

    /* renamed from: A5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80579A5 = new C8737a("graphicPositivePrimary");

    /* renamed from: B5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80588B5 = new C8737a("graphicPositivePrimarySelect");

    /* renamed from: C5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80597C5 = new C8737a("graphicPositivePrimaryInverted");

    /* renamed from: D5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80606D5 = new C8737a("graphicPositivePrimaryInvertedSelect");

    /* renamed from: E5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80615E5 = new C8737a("graphicPositiveSecondary");

    /* renamed from: F5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80624F5 = new C8737a("graphicPositiveSecondarySelect");

    /* renamed from: G5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80633G5 = new C8737a("graphicPremium");

    /* renamed from: H5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80642H5 = new C8737a("graphicPremiumBlue");

    /* renamed from: I5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80651I5 = new C8737a("graphicPremiumInverted");

    /* renamed from: J5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80660J5 = new C8737a("graphicPrimary");

    /* renamed from: K5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80669K5 = new C8737a("graphicPrimarySelect");

    /* renamed from: L5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80678L5 = new C8737a("graphicPrimaryDynamic");

    /* renamed from: M5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80687M5 = new C8737a("graphicPrimaryDynamicSelect");

    /* renamed from: N5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80696N5 = new C8737a("graphicPrimaryDynamicInverted");

    /* renamed from: O5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80705O5 = new C8737a("graphicPrimaryDynamicInvertedSelect");

    /* renamed from: P5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80714P5 = new C8737a("graphicPrimaryInverted");

    /* renamed from: Q5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80723Q5 = new C8737a("graphicQuaternary");

    /* renamed from: R5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80732R5 = new C8737a("graphicRating");

    /* renamed from: S5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80741S5 = new C8737a("graphicRatingSelect");

    /* renamed from: T5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80750T5 = new C8737a("graphicRatingInverted");

    /* renamed from: U5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80759U5 = new C8737a("graphicRatingInvertedSelect");

    /* renamed from: V5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80768V5 = new C8737a("graphicSecondary");

    /* renamed from: W5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80777W5 = new C8737a("graphicSecondaryDynamic");

    /* renamed from: X5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80786X5 = new C8737a("graphicSecondaryDynamicSelect");

    /* renamed from: Y5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80795Y5 = new C8737a("graphicSecondaryDynamicInverted");

    /* renamed from: Z5, reason: collision with root package name */
    @NotNull
    private static final C8737a f80804Z5 = new C8737a("graphicSecondaryDynamicInvertedSelect");

    /* renamed from: a6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80814a6 = new C8737a("graphicSecondaryInverted");

    /* renamed from: b6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80824b6 = new C8737a("graphicStrokeSticky");

    /* renamed from: c6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80834c6 = new C8737a("graphicTabbarIconPrimary");

    /* renamed from: d6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80844d6 = new C8737a("graphicTabbarIconSecondary");

    /* renamed from: e6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80854e6 = new C8737a("graphicTech");

    /* renamed from: f6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80864f6 = new C8737a("graphicTertiary");

    /* renamed from: g6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80873g6 = new C8737a("graphicTertiaryInverted");

    /* renamed from: h6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80883h6 = new C8737a("graphicUltraPrimary");

    /* renamed from: i6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80893i6 = new C8737a("graphicWarningPrimary");

    /* renamed from: j6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80903j6 = new C8737a("graphicWarningPrimarySelect");

    /* renamed from: k6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80913k6 = new C8737a("graphicWarningPrimaryInverted");

    /* renamed from: l6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80923l6 = new C8737a("graphicWarningPrimaryInvertedSelect");

    /* renamed from: m6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80933m6 = new C8737a("layerActiveFloor0");

    /* renamed from: n6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80943n6 = new C8737a("layerActiveFloor0Select");

    /* renamed from: o6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80953o6 = new C8737a("layerActiveFloor1");

    /* renamed from: p6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80963p6 = new C8737a("layerActiveFloor1Inverted");

    /* renamed from: q6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80973q6 = new C8737a("layerActiveFloor2");

    /* renamed from: r6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80983r6 = new C8737a("layerActiveFloor2Inverted");

    /* renamed from: s6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80993s6 = new C8737a("layerActiveFloor3");

    /* renamed from: t6, reason: collision with root package name */
    @NotNull
    private static final C8737a f81002t6 = new C8737a("layerActiveFloor3Inverted");

    /* renamed from: u6, reason: collision with root package name */
    @NotNull
    private static final C8737a f81012u6 = new C8737a("layerActiveSurface");

    /* renamed from: v6, reason: collision with root package name */
    @NotNull
    private static final C8737a f81022v6 = new C8737a("layerActiveSurfaceInverted");

    /* renamed from: w6, reason: collision with root package name */
    @NotNull
    private static final C8737a f81031w6 = new C8737a("layerFloor0");

    /* renamed from: x6, reason: collision with root package name */
    @NotNull
    private static final C8737a f81040x6 = new C8737a("layerFloor0Select");

    /* renamed from: y6, reason: collision with root package name */
    @NotNull
    private static final C8737a f81049y6 = new C8737a("layerFloor0Inverted");

    /* renamed from: z6, reason: collision with root package name */
    @NotNull
    private static final C8737a f81058z6 = new C8737a("layerFloor0InvertedSelect");

    /* renamed from: A6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80580A6 = new C8737a(StatusWidgetDTO.DEFAULT_BACKGROUND_COLOR);

    /* renamed from: B6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80589B6 = new C8737a("layerFloor1Inverted");

    /* renamed from: C6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80598C6 = new C8737a("layerFloor2");

    /* renamed from: D6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80607D6 = new C8737a("layerFloor2Inverted");

    /* renamed from: E6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80616E6 = new C8737a("layerFloor3");

    /* renamed from: F6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80625F6 = new C8737a("layerFloor3Inverted");

    /* renamed from: G6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80634G6 = new C8737a("layerOverlayDimming");

    /* renamed from: H6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80643H6 = new C8737a("layerOverlayDimmingInverted");

    /* renamed from: I6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80652I6 = new C8737a("layerOverlayParanja");

    /* renamed from: J6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80661J6 = new C8737a("layerOverlayParanjaInverted");

    /* renamed from: K6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80670K6 = new C8737a("layerSurface");

    /* renamed from: L6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80679L6 = new C8737a("layerSurfaceInverted");

    /* renamed from: M6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80688M6 = new C8737a("textActiveAccent");

    /* renamed from: N6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80697N6 = new C8737a("textActiveAccentSelect");

    /* renamed from: O6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80706O6 = new C8737a("textActiveAccentInverted");

    /* renamed from: P6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80715P6 = new C8737a("textActiveAccentInvertedSelect");

    /* renamed from: Q6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80724Q6 = new C8737a("textActiveAction");

    /* renamed from: R6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80733R6 = new C8737a("textActiveActionSelect");

    /* renamed from: S6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80742S6 = new C8737a("textActiveActionInverted");

    /* renamed from: T6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80751T6 = new C8737a("textActiveActionInvertedSelect");

    /* renamed from: U6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80760U6 = new C8737a("textActiveApparel");

    /* renamed from: V6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80769V6 = new C8737a("textActiveApparelInverted");

    /* renamed from: W6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80778W6 = new C8737a("textActiveBestprice");

    /* renamed from: X6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80787X6 = new C8737a("textActiveBestpriceInverted");

    /* renamed from: Y6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80796Y6 = new C8737a("textActiveExpress");

    /* renamed from: Z6, reason: collision with root package name */
    @NotNull
    private static final C8737a f80805Z6 = new C8737a("textActiveExpressInverted");

    /* renamed from: a7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80815a7 = new C8737a("textActiveFresh");

    /* renamed from: b7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80825b7 = new C8737a("textActiveFreshInverted");

    /* renamed from: c7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80835c7 = new C8737a("textActiveMarketing");

    /* renamed from: d7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80845d7 = new C8737a("textActiveMarketingSelect");

    /* renamed from: e7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80855e7 = new C8737a("textActiveMarketingInverted");

    @NotNull
    private static final C8737a f7 = new C8737a("textActiveMarketingInvertedSelect");

    /* renamed from: g7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80874g7 = new C8737a("textActiveNegative");

    /* renamed from: h7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80884h7 = new C8737a("textActiveNegativeInverted");

    /* renamed from: i7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80894i7 = new C8737a("textActiveOzon");

    /* renamed from: j7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80904j7 = new C8737a("textActivePositive");

    /* renamed from: k7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80914k7 = new C8737a("textActivePositiveSelect");

    /* renamed from: l7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80924l7 = new C8737a("textActivePositiveInverted");

    /* renamed from: m7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80934m7 = new C8737a("textActivePositiveInvertedSelect");

    /* renamed from: n7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80944n7 = new C8737a("textActivePremium");

    /* renamed from: o7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80954o7 = new C8737a("textActivePremiumInverted");

    /* renamed from: p7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80964p7 = new C8737a("textActiveWarning");

    /* renamed from: q7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80974q7 = new C8737a("textActiveWarningSelect");

    /* renamed from: r7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80984r7 = new C8737a("textActiveWarningInverted");

    /* renamed from: s7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80994s7 = new C8737a("textActiveWarningInvertedSelect");

    /* renamed from: t7, reason: collision with root package name */
    @NotNull
    private static final C8737a f81003t7 = new C8737a("textAccent");

    /* renamed from: u7, reason: collision with root package name */
    @NotNull
    private static final C8737a f81013u7 = new C8737a("textAccentSelect");

    /* renamed from: v7, reason: collision with root package name */
    @NotNull
    private static final C8737a f81023v7 = new C8737a("textAccentInverted");

    /* renamed from: w7, reason: collision with root package name */
    @NotNull
    private static final C8737a f81032w7 = new C8737a("textAccentInvertedSelect");

    /* renamed from: x7, reason: collision with root package name */
    @NotNull
    private static final C8737a f81041x7 = new C8737a("textAction");

    /* renamed from: y7, reason: collision with root package name */
    @NotNull
    private static final C8737a f81050y7 = new C8737a("textActionSelect");

    /* renamed from: z7, reason: collision with root package name */
    @NotNull
    private static final C8737a f81059z7 = new C8737a("textActionInverted");

    /* renamed from: A7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80581A7 = new C8737a("textActionInvertedSelect");

    /* renamed from: B7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80590B7 = new C8737a("textApparel");

    /* renamed from: C7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80599C7 = new C8737a("textApparelInverted");

    /* renamed from: D7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80608D7 = new C8737a("textBestprice");

    /* renamed from: E7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80617E7 = new C8737a("textBestpriceInverted");

    /* renamed from: F7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80626F7 = new C8737a("textDiscountUnavialable");

    /* renamed from: G7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80635G7 = new C8737a("textExpress");

    /* renamed from: H7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80644H7 = new C8737a("textExpressInverted");

    /* renamed from: I7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80653I7 = new C8737a("textFresh");

    /* renamed from: J7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80662J7 = new C8737a("textFreshInverted");

    /* renamed from: K7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80671K7 = new C8737a("textGuarantee");

    /* renamed from: L7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80680L7 = new C8737a("textMarketing");

    /* renamed from: M7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80689M7 = new C8737a("textMarketingSelect");

    /* renamed from: N7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80698N7 = new C8737a("textMarketingInverted");

    /* renamed from: O7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80707O7 = new C8737a("textMarketingInvertedSelect");

    /* renamed from: P7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80716P7 = new C8737a("textNegative");

    /* renamed from: Q7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80725Q7 = new C8737a("textNegativeInverted");

    /* renamed from: R7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80734R7 = new C8737a("textOriginalprice");

    /* renamed from: S7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80743S7 = new C8737a("textOriginalpriceAvailable");

    /* renamed from: T7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80752T7 = new C8737a("textOxford");

    /* renamed from: U7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80761U7 = new C8737a("textOzon");

    /* renamed from: V7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80770V7 = new C8737a("textPositive");

    /* renamed from: W7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80779W7 = new C8737a("textPositiveSelect");

    /* renamed from: X7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80788X7 = new C8737a("textPositiveInverted");

    /* renamed from: Y7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80797Y7 = new C8737a("textPositiveInvertedSelect");

    /* renamed from: Z7, reason: collision with root package name */
    @NotNull
    private static final C8737a f80806Z7 = new C8737a("textPremium");

    /* renamed from: a8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80816a8 = new C8737a("textPremiumInverted");

    /* renamed from: b8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80826b8 = new C8737a("textPrimary");

    /* renamed from: c8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80836c8 = new C8737a("textPrimaryDynamic");

    /* renamed from: d8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80846d8 = new C8737a("textPrimaryDynamicSelect");

    /* renamed from: e8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80856e8 = new C8737a("textPrimaryDynamicInverted");

    /* renamed from: f8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80865f8 = new C8737a("textPrimaryDynamicInvertedSelect");

    /* renamed from: g8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80875g8 = new C8737a("textPrimaryInverted");

    /* renamed from: h8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80885h8 = new C8737a("textSecondary");

    /* renamed from: i8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80895i8 = new C8737a("textSecondaryDynamic");

    /* renamed from: j8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80905j8 = new C8737a("textSecondaryDynamicSelect");

    /* renamed from: k8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80915k8 = new C8737a("textSecondaryDynamicInverted");

    /* renamed from: l8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80925l8 = new C8737a("textSecondaryDynamicInvertedSelect");

    /* renamed from: m8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80935m8 = new C8737a("textSecondaryInverted");

    /* renamed from: n8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80945n8 = new C8737a("textTech");

    /* renamed from: o8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80955o8 = new C8737a("textTertiary");

    /* renamed from: p8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80965p8 = new C8737a("textTertiaryInverted");

    /* renamed from: q8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80975q8 = new C8737a("textUltra");

    /* renamed from: r8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80985r8 = new C8737a("textWarning");

    /* renamed from: s8, reason: collision with root package name */
    @NotNull
    private static final C8737a f80995s8 = new C8737a("textWarningSelect");

    /* renamed from: t8, reason: collision with root package name */
    @NotNull
    private static final C8737a f81004t8 = new C8737a("textWarningInverted");

    /* renamed from: u8, reason: collision with root package name */
    @NotNull
    private static final C8737a f81014u8 = new C8737a("textWarningInvertedSelect");

    private C8935a() {
    }

    @NotNull
    public final C8737a A() {
        return f80673L0;
    }

    @NotNull
    public final C8737a A0() {
        return f80692N1;
    }

    @NotNull
    public final C8737a A1() {
        return f80960p3;
    }

    @NotNull
    public final C8737a A2() {
        return f80906k;
    }

    @NotNull
    public final C8737a A3() {
        return f80971q4;
    }

    @NotNull
    public final C8737a A4() {
        return f80717Q;
    }

    @NotNull
    public final C8737a A5() {
        return f80864f6;
    }

    @NotNull
    public final C8737a A6() {
        return f80688M6;
    }

    @NotNull
    public final C8737a A7() {
        return f80689M7;
    }

    @NotNull
    public final C8737a B() {
        return f80700O0;
    }

    @NotNull
    public final C8737a B0() {
        return f80701O1;
    }

    @NotNull
    public final C8737a B1() {
        return f80970q3;
    }

    @NotNull
    public final C8737a B2() {
        return f80784X3;
    }

    @NotNull
    public final C8737a B3() {
        return f80981r4;
    }

    @NotNull
    public final C8737a B4() {
        return f80726R;
    }

    @NotNull
    public final C8737a B5() {
        return f80873g6;
    }

    @NotNull
    public final C8737a B6() {
        return f80706O6;
    }

    @NotNull
    public final C8737a B7() {
        return f80716P7;
    }

    @NotNull
    public final C8737a C() {
        return f80718Q0;
    }

    @NotNull
    public final C8737a C0() {
        return f80710P1;
    }

    @NotNull
    public final C8737a C1() {
        return f80980r3;
    }

    @NotNull
    public final C8737a C2() {
        return f80802Z3;
    }

    @NotNull
    public final C8737a C3() {
        return f80991s4;
    }

    @NotNull
    public final C8737a C4() {
        return f80962p5;
    }

    @NotNull
    public final C8737a C5() {
        return f80828c0;
    }

    @NotNull
    public final C8737a C6() {
        return f80715P6;
    }

    @NotNull
    public final C8737a C7() {
        return f80725Q7;
    }

    @NotNull
    public final C8737a D() {
        return f80727R0;
    }

    @NotNull
    public final C8737a D0() {
        return f80719Q1;
    }

    @NotNull
    public final C8737a D1() {
        return f80820b2;
    }

    @NotNull
    public final C8737a D2() {
        return f80812a4;
    }

    @NotNull
    public final C8737a D3() {
        return f81000t4;
    }

    @NotNull
    public final C8737a D4() {
        return f80735S;
    }

    @NotNull
    public final C8737a D5() {
        return f80838d0;
    }

    @NotNull
    public final C8737a D6() {
        return f80697N6;
    }

    @NotNull
    public final C8737a D7() {
        return f80997t0;
    }

    @NotNull
    public final C8737a E() {
        return f80709P0;
    }

    @NotNull
    public final C8737a E0() {
        return f80728R1;
    }

    @NotNull
    public final C8737a E1() {
        return f80830c2;
    }

    @NotNull
    public final C8737a E2() {
        return f80793Y3;
    }

    @NotNull
    public final C8737a E3() {
        return f81010u4;
    }

    @NotNull
    public final C8737a E4() {
        return f80992s5;
    }

    @NotNull
    public final C8737a E5() {
        return f80883h6;
    }

    @NotNull
    public final C8737a E6() {
        return f80724Q6;
    }

    @NotNull
    public final C8737a E7() {
        return f80734R7;
    }

    @NotNull
    public final C8737a F() {
        return f80736S0;
    }

    @NotNull
    public final C8737a F0() {
        return f80737S1;
    }

    @NotNull
    public final C8737a F1() {
        return f80840d2;
    }

    @NotNull
    public final C8737a F2() {
        return f80822b4;
    }

    @NotNull
    public final C8737a F3() {
        return f81020v4;
    }

    @NotNull
    public final C8737a F4() {
        return f81001t5;
    }

    @NotNull
    public final C8737a F5() {
        return f80848e0;
    }

    @NotNull
    public final C8737a F6() {
        return f80742S6;
    }

    @NotNull
    public final C8737a F7() {
        return f80743S7;
    }

    @NotNull
    public final C8737a G() {
        return f80754U0;
    }

    @NotNull
    public final C8737a G0() {
        return f80746T1;
    }

    @NotNull
    public final C8737a G1() {
        return f80850e2;
    }

    @NotNull
    public final C8737a G2() {
        return f80842d4;
    }

    @NotNull
    public final C8737a G3() {
        return f81038x4;
    }

    @NotNull
    public final C8737a G4() {
        return f81011u5;
    }

    @NotNull
    public final C8737a G5() {
        return f80858f0;
    }

    @NotNull
    public final C8737a G6() {
        return f80751T6;
    }

    @NotNull
    public final C8737a G7() {
        return f80752T7;
    }

    @NotNull
    public final C8737a H() {
        return f80763V0;
    }

    @NotNull
    public final C8737a H0() {
        return f80764V1;
    }

    @NotNull
    public final C8737a H1() {
        return f80860f2;
    }

    @NotNull
    public final C8737a H2() {
        return f80852e4;
    }

    @NotNull
    public final C8737a H3() {
        return f81047y4;
    }

    @NotNull
    public final C8737a H4() {
        return f81021v5;
    }

    @NotNull
    public final C8737a H5() {
        return f80893i6;
    }

    @NotNull
    public final C8737a H6() {
        return f80733R6;
    }

    @NotNull
    public final C8737a H7() {
        return f80761U7;
    }

    @NotNull
    public final C8737a I() {
        return f80745T0;
    }

    @NotNull
    public final C8737a I0() {
        return f80773W1;
    }

    @NotNull
    public final C8737a I1() {
        return f80869g2;
    }

    @NotNull
    public final C8737a I2() {
        return f80832c4;
    }

    @NotNull
    public final C8737a I3() {
        return f81029w4;
    }

    @NotNull
    public final C8737a I4() {
        return f80744T;
    }

    @NotNull
    public final C8737a I5() {
        return f80913k6;
    }

    @NotNull
    public final C8737a I6() {
        return f80760U6;
    }

    @NotNull
    public final C8737a I7() {
        return f80770V7;
    }

    @NotNull
    public final C8737a J() {
        return f80772W0;
    }

    @NotNull
    public final C8737a J0() {
        return f80755U1;
    }

    @NotNull
    public final C8737a J1() {
        return f80879h2;
    }

    @NotNull
    public final C8737a J2() {
        return f80916l;
    }

    @NotNull
    public final C8737a J3() {
        return f81056z4;
    }

    @NotNull
    public final C8737a J4() {
        return f80753U;
    }

    @NotNull
    public final C8737a J5() {
        return f80923l6;
    }

    @NotNull
    public final C8737a J6() {
        return f80769V6;
    }

    @NotNull
    public final C8737a J7() {
        return f80788X7;
    }

    @NotNull
    public final C8737a K() {
        return f80781X0;
    }

    @NotNull
    public final C8737a K0() {
        return f80782X1;
    }

    @NotNull
    public final C8737a K1() {
        return f80889i2;
    }

    @NotNull
    public final C8737a K2() {
        return f80926m;
    }

    @NotNull
    public final C8737a K3() {
        return f80578A4;
    }

    @NotNull
    public final C8737a K4() {
        return f81030w5;
    }

    @NotNull
    public final C8737a K5() {
        return f80903j6;
    }

    @NotNull
    public final C8737a K6() {
        return f80778W6;
    }

    @NotNull
    public final C8737a K7() {
        return f80797Y7;
    }

    @NotNull
    public final C8737a L() {
        return f80790Y0;
    }

    @NotNull
    public final C8737a L0() {
        return f80800Z1;
    }

    @NotNull
    public final C8737a L1() {
        return f80899j2;
    }

    @NotNull
    public final C8737a L2() {
        return f80936n;
    }

    @NotNull
    public final C8737a L3() {
        return f80587B4;
    }

    @NotNull
    public final C8737a L4() {
        return f81039x5;
    }

    @NotNull
    public final C8737a L5() {
        return f80933m6;
    }

    @NotNull
    public final C8737a L6() {
        return f80787X6;
    }

    @NotNull
    public final C8737a L7() {
        return f81006u0;
    }

    @NotNull
    public final C8737a M() {
        return f80799Z0;
    }

    @NotNull
    public final C8737a M0() {
        return f80810a2;
    }

    @NotNull
    public final C8737a M1() {
        return f80909k2;
    }

    @NotNull
    public final C8737a M2() {
        return f80946o;
    }

    @NotNull
    public final C8737a M3() {
        return f80596C4;
    }

    @NotNull
    public final C8737a M4() {
        return f81048y5;
    }

    @NotNull
    public final C8737a M5() {
        return f80943n6;
    }

    @NotNull
    public final C8737a M6() {
        return f80796Y6;
    }

    @NotNull
    public final C8737a M7() {
        return f81016v0;
    }

    @NotNull
    public final C8737a N() {
        return f80809a1;
    }

    @NotNull
    public final C8737a N0() {
        return f80791Y1;
    }

    @NotNull
    public final C8737a N1() {
        return f80919l2;
    }

    @NotNull
    public final C8737a N2() {
        return f80956p;
    }

    @NotNull
    public final C8737a N3() {
        return f80614E4;
    }

    @NotNull
    public final C8737a N4() {
        return f81057z5;
    }

    @NotNull
    public final C8737a N5() {
        return f80953o6;
    }

    @NotNull
    public final C8737a N6() {
        return f80805Z6;
    }

    @NotNull
    public final C8737a N7() {
        return f81025w0;
    }

    @NotNull
    public final C8737a O() {
        return f80819b1;
    }

    @NotNull
    public final C8737a O0() {
        return f80639H2;
    }

    @NotNull
    public final C8737a O1() {
        return f80929m2;
    }

    @NotNull
    public final C8737a O2() {
        return f80966q;
    }

    @NotNull
    public final C8737a O3() {
        return f80623F4;
    }

    @NotNull
    public final C8737a O4() {
        return f80762V;
    }

    @NotNull
    public final C8737a O5() {
        return f80963p6;
    }

    @NotNull
    public final C8737a O6() {
        return f80815a7;
    }

    @NotNull
    public final C8737a O7() {
        return f81034x0;
    }

    @NotNull
    public final C8737a P() {
        return f80829c1;
    }

    @NotNull
    public final C8737a P0() {
        return f80648I2;
    }

    @NotNull
    public final C8737a P1() {
        return f80939n2;
    }

    @NotNull
    public final C8737a P2() {
        return f80976r;
    }

    @NotNull
    public final C8737a P3() {
        return f80605D4;
    }

    @NotNull
    public final C8737a P4() {
        return f80771W;
    }

    @NotNull
    public final C8737a P5() {
        return f80973q6;
    }

    @NotNull
    public final C8737a P6() {
        return f80825b7;
    }

    @NotNull
    public final C8737a P7() {
        return f80779W7;
    }

    @NotNull
    public final C8737a Q() {
        return f80839d1;
    }

    @NotNull
    public final C8737a Q0() {
        return f80657J2;
    }

    @NotNull
    public final C8737a Q1() {
        return f80949o2;
    }

    @NotNull
    public final C8737a Q2() {
        return f80986s;
    }

    @NotNull
    public final C8737a Q3() {
        return f80632G4;
    }

    @NotNull
    public final C8737a Q4() {
        return f80579A5;
    }

    @NotNull
    public final C8737a Q5() {
        return f80983r6;
    }

    @NotNull
    public final C8737a Q6() {
        return f80835c7;
    }

    @NotNull
    public final C8737a Q7() {
        return f80806Z7;
    }

    @NotNull
    public final C8737a R() {
        return f80849e1;
    }

    @NotNull
    public final C8737a R0() {
        return f80666K2;
    }

    @NotNull
    public final C8737a R1() {
        return f80959p2;
    }

    @NotNull
    public final C8737a R2() {
        return f80996t;
    }

    @NotNull
    public final C8737a R3() {
        return f80641H4;
    }

    @NotNull
    public final C8737a R4() {
        return f80597C5;
    }

    @NotNull
    public final C8737a R5() {
        return f80993s6;
    }

    @NotNull
    public final C8737a R6() {
        return f80855e7;
    }

    @NotNull
    public final C8737a R7() {
        return f80816a8;
    }

    @NotNull
    public final C8737a S() {
        return f80859f1;
    }

    @NotNull
    public final C8737a S0() {
        return f80675L2;
    }

    @NotNull
    public final C8737a S1() {
        return f80990s3;
    }

    @NotNull
    public final C8737a S2() {
        return f81005u;
    }

    @NotNull
    public final C8737a S3() {
        return f80650I4;
    }

    @NotNull
    public final C8737a S4() {
        return f80606D5;
    }

    @NotNull
    public final C8737a S5() {
        return f81002t6;
    }

    @NotNull
    public final C8737a S6() {
        return f7;
    }

    @NotNull
    public final C8737a S7() {
        return f80826b8;
    }

    @NotNull
    public final C8737a T() {
        return f80868g1;
    }

    @NotNull
    public final C8737a T0() {
        return f80684M2;
    }

    @NotNull
    public final C8737a T1() {
        return f80999t3;
    }

    @NotNull
    public final C8737a T2() {
        return f81015v;
    }

    @NotNull
    public final C8737a T3() {
        return f80659J4;
    }

    @NotNull
    public final C8737a T4() {
        return f80588B5;
    }

    @NotNull
    public final C8737a T5() {
        return f81012u6;
    }

    @NotNull
    public final C8737a T6() {
        return f80845d7;
    }

    @NotNull
    public final C8737a T7() {
        return f80836c8;
    }

    @NotNull
    public final C8737a U() {
        return f80878h1;
    }

    @NotNull
    public final C8737a U0() {
        return f80693N2;
    }

    @NotNull
    public final C8737a U1() {
        return f81009u3;
    }

    @NotNull
    public final C8737a U2() {
        return f81024w;
    }

    @NotNull
    public final C8737a U3() {
        return f80677L4;
    }

    @NotNull
    public final C8737a U4() {
        return f80615E5;
    }

    @NotNull
    public final C8737a U5() {
        return f81022v6;
    }

    @NotNull
    public final C8737a U6() {
        return f80874g7;
    }

    @NotNull
    public final C8737a U7() {
        return f80856e8;
    }

    @NotNull
    public final C8737a V() {
        return f80888i1;
    }

    @NotNull
    public final C8737a V0() {
        return f80702O2;
    }

    @NotNull
    public final C8737a V1() {
        return f81019v3;
    }

    @NotNull
    public final C8737a V2() {
        return f81033x;
    }

    @NotNull
    public final C8737a V3() {
        return f80686M4;
    }

    @NotNull
    public final C8737a V4() {
        return f80624F5;
    }

    @NotNull
    public final C8737a V5() {
        return f81031w6;
    }

    @NotNull
    public final C8737a V6() {
        return f80884h7;
    }

    @NotNull
    public final C8737a V7() {
        return f80865f8;
    }

    @NotNull
    public final C8737a W() {
        return f80898j1;
    }

    @NotNull
    public final C8737a W0() {
        return f80711P2;
    }

    @NotNull
    public final C8737a W1() {
        return f80876h;
    }

    @NotNull
    public final C8737a W2() {
        return f81042y;
    }

    @NotNull
    public final C8737a W3() {
        return f80668K4;
    }

    @NotNull
    public final C8737a W4() {
        return f80633G5;
    }

    @NotNull
    public final C8737a W5() {
        return f81049y6;
    }

    @NotNull
    public final C8737a W6() {
        return f80894i7;
    }

    @NotNull
    public final C8737a W7() {
        return f80846d8;
    }

    @NotNull
    public final C8737a X() {
        return f80908k1;
    }

    @NotNull
    public final C8737a X0() {
        return f80720Q2;
    }

    @NotNull
    public final C8737a X1() {
        return f80886i;
    }

    @NotNull
    public final C8737a X2() {
        return f81051z;
    }

    @NotNull
    public final C8737a X3() {
        return f80695N4;
    }

    @NotNull
    public final C8737a X4() {
        return f80642H5;
    }

    @NotNull
    public final C8737a X5() {
        return f81058z6;
    }

    @NotNull
    public final C8737a X6() {
        return f80904j7;
    }

    @NotNull
    public final C8737a X7() {
        return f80875g8;
    }

    @NotNull
    public final C8737a Y() {
        return f80918l1;
    }

    @NotNull
    public final C8737a Y0() {
        return f80729R2;
    }

    @NotNull
    public final C8737a Y1() {
        return f81028w3;
    }

    @NotNull
    public final C8737a Y2() {
        return f80573A;
    }

    @NotNull
    public final C8737a Y3() {
        return f80713P4;
    }

    @NotNull
    public final C8737a Y4() {
        return f80651I5;
    }

    @NotNull
    public final C8737a Y5() {
        return f81040x6;
    }

    @NotNull
    public final C8737a Y6() {
        return f80924l7;
    }

    @NotNull
    public final C8737a Y7() {
        return f81043y0;
    }

    @NotNull
    public final C8737a Z() {
        return f80928m1;
    }

    @NotNull
    public final C8737a Z0() {
        return f80738S2;
    }

    @NotNull
    public final C8737a Z1() {
        return f81046y3;
    }

    @NotNull
    public final C8737a Z2() {
        return f80582B;
    }

    @NotNull
    public final C8737a Z3() {
        return f80722Q4;
    }

    @NotNull
    public final C8737a Z4() {
        return f80660J5;
    }

    @NotNull
    public final C8737a Z5() {
        return f80580A6;
    }

    @NotNull
    public final C8737a Z6() {
        return f80934m7;
    }

    @NotNull
    public final C8737a Z7() {
        return f81052z0;
    }

    @NotNull
    public final C8737a a() {
        return f80817b;
    }

    @NotNull
    public final C8737a a0() {
        return f80938n1;
    }

    @NotNull
    public final C8737a a1() {
        return f80837d;
    }

    @NotNull
    public final C8737a a2() {
        return f81055z3;
    }

    @NotNull
    public final C8737a a3() {
        return f80591C;
    }

    @NotNull
    public final C8737a a4() {
        return f80704O4;
    }

    @NotNull
    public final C8737a a5() {
        return f80678L5;
    }

    @NotNull
    public final C8737a a6() {
        return f80589B6;
    }

    @NotNull
    public final C8737a a7() {
        return f80914k7;
    }

    @NotNull
    public final C8737a a8() {
        return f80885h8;
    }

    @NotNull
    public final C8737a b() {
        return f80827c;
    }

    @NotNull
    public final C8737a b0() {
        return f80958p1;
    }

    @NotNull
    public final C8737a b1() {
        return f80747T2;
    }

    @NotNull
    public final C8737a b2() {
        return f81037x3;
    }

    @NotNull
    public final C8737a b3() {
        return f80600D;
    }

    @NotNull
    public final C8737a b4() {
        return f80803Z4;
    }

    @NotNull
    public final C8737a b5() {
        return f80696N5;
    }

    @NotNull
    public final C8737a b6() {
        return f80867g0;
    }

    @NotNull
    public final C8737a b7() {
        return f80944n7;
    }

    @NotNull
    public final C8737a b8() {
        return f80895i8;
    }

    @NotNull
    public final C8737a c() {
        return f80969q2;
    }

    @NotNull
    public final C8737a c0() {
        return f80968q1;
    }

    @NotNull
    public final C8737a c1() {
        return f80756U2;
    }

    @NotNull
    public final C8737a c2() {
        return f80577A3;
    }

    @NotNull
    public final C8737a c3() {
        return f80609E;
    }

    @NotNull
    public final C8737a c4() {
        return f80813a5;
    }

    @NotNull
    public final C8737a c5() {
        return f80705O5;
    }

    @NotNull
    public final C8737a c6() {
        return f80598C6;
    }

    @NotNull
    public final C8737a c7() {
        return f80954o7;
    }

    @NotNull
    public final C8737a c8() {
        return f80915k8;
    }

    @NotNull
    public final C8737a d() {
        return f80989s2;
    }

    @NotNull
    public final C8737a d0() {
        return f80948o1;
    }

    @NotNull
    public final C8737a d1() {
        return f80765V2;
    }

    @NotNull
    public final C8737a d2() {
        return f80595C3;
    }

    @NotNull
    public final C8737a d3() {
        return f80731R4;
    }

    @NotNull
    public final C8737a d4() {
        return f80823b5;
    }

    @NotNull
    public final C8737a d5() {
        return f80687M5;
    }

    @NotNull
    public final C8737a d6() {
        return f80607D6;
    }

    @NotNull
    public final C8737a d7() {
        return f80964p7;
    }

    @NotNull
    public final C8737a d8() {
        return f80925l8;
    }

    @NotNull
    public final C8737a e() {
        return t2;
    }

    @NotNull
    public final C8737a e0() {
        return f80978r1;
    }

    @NotNull
    public final C8737a e1() {
        return f80774W2;
    }

    @NotNull
    public final C8737a e2() {
        return f80604D3;
    }

    @NotNull
    public final C8737a e3() {
        return f80749T4;
    }

    @NotNull
    public final C8737a e4() {
        return f80833c5;
    }

    @NotNull
    public final C8737a e5() {
        return f80714P5;
    }

    @NotNull
    public final C8737a e6() {
        return f80616E6;
    }

    @NotNull
    public final C8737a e7() {
        return f80984r7;
    }

    @NotNull
    public final C8737a e8() {
        return f80905j8;
    }

    @NotNull
    public final C8737a f() {
        return f80979r2;
    }

    @NotNull
    public final C8737a f0() {
        return f80998t1;
    }

    @NotNull
    public final C8737a f1() {
        return f80783X2;
    }

    @NotNull
    public final C8737a f2() {
        return f80586B3;
    }

    @NotNull
    public final C8737a f3() {
        return f80758U4;
    }

    @NotNull
    public final C8737a f4() {
        return f80654J;
    }

    @NotNull
    public final C8737a f5() {
        return f80780X;
    }

    @NotNull
    public final C8737a f6() {
        return f80625F6;
    }

    @NotNull
    public final C8737a f7() {
        return f80994s7;
    }

    @NotNull
    public final C8737a f8() {
        return f80935m8;
    }

    @NotNull
    public final C8737a g() {
        return f81008u2;
    }

    @NotNull
    public final C8737a g0() {
        return f81007u1;
    }

    @NotNull
    public final C8737a g1() {
        return f80792Y2;
    }

    @NotNull
    public final C8737a g2() {
        return f80613E3;
    }

    @NotNull
    public final C8737a g3() {
        return f80740S4;
    }

    @NotNull
    public final C8737a g4() {
        return f80663K;
    }

    @NotNull
    public final C8737a g5() {
        return f80789Y;
    }

    @NotNull
    public final C8737a g6() {
        return f80634G6;
    }

    @NotNull
    public final C8737a g7() {
        return f80974q7;
    }

    @NotNull
    public final C8737a g8() {
        return f80574A0;
    }

    @Override // pi.l
    public final InterfaceC8742f getById(String tokenId) {
        Map map;
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        map = C8936b.f81060a;
        return (C8737a) map.get(tokenId);
    }

    @NotNull
    public final C8737a h() {
        return f81027w2;
    }

    @NotNull
    public final C8737a h0() {
        return f80988s1;
    }

    @NotNull
    public final C8737a h1() {
        return f80801Z2;
    }

    @NotNull
    public final C8737a h2() {
        return f80622F3;
    }

    @NotNull
    public final C8737a h3() {
        return f80618F;
    }

    @NotNull
    public final C8737a h4() {
        return f80843d5;
    }

    @NotNull
    public final C8737a h5() {
        return f80669K5;
    }

    @NotNull
    public final C8737a h6() {
        return f80643H6;
    }

    @NotNull
    public final C8737a h7() {
        return f80590B7;
    }

    @NotNull
    public final C8737a h8() {
        return f80583B0;
    }

    @NotNull
    public final C8737a i() {
        return f81036x2;
    }

    @NotNull
    public final C8737a i0() {
        return f81017v1;
    }

    @NotNull
    public final C8737a i1() {
        return f80811a3;
    }

    @NotNull
    public final C8737a i2() {
        return f80631G3;
    }

    @NotNull
    public final C8737a i3() {
        return f80627G;
    }

    @NotNull
    public final C8737a i4() {
        return f80853e5;
    }

    @NotNull
    public final C8737a i5() {
        return f80723Q5;
    }

    @NotNull
    public final C8737a i6() {
        return f80652I6;
    }

    @NotNull
    public final C8737a i7() {
        return f80599C7;
    }

    @NotNull
    public final C8737a i8() {
        return f80945n8;
    }

    @NotNull
    public final C8737a j() {
        return f81018v2;
    }

    @NotNull
    public final C8737a j0() {
        return f81026w1;
    }

    @NotNull
    public final C8737a j1() {
        return f80821b3;
    }

    @NotNull
    public final C8737a j2() {
        return f80640H3;
    }

    @NotNull
    public final C8737a j3() {
        return f80636H;
    }

    @NotNull
    public final C8737a j4() {
        return f80672L;
    }

    @NotNull
    public final C8737a j5() {
        return f80732R5;
    }

    @NotNull
    public final C8737a j6() {
        return f80661J6;
    }

    @NotNull
    public final C8737a j7() {
        return f80608D7;
    }

    @NotNull
    public final C8737a j8() {
        return f80955o8;
    }

    @NotNull
    public final C8737a k() {
        return f81045y2;
    }

    @NotNull
    public final C8737a k0() {
        return f81035x1;
    }

    @NotNull
    public final C8737a k1() {
        return f80831c3;
    }

    @NotNull
    public final C8737a k2() {
        return f80649I3;
    }

    @NotNull
    public final C8737a k3() {
        return f80645I;
    }

    @NotNull
    public final C8737a k4() {
        return f80681M;
    }

    @NotNull
    public final C8737a k5() {
        return f80750T5;
    }

    @NotNull
    public final C8737a k6() {
        return f80670K6;
    }

    @NotNull
    public final C8737a k7() {
        return f80617E7;
    }

    @NotNull
    public final C8737a k8() {
        return f80965p8;
    }

    @NotNull
    public final C8737a l() {
        return f80576A2;
    }

    @NotNull
    public final C8737a l0() {
        return f81044y1;
    }

    @NotNull
    public final C8737a l1() {
        return f80841d3;
    }

    @NotNull
    public final C8737a l2() {
        return f80658J3;
    }

    @NotNull
    public final C8737a l3() {
        return f80767V4;
    }

    @NotNull
    public final C8737a l4() {
        return f80863f5;
    }

    @NotNull
    public final C8737a l5() {
        return f80759U5;
    }

    @NotNull
    public final C8737a l6() {
        return f80679L6;
    }

    @NotNull
    public final C8737a l7() {
        return f80937n0;
    }

    @NotNull
    public final C8737a l8() {
        return f80592C0;
    }

    @NotNull
    public final C8737a m() {
        return f80585B2;
    }

    @NotNull
    public final C8737a m0() {
        return f81053z1;
    }

    @NotNull
    public final C8737a m1() {
        return f80851e3;
    }

    @NotNull
    public final C8737a m2() {
        return f80667K3;
    }

    @NotNull
    public final C8737a m3() {
        return f80785X4;
    }

    @NotNull
    public final C8737a m4() {
        return f80872g5;
    }

    @NotNull
    public final C8737a m5() {
        return f80741S5;
    }

    @NotNull
    public final C8737a m6() {
        return f81003t7;
    }

    @NotNull
    public final C8737a m7() {
        return f80626F7;
    }

    @NotNull
    public final C8737a m8() {
        return f80601D0;
    }

    @NotNull
    public final C8737a n() {
        return f81054z2;
    }

    @NotNull
    public final C8737a n0() {
        return f80575A1;
    }

    @NotNull
    public final C8737a n1() {
        return f80847e;
    }

    @NotNull
    public final C8737a n2() {
        return f80676L3;
    }

    @NotNull
    public final C8737a n3() {
        return f80794Y4;
    }

    @NotNull
    public final C8737a n4() {
        return f80690N;
    }

    @NotNull
    public final C8737a n5() {
        return f80768V5;
    }

    @NotNull
    public final C8737a n6() {
        return f81023v7;
    }

    @NotNull
    public final C8737a n7() {
        return f80635G7;
    }

    @NotNull
    public final C8737a n8() {
        return f80975q8;
    }

    @NotNull
    public final C8737a o() {
        return f80594C2;
    }

    @NotNull
    public final C8737a o0() {
        return f80584B1;
    }

    @NotNull
    public final C8737a o1() {
        return f80857f;
    }

    @NotNull
    public final C8737a o2() {
        return f80685M3;
    }

    @NotNull
    public final C8737a o3() {
        return f80776W4;
    }

    @NotNull
    public final C8737a o4() {
        return f80882h5;
    }

    @NotNull
    public final C8737a o5() {
        return f80777W5;
    }

    @NotNull
    public final C8737a o6() {
        return f81032w7;
    }

    @NotNull
    public final C8737a o7() {
        return f80644H7;
    }

    @NotNull
    public final C8737a o8() {
        return f80985r8;
    }

    @NotNull
    public final C8737a p() {
        return f80612E2;
    }

    @NotNull
    public final C8737a p0() {
        return f80602D1;
    }

    @NotNull
    public final C8737a p1() {
        return f80866g;
    }

    @NotNull
    public final C8737a p2() {
        return f80694N3;
    }

    @NotNull
    public final C8737a p3() {
        return f80862f4;
    }

    @NotNull
    public final C8737a p4() {
        return f80892i5;
    }

    @NotNull
    public final C8737a p5() {
        return f80795Y5;
    }

    @NotNull
    public final C8737a p6() {
        return f80877h0;
    }

    @NotNull
    public final C8737a p7() {
        return f80947o0;
    }

    @NotNull
    public final C8737a p8() {
        return f81004t8;
    }

    @NotNull
    public final C8737a q() {
        return f80621F2;
    }

    @NotNull
    public final C8737a q0() {
        return f80611E1;
    }

    @NotNull
    public final C8737a q1() {
        return f80861f3;
    }

    @NotNull
    public final C8737a q2() {
        return f80712P3;
    }

    @NotNull
    public final C8737a q3() {
        return f80881h4;
    }

    @NotNull
    public final C8737a q4() {
        return f80902j5;
    }

    @NotNull
    public final C8737a q5() {
        return f80804Z5;
    }

    @NotNull
    public final C8737a q6() {
        return f80887i0;
    }

    @NotNull
    public final C8737a q7() {
        return f80653I7;
    }

    @NotNull
    public final C8737a q8() {
        return f81014u8;
    }

    @NotNull
    public final C8737a r() {
        return f80603D2;
    }

    @NotNull
    public final C8737a r0() {
        return f80593C1;
    }

    @NotNull
    public final C8737a r1() {
        return f80880h3;
    }

    @NotNull
    public final C8737a r2() {
        return f80721Q3;
    }

    @NotNull
    public final C8737a r3() {
        return f80891i4;
    }

    @NotNull
    public final C8737a r4() {
        return f80912k5;
    }

    @NotNull
    public final C8737a r5() {
        return f80786X5;
    }

    @NotNull
    public final C8737a r6() {
        return f81013u7;
    }

    @NotNull
    public final C8737a r7() {
        return f80662J7;
    }

    @NotNull
    public final C8737a r8() {
        return f80610E0;
    }

    @NotNull
    public final C8737a s() {
        return f80630G2;
    }

    @NotNull
    public final C8737a s0() {
        return f80620F1;
    }

    @NotNull
    public final C8737a s1() {
        return f80890i3;
    }

    @NotNull
    public final C8737a s2() {
        return f80703O3;
    }

    @NotNull
    public final C8737a s3() {
        return f80871g4;
    }

    @NotNull
    public final C8737a s4() {
        return f80699O;
    }

    @NotNull
    public final C8737a s5() {
        return f80814a6;
    }

    @NotNull
    public final C8737a s6() {
        return f81041x7;
    }

    @NotNull
    public final C8737a s7() {
        return f80957p0;
    }

    @NotNull
    public final C8737a s8() {
        return f80619F0;
    }

    @NotNull
    public final C8737a t() {
        return f80628G0;
    }

    @NotNull
    public final C8737a t0() {
        return f80638H1;
    }

    @NotNull
    public final C8737a t1() {
        return f80870g3;
    }

    @NotNull
    public final C8737a t2() {
        return f80730R3;
    }

    @NotNull
    public final C8737a t3() {
        return f80901j4;
    }

    @NotNull
    public final C8737a t4() {
        return f80922l5;
    }

    @NotNull
    public final C8737a t5() {
        return f80798Z;
    }

    @NotNull
    public final C8737a t6() {
        return f81059z7;
    }

    @NotNull
    public final C8737a t7() {
        return f80671K7;
    }

    @NotNull
    public final C8737a t8() {
        return f80995s8;
    }

    @NotNull
    public final C8737a u() {
        return f80646I0;
    }

    @NotNull
    public final C8737a u0() {
        return f80647I1;
    }

    @NotNull
    public final C8737a u1() {
        return f80900j3;
    }

    @NotNull
    public final C8737a u2() {
        return f80739S3;
    }

    @NotNull
    public final C8737a u3() {
        return f80921l4;
    }

    @NotNull
    public final C8737a u4() {
        return f80932m5;
    }

    @NotNull
    public final C8737a u5() {
        return f80808a0;
    }

    @NotNull
    public final C8737a u6() {
        return f80581A7;
    }

    @NotNull
    public final C8737a u7() {
        return f80967q0;
    }

    @NotNull
    public final C8737a v() {
        return f80655J0;
    }

    @NotNull
    public final C8737a v0() {
        return f80629G1;
    }

    @NotNull
    public final C8737a v1() {
        return f80920l3;
    }

    @NotNull
    public final C8737a v2() {
        return f80748T3;
    }

    @NotNull
    public final C8737a v3() {
        return f80931m4;
    }

    @NotNull
    public final C8737a v4() {
        return f80942n5;
    }

    @NotNull
    public final C8737a v5() {
        return f80818b0;
    }

    @NotNull
    public final C8737a v6() {
        return f80897j0;
    }

    @NotNull
    public final C8737a v7() {
        return f80680L7;
    }

    @NotNull
    public final C8737a w() {
        return f80637H0;
    }

    @NotNull
    public final C8737a w0() {
        return f80656J1;
    }

    @NotNull
    public final C8737a w1() {
        return f80930m3;
    }

    @NotNull
    public final C8737a w2() {
        return f80757U3;
    }

    @NotNull
    public final C8737a w3() {
        return f80911k4;
    }

    @NotNull
    public final C8737a w4() {
        return f80708P;
    }

    @NotNull
    public final C8737a w5() {
        return f80824b6;
    }

    @NotNull
    public final C8737a w6() {
        return f80907k0;
    }

    @NotNull
    public final C8737a w7() {
        return f80698N7;
    }

    @NotNull
    public final C8737a x() {
        return f80664K0;
    }

    @NotNull
    public final C8737a x0() {
        return f80665K1;
    }

    @NotNull
    public final C8737a x1() {
        return f80910k3;
    }

    @NotNull
    public final C8737a x2() {
        return f80766V3;
    }

    @NotNull
    public final C8737a x3() {
        return f80941n4;
    }

    @NotNull
    public final C8737a x4() {
        return f80952o5;
    }

    @NotNull
    public final C8737a x5() {
        return f80834c6;
    }

    @NotNull
    public final C8737a x6() {
        return f80917l0;
    }

    @NotNull
    public final C8737a x7() {
        return f80707O7;
    }

    @NotNull
    public final C8737a y() {
        return f80682M0;
    }

    @NotNull
    public final C8737a y0() {
        return f80674L1;
    }

    @NotNull
    public final C8737a y1() {
        return f80940n3;
    }

    @NotNull
    public final C8737a y2() {
        return f80775W3;
    }

    @NotNull
    public final C8737a y3() {
        return f80951o4;
    }

    @NotNull
    public final C8737a y4() {
        return f80972q5;
    }

    @NotNull
    public final C8737a y5() {
        return f80844d6;
    }

    @NotNull
    public final C8737a y6() {
        return f80927m0;
    }

    @NotNull
    public final C8737a y7() {
        return f80977r0;
    }

    @NotNull
    public final C8737a z() {
        return f80691N0;
    }

    @NotNull
    public final C8737a z0() {
        return f80683M1;
    }

    @NotNull
    public final C8737a z1() {
        return f80950o3;
    }

    @NotNull
    public final C8737a z2() {
        return f80896j;
    }

    @NotNull
    public final C8737a z3() {
        return f80961p4;
    }

    @NotNull
    public final C8737a z4() {
        return f80982r5;
    }

    @NotNull
    public final C8737a z5() {
        return f80854e6;
    }

    @NotNull
    public final C8737a z6() {
        return f81050y7;
    }

    @NotNull
    public final C8737a z7() {
        return f80987s0;
    }
}
