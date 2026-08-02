package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import androidx.glance.appwidget.action.InvisibleActionTrampolineActivity;
import com.ironsource.InterfaceC4060ee;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.fantasy.teammanagement.substitutions.FantasySubstitutionsActivity;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayers;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingData;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ao2 {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final tc3 g = new tc3(1186137750, new gd3(29), false);
    public static final tc3 h = new tc3(886498986, new qd3(17), false);
    public static final tc3 i = new tc3(-2029289471, new qd3(18), false);
    public static final tc3 j = new tc3(-790322902, new qd3(19), false);
    public static final Class[] k = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final int[][] l = {new int[]{120256, 125680, 128380, 120032, 125560, 128318, 108736, 119920, 108640, 86080, 108592, 86048, 110016, 120560, 125820, 109792, 120440, 125758, 88256, 109680, 88160, 89536, 110320, 120700, 89312, 110200, 120638, 89200, 110140, 89840, 110460, 89720, 110398, 89980, 128506, 119520, 125304, 128190, 107712, 119408, 125244, 107616, 119352, 84032, 107568, 119324, 84000, 107544, 83984, 108256, 119672, 125374, 85184, 108144, 119612, 85088, 108088, 119582, 85040, 108060, 85728, 108408, 119742, 85616, 108348, 85560, 108318, 85880, 108478, 85820, 85790, 107200, 119152, 125116, 107104, 119096, 125086, 83008, 107056, 119068, 82976, 107032, 82960, 82952, 83648, 107376, 119228, 83552, 107320, 119198, 83504, 107292, 83480, 83468, 83824, 107452, 83768, 107422, 83740, 83900, 106848, 118968, 125022, 82496, 106800, 118940, 82464, 106776, 118926, 82448, 106764, 82440, 106758, 82784, 106936, 119006, 82736, 106908, 82712, 106894, 82700, 82694, 106974, 82830, 82240, 106672, 118876, 82208, 106648, 118862, 82192, 106636, 82184, 106630, 82180, 82352, 82328, 82316, 82080, 118830, 106572, 106566, 82050, 117472, 124280, 127678, 103616, 117360, 124220, 103520, 117304, 124190, 75840, 103472, 75808, 104160, 117624, 124350, 76992, 104048, 117564, 76896, 103992, 76848, 76824, 77536, 104312, 117694, 77424, 104252, 77368, 77340, 77688, 104382, 77628, 77758, 121536, 126320, 128700, 121440, 126264, 128670, 111680, 121392, 126236, 111648, 121368, 126222, 111632, 121356, 103104, 117104, 124092, 112320, 103008, 117048, 124062, 112224, 121656, 126366, 93248, 74784, 102936, 117006, 93216, 112152, 93200, 75456, 103280, 117180, 93888, 75360, 103224, 117150, 93792, 112440, 121758, 93744, 75288, 93720, 75632, 103356, 94064, 75576, 103326, 94008, 112542, 93980, 75708, 94140, 75678, 94110, 121184, 126136, 128606, 111168, 121136, 126108, 111136, 121112, 126094, 111120, 121100, 111112, 111108, 102752, 116920, 123998, 111456, 102704, 116892, 91712, 74272, 121244, 116878, 91680, 74256, 102668, 91664, 111372, 102662, 74244, 74592, 102840, 116958, 92000, 74544, 102812, 91952, 111516, 102798, 91928, 74508, 74502, 74680, 102878, 92088, 74652, 92060, 74638, 92046, 92126, 110912, 121008, 126044, 110880, 120984, 126030, 110864, 120972, 110856, 120966, 110852, 110850, 74048, 102576, 116828, 90944, 74016, 102552, 116814, 90912, 111000, 121038, 90896, 73992, 102534, 90888, 110982, 90884, 74160, 102620, 91056, 74136, 102606, 91032, 111054, 91020, 74118, 91014, 91100, 91086, 110752, 120920, 125998, 110736, 120908, 110728, 120902, 110724, 110722, 73888, 102488, 116782, 90528, 73872, 102476, 90512, 110796, 102470, 90504, 73860, 90500, 73858, 73944, 90584, 90572, 90566, 120876, 120870, 110658, 102444, 73800, 90312, 90308, 90306, 101056, 116080, 123580, 100960, 116024, 70720, 100912, 115996, 70688, 100888, 70672, 70664, 71360, 101232, 116156, 71264, 101176, 116126, 71216, 101148, 71192, 71180, 71536, 101308, 71480, 101278, 71452, 71612, 71582, 118112, 124600, 127838, 105024, 118064, 124572, 104992, 118040, 124558, 104976, 118028, 104968, 118022, 100704, 115896, 123486, 105312, 100656, 115868, 79424, 70176, 118172, 115854, 79392, 105240, 100620, 79376, 70152, 79368, 70496, 100792, 115934, 79712, 70448, 118238, 79664, 105372, 100750, 79640, 70412, 79628, 70584, 100830, 79800, 70556, 79772, 70542, 70622, 79838, 122176, 126640, 128860, 122144, 126616, 128846, 122128, 126604, 122120, 126598, 122116, 104768, 117936, 124508, 113472, 104736, 126684, 124494, 113440, 122264, 126670, 113424, 104712, 117894, 113416, 122246, 104706, 69952, 100528, 115804, 78656, 69920, 100504, 115790, 96064, 78624, 104856, 117966, 96032, 113560, 122318, 100486, 96016, 78600, 104838, 96008, 69890, 70064, 100572, 78768, 70040, 100558, 96176, 78744, 104910, 96152, 113614, 70022, 78726, 70108, 78812, 70094, 96220, 78798, 122016, 126552, 128814, 122000, 126540, 121992, 126534, 121988, 121986, 104608, 117848, 124462, 113056, 104592, 126574, 113040, 122060, 117830, 113032, 104580, 113028, 104578, 113026, 69792, 100440, 115758, 78240, 69776, 100428, 95136, 78224, 104652, 100422, 95120, 113100, 69764, 95112, 78212, 69762, 78210, 69848, 100462, 78296, 69836, 95192, 78284, 69830, 95180, 78278, 69870, 95214, 121936, 126508, 121928, 126502, 121924, 121922, 104528, 117804, 112848, 104520, 117798, 112840, 121958, 112836, 104514, 112834, 69712, 100396, 78032, 69704, 100390, 94672, 78024, 104550, 94664, 112870, 69698, 94660, 78018, 94658, 78060, 94700, 94694, 126486, 121890, 117782, 104484, 104482, 69672, 77928, 94440, 69666, 77922, 99680, 68160, 99632, 68128, 99608, 115342, 68112, 99596, 68104, 99590, 68448, 99768, 115422, 68400, 99740, 68376, 99726, 68364, 68358, 68536, 99806, 68508, 68494, 68574, 101696, 116400, 123740, 101664, 116376, 101648, 116364, 101640, 116358, 101636, 67904, 99504, 115292, 72512, 67872, 116444, 115278, 72480, 101784, 116430, 72464, 67848, 99462, 72456, 101766, 67842, 68016, 99548, 72624, 67992, 99534, 72600, 101838, 72588, 67974, 68060, 72668, 68046, 72654, 118432, 124760, 127918, 118416, 124748, 118408, 124742, 118404, 118402, 101536, 116312, 105888, 101520, 116300, 105872, 118476, 116294, 105864, 101508, 105860, 101506, 105858, 67744, 99416, 72096, 67728, 116334, 80800, 72080, 101580, 99398, 80784, 105932, 67716, 80776, 72068, 67714, 72066, 67800, 99438, 72152, 67788, 80856, 72140, 67782, 80844, 72134, 67822, 72174, 80878, 126800, 128940, 126792, 128934, 126788, 126786, 118352, 124716, 122576, 126828, 124710, 122568, 126822, 122564, 118338, 122562, 101456, 116268, 105680, 101448, 116262, 114128, 105672, 118374, 114120, 122598, 101442, 114116, 105666, 114114, 67664, 99372, 71888, 67656, 99366, 80336, 71880, 101478, 97232, 80328, 105702, 67650, 97224, 114150, 71874, 97220, 67692, 71916, 67686, 80364, 71910, 97260, 80358, 97254, 126760, 128918, 126756, 126754, 118312, 124694, 122472, 126774, 122468, 118306, 122466, 101416, 116246, 105576, 101412, 113896, 105572, 101410, 113892, 105570, 113890, 67624, 99350, 71784, 101430, 80104, 71780, 67618, 96744, 80100, 71778, 96740, 80098, 96738, 71798, 96758, 126738, 122420, 122418, 105524, 113780, 113778, 71732, 79988, 96500, 96498, 66880, 66848, 98968, 66832, 66824, 66820, 66992, 66968, 66956, 66950, 67036, 67022, DefaultOggSeeker.MATCH_BYTE_RANGE, 99984, 115532, 99976, 115526, 99972, 99970, 66720, 98904, 69024, 100056, 98892, 69008, 100044, 69000, 100038, 68996, 66690, 68994, 66776, 98926, 69080, 100078, 69068, 66758, 69062, 66798, 69102, 116560, 116552, 116548, 116546, 99920, 102096, 116588, 115494, 102088, 116582, 102084, 99906, 102082, 66640, 68816, 66632, 98854, 73168, 68808, 66628, 73160, 68804, 66626, 73156, 68802, 66668, 68844, 66662, 73196, 68838, 73190, 124840, 124836, 124834, 116520, 118632, 124854, 118628, 116514, 118626, 99880, 115478, 101992, 116534, 106216, 101988, 99874, 106212, 101986, 106210, 66600, 98838, 68712, 99894, 72936, 68708, 66594, 81384, 72932, 68706, 81380, 72930, 66614, 68726, 72950, 81398, 128980, 128978, 124820, 126900, 124818, 126898, 116500, 118580, 116498, 122740, 118578, 122738, 99860, 101940, 99858, 106100, 101938, 114420}, new int[]{128352, 129720, 125504, 128304, 129692, 125472, 128280, 129678, 125456, 128268, 125448, 128262, 125444, 125792, 128440, 129758, 120384, 125744, 128412, 120352, 125720, 128398, 120336, 125708, 120328, 125702, 120324, 120672, 125880, 128478, 110144, 120624, 125852, 110112, 120600, 125838, 110096, 120588, 110088, 120582, 110084, 110432, 120760, 125918, 89664, 110384, 120732, 89632, 110360, 120718, 89616, 110348, 89608, 110342, 89952, 110520, 120798, 89904, 110492, 89880, 110478, 89868, 90040, 110558, 90012, 89998, 125248, 128176, 129628, 125216, 128152, 129614, 125200, 128140, 125192, 128134, 125188, 125186, 119616, 125360, 128220, 119584, 125336, 128206, 119568, 125324, 119560, 125318, 119556, 119554, 108352, 119728, 125404, 108320, 119704, 125390, 108304, 119692, 108296, 119686, 108292, 108290, 85824, 108464, 119772, 85792, 108440, 119758, 85776, 108428, 85768, 108422, 85764, 85936, 108508, 85912, 108494, 85900, 85894, 85980, 85966, 125088, 128088, 129582, 125072, 128076, 125064, 128070, 125060, 125058, 119200, 125144, 128110, 119184, 125132, 119176, 125126, 119172, 119170, 107424, 119256, 125166, 107408, 119244, 107400, 119238, 107396, 107394, 83872, 107480, 119278, 83856, 107468, 83848, 107462, 83844, 83842, 83928, 107502, 83916, 83910, 83950, 125008, 128044, 125000, 128038, 124996, 124994, 118992, 125036, 118984, 125030, 118980, 118978, 106960, 119020, 106952, 119014, 106948, 106946, 82896, 106988, 82888, 106982, 82884, 82882, 82924, 82918, 124968, 128022, 124964, 124962, 118888, 124982, 118884, 118882, 106728, 118902, 106724, 106722, 82408, 106742, 82404, 82402, 124948, 124946, 118836, 118834, 106612, 106610, 124224, 127664, 129372, 124192, 127640, 129358, 124176, 127628, 124168, 127622, 124164, 124162, 117568, 124336, 127708, 117536, 124312, 127694, 117520, 124300, 117512, 124294, 117508, 117506, 104256, 117680, 124380, 104224, 117656, 124366, 104208, 117644, 104200, 117638, 104196, 104194, 77632, 104368, 117724, 77600, 104344, 117710, 77584, 104332, 77576, 104326, 77572, 77744, 104412, 77720, 104398, 77708, 77702, 77788, 77774, 128672, 129880, 93168, 128656, 129868, 92664, 128648, 129862, 92412, 128644, 128642, 124064, 127576, 129326, 126368, 124048, 129902, 126352, 128716, 127558, 126344, 124036, 126340, 124034, 126338, 117152, 124120, 127598, 121760, 117136, 124108, 121744, 126412, 124102, 121736, 117124, 121732, 117122, 121730, 103328, 117208, 124142, 112544, 103312, 117196, 112528, 121804, 117190, 112520, 103300, 112516, 103298, 112514, 75680, 103384, 117230, 94112, 75664, 103372, 94096, 112588, 103366, 94088, 75652, 94084, 75650, 75736, 103406, 94168, 75724, 94156, 75718, 94150, 75758, 128592, 129836, 91640, 128584, 129830, 91388, 128580, 91262, 128578, 123984, 127532, 126160, 123976, 127526, 126152, 128614, 126148, 123970, 126146, 116944, 124012, 121296, 116936, 124006, 121288, 126182, 121284, 116930, 121282, 102864, 116972, 111568, 102856, 116966, 111560, 121318, 111556, 102850, 111554, 74704, 102892, 92112, 74696, 102886, 92104, 111590, 92100, 74690, 92098, 74732, 92140, 74726, 92134, 128552, 129814, 90876, 128548, 90750, 128546, 123944, 127510, 126056, 128566, 126052, 123938, 126050, 116840, 123958, 121064, 116836, 121060, 116834, 121058, 102632, 116854, 111080, 121078, 111076, 102626, 111074, 74216, 102646, 91112, 74212, 91108, 74210, 91106, 74230, 91126, 128532, 90494, 128530, 123924, 126004, 123922, 126002, 116788, 120948, 116786, 120946, 102516, 110836, 102514, 110834, 73972, 90612, 73970, 90610, 128522, 123914, 125978, 116762, 120890, 102458, 110714, 123552, 127320, 129198, 123536, 127308, 123528, 127302, 123524, 123522, 116128, 123608, 127342, 116112, 123596, 116104, 123590, 116100, 116098, 101280, 116184, 123630, 101264, 116172, 101256, 116166, 101252, 101250, 71584, 101336, 116206, 71568, 101324, 71560, 101318, 71556, 71554, 71640, 101358, 71628, 71622, 71662, 127824, 129452, 79352, 127816, 129446, 79100, 127812, 78974, 127810, 123472, 127276, 124624, 123464, 127270, 124616, 127846, 124612, 123458, 124610, 115920, 123500, 118224, 115912, 123494, 118216, 124646, 118212, 115906, 118210, 100816, 115948, 105424, 100808, 115942, 105416, 118246, 105412, 100802, 105410, 70608, 100844, 79824, 70600, 100838, 79816, 105446, 79812, 70594, 79810, 70636, 79852, 70630, 79846, 129960, 95728, 113404, 129956, 95480, 113278, 129954, 95356, 95294, 127784, 129430, 78588, 128872, 129974, 95996, 78462, 128868, 127778, 95870, 128866, 123432, 127254, 124520, 123428, 126696, 128886, 123426, 126692, 124514, 126690, 115816, 123446, 117992, 115812, 122344, 117988, 115810, 122340, 117986, 122338, 100584, 115830, 104936, 100580, 113640, 104932, 100578, 113636, 104930, 113634, 70120, 100598, 78824, 70116, 96232, 78820, 70114, 96228, 78818, 96226, 70134, 78838, 129940, 94968, 113022, 129938, 94844, 94782, 127764, 78206, 128820, 127762, 95102, 128818, 123412, 124468, 123410, 126580, 124466, 126578, 115764, 117876, 115762, 122100, 117874, 122098, 100468, 104692, 100466, 113140, 104690, 113138, 69876, 78324, 69874, 95220, 78322, 95218, 129930, 94588, 94526, 127754, 128794, 123402, 124442, 126522, 115738, 117818, 121978, 100410, 104570, 112890, 69754, 78074, 94714, 94398, 123216, 127148, 123208, 127142, 123204, 123202, 115408, 123244, 115400, 123238, 115396, 115394, 99792, 115436, 99784, 115430, 99780, 99778, 68560, 99820, 68552, 99814, 68548, 68546, 68588, 68582, 127400, 129238, 72444, 127396, 72318, 127394, 123176, 127126, 123752, 123172, 123748, 123170, 123746, 115304, 123190, 116456, 115300, 116452, 115298, 116450, 99560, 115318, 101864, 99556, 101860, 99554, 101858, 68072, 99574, 72680, 68068, 72676, 68066, 72674, 68086, 72694, 129492, 80632, 105854, 129490, 80508, 80446, 127380, 72062, 127924, 127378, 80766, 127922, 123156, 123700, 123154, 124788, 123698, 124786, 115252, 116340, 115250, 118516, 116338, 118514, 99444, 101620, 99442, 105972, 101618, 105970, 67828, 72180, 67826, 80884, 72178, 80882, 97008, 114044, 96888, 113982, 96828, 96798, 129482, 80252, 130010, 97148, 80190, 97086, 127370, 127898, 128954, 123146, 123674, 124730, 126842, 115226, 116282, 118394, 122618, 99386, 101498, 105722, 114170, 67706, 71930, 80378, 96632, 113854, 96572, 96542, 80062, 96702, 96444, 96414, 96350, 123048, 123044, 123042, 115048, 123062, 115044, 115042, 99048, 115062, 99044, 99042, 67048, 99062, 67044, 67042, 67062, 127188, 68990, 127186, 123028, 123316, 123026, 123314, 114996, 115572, 114994, 115570, 98932, 100084, 98930, 100082, 66804, 69108, 66802, 69106, 129258, 73084, 73022, 127178, 127450, 123018, 123290, 123834, 114970, 115514, 116602, 98874, 99962, 102138, 66682, 68858, 73210, 81272, 106174, 81212, 81182, 72894, 81342, 97648, 114364, 97592, 114334, 97564, 97550, 81084, 97724, 81054, 97694, 97464, 114270, 97436, 97422, 80990, 97502, 97372, 97358, 97326, 114868, 114866, 98676, 98674, 66292, 66290, 123098, 114842, 115130, 98618, 99194, 66170, 67322, 69310, 73404, 73374, 81592, 106334, 81564, 81550, 73310, 81630, 97968, 114524, 97944, 114510, 97932, 97926, InterfaceC4060ee.e.b, 98012, 81486, 97998, 97880, 114478, 97868, 97862, 81454, 97902, 97836, 97830, 69470, 73564, 73550, 81752, 106414, 81740, 81734, 73518, 81774, 81708, 81702}, new int[]{109536, 120312, 86976, 109040, 120060, 86496, 108792, 119934, 86256, 108668, 86136, 129744, 89056, 110072, 129736, 88560, 109820, 129732, 88312, 109694, 129730, 88188, 128464, 129772, 89592, 128456, 129766, 89340, 128452, 89214, 128450, 125904, 128492, 125896, 128486, 125892, 125890, 120784, 125932, 120776, 125926, 120772, 120770, 110544, 120812, 110536, 120806, 110532, 84928, 108016, 119548, 84448, 107768, 119422, 84208, 107644, 84088, 107582, 84028, 129640, 85488, 108284, 129636, 85240, 108158, 129634, 85116, 85054, 128232, 129654, 85756, 128228, 85630, 128226, 125416, 128246, 125412, 125410, 119784, 125430, 119780, 119778, 108520, 119798, 108516, 108514, 83424, 107256, 119166, 83184, 107132, 83064, 107070, 83004, 82974, 129588, 83704, 107390, 129586, 83580, 83518, 128116, 83838, 128114, 125172, 125170, 119284, 119282, 107508, 107506, 82672, 106876, 82552, 106814, 82492, 82462, 129562, 82812, 82750, 128058, 125050, 119034, 82296, 106686, 82236, 82206, 82366, 82108, 82078, 76736, 103920, 117500, 76256, 103672, 117374, 76016, 103548, 75896, 103486, 75836, 129384, 77296, 104188, 129380, 77048, 104062, 129378, 76924, 76862, 127720, 129398, 77564, 127716, 77438, 127714, 124392, 127734, 124388, 124386, 117736, 124406, 117732, 117730, 104424, 117750, 104420, 104418, 112096, 121592, 126334, 92608, 111856, 121468, 92384, 111736, 121406, 92272, 111676, 92216, 111646, 92188, 75232, 103160, 117118, 93664, 74992, 103036, 93424, 112252, 102974, 93304, 74812, 93244, 74782, 93214, 129332, 75512, 103294, 129908, 129330, 93944, 75388, 129906, 93820, 75326, 93758, 127604, 75646, 128756, 127602, 94078, 128754, 124148, 126452, 124146, 126450, 117236, 121844, 117234, 121842, 103412, 103410, 91584, 111344, 121212, 91360, 111224, 121150, 91248, 111164, 91192, 111134, 91164, 91150, 74480, 102780, 91888, 74360, 102718, 91768, 111422, 91708, 74270, 91678, 129306, 74620, 129850, 92028, 74558, 91966, 127546, 128634, 124026, 126202, 116986, 121338, 102906, 90848, 110968, 121022, 90736, 110908, 90680, 110878, 90652, 90638, 74104, 102590, 91000, 74044, 90940, 74014, 90910, 74174, 91070, 90480, 110780, 90424, 110750, 90396, 90382, 73916, 90556, 73886, 90526, 90296, 110686, 90268, 90254, 73822, 90334, 90204, 90190, 71136, 101112, 116094, 70896, 100988, 70776, 100926, 70716, 70686, 129204, 71416, 101246, 129202, 71292, 71230, 127348, 71550, 127346, 123636, 123634, 116212, 116210, 101364, 101362, 79296, 105200, 118140, 79072, 105080, 118078, 78960, 105020, 78904, 104990, 78876, 78862, 70384, 100732, 79600, 70264, 100670, 79480, 105278, 79420, 70174, 79390, 129178, 70524, 129466, 79740, 70462, 79678, 127290, 127866, 123514, 124666, 115962, 118266, 100858, 113376, 122232, 126654, 95424, 113264, 122172, 95328, 113208, 122142, 95280, 113180, 95256, 113166, 95244, 78560, 104824, 117950, 95968, 78448, 104764, 95856, 113468, 104734, 95800, 78364, 95772, 78350, 95758, 70008, 100542, 78712, 69948, 96120, 78652, 69918, 96060, 78622, 96030, 70078, 78782, 96190, 94912, 113008, 122044, 94816, 112952, 122014, 94768, 112924, 94744, 112910, 94732, 94726, 78192, 104636, 95088, 78136, 104606, 95032, 113054, 95004, 78094, 94990, 69820, 78268, 69790, 95164, 78238, 95134, 94560, 112824, 121950, 94512, 112796, 94488, 112782, 94476, 94470, 78008, 104542, 94648, 77980, 94620, 77966, 94606, 69726, 78046, 94686, 94384, 112732, 94360, 112718, 94348, 94342, 77916, 94428, 77902, 94414, 94296, 112686, 94284, 94278, 77870, 94318, 94252, 94246, 68336, 99708, 68216, 99646, 68156, 68126, 68476, 68414, 127162, 123258, 115450, 99834, 72416, 101752, 116414, 72304, 101692, 72248, 101662, 72220, 72206, 67960, 99518, 72568, 67900, 72508, 67870, 72478, 68030, 72638, 80576, 105840, 118460, 80480, 105784, 118430, 80432, 105756, 80408, 105742, 80396, 80390, 72048, 101564, 80752, 71992, 101534, 80696, 71964, 80668, 71950, 80654, 67772, 72124, 67742, 80828, 72094, 80798, 114016, 122552, 126814, 96832, 113968, 122524, 96800, 113944, 122510, 96784, 113932, 96776, 113926, 96772, 80224, 105656, 118366, 97120, 80176, 105628, 97072, 114076, 105614, 97048, 80140, 97036, 80134, 97030, 71864, 101470, 80312, 71836, 97208, 80284, 71822, 97180, 80270, 97166, 67678, 71902, 80350, 97246, 96576, 113840, 122460, 96544, 113816, 122446, 96528, 113804, 96520, 113798, 96516, 96514, 80048, 105564, 96688, 80024, 105550, 96664, 113870, 96652, 80006, 96646, 71772, 80092, 71758, 96732, 80078, 96718, 96416, 113752, 122414, 96400, 113740, 96392, 113734, 96388, 96386, 79960, 105518, 96472, 79948, 96460, 79942, 96454, 71726, 79982, 96494, 96336, 113708, 96328, 113702, 96324, 96322, 79916, 96364, 79910, 96358, 96296, 113686, 96292, 96290, 79894, 96310, 66936, 99006, 66876, 66846, 67006, 68976, 100028, 68920, 99998, 68892, 68878, 66748, 69052, 66718, 69022, 73056, 102072, 116574, 73008, 102044, 72984, 102030, 72972, 72966, 68792, 99934, 73144, 68764, 73116, 68750, 73102, 66654, 68830, 73182, 81216, 106160, 118620, 81184, 106136, 118606, 81168, 106124, 81160, 106118, 81156, 81154, 72880, 101980, 81328, 72856, 101966, 81304, 106190, 81292, 72838, 81286, 68700, 72924, 68686, 81372, 72910, 81358, 114336, 122712, 126894, 114320, 122700, 114312, 122694, 114308, 114306, 81056, 106072, 118574, 97696, 81040, 106060, 97680, 114380, 106054, 97672, 81028, 97668, 81026, 97666, 72792, 101934, 81112, 72780, 97752, 81100, 72774, 97740, 81094, 97734, 68654, 72814, 81134, 97774, 114256, 122668, 114248, 122662, 114244, 114242, 80976, 106028, 97488, 80968, 106022, 97480, 114278, 97476, 80962, 97474, 72748, 81004, 72742, 97516, 80998, 97510, 114216, 122646, 114212, 114210, 80936, 106006, 97384, 80932, 97380, 80930, 97378, 72726, 80950, 97398, 114196, 114194, 80916, 97332, 80914, 97330, 66236, 66206, 67256, 99166, 67228, 67214, 66142, 67294, 69296, 100188, 69272, 100174, 69260, 69254, 67164, 69340, 67150, 69326, 73376, 102232, 116654, 73360, 102220, 73352, 102214, 73348, 73346, 69208, 100142, 73432, 102254, 73420, 69190, 73414, 67118, 69230, 73454, 106320, 118700, 106312, 118694, 106308, 106306, 73296, 102188, 81616, 106348, 102182, 81608, 73284, 81604, 73282, 81602, 69164, 73324, 69158, 81644, 73318, 81638, 122792, 126934, 122788, 122786, 106280, 118678, 114536, 106276, 114532, 106274, 114530, 73256, 102166, 81512, 73252, 98024, 81508, 73250, 98020, 81506, 98018, 69142, 73270, 81526, 98038, 122772, 122770, 106260, 114484, 106258, 114482, 73236, 81460, 73234, 97908, 81458, 97906, 122762, 106250, 114458, 73226, 81434, 97850, 66396, 66382, 67416, 99246, 67404, 67398, 66350, 67438, 69456, 100268, 69448, 100262, 69444, 69442, 67372, 69484, 67366, 69478, 102312, 116694, 102308, 102306, 69416, 100246, 73576, 102326, 73572, 69410, 73570, 67350, 69430, 73590, 118740, 118738, 102292, 106420, 102290, 106418, 69396, 73524, 69394, 81780, 73522, 81778, 118730, 102282, 106394, 69386, 73498, 81722, 66476, 66470, 67496, 99286, 67492, 67490, 66454, 67510, 100308, 100306, 67476, 69556, 67474, 69554, 116714}};
    public static final fgj m = new fgj(0, new long[0], new Object[0]);
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;
    public static final /* synthetic */ int s = 0;
    public static final /* synthetic */ int t = 0;

    public static String A(float f2) {
        int b2 = wzb.b(100.0f * f2);
        return (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || b2 != 0) ? mz1.i(b2, "%") : "<1%";
    }

    public static Intent B(Context context, ev6 ev6Var, ho7 ho7Var, gv9 gv9Var, il8 il8Var, Integer num, Integer num2, Integer num3) {
        context.getClass();
        ho7Var.getClass();
        gv9Var.getClass();
        Intent intent = new Intent(context, (Class<?>) FantasySubstitutionsActivity.class);
        intent.putExtra("competition", ev6Var);
        intent.putExtra("gameweek", ho7Var);
        intent.putExtra("squadInfoDisplayMode", il8Var);
        intent.putParcelableArrayListExtra("squad", new ArrayList<>(gv9Var));
        if (num != null) {
            intent.putExtra("subOutId", num.intValue());
        }
        if (num2 != null) {
            intent.putExtra("subInId", num2.intValue());
        }
        if (num3 != null) {
            intent.putExtra("captainId", num3.intValue());
        }
        return intent;
    }

    public static final void C(Activity activity, Intent intent) {
        StrictMode.VmPolicy build;
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            a70.p("List adapter activity trampoline invoked without specifying target intent.");
            return;
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            a70.p("List adapter activity trampoline invoked without trampoline type");
            return;
        }
        mc mcVar = new mc(stringExtra, activity, intent2, intent.getBundleExtra("ACTIVITY_OPTIONS"), 0);
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            build = mhi.a.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build();
        } else {
            build = new StrictMode.VmPolicy.Builder().build();
        }
        StrictMode.setVmPolicy(build);
        mcVar.invoke();
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }

    public static gv9 F(ArrayList arrayList) {
        rl1 rl1Var;
        int size = arrayList.size();
        if (size < 1) {
            size = 1;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            l91 l91Var = ((wl1) next).b;
            Object obj = linkedHashMap.get(l91Var);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(l91Var, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            l91 l91Var2 = (l91) entry.getKey();
            List list = (List) entry.getValue();
            if (l91Var2 != null) {
                int size2 = list.size();
                float f2 = size2 / size;
                rl1Var = new rl1(l91Var2.c, f2, l91Var2.d, l6g.K(size2 + " (" + A(f2) + ")"));
            } else {
                rl1Var = null;
            }
            if (rl1Var != null) {
                arrayList2.add(rl1Var);
            }
        }
        return l6g.W(CollectionsKt.H0(arrayList2, new qe8(15)));
    }

    public static final int G(int i2, Context context) {
        context.getClass();
        return wzb.b(i2 / context.getResources().getDisplayMetrics().density);
    }

    public static final int H(int i2, Context context) {
        context.getClass();
        return (int) TypedValue.applyDimension(2, i2, context.getResources().getDisplayMetrics());
    }

    public static boolean I(xgf xgfVar, ed8 ed8Var, bt8 bt8Var) {
        if (!(xgfVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) xgfVar).call();
            if (call == null) {
                xm5.a(ed8Var);
                return true;
            }
            try {
                Object apply = bt8Var.apply(call);
                rha.x(apply, "The mapper returned a null Publisher");
                xgf xgfVar2 = (xgf) apply;
                if (!(xgfVar2 instanceof Callable)) {
                    xgfVar2.a(ed8Var);
                    return true;
                }
                try {
                    Object call2 = ((Callable) xgfVar2).call();
                    if (call2 == null) {
                        xm5.a(ed8Var);
                        return true;
                    }
                    ed8Var.b(new irg(ed8Var, call2));
                    return true;
                } catch (Throwable th) {
                    td4.w0(th);
                    xm5.b(th, ed8Var);
                    return true;
                }
            } catch (Throwable th2) {
                td4.w0(th2);
                xm5.b(th2, ed8Var);
                return true;
            }
        } catch (Throwable th3) {
            td4.w0(th3);
            xm5.b(th3, ed8Var);
            return true;
        }
    }

    public static final Bundle J(String str) {
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", null);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0444  */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v7, types: [av8, of3] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53, types: [int] */
    /* JADX WARN: Type inference failed for: r5v90 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(y80 y80Var, a6e a6eVar, boolean z, of3 of3Var, int i2, int i3) {
        boolean z2;
        y80 y80Var2;
        boolean z3;
        av8 av8Var;
        eqf u;
        a6e a6eVar2;
        zg3 zg3Var;
        a99 a99Var;
        ry ryVar;
        bx7 bx7Var;
        String str;
        ff3 ff3Var;
        lv1 lv1Var;
        f50 f50Var;
        f50 f50Var2;
        utc utcVar;
        f50 f50Var3;
        zg3 zg3Var2;
        hy7 hy7Var;
        boolean z4;
        av8 av8Var2;
        f50 f50Var4;
        a99 a99Var2;
        ry ryVar2;
        ff3 ff3Var2;
        f50 f50Var5;
        lv1 lv1Var2;
        f50 f50Var6;
        boolean z5;
        av8 av8Var3;
        f50 f50Var7;
        ff3 ff3Var3;
        ry ryVar3;
        f50 f50Var8;
        int i4;
        ?? r5;
        float f2;
        jf9 jf9Var;
        utc utcVar2;
        f50 f50Var9;
        ?? r10;
        boolean z6;
        int i5;
        long f3;
        a99 a99Var3;
        ff3 ff3Var4;
        int i6;
        String str2;
        jf9 jf9Var2 = oyn.e;
        iy7 iy7Var = y80Var.m;
        bx7 bx7Var2 = y80Var.l;
        av8 av8Var4 = (av8) of3Var;
        av8Var4.f0(-561533157);
        int i7 = (av8Var4.g(y80Var) ? 4 : 2) | i2 | (av8Var4.g(a6eVar) ? 32 : 16);
        int i8 = i3 & 4;
        if (i8 != 0) {
            i7 |= 384;
        } else if ((i2 & 384) == 0) {
            z2 = z;
            i7 |= av8Var4.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if (av8Var4.T(i7 & 1, (i7 & 147) == 146)) {
                y80Var2 = y80Var;
                av8Var4.W();
                z3 = z2;
                av8Var = av8Var4;
            } else {
                boolean z7 = i8 != 0 ? false : z2;
                u23 a2 = t23.a(ww9.d, uxf.o, av8Var4, 0);
                int hashCode = Long.hashCode(av8Var4.T);
                aee m2 = av8Var4.m();
                utc utcVar3 = utc.a;
                xtc C = fqj.C(av8Var4, utcVar3);
                if3.k7.getClass();
                zg3 zg3Var3 = hf3.b;
                av8Var4.h0();
                if (av8Var4.S) {
                    av8Var4.l(zg3Var3);
                } else {
                    av8Var4.q0();
                }
                f50 f50Var10 = hf3.g;
                waa.K(av8Var4, a2, f50Var10);
                ff3 ff3Var5 = hf3.f;
                waa.K(av8Var4, m2, ff3Var5);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var11 = hf3.j;
                waa.K(av8Var4, valueOf, f50Var11);
                ry ryVar4 = hf3.k;
                waa.J(av8Var4, ryVar4);
                f50 f50Var12 = hf3.d;
                waa.K(av8Var4, C, f50Var12);
                xtc p2 = qx9.p(bkh.d(utcVar3, 1.0f), 0.8f);
                k1c c2 = e12.c(uxf.c, false);
                int hashCode2 = Long.hashCode(av8Var4.T);
                aee m3 = av8Var4.m();
                xtc C2 = fqj.C(av8Var4, p2);
                av8Var4.h0();
                int i9 = i7;
                if (av8Var4.S) {
                    av8Var4.l(zg3Var3);
                } else {
                    av8Var4.q0();
                }
                waa.K(av8Var4, c2, f50Var10);
                waa.K(av8Var4, m3, ff3Var5);
                bf3.s(hashCode2, av8Var4, f50Var11, av8Var4, ryVar4);
                waa.K(av8Var4, C2, f50Var12);
                a99 a99Var4 = nf3.a;
                if (z7) {
                    av8Var4.d0(-1742572629);
                    int k2 = a6eVar.k();
                    boolean z8 = (i9 & 14) == 4;
                    Object O = av8Var4.O();
                    if (z8 || O == a99Var4) {
                        O = new v80(y80Var, 1);
                        av8Var4.n0(O);
                    }
                    a6eVar2 = c6e.b(k2, (Function0) O, av8Var4, 0, 2);
                    av8Var4.s(false);
                } else {
                    av8Var4.d0(-1742388551);
                    av8Var4.s(false);
                    a6eVar2 = a6eVar;
                }
                f6a.a(a6eVar2, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, yqo.H(-1552538690, av8Var4, new jw5(y80Var, 3)), av8Var4, 0, 27648, 8190);
                av8 av8Var5 = av8Var4;
                hy7 hy7Var2 = y80Var.n;
                boolean z9 = iy7Var != null;
                boolean z10 = bx7Var2 != null;
                boolean z11 = hy7Var2 != null;
                xtc a3 = n12.a.a(l98.f0(utcVar3, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 6), uxf.i);
                ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                lv1 lv1Var3 = uxf.m;
                l8g a4 = k8g.a(ng0Var, lv1Var3, av8Var5, 54);
                int hashCode3 = Long.hashCode(av8Var5.T);
                aee m4 = av8Var5.m();
                xtc C3 = fqj.C(av8Var5, a3);
                av8Var5.h0();
                if (av8Var5.S) {
                    zg3Var = zg3Var3;
                    av8Var5.l(zg3Var);
                } else {
                    zg3Var = zg3Var3;
                    av8Var5.q0();
                }
                boolean z12 = z9;
                waa.K(av8Var5, a4, f50Var10);
                waa.K(av8Var5, m4, ff3Var5);
                bf3.s(hashCode3, av8Var5, f50Var11, av8Var5, ryVar4);
                waa.K(av8Var5, C3, f50Var12);
                if (z12) {
                    av8Var5.d0(-508836071);
                    xtc c0 = l98.c0(n9e.q(wnn.A(utcVar3, o7g.a(24.0f)), lz.D(com.sofascore.results.R.color.on_color_highlight_1, av8Var5), jf9Var2), 12.0f, 8.0f);
                    a99Var = a99Var4;
                    l8g a5 = k8g.a(new ng0(4.0f, true, new a70(6)), lv1Var3, av8Var5, 54);
                    int hashCode4 = Long.hashCode(av8Var5.T);
                    aee m5 = av8Var5.m();
                    xtc C4 = fqj.C(av8Var5, c0);
                    av8Var5.h0();
                    if (av8Var5.S) {
                        av8Var5.l(zg3Var);
                    } else {
                        av8Var5.q0();
                    }
                    waa.K(av8Var5, a5, f50Var10);
                    waa.K(av8Var5, m5, ff3Var5);
                    bf3.s(hashCode4, av8Var5, f50Var11, av8Var5, ryVar4);
                    waa.K(av8Var5, C4, f50Var12);
                    xtc l2 = bkh.l(utcVar3, 16.0f);
                    Integer num = iy7Var.a;
                    if (num == null) {
                        num = bx7Var2 != null ? bx7Var2.b : null;
                        if (num == null) {
                            ff3Var4 = ff3Var5;
                            i6 = 0;
                            ff3Var = ff3Var4;
                            lv1Var = lv1Var3;
                            f50Var = f50Var12;
                            td4.y(i6, 48, 12, av8Var5, l2, null, false);
                            str2 = iy7Var.b;
                            if (str2 == null) {
                                str2 = "";
                            }
                            yf8 yf8Var = xth.a;
                            zg3Var2 = zg3Var;
                            hy7Var = hy7Var2;
                            bx7Var = bx7Var2;
                            f50Var2 = f50Var11;
                            str = "";
                            f50Var3 = f50Var10;
                            ryVar = ryVar4;
                            utcVar = utcVar3;
                            udj.c(str2, null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var5, 0, 0, 131066);
                            av8 av8Var6 = av8Var5;
                            av8Var6.s(true);
                            z4 = false;
                            av8Var6.s(false);
                            av8Var2 = av8Var6;
                        }
                    }
                    i6 = num.intValue();
                    ff3Var4 = ff3Var5;
                    ff3Var = ff3Var4;
                    lv1Var = lv1Var3;
                    f50Var = f50Var12;
                    td4.y(i6, 48, 12, av8Var5, l2, null, false);
                    str2 = iy7Var.b;
                    if (str2 == null) {
                    }
                    yf8 yf8Var2 = xth.a;
                    zg3Var2 = zg3Var;
                    hy7Var = hy7Var2;
                    bx7Var = bx7Var2;
                    f50Var2 = f50Var11;
                    str = "";
                    f50Var3 = f50Var10;
                    ryVar = ryVar4;
                    utcVar = utcVar3;
                    udj.c(str2, null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var5, 0, 0, 131066);
                    av8 av8Var62 = av8Var5;
                    av8Var62.s(true);
                    z4 = false;
                    av8Var62.s(false);
                    av8Var2 = av8Var62;
                } else {
                    a99Var = a99Var4;
                    ryVar = ryVar4;
                    bx7Var = bx7Var2;
                    str = "";
                    ff3Var = ff3Var5;
                    lv1Var = lv1Var3;
                    f50Var = f50Var12;
                    f50Var2 = f50Var11;
                    utcVar = utcVar3;
                    f50Var3 = f50Var10;
                    zg3Var2 = zg3Var;
                    hy7Var = hy7Var2;
                    z4 = false;
                    av8Var5.d0(-507869305);
                    av8Var5.s(false);
                    av8Var2 = av8Var5;
                }
                if (z10) {
                    av8Var2.d0(-507785047);
                    xtc c02 = l98.c0(n9e.q(wnn.A(utcVar, o7g.a(24.0f)), lz.D(com.sofascore.results.R.color.on_color_highlight_1, av8Var2), jf9Var2), 8.0f, 6.0f);
                    lv1 lv1Var4 = lv1Var;
                    l8g a6 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var4, av8Var2, 54);
                    int hashCode5 = Long.hashCode(av8Var2.T);
                    aee m6 = av8Var2.m();
                    xtc C5 = fqj.C(av8Var2, c02);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a6, f50Var3);
                    ff3 ff3Var6 = ff3Var;
                    waa.K(av8Var2, m6, ff3Var6);
                    ry ryVar5 = ryVar;
                    bf3.s(hashCode5, av8Var2, f50Var2, av8Var2, ryVar5);
                    f50 f50Var13 = f50Var;
                    waa.K(av8Var2, C5, f50Var13);
                    xtc l3 = bkh.l(utcVar, 20.0f);
                    bx7 bx7Var3 = bx7Var;
                    fy7 fy7Var = bx7Var3.g;
                    ff3Var2 = ff3Var6;
                    f50Var5 = f50Var13;
                    ryVar2 = ryVar5;
                    lv1Var2 = lv1Var4;
                    td4.G(fy7Var != null ? fy7Var.a : z4, l3, false, 0L, av8Var2, 48, 12);
                    Context context = (Context) av8Var2.k(nz.b);
                    boolean g2 = av8Var2.g(bx7Var3.l);
                    Object O2 = av8Var2.O();
                    if (g2) {
                        a99Var3 = a99Var;
                    } else {
                        a99Var3 = a99Var;
                        if (O2 != a99Var3) {
                            String str3 = (String) ((cdi) O2).getValue();
                            yf8 yf8Var3 = xth.a;
                            av8 av8Var7 = av8Var2;
                            f50Var6 = f50Var3;
                            f50Var4 = f50Var2;
                            a99Var2 = a99Var3;
                            z5 = false;
                            udj.c(str3, null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var7, 0, 0, 131066);
                            xtc l4 = bkh.l(utcVar, 20.0f);
                            fy7 fy7Var2 = bx7Var3.h;
                            av8 av8Var8 = av8Var7;
                            td4.G(fy7Var2 == null ? fy7Var2.a : 0, l4, false, 0L, av8Var8, 48, 12);
                            av8Var8.s(true);
                            av8Var8.s(false);
                            av8Var3 = av8Var8;
                        }
                    }
                    O2 = goh.b(new j4(10, context, y80Var));
                    av8Var2.n0(O2);
                    String str32 = (String) ((cdi) O2).getValue();
                    yf8 yf8Var32 = xth.a;
                    av8 av8Var72 = av8Var2;
                    f50Var6 = f50Var3;
                    f50Var4 = f50Var2;
                    a99Var2 = a99Var3;
                    z5 = false;
                    udj.c(str32, null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var72, 0, 0, 131066);
                    xtc l42 = bkh.l(utcVar, 20.0f);
                    fy7 fy7Var22 = bx7Var3.h;
                    av8 av8Var82 = av8Var72;
                    td4.G(fy7Var22 == null ? fy7Var22.a : 0, l42, false, 0L, av8Var82, 48, 12);
                    av8Var82.s(true);
                    av8Var82.s(false);
                    av8Var3 = av8Var82;
                } else {
                    f50Var4 = f50Var2;
                    a99Var2 = a99Var;
                    ryVar2 = ryVar;
                    ff3Var2 = ff3Var;
                    f50Var5 = f50Var;
                    lv1Var2 = lv1Var;
                    f50Var6 = f50Var3;
                    z5 = z4;
                    av8Var2.d0(-506280121);
                    av8Var2.s(z5);
                    av8Var3 = av8Var2;
                }
                if (z11) {
                    av8Var3.d0(-506162631);
                    xtc c03 = l98.c0(n9e.q(wnn.A(utcVar, o7g.a(24.0f)), lz.D(com.sofascore.results.R.color.on_color_highlight_1, av8Var3), jf9Var2), 12.0f, 8.0f);
                    lv1 lv1Var5 = lv1Var2;
                    l8g a7 = k8g.a(new ng0(4.0f, true, new a70(6)), lv1Var5, av8Var3, 54);
                    int hashCode6 = Long.hashCode(av8Var3.T);
                    aee m7 = av8Var3.m();
                    xtc C6 = fqj.C(av8Var3, c03);
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var2);
                    } else {
                        av8Var3.q0();
                    }
                    f50 f50Var14 = f50Var6;
                    waa.K(av8Var3, a7, f50Var14);
                    ff3 ff3Var7 = ff3Var2;
                    waa.K(av8Var3, m7, ff3Var7);
                    ry ryVar6 = ryVar2;
                    bf3.s(hashCode6, av8Var3, f50Var4, av8Var3, ryVar6);
                    f50 f50Var15 = f50Var5;
                    waa.K(av8Var3, C6, f50Var15);
                    xtc l5 = bkh.l(utcVar, 16.0f);
                    hy7 hy7Var3 = hy7Var;
                    Integer num2 = hy7Var3.b;
                    String str4 = hy7Var3.e;
                    td4.i(num2, l5, av8Var3, 48);
                    String str5 = hy7Var3.d;
                    yf8 yf8Var4 = xth.a;
                    av8 av8Var9 = av8Var3;
                    utc utcVar4 = utcVar;
                    f50 f50Var16 = f50Var4;
                    f50Var9 = f50Var14;
                    udj.c(str5, null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var9, 0, 24960, 110586);
                    av8Var9.s(true);
                    xtc c04 = l98.c0(n9e.q(wnn.A(l98.f0(utcVar4, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), o7g.a(24.0f)), lz.D(com.sofascore.results.R.color.on_color_highlight_1, av8Var9), jf9Var2), 12.0f, 8.0f);
                    l8g a8 = k8g.a(new ng0(4.0f, true, new a70(6)), lv1Var5, av8Var9, 54);
                    int hashCode7 = Long.hashCode(av8Var9.T);
                    aee m8 = av8Var9.m();
                    xtc C7 = fqj.C(av8Var9, c04);
                    av8Var9.h0();
                    if (av8Var9.S) {
                        av8Var9.l(zg3Var2);
                    } else {
                        av8Var9.q0();
                    }
                    waa.K(av8Var9, a8, f50Var9);
                    ff3Var3 = ff3Var7;
                    waa.K(av8Var9, m8, ff3Var3);
                    bf3.s(hashCode7, av8Var9, f50Var16, av8Var9, ryVar6);
                    waa.K(av8Var9, C7, f50Var15);
                    ryVar3 = ryVar6;
                    f50Var8 = f50Var15;
                    td4.F(hy7Var3.a, hy7Var3.c, hy7Var3.b, bkh.l(utcVar4, 16.0f), 0L, av8Var9, 3072);
                    Context context2 = (Context) av8Var9.k(nz.b);
                    boolean g3 = av8Var9.g(str4);
                    Object O3 = av8Var9.O();
                    if (g3 || O3 == a99Var2) {
                        long j2 = hy7Var3.f;
                        bi4 bi4Var = bi4.PATTERN_Y;
                        ConcurrentHashMap concurrentHashMap = hk4.a;
                        String i10 = fc6.i(j2, hk4.a(bi4Var.d()));
                        O3 = context2.getString(com.sofascore.results.R.string.bullet_separator, c.r(str4, " ".concat(i10), str, false), i10);
                        av8Var9.n0(O3);
                    }
                    String str6 = (String) O3;
                    str6.getClass();
                    f2 = 8.0f;
                    jf9Var = jf9Var2;
                    f50Var7 = f50Var16;
                    utcVar2 = utcVar4;
                    i4 = 6;
                    udj.c(str6, null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var9), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var9, 0, 24960, 110586);
                    av8 av8Var10 = av8Var9;
                    r5 = 1;
                    av8Var10.s(true);
                    av8Var10.s(false);
                    r10 = av8Var10;
                } else {
                    boolean z13 = z5;
                    f50Var7 = f50Var4;
                    ff3Var3 = ff3Var2;
                    ryVar3 = ryVar2;
                    f50Var8 = f50Var5;
                    i4 = 6;
                    r5 = 1;
                    f2 = 8.0f;
                    jf9Var = jf9Var2;
                    utcVar2 = utcVar;
                    f50Var9 = f50Var6;
                    av8Var3.d0(-503627513);
                    av8Var3.s(z13);
                    r10 = av8Var3;
                }
                r10.s(r5);
                r10.s(r5);
                y80Var2 = y80Var;
                if (y80Var2.q.size() <= r5) {
                    z6 = r5;
                } else if (z7) {
                    z6 = true;
                } else {
                    r10.d0(-396229201);
                    float f4 = f2;
                    xtc f0 = l98.f0(bkh.d(utcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    l8g a9 = k8g.a(ww9.f, uxf.l, r10, i4);
                    int hashCode8 = Long.hashCode(r10.T);
                    aee m9 = r10.m();
                    xtc C8 = fqj.C(r10, f0);
                    r10.h0();
                    if (r10.S) {
                        r10.l(zg3Var2);
                    } else {
                        r10.q0();
                    }
                    waa.K(r10, a9, f50Var9);
                    waa.K(r10, m9, ff3Var3);
                    bf3.s(hashCode8, r10, f50Var7, r10, ryVar3);
                    waa.K(r10, C8, f50Var8);
                    r10.d0(285038279);
                    int n2 = a6eVar.n();
                    for (int i11 = 0; i11 < n2; i11++) {
                        if (a6eVar.k() == i11) {
                            i5 = 0;
                            f3 = ljg.f(r10, 1893904937, com.sofascore.results.R.color.primary_default, r10, false);
                        } else {
                            i5 = 0;
                            f3 = ljg.f(r10, 1893905739, com.sofascore.results.R.color.primary_default_40, r10, false);
                        }
                        e12.a(i5, r10, bkh.l(n9e.q(wnn.A(l98.b0(utcVar2, 4.0f), o7g.a), f3, jf9Var), f4));
                    }
                    z6 = true;
                    ljg.t(r10, false, true, false);
                    r10.s(z6);
                    z3 = z7;
                    av8Var = r10;
                }
                r10.d0(-395569955);
                r10.s(false);
                r10.s(z6);
                z3 = z7;
                av8Var = r10;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new x80(i2, i3, 0, y80Var2, a6eVar, z3);
                return;
            }
            return;
        }
        z2 = z;
        if (av8Var4.T(i7 & 1, (i7 & 147) == 146)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(final y80 y80Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(2108270969);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(y80Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            int i6 = i3 & 14;
            boolean z = i6 == 4;
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new v80(y80Var, i4);
                av8Var2.n0(O);
            }
            final pr4 b2 = c6e.b(0, (Function0) O, av8Var2, 6, 2);
            int i7 = y80Var.g;
            x43 x43Var = y80Var.o;
            String str = y80Var.h;
            String str2 = y80Var.i;
            tc3 H = yqo.H(-1817341221, av8Var2, new ct8() { // from class: w80
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = i4;
                    v23 v23Var = (v23) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i8) {
                        case 0:
                            v23Var.getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                ao2.a(y80Var, b2, false, av8Var3, 0, 4);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            v23Var.getClass();
                            av8 av8Var4 = (av8) of3Var2;
                            if (av8Var4.T(intValue & 1, (intValue & 17) != 16)) {
                                ao2.a(y80Var, b2, true, av8Var4, 384, 0);
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            tc3 H2 = yqo.H(781602716, av8Var2, new ct8() { // from class: w80
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = i5;
                    v23 v23Var = (v23) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i8) {
                        case 0:
                            v23Var.getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                ao2.a(y80Var, b2, false, av8Var3, 0, 4);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            v23Var.getClass();
                            av8 av8Var4 = (av8) of3Var2;
                            if (av8Var4.T(intValue & 1, (intValue & 17) != 16)) {
                                ao2.a(y80Var, b2, true, av8Var4, 384, 0);
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            boolean z2 = ((i3 & 112) == 32) | (i6 == 4);
            Object O2 = av8Var2.O();
            if (z2 || O2 == a99Var) {
                O2 = new j4(9, function1, y80Var);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i7, x43Var, xtcVar, null, null, null, H, H2, str, str2, false, false, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, (Function0) O2, null, av8Var, (i3 & 896) | 14155776, ((i3 << 15) & 3670016) | 224304, 267320);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(y80Var, function1, xtcVar, i2, 1);
        }
    }

    public static final void c(String str, String str2, Function0 function0, xtc xtcVar, Function0 function02, of3 of3Var, int i2) {
        str.getClass();
        str2.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(609855561);
        int i3 = (av8Var.g(str) ? 4 : 2) | i2 | (av8Var.g(str2) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        int i4 = i3 | (av8Var.i(function02) ? 16384 : 8192);
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            un0.a(xtcVar, o7g.a(16.0f), rd0.t(lz.D(com.sofascore.results.R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(-1426225477, av8Var, new r52(str, str2, function0, function02, 0)), av8Var, ((i4 >> 9) & 14) | 196608, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(str, str2, function0, xtcVar, function02, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x025e, code lost:
    
        if (r5 == r2) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, int i2, boolean z, boolean z2, Function0 function0, xtc xtcVar, of3 of3Var, int i3) {
        xtc xtcVar2;
        av8 av8Var;
        Function0 function02;
        Object obj;
        float f2;
        boolean z3;
        av8 av8Var2;
        ?? r0;
        fantasyRoundPlayerUiModel.getClass();
        function0.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-701410094);
        int i4 = 2;
        int i5 = i3 | (av8Var3.g(fantasyRoundPlayerUiModel) ? 4 : 2) | (av8Var3.e(i2) ? 32 : 16) | (av8Var3.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var3.h(z2) ? a.o : 1024) | (av8Var3.i(function0) ? 16384 : 8192) | 196608;
        if (av8Var3.T(i5 & 1, (i5 & 74899) != 74898)) {
            Context context = (Context) av8Var3.k(nz.b);
            boolean i6 = ((i5 & 14) == 4) | av8Var3.i(context) | ((i5 & 112) == 32);
            Object O = av8Var3.O();
            Object obj2 = nf3.a;
            if (i6 || O == obj2) {
                O = new hp5(context, i2, i4, fantasyRoundPlayerUiModel);
                av8Var3.n0(O);
            }
            Function0 function03 = (Function0) O;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var3, 0);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C = fqj.C(av8Var3, f0);
            if3.k7.getClass();
            Function0 function04 = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(function04);
            } else {
                av8Var3.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var3, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var3, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var3, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var3, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var3, C, f50Var3);
            xtc d0 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var3, 48);
            int hashCode2 = Long.hashCode(av8Var3.T);
            aee m3 = av8Var3.m();
            xtc C2 = fqj.C(av8Var3, d0);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(function04);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a3, f50Var);
            waa.K(av8Var3, m3, ff3Var);
            bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar);
            waa.K(av8Var3, C2, f50Var3);
            wnn.l(fantasyRoundPlayerUiModel.a, fantasyRoundPlayerUiModel.h, z2, bkh.l(utcVar, 64.0f), fantasyRoundPlayerUiModel.b.b, 24.0f, false, function03, av8Var3, ((i5 >> 3) & 896) | 199680, 64);
            nq8.h(av8Var3, bkh.p(utcVar, 16.0f));
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            u23 a4 = t23.a(p4hVar, kv1Var, av8Var3, 0);
            int hashCode3 = Long.hashCode(av8Var3.T);
            aee m4 = av8Var3.m();
            xtc C3 = fqj.C(av8Var3, goaVar);
            av8Var3.h0();
            if (av8Var3.S) {
                function02 = function04;
                av8Var3.l(function02);
            } else {
                function02 = function04;
                av8Var3.q0();
            }
            waa.K(av8Var3, a4, f50Var);
            waa.K(av8Var3, m4, ff3Var);
            bf3.s(hashCode3, av8Var3, f50Var2, av8Var3, ryVar);
            waa.K(av8Var3, C3, f50Var3);
            l8g a5 = k8g.a(wxfVar, lv1Var, av8Var3, 48);
            int hashCode4 = Long.hashCode(av8Var3.T);
            aee m5 = av8Var3.m();
            xtc C4 = fqj.C(av8Var3, utcVar);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(function02);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a5, f50Var);
            waa.K(av8Var3, m5, ff3Var);
            bf3.s(hashCode4, av8Var3, f50Var2, av8Var3, ryVar);
            waa.K(av8Var3, C4, f50Var3);
            String str = fantasyRoundPlayerUiModel.g.f;
            yf8 yf8Var = xth.a;
            dfj i7 = xth.i();
            long D = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var3);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc A = wnn.A(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), o7g.a(4.0f));
            boolean g2 = av8Var3.g(function03);
            Object O2 = av8Var3.O();
            if (g2) {
                obj = obj2;
            } else {
                obj = obj2;
            }
            O2 = new v61(21, function03);
            av8Var3.n0(O2);
            udj.c(str, tol.y(A, false, false, false, 0L, null, (Function0) O2, av8Var3, 31), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, i7, av8Var3, 0, 24960, 110584);
            av8 av8Var4 = av8Var3;
            if (fantasyRoundPlayerUiModel.m) {
                f2 = 4.0f;
                ljg.r(4.0f, -1020518639, av8Var4, av8Var4, utcVar);
                z3 = false;
                kq9.a(haa.t(com.sofascore.results.R.drawable.ic_captain, 0, av8Var4), null, bkh.l(utcVar, 24.0f), r13.i, av8Var4, 3512, 0);
                av8Var4.s(false);
            } else {
                f2 = 4.0f;
                z3 = false;
                av8Var4.d0(-1020139044);
                av8Var4.s(false);
            }
            av8Var4.s(true);
            String str2 = fantasyRoundPlayerUiModel.i;
            if (!z2) {
                str2 = null;
            }
            String f02 = CollectionsKt.f0(ph0.x(new String[]{str2, fantasyRoundPlayerUiModel.p != null ? fantasyRoundPlayerUiModel.o : null}), " · ", null, null, null, 62);
            if (f02.length() > 0) {
                av8Var4.d0(810251017);
                nq8.h(av8Var4, bkh.e(utcVar, f2));
                boolean z4 = z3;
                udj.c(f02, null, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var4), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var4, 0, 24960, 110586);
                av8 av8Var5 = av8Var4;
                av8Var5.s(z4);
                r0 = z4;
                av8Var2 = av8Var5;
            } else {
                boolean z5 = z3;
                av8Var4.d0(810611392);
                av8Var4.s(z5);
                r0 = z5;
                av8Var2 = av8Var4;
            }
            av8Var2.s(true);
            if (z) {
                ljg.r(16.0f, -1280543016, av8Var2, av8Var2, utcVar);
                ImageVector N = s6a.N(com.sofascore.results.R.drawable.ic_compare_players, 6, av8Var2);
                long D2 = lz.D(com.sofascore.results.R.color.primary_default, av8Var2);
                xtc A2 = wnn.A(n9e.q(bkh.l(utcVar, 40.0f), lz.D(com.sofascore.results.R.color.surface_2, av8Var2), o7g.a(8.0f)), o7g.a(8.0f));
                boolean z6 = (i5 & 57344) == 16384 ? true : r0;
                Object O3 = av8Var2.O();
                if (z6 || O3 == obj) {
                    O3 = new v61(22, function0);
                    av8Var2.n0(O3);
                }
                kq9.b(N, null, l98.b0(tol.y(A2, false, false, false, 0L, null, (Function0) O3, av8Var2, 31), 8.0f), D2, av8Var2, 48, 0);
                av8Var2.s(r0);
            } else {
                av8Var2.d0(-1279929898);
                av8Var2.s(r0);
            }
            bf3.t(av8Var2, true, utcVar, 8.0f, av8Var2);
            FantasyPlayerMissingData fantasyPlayerMissingData = fantasyRoundPlayerUiModel.l;
            if (fantasyPlayerMissingData == null) {
                av8Var2.d0(-1818544107);
                av8Var2.s(r0);
            } else {
                av8Var2.d0(-1818544106);
                j(fantasyPlayerMissingData, l98.c0(utcVar, 16.0f, 8.0f), av8Var2, r0);
                Unit unit = Unit.a;
                av8Var2.s(r0);
            }
            av8Var2.s(true);
            xtcVar2 = utcVar;
            av8Var = av8Var2;
        } else {
            av8Var3.W();
            xtcVar2 = xtcVar;
            av8Var = av8Var3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dt2(fantasyRoundPlayerUiModel, i2, z, z2, function0, xtcVar2, i3);
        }
    }

    public static final void e(ec7 ec7Var, Function0 function0, boolean z, of3 of3Var, int i2) {
        float f2;
        float f3;
        ec7 ec7Var2 = ec7Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1579085071);
        int i3 = i2 | (av8Var.i(ec7Var2) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(l98.f0(hkg.u0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.surface_P, av8Var), oyn.e), hkg.o0(av8Var), false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            String v = oea.v(com.sofascore.results.R.string.fantasy_optimise_your_lineup_text_1, av8Var);
            long D = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131066);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            int i4 = ec7Var.e;
            udj.c(oea.t(com.sofascore.results.R.plurals.fantasy_optimise_your_lineup_text_2, i4, new Object[]{Integer.valueOf(i4)}, av8Var), null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131066);
            udj.c(bf3.g(24.0f, com.sofascore.results.R.string.substitutions, av8Var, av8Var, utcVar), null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var, 0, 24960, 110586);
            av8 av8Var2 = av8Var;
            nq8.h(av8Var2, bkh.e(utcVar, 16.0f));
            m6k.i(0, av8Var2, null);
            nq8.h(av8Var2, bkh.e(utcVar, 8.0f));
            av8Var2.d0(694148442);
            Iterator it = ec7Var.b.iterator();
            while (it.hasNext()) {
                o1j.g((FantasyTransferPlayers) it.next(), z, null, FantasyCompetitionType.WEEKLY, null, av8Var2, ((i3 >> 3) & 112) | 3072, 20);
            }
            av8Var2.s(false);
            FantasyTransferPlayers fantasyTransferPlayers = ec7Var.c;
            if (fantasyTransferPlayers == null) {
                av8Var2.d0(44053740);
                av8Var2.s(false);
                f3 = 24.0f;
                f2 = 16.0f;
            } else {
                bf3.r(24.0f, 44053741, av8Var2, av8Var2, utcVar);
                String v2 = oea.v(com.sofascore.results.R.string.captain, av8Var2);
                long D2 = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var2);
                yf8 yf8Var2 = xth.a;
                f2 = 16.0f;
                udj.c(v2, null, D2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var2, 0, 24960, 110586);
                av8Var2 = av8Var2;
                nq8.h(av8Var2, bkh.e(utcVar, 16.0f));
                o1j.g(fantasyTransferPlayers, z, null, FantasyCompetitionType.WEEKLY, null, av8Var2, ((i3 >> 3) & 112) | 3072, 20);
                Unit unit = Unit.a;
                av8Var2.s(false);
                f3 = 24.0f;
            }
            nq8.h(av8Var2, bkh.e(utcVar, f3));
            av8 av8Var3 = av8Var2;
            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 15, 0L, 0L, av8Var3, null);
            xtc f4 = vxd.f(utcVar, f3, av8Var3, utcVar, 1.0f);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var3, 48);
            int hashCode2 = Long.hashCode(av8Var3.T);
            aee m3 = av8Var3.m();
            xtc C2 = fqj.C(av8Var3, f4);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var2);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a3, hf3.g);
            waa.K(av8Var3, m3, hf3.f);
            waa.K(av8Var3, Integer.valueOf(hashCode2), hf3.j);
            waa.J(av8Var3, hf3.k);
            goa g2 = ljg.g(av8Var3, C2, hf3.d, 1.0f, true);
            String v3 = oea.v(com.sofascore.results.R.string.fantasy_total_expected_fantasy_points_increase, av8Var3);
            long D3 = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var3);
            yf8 yf8Var3 = xth.a;
            udj.c(v3, g2, D3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var3, 0, 24960, 110584);
            nq8.h(av8Var3, bkh.p(utcVar, f2));
            ec7Var2 = ec7Var;
            float floatValue = ec7Var2.d.floatValue();
            context.getClass();
            udj.c("+".concat(String.format(dla.d(), "%.1f %s", Arrays.copyOf(new Object[]{Float.valueOf(floatValue), context.getString(com.sofascore.results.R.string.fantasy_expected_fantasy_points_short)}, 2))), null, lz.D(com.sofascore.results.R.color.success, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.i(), av8Var3, 0, 24960, 110586);
            bf3.t(av8Var3, true, utcVar, 24.0f, av8Var3);
            mha.h(oea.v(com.sofascore.results.R.string.fantasy_optimise_lineup_button, av8Var3), function0, bkh.d(utcVar, 1.0f), null, null, false, false, false, 0L, 0, 0, av8Var3, (i3 & 112) | 384, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            av8Var = av8Var3;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60(ec7Var2, function0, z, i2, 8);
        }
    }

    public static final void f(gc7 gc7Var, pu6 pu6Var, Function0 function0, Function0 function02, Function0 function03, of3 of3Var, int i2) {
        av8 av8Var;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2647542);
        int i3 = i2 | (av8Var2.i(gc7Var) ? 4 : 2) | (av8Var2.i(pu6Var) ? 32 : 16) | (av8Var2.i(function0) ? 256 : 128) | (av8Var2.i(function02) ? 2048 : 1024) | (av8Var2.i(function03) ? 16384 : 8192);
        if (av8Var2.T(i3 & 1, (i3 & 9363) != 9362)) {
            Context context = (Context) av8Var2.k(nz.b);
            nn2 nn2Var = gc7Var.j;
            boolean i4 = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | av8Var2.i(pu6Var) | ((i3 & 896) == 256);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i4 || O == a99Var) {
                l50 l50Var = new l50(function03, function02, pu6Var, function0, 19);
                av8Var2.n0(l50Var);
                O = l50Var;
            }
            av8Var = av8Var2;
            w1a.c(nn2Var, null, (Function1) O, av8Var, 0, 14);
            ec7 ec7Var = (ec7) ((eoh) gc7Var.h).getValue();
            boolean z = pu6Var.m().c.A;
            boolean i5 = av8Var.i(context) | av8Var.i(gc7Var);
            Object O2 = av8Var.O();
            if (i5 || O2 == a99Var) {
                O2 = new n37(8, context, gc7Var);
                av8Var.n0(O2);
            }
            e(ec7Var, (Function0) O2, z, av8Var, 0);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere(gc7Var, pu6Var, function0, function02, function03, i2, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(Function0 function0, xtc xtcVar, boolean z, hq9 hq9Var, uah uahVar, Function2 function2, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar2;
        int i5;
        boolean z2;
        hq9 hq9Var2;
        uah uahVar2;
        boolean z3;
        hq9 hq9Var3;
        uah uahVar3;
        eqf u;
        hq9 hq9Var4;
        xtc xtcVar3;
        hq9 hq9Var5;
        boolean z4;
        uah b2;
        int i6;
        int i7;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1413012038);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.i(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                z2 = z;
                i4 |= av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        hq9Var2 = hq9Var;
                        if (av8Var.g(hq9Var2)) {
                            i7 = a.o;
                            i4 |= i7;
                        }
                    } else {
                        hq9Var2 = hq9Var;
                    }
                    i7 = 1024;
                    i4 |= i7;
                } else {
                    hq9Var2 = hq9Var;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i4 |= av8Var.g(null) ? 16384 : 8192;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        uahVar2 = uahVar;
                        if (av8Var.g(uahVar2)) {
                            i6 = 131072;
                            i4 |= i6;
                        }
                    } else {
                        uahVar2 = uahVar;
                    }
                    i6 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i4 |= i6;
                } else {
                    uahVar2 = uahVar;
                }
                if ((1572864 & i2) == 0) {
                    i4 |= av8Var.i(function2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                if (av8Var.T(i4 & 1, (599187 & i4) != 599186)) {
                    av8Var.Y();
                    if ((i2 & 1) == 0 || av8Var.B()) {
                        xtc xtcVar4 = i8 != 0 ? utc.a : xtcVar2;
                        boolean z5 = i5 == 0 ? z2 : true;
                        if ((i3 & 8) != 0) {
                            hq9Var4 = z8e.L(av8Var);
                            i4 &= -7169;
                        } else {
                            hq9Var4 = hq9Var2;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            xtcVar3 = xtcVar4;
                            hq9Var5 = hq9Var4;
                            z4 = z5;
                            b2 = ech.b(qlh.a, av8Var);
                            av8Var.t();
                            int i9 = i4 << 3;
                            i(xtcVar3, function0, z4, b2, hq9Var5, function2, av8Var, ((i4 >> 3) & 14) | (i9 & 112) | (i4 & 896) | ((i4 >> 6) & 7168) | (57344 & i9) | (i9 & 458752) | (i4 & 3670016));
                            xtcVar2 = xtcVar3;
                            z3 = z4;
                            uahVar3 = b2;
                            hq9Var3 = hq9Var5;
                        } else {
                            xtcVar3 = xtcVar4;
                            hq9Var5 = hq9Var4;
                            z4 = z5;
                        }
                    } else {
                        av8Var.W();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        xtcVar3 = xtcVar2;
                        z4 = z2;
                        hq9Var5 = hq9Var2;
                    }
                    b2 = uahVar2;
                    av8Var.t();
                    int i92 = i4 << 3;
                    i(xtcVar3, function0, z4, b2, hq9Var5, function2, av8Var, ((i4 >> 3) & 14) | (i92 & 112) | (i4 & 896) | ((i4 >> 6) & 7168) | (57344 & i92) | (i92 & 458752) | (i4 & 3670016));
                    xtcVar2 = xtcVar3;
                    z3 = z4;
                    uahVar3 = b2;
                    hq9Var3 = hq9Var5;
                } else {
                    av8Var.W();
                    z3 = z2;
                    hq9Var3 = hq9Var2;
                    uahVar3 = uahVar2;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new vr5(function0, xtcVar2, z3, hq9Var3, uahVar3, function2, i2, i3, 2);
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 3072) == 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if (av8Var.T(i4 & 1, (599187 & i4) != 599186)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i2 & 3072) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if (av8Var.T(i4 & 1, (599187 & i4) != 599186)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void h(Function0 function0, xtc xtcVar, boolean z, hq9 hq9Var, Function2 function2, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        Function2 function22;
        Function0 function02;
        hq9 hq9Var2;
        boolean z2;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2096213317);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i5 = i3 | 1408;
        }
        int i6 = i5 | 24576;
        if ((196608 & i2) == 0) {
            i6 |= av8Var.i(function2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        boolean z3 = true;
        if (av8Var.T(i6 & 1, (74899 & i6) != 74898)) {
            av8Var.Y();
            if ((i2 & 1) == 0 || av8Var.B()) {
                hq9Var = z8e.L(av8Var);
                i4 = i6 & (-7169);
            } else {
                av8Var.W();
                i4 = i6 & (-7169);
                z3 = z;
            }
            hq9 hq9Var3 = hq9Var;
            av8Var.t();
            xtcVar2 = xtcVar;
            g(function0, xtcVar2, z3, hq9Var3, ech.b(qlh.a, av8Var), function2, av8Var, (65534 & i4) | ((i4 << 3) & 3670016), 0);
            function02 = function0;
            function22 = function2;
            z2 = z3;
            hq9Var2 = hq9Var3;
        } else {
            xtcVar2 = xtcVar;
            function22 = function2;
            function02 = function0;
            av8Var.W();
            hq9Var2 = hq9Var;
            z2 = z;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ki4(function02, xtcVar2, z2, hq9Var2, function22, i2);
        }
    }

    public static final void i(xtc xtcVar, Function0 function0, boolean z, uah uahVar, hq9 hq9Var, Function2 function2, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1134296466);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(uahVar) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.g(hq9Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var.g(null) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= av8Var.i(function2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i4 = i3;
        if (av8Var.T(i4 & 1, (599187 & i4) != 599186)) {
            av8Var.d0(977045485);
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            av8Var.s(false);
            ye9 ye9Var = l7a.a;
            xtc z2 = xtcVar.z(yjc.a);
            float f2 = qlh.b;
            long i5 = hz8.i(qlh.c + f2 + f2, 40.0f);
            g28 g28Var = bkh.a;
            xtc G = u6h.G(oyn.u(n9e.q(wnn.A(bkh.m(z2, s75.b(i5), s75.a(i5)), uahVar), z ? hq9Var.a : hq9Var.c, uahVar), wzcVar, n5g.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false), z, null, new u5g(0), function0, 8));
            k1c c2 = e12.c(uxf.g, false);
            int G2 = z8e.G(av8Var);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, G);
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
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G2))) {
                mz1.t(G2, av8Var, G2, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            tol.b(lo3.a.a(new r13(z ? hq9Var.b : hq9Var.d)), function2, av8Var, ((i4 >> 15) & 112) | 8);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hp1(xtcVar, function0, z, uahVar, hq9Var, function2, i2, 4);
        }
    }

    public static final void j(FantasyPlayerMissingData fantasyPlayerMissingData, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        int i4;
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-180732197);
        int i6 = i2 | (av8Var.g(fantasyPlayerMissingData) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i6 & 1, (i6 & 19) != 18)) {
            sd7 sd7Var = fantasyPlayerMissingData.a;
            String str = fantasyPlayerMissingData.c;
            rd7 rd7Var = fantasyPlayerMissingData.b;
            long D = lz.D(sd7Var.b, av8Var);
            lv1 lv1Var = uxf.m;
            kg0 kg0Var = ww9.f;
            xtc d2 = bkh.d(xtcVar, 1.0f);
            n7g a2 = o7g.a(8.0f);
            int ordinal = sd7Var.ordinal();
            String str2 = sd7Var.a;
            if (ordinal == 0) {
                i4 = -1884933127;
                i5 = com.sofascore.results.R.color.sentiment_neutral_highlight;
            } else {
                if (ordinal != 1) {
                    throw dmi.h(av8Var, -1884935607, false);
                }
                i4 = -1884930355;
                i5 = com.sofascore.results.R.color.live_highlight;
            }
            xtc c0 = l98.c0(n9e.q(d2, ljg.f(av8Var, i4, i5, av8Var, false), a2), 16.0f, 4.0f);
            l8g a3 = k8g.a(kg0Var, lv1Var, av8Var, 54);
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
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            int i7 = rd7Var.a;
            int i8 = rd7Var.a;
            ImageVector N = s6a.N(wib.s(i7), 6, av8Var);
            long j2 = wib.v(i8) ? D : r13.i;
            utc utcVar = utc.a;
            kq9.b(N, null, bkh.l(utcVar, 24.0f), j2, av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            String v = oea.v(wib.t(i8, com.sofascore.results.R.string.player_unavailable, str2, str), av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            Integer h2 = (str2.equals("doubtful") || i8 == 1 || i8 == 2) ? wib.h(str) : null;
            if (h2 == null) {
                av8Var.d0(1107960934);
                i3 = 0;
                av8Var.s(false);
            } else {
                i3 = 0;
                av8Var.d0(1107960935);
                int intValue = h2.intValue();
                fz8.j(6, 0, D, av8Var, l98.d0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2));
                udj.c(oea.v(intValue, av8Var), new goa(1.0f, false), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110584);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            i3 = 0;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(fantasyPlayerMissingData, xtcVar, i2, i3);
        }
    }

    public static final void k(final sn3 sn3Var, final WeeklyChallengeViewModel weeklyChallengeViewModel, final Function0 function0, final Function0 function02, final Function1 function1, final Function0 function03, final Function0 function04, final Function1 function12, final Function0 function05, final Function1 function13, Function0 function06, of3 of3Var, int i2) {
        av8 av8Var;
        Object kujVar;
        Object obj;
        xhf xhfVar;
        ku3 ku3Var;
        Integer num;
        e1d e1dVar;
        WeeklyChallengeViewModel weeklyChallengeViewModel2;
        weeklyChallengeViewModel.getClass();
        function0.getClass();
        function02.getClass();
        function1.getClass();
        function03.getClass();
        function04.getClass();
        function12.getClass();
        function05.getClass();
        function13.getClass();
        function06.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(946583018);
        int i3 = i2 | (av8Var2.i(sn3Var) ? 4 : 2) | (av8Var2.i(weeklyChallengeViewModel) ? 32 : 16) | (av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function02) ? a.o : 1024) | (av8Var2.i(function1) ? 16384 : 8192) | (av8Var2.i(function03) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.i(function04) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.i(function12) ? 8388608 : 4194304) | (av8Var2.i(function05) ? 67108864 : 33554432) | (av8Var2.i(function13) ? 536870912 : 268435456);
        char c2 = av8Var2.i(function06) ? (char) 4 : (char) 2;
        if (av8Var2.T(i3 & 1, ((i3 & 306783379) == 306783378 && (c2 & 3) == 2) ? false : true)) {
            final Context context = (Context) av8Var2.k(nz.b);
            final e1d x = rfo.x(weeklyChallengeViewModel.l, av8Var2, 0);
            final e1d x2 = rfo.x(weeklyChallengeViewModel.s, av8Var2, 0);
            e1d x3 = rfo.x(weeklyChallengeViewModel.u, av8Var2, 0);
            e1d x4 = rfo.x(weeklyChallengeViewModel.w, av8Var2, 0);
            xhf J = x2a.J(av8Var2);
            Object O = av8Var2.O();
            Object obj2 = nf3.a;
            if (O == obj2) {
                O = hz8.G(g.a, av8Var2);
                av8Var2.n0(O);
            }
            ku3 ku3Var2 = (ku3) O;
            Object O2 = av8Var2.O();
            if (O2 == obj2) {
                O2 = new imh();
                av8Var2.n0(O2);
            }
            final imh imhVar = (imh) O2;
            Object O3 = av8Var2.O();
            if (O3 == obj2) {
                O3 = e.f(Boolean.FALSE);
                av8Var2.n0(O3);
            }
            e1d e1dVar2 = (e1d) O3;
            char c3 = c2;
            Integer num2 = (Integer) x4.getValue();
            boolean g2 = av8Var2.g(x4) | ((c3 & 14) == 4) | av8Var2.i(weeklyChallengeViewModel);
            Object O4 = av8Var2.O();
            if (g2 || O4 == obj2) {
                obj = obj2;
                xhfVar = J;
                ku3Var = ku3Var2;
                num = num2;
                e1dVar = e1dVar2;
                kujVar = new kuj(function06, imhVar, weeklyChallengeViewModel, x4, (rq3) null, 9);
                weeklyChallengeViewModel2 = weeklyChallengeViewModel;
                av8Var2.n0(kujVar);
            } else {
                kujVar = O4;
                xhfVar = J;
                weeklyChallengeViewModel2 = weeklyChallengeViewModel;
                obj = obj2;
                num = num2;
                ku3Var = ku3Var2;
                e1dVar = e1dVar2;
            }
            hz8.o(av8Var2, num, (Function2) kujVar);
            boolean i4 = av8Var2.i(weeklyChallengeViewModel2) | av8Var2.i(ku3Var);
            Object O5 = av8Var2.O();
            if (i4 || O5 == obj) {
                O5 = new p6f(weeklyChallengeViewModel2, ku3Var, e1dVar, 1);
                av8Var2.n0(O5);
            }
            Function0 function07 = (Function0) O5;
            boolean z = ((c4l) x3.getValue()).b;
            Object O6 = av8Var2.O();
            if (O6 == obj) {
                O6 = new g0l(12);
                av8Var2.n0(O6);
            }
            un0.f(z, (Function0) O6, false, false, rfo.g, av8Var2, 24624, 12);
            final ku3 ku3Var3 = ku3Var;
            x2a.h(((Boolean) e1dVar.getValue()).booleanValue(), function07, bkh.c, xhfVar, null, yqo.H(1299461809, av8Var2, new ak1(xhfVar, e1dVar, 7)), yqo.H(640395728, av8Var2, new ct8() { // from class: x4l
                @Override // defpackage.ct8
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    x3l x3lVar;
                    boolean z2;
                    of3 of3Var2 = (of3) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    mv1 mv1Var = uxf.g;
                    ((m12) obj3).getClass();
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                        x3l x3lVar2 = (x3l) x.getValue();
                        if (x3lVar2 instanceof u3l) {
                            av8Var3.d0(-215485281);
                            t6a.b(bkh.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, 6, 14);
                            av8Var3.s(false);
                        } else {
                            boolean z3 = x3lVar2 instanceof w3l;
                            final WeeklyChallengeViewModel weeklyChallengeViewModel3 = WeeklyChallengeViewModel.this;
                            final Function0 function08 = function04;
                            Object obj6 = nf3.a;
                            if (z3) {
                                av8Var3.d0(-215156278);
                                boolean booleanValue = ((Boolean) rfo.x(weeklyChallengeViewModel3.A, av8Var3, 0).getValue()).booleanValue();
                                Context context2 = context;
                                if (booleanValue) {
                                    av8Var3.d0(-215210218);
                                    nv.l0(context2, dv.OTHER, bv.WEEKLY_CHALLENGE_JOIN, null);
                                    boolean i5 = av8Var3.i(weeklyChallengeViewModel3);
                                    Object O7 = av8Var3.O();
                                    if (i5 || O7 == obj6) {
                                        O7 = new w4l(weeklyChallengeViewModel3, 2);
                                        av8Var3.n0(O7);
                                    }
                                    sea.a((Function0) O7, av8Var3, 0);
                                    av8Var3.s(false);
                                } else {
                                    av8Var3.d0(-214814286);
                                    av8Var3.s(false);
                                }
                                g28 g28Var = bkh.c;
                                long j2 = r13.h;
                                final w3l w3lVar = (w3l) x3lVar2;
                                tc3 H = yqo.H(170112119, av8Var3, new mfh(21, imhVar, ku3Var3, w3lVar));
                                tc3 H2 = yqo.H(-1238098632, av8Var3, new mfh(20, function0, weeklyChallengeViewModel3, context2));
                                final cdi cdiVar = x2;
                                final sn3 sn3Var2 = sn3Var;
                                final Function0 function09 = function05;
                                final Function1 function14 = function13;
                                final Function0 function010 = function02;
                                final Function1 function15 = function1;
                                final Function0 function011 = function03;
                                q5a.p(g28Var, null, null, H, H2, 0, j2, 0L, null, yqo.H(1981839360, av8Var3, new ct8() { // from class: v4l
                                    @Override // defpackage.ct8
                                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                        a99 a99Var;
                                        p3e p3eVar = (p3e) obj7;
                                        of3 of3Var3 = (of3) obj8;
                                        int intValue2 = ((Integer) obj9).intValue();
                                        p3eVar.getClass();
                                        if ((intValue2 & 6) == 0) {
                                            intValue2 |= ((av8) of3Var3).g(p3eVar) ? 4 : 2;
                                        }
                                        av8 av8Var4 = (av8) of3Var3;
                                        if (av8Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                            u23 a2 = t23.a(ww9.d, uxf.o, av8Var4, 0);
                                            int hashCode = Long.hashCode(av8Var4.T);
                                            aee m2 = av8Var4.m();
                                            xtc C = fqj.C(av8Var4, utc.a);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var4.h0();
                                            if (av8Var4.S) {
                                                av8Var4.l(zg3Var);
                                            } else {
                                                av8Var4.q0();
                                            }
                                            waa.K(av8Var4, a2, hf3.g);
                                            waa.K(av8Var4, m2, hf3.f);
                                            waa.K(av8Var4, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var4, hf3.k);
                                            waa.K(av8Var4, C, hf3.d);
                                            xtc U = td4.U(p3eVar);
                                            w3l w3lVar2 = w3l.this;
                                            boolean g3 = av8Var4.g(w3lVar2);
                                            cdi cdiVar2 = cdiVar;
                                            boolean g4 = g3 | av8Var4.g(cdiVar2);
                                            sn3 sn3Var3 = sn3Var2;
                                            boolean i6 = g4 | av8Var4.i(sn3Var3);
                                            Function0 function012 = function09;
                                            boolean g5 = i6 | av8Var4.g(function012);
                                            Function1 function16 = function14;
                                            boolean g6 = g5 | av8Var4.g(function16);
                                            Function0 function013 = function010;
                                            boolean g7 = g6 | av8Var4.g(function013);
                                            WeeklyChallengeViewModel weeklyChallengeViewModel4 = weeklyChallengeViewModel3;
                                            boolean i7 = g7 | av8Var4.i(weeklyChallengeViewModel4);
                                            Function0 function014 = function08;
                                            boolean g8 = i7 | av8Var4.g(function014);
                                            Object O8 = av8Var4.O();
                                            a99 a99Var2 = nf3.a;
                                            if (g8 || O8 == a99Var2) {
                                                a99Var = a99Var2;
                                                ft2 ft2Var = new ft2(w3lVar2, cdiVar2, sn3Var3, function012, function16, function013, weeklyChallengeViewModel4, function014);
                                                av8Var4.n0(ft2Var);
                                                O8 = ft2Var;
                                            } else {
                                                a99Var = a99Var2;
                                            }
                                            v8a.a(U, null, null, null, null, null, false, null, (Function1) O8, av8Var4, 0, 510);
                                            l3l l3lVar = w3lVar2.a;
                                            Function1 function17 = function15;
                                            boolean g9 = av8Var4.g(function17);
                                            Object O9 = av8Var4.O();
                                            if (g9 || O9 == a99Var) {
                                                O9 = new fuj(2, function17);
                                                av8Var4.n0(O9);
                                            }
                                            Function1 function18 = (Function1) O9;
                                            Function0 function015 = function011;
                                            boolean g10 = av8Var4.g(function015);
                                            Object O10 = av8Var4.O();
                                            if (g10 || O10 == a99Var) {
                                                O10 = new rsd(27, function015);
                                                av8Var4.n0(O10);
                                            }
                                            qea.i(l3lVar, function18, (Function0) O10, null, null, av8Var4, 0, 24);
                                            av8Var4.s(true);
                                        } else {
                                            av8Var4.W();
                                        }
                                        return Unit.a;
                                    }
                                }), av8Var3, 806906886, 422);
                                av8Var3.s(false);
                            } else {
                                if (!(x3lVar2 instanceof v3l)) {
                                    throw dmi.h(av8Var3, 1239980728, false);
                                }
                                av8Var3.d0(-209472056);
                                g28 g28Var2 = bkh.c;
                                u23 a2 = t23.a(ww9.d, uxf.o, av8Var3, 0);
                                int hashCode = Long.hashCode(av8Var3.T);
                                aee m2 = av8Var3.m();
                                xtc C = fqj.C(av8Var3, g28Var2);
                                if3.k7.getClass();
                                zg3 zg3Var = hf3.b;
                                av8Var3.h0();
                                if (av8Var3.S) {
                                    av8Var3.l(zg3Var);
                                } else {
                                    av8Var3.q0();
                                }
                                f50 f50Var = hf3.g;
                                waa.K(av8Var3, a2, f50Var);
                                ff3 ff3Var = hf3.f;
                                waa.K(av8Var3, m2, ff3Var);
                                Integer valueOf = Integer.valueOf(hashCode);
                                f50 f50Var2 = hf3.j;
                                waa.K(av8Var3, valueOf, f50Var2);
                                ry ryVar = hf3.k;
                                waa.J(av8Var3, ryVar);
                                f50 f50Var3 = hf3.d;
                                waa.K(av8Var3, C, f50Var3);
                                boolean g3 = av8Var3.g(x3lVar2);
                                Object O8 = av8Var3.O();
                                if (g3 || O8 == obj6) {
                                    x3lVar = x3lVar2;
                                    O8 = new qdj((v3l) x3lVar2, 18);
                                    av8Var3.n0(O8);
                                } else {
                                    x3lVar = x3lVar2;
                                }
                                v8a.a(null, null, null, null, null, null, false, null, (Function1) O8, av8Var3, 0, 511);
                                av8 av8Var4 = av8Var3;
                                utc utcVar = utc.a;
                                xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                k1c c4 = e12.c(uxf.c, false);
                                int hashCode2 = Long.hashCode(av8Var4.T);
                                aee m3 = av8Var4.m();
                                xtc C2 = fqj.C(av8Var4, f0);
                                av8Var4.h0();
                                if (av8Var4.S) {
                                    av8Var4.l(zg3Var);
                                } else {
                                    av8Var4.q0();
                                }
                                waa.K(av8Var4, c4, f50Var);
                                waa.K(av8Var4, m3, ff3Var);
                                bf3.s(hashCode2, av8Var4, f50Var2, av8Var4, ryVar);
                                waa.K(av8Var4, C2, f50Var3);
                                xtc f02 = l98.f0(g28Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                Object O9 = av8Var4.O();
                                if (O9 == obj6) {
                                    O9 = new nxk(5);
                                    av8Var4.n0(O9);
                                }
                                td4.a((Function1) O9, f02, null, av8Var4, 54, 4);
                                edd eddVar = ((v3l) x3lVar).a;
                                boolean z4 = eddVar instanceof qw0;
                                Function1 function16 = function12;
                                n12 n12Var = n12.a;
                                if (z4) {
                                    av8Var4.d0(-394530861);
                                    xtc a3 = n12Var.a(utcVar, mv1Var);
                                    boolean booleanValue2 = ((Boolean) rfo.x(weeklyChallengeViewModel3.y, av8Var4, 0).getValue()).booleanValue();
                                    long j3 = ((qw0) eddVar).b;
                                    boolean i6 = av8Var4.i(weeklyChallengeViewModel3);
                                    Object O10 = av8Var4.O();
                                    if (i6 || O10 == obj6) {
                                        O10 = new w4l(weeklyChallengeViewModel3, 0);
                                        av8Var4.n0(O10);
                                    }
                                    Function0 function012 = (Function0) O10;
                                    boolean g4 = av8Var4.g(function16);
                                    Object O11 = av8Var4.O();
                                    if (g4 || O11 == obj6) {
                                        O11 = new b4j(6, function16);
                                        av8Var4.n0(O11);
                                    }
                                    hda.b(a3, booleanValue2, j3, function012, (Function0) O11, av8Var4, 0);
                                    av8Var4 = av8Var4;
                                    z2 = false;
                                    av8Var4.s(false);
                                } else if (eddVar instanceof jm5) {
                                    av8Var4.d0(-393749134);
                                    xtc a4 = n12Var.a(utcVar, uxf.d);
                                    jm5 jm5Var = (jm5) eddVar;
                                    long j4 = jm5Var.c;
                                    Object O12 = av8Var4.O();
                                    if (O12 == obj6) {
                                        O12 = new g0l(10);
                                        av8Var4.n0(O12);
                                    }
                                    Function0 function013 = (Function0) O12;
                                    Object O13 = av8Var4.O();
                                    if (O13 == obj6) {
                                        O13 = new g0l(11);
                                        av8Var4.n0(O13);
                                    }
                                    Function0 function014 = (Function0) O13;
                                    boolean g5 = av8Var4.g(function08);
                                    Object O14 = av8Var4.O();
                                    if (g5 || O14 == obj6) {
                                        O14 = new rsd(29, function08);
                                        av8Var4.n0(O14);
                                    }
                                    qea.h(j4, function013, function014, (Function0) O14, a4, true, av8Var4, 197040, 64);
                                    xtc a5 = n12Var.a(utcVar, mv1Var);
                                    mea meaVar = jm5Var.b;
                                    int i7 = jm5Var.d;
                                    int i8 = jm5Var.e;
                                    boolean booleanValue3 = ((Boolean) rfo.x(weeklyChallengeViewModel3.y, av8Var4, 0).getValue()).booleanValue();
                                    boolean i9 = av8Var4.i(weeklyChallengeViewModel3);
                                    Object O15 = av8Var4.O();
                                    int i10 = 3;
                                    if (i9 || O15 == obj6) {
                                        O15 = new w4l(weeklyChallengeViewModel3, i10);
                                        av8Var4.n0(O15);
                                    }
                                    Function0 function015 = (Function0) O15;
                                    boolean g6 = av8Var4.g(function16);
                                    Object O16 = av8Var4.O();
                                    if (g6 || O16 == obj6) {
                                        O16 = new fuj(3, function16);
                                        av8Var4.n0(O16);
                                    }
                                    oea.a(a5, meaVar, i7, i8, booleanValue3, function015, (Function1) O16, av8Var4, 0);
                                    z2 = false;
                                    av8Var4.s(false);
                                } else {
                                    z2 = false;
                                    av8Var4.d0(-392397162);
                                    av8Var4.s(false);
                                }
                                ljg.t(av8Var4, true, true, z2);
                            }
                        }
                    } else {
                        av8Var3.W();
                    }
                    return Unit.a;
                }
            }), av8Var2, 1769856);
            av8Var = av8Var2;
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new w6d(sn3Var, weeklyChallengeViewModel, function0, function02, function1, function03, function04, function12, function05, function13, function06, i2);
        }
    }

    public static Intent l(Intent intent, pxj pxjVar, int i2) {
        Intent intent2 = new Intent(pxjVar.a, (Class<?>) InvisibleActionTrampolineActivity.class);
        intent2.setData(q(pxjVar, i2, 2, ""));
        intent2.putExtra("ACTION_TYPE", "BROADCAST");
        intent2.putExtra("ACTION_INTENT", intent);
        return intent2;
    }

    public static final boolean m(Object obj) {
        if (obj instanceof coh) {
            coh cohVar = (coh) obj;
            if (cohVar.b() == f7a.k || cohVar.b() == wib.i || cohVar.b() == p4h.g) {
                Object value = cohVar.getValue();
                if (value == null) {
                    return true;
                }
                return m(value);
            }
        } else if (!(obj instanceof dt8) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (k[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void n(long j2, j9e j9eVar, vsj[] vsjVarArr) {
        int i2;
        while (true) {
            if (j9eVar.a() <= 1) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (j9eVar.a() == 0) {
                    i2 = -1;
                    break;
                }
                int A = j9eVar.A();
                i3 += A;
                if (A != 255) {
                    i2 = i3;
                    break;
                }
            }
            int i4 = 0;
            while (true) {
                if (j9eVar.a() == 0) {
                    i4 = -1;
                    break;
                }
                int A2 = j9eVar.A();
                i4 += A2;
                if (A2 != 255) {
                    break;
                }
            }
            int i5 = j9eVar.b + i4;
            if (i4 == -1 || i4 > j9eVar.a()) {
                tgj.d0("Skipping remainder of malformed SEI NAL unit.");
                i5 = j9eVar.c;
            } else if (i2 == 4 && i4 >= 8) {
                int A3 = j9eVar.A();
                int H = j9eVar.H();
                int m2 = H == 49 ? j9eVar.m() : 0;
                int A4 = j9eVar.A();
                if (H == 47) {
                    j9eVar.O(1);
                }
                boolean z = A3 == 181 && (H == 49 || H == 47) && A4 == 3;
                if (H == 49) {
                    z &= m2 == 1195456820;
                }
                if (z) {
                    o(j2, j9eVar, vsjVarArr);
                }
            }
            j9eVar.N(i5);
        }
    }

    public static void o(long j2, j9e j9eVar, vsj[] vsjVarArr) {
        int A = j9eVar.A();
        if ((A & 64) != 0) {
            j9eVar.O(1);
            int i2 = (A & 31) * 3;
            int i3 = j9eVar.b;
            for (vsj vsjVar : vsjVarArr) {
                j9eVar.N(i3);
                vsjVar.g(i2, j9eVar);
                z1a.E(j2 != C.TIME_UNSET);
                vsjVar.a(j2, 1, i2, 0, null);
            }
        }
    }

    public static final boolean p(oqf oqfVar, float f2, float f3) {
        float f4 = oqfVar.a;
        if (f2 > oqfVar.c || f4 > f2) {
            return false;
        }
        return f3 <= oqfVar.d && oqfVar.b <= f3;
    }

    public static final Uri q(pxj pxjVar, int i2, int i3, String str) {
        String str2;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        if (i3 == 1) {
            str2 = "ACTIVITY";
        } else if (i3 == 2) {
            str2 = "BROADCAST";
        } else if (i3 == 3) {
            str2 = "SERVICE";
        } else if (i3 == 4) {
            str2 = "FOREGROUND_SERVICE";
        } else {
            if (i3 != 5) {
                throw null;
            }
            str2 = "CALLBACK";
        }
        builder.path(str2);
        builder.appendQueryParameter("appWidgetId", String.valueOf(pxjVar.b));
        builder.appendQueryParameter("viewId", String.valueOf(i2));
        builder.appendQueryParameter("viewSize", s75.d(pxjVar.j));
        builder.appendQueryParameter("extraData", str);
        if (pxjVar.f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(pxjVar.k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    public static final String r(CharsetDecoder charsetDecoder, bwh bwhVar) {
        charsetDecoder.getClass();
        StringBuilder sb = new StringBuilder((int) Math.min(2147483647L, bwhVar.u().c));
        Charset charset = charsetDecoder.charset();
        charset.getClass();
        if (charset.equals(Charsets.UTF_8)) {
            sb.append((CharSequence) qha.P(bwhVar));
        } else {
            long j2 = bwhVar.u().c;
            byte[] M = yaa.M(bwhVar, -1);
            Charset charset2 = charsetDecoder.charset();
            charset2.getClass();
            sb.append((CharSequence) new String(M, charset2));
        }
        return sb.toString();
    }

    public static final int s(int i2, Context context) {
        context.getClass();
        return (int) TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static final int t(Context context, float f2) {
        context.getClass();
        return (int) TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics());
    }

    public static final float u(int i2, Context context) {
        context.getClass();
        return TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static final int v(int i2, Context context) {
        context.getClass();
        return wzb.b(TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics()));
    }

    public static final int w(Context context, float f2) {
        context.getClass();
        return wzb.b(TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics()));
    }

    public static final w52 x(CharsetEncoder charsetEncoder, CharSequence charSequence, int i2, int i3) {
        charsetEncoder.getClass();
        charSequence.getClass();
        w52 w52Var = new w52();
        if (i2 < i3) {
            do {
                byte[] F = gz8.F(charsetEncoder, charSequence, i2, i3);
                w52Var.m(F.length, F);
                int length = F.length;
                if (length < 0) {
                    a70.r("Check failed.");
                    return null;
                }
                i2 += length;
            } while (i2 < i3);
        }
        return w52Var;
    }

    public static void y(int i2, int i3, a01 a01Var) {
        int i4 = 1 << (i3 - 1);
        int i5 = (i2 & i4) != 0 ? 1 : 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i2 & i4) != 0 ? 1 : 0;
            if (i5 == i8) {
                i6++;
            } else {
                for (int i9 = 0; i9 < i6; i9++) {
                    int i10 = a01Var.b;
                    a01Var.b = i10 + 1;
                    a01Var.a[i10] = (byte) i5;
                }
                a01Var.getClass();
                i6 = 1;
                i5 = i8;
            }
            i4 >>= 1;
        }
        for (int i11 = 0; i11 < i6; i11++) {
            int i12 = a01Var.b;
            a01Var.b = i12 + 1;
            a01Var.a[i12] = (byte) i5;
        }
        a01Var.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object z(cy cyVar, zj9 zj9Var, sq3 sq3Var) {
        ai9 ai9Var;
        int i2;
        if (sq3Var instanceof ai9) {
            ai9Var = (ai9) sq3Var;
            int i3 = ai9Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ai9Var.u = i3 - Integer.MIN_VALUE;
                Object obj = ai9Var.t;
                Object obj2 = lu3.a;
                i2 = ai9Var.u;
                rq3 rq3Var = null;
                int i4 = 1;
                if (i2 != 0) {
                    y6a.M(obj);
                    smi smiVar = zj9Var.e;
                    ai9Var.r = cyVar;
                    ai9Var.s = zj9Var;
                    ai9Var.u = 1;
                    gu3 gu3Var = gi9.a;
                    aea aeaVar = new aea(smiVar);
                    obj = cyVar.getCoroutineContext().plus(aeaVar).plus(gi9.a);
                    yda ydaVar = (yda) ai9Var.getContext().get(uic.g);
                    if (ydaVar != null) {
                        aeaVar.n(new oi(ydaVar.H(new b33(aeaVar, i4), true, true), 19));
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zj9Var = ai9Var.s;
                    cyVar = ai9Var.r;
                    y6a.M(obj);
                }
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                av4 t2 = xw3.t(cyVar, coroutineContext.plus(new kka(coroutineContext)), new yp7(cyVar, zj9Var, rq3Var, 16), 2);
                ai9Var.r = null;
                ai9Var.s = null;
                ai9Var.u = 2;
                Object w = t2.w(ai9Var);
                return w != obj2 ? obj2 : w;
            }
        }
        ai9Var = new ai9(sq3Var);
        Object obj3 = ai9Var.t;
        Object obj22 = lu3.a;
        i2 = ai9Var.u;
        rq3 rq3Var2 = null;
        int i42 = 1;
        if (i2 != 0) {
        }
        CoroutineContext coroutineContext2 = (CoroutineContext) obj3;
        av4 t22 = xw3.t(cyVar, coroutineContext2.plus(new kka(coroutineContext2)), new yp7(cyVar, zj9Var, rq3Var2, 16), 2);
        ai9Var.r = null;
        ai9Var.s = null;
        ai9Var.u = 2;
        Object w2 = t22.w(ai9Var);
        if (w2 != obj22) {
        }
    }

    public abstract void D(int i2, String str);

    public abstract void E(String str, int i2, Object... objArr);
}
