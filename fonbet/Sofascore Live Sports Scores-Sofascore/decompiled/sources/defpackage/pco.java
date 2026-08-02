package defpackage;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.facebook.internal.k0;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.ironsource.Ua;
import com.ironsource.V2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.fantasy.FantasyUserRound;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.results.fantasy.ui.components.FantasyLeaderboardStatistic;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class pco implements vh2 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final tc3 c = new tc3(352331372, new qs2(27), false);
    public static final tc3 d = new tc3(-489131892, new ud3(20), false);
    public static final tc3 e = new tc3(392064274, new ud3(21), false);
    public static final float[] f = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] g = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final ld0 h = new ld0(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 128, 17);
    public static final g5g i = new g5g(0.16f, 0.1f, 0.08f, 0.1f);
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long A(lof lofVar, gc2 gc2Var, int i2, long j2, long j3) {
        long j4;
        gc2 gc2Var2;
        gc2Var.getClass();
        int i3 = i2;
        long j5 = i3;
        yqo.x(gc2Var.h(), 0L, j5);
        boolean z = lofVar.c;
        x52 x52Var = lofVar.b;
        if (!z) {
            gc2 gc2Var3 = gc2Var;
            long j6 = j2;
            while (true) {
                long a2 = e.a(x52Var, gc2Var3, j6, j3, i3);
                long j7 = j6;
                long j8 = -1;
                if (a2 == -1) {
                    long j9 = x52Var.b;
                    long j10 = (j9 - j5) + 1;
                    if (j10 >= j3) {
                        break;
                    }
                    if (j9 >= j3) {
                        int max = (int) Math.max(1L, (j9 - j3) + 1);
                        int min = ((int) Math.min(j5, (x52Var.b - j7) + 1)) - 1;
                        if (max > min) {
                            break;
                        }
                        while (true) {
                            j4 = j8;
                            gc2Var2 = gc2Var;
                            if (x52Var.g0(x52Var.b - min, gc2Var2, min)) {
                                break;
                            }
                            if (min == max) {
                                return j4;
                            }
                            min--;
                            j8 = j4;
                        }
                    } else {
                        j4 = -1;
                        gc2Var2 = gc2Var;
                    }
                    if (lofVar.a.read(x52Var, 8192L) == j4) {
                        return j4;
                    }
                    long max2 = Math.max(j7, j10);
                    gc2Var3 = gc2Var2;
                    j6 = max2;
                    i3 = i2;
                } else {
                    return a2;
                }
            }
        } else {
            a70.r("closed");
            return 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        if (r9.getClass().getSimpleName().equals((java.lang.String) defpackage.mz1.g(1, r12)) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ed, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r12, r5) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r12, r6) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r12, r6) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0165, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r12, r1) == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList B(View view, List list, int i2, int i3, String str) {
        List split$default;
        str.getClass();
        String str2 = str + '.' + i3;
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            int i4 = 0;
            if (i2 >= list.size()) {
                arrayList.add(new n03(view, str2));
            } else {
                wae waeVar = (wae) list.get(i2);
                String str3 = waeVar.a;
                if (Intrinsics.c(str3, "..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        ArrayList C = C((ViewGroup) parent);
                        int size = C.size();
                        while (i4 < size) {
                            arrayList.addAll(B((View) C.get(i4), list, i2 + 1, i4, str2));
                            i4++;
                        }
                    }
                } else {
                    if (Intrinsics.c(str3, ".")) {
                        arrayList.add(new n03(view, str2));
                        return arrayList;
                    }
                    int i5 = waeVar.b;
                    int i6 = waeVar.h;
                    if (i5 == -1 || i3 == i5) {
                        if (!Intrinsics.c(view.getClass().getCanonicalName(), str3)) {
                            if (new Regex(".*android\\..*").f(str3)) {
                                split$default = StringsKt__StringsKt.split$default(waeVar.a, new String[]{"."}, false, 0, 6, null);
                                if (!split$default.isEmpty()) {
                                }
                            }
                        }
                        if ((i6 & 1) <= 0 || waeVar.c == view.getId()) {
                            if ((i6 & 2) > 0) {
                                String str4 = waeVar.d;
                                String j2 = xsk.j(view);
                                String d2 = k0.d(k0.K(j2));
                                if (!Intrinsics.c(str4, j2)) {
                                }
                            }
                            if ((i6 & 8) > 0) {
                                String str5 = waeVar.f;
                                String obj = view.getContentDescription() == null ? "" : view.getContentDescription().toString();
                                String d3 = k0.d(k0.K(obj));
                                if (!Intrinsics.c(str5, obj)) {
                                }
                            }
                            if ((i6 & 16) > 0) {
                                String str6 = waeVar.g;
                                String h2 = xsk.h(view);
                                String d4 = k0.d(k0.K(h2));
                                if (!Intrinsics.c(str6, h2)) {
                                }
                            }
                            if ((i6 & 4) > 0) {
                                String str7 = waeVar.e;
                                String obj2 = view.getTag() != null ? view.getTag().toString() : "";
                                String d5 = k0.d(k0.K(obj2));
                                if (!Intrinsics.c(str7, obj2)) {
                                }
                            }
                            if (i2 == list.size() - 1) {
                                arrayList.add(new n03(view, str2));
                            }
                        }
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ArrayList C2 = C((ViewGroup) view);
                int size2 = C2.size();
                while (i4 < size2) {
                    arrayList.addAll(B((View) C2.get(i4), list, i2 + 1, i4, str2));
                    i4++;
                }
            }
        }
        return arrayList;
    }

    public static ArrayList C(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public static long D(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i4, 262142);
        int min2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    cn3.l(i7);
                    pvd.x();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return cn3.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, min, min2);
    }

    public static long E(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i2, 262142);
        int min2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    cn3.l(i7);
                    pvd.x();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return cn3.a(min, min2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static String F() {
        return (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/");
    }

    public static final void G(ExtendedFloatingActionButton extendedFloatingActionButton, Function0 function0) {
        u6b w;
        SharedPreferences d2;
        Context context = extendedFloatingActionButton.getContext();
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        extendedFloatingActionButton.y(2);
        if (sharedPreferences.getBoolean("PREF_CHAT_SHOW_ANIMATED_CHAT_ICON", true) && (w = qha.w(extendedFloatingActionButton)) != null) {
            xw3.L(wca.x(w.getLifecycle()), null, null, new d17(extendedFloatingActionButton, null, 18), 3);
        }
        extendedFloatingActionButton.setOnClickListener(new qh(19, function0, sharedPreferences, extendedFloatingActionButton));
    }

    public static final boolean H(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }

    public static final String I(int i2, Integer num, boolean z) {
        if (num == null || num.intValue() <= 0) {
            return vxd.j(i2, F(), "tournament/", "/image");
        }
        return F() + "unique-tournament/" + num + "/image" + (z ? "/dark" : "");
    }

    public static final String J(int i2, String str, String str2) {
        StringBuilder sb = new StringBuilder(F());
        sb.append("event/");
        sb.append(i2);
        sb.append("/jersey/");
        sb.append(str);
        return wt3.m("/", str2, sb, "/fancy");
    }

    public static final String K(int i2) {
        return vxd.j(i2, F(), "manager/", "/image");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long L(int i2, int i3, String str) {
        char c2;
        int i4;
        long j2;
        char c3;
        char c4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        long j3;
        char c5;
        int i10;
        int i11;
        int i12;
        long j4 = 4294967295L;
        if (i2 == i3) {
            return (i2 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
        }
        char charAt = str.charAt(i2);
        boolean z2 = charAt == '-';
        if (z2) {
            i4 = i2 + 1;
            if (i4 == i3) {
                return (i4 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
            }
            c2 = str.charAt(i4);
            if (((char) (c2 - '0')) >= '\n' && c2 != '.') {
                return (i4 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
            }
        } else {
            c2 = charAt;
            i4 = i2;
        }
        int length = str.length();
        int i13 = i4;
        long j5 = 0;
        while (true) {
            if (i13 == i3) {
                j2 = j4;
                break;
            }
            j2 = j4;
            int i14 = c2 - '0';
            if (((char) i14) >= '\n') {
                break;
            }
            j5 = (j5 * 10) + i14;
            i13++;
            c2 = i13 < length ? str.charAt(i13) : (char) 0;
            j4 = j2;
        }
        int i15 = i13 - i4;
        char c6 = '0';
        if (i13 == i3 || c2 != '.') {
            c3 = ' ';
            c4 = 1;
            i5 = i13;
            i6 = i5;
            i7 = 0;
        } else {
            int i16 = i13 + 1;
            c3 = ' ';
            i5 = i16;
            while (true) {
                c4 = 1;
                if (i3 - i5 < 4) {
                    i12 = i16;
                    break;
                }
                i12 = i16;
                long charAt2 = str.charAt(i5) | (str.charAt(i5 + 1) << 16) | (str.charAt(i5 + 2) << 32) | (str.charAt(i5 + 3) << 48);
                long j6 = charAt2 - 13511005043687472L;
                int i17 = (((charAt2 + 19703549022044230L) | j6) & (-35747867511423104L)) != 0 ? -1 : (int) ((j6 * 281475406208040961L) >>> 48);
                if (i17 < 0) {
                    break;
                }
                j5 = (j5 * Ua.s) + i17;
                i5 += 4;
                i16 = i12;
            }
            char charAt3 = i5 < length ? str.charAt(i5) : (char) 0;
            loop2: while (true) {
                c2 = charAt3;
                while (i5 != i3) {
                    int i18 = c2 - '0';
                    if (((char) i18) >= '\n') {
                        break loop2;
                    }
                    j5 = (j5 * 10) + i18;
                    i5++;
                    if (i5 < length) {
                        break;
                    }
                    c2 = 0;
                }
                charAt3 = str.charAt(i5);
            }
            i7 = i12 - i5;
            i15 -= i7;
            i6 = i12;
        }
        if (i15 == 0) {
            return (i5 << c3) | (Float.floatToRawIntBits(Float.NaN) & j2);
        }
        if ((c2 | ' ') == 101) {
            i8 = i5 + 1;
            char charAt4 = i8 < length ? str.charAt(i8) : (char) 0;
            char c7 = charAt4 == '-' ? c4 : (char) 0;
            if (c7 != 0 || charAt4 == '+') {
                i8 = i5 + 2;
            }
            char charAt5 = str.charAt(i8);
            i9 = 0;
            while (true) {
                if (i8 == i3) {
                    i11 = i7;
                    break;
                }
                int i19 = charAt5 - c6;
                i11 = i7;
                if (((char) i19) >= '\n') {
                    break;
                }
                if (i9 < 1024) {
                    i9 = (i9 * 10) + i19;
                }
                i8++;
                charAt5 = i8 < length ? str.charAt(i8) : (char) 0;
                i7 = i11;
                c6 = '0';
            }
            if (c7 != 0) {
                i9 = -i9;
            }
            i7 = i11 + i9;
        } else {
            i8 = i5;
            i9 = 0;
        }
        int i20 = 19;
        if (i15 > 19) {
            char charAt6 = str.charAt(i4);
            int i21 = i4;
            while (true) {
                if (i8 == i3) {
                    i10 = i20;
                    break;
                }
                if (charAt6 != '0' && charAt6 != '.') {
                    i10 = 19;
                    break;
                }
                if (charAt6 == '0') {
                    i15--;
                }
                i21++;
                charAt6 = i21 < length ? str.charAt(i21) : (char) 0;
                i20 = 19;
            }
            if (i15 > i10) {
                char charAt7 = str.charAt(i4);
                z = z2;
                j3 = 0;
                while (i4 != i13) {
                    d8k d8kVar = e8k.b;
                    if (Long.compareUnsigned(j3, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j3 = (j3 * 10) + (charAt7 - '0');
                    i4++;
                    charAt7 = i4 < length ? str.charAt(i4) : (char) 0;
                }
                d8k d8kVar2 = e8k.b;
                if (Long.compareUnsigned(j3, 1000000000000000000L) >= 0) {
                    i7 = (i13 - i4) + i9;
                } else {
                    char charAt8 = str.charAt(i6);
                    int i22 = i6;
                    while (i22 != i5 && Long.compareUnsigned(j3, 1000000000000000000L) < 0) {
                        j3 = (j3 * 10) + (charAt8 - '0');
                        i22++;
                        charAt8 = i22 < length ? str.charAt(i22) : (char) 0;
                    }
                    i7 = (i6 - i22) + i9;
                }
                c5 = c4;
                if (-10 <= i7 && i7 < 11 && c5 == 0) {
                    d8k d8kVar3 = e8k.b;
                    if (Long.compareUnsigned(j3, 16777216L) <= 0) {
                        float f2 = j3;
                        float[] fArr = f;
                        float f3 = i7 < 0 ? f2 / fArr[-i7] : f2 * fArr[i7];
                        if (z) {
                            f3 = -f3;
                        }
                        return (i8 << c3) | (Float.floatToRawIntBits(f3) & j2);
                    }
                }
                if (j3 != 0) {
                    return (i8 << c3) | (Float.floatToRawIntBits(z ? -0.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & j2);
                }
                if (-126 > i7 || i7 >= 128) {
                    return (i8 << c3) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8))) & j2);
                }
                long j7 = g[i7 + 325];
                d8k d8kVar4 = e8k.b;
                int numberOfLeadingZeros = Long.numberOfLeadingZeros(j3);
                long j8 = j3 << numberOfLeadingZeros;
                long j9 = j8 & j2;
                long j10 = j8 >>> c3;
                long j11 = j7 & j2;
                long j12 = j7 >>> c3;
                long j13 = j10 * j12;
                long j14 = j12 * j9;
                long j15 = j13 + ((((j10 * j11) + ((j9 * j11) >>> c3)) + (j14 & j2)) >>> c3) + (j14 >>> c3);
                int i23 = (int) (j15 >>> 63);
                long j16 = j15 >>> (i23 + 9);
                int i24 = numberOfLeadingZeros + (i23 ^ 1);
                long j17 = j15 & 511;
                if (j17 == 511 || (j17 == 0 && (3 & j16) == 1)) {
                    return (i8 << c3) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8))) & j2);
                }
                long j18 = (j16 + 1) >>> c4;
                if (j18 >= 9007199254740992L) {
                    i24--;
                    j18 = 4503599627370496L;
                }
                long j19 = j18 & (-4503599627370497L);
                long j20 = (((i7 * 217706) >> 16) + 1087) - i24;
                if (j20 < 1 || j20 > 2046) {
                    return (i8 << c3) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8))) & j2);
                }
                return (i8 << c3) | (Float.floatToRawIntBits((float) Double.longBitsToDouble((j20 << 52) | j19 | (z ? Long.MIN_VALUE : 0L))) & j2);
            }
        }
        z = z2;
        j3 = j5;
        c5 = 0;
        if (-10 <= i7) {
            d8k d8kVar32 = e8k.b;
            if (Long.compareUnsigned(j3, 16777216L) <= 0) {
            }
        }
        if (j3 != 0) {
        }
    }

    public static final String M(int i2) {
        return vxd.j(i2, F(), "player/", "/image");
    }

    public static final View N(xv4 xv4Var) {
        if (!((wtc) xv4Var).a.n) {
            r3a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) zma.a(c6o.c0(xv4Var));
    }

    public static final void O(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void P(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static String Q(int i2, boolean z) {
        return F() + "stage/" + i2 + "/logo" + (z ? "/dark" : "");
    }

    public static final String R(int i2) {
        return vxd.j(i2, F(), "team/", "/image");
    }

    public static int S(int i2, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final ho7 T(FantasyUserRound fantasyUserRound) {
        fantasyUserRound.getClass();
        return new ho7(pd0.K(fantasyUserRound.getFantasyRound()), fantasyUserRound.getScore(), fantasyUserRound.getFreeTransfers(), fantasyUserRound.getTransferPenalty(), fantasyUserRound.getWildcardActive(), fantasyUserRound.getFreeHitActive(), fantasyUserRound.getTripleCaptainActive(), 128);
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final int i2, final x43 x43Var, xtc xtcVar, ct8 ct8Var, ct8 ct8Var2, ct8 ct8Var3, final tc3 tc3Var, ct8 ct8Var4, String str, String str2, boolean z, boolean z2, boolean z3, float f2, float f3, float f4, Function1 function1, Function0 function0, Function0 function02, of3 of3Var, final int i3, final int i4, final int i5) {
        int i6;
        xtc xtcVar2;
        int i7;
        ct8 ct8Var5;
        int i8;
        ct8 ct8Var6;
        int i9;
        ct8 ct8Var7;
        int i10;
        ct8 ct8Var8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        final boolean z4;
        final boolean z5;
        final boolean z6;
        final float f5;
        final float f6;
        final float f7;
        final Function1 function12;
        final Function0 function03;
        Function0 function04;
        final ct8 ct8Var9;
        final ct8 ct8Var10;
        final ct8 ct8Var11;
        final ct8 ct8Var12;
        final String str3;
        final String str4;
        eqf u;
        int i30;
        int i31;
        final Function1 function13;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        final String str5;
        final float f8;
        final float f9;
        x43Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-997292498);
        if ((i3 & 6) == 0) {
            i6 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= av8Var.g(x43Var) ? 32 : 16;
        }
        int i32 = i5 & 4;
        if (i32 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            xtcVar2 = xtcVar;
            i6 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                ct8Var5 = ct8Var;
                i6 |= av8Var.i(ct8Var5) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    ct8Var6 = ct8Var2;
                    i6 |= av8Var.i(ct8Var6) ? 16384 : 8192;
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= 196608;
                        ct8Var7 = ct8Var3;
                    } else {
                        ct8Var7 = ct8Var3;
                        if ((i3 & 196608) == 0) {
                            i6 |= av8Var.i(ct8Var7) ? 131072 : 65536;
                        }
                    }
                    if ((i3 & 1572864) == 0) {
                        i6 |= av8Var.i(tc3Var) ? 1048576 : 524288;
                    }
                    i10 = i5 & 128;
                    if (i10 == 0) {
                        i6 |= 12582912;
                        ct8Var8 = ct8Var4;
                    } else {
                        ct8Var8 = ct8Var4;
                        if ((i3 & 12582912) == 0) {
                            i6 |= av8Var.i(ct8Var8) ? 8388608 : 4194304;
                        }
                    }
                    i11 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
                    if (i11 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i12 = i11;
                        i6 |= av8Var.g(str) ? 67108864 : 33554432;
                        i13 = i5 & 512;
                        if (i13 != 0) {
                            i6 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i14 = i13;
                            i6 |= av8Var.g(str2) ? 536870912 : 268435456;
                            i15 = i5 & 1024;
                            if (i15 == 0) {
                                i17 = i4 | 6;
                                i16 = i15;
                            } else if ((i4 & 6) == 0) {
                                i16 = i15;
                                i17 = i4 | (av8Var.h(z) ? 4 : 2);
                            } else {
                                i16 = i15;
                                i17 = i4;
                            }
                            i18 = i5 & a.o;
                            if (i18 == 0) {
                                i17 |= 48;
                                i19 = i18;
                            } else if ((i4 & 48) == 0) {
                                i19 = i18;
                                i17 |= av8Var.h(z2) ? 32 : 16;
                            } else {
                                i19 = i18;
                            }
                            int i33 = i17;
                            i20 = i5 & 4096;
                            if (i20 == 0) {
                                i21 = i33 | 384;
                            } else {
                                int i34 = i33;
                                if ((i4 & 384) == 0) {
                                    i34 |= av8Var.h(z3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                                }
                                i21 = i34;
                            }
                            i22 = i5 & 8192;
                            if (i22 == 0) {
                                i23 = i21 | 3072;
                            } else {
                                int i35 = i21;
                                if ((i4 & 3072) == 0) {
                                    i23 = i35 | (av8Var.d(f2) ? 2048 : 1024);
                                } else {
                                    i23 = i35;
                                }
                            }
                            i24 = i5 & 16384;
                            if (i24 == 0) {
                                i25 = i23 | 24576;
                            } else {
                                i25 = i23;
                                if ((i4 & 24576) == 0) {
                                    i25 |= av8Var.d(f3) ? 16384 : 8192;
                                    i26 = i5 & 32768;
                                    if (i26 != 0) {
                                        i25 |= 196608;
                                    } else if ((i4 & 196608) == 0) {
                                        i25 |= av8Var.d(f4) ? 131072 : 65536;
                                    }
                                    i27 = i5 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                    if (i27 != 0) {
                                        i25 |= 1572864;
                                    } else if ((i4 & 1572864) == 0) {
                                        i25 |= av8Var.i(function1) ? 1048576 : 524288;
                                    }
                                    i28 = i5 & 131072;
                                    if (i28 != 0) {
                                        i25 |= 12582912;
                                    } else if ((i4 & 12582912) == 0) {
                                        i25 |= av8Var.i(function0) ? 8388608 : 4194304;
                                    }
                                    i29 = i5 & 262144;
                                    if (i29 != 0) {
                                        i25 |= 100663296;
                                    } else if ((i4 & 100663296) == 0) {
                                        i25 |= av8Var.i(function02) ? 67108864 : 33554432;
                                    }
                                    if (av8Var.T(i6 & 1, (i6 & 306783379) == 306783378 || (i25 & 38347923) != 38347922)) {
                                        utc utcVar = utc.a;
                                        xtc xtcVar3 = i32 != 0 ? utcVar : xtcVar2;
                                        final ct8 ct8Var13 = i7 != 0 ? null : ct8Var5;
                                        int i36 = i25;
                                        final ct8 ct8Var14 = i8 != 0 ? null : ct8Var6;
                                        ct8 ct8Var15 = i9 != 0 ? null : ct8Var7;
                                        if (i10 != 0) {
                                            ct8Var8 = null;
                                        }
                                        String str6 = i12 != 0 ? null : str;
                                        final String str7 = i14 != 0 ? null : str2;
                                        final boolean z7 = i16 != 0 ? false : z;
                                        final boolean z8 = i19 != 0 ? false : z2;
                                        if (i20 != 0) {
                                            i30 = i26;
                                            z6 = false;
                                        } else {
                                            i30 = i26;
                                            z6 = z3;
                                        }
                                        float f10 = i22 != 0 ? 16.0f : f2;
                                        float f11 = i24 != 0 ? 8.0f : f3;
                                        final float f12 = i30 != 0 ? 8.0f : f4;
                                        a99 a99Var = nf3.a;
                                        float f13 = f11;
                                        if (i27 != 0) {
                                            Object O = av8Var.O();
                                            if (O == a99Var) {
                                                i31 = i36;
                                                O = new dt(23);
                                                av8Var.n0(O);
                                            } else {
                                                i31 = i36;
                                            }
                                            function13 = (Function1) O;
                                        } else {
                                            i31 = i36;
                                            function13 = function1;
                                        }
                                        int i37 = 9;
                                        if (i28 != 0) {
                                            Object O2 = av8Var.O();
                                            if (O2 == a99Var) {
                                                O2 = new tv0(i37);
                                                av8Var.n0(O2);
                                            }
                                            function05 = (Function0) O2;
                                        } else {
                                            function05 = function0;
                                        }
                                        if (i29 != 0) {
                                            Object O3 = av8Var.O();
                                            if (O3 == a99Var) {
                                                function06 = function05;
                                                O3 = new tv0(10);
                                                av8Var.n0(O3);
                                            } else {
                                                function06 = function05;
                                            }
                                            function07 = (Function0) O3;
                                        } else {
                                            function06 = function05;
                                            function07 = function02;
                                        }
                                        final Function0 function08 = function07;
                                        k1c c2 = e12.c(uxf.c, false);
                                        ct8 ct8Var16 = ct8Var8;
                                        int i38 = i6;
                                        int hashCode = Long.hashCode(av8Var.T);
                                        aee m2 = av8Var.m();
                                        xtc C = fqj.C(av8Var, utcVar);
                                        if3.k7.getClass();
                                        zg3 zg3Var = hf3.b;
                                        av8Var.h0();
                                        if (av8Var.S) {
                                            av8Var.l(zg3Var);
                                        } else {
                                            av8Var.q0();
                                        }
                                        waa.K(av8Var, c2, hf3.g);
                                        waa.K(av8Var, m2, hf3.f);
                                        waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                        waa.J(av8Var, hf3.k);
                                        waa.K(av8Var, C, hf3.d);
                                        Object O4 = av8Var.O();
                                        if (O4 == a99Var) {
                                            O4 = e.f(Boolean.FALSE);
                                            av8Var.n0(O4);
                                        }
                                        final e1d e1dVar = (e1d) O4;
                                        if (((Boolean) e1dVar.getValue()).booleanValue()) {
                                            av8Var.d0(-1992685385);
                                            ct8 ct8Var17 = ct8Var15 == null ? ct8Var14 : ct8Var15;
                                            ct8 ct8Var18 = ct8Var16 == null ? tc3Var : ct8Var16;
                                            Object O5 = av8Var.O();
                                            if (O5 == a99Var) {
                                                O5 = new v30(1, e1dVar);
                                                av8Var.n0(O5);
                                            }
                                            int i39 = i38 >> 12;
                                            int i40 = ((i38 >> 6) & 112) | 805306368 | (i39 & 57344) | (i39 & 458752);
                                            int i41 = i31 << 9;
                                            String str8 = str6;
                                            float f14 = f10;
                                            b(null, ct8Var13, ct8Var17, ct8Var18, str8, str7, f14, f13, f12, (Function0) O5, av8Var, i40 | (i41 & 3670016) | (i41 & 29360128) | (i41 & 234881024));
                                            str5 = str8;
                                            f8 = f14;
                                            f9 = f13;
                                            av8Var.s(false);
                                        } else {
                                            str5 = str6;
                                            f8 = f10;
                                            f9 = f13;
                                            av8Var.d0(-1992159718);
                                            av8Var.s(false);
                                        }
                                        xtc d0 = l98.d0(bkh.d(xtcVar3, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                        Object O6 = av8Var.O();
                                        if (O6 == a99Var) {
                                            O6 = new hdd();
                                            av8Var.n0(O6);
                                        }
                                        Function0 function09 = function06;
                                        un0.a(oyn.w(d0, false, null, (hdd) O6, function09, 7), o7g.a(12.0f), rd0.t(lz.D(com.sofascore.results.R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(-1529939914, av8Var, new ct8() { // from class: q31
                                            @Override // defpackage.ct8
                                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                zg3 zg3Var2;
                                                ry ryVar;
                                                utc utcVar2;
                                                ff3 ff3Var;
                                                f50 f50Var;
                                                ry ryVar2;
                                                f50 f50Var2;
                                                float f15;
                                                utc utcVar3;
                                                int i42;
                                                String str9;
                                                utc utcVar4;
                                                Boolean bool;
                                                of3 of3Var2 = (of3) obj2;
                                                int intValue = ((Integer) obj3).intValue();
                                                ((v23) obj).getClass();
                                                av8 av8Var2 = (av8) of3Var2;
                                                if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                                                    utc utcVar5 = utc.a;
                                                    char c3 = 0;
                                                    xtc f0 = l98.f0(bkh.d(utcVar5, 1.0f), 16.0f, f12, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                                    l8g a2 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
                                                    int hashCode2 = Long.hashCode(av8Var2.T);
                                                    aee m3 = av8Var2.m();
                                                    xtc C2 = fqj.C(av8Var2, f0);
                                                    if3.k7.getClass();
                                                    zg3 zg3Var3 = hf3.b;
                                                    av8Var2.h0();
                                                    if (av8Var2.S) {
                                                        av8Var2.l(zg3Var3);
                                                    } else {
                                                        av8Var2.q0();
                                                    }
                                                    f50 f50Var3 = hf3.g;
                                                    waa.K(av8Var2, a2, f50Var3);
                                                    ff3 ff3Var2 = hf3.f;
                                                    waa.K(av8Var2, m3, ff3Var2);
                                                    Integer valueOf = Integer.valueOf(hashCode2);
                                                    f50 f50Var4 = hf3.j;
                                                    waa.K(av8Var2, valueOf, f50Var4);
                                                    ry ryVar3 = hf3.k;
                                                    waa.J(av8Var2, ryVar3);
                                                    f50 f50Var5 = hf3.d;
                                                    waa.K(av8Var2, C2, f50Var5);
                                                    ct8 ct8Var19 = ct8Var13;
                                                    if (ct8Var19 == null) {
                                                        av8Var2.d0(-261594980);
                                                        av8Var2.s(false);
                                                        zg3Var2 = zg3Var3;
                                                        ryVar = ryVar3;
                                                    } else {
                                                        av8Var2.d0(-261594979);
                                                        zg3Var2 = zg3Var3;
                                                        c3 = 0;
                                                        xtc e2 = fn0.e(1.0f, l98.f0(utcVar5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), true);
                                                        k1c c4 = e12.c(uxf.c, false);
                                                        int hashCode3 = Long.hashCode(av8Var2.T);
                                                        aee m4 = av8Var2.m();
                                                        xtc C3 = fqj.C(av8Var2, e2);
                                                        av8Var2.h0();
                                                        if (av8Var2.S) {
                                                            av8Var2.l(zg3Var2);
                                                        } else {
                                                            av8Var2.q0();
                                                        }
                                                        waa.K(av8Var2, c4, f50Var3);
                                                        ff3Var2 = ff3Var2;
                                                        waa.K(av8Var2, m4, ff3Var2);
                                                        f50Var4 = f50Var4;
                                                        ryVar = ryVar3;
                                                        bf3.s(hashCode3, av8Var2, f50Var4, av8Var2, ryVar);
                                                        waa.K(av8Var2, C3, f50Var5);
                                                        ct8Var19.invoke(n12.a, av8Var2, 6);
                                                        av8Var2.s(true);
                                                        Unit unit = Unit.a;
                                                        av8Var2.s(false);
                                                    }
                                                    boolean z9 = z8;
                                                    x43 x43Var2 = x43Var;
                                                    if (z9 && ((bool = x43Var2.e) == null || bool.equals(Boolean.FALSE))) {
                                                        av8Var2.d0(-261174061);
                                                        utcVar2 = utcVar5;
                                                        ff3Var = ff3Var2;
                                                        ryVar2 = ryVar;
                                                        f50Var = f50Var4;
                                                        ao2.g(function08, bkh.l(utcVar5, 32.0f), false, null, null, f5p.b, av8Var2, 1572912, 60);
                                                        av8Var2.s(false);
                                                    } else {
                                                        utcVar2 = utcVar5;
                                                        ff3Var = ff3Var2;
                                                        f50Var = f50Var4;
                                                        ryVar2 = ryVar;
                                                        av8Var2.d0(-260697808);
                                                        av8Var2.s(false);
                                                    }
                                                    av8Var2.s(true);
                                                    float f16 = f8;
                                                    utc utcVar6 = utcVar2;
                                                    xtc f02 = l98.f0(utcVar6, f16, f9, f16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                                    u23 a3 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.p, av8Var2, 54);
                                                    int hashCode4 = Long.hashCode(av8Var2.T);
                                                    aee m5 = av8Var2.m();
                                                    xtc C4 = fqj.C(av8Var2, f02);
                                                    av8Var2.h0();
                                                    if (av8Var2.S) {
                                                        av8Var2.l(zg3Var2);
                                                    } else {
                                                        av8Var2.q0();
                                                    }
                                                    waa.K(av8Var2, a3, f50Var3);
                                                    waa.K(av8Var2, m5, ff3Var);
                                                    f50 f50Var6 = f50Var;
                                                    ry ryVar4 = ryVar2;
                                                    bf3.s(hashCode4, av8Var2, f50Var6, av8Var2, ryVar4);
                                                    waa.K(av8Var2, C4, f50Var5);
                                                    ct8 ct8Var20 = ct8Var14;
                                                    x23 x23Var = x23.a;
                                                    if (ct8Var20 == null) {
                                                        av8Var2.d0(241633926);
                                                        av8Var2.s(false);
                                                    } else {
                                                        av8Var2.d0(241633927);
                                                        ct8Var20.invoke(x23Var, av8Var2, 6);
                                                        Unit unit2 = Unit.a;
                                                        av8Var2.s(false);
                                                    }
                                                    tc3Var.invoke(x23Var, av8Var2, 6);
                                                    av8Var2.s(true);
                                                    String str10 = str5;
                                                    String str11 = str7;
                                                    if (str10 == null || str10.length() == 0 || str11 == null || str11.length() == 0) {
                                                        f50Var2 = f50Var6;
                                                        f15 = 0.0f;
                                                    } else {
                                                        f50Var2 = f50Var6;
                                                        f15 = 16.0f;
                                                    }
                                                    f50 f50Var7 = f50Var2;
                                                    xtc x = gz8.x(l98.f0(utcVar6, 16.0f, f15, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), null, null, 3);
                                                    u23 a4 = t23.a(ww9.d, uxf.o, av8Var2, 0);
                                                    int hashCode5 = Long.hashCode(av8Var2.T);
                                                    aee m6 = av8Var2.m();
                                                    xtc C5 = fqj.C(av8Var2, x);
                                                    av8Var2.h0();
                                                    if (av8Var2.S) {
                                                        av8Var2.l(zg3Var2);
                                                    } else {
                                                        av8Var2.q0();
                                                    }
                                                    waa.K(av8Var2, a4, f50Var3);
                                                    waa.K(av8Var2, m6, ff3Var);
                                                    bf3.s(hashCode5, av8Var2, f50Var7, av8Var2, ryVar4);
                                                    waa.K(av8Var2, C5, f50Var5);
                                                    if (str10 == null || str10.length() == 0) {
                                                        utcVar3 = utcVar6;
                                                        i42 = 3;
                                                        str9 = str10;
                                                        av8Var2.d0(-1976559495);
                                                        av8Var2.s(false);
                                                    } else {
                                                        av8Var2.d0(-1976837782);
                                                        i42 = 3;
                                                        xtc f03 = l98.f0(utcVar6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (str11 == null || str11.length() == 0) ? 16.0f : 0.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                                        utcVar3 = utcVar6;
                                                        yf8 yf8Var = xth.a;
                                                        str9 = str10;
                                                        udj.c(str9, f03, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var2, 0, 0, 131064);
                                                        av8Var2 = av8Var2;
                                                        av8Var2.s(false);
                                                    }
                                                    Object O7 = av8Var2.O();
                                                    a99 a99Var2 = nf3.a;
                                                    if (O7 == a99Var2) {
                                                        O7 = e.f(Boolean.FALSE);
                                                        av8Var2.n0(O7);
                                                    }
                                                    e1d e1dVar2 = (e1d) O7;
                                                    Object O8 = av8Var2.O();
                                                    if (O8 == a99Var2) {
                                                        O8 = e.c(2);
                                                        av8Var2.n0(O8);
                                                    }
                                                    znh znhVar = (znh) O8;
                                                    if (str11 == null || str11.length() == 0) {
                                                        av8Var2.d0(-1974711399);
                                                        av8Var2.s(false);
                                                    } else {
                                                        av8Var2.d0(-1976317230);
                                                        av8Var2.d0(767536584);
                                                        float f17 = (str9 == null || str9.length() == 0) ? 16.0f : 4.0f;
                                                        utc utcVar7 = utcVar3;
                                                        xtc f04 = l98.f0(utcVar7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f17, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                                        if (((Boolean) e1dVar2.getValue()).booleanValue()) {
                                                            Object O9 = av8Var2.O();
                                                            if (O9 == a99Var2) {
                                                                O9 = new hdd();
                                                                av8Var2.n0(O9);
                                                            }
                                                            hdd hddVar = (hdd) O9;
                                                            Object O10 = av8Var2.O();
                                                            if (O10 == a99Var2) {
                                                                O10 = new j4(16, e1dVar2, znhVar);
                                                                av8Var2.n0(O10);
                                                            }
                                                            utcVar4 = utcVar7;
                                                            f04 = f04.z(oyn.w(utcVar7, false, null, hddVar, (Function0) O10, 7));
                                                        } else {
                                                            utcVar4 = utcVar7;
                                                        }
                                                        av8Var2.s(false);
                                                        yf8 yf8Var2 = xth.a;
                                                        dfj f18 = xth.f();
                                                        long D = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var2);
                                                        int h2 = znhVar.h();
                                                        Object O11 = av8Var2.O();
                                                        if (O11 == a99Var2) {
                                                            O11 = new w30(i42, e1dVar2);
                                                            av8Var2.n0(O11);
                                                        }
                                                        av8 av8Var3 = av8Var2;
                                                        udj.c(str11, f04, D, null, 0L, null, 0L, null, null, 0L, 2, false, h2, 0, (Function1) O11, f18, av8Var3, 0, 1573248, 45048);
                                                        av8Var2 = av8Var3;
                                                        if (((Boolean) e1dVar2.getValue()).booleanValue()) {
                                                            av8Var2.d0(-1975257526);
                                                            Object O12 = av8Var2.O();
                                                            if (O12 == a99Var2) {
                                                                O12 = new hdd();
                                                                av8Var2.n0(O12);
                                                            }
                                                            hdd hddVar2 = (hdd) O12;
                                                            Object O13 = av8Var2.O();
                                                            if (O13 == a99Var2) {
                                                                O13 = new s31(znhVar, 0);
                                                                av8Var2.n0(O13);
                                                            }
                                                            utc utcVar8 = utcVar4;
                                                            utcVar3 = utcVar8;
                                                            udj.c(oea.v(com.sofascore.results.R.string.show_more, av8Var2), oyn.w(utcVar8, false, null, hddVar2, (Function0) O13, 7), lz.D(com.sofascore.results.R.color.primary_default, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var2, 0, 0, 131064);
                                                            av8Var2 = av8Var2;
                                                            av8Var2.s(false);
                                                        } else {
                                                            utcVar3 = utcVar4;
                                                            av8Var2.d0(-1974729255);
                                                            av8Var2.s(false);
                                                        }
                                                        av8Var2.s(false);
                                                    }
                                                    if (z6) {
                                                        av8Var2.d0(-1974061639);
                                                        av8Var2.s(false);
                                                    } else {
                                                        av8Var2.d0(-1974628226);
                                                        xtc f05 = l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5);
                                                        MediaReactionType mediaReactionType = x43Var2.a;
                                                        int i43 = x43Var2.b;
                                                        int i44 = x43Var2.c;
                                                        Object O14 = av8Var2.O();
                                                        if (O14 == a99Var2) {
                                                            O14 = new v30(2, e1dVar);
                                                            av8Var2.n0(O14);
                                                        }
                                                        av8 av8Var4 = av8Var2;
                                                        pco.p(mediaReactionType, i43, i44, i2, f05, "non_stacked_card", 0L, z7, function13, (Function0) O14, av8Var4, 805527552, 64);
                                                        av8Var2 = av8Var4;
                                                        av8Var2.s(false);
                                                    }
                                                    av8Var2.s(true);
                                                } else {
                                                    av8Var2.W();
                                                }
                                                return Unit.a;
                                            }
                                        }), av8Var, 196608, 24);
                                        av8Var.s(true);
                                        function03 = function09;
                                        f6 = f9;
                                        str4 = str7;
                                        ct8Var9 = ct8Var13;
                                        z5 = z8;
                                        function04 = function08;
                                        ct8Var11 = ct8Var14;
                                        function12 = function13;
                                        ct8Var12 = ct8Var15;
                                        xtcVar2 = xtcVar3;
                                        f7 = f12;
                                        f5 = f8;
                                        str3 = str5;
                                        z4 = z7;
                                        ct8Var10 = ct8Var16;
                                    } else {
                                        av8Var.W();
                                        z4 = z;
                                        z5 = z2;
                                        z6 = z3;
                                        f5 = f2;
                                        f6 = f3;
                                        f7 = f4;
                                        function12 = function1;
                                        function03 = function0;
                                        function04 = function02;
                                        ct8Var9 = ct8Var5;
                                        ct8Var10 = ct8Var8;
                                        ct8Var11 = ct8Var6;
                                        ct8Var12 = ct8Var7;
                                        str3 = str;
                                        str4 = str2;
                                    }
                                    u = av8Var.u();
                                    if (u != null) {
                                        final xtc xtcVar4 = xtcVar2;
                                        final boolean z9 = z6;
                                        final Function0 function010 = function04;
                                        u.d = new Function2() { // from class: r31
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                ((Integer) obj2).getClass();
                                                int K = aba.K(i3 | 1);
                                                int K2 = aba.K(i4);
                                                pco.a(i2, x43Var, xtcVar4, ct8Var9, ct8Var11, ct8Var12, tc3Var, ct8Var10, str3, str4, z4, z5, z9, f5, f6, f7, function12, function03, function010, (of3) obj, K, K2, i5);
                                                return Unit.a;
                                            }
                                        };
                                        return;
                                    }
                                    return;
                                }
                            }
                            i26 = i5 & 32768;
                            if (i26 != 0) {
                            }
                            i27 = i5 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            if (i27 != 0) {
                            }
                            i28 = i5 & 131072;
                            if (i28 != 0) {
                            }
                            i29 = i5 & 262144;
                            if (i29 != 0) {
                            }
                            if (av8Var.T(i6 & 1, (i6 & 306783379) == 306783378 || (i25 & 38347923) != 38347922)) {
                            }
                            u = av8Var.u();
                            if (u != null) {
                            }
                        }
                        i14 = i13;
                        i15 = i5 & 1024;
                        if (i15 == 0) {
                        }
                        i18 = i5 & a.o;
                        if (i18 == 0) {
                        }
                        int i332 = i17;
                        i20 = i5 & 4096;
                        if (i20 == 0) {
                        }
                        i22 = i5 & 8192;
                        if (i22 == 0) {
                        }
                        i24 = i5 & 16384;
                        if (i24 == 0) {
                        }
                        i26 = i5 & 32768;
                        if (i26 != 0) {
                        }
                        i27 = i5 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        if (i27 != 0) {
                        }
                        i28 = i5 & 131072;
                        if (i28 != 0) {
                        }
                        i29 = i5 & 262144;
                        if (i29 != 0) {
                        }
                        if (av8Var.T(i6 & 1, (i6 & 306783379) == 306783378 || (i25 & 38347923) != 38347922)) {
                        }
                        u = av8Var.u();
                        if (u != null) {
                        }
                    }
                    i12 = i11;
                    i13 = i5 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i5 & 1024;
                    if (i15 == 0) {
                    }
                    i18 = i5 & a.o;
                    if (i18 == 0) {
                    }
                    int i3322 = i17;
                    i20 = i5 & 4096;
                    if (i20 == 0) {
                    }
                    i22 = i5 & 8192;
                    if (i22 == 0) {
                    }
                    i24 = i5 & 16384;
                    if (i24 == 0) {
                    }
                    i26 = i5 & 32768;
                    if (i26 != 0) {
                    }
                    i27 = i5 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    if (i27 != 0) {
                    }
                    i28 = i5 & 131072;
                    if (i28 != 0) {
                    }
                    i29 = i5 & 262144;
                    if (i29 != 0) {
                    }
                    if (av8Var.T(i6 & 1, (i6 & 306783379) == 306783378 || (i25 & 38347923) != 38347922)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                ct8Var6 = ct8Var2;
                i9 = i5 & 32;
                if (i9 == 0) {
                }
                if ((i3 & 1572864) == 0) {
                }
                i10 = i5 & 128;
                if (i10 == 0) {
                }
                i11 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i5 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i5 & 1024;
                if (i15 == 0) {
                }
                i18 = i5 & a.o;
                if (i18 == 0) {
                }
                int i33222 = i17;
                i20 = i5 & 4096;
                if (i20 == 0) {
                }
                i22 = i5 & 8192;
                if (i22 == 0) {
                }
                i24 = i5 & 16384;
                if (i24 == 0) {
                }
                i26 = i5 & 32768;
                if (i26 != 0) {
                }
                i27 = i5 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
                if (i27 != 0) {
                }
                i28 = i5 & 131072;
                if (i28 != 0) {
                }
                i29 = i5 & 262144;
                if (i29 != 0) {
                }
                if (av8Var.T(i6 & 1, (i6 & 306783379) == 306783378 || (i25 & 38347923) != 38347922)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            ct8Var5 = ct8Var;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            ct8Var6 = ct8Var2;
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            i10 = i5 & 128;
            if (i10 == 0) {
            }
            i11 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i5 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i5 & 1024;
            if (i15 == 0) {
            }
            i18 = i5 & a.o;
            if (i18 == 0) {
            }
            int i332222 = i17;
            i20 = i5 & 4096;
            if (i20 == 0) {
            }
            i22 = i5 & 8192;
            if (i22 == 0) {
            }
            i24 = i5 & 16384;
            if (i24 == 0) {
            }
            i26 = i5 & 32768;
            if (i26 != 0) {
            }
            i27 = i5 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
            if (i27 != 0) {
            }
            i28 = i5 & 131072;
            if (i28 != 0) {
            }
            i29 = i5 & 262144;
            if (i29 != 0) {
            }
            if (av8Var.T(i6 & 1, (i6 & 306783379) == 306783378 || (i25 & 38347923) != 38347922)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        ct8Var5 = ct8Var;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        ct8Var6 = ct8Var2;
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        i10 = i5 & 128;
        if (i10 == 0) {
        }
        i11 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i5 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i5 & 1024;
        if (i15 == 0) {
        }
        i18 = i5 & a.o;
        if (i18 == 0) {
        }
        int i3322222 = i17;
        i20 = i5 & 4096;
        if (i20 == 0) {
        }
        i22 = i5 & 8192;
        if (i22 == 0) {
        }
        i24 = i5 & 16384;
        if (i24 == 0) {
        }
        i26 = i5 & 32768;
        if (i26 != 0) {
        }
        i27 = i5 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
        if (i27 != 0) {
        }
        i28 = i5 & 131072;
        if (i28 != 0) {
        }
        i29 = i5 & 262144;
        if (i29 != 0) {
        }
        if (av8Var.T(i6 & 1, (i6 & 306783379) == 306783378 || (i25 & 38347923) != 38347922)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void b(xtc xtcVar, final ct8 ct8Var, final ct8 ct8Var2, final ct8 ct8Var3, final String str, final String str2, final float f2, final float f3, final float f4, final Function0 function0, of3 of3Var, final int i2) {
        ct8 ct8Var4;
        ct8 ct8Var5;
        String str3;
        String str4;
        float f5;
        float f6;
        float f7;
        Function0 function02;
        av8 av8Var;
        final xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(223128621);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(ct8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            ct8Var4 = ct8Var2;
            i3 |= av8Var2.i(ct8Var4) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            ct8Var4 = ct8Var2;
        }
        if ((i2 & 3072) == 0) {
            ct8Var5 = ct8Var3;
            i3 |= av8Var2.i(ct8Var5) ? a.o : 1024;
        } else {
            ct8Var5 = ct8Var3;
        }
        if ((i2 & 24576) == 0) {
            str3 = str;
            i3 |= av8Var2.g(str3) ? 16384 : 8192;
        } else {
            str3 = str;
        }
        if ((196608 & i2) == 0) {
            str4 = str2;
            i3 |= av8Var2.g(str4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            str4 = str2;
        }
        if ((1572864 & i2) == 0) {
            f5 = f2;
            i3 |= av8Var2.d(f5) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            f5 = f2;
        }
        if ((12582912 & i2) == 0) {
            f6 = f3;
            i3 |= av8Var2.d(f6) ? 8388608 : 4194304;
        } else {
            f6 = f3;
        }
        if ((100663296 & i2) == 0) {
            f7 = f4;
            i3 |= av8Var2.d(f7) ? 67108864 : 33554432;
        } else {
            f7 = f4;
        }
        if ((805306368 & i2) == 0) {
            function02 = function0;
            i3 |= av8Var2.i(function02) ? 536870912 : 268435456;
        } else {
            function02 = function0;
        }
        if (av8Var2.T(i3 & 1, (306783379 & i3) != 306783378)) {
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = hz8.G(g.a, av8Var2);
                av8Var2.n0(O);
            }
            ku3 ku3Var = (ku3) O;
            n29 a2 = r29.a(av8Var2);
            fsf fsfVar = new fsf();
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = null;
                av8Var2.n0(null);
            }
            fsfVar.a = (Bitmap) O2;
            Context context = (Context) av8Var2.k(nz.b);
            hz8.d(Unit.a, new k31(fsfVar, 0), av8Var2);
            long D = lz.D(com.sofascore.results.R.color.surface_0, av8Var2);
            l31 l31Var = new l31(ku3Var, fsfVar, a2, context, function02, 0);
            utc utcVar = utc.a;
            xtc b0 = k53.b0(utcVar, a2, l31Var, false, 12);
            final ct8 ct8Var6 = ct8Var4;
            final ct8 ct8Var7 = ct8Var5;
            final String str5 = str3;
            final String str6 = str4;
            final float f8 = f5;
            final float f9 = f6;
            final float f10 = f7;
            av8Var = av8Var2;
            uni.a(b0, null, D, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(928484232, av8Var2, new Function2() { // from class: m31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    of3 of3Var2 = (of3) obj;
                    int intValue = ((Integer) obj2).intValue();
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                        xtc b02 = l98.b0(bkh.d(utc.a, 1.0f), 8.0f);
                        ek2 t = rd0.t(lz.D(com.sofascore.results.R.color.surface_1, av8Var3), av8Var3, 0);
                        n7g a3 = o7g.a(12.0f);
                        final float f11 = f10;
                        final float f12 = f8;
                        final float f13 = f9;
                        final String str7 = str5;
                        final String str8 = str6;
                        final ct8 ct8Var8 = ct8Var;
                        final ct8 ct8Var9 = ct8Var6;
                        final ct8 ct8Var10 = ct8Var7;
                        un0.a(b02, a3, t, null, null, yqo.H(-1183650090, av8Var3, new ct8() { // from class: o31
                            @Override // defpackage.ct8
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                float f14;
                                boolean z;
                                String str9;
                                utc utcVar2;
                                of3 of3Var3 = (of3) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                ((v23) obj3).getClass();
                                av8 av8Var4 = (av8) of3Var3;
                                if (av8Var4.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    utc utcVar3 = utc.a;
                                    xtc f0 = l98.f0(bkh.d(utcVar3, 1.0f), 16.0f, f11, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                    l8g a4 = k8g.a(ww9.b, uxf.l, av8Var4, 0);
                                    int hashCode = Long.hashCode(av8Var4.T);
                                    aee m2 = av8Var4.m();
                                    xtc C = fqj.C(av8Var4, f0);
                                    if3.k7.getClass();
                                    zg3 zg3Var = hf3.b;
                                    av8Var4.h0();
                                    if (av8Var4.S) {
                                        av8Var4.l(zg3Var);
                                    } else {
                                        av8Var4.q0();
                                    }
                                    f50 f50Var = hf3.g;
                                    waa.K(av8Var4, a4, f50Var);
                                    ff3 ff3Var = hf3.f;
                                    waa.K(av8Var4, m2, ff3Var);
                                    Integer valueOf = Integer.valueOf(hashCode);
                                    f50 f50Var2 = hf3.j;
                                    waa.K(av8Var4, valueOf, f50Var2);
                                    ry ryVar = hf3.k;
                                    waa.J(av8Var4, ryVar);
                                    f50 f50Var3 = hf3.d;
                                    waa.K(av8Var4, C, f50Var3);
                                    ct8 ct8Var11 = ct8Var8;
                                    if (ct8Var11 == null) {
                                        av8Var4.d0(-378642576);
                                        av8Var4.s(false);
                                        f14 = 16.0f;
                                        z = true;
                                    } else {
                                        f14 = 16.0f;
                                        av8Var4.d0(-378642575);
                                        xtc e2 = fn0.e(1.0f, l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9), true);
                                        k1c c2 = e12.c(uxf.c, false);
                                        int hashCode2 = Long.hashCode(av8Var4.T);
                                        aee m3 = av8Var4.m();
                                        xtc C2 = fqj.C(av8Var4, e2);
                                        av8Var4.h0();
                                        if (av8Var4.S) {
                                            av8Var4.l(zg3Var);
                                        } else {
                                            av8Var4.q0();
                                        }
                                        waa.K(av8Var4, c2, f50Var);
                                        waa.K(av8Var4, m3, ff3Var);
                                        bf3.s(hashCode2, av8Var4, f50Var2, av8Var4, ryVar);
                                        waa.K(av8Var4, C2, f50Var3);
                                        ct8Var11.invoke(n12.a, av8Var4, 6);
                                        z = true;
                                        av8Var4.s(true);
                                        Unit unit = Unit.a;
                                        av8Var4.s(false);
                                    }
                                    av8Var4.s(z);
                                    float f15 = f12;
                                    xtc f02 = l98.f0(utcVar3, f15, f13, f15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                    u23 a5 = t23.a(new ng0(8.0f, z, new a70(6)), uxf.p, av8Var4, 54);
                                    int hashCode3 = Long.hashCode(av8Var4.T);
                                    aee m4 = av8Var4.m();
                                    xtc C3 = fqj.C(av8Var4, f02);
                                    av8Var4.h0();
                                    if (av8Var4.S) {
                                        av8Var4.l(zg3Var);
                                    } else {
                                        av8Var4.q0();
                                    }
                                    waa.K(av8Var4, a5, f50Var);
                                    waa.K(av8Var4, m4, ff3Var);
                                    bf3.s(hashCode3, av8Var4, f50Var2, av8Var4, ryVar);
                                    waa.K(av8Var4, C3, f50Var3);
                                    ct8 ct8Var12 = ct8Var9;
                                    x23 x23Var = x23.a;
                                    if (ct8Var12 == null) {
                                        av8Var4.d0(-860109850);
                                        av8Var4.s(false);
                                    } else {
                                        av8Var4.d0(-860109849);
                                        ct8Var12.invoke(x23Var, av8Var4, 6);
                                        Unit unit2 = Unit.a;
                                        av8Var4.s(false);
                                    }
                                    ct8Var10.invoke(x23Var, av8Var4, 6);
                                    av8Var4.s(true);
                                    String str10 = str7;
                                    String str11 = str8;
                                    float f16 = f14;
                                    xtc f03 = l98.f0(utcVar3, f16, (str10 == null || str10.length() == 0 || str11 == null || str11.length() == 0) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f14, f14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                    u23 a6 = t23.a(ww9.d, uxf.o, av8Var4, 0);
                                    int hashCode4 = Long.hashCode(av8Var4.T);
                                    aee m5 = av8Var4.m();
                                    xtc C4 = fqj.C(av8Var4, f03);
                                    av8Var4.h0();
                                    if (av8Var4.S) {
                                        av8Var4.l(zg3Var);
                                    } else {
                                        av8Var4.q0();
                                    }
                                    waa.K(av8Var4, a6, f50Var);
                                    waa.K(av8Var4, m5, ff3Var);
                                    bf3.s(hashCode4, av8Var4, f50Var2, av8Var4, ryVar);
                                    waa.K(av8Var4, C4, f50Var3);
                                    if (str10 == null || str10.length() == 0) {
                                        str9 = str10;
                                        utcVar2 = utcVar3;
                                        av8Var4.d0(-1219890215);
                                        av8Var4.s(false);
                                    } else {
                                        av8Var4.d0(-1220168502);
                                        xtc f04 = l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (str11 == null || str11.length() == 0) ? f16 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                        utcVar2 = utcVar3;
                                        yf8 yf8Var = xth.a;
                                        str9 = str10;
                                        udj.c(str9, f04, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var4), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var4, 0, 0, 131064);
                                        av8Var4 = av8Var4;
                                        av8Var4.s(false);
                                    }
                                    if (str11 == null || str11.length() == 0) {
                                        av8Var4.d0(-1219526151);
                                        av8Var4.s(false);
                                    } else {
                                        av8Var4.d0(-1219810204);
                                        xtc f05 = l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (str9 == null || str9.length() == 0) ? f16 : 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                        yf8 yf8Var2 = xth.a;
                                        av8 av8Var5 = av8Var4;
                                        udj.c(str11, f05, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var4), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var5, 0, 0, 131064);
                                        av8Var4 = av8Var5;
                                        av8Var4.s(false);
                                    }
                                    kq9.b(s6a.N(com.sofascore.results.R.drawable.logo_sofascore_new, 6, av8Var4), null, bkh.e(l98.d0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f16, 1), 12.0f), lz.D(com.sofascore.results.R.color.primary_default, av8Var4), av8Var4, 432, 0);
                                    av8Var4.s(true);
                                } else {
                                    av8Var4.W();
                                }
                                return Unit.a;
                            }
                        }), av8Var3, 196608, 24);
                    } else {
                        av8Var3.W();
                    }
                    return Unit.a;
                }
            }), av8Var, 12582912, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: n31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pco.b(xtc.this, ct8Var, ct8Var2, ct8Var3, str, str2, f2, f3, f4, function0, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(h38 h38Var, Function1 function1, Function1 function12, Function0 function0, Function1 function13, of3 of3Var, int i2) {
        h38Var.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        function13.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-646495844);
        int i3 = i2 | (av8Var.g(h38Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? a.o : 1024) | (av8Var.i(function13) ? 16384 : 8192);
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            Object O = av8Var.O();
            int i4 = 14;
            if (O == nf3.a) {
                O = new q73(i4);
                av8Var.n0(O);
            }
            l98.b(h38Var, null, null, null, "FinalScoreAnimationContent", (Function1) O, yqo.H(-2087900791, av8Var, new nlj(function1, function12, function0, function13, 2)), av8Var, (i3 & 14) | 1794048, 14);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere((Object) h38Var, function1, (Object) function12, (Object) function0, (Object) function13, i2, 3);
        }
    }

    public static final void d(final ku5 ku5Var, final float f2, final float f3, final float f4, final boolean z, final qug qugVar, final boolean z2, final boolean z3, final int i2, final xtc xtcVar, of3 of3Var, final int i3) {
        av8 av8Var;
        utc utcVar;
        boolean z4;
        n12 n12Var;
        f50 f50Var;
        f50 f50Var2;
        String str;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        boolean z7;
        jf9 jf9Var = oyn.e;
        ku5Var.getClass();
        qugVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1211191546);
        int i6 = i3 | (av8Var2.g(ku5Var) ? 4 : 2) | (av8Var2.d(f2) ? 32 : 16) | (av8Var2.d(f3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.d(f4) ? a.o : 1024) | (av8Var2.h(z) ? 16384 : 8192) | (av8Var2.g(qugVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.h(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.h(z3) ? 8388608 : 4194304) | (av8Var2.e(i2) ? 67108864 : 33554432) | (av8Var2.g(xtcVar) ? 536870912 : 268435456);
        int i7 = 0;
        if (av8Var2.T(i6 & 1, (306783379 & i6) != 306783378)) {
            boolean z8 = av8Var2.k(dh3.n) == ema.b;
            boolean z9 = (i6 & 458752) == 131072;
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z9 || O == a99Var) {
                O = goh.b(new fu5(qugVar, i7));
                av8Var2.n0(O);
            }
            final cdi cdiVar = (cdi) O;
            float f5 = f4 - f3;
            float b2 = f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? llf.b((f2 - f3) / f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) : 1.0f;
            final float b3 = llf.b((b2 - 0.7f) / 0.3f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            String str2 = ku5Var.e;
            boolean z10 = ku5Var.j;
            String str3 = ku5Var.d;
            boolean z11 = (str2 == null && str3 == null && !z10) ? false : true;
            boolean z12 = b2 <= 0.3f;
            float t = b6a.t(4.0f, 8.0f, b2);
            float H0 = ((kx4) av8Var2.k(dh3.h)).H0(8.0f - t);
            xtc e2 = bkh.e(xtcVar, 44.0f);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            final boolean z13 = z8;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, e2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var3 = hf3.g;
            waa.K(av8Var2, a2, f50Var3);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var4 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var4);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var5 = hf3.d;
            waa.K(av8Var2, C, f50Var5);
            float f6 = z3 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 8.0f;
            utc utcVar2 = utc.a;
            xtc f0 = l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, f0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var3);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var4, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var5);
            av8Var2.d0(-1139764128);
            xtc p = bkh.p(utcVar2, 4.0f);
            if (ku5Var.i) {
                p = p.z(n9e.q(l98.d0(bkh.c(utcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, 1), lz.D(com.sofascore.results.R.color.value, av8Var2), jf9Var));
            }
            av8Var2.s(false);
            e12.a(0, av8Var2, p);
            xtc f02 = l98.f0(utcVar2, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            mv1 mv1Var = uxf.c;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m4 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, f02);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, f50Var3);
            waa.K(av8Var2, m4, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var4, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var5);
            td4.C(ku5Var.a, bkh.l(utcVar2, 24.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 48, 12);
            av8 av8Var3 = av8Var2;
            Integer num = ku5Var.h;
            n12 n12Var2 = n12.a;
            if (num == null) {
                av8Var3.d0(228690423);
                av8Var3.s(false);
                utcVar = utcVar2;
                z4 = z10;
                n12Var = n12Var2;
            } else {
                av8Var3.d0(228690424);
                utcVar = utcVar2;
                z4 = z10;
                n12Var = n12Var2;
                td4.G(num.intValue(), bkh.l(n12Var2.a(utcVar, uxf.i), 12.0f), false, 0L, av8Var3, 0, 12);
                av8Var3 = av8Var3;
                Unit unit = Unit.a;
                av8Var3.s(false);
            }
            if (z4) {
                av8Var3.d0(229013413);
                str = str3;
                f50Var = f50Var4;
                f50Var2 = f50Var5;
                av8 av8Var4 = av8Var3;
                kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_tv_channel_x_16, 6, av8Var3), null, bkh.l(n9e.q(wnn.A(n12Var.a(utcVar, uxf.k), o7g.a), lz.D(com.sofascore.results.R.color.error, av8Var3), jf9Var), 12.0f), lz.D(com.sofascore.results.R.color.surface_1, av8Var3), av8Var4, 48, 0);
                av8Var3 = av8Var4;
                z5 = false;
                av8Var3.s(false);
            } else {
                f50Var = f50Var4;
                f50Var2 = f50Var5;
                str = str3;
                z5 = false;
                av8Var3.d0(229479095);
                av8Var3.s(false);
            }
            av8Var3.s(true);
            xtc e3 = bkh.e(utcVar, 40.0f);
            k1c c3 = e12.c(mv1Var, z5);
            int hashCode4 = Long.hashCode(av8Var3.T);
            aee m5 = av8Var3.m();
            xtc C4 = fqj.C(av8Var3, e3);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, c3, f50Var3);
            waa.K(av8Var3, m5, ff3Var);
            f50 f50Var6 = f50Var;
            bf3.s(hashCode4, av8Var3, f50Var6, av8Var3, ryVar);
            f50 f50Var7 = f50Var2;
            waa.K(av8Var3, C4, f50Var7);
            String str4 = z12 ? ku5Var.c : ku5Var.b;
            if (ku5Var.k) {
                i4 = 1143388213;
                i5 = com.sofascore.results.R.color.live;
                z6 = false;
            } else {
                z6 = false;
                i4 = 1143388693;
                i5 = com.sofascore.results.R.color.n_lv_1;
            }
            long f7 = ljg.f(av8Var3, i4, i5, av8Var3, z6);
            int i8 = z12 ? 1 : 2;
            yf8 yf8Var = xth.a;
            dfj g2 = xth.g();
            xtc A = s9a.A(utcVar, new h66(wzb.b((f2 < f3 ? f3 : f2) + H0), 3));
            mv1 mv1Var2 = uxf.f;
            xtc a4 = n12Var.a(A, mv1Var2);
            final boolean z14 = z11;
            String str5 = str4;
            boolean h2 = av8Var3.h(z14) | av8Var3.d(b3);
            Object O2 = av8Var3.O();
            if (h2 || O2 == a99Var) {
                O2 = new Function1() { // from class: gu5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        f4g f4gVar = (f4g) obj;
                        f4gVar.getClass();
                        f4gVar.y(z14 ? (-(f4gVar.s.j() * 8.0f)) * b3 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        return Unit.a;
                    }
                };
                av8Var3.n0(O2);
            }
            av8 av8Var5 = av8Var3;
            q5a.w(str5, s02.M(a4, (Function1) O2), f7, null, 0L, 0L, null, 0L, i8, false, 1, 0, g2, av8Var5, 0, 27648, 102392);
            av8Var = av8Var5;
            xtc a5 = n12Var.a(utcVar, mv1Var2);
            boolean d2 = av8Var.d(b3);
            Object O3 = av8Var.O();
            if (d2 || O3 == a99Var) {
                O3 = new s81(b3, 3);
                av8Var.n0(O3);
            }
            xtc M = s02.M(a5, (Function1) O3);
            l8g a6 = k8g.a(wxfVar, uxf.l, av8Var, 0);
            int hashCode5 = Long.hashCode(av8Var.T);
            aee m6 = av8Var.m();
            xtc C5 = fqj.C(av8Var, M);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, f50Var3);
            waa.K(av8Var, m6, ff3Var);
            bf3.s(hashCode5, av8Var, f50Var6, av8Var, ryVar);
            waa.K(av8Var, C5, f50Var7);
            if (str2 != null) {
                av8Var.d0(699280462);
                q5a.w(ku5Var.e, null, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), null, 0L, 0L, null, 0L, 0, false, 1, 0, xth.g(), av8Var, 0, 24576, 114682);
                av8Var = av8Var;
                z7 = false;
                av8Var.s(false);
            } else {
                z7 = false;
                av8Var.d0(699561074);
                av8Var.s(false);
            }
            if (str != null) {
                av8Var.d0(699631475);
                if (str2 != null) {
                    ljg.r(4.0f, 699679091, av8Var, av8Var, utcVar);
                    av8Var.s(z7);
                } else {
                    av8Var.d0(699770386);
                    av8Var.s(z7);
                }
                av8 av8Var6 = av8Var;
                q5a.w(ku5Var.d, null, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), null, 0L, 0L, null, 0L, 0, false, 1, 0, xth.g(), av8Var6, 0, 24576, 114682);
                av8Var = av8Var6;
                z7 = false;
                av8Var.s(false);
            } else {
                av8Var.d0(700061042);
                av8Var.s(z7);
            }
            if (z4) {
                av8Var.d0(700122794);
                if (str == null && str2 == null) {
                    av8Var.d0(700292178);
                    av8Var.s(z7);
                } else {
                    ljg.r(4.0f, 700200883, av8Var, av8Var, utcVar);
                    av8Var.s(z7);
                }
                av8 av8Var7 = av8Var;
                q5a.w(oea.v(com.sofascore.results.R.string.basketball_player_ejected_long, av8Var), null, lz.D(com.sofascore.results.R.color.error, av8Var), null, 0L, 0L, null, 0L, 0, false, 1, 0, xth.g(), av8Var7, 0, 24576, 114682);
                av8Var = av8Var7;
                av8Var.s(false);
            } else {
                av8Var.d0(700622514);
                av8Var.s(z7);
            }
            ljg.t(av8Var, true, true, true);
            dy0.b(bkh.d(utcVar, 1.0f), null, yqo.H(2028019520, av8Var, new ct8() { // from class: hu5
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    lv1 lv1Var2;
                    ku5 ku5Var2;
                    uxf uxfVar;
                    ff3 ff3Var2;
                    ry ryVar2;
                    f50 f50Var8;
                    zg3 zg3Var2;
                    f50 f50Var9;
                    boolean z15;
                    List j2;
                    int i9;
                    boolean z16;
                    int i10;
                    int i11;
                    s22 s22Var = (s22) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    s22Var.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((av8) of3Var2).g(s22Var) ? 4 : 2;
                    }
                    av8 av8Var8 = (av8) of3Var2;
                    if (av8Var8.T(intValue & 1, (intValue & 19) != 18)) {
                        boolean z17 = z3;
                        float c4 = s22Var.c();
                        if (z17) {
                            c4 -= 32.0f;
                        }
                        g28 g28Var = bkh.c;
                        lv1 lv1Var3 = uxf.m;
                        uxf uxfVar2 = ww9.c;
                        l8g a7 = k8g.a(uxfVar2, lv1Var3, av8Var8, 54);
                        int hashCode6 = Long.hashCode(av8Var8.T);
                        aee m7 = av8Var8.m();
                        xtc C6 = fqj.C(av8Var8, g28Var);
                        if3.k7.getClass();
                        zg3 zg3Var3 = hf3.b;
                        av8Var8.h0();
                        if (av8Var8.S) {
                            av8Var8.l(zg3Var3);
                        } else {
                            av8Var8.q0();
                        }
                        f50 f50Var10 = hf3.g;
                        waa.K(av8Var8, a7, f50Var10);
                        ff3 ff3Var3 = hf3.f;
                        waa.K(av8Var8, m7, ff3Var3);
                        Integer valueOf2 = Integer.valueOf(hashCode6);
                        f50 f50Var11 = hf3.j;
                        waa.K(av8Var8, valueOf2, f50Var11);
                        ry ryVar3 = hf3.k;
                        waa.J(av8Var8, ryVar3);
                        f50 f50Var12 = hf3.d;
                        waa.K(av8Var8, C6, f50Var12);
                        utc utcVar3 = utc.a;
                        ku5 ku5Var3 = ku5Var;
                        if (z17) {
                            av8Var8.d0(-2115226361);
                            xtc q = n9e.q(bkh.p(bkh.c(utcVar3, 1.0f), 32.0f), lz.D(com.sofascore.results.R.color.surface_1, av8Var8), oyn.e);
                            k1c c5 = e12.c(uxf.g, false);
                            int hashCode7 = Long.hashCode(av8Var8.T);
                            aee m8 = av8Var8.m();
                            xtc C7 = fqj.C(av8Var8, q);
                            av8Var8.h0();
                            if (av8Var8.S) {
                                av8Var8.l(zg3Var3);
                            } else {
                                av8Var8.q0();
                            }
                            waa.K(av8Var8, c5, f50Var10);
                            waa.K(av8Var8, m8, ff3Var3);
                            bf3.s(hashCode7, av8Var8, f50Var11, av8Var8, ryVar3);
                            waa.K(av8Var8, C7, f50Var12);
                            lv1Var2 = lv1Var3;
                            ryVar2 = ryVar3;
                            uxfVar = uxfVar2;
                            f50Var8 = f50Var11;
                            ff3Var2 = ff3Var3;
                            ku5Var2 = ku5Var3;
                            zg3Var2 = zg3Var3;
                            f50Var9 = f50Var10;
                            i9a.j(ku5Var3.g, false, false, bkh.l(utcVar3, 24.0f), false, false, null, av8Var8, V2.b.f, 112);
                            av8Var8.s(true);
                            z15 = false;
                            av8Var8.s(false);
                        } else {
                            lv1Var2 = lv1Var3;
                            ku5Var2 = ku5Var3;
                            uxfVar = uxfVar2;
                            ff3Var2 = ff3Var3;
                            ryVar2 = ryVar3;
                            f50Var8 = f50Var11;
                            zg3Var2 = zg3Var3;
                            f50Var9 = f50Var10;
                            z15 = false;
                            av8Var8.d0(-2114589218);
                            av8Var8.s(false);
                        }
                        k1c c6 = e12.c(uxf.c, z15);
                        int hashCode8 = Long.hashCode(av8Var8.T);
                        aee m9 = av8Var8.m();
                        xtc C8 = fqj.C(av8Var8, utcVar3);
                        av8Var8.h0();
                        if (av8Var8.S) {
                            av8Var8.l(zg3Var2);
                        } else {
                            av8Var8.q0();
                        }
                        waa.K(av8Var8, c6, f50Var9);
                        waa.K(av8Var8, m9, ff3Var2);
                        bf3.s(hashCode8, av8Var8, f50Var8, av8Var8, ryVar2);
                        waa.K(av8Var8, C8, f50Var12);
                        float f8 = 1.0f;
                        xtc c7 = bkh.c(bkh.q(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c4, 1), 1.0f);
                        hu5 hu5Var = this;
                        boolean z18 = z;
                        boolean z19 = z2;
                        xtc Z = hkg.Z(c7, qugVar, z18 && z19, 12);
                        l8g a8 = k8g.a(uxfVar, lv1Var2, av8Var8, 54);
                        int hashCode9 = Long.hashCode(av8Var8.T);
                        aee m10 = av8Var8.m();
                        xtc C9 = fqj.C(av8Var8, Z);
                        av8Var8.h0();
                        if (av8Var8.S) {
                            av8Var8.l(zg3Var2);
                        } else {
                            av8Var8.q0();
                        }
                        waa.K(av8Var8, a8, f50Var9);
                        waa.K(av8Var8, m10, ff3Var2);
                        bf3.s(hashCode9, av8Var8, f50Var8, av8Var8, ryVar2);
                        waa.K(av8Var8, C9, f50Var12);
                        av8Var8.d0(-54980508);
                        int i12 = 0;
                        for (Object obj4 : ku5Var2.f) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                b.q();
                                throw null;
                            }
                            o22 o22Var = (o22) obj4;
                            av8Var8.a0(367111660, Integer.valueOf(i12));
                            String str6 = o22Var.a;
                            if (i12 == i2) {
                                i10 = 367116891;
                                i11 = com.sofascore.results.R.color.primary_default;
                                z16 = false;
                            } else {
                                z16 = false;
                                i10 = 367117681;
                                i11 = com.sofascore.results.R.color.n_lv_1;
                            }
                            long f9 = ljg.f(av8Var8, i10, i11, av8Var8, z16);
                            xtc p2 = bkh.p(utcVar3, o22Var.c ? 40.0f : 32.0f);
                            yf8 yf8Var2 = xth.a;
                            av8 av8Var9 = av8Var8;
                            q5a.w(str6, p2, f9, null, 0L, 0L, new p7j(3), 0L, 0, false, 1, 0, dfj.a(xth.g(), 0L, 0L, null, null, 0L, null, 0, 1, 0L, null, null, 0, 16711679), av8Var9, 0, 24576, 113656);
                            av8Var8 = av8Var9;
                            av8Var8.s(false);
                            hu5Var = this;
                            f8 = f8;
                            i12 = i13;
                            z19 = z19;
                        }
                        float f10 = f8;
                        hu5 hu5Var2 = hu5Var;
                        boolean z20 = z19;
                        i.o(av8Var8, false, utcVar3, 8.0f, av8Var8);
                        av8Var8.s(true);
                        xtc c8 = bkh.c(bkh.p(mha.G(utcVar3, f10), 42.0f), f10);
                        cdi cdiVar2 = cdiVar;
                        boolean g3 = av8Var8.g(cdiVar2) | av8Var8.h(z20);
                        Object O4 = av8Var8.O();
                        if (g3 || O4 == nf3.a) {
                            O4 = new ju5(z20, cdiVar2, 0);
                            av8Var8.n0(O4);
                        }
                        xtc M2 = s02.M(c8, (Function1) O4);
                        if (z13) {
                            av8Var8.d0(1784061698);
                            j2 = b.j(new r13(r13.h), new r13(lz.D(com.sofascore.results.R.color.shadow, av8Var8)));
                            i9 = 0;
                            av8Var8.s(false);
                        } else {
                            av8Var8.d0(1784184706);
                            j2 = b.j(new r13(lz.D(com.sofascore.results.R.color.shadow, av8Var8)), new r13(r13.h));
                            i9 = 0;
                            av8Var8.s(false);
                        }
                        e12.a(i9, av8Var8, n9e.p(M2, wxf.s(j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 6));
                        av8Var8.s(true);
                        av8Var8.s(true);
                    } else {
                        av8Var8.W();
                    }
                    return Unit.a;
                }
            }), av8Var, 3078, 6);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(f2, f3, f4, z, qugVar, z2, z3, i2, xtcVar, i3) { // from class: iu5
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ qug f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ int i;
                public final /* synthetic */ xtc j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    pco.d(ku5.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(int i2, of3 of3Var, vnb vnbVar, Function1 function1, boolean z) {
        vmd vmdVar = vmd.EVENT_DETAILS;
        vnbVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1279195015);
        int i3 = (av8Var.h(z) ? 4 : 2) | i2 | (av8Var.g(vnbVar) ? 32 : 16) | (av8Var.i(function1) ? 2048 : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = ke0.c;
            boolean z2 = (i3 & 7168) == 2048;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new is5(5, function1);
                av8Var.n0(O);
            }
            ktm.s(vnbVar, (Function0) O, z, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, yqo.H(-484804871, av8Var, new h66(i4)), av8Var, ((i3 >> 3) & 14) | 100663296 | ((i3 << 6) & 896), 248);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new i66(z, vnbVar, function1, i2);
        }
    }

    public static final void f(ko6 ko6Var, Function1 function1, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(669216597);
        int i3 = (av8Var.g(ko6Var) ? 4 : 2) | i2 | (av8Var.i(function1) ? 32 : 16);
        int i4 = 18;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            wkn.a(Boolean.valueOf(ko6Var.c), gz8.x(utc.a, null, null, 3), null, null, yqo.H(1864634998, av8Var, new qm4(6, ko6Var, function1)), av8Var, 24576, 12);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(ko6Var, function1, i2, i4);
        }
    }

    public static final void h(lo6 lo6Var, of3 of3Var, int i2) {
        lo6Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(958428285);
        int i3 = (av8Var.i(lo6Var) ? 4 : 2) | i2;
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) av8Var.k(nz.b);
            ko6 ko6Var = (ko6) ((eoh) lo6Var.i).getValue();
            boolean i5 = av8Var.i(context) | av8Var.i(lo6Var);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                O = new xw5(21, context, lo6Var);
                av8Var.n0(O);
            }
            f(ko6Var, (Function1) O, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new jo6(lo6Var, i2, i4);
        }
    }

    public static final void i(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(680943731);
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            Iterator p = ljg.p(av8Var, C, hf3.d, -1577269057, gv9Var);
            while (p.hasNext()) {
                FantasyLeaderboardStatistic fantasyLeaderboardStatistic = (FantasyLeaderboardStatistic) p.next();
                av8Var.a0(-1982579373, fantasyLeaderboardStatistic);
                j(fantasyLeaderboardStatistic, null, av8Var, 0);
                av8Var.s(false);
            }
            av8Var.s(false);
            av8Var.s(true);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var, xtcVar, i2, 9);
        }
    }

    public static final void j(FantasyLeaderboardStatistic fantasyLeaderboardStatistic, xtc xtcVar, of3 of3Var, int i2) {
        FantasyLeaderboardStatistic fantasyLeaderboardStatistic2;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1425324318);
        int i3 = i2 | (av8Var.e(fantasyLeaderboardStatistic.ordinal()) ? 4 : 2) | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            ng0 ng0Var = new ng0(16.0f, true, new a70(6));
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
            l8g a2 = k8g.a(ng0Var, uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc p = bkh.p(utcVar, 96.0f);
            String v = oea.v(fantasyLeaderboardStatistic.a, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, p, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
            fantasyLeaderboardStatistic2 = fantasyLeaderboardStatistic;
            udj.c(oea.v(fantasyLeaderboardStatistic2.b, av8Var), new goa(1.0f, true), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110584);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            fantasyLeaderboardStatistic2 = fantasyLeaderboardStatistic;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(fantasyLeaderboardStatistic2, xtcVar2, i2, 2);
        }
    }

    public static final void k(int i2, of3 of3Var, xtc xtcVar, Function0 function0, boolean z) {
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1389986368);
        int i3 = (av8Var.i(function0) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            ek2 t = rd0.t(lz.D(com.sofascore.results.R.color.surface_1, av8Var), av8Var, 0);
            n7g a2 = o7g.a(16.0f);
            gk2 u = rd0.u(z ? 8.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 62);
            xtc d2 = bkh.d(xtcVar, 1.0f);
            long D = lz.D(com.sofascore.results.R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = o67.i;
                av8Var.n0(O2);
            }
            un0.a(tol.y(d2, true, true, true, D, wzcVar, new gm(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 26), av8Var, 0), a2, t, u, null, yqo.H(-896042446, av8Var, new ud3(25)), av8Var, 196608, 16);
            av8Var = av8Var;
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new s27(i2, xtcVar, function0, z);
        }
    }

    public static final void l(f38 f38Var, Function1 function1, Function1 function12, Function0 function0, Function1 function13, of3 of3Var, int i2) {
        int i3;
        Boolean bool = f38Var.f;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1952485570);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(f38Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.i(function0) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.i(function13) ? 16384 : 8192;
        }
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            utc utcVar = utc.a;
            xtc h2 = ljg.h(16.0f, bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.surface_1, av8Var), 16.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, h2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            int i4 = i3;
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v = oea.v(com.sofascore.results.R.string.crowdsourcing_match_ended, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            w1l.o(1.0f, true, av8Var);
            Boolean bool2 = Boolean.TRUE;
            h5a.v((i4 >> 9) & 112, 4, lz.D(com.sofascore.results.R.color.crowdsourcing, av8Var), av8Var, null, function13, Intrinsics.c(bool, bool2));
            av8Var.s(true);
            fz8.b(x23.a, Intrinsics.c(bool, bool2), null, null, null, null, yqo.H(1421382544, av8Var, new k34(f38Var, function1, function12, function0, 0)), av8Var, 1572870, 30);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(f38Var, function1, function12, function0, function13, i2);
        }
    }

    public static final void m(f38 f38Var, Function1 function1, Function1 function12, Function1 function13, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        zg3 zg3Var;
        boolean z;
        int i4;
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1333537573);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(f38Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.i(function13) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.i(function0) ? 16384 : 8192;
        }
        int i6 = i3 | 196608;
        if (av8Var.T(i6 & 1, (74899 & i6) != 74898)) {
            utc utcVar = utc.a;
            xtc h2 = ljg.h(16.0f, bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.surface_1, av8Var), 16.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, h2);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            int i7 = f38Var.b;
            Boolean bool = f38Var.f;
            String g2 = fc6.g(i7, f38Var.c, " - ");
            yf8 yf8Var = xth.a;
            udj.c(g2, null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131066);
            udj.c(fc6.f(16.0f, com.sofascore.results.R.string.crowdsourcing_confirm_score_question, av8Var, av8Var, utcVar), null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            bf3.t(av8Var, true, utcVar, 16.0f, av8Var);
            l8g a4 = k8g.a(wxfVar, uxf.l, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc A = wnn.A(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), o7g.a(8.0f));
            Boolean bool2 = Boolean.TRUE;
            zg3 zg3Var3 = zg3Var;
            long f2 = Intrinsics.c(bool, bool2) ? ljg.f(av8Var, 1635151264, com.sofascore.results.R.color.success, av8Var, false) : ljg.f(av8Var, 1635151841, com.sofascore.results.R.color.surface_2, av8Var, false);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(A, f2, jf9Var);
            int i8 = i6 & 112;
            boolean z2 = i8 == 32;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                O = new ri(3, function1);
                av8Var.n0(O);
            }
            xtc y = tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31);
            mv1 mv1Var = uxf.g;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, y);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_tv_channel_checkmark_16, 6, av8Var), null, bkh.l(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 16.0f), Intrinsics.c(bool, bool2) ? ljg.f(av8Var, 1067154267, com.sofascore.results.R.color.surface_1, av8Var, false) : ljg.f(av8Var, 1067154871, com.sofascore.results.R.color.n_lv_3, av8Var, false), av8Var, 432, 0);
            i.o(av8Var, true, utcVar, 8.0f, av8Var);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc A2 = wnn.A(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), o7g.a(8.0f));
            Boolean bool3 = Boolean.FALSE;
            if (Intrinsics.c(bool, bool3)) {
                i4 = 1635180030;
                i5 = com.sofascore.results.R.color.error;
                z = false;
            } else {
                z = false;
                i4 = 1635180545;
                i5 = com.sofascore.results.R.color.surface_2;
            }
            xtc q2 = n9e.q(A2, ljg.f(av8Var, i4, i5, av8Var, z), jf9Var);
            boolean z3 = i8 == 32;
            Object O2 = av8Var.O();
            if (z3 || O2 == a99Var) {
                O2 = new ri(4, function1);
                av8Var.n0(O2);
            }
            xtc y2 = tol.y(q2, false, false, false, 0L, null, (Function0) O2, av8Var, 31);
            k1c c3 = e12.c(mv1Var, false);
            int hashCode5 = Long.hashCode(av8Var.T);
            aee m6 = av8Var.m();
            xtc C5 = fqj.C(av8Var, y2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m6, ff3Var);
            bf3.s(hashCode5, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C5, f50Var3);
            kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_tv_channel_x_16, 6, av8Var), null, bkh.l(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 16.0f), Intrinsics.c(bool, bool3) ? ljg.f(av8Var, 179067684, com.sofascore.results.R.color.surface_1, av8Var, false) : ljg.f(av8Var, 179068288, com.sofascore.results.R.color.n_lv_3, av8Var, false), av8Var, 432, 0);
            av8Var.s(true);
            av8Var.s(true);
            fz8.b(x23.a, Intrinsics.c(bool, bool3), null, null, null, null, yqo.H(2049212951, av8Var, new k34(f38Var, function12, function13, function0, 1)), av8Var, 1572870, 30);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bi(f38Var, function1, function12, function13, function0, xtcVar2, i2, 3);
        }
    }

    public static final void n(g38 g38Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        g38Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1980729896);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(g38Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc c0 = l98.c0(bkh.e(xtcVar, 56.0f), 16.0f, 12.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            int i4 = g38Var.a;
            SuggestStatus suggestStatus = g38Var.c;
            String g2 = fc6.g(i4, g38Var.b, " - ");
            yf8 yf8Var = xth.a;
            udj.c(g2, null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131066);
            utc utcVar = utc.a;
            udj.c(fc6.f(16.0f, com.sofascore.results.R.string.crowdsourcing_ft_score, av8Var, av8Var, utcVar), null, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            nq8.h(av8Var, new goa(1.0f, true));
            kq9.b(s6a.N(j34.b(suggestStatus), 6, av8Var), null, bkh.l(utcVar, 24.0f), j34.f(suggestStatus, av8Var), av8Var, 432, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(g38Var, xtcVar, i2, 14);
        }
    }

    public static final void o(f38 f38Var, Function1 function1, Function1 function12, Function0 function0, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2103693819);
        int i3 = i2 | (av8Var.g(f38Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            rd0.c(f38Var.d, f38Var.e, function1, function12, function0, null, av8Var, (i3 << 3) & 65408);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ace(i2, 7, f38Var, function1, function12, function0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(final MediaReactionType mediaReactionType, final int i2, final int i3, final int i4, xtc xtcVar, final String str, long j2, final boolean z, final Function1 function1, Function0 function0, of3 of3Var, final int i5, final int i6) {
        int i7;
        xtc xtcVar2;
        long j3;
        int i8;
        int i9;
        av8 av8Var;
        final long j4;
        final Function0 function02;
        eqf u;
        int i10;
        Function0 function03;
        long j5;
        int i11;
        Object O;
        Object O2;
        f50 f50Var;
        utc utcVar;
        long j6;
        av8 av8Var2;
        long j7;
        Function0 function04;
        long j8;
        boolean z2;
        function1.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-665104054);
        if ((i5 & 6) == 0) {
            i7 = (av8Var3.e(mediaReactionType == null ? -1 : mediaReactionType.ordinal()) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= av8Var3.e(i2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= av8Var3.e(i3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= av8Var3.e(i4) ? a.o : 1024;
        }
        int i12 = i6 & 16;
        if (i12 != 0) {
            i7 |= 24576;
        } else if ((i5 & 24576) == 0) {
            xtcVar2 = xtcVar;
            i7 |= av8Var3.g(xtcVar2) ? 16384 : 8192;
            if ((196608 & i5) == 0) {
                i7 |= av8Var3.g(str) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            }
            if ((1572864 & i5) != 0) {
                j3 = j2;
                i7 |= ((i6 & 64) == 0 && av8Var3.f(j3)) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            } else {
                j3 = j2;
            }
            if ((12582912 & i5) == 0) {
                i7 |= av8Var3.h(z) ? 8388608 : 4194304;
            }
            if ((100663296 & i5) == 0) {
                i7 |= av8Var3.i(function1) ? 67108864 : 33554432;
            }
            i8 = i6 & 512;
            if (i8 == 0) {
                i7 |= 805306368;
            } else if ((805306368 & i5) == 0) {
                i7 |= av8Var3.i(function0) ? 536870912 : 268435456;
                i9 = i7;
                if (av8Var3.T(i9 & 1, (i9 & 306783379) != 306783378)) {
                    av8Var3.Y();
                    int i13 = i5 & 1;
                    utc utcVar2 = utc.a;
                    Object obj = nf3.a;
                    if (i13 == 0 || av8Var3.B()) {
                        if (i12 != 0) {
                            xtcVar2 = utcVar2;
                        }
                        if ((i6 & 64) != 0) {
                            j3 = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var3);
                            i10 = i9 & (-3670017);
                        } else {
                            i10 = i9;
                        }
                        if (i8 != 0) {
                            Object O3 = av8Var3.O();
                            if (O3 == obj) {
                                O3 = new tv0(8);
                                av8Var3.n0(O3);
                            }
                            function03 = (Function0) O3;
                            j5 = j3;
                            i11 = i10;
                            xtc xtcVar3 = xtcVar2;
                            av8Var3.t();
                            xtc d2 = bkh.d(xtcVar3, 1.0f);
                            lv1 lv1Var = uxf.m;
                            Function0 function05 = function03;
                            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var3, 48);
                            int hashCode = Long.hashCode(av8Var3.T);
                            aee m2 = av8Var3.m();
                            xtc C = fqj.C(av8Var3, d2);
                            if3.k7.getClass();
                            Function0 function06 = hf3.b;
                            av8Var3.h0();
                            if (av8Var3.S) {
                                av8Var3.l(function06);
                            } else {
                                av8Var3.q0();
                            }
                            f50 f50Var2 = hf3.g;
                            waa.K(av8Var3, a2, f50Var2);
                            ff3 ff3Var = hf3.f;
                            waa.K(av8Var3, m2, ff3Var);
                            Integer valueOf = Integer.valueOf(hashCode);
                            f50 f50Var3 = hf3.j;
                            waa.K(av8Var3, valueOf, f50Var3);
                            ry ryVar = hf3.k;
                            waa.J(av8Var3, ryVar);
                            f50 f50Var4 = hf3.d;
                            waa.K(av8Var3, C, f50Var4);
                            xtc A = wnn.A(utcVar2, o7g.a(16.0f));
                            long D = lz.D(com.sofascore.results.R.color.n_lv_4, av8Var3);
                            O = av8Var3.O();
                            if (O == obj) {
                                O = mz1.e(av8Var3);
                            }
                            wzc wzcVar = (wzc) O;
                            Object[] objArr = new Object[0];
                            O2 = av8Var3.O();
                            if (O2 == obj) {
                                O2 = fi.f;
                                av8Var3.n0(O2);
                            }
                            xtc b0 = l98.b0(tol.y(A, true, true, true, D, wzcVar, new t31((boh) o3a.N(objArr, (Function0) O2, av8Var3, 48), function1, mediaReactionType, i4, i2, str), av8Var3, 0), 4.0f);
                            l8g a3 = k8g.a(new ng0(4.0f, true, new a70(6)), lv1Var, av8Var3, 54);
                            int hashCode2 = Long.hashCode(av8Var3.T);
                            aee m3 = av8Var3.m();
                            xtc C2 = fqj.C(av8Var3, b0);
                            av8Var3.h0();
                            if (av8Var3.S) {
                                av8Var3.l(function06);
                            } else {
                                av8Var3.q0();
                            }
                            waa.K(av8Var3, a3, f50Var2);
                            waa.K(av8Var3, m3, ff3Var);
                            bf3.s(hashCode2, av8Var3, f50Var3, av8Var3, ryVar);
                            waa.K(av8Var3, C2, f50Var4);
                            xlb I = x2a.I(new ylb(com.sofascore.results.R.raw.emoji_thumbs_up), av8Var3);
                            if (mediaReactionType == MediaReactionType.THUMBS_UP) {
                                av8Var3.d0(402475315);
                                f50Var = f50Var3;
                                aba.b((plb) I.getValue(), utcVar2, 1, null, av8Var3, 1572912, 0, 4194236);
                                av8Var3.s(false);
                                av8Var2 = av8Var3;
                                j6 = j5;
                                utcVar = utcVar2;
                            } else {
                                f50Var = f50Var3;
                                av8Var3.d0(402654495);
                                long j9 = j5;
                                utcVar = utcVar2;
                                kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_like_empty, 6, av8Var3), null, null, j9, av8Var3, ((i11 >> 9) & 7168) | 48, 4);
                                j6 = j9;
                                av8Var2 = av8Var3;
                                av8Var2.s(false);
                            }
                            if (i2 > 0) {
                                av8Var2.d0(402977577);
                                av8 av8Var4 = av8Var2;
                                String valueOf2 = String.valueOf(i2);
                                yf8 yf8Var = xth.a;
                                udj.c(valueOf2, null, j6, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var4, (i11 >> 12) & 896, 0, 131066);
                                j7 = j6;
                                av8Var2 = av8Var4;
                                av8Var2.s(false);
                            } else {
                                j7 = j6;
                                av8Var2.d0(403151952);
                                av8Var2.s(false);
                            }
                            i.o(av8Var2, true, utcVar, 8.0f, av8Var2);
                            if (z) {
                                function04 = function05;
                                av8Var = av8Var2;
                                j8 = j7;
                                z2 = true;
                                av8Var.d0(887048212);
                                av8Var.s(false);
                            } else {
                                av8Var2.d0(885895012);
                                xtc A2 = wnn.A(utcVar, o7g.a(16.0f));
                                long D2 = lz.D(com.sofascore.results.R.color.n_lv_4, av8Var2);
                                Object O4 = av8Var2.O();
                                if (O4 == obj) {
                                    O4 = mz1.e(av8Var2);
                                }
                                wzc wzcVar2 = (wzc) O4;
                                Object[] objArr2 = new Object[0];
                                Object O5 = av8Var2.O();
                                if (O5 == obj) {
                                    O5 = fi.g;
                                    av8Var2.n0(O5);
                                }
                                f50 f50Var5 = f50Var;
                                function04 = function05;
                                av8 av8Var5 = av8Var2;
                                xtc y = tol.y(A2, true, true, true, D2, wzcVar2, new u31((boh) o3a.N(objArr2, (Function0) O5, av8Var2, 48), function1, i4, i3, function05), av8Var5, 0);
                                av8Var = av8Var5;
                                xtc b02 = l98.b0(y, 4.0f);
                                l8g a4 = k8g.a(new ng0(4.0f, true, new a70(6)), lv1Var, av8Var, 54);
                                int hashCode3 = Long.hashCode(av8Var.T);
                                aee m4 = av8Var.m();
                                xtc C3 = fqj.C(av8Var, b02);
                                av8Var.h0();
                                if (av8Var.S) {
                                    av8Var.l(function06);
                                } else {
                                    av8Var.q0();
                                }
                                waa.K(av8Var, a4, f50Var2);
                                waa.K(av8Var, m4, ff3Var);
                                bf3.s(hashCode3, av8Var, f50Var5, av8Var, ryVar);
                                waa.K(av8Var, C3, f50Var4);
                                z2 = true;
                                long j10 = j7;
                                kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_menu_list_share, 6, av8Var), null, null, j10, av8Var, ((i11 >> 9) & 7168) | 48, 4);
                                j8 = j10;
                                if (i3 > 0) {
                                    av8Var.d0(-123337951);
                                    String valueOf3 = String.valueOf(i3);
                                    yf8 yf8Var2 = xth.a;
                                    udj.c(valueOf3, null, j8, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, (i11 >> 12) & 896, 0, 131066);
                                    av8Var.s(false);
                                } else {
                                    av8Var.d0(-123147115);
                                    av8Var.s(false);
                                }
                                av8Var.s(true);
                                av8Var.s(false);
                            }
                            av8Var.s(z2);
                            j4 = j8;
                            function02 = function04;
                            xtcVar2 = xtcVar3;
                        }
                    } else {
                        av8Var3.W();
                        if ((i6 & 64) != 0) {
                            i10 = i9 & (-3670017);
                        } else {
                            function03 = function0;
                            j5 = j3;
                            i11 = i9;
                            xtc xtcVar32 = xtcVar2;
                            av8Var3.t();
                            xtc d22 = bkh.d(xtcVar32, 1.0f);
                            lv1 lv1Var2 = uxf.m;
                            Function0 function052 = function03;
                            l8g a22 = k8g.a(ww9.b, lv1Var2, av8Var3, 48);
                            int hashCode4 = Long.hashCode(av8Var3.T);
                            aee m22 = av8Var3.m();
                            xtc C4 = fqj.C(av8Var3, d22);
                            if3.k7.getClass();
                            Function0 function062 = hf3.b;
                            av8Var3.h0();
                            if (av8Var3.S) {
                            }
                            f50 f50Var22 = hf3.g;
                            waa.K(av8Var3, a22, f50Var22);
                            ff3 ff3Var2 = hf3.f;
                            waa.K(av8Var3, m22, ff3Var2);
                            Integer valueOf4 = Integer.valueOf(hashCode4);
                            f50 f50Var32 = hf3.j;
                            waa.K(av8Var3, valueOf4, f50Var32);
                            ry ryVar2 = hf3.k;
                            waa.J(av8Var3, ryVar2);
                            f50 f50Var42 = hf3.d;
                            waa.K(av8Var3, C4, f50Var42);
                            xtc A3 = wnn.A(utcVar2, o7g.a(16.0f));
                            long D3 = lz.D(com.sofascore.results.R.color.n_lv_4, av8Var3);
                            O = av8Var3.O();
                            if (O == obj) {
                            }
                            wzc wzcVar3 = (wzc) O;
                            Object[] objArr3 = new Object[0];
                            O2 = av8Var3.O();
                            if (O2 == obj) {
                            }
                            xtc b03 = l98.b0(tol.y(A3, true, true, true, D3, wzcVar3, new t31((boh) o3a.N(objArr3, (Function0) O2, av8Var3, 48), function1, mediaReactionType, i4, i2, str), av8Var3, 0), 4.0f);
                            l8g a32 = k8g.a(new ng0(4.0f, true, new a70(6)), lv1Var2, av8Var3, 54);
                            int hashCode22 = Long.hashCode(av8Var3.T);
                            aee m32 = av8Var3.m();
                            xtc C22 = fqj.C(av8Var3, b03);
                            av8Var3.h0();
                            if (av8Var3.S) {
                            }
                            waa.K(av8Var3, a32, f50Var22);
                            waa.K(av8Var3, m32, ff3Var2);
                            bf3.s(hashCode22, av8Var3, f50Var32, av8Var3, ryVar2);
                            waa.K(av8Var3, C22, f50Var42);
                            xlb I2 = x2a.I(new ylb(com.sofascore.results.R.raw.emoji_thumbs_up), av8Var3);
                            if (mediaReactionType == MediaReactionType.THUMBS_UP) {
                            }
                            if (i2 > 0) {
                            }
                            i.o(av8Var2, true, utcVar, 8.0f, av8Var2);
                            if (z) {
                            }
                            av8Var.s(z2);
                            j4 = j8;
                            function02 = function04;
                            xtcVar2 = xtcVar32;
                        }
                    }
                    function03 = function0;
                    j5 = j3;
                    i11 = i10;
                    xtc xtcVar322 = xtcVar2;
                    av8Var3.t();
                    xtc d222 = bkh.d(xtcVar322, 1.0f);
                    lv1 lv1Var22 = uxf.m;
                    Function0 function0522 = function03;
                    l8g a222 = k8g.a(ww9.b, lv1Var22, av8Var3, 48);
                    int hashCode42 = Long.hashCode(av8Var3.T);
                    aee m222 = av8Var3.m();
                    xtc C42 = fqj.C(av8Var3, d222);
                    if3.k7.getClass();
                    Function0 function0622 = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                    }
                    f50 f50Var222 = hf3.g;
                    waa.K(av8Var3, a222, f50Var222);
                    ff3 ff3Var22 = hf3.f;
                    waa.K(av8Var3, m222, ff3Var22);
                    Integer valueOf42 = Integer.valueOf(hashCode42);
                    f50 f50Var322 = hf3.j;
                    waa.K(av8Var3, valueOf42, f50Var322);
                    ry ryVar22 = hf3.k;
                    waa.J(av8Var3, ryVar22);
                    f50 f50Var422 = hf3.d;
                    waa.K(av8Var3, C42, f50Var422);
                    xtc A32 = wnn.A(utcVar2, o7g.a(16.0f));
                    long D32 = lz.D(com.sofascore.results.R.color.n_lv_4, av8Var3);
                    O = av8Var3.O();
                    if (O == obj) {
                    }
                    wzc wzcVar32 = (wzc) O;
                    Object[] objArr32 = new Object[0];
                    O2 = av8Var3.O();
                    if (O2 == obj) {
                    }
                    xtc b032 = l98.b0(tol.y(A32, true, true, true, D32, wzcVar32, new t31((boh) o3a.N(objArr32, (Function0) O2, av8Var3, 48), function1, mediaReactionType, i4, i2, str), av8Var3, 0), 4.0f);
                    l8g a322 = k8g.a(new ng0(4.0f, true, new a70(6)), lv1Var22, av8Var3, 54);
                    int hashCode222 = Long.hashCode(av8Var3.T);
                    aee m322 = av8Var3.m();
                    xtc C222 = fqj.C(av8Var3, b032);
                    av8Var3.h0();
                    if (av8Var3.S) {
                    }
                    waa.K(av8Var3, a322, f50Var222);
                    waa.K(av8Var3, m322, ff3Var22);
                    bf3.s(hashCode222, av8Var3, f50Var322, av8Var3, ryVar22);
                    waa.K(av8Var3, C222, f50Var422);
                    xlb I22 = x2a.I(new ylb(com.sofascore.results.R.raw.emoji_thumbs_up), av8Var3);
                    if (mediaReactionType == MediaReactionType.THUMBS_UP) {
                    }
                    if (i2 > 0) {
                    }
                    i.o(av8Var2, true, utcVar, 8.0f, av8Var2);
                    if (z) {
                    }
                    av8Var.s(z2);
                    j4 = j8;
                    function02 = function04;
                    xtcVar2 = xtcVar322;
                } else {
                    av8Var = av8Var3;
                    av8Var.W();
                    j4 = j3;
                    function02 = function0;
                }
                u = av8Var.u();
                if (u != null) {
                    final xtc xtcVar4 = xtcVar2;
                    u.d = new Function2() { // from class: p31
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int K = aba.K(i5 | 1);
                            pco.p(MediaReactionType.this, i2, i3, i4, xtcVar4, str, j4, z, function1, function02, (of3) obj2, K, i6);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            i9 = i7;
            if (av8Var3.T(i9 & 1, (i9 & 306783379) != 306783378)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((196608 & i5) == 0) {
        }
        if ((1572864 & i5) != 0) {
        }
        if ((12582912 & i5) == 0) {
        }
        if ((100663296 & i5) == 0) {
        }
        i8 = i6 & 512;
        if (i8 == 0) {
        }
        i9 = i7;
        if (av8Var3.T(i9 & 1, (i9 & 306783379) != 306783378)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void q(final boolean z, final String str, of3 of3Var, final int i2) {
        final boolean z2;
        final int i3;
        Integer valueOf = Integer.valueOf(com.sofascore.results.R.drawable.ic_penalty_missed_16);
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-685101742);
        int i4 = (av8Var.g(str) ? 32 : 16) | i2;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = l6g.L(new Pair(Sports.FOOTBALL, l6g.K(Integer.valueOf(com.sofascore.results.R.drawable.ic_swap_16), Integer.valueOf(com.sofascore.results.R.drawable.ic_football_assist_16), Integer.valueOf(com.sofascore.results.R.drawable.ic_autogoal_16), Integer.valueOf(com.sofascore.results.R.drawable.ic_yellow_double_16), Integer.valueOf(com.sofascore.results.R.drawable.ic_ball_football))), new Pair(Sports.AMERICAN_FOOTBALL, l6g.K(Integer.valueOf(com.sofascore.results.R.drawable.ic_touchdown_16), Integer.valueOf(com.sofascore.results.R.drawable.ic_safety_16), Integer.valueOf(com.sofascore.results.R.drawable.ic_rogue_16), Integer.valueOf(com.sofascore.results.R.drawable.ic_passing_touchdown_16), Integer.valueOf(com.sofascore.results.R.drawable.ic_am_football_penalty_16))), new Pair(Sports.ICE_HOCKEY, l6g.K(Integer.valueOf(com.sofascore.results.R.drawable.ic_pak), Integer.valueOf(com.sofascore.results.R.drawable.ic_hockey_puck_pp), Integer.valueOf(com.sofascore.results.R.drawable.ic_hockey_puck_sh), Integer.valueOf(com.sofascore.results.R.drawable.ic_ice_hockey_autogol_away), Integer.valueOf(com.sofascore.results.R.drawable.ic_pak_autogoal))), new Pair(Sports.RUGBY, l6g.K(Integer.valueOf(com.sofascore.results.R.drawable.ic_rugby), Integer.valueOf(com.sofascore.results.R.drawable.ic_num_rugby_point_1), Integer.valueOf(com.sofascore.results.R.drawable.ic_num_rugby_point_2), Integer.valueOf(com.sofascore.results.R.drawable.ic_num_rugby_point_3))), new Pair(Sports.E_SPORTS, l6g.K(Integer.valueOf(com.sofascore.results.R.drawable.ic_lol_baron), Integer.valueOf(com.sofascore.results.R.drawable.ic_elder_dragon), Integer.valueOf(com.sofascore.results.R.drawable.ic_lol_turret), Integer.valueOf(com.sofascore.results.R.drawable.ic_ct_defuse), Integer.valueOf(com.sofascore.results.R.drawable.ic_elimination), Integer.valueOf(com.sofascore.results.R.drawable.ic_t_bomb))), new Pair(Sports.MMA, l6g.K(Integer.valueOf(com.sofascore.results.R.drawable.ic_discipline_mma), Integer.valueOf(com.sofascore.results.R.drawable.ic_discipline_boxing), Integer.valueOf(com.sofascore.results.R.drawable.ic_discipline_kickboxing))));
                av8Var.n0(O);
            }
            tee teeVar = (tee) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = l6g.L(new Pair(Sports.FOOTBALL, l6g.K(Integer.valueOf(com.sofascore.results.R.drawable.ic_swap_injured), Integer.valueOf(com.sofascore.results.R.drawable.ic_football_glove), Integer.valueOf(com.sofascore.results.R.drawable.ic_penalty_16), Integer.valueOf(com.sofascore.results.R.drawable.ic_var), valueOf)), new Pair(Sports.AMERICAN_FOOTBALL, l6g.K(Integer.valueOf(com.sofascore.results.R.drawable.ic_field_goal_16), Integer.valueOf(com.sofascore.results.R.drawable.ic_extra_point_16), Integer.valueOf(com.sofascore.results.R.drawable.ic_touchdown_extra_point), Integer.valueOf(com.sofascore.results.R.drawable.ic_touchdown_2pt_conversion), Integer.valueOf(com.sofascore.results.R.drawable.ic_two_point_conversion_16))), new Pair(Sports.ICE_HOCKEY, l6g.K(Integer.valueOf(com.sofascore.results.R.drawable.ic_goalie_in_24), Integer.valueOf(com.sofascore.results.R.drawable.ic_goalie_out_24), Integer.valueOf(com.sofascore.results.R.drawable.ic_pak_penalty), valueOf, Integer.valueOf(com.sofascore.results.R.drawable.ic_accumulated_penalty))), new Pair(Sports.RUGBY, l6g.K(Integer.valueOf(com.sofascore.results.R.drawable.ic_rugby_shootout_missed), Integer.valueOf(com.sofascore.results.R.drawable.ic_penalty_try), Integer.valueOf(com.sofascore.results.R.drawable.ic_swap_temporary), Integer.valueOf(com.sofascore.results.R.drawable.ic_rugby_shootout_made))), new Pair(Sports.E_SPORTS, l6g.K(Integer.valueOf(com.sofascore.results.R.drawable.ic_ct_time), Integer.valueOf(com.sofascore.results.R.drawable.ic_dota_role_hard_carry), Integer.valueOf(com.sofascore.results.R.drawable.ic_dota_role_mid), Integer.valueOf(com.sofascore.results.R.drawable.ic_dota_role_offlaner), Integer.valueOf(com.sofascore.results.R.drawable.ic_dota_role_soft_support))), new Pair(Sports.MMA, l6g.K(Integer.valueOf(com.sofascore.results.R.drawable.ic_discipline_muay_thai), Integer.valueOf(com.sofascore.results.R.drawable.ic_discipline_grappling), Integer.valueOf(com.sofascore.results.R.drawable.ic_champion))));
                av8Var.n0(O2);
            }
            tee teeVar2 = (tee) O2;
            if (!z) {
                teeVar = teeVar2;
            }
            b7 b7Var = (b7) teeVar.get(str);
            if (b7Var == null) {
                eqf u = av8Var.u();
                if (u != null) {
                    final int i5 = 0;
                    u.d = new Function2(i2, i5, str, z) { // from class: mmj
                        public final /* synthetic */ int a;
                        public final /* synthetic */ boolean b;
                        public final /* synthetic */ String c;

                        {
                            this.a = i5;
                            this.b = z;
                            this.c = str;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.a;
                            of3 of3Var2 = (of3) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    pco.q(this.b, this.c, of3Var2, aba.K(7));
                                    break;
                                default:
                                    pco.q(this.b, this.c, of3Var2, aba.K(7));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            z2 = z;
            lv1 lv1Var = uxf.m;
            kg0 kg0Var = ww9.f;
            utc utcVar = utc.a;
            xtc s = tgj.s(utcVar, Integer.MAX_VALUE, 0, 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 62);
            l8g a2 = k8g.a(kg0Var, lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, s);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(-2104613020);
            ListIterator<Object> listIterator = b7Var.listIterator(0);
            while (listIterator.hasNext()) {
                kq9.b(s6a.N(((Number) listIterator.next()).intValue(), 6, av8Var), null, bkh.l(utcVar, 80.0f), lz.D(com.sofascore.results.R.color.on_color_highlight_2, av8Var), av8Var, 432, 0);
                nq8.h(av8Var, bkh.p(utcVar, 64.0f));
            }
            av8Var.s(false);
            i3 = 1;
            av8Var.s(true);
        } else {
            z2 = z;
            i3 = 1;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2(i2, i3, str, z2) { // from class: mmj
                public final /* synthetic */ int a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ String c;

                {
                    this.a = i3;
                    this.b = z2;
                    this.c = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = this.a;
                    of3 of3Var2 = (of3) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            pco.q(this.b, this.c, of3Var2, aba.K(7));
                            break;
                        default:
                            pco.q(this.b, this.c, of3Var2, aba.K(7));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final void r(int i2, of3 of3Var, xtc xtcVar, String str) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(140546952);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            int a2 = wyh.a(str);
            kg0 kg0Var = ww9.f;
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a3 = k8g.a(kg0Var, lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(s6a.N(a2, 6, av8Var), null, bkh.l(utcVar, 40.0f), lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 20.0f));
            String c2 = wyh.c(context, str);
            yf8 yf8Var = xth.a;
            udj.c(c2, null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x81(str, xtcVar2, i2, 8);
        }
    }

    public static final void s(e9i e9iVar, nmj nmjVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1802970460);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(e9iVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(nmjVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc d0 = l98.d0(bkh.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 60.0f, 1);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            Sport sport = nmjVar.a;
            q(true, sport.getSlug(), av8Var, 6);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            nq8.h(av8Var, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            r(0, av8Var, null, sport.getSlug());
            utc utcVar = utc.a;
            nq8.h(av8Var, bkh.e(utcVar, 50.0f));
            float a3 = e9iVar.a(1000, 500);
            float f2 = (0.1f * a3) + 0.9f;
            String a4 = nmjVar.b.a(av8Var);
            yf8 yf8Var = xth.a;
            dfj f3 = xth.f();
            long D = lz.D(com.sofascore.results.R.color.on_color_primary, av8Var);
            xtc d02 = l98.d0(bkh.d(utcVar, 1.0f), 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            boolean d2 = av8Var.d(a3) | av8Var.d(f2);
            Object O = av8Var.O();
            if (d2 || O == nf3.a) {
                O = new n28(26, a3, f2);
                av8Var.n0(O);
            }
            udj.c(a4, s02.M(d02, (Function1) O), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, f3, av8Var, 0, 0, 130040);
            av8Var = av8Var;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            nq8.h(av8Var, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            q(false, sport.getSlug(), av8Var, 6);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(e9iVar, nmjVar, i2, 15);
        }
    }

    public static final void t(v23 v23Var, nmj nmjVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(408691505);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(v23Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(nmjVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            nq8.h(av8Var, v23Var.a(90.0f, utcVar, true));
            xtc d2 = bkh.d(utcVar, 1.0f);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            Sport sport = nmjVar.a;
            q(true, sport.getSlug(), av8Var, 6);
            String a2 = nmjVar.e.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a2, bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            av8Var.s(true);
            nq8.h(av8Var, v23Var.a(121.0f, utcVar, true));
            r(0, av8Var, null, sport.getSlug());
            nq8.h(av8Var, v23Var.a(121.0f, utcVar, true));
            q(false, sport.getSlug(), av8Var, 6);
            nq8.h(av8Var, bkh.e(utcVar, 24.0f));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(v23Var, nmjVar, i2, 14);
        }
    }

    public static String u(int i2, String str, Integer num) {
        StringBuilder sb = new StringBuilder(F());
        sb.append("branding/provider/");
        sb.append(num);
        sb.append("/");
        sb.append(str);
        return fn0.k(i2, "/", "/banner", sb);
    }

    public static String v(int i2, boolean z, int i3, int i4, int[] iArr, int i5) {
        Object[] objArr = {b[i2], Integer.valueOf(i3), Integer.valueOf(i4), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i5)};
        int i6 = lik.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i7 = 0; i7 < length; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }

    public static final hof w(z88 z88Var, iz2 iz2Var) {
        z88Var.getClass();
        rq3 rq3Var = null;
        int i2 = 2;
        int i3 = 1;
        z88 K = y6a.K(new j98(z88Var, new tl(rq3Var, iz2Var, i2), rq3Var, i3));
        int i4 = 3;
        bx bxVar = new bx(i4, rq3Var, i3);
        K.getClass();
        int i5 = 0;
        return un0.H(new t98(new v98(new i40(i2, rq3Var, i2), new wf2(new pog(new j98(K, bxVar, rq3Var, i5)), i5)), new xf2(i4, rq3Var, i5), i5), iz2Var, weh.b, 1);
    }

    public static String x(int i2) {
        return vxd.j(i2, F(), "category/", "/image");
    }

    public static final String y(int i2) {
        return vxd.j(i2, F(), "character/", "/image");
    }

    public static final String z(String str) {
        str.getClass();
        return fc6.n(F(), "user-account/", str, "/chat-image");
    }
}
