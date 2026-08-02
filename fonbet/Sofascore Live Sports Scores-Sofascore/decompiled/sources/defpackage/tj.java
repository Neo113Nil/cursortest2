package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.recyclerview.widget.n;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.Y1;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.GenderTypeConverter;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.bettingtips.fragment.BetBoostFragment;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import com.sofascore.results.view.SofascoreSmallRatingView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class tj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tj(zpf zpfVar, int i) {
        this.a = 4;
        vmd vmdVar = vmd.EVENT_DETAILS;
        this.c = zpfVar;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02dd A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0019, B:5:0x00d0, B:8:0x00f9, B:11:0x0108, B:16:0x0120, B:19:0x0134, B:22:0x0141, B:25:0x014d, B:27:0x0153, B:29:0x0159, B:31:0x0161, B:34:0x017c, B:37:0x018e, B:39:0x0194, B:43:0x01ca, B:45:0x01d2, B:47:0x01d8, B:49:0x01e0, B:51:0x01e8, B:54:0x01ff, B:57:0x0211, B:59:0x0217, B:63:0x0248, B:65:0x0250, B:67:0x0256, B:70:0x0266, B:72:0x0277, B:74:0x027d, B:77:0x028d, B:80:0x029a, B:83:0x02a7, B:85:0x02af, B:87:0x02b5, B:90:0x02c3, B:93:0x02d0, B:96:0x02e2, B:97:0x02ed, B:100:0x02dd, B:101:0x02cc, B:104:0x02a3, B:105:0x0296, B:110:0x0221, B:113:0x022e, B:116:0x023f, B:117:0x023b, B:118:0x022a, B:119:0x020d, B:124:0x01a0, B:128:0x01b0, B:131:0x01c1, B:132:0x01bd, B:133:0x01ab, B:134:0x018a, B:140:0x0129, B:141:0x011a, B:142:0x0111, B:143:0x0102, B:144:0x00f3), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02cc A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0019, B:5:0x00d0, B:8:0x00f9, B:11:0x0108, B:16:0x0120, B:19:0x0134, B:22:0x0141, B:25:0x014d, B:27:0x0153, B:29:0x0159, B:31:0x0161, B:34:0x017c, B:37:0x018e, B:39:0x0194, B:43:0x01ca, B:45:0x01d2, B:47:0x01d8, B:49:0x01e0, B:51:0x01e8, B:54:0x01ff, B:57:0x0211, B:59:0x0217, B:63:0x0248, B:65:0x0250, B:67:0x0256, B:70:0x0266, B:72:0x0277, B:74:0x027d, B:77:0x028d, B:80:0x029a, B:83:0x02a7, B:85:0x02af, B:87:0x02b5, B:90:0x02c3, B:93:0x02d0, B:96:0x02e2, B:97:0x02ed, B:100:0x02dd, B:101:0x02cc, B:104:0x02a3, B:105:0x0296, B:110:0x0221, B:113:0x022e, B:116:0x023f, B:117:0x023b, B:118:0x022a, B:119:0x020d, B:124:0x01a0, B:128:0x01b0, B:131:0x01c1, B:132:0x01bd, B:133:0x01ab, B:134:0x018a, B:140:0x0129, B:141:0x011a, B:142:0x0111, B:143:0x0102, B:144:0x00f3), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a3 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0019, B:5:0x00d0, B:8:0x00f9, B:11:0x0108, B:16:0x0120, B:19:0x0134, B:22:0x0141, B:25:0x014d, B:27:0x0153, B:29:0x0159, B:31:0x0161, B:34:0x017c, B:37:0x018e, B:39:0x0194, B:43:0x01ca, B:45:0x01d2, B:47:0x01d8, B:49:0x01e0, B:51:0x01e8, B:54:0x01ff, B:57:0x0211, B:59:0x0217, B:63:0x0248, B:65:0x0250, B:67:0x0256, B:70:0x0266, B:72:0x0277, B:74:0x027d, B:77:0x028d, B:80:0x029a, B:83:0x02a7, B:85:0x02af, B:87:0x02b5, B:90:0x02c3, B:93:0x02d0, B:96:0x02e2, B:97:0x02ed, B:100:0x02dd, B:101:0x02cc, B:104:0x02a3, B:105:0x0296, B:110:0x0221, B:113:0x022e, B:116:0x023f, B:117:0x023b, B:118:0x022a, B:119:0x020d, B:124:0x01a0, B:128:0x01b0, B:131:0x01c1, B:132:0x01bd, B:133:0x01ab, B:134:0x018a, B:140:0x0129, B:141:0x011a, B:142:0x0111, B:143:0x0102, B:144:0x00f3), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0296 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0019, B:5:0x00d0, B:8:0x00f9, B:11:0x0108, B:16:0x0120, B:19:0x0134, B:22:0x0141, B:25:0x014d, B:27:0x0153, B:29:0x0159, B:31:0x0161, B:34:0x017c, B:37:0x018e, B:39:0x0194, B:43:0x01ca, B:45:0x01d2, B:47:0x01d8, B:49:0x01e0, B:51:0x01e8, B:54:0x01ff, B:57:0x0211, B:59:0x0217, B:63:0x0248, B:65:0x0250, B:67:0x0256, B:70:0x0266, B:72:0x0277, B:74:0x027d, B:77:0x028d, B:80:0x029a, B:83:0x02a7, B:85:0x02af, B:87:0x02b5, B:90:0x02c3, B:93:0x02d0, B:96:0x02e2, B:97:0x02ed, B:100:0x02dd, B:101:0x02cc, B:104:0x02a3, B:105:0x0296, B:110:0x0221, B:113:0x022e, B:116:0x023f, B:117:0x023b, B:118:0x022a, B:119:0x020d, B:124:0x01a0, B:128:0x01b0, B:131:0x01c1, B:132:0x01bd, B:133:0x01ab, B:134:0x018a, B:140:0x0129, B:141:0x011a, B:142:0x0111, B:143:0x0102, B:144:0x00f3), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023b A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0019, B:5:0x00d0, B:8:0x00f9, B:11:0x0108, B:16:0x0120, B:19:0x0134, B:22:0x0141, B:25:0x014d, B:27:0x0153, B:29:0x0159, B:31:0x0161, B:34:0x017c, B:37:0x018e, B:39:0x0194, B:43:0x01ca, B:45:0x01d2, B:47:0x01d8, B:49:0x01e0, B:51:0x01e8, B:54:0x01ff, B:57:0x0211, B:59:0x0217, B:63:0x0248, B:65:0x0250, B:67:0x0256, B:70:0x0266, B:72:0x0277, B:74:0x027d, B:77:0x028d, B:80:0x029a, B:83:0x02a7, B:85:0x02af, B:87:0x02b5, B:90:0x02c3, B:93:0x02d0, B:96:0x02e2, B:97:0x02ed, B:100:0x02dd, B:101:0x02cc, B:104:0x02a3, B:105:0x0296, B:110:0x0221, B:113:0x022e, B:116:0x023f, B:117:0x023b, B:118:0x022a, B:119:0x020d, B:124:0x01a0, B:128:0x01b0, B:131:0x01c1, B:132:0x01bd, B:133:0x01ab, B:134:0x018a, B:140:0x0129, B:141:0x011a, B:142:0x0111, B:143:0x0102, B:144:0x00f3), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022a A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0019, B:5:0x00d0, B:8:0x00f9, B:11:0x0108, B:16:0x0120, B:19:0x0134, B:22:0x0141, B:25:0x014d, B:27:0x0153, B:29:0x0159, B:31:0x0161, B:34:0x017c, B:37:0x018e, B:39:0x0194, B:43:0x01ca, B:45:0x01d2, B:47:0x01d8, B:49:0x01e0, B:51:0x01e8, B:54:0x01ff, B:57:0x0211, B:59:0x0217, B:63:0x0248, B:65:0x0250, B:67:0x0256, B:70:0x0266, B:72:0x0277, B:74:0x027d, B:77:0x028d, B:80:0x029a, B:83:0x02a7, B:85:0x02af, B:87:0x02b5, B:90:0x02c3, B:93:0x02d0, B:96:0x02e2, B:97:0x02ed, B:100:0x02dd, B:101:0x02cc, B:104:0x02a3, B:105:0x0296, B:110:0x0221, B:113:0x022e, B:116:0x023f, B:117:0x023b, B:118:0x022a, B:119:0x020d, B:124:0x01a0, B:128:0x01b0, B:131:0x01c1, B:132:0x01bd, B:133:0x01ab, B:134:0x018a, B:140:0x0129, B:141:0x011a, B:142:0x0111, B:143:0x0102, B:144:0x00f3), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020d A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0019, B:5:0x00d0, B:8:0x00f9, B:11:0x0108, B:16:0x0120, B:19:0x0134, B:22:0x0141, B:25:0x014d, B:27:0x0153, B:29:0x0159, B:31:0x0161, B:34:0x017c, B:37:0x018e, B:39:0x0194, B:43:0x01ca, B:45:0x01d2, B:47:0x01d8, B:49:0x01e0, B:51:0x01e8, B:54:0x01ff, B:57:0x0211, B:59:0x0217, B:63:0x0248, B:65:0x0250, B:67:0x0256, B:70:0x0266, B:72:0x0277, B:74:0x027d, B:77:0x028d, B:80:0x029a, B:83:0x02a7, B:85:0x02af, B:87:0x02b5, B:90:0x02c3, B:93:0x02d0, B:96:0x02e2, B:97:0x02ed, B:100:0x02dd, B:101:0x02cc, B:104:0x02a3, B:105:0x0296, B:110:0x0221, B:113:0x022e, B:116:0x023f, B:117:0x023b, B:118:0x022a, B:119:0x020d, B:124:0x01a0, B:128:0x01b0, B:131:0x01c1, B:132:0x01bd, B:133:0x01ab, B:134:0x018a, B:140:0x0129, B:141:0x011a, B:142:0x0111, B:143:0x0102, B:144:0x00f3), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d8 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0019, B:5:0x00d0, B:8:0x00f9, B:11:0x0108, B:16:0x0120, B:19:0x0134, B:22:0x0141, B:25:0x014d, B:27:0x0153, B:29:0x0159, B:31:0x0161, B:34:0x017c, B:37:0x018e, B:39:0x0194, B:43:0x01ca, B:45:0x01d2, B:47:0x01d8, B:49:0x01e0, B:51:0x01e8, B:54:0x01ff, B:57:0x0211, B:59:0x0217, B:63:0x0248, B:65:0x0250, B:67:0x0256, B:70:0x0266, B:72:0x0277, B:74:0x027d, B:77:0x028d, B:80:0x029a, B:83:0x02a7, B:85:0x02af, B:87:0x02b5, B:90:0x02c3, B:93:0x02d0, B:96:0x02e2, B:97:0x02ed, B:100:0x02dd, B:101:0x02cc, B:104:0x02a3, B:105:0x0296, B:110:0x0221, B:113:0x022e, B:116:0x023f, B:117:0x023b, B:118:0x022a, B:119:0x020d, B:124:0x01a0, B:128:0x01b0, B:131:0x01c1, B:132:0x01bd, B:133:0x01ab, B:134:0x018a, B:140:0x0129, B:141:0x011a, B:142:0x0111, B:143:0x0102, B:144:0x00f3), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0217 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0019, B:5:0x00d0, B:8:0x00f9, B:11:0x0108, B:16:0x0120, B:19:0x0134, B:22:0x0141, B:25:0x014d, B:27:0x0153, B:29:0x0159, B:31:0x0161, B:34:0x017c, B:37:0x018e, B:39:0x0194, B:43:0x01ca, B:45:0x01d2, B:47:0x01d8, B:49:0x01e0, B:51:0x01e8, B:54:0x01ff, B:57:0x0211, B:59:0x0217, B:63:0x0248, B:65:0x0250, B:67:0x0256, B:70:0x0266, B:72:0x0277, B:74:0x027d, B:77:0x028d, B:80:0x029a, B:83:0x02a7, B:85:0x02af, B:87:0x02b5, B:90:0x02c3, B:93:0x02d0, B:96:0x02e2, B:97:0x02ed, B:100:0x02dd, B:101:0x02cc, B:104:0x02a3, B:105:0x0296, B:110:0x0221, B:113:0x022e, B:116:0x023f, B:117:0x023b, B:118:0x022a, B:119:0x020d, B:124:0x01a0, B:128:0x01b0, B:131:0x01c1, B:132:0x01bd, B:133:0x01ab, B:134:0x018a, B:140:0x0129, B:141:0x011a, B:142:0x0111, B:143:0x0102, B:144:0x00f3), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0256 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0019, B:5:0x00d0, B:8:0x00f9, B:11:0x0108, B:16:0x0120, B:19:0x0134, B:22:0x0141, B:25:0x014d, B:27:0x0153, B:29:0x0159, B:31:0x0161, B:34:0x017c, B:37:0x018e, B:39:0x0194, B:43:0x01ca, B:45:0x01d2, B:47:0x01d8, B:49:0x01e0, B:51:0x01e8, B:54:0x01ff, B:57:0x0211, B:59:0x0217, B:63:0x0248, B:65:0x0250, B:67:0x0256, B:70:0x0266, B:72:0x0277, B:74:0x027d, B:77:0x028d, B:80:0x029a, B:83:0x02a7, B:85:0x02af, B:87:0x02b5, B:90:0x02c3, B:93:0x02d0, B:96:0x02e2, B:97:0x02ed, B:100:0x02dd, B:101:0x02cc, B:104:0x02a3, B:105:0x0296, B:110:0x0221, B:113:0x022e, B:116:0x023f, B:117:0x023b, B:118:0x022a, B:119:0x020d, B:124:0x01a0, B:128:0x01b0, B:131:0x01c1, B:132:0x01bd, B:133:0x01ab, B:134:0x018a, B:140:0x0129, B:141:0x011a, B:142:0x0111, B:143:0x0102, B:144:0x00f3), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027d A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0019, B:5:0x00d0, B:8:0x00f9, B:11:0x0108, B:16:0x0120, B:19:0x0134, B:22:0x0141, B:25:0x014d, B:27:0x0153, B:29:0x0159, B:31:0x0161, B:34:0x017c, B:37:0x018e, B:39:0x0194, B:43:0x01ca, B:45:0x01d2, B:47:0x01d8, B:49:0x01e0, B:51:0x01e8, B:54:0x01ff, B:57:0x0211, B:59:0x0217, B:63:0x0248, B:65:0x0250, B:67:0x0256, B:70:0x0266, B:72:0x0277, B:74:0x027d, B:77:0x028d, B:80:0x029a, B:83:0x02a7, B:85:0x02af, B:87:0x02b5, B:90:0x02c3, B:93:0x02d0, B:96:0x02e2, B:97:0x02ed, B:100:0x02dd, B:101:0x02cc, B:104:0x02a3, B:105:0x0296, B:110:0x0221, B:113:0x022e, B:116:0x023f, B:117:0x023b, B:118:0x022a, B:119:0x020d, B:124:0x01a0, B:128:0x01b0, B:131:0x01c1, B:132:0x01bd, B:133:0x01ab, B:134:0x018a, B:140:0x0129, B:141:0x011a, B:142:0x0111, B:143:0x0102, B:144:0x00f3), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b5 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0019, B:5:0x00d0, B:8:0x00f9, B:11:0x0108, B:16:0x0120, B:19:0x0134, B:22:0x0141, B:25:0x014d, B:27:0x0153, B:29:0x0159, B:31:0x0161, B:34:0x017c, B:37:0x018e, B:39:0x0194, B:43:0x01ca, B:45:0x01d2, B:47:0x01d8, B:49:0x01e0, B:51:0x01e8, B:54:0x01ff, B:57:0x0211, B:59:0x0217, B:63:0x0248, B:65:0x0250, B:67:0x0256, B:70:0x0266, B:72:0x0277, B:74:0x027d, B:77:0x028d, B:80:0x029a, B:83:0x02a7, B:85:0x02af, B:87:0x02b5, B:90:0x02c3, B:93:0x02d0, B:96:0x02e2, B:97:0x02ed, B:100:0x02dd, B:101:0x02cc, B:104:0x02a3, B:105:0x0296, B:110:0x0221, B:113:0x022e, B:116:0x023f, B:117:0x023b, B:118:0x022a, B:119:0x020d, B:124:0x01a0, B:128:0x01b0, B:131:0x01c1, B:132:0x01bd, B:133:0x01ab, B:134:0x018a, B:140:0x0129, B:141:0x011a, B:142:0x0111, B:143:0x0102, B:144:0x00f3), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c9  */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.sofascore.model.mvvm.model.Team] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Object obj) {
        int i;
        int i2;
        SubTeam subTeam;
        sz8 sz8Var;
        int i3;
        int i4;
        int i5;
        SubTeam subTeam2;
        int i6;
        Sport sport;
        int i7;
        Country country;
        int i8;
        FieldTranslations fieldTranslations;
        FieldTranslations fieldTranslations2;
        FieldTranslations fieldTranslations3;
        int i9 = this.b;
        sz8 sz8Var2 = ((fvi) this.c).d;
        glg glgVar = (glg) obj;
        glgVar.getClass();
        nlg V0 = glgVar.V0("SELECT * FROM teams WHERE id = ?");
        try {
            V0.q(1, i9);
            int r = w1a.r(V0, "id");
            int r2 = w1a.r(V0, "name");
            int r3 = w1a.r(V0, "slug");
            int r4 = w1a.r(V0, "userCount");
            int r5 = w1a.r(V0, "type");
            int r6 = w1a.r(V0, "nameCode");
            int r7 = w1a.r(V0, "shortName");
            int r8 = w1a.r(V0, InneractiveMediationDefs.KEY_GENDER);
            int r9 = w1a.r(V0, "ranking");
            int r10 = w1a.r(V0, Y1.e);
            int r11 = w1a.r(V0, "national");
            int r12 = w1a.r(V0, "sub_team_one_id");
            int r13 = w1a.r(V0, "sub_team_one_name");
            int r14 = w1a.r(V0, "sub_team_one_nameTranslation");
            int r15 = w1a.r(V0, "sub_team_one_shortNameTranslation");
            int r16 = w1a.r(V0, "sub_team_two_id");
            int r17 = w1a.r(V0, "sub_team_two_name");
            int r18 = w1a.r(V0, "sub_team_two_nameTranslation");
            int r19 = w1a.r(V0, "sub_team_two_shortNameTranslation");
            int r20 = w1a.r(V0, "sport_id");
            int r21 = w1a.r(V0, "sport_slug");
            int r22 = w1a.r(V0, "country_name");
            int r23 = w1a.r(V0, "country_alpha2");
            int r24 = w1a.r(V0, "nameTranslation");
            int r25 = w1a.r(V0, "shortNameTranslation");
            if (V0.U0()) {
                int i10 = (int) V0.getLong(r);
                String F0 = V0.F0(r2);
                String F02 = V0.F0(r3);
                long j = V0.getLong(r4);
                int i11 = (int) V0.getLong(r5);
                String F03 = V0.isNull(r6) ? null : V0.F0(r6);
                String F04 = V0.isNull(r7) ? null : V0.F0(r7);
                String F05 = V0.isNull(r8) ? null : V0.F0(r8);
                Gender stringToGender = F05 == null ? null : GenderTypeConverter.stringToGender(F05);
                Integer valueOf = V0.isNull(r9) ? null : Integer.valueOf((int) V0.getLong(r9));
                boolean z = ((int) V0.getLong(r10)) != 0;
                boolean z2 = ((int) V0.getLong(r11)) != 0;
                if (V0.isNull(r12) && V0.isNull(r13)) {
                    i2 = r14;
                    if (V0.isNull(i2)) {
                        i = r15;
                        if (V0.isNull(i)) {
                            sz8Var = sz8Var2;
                            subTeam = null;
                            if (V0.isNull(r16)) {
                                i3 = r17;
                                if (V0.isNull(i3)) {
                                    i4 = r18;
                                    if (V0.isNull(i4)) {
                                        i5 = r19;
                                        if (V0.isNull(i5)) {
                                            subTeam2 = null;
                                            if (V0.isNull(r20)) {
                                            }
                                            sport = new Sport((int) V0.getLong(r20), V0.F0(i6));
                                            if (V0.isNull(r22)) {
                                            }
                                            country = new Country(V0.isNull(r22) ? null : V0.F0(r22), V0.isNull(i7) ? null : V0.F0(i7));
                                            if (V0.isNull(r24)) {
                                            }
                                            fieldTranslations = new FieldTranslations(sz8Var.z(!V0.isNull(r24) ? null : V0.F0(r24)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                                            r27 = new Team(i10, F0, F02, j, i11, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                        } else {
                                            int i12 = (int) V0.getLong(r16);
                                            String F06 = V0.isNull(i3) ? null : V0.F0(i3);
                                            if (V0.isNull(i4) && V0.isNull(i5)) {
                                                fieldTranslations2 = null;
                                                subTeam2 = new SubTeam(i12, F06, fieldTranslations2);
                                                if (V0.isNull(r20)) {
                                                    i6 = r21;
                                                } else {
                                                    i6 = r21;
                                                    if (V0.isNull(i6)) {
                                                        sport = null;
                                                        if (V0.isNull(r22)) {
                                                            i7 = r23;
                                                            if (V0.isNull(i7)) {
                                                                country = null;
                                                                if (V0.isNull(r24)) {
                                                                    i8 = r25;
                                                                } else {
                                                                    i8 = r25;
                                                                    if (V0.isNull(i8)) {
                                                                        fieldTranslations = null;
                                                                        r27 = new Team(i10, F0, F02, j, i11, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                    }
                                                                }
                                                                fieldTranslations = new FieldTranslations(sz8Var.z(!V0.isNull(r24) ? null : V0.F0(r24)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                                                                r27 = new Team(i10, F0, F02, j, i11, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                            }
                                                        } else {
                                                            i7 = r23;
                                                        }
                                                        country = new Country(V0.isNull(r22) ? null : V0.F0(r22), V0.isNull(i7) ? null : V0.F0(i7));
                                                        if (V0.isNull(r24)) {
                                                        }
                                                        fieldTranslations = new FieldTranslations(sz8Var.z(!V0.isNull(r24) ? null : V0.F0(r24)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                                                        r27 = new Team(i10, F0, F02, j, i11, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                    }
                                                }
                                                sport = new Sport((int) V0.getLong(r20), V0.F0(i6));
                                                if (V0.isNull(r22)) {
                                                }
                                                country = new Country(V0.isNull(r22) ? null : V0.F0(r22), V0.isNull(i7) ? null : V0.F0(i7));
                                                if (V0.isNull(r24)) {
                                                }
                                                fieldTranslations = new FieldTranslations(sz8Var.z(!V0.isNull(r24) ? null : V0.F0(r24)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                                                r27 = new Team(i10, F0, F02, j, i11, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                            }
                                            fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i4) ? null : V0.F0(i4)), sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)));
                                            subTeam2 = new SubTeam(i12, F06, fieldTranslations2);
                                            if (V0.isNull(r20)) {
                                            }
                                            sport = new Sport((int) V0.getLong(r20), V0.F0(i6));
                                            if (V0.isNull(r22)) {
                                            }
                                            country = new Country(V0.isNull(r22) ? null : V0.F0(r22), V0.isNull(i7) ? null : V0.F0(i7));
                                            if (V0.isNull(r24)) {
                                            }
                                            fieldTranslations = new FieldTranslations(sz8Var.z(!V0.isNull(r24) ? null : V0.F0(r24)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                                            r27 = new Team(i10, F0, F02, j, i11, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                        }
                                    }
                                    i5 = r19;
                                    int i122 = (int) V0.getLong(r16);
                                    if (V0.isNull(i3)) {
                                    }
                                    if (V0.isNull(i4)) {
                                        fieldTranslations2 = null;
                                        subTeam2 = new SubTeam(i122, F06, fieldTranslations2);
                                        if (V0.isNull(r20)) {
                                        }
                                        sport = new Sport((int) V0.getLong(r20), V0.F0(i6));
                                        if (V0.isNull(r22)) {
                                        }
                                        country = new Country(V0.isNull(r22) ? null : V0.F0(r22), V0.isNull(i7) ? null : V0.F0(i7));
                                        if (V0.isNull(r24)) {
                                        }
                                        fieldTranslations = new FieldTranslations(sz8Var.z(!V0.isNull(r24) ? null : V0.F0(r24)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                                        r27 = new Team(i10, F0, F02, j, i11, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                    }
                                    fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i4) ? null : V0.F0(i4)), sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)));
                                    subTeam2 = new SubTeam(i122, F06, fieldTranslations2);
                                    if (V0.isNull(r20)) {
                                    }
                                    sport = new Sport((int) V0.getLong(r20), V0.F0(i6));
                                    if (V0.isNull(r22)) {
                                    }
                                    country = new Country(V0.isNull(r22) ? null : V0.F0(r22), V0.isNull(i7) ? null : V0.F0(i7));
                                    if (V0.isNull(r24)) {
                                    }
                                    fieldTranslations = new FieldTranslations(sz8Var.z(!V0.isNull(r24) ? null : V0.F0(r24)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                                    r27 = new Team(i10, F0, F02, j, i11, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                }
                            } else {
                                i3 = r17;
                            }
                            i4 = r18;
                            i5 = r19;
                            int i1222 = (int) V0.getLong(r16);
                            if (V0.isNull(i3)) {
                            }
                            if (V0.isNull(i4)) {
                            }
                            fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i4) ? null : V0.F0(i4)), sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)));
                            subTeam2 = new SubTeam(i1222, F06, fieldTranslations2);
                            if (V0.isNull(r20)) {
                            }
                            sport = new Sport((int) V0.getLong(r20), V0.F0(i6));
                            if (V0.isNull(r22)) {
                            }
                            country = new Country(V0.isNull(r22) ? null : V0.F0(r22), V0.isNull(i7) ? null : V0.F0(i7));
                            if (V0.isNull(r24)) {
                            }
                            fieldTranslations = new FieldTranslations(sz8Var.z(!V0.isNull(r24) ? null : V0.F0(r24)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                            r27 = new Team(i10, F0, F02, j, i11, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                        }
                    } else {
                        i = r15;
                    }
                } else {
                    i = r15;
                    i2 = r14;
                }
                int i13 = (int) V0.getLong(r12);
                String F07 = V0.isNull(r13) ? null : V0.F0(r13);
                if (V0.isNull(i2) && V0.isNull(i)) {
                    sz8Var = sz8Var2;
                    fieldTranslations3 = null;
                    subTeam = new SubTeam(i13, F07, fieldTranslations3);
                    if (V0.isNull(r16)) {
                    }
                    i4 = r18;
                    i5 = r19;
                    int i12222 = (int) V0.getLong(r16);
                    if (V0.isNull(i3)) {
                    }
                    if (V0.isNull(i4)) {
                    }
                    fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i4) ? null : V0.F0(i4)), sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)));
                    subTeam2 = new SubTeam(i12222, F06, fieldTranslations2);
                    if (V0.isNull(r20)) {
                    }
                    sport = new Sport((int) V0.getLong(r20), V0.F0(i6));
                    if (V0.isNull(r22)) {
                    }
                    country = new Country(V0.isNull(r22) ? null : V0.F0(r22), V0.isNull(i7) ? null : V0.F0(i7));
                    if (V0.isNull(r24)) {
                    }
                    fieldTranslations = new FieldTranslations(sz8Var.z(!V0.isNull(r24) ? null : V0.F0(r24)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                    r27 = new Team(i10, F0, F02, j, i11, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                }
                sz8Var = sz8Var2;
                fieldTranslations3 = new FieldTranslations(sz8Var.z(V0.isNull(i2) ? null : V0.F0(i2)), sz8Var.z(V0.isNull(i) ? null : V0.F0(i)));
                subTeam = new SubTeam(i13, F07, fieldTranslations3);
                if (V0.isNull(r16)) {
                }
                i4 = r18;
                i5 = r19;
                int i122222 = (int) V0.getLong(r16);
                if (V0.isNull(i3)) {
                }
                if (V0.isNull(i4)) {
                }
                fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i4) ? null : V0.F0(i4)), sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)));
                subTeam2 = new SubTeam(i122222, F06, fieldTranslations2);
                if (V0.isNull(r20)) {
                }
                sport = new Sport((int) V0.getLong(r20), V0.F0(i6));
                if (V0.isNull(r22)) {
                }
                country = new Country(V0.isNull(r22) ? null : V0.F0(r22), V0.isNull(i7) ? null : V0.F0(i7));
                if (V0.isNull(r24)) {
                }
                fieldTranslations = new FieldTranslations(sz8Var.z(!V0.isNull(r24) ? null : V0.F0(r24)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                r27 = new Team(i10, F0, F02, j, i11, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
            }
            V0.close();
            return r27;
        } catch (Throwable th) {
            V0.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x06d9 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x06ff A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06ef A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0542 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0582 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05c3 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0601 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x063d A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0664 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0697 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06b9 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06a9 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0686 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x067a A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0622 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0612 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05f7 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05a8 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0597 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0578 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0519 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x050a A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0501 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04f3 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04e4 A[Catch: all -> 0x048f, TryCatch #1 {all -> 0x048f, blocks: (B:111:0x02d6, B:113:0x03a9, B:115:0x03c0, B:117:0x03c6, B:119:0x03cc, B:121:0x03d2, B:123:0x03d8, B:125:0x03de, B:127:0x03e4, B:129:0x03ea, B:131:0x03f0, B:133:0x03f8, B:135:0x0400, B:137:0x0408, B:139:0x0410, B:141:0x041a, B:143:0x0424, B:145:0x042e, B:147:0x0438, B:149:0x0442, B:151:0x044c, B:153:0x0456, B:155:0x0460, B:157:0x046a, B:159:0x0474, B:161:0x047e, B:165:0x06d3, B:167:0x06d9, B:170:0x06e7, B:173:0x06f3, B:176:0x0703, B:177:0x070e, B:182:0x06ff, B:183:0x06ef, B:187:0x04c5, B:190:0x04ea, B:193:0x04f9, B:198:0x0510, B:201:0x0524, B:204:0x0530, B:207:0x053c, B:209:0x0542, B:211:0x054a, B:213:0x0552, B:216:0x056b, B:219:0x057c, B:221:0x0582, B:225:0x05b5, B:227:0x05bd, B:229:0x05c3, B:231:0x05cb, B:233:0x05d3, B:236:0x05ea, B:239:0x05fb, B:241:0x0601, B:245:0x062f, B:247:0x0637, B:249:0x063d, B:252:0x064d, B:254:0x065e, B:256:0x0664, B:259:0x0672, B:262:0x067e, B:265:0x068a, B:266:0x0691, B:268:0x0697, B:272:0x06c8, B:273:0x06a1, B:276:0x06ad, B:279:0x06bd, B:280:0x06b9, B:281:0x06a9, B:282:0x0686, B:283:0x067a, B:288:0x060a, B:291:0x0616, B:294:0x0626, B:295:0x0622, B:296:0x0612, B:297:0x05f7, B:302:0x058d, B:306:0x059c, B:309:0x05ac, B:310:0x05a8, B:311:0x0597, B:312:0x0578, B:319:0x0519, B:320:0x050a, B:321:0x0501, B:322:0x04f3, B:323:0x04e4), top: B:110:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f1 A[Catch: all -> 0x0142, TryCatch #0 {all -> 0x0142, blocks: (B:16:0x0084, B:18:0x00f7, B:21:0x010f, B:24:0x011f, B:28:0x0132, B:31:0x013b, B:32:0x0147, B:35:0x0153, B:38:0x0162, B:41:0x0176, B:44:0x0189, B:46:0x01b0, B:50:0x01e4, B:52:0x01f1, B:55:0x01ff, B:58:0x020b, B:61:0x021b, B:62:0x0226, B:67:0x0217, B:68:0x0207, B:71:0x01bb, B:75:0x01ca, B:78:0x01da, B:79:0x01d6, B:80:0x01c5, B:81:0x017f, B:82:0x016b, B:83:0x015c, B:87:0x0127, B:89:0x0109), top: B:15:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0217 A[Catch: all -> 0x0142, TryCatch #0 {all -> 0x0142, blocks: (B:16:0x0084, B:18:0x00f7, B:21:0x010f, B:24:0x011f, B:28:0x0132, B:31:0x013b, B:32:0x0147, B:35:0x0153, B:38:0x0162, B:41:0x0176, B:44:0x0189, B:46:0x01b0, B:50:0x01e4, B:52:0x01f1, B:55:0x01ff, B:58:0x020b, B:61:0x021b, B:62:0x0226, B:67:0x0217, B:68:0x0207, B:71:0x01bb, B:75:0x01ca, B:78:0x01da, B:79:0x01d6, B:80:0x01c5, B:81:0x017f, B:82:0x016b, B:83:0x015c, B:87:0x0127, B:89:0x0109), top: B:15:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0207 A[Catch: all -> 0x0142, TryCatch #0 {all -> 0x0142, blocks: (B:16:0x0084, B:18:0x00f7, B:21:0x010f, B:24:0x011f, B:28:0x0132, B:31:0x013b, B:32:0x0147, B:35:0x0153, B:38:0x0162, B:41:0x0176, B:44:0x0189, B:46:0x01b0, B:50:0x01e4, B:52:0x01f1, B:55:0x01ff, B:58:0x020b, B:61:0x021b, B:62:0x0226, B:67:0x0217, B:68:0x0207, B:71:0x01bb, B:75:0x01ca, B:78:0x01da, B:79:0x01d6, B:80:0x01c5, B:81:0x017f, B:82:0x016b, B:83:0x015c, B:87:0x0127, B:89:0x0109), top: B:15:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fd  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        final ?? r8;
        Player player;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        SubTeam subTeam;
        sz8 sz8Var;
        int i9;
        int i10;
        int i11;
        int i12;
        SubTeam subTeam2;
        int i13;
        int i14;
        Sport sport;
        int i15;
        int i16;
        Country country;
        FieldTranslations fieldTranslations;
        Team team;
        FieldTranslations fieldTranslations2;
        FieldTranslations fieldTranslations3;
        int i17;
        FieldTranslations fieldTranslations4;
        UniqueTournament uniqueTournament;
        sz8 sz8Var2;
        FieldTranslations fieldTranslations5;
        int i18;
        FieldTranslations fieldTranslations6;
        TournamentRoundWrapper tournamentRoundWrapper;
        int i19 = this.a;
        Object obj2 = this.c;
        final int i20 = this.b;
        switch (i19) {
            case 0:
                uj ujVar = (uj) obj2;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                gv9 gv9Var = ujVar.a;
                int i21 = 1;
                esaVar.a(gv9Var.size(), null, new zi(r11, new ia(6), gv9Var), new tc3(802480018, new aj(i21, gv9Var, ujVar), true));
                esaVar.f("regulation_footer", "regulation_footer", new tc3(1729296218, new sj(i20, ujVar, r11), true));
                ald h = rld.h(i20, true);
                if (h != null) {
                    esa.d(esaVar, null, null, new tc3(902632128, new si(h, i21), true), 3);
                }
                return Unit.a;
            case 1:
                sz0 sz0Var = (sz0) obj2;
                Context context = (Context) obj;
                context.getClass();
                AdBannerView adBannerView = new AdBannerView(context, null, 6);
                adBannerView.setBackground(null);
                adBannerView.setPaddingRelative(adBannerView.getPaddingStart(), ao2.s(i20, context), adBannerView.getPaddingEnd(), ao2.s(i20, context));
                adBannerView.setCustomTargeting(sz0Var.b);
                adBannerView.setAdType(sz0Var.a);
                adBannerView.c(adBannerView.adType);
                return adBannerView;
            case 2:
                BetBoostFragment betBoostFragment = (BetBoostFragment) obj2;
                ((View) obj).getClass();
                mqi mqiVar = betBoostFragment.y;
                ((g8b) mqiVar.getValue()).setTargetPosition(i20 + 1);
                krk krkVar = betBoostFragment.l;
                krkVar.getClass();
                n layoutManager = ((eo8) krkVar).d.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.startSmoothScroll((g8b) mqiVar.getValue());
                }
                return Unit.a;
            case 3:
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                vnb vnbVar = (vnb) ((e1d) obj2).getValue();
                vnbVar.getClass();
                gv9 gv9Var2 = ((kfk) ((is3) ((unb) vnbVar).a).c.get(i20)).i;
                esaVar2.a(gv9Var2.size(), null, new uk1(2, gv9Var2), new tc3(802480018, new zr3(0, gv9Var2), true));
                return Unit.a;
            case 4:
                final zpf zpfVar = (zpf) obj2;
                vmd vmdVar = vmd.EVENT_DETAILS;
                esa esaVar3 = (esa) obj;
                esaVar3.getClass();
                if (zpfVar.c.c) {
                    final int i22 = 0;
                    esa.d(esaVar3, null, null, new tc3(454486057, new ct8(i20, zpfVar, i22) { // from class: j66
                        public final /* synthetic */ int a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ zpf c;

                        {
                            this.a = i22;
                            switch (i22) {
                                case 1:
                                    break;
                                default:
                                    vmd vmdVar2 = vmd.EVENT_DETAILS;
                                    break;
                            }
                        }

                        @Override // defpackage.ct8
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i23 = this.a;
                            zpf zpfVar2 = this.c;
                            switch (i23) {
                                case 0:
                                    vmd vmdVar2 = vmd.EVENT_DETAILS;
                                    of3 of3Var = (of3) obj4;
                                    int intValue = ((Integer) obj5).intValue();
                                    ((xpa) obj3).getClass();
                                    av8 av8Var = (av8) of3Var;
                                    if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                                        gz8.l(this.b, zpfVar2.c, null, av8Var, 0);
                                    } else {
                                        av8Var.W();
                                    }
                                    break;
                                default:
                                    of3 of3Var2 = (of3) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    ((xpa) obj3).getClass();
                                    av8 av8Var2 = (av8) of3Var2;
                                    if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        o3a.d(this.b, zpfVar2.c.e, null, av8Var2, 0, 4);
                                    } else {
                                        av8Var2.W();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, true), 3);
                }
                gv9 gv9Var3 = zpfVar.a;
                if (gv9Var3 == null) {
                    gv9Var3 = zpfVar.b;
                }
                if (gv9Var3 != null) {
                    r8 = 1;
                    esaVar3.a(gv9Var3.size(), new zi(19, new au5(15), gv9Var3), new uk1(7, gv9Var3), new tc3(802480018, new zr3(1 == true ? 1 : 0, gv9Var3), true));
                } else {
                    r8 = 1;
                }
                esaVar3.f("regulation_footer", "regulation_footer", new tc3(569528270, new ct8(i20, zpfVar, r8) { // from class: j66
                    public final /* synthetic */ int a;
                    public final /* synthetic */ int b;
                    public final /* synthetic */ zpf c;

                    {
                        this.a = r8;
                        switch (r8) {
                            case 1:
                                break;
                            default:
                                vmd vmdVar2 = vmd.EVENT_DETAILS;
                                break;
                        }
                    }

                    @Override // defpackage.ct8
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i23 = this.a;
                        zpf zpfVar2 = this.c;
                        switch (i23) {
                            case 0:
                                vmd vmdVar2 = vmd.EVENT_DETAILS;
                                of3 of3Var = (of3) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                ((xpa) obj3).getClass();
                                av8 av8Var = (av8) of3Var;
                                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                                    gz8.l(this.b, zpfVar2.c, null, av8Var, 0);
                                } else {
                                    av8Var.W();
                                }
                                break;
                            default:
                                of3 of3Var2 = (of3) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                ((xpa) obj3).getClass();
                                av8 av8Var2 = (av8) of3Var2;
                                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    o3a.d(this.b, zpfVar2.c.e, null, av8Var2, 0, 4);
                                } else {
                                    av8Var2.W();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                }, r8));
                return Unit.a;
            case 5:
                cra craVar = (cra) obj;
                qq4 qq4Var = ((qpa) obj2).a;
                nnh w = bea.w();
                bea.K(w, bea.C(w), w != null ? w.e() : null);
                qq4Var.getClass();
                int i23 = craVar.a;
                r11 = i23 != -1 ? i23 : 2;
                for (int i24 = 0; i24 < r11; i24++) {
                    craVar.a(i20 + i24);
                }
                return Unit.a;
            case 6:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                editor.putString("PREF_ODDS", (String) ((ltb) obj2).get(Integer.valueOf(i20)));
                return Unit.a;
            case 7:
                List list = (List) obj2;
                ysd ysdVar = (ysd) obj;
                ysdVar.getClass();
                gv9 gv9Var4 = ysdVar.c;
                gv9 gv9Var5 = ysdVar.d;
                ArrayList w0 = CollectionsKt.w0(CollectionsKt.S(gv9Var4, i20), CollectionsKt.w0(list, CollectionsKt.L0(gv9Var4, i20)));
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator it = w0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hashSet.add(((OnboardingItemUiModel) next).a())) {
                        arrayList.add(next);
                    }
                }
                gv9 W = l6g.W(arrayList);
                ArrayList w02 = CollectionsKt.w0(CollectionsKt.S(gv9Var5, i20), CollectionsKt.w0(list, CollectionsKt.L0(gv9Var5, i20)));
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = w02.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (hashSet2.add(((OnboardingItemUiModel) next2).a())) {
                        arrayList2.add(next2);
                    }
                }
                return ysd.a(ysdVar, 0, W, l6g.W(arrayList2), null, 19);
            case 8:
                sz8 sz8Var3 = ((aoe) obj2).d;
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("SELECT * FROM players WHERE id = ?");
                try {
                    V0.q(1, i20);
                    int r = w1a.r(V0, "id");
                    int r2 = w1a.r(V0, "name");
                    int r3 = w1a.r(V0, "userCount");
                    int r4 = w1a.r(V0, "team_id");
                    int r5 = w1a.r(V0, "team_name");
                    int r6 = w1a.r(V0, "team_slug");
                    int r7 = w1a.r(V0, "team_userCount");
                    int r9 = w1a.r(V0, "team_type");
                    int r10 = w1a.r(V0, "team_nameCode");
                    int r11 = w1a.r(V0, "team_shortName");
                    int r12 = w1a.r(V0, "team_gender");
                    int r13 = w1a.r(V0, "team_ranking");
                    int r14 = w1a.r(V0, "team_disabled");
                    int r15 = w1a.r(V0, "team_national");
                    int r16 = w1a.r(V0, "team_sub_team_one_id");
                    int r17 = w1a.r(V0, "team_sub_team_one_name");
                    int r18 = w1a.r(V0, "team_sub_team_one_nameTranslation");
                    int r19 = w1a.r(V0, "team_sub_team_one_shortNameTranslation");
                    int r20 = w1a.r(V0, "team_sub_team_two_id");
                    int r21 = w1a.r(V0, "team_sub_team_two_name");
                    int r22 = w1a.r(V0, "team_sub_team_two_nameTranslation");
                    int r23 = w1a.r(V0, "team_sub_team_two_shortNameTranslation");
                    int r24 = w1a.r(V0, "team_sport_id");
                    int r25 = w1a.r(V0, "team_sport_slug");
                    int r26 = w1a.r(V0, "team_country_name");
                    int r27 = w1a.r(V0, "team_country_alpha2");
                    int r28 = w1a.r(V0, "team_nameTranslation");
                    int r29 = w1a.r(V0, "team_shortNameTranslation");
                    int r30 = w1a.r(V0, "nameTranslation");
                    int r31 = w1a.r(V0, "shortNameTranslation");
                    if (V0.U0()) {
                        int i25 = (int) V0.getLong(r);
                        String F0 = V0.F0(r2);
                        long j = V0.getLong(r3);
                        if (V0.isNull(r4) && V0.isNull(r5) && V0.isNull(r6) && V0.isNull(r7) && V0.isNull(r9) && V0.isNull(r10) && V0.isNull(r11) && V0.isNull(r12) && V0.isNull(r13)) {
                            i = r14;
                            if (V0.isNull(i)) {
                                i2 = r15;
                                if (V0.isNull(i2)) {
                                    i4 = r16;
                                    if (V0.isNull(i4)) {
                                        if (V0.isNull(r17)) {
                                            i3 = i25;
                                            if (V0.isNull(r18)) {
                                                r18 = r18;
                                                if (V0.isNull(r19)) {
                                                    r19 = r19;
                                                    if (V0.isNull(r20)) {
                                                        r20 = r20;
                                                        if (V0.isNull(r21)) {
                                                            r21 = r21;
                                                            if (V0.isNull(r22)) {
                                                                r22 = r22;
                                                                if (V0.isNull(r23)) {
                                                                    r23 = r23;
                                                                    if (V0.isNull(r24)) {
                                                                        r24 = r24;
                                                                        if (V0.isNull(r25)) {
                                                                            r25 = r25;
                                                                            if (V0.isNull(r26)) {
                                                                                r26 = r26;
                                                                                if (V0.isNull(r27)) {
                                                                                    r27 = r27;
                                                                                    i5 = r28;
                                                                                    if (V0.isNull(i5) && V0.isNull(r29)) {
                                                                                        sz8Var = sz8Var3;
                                                                                        team = null;
                                                                                        if (V0.isNull(r30)) {
                                                                                            i17 = r31;
                                                                                        } else {
                                                                                            i17 = r31;
                                                                                            if (V0.isNull(i17)) {
                                                                                                fieldTranslations4 = null;
                                                                                                player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                            }
                                                                                        }
                                                                                        fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                        player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                    }
                                                                                    r17 = r17;
                                                                                    int i26 = (int) V0.getLong(r4);
                                                                                    String F02 = V0.F0(r5);
                                                                                    String F03 = V0.F0(r6);
                                                                                    long j2 = V0.getLong(r7);
                                                                                    int i27 = (int) V0.getLong(r9);
                                                                                    String F04 = V0.isNull(r10) ? null : V0.F0(r10);
                                                                                    String F05 = V0.isNull(r11) ? null : V0.F0(r11);
                                                                                    String F06 = V0.isNull(r12) ? null : V0.F0(r12);
                                                                                    Gender stringToGender = F06 == null ? null : GenderTypeConverter.stringToGender(F06);
                                                                                    Integer valueOf = V0.isNull(r13) ? null : Integer.valueOf((int) V0.getLong(r13));
                                                                                    boolean z = ((int) V0.getLong(i)) != 0;
                                                                                    boolean z2 = ((int) V0.getLong(i2)) != 0;
                                                                                    if (V0.isNull(i4)) {
                                                                                        i6 = r17;
                                                                                        if (V0.isNull(i6)) {
                                                                                            i7 = r18;
                                                                                            if (V0.isNull(i7)) {
                                                                                                i8 = r19;
                                                                                                if (V0.isNull(i8)) {
                                                                                                    sz8Var = sz8Var3;
                                                                                                    subTeam = null;
                                                                                                    i9 = r20;
                                                                                                    if (V0.isNull(i9)) {
                                                                                                    }
                                                                                                    i11 = r22;
                                                                                                    i12 = r23;
                                                                                                    int i28 = (int) V0.getLong(i9);
                                                                                                    if (!V0.isNull(i10)) {
                                                                                                    }
                                                                                                    if (V0.isNull(i11)) {
                                                                                                    }
                                                                                                    fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(i11) ? null : V0.F0(i11)), sz8Var.z(!V0.isNull(i12) ? null : V0.F0(i12)));
                                                                                                    subTeam2 = new SubTeam(i28, r4, fieldTranslations2);
                                                                                                    i13 = r24;
                                                                                                    if (V0.isNull(i13)) {
                                                                                                    }
                                                                                                    sport = new Sport((int) V0.getLong(i13), V0.F0(i14));
                                                                                                    i15 = r26;
                                                                                                    if (V0.isNull(i15)) {
                                                                                                    }
                                                                                                    country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                                                                                                    if (V0.isNull(i5)) {
                                                                                                    }
                                                                                                    fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                                                                                    team = new Team(i26, F02, F03, j2, i27, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                                                    if (V0.isNull(r30)) {
                                                                                                    }
                                                                                                    fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                                    player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                                } else {
                                                                                                    int i29 = (int) V0.getLong(i4);
                                                                                                    String F07 = V0.isNull(i6) ? null : V0.F0(i6);
                                                                                                    if (V0.isNull(i7) && V0.isNull(i8)) {
                                                                                                        sz8Var = sz8Var3;
                                                                                                        fieldTranslations3 = null;
                                                                                                        subTeam = new SubTeam(i29, F07, fieldTranslations3);
                                                                                                        i9 = r20;
                                                                                                        if (V0.isNull(i9)) {
                                                                                                            i10 = r21;
                                                                                                        } else {
                                                                                                            i10 = r21;
                                                                                                            if (V0.isNull(i10)) {
                                                                                                                i11 = r22;
                                                                                                                if (V0.isNull(i11)) {
                                                                                                                    i12 = r23;
                                                                                                                    if (V0.isNull(i12)) {
                                                                                                                        subTeam2 = null;
                                                                                                                        i13 = r24;
                                                                                                                        if (V0.isNull(i13)) {
                                                                                                                        }
                                                                                                                        sport = new Sport((int) V0.getLong(i13), V0.F0(i14));
                                                                                                                        i15 = r26;
                                                                                                                        if (V0.isNull(i15)) {
                                                                                                                        }
                                                                                                                        country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                                                                                                                        if (V0.isNull(i5)) {
                                                                                                                        }
                                                                                                                        fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                                                                                                        team = new Team(i26, F02, F03, j2, i27, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                                                                        if (V0.isNull(r30)) {
                                                                                                                        }
                                                                                                                        fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                                                        player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                                                    } else {
                                                                                                                        int i282 = (int) V0.getLong(i9);
                                                                                                                        String F08 = !V0.isNull(i10) ? null : V0.F0(i10);
                                                                                                                        if (V0.isNull(i11) && V0.isNull(i12)) {
                                                                                                                            fieldTranslations2 = null;
                                                                                                                            subTeam2 = new SubTeam(i282, F08, fieldTranslations2);
                                                                                                                            i13 = r24;
                                                                                                                            if (V0.isNull(i13)) {
                                                                                                                                i14 = r25;
                                                                                                                                if (V0.isNull(i14)) {
                                                                                                                                    sport = null;
                                                                                                                                    i15 = r26;
                                                                                                                                    if (V0.isNull(i15)) {
                                                                                                                                        i16 = r27;
                                                                                                                                    } else {
                                                                                                                                        i16 = r27;
                                                                                                                                        if (V0.isNull(i16)) {
                                                                                                                                            country = null;
                                                                                                                                            if (V0.isNull(i5) && V0.isNull(r29)) {
                                                                                                                                                fieldTranslations = null;
                                                                                                                                                team = new Team(i26, F02, F03, j2, i27, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                                                                                                if (V0.isNull(r30)) {
                                                                                                                                                }
                                                                                                                                                fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                                                                                player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                                                                            }
                                                                                                                                            fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                                                                                                                            team = new Team(i26, F02, F03, j2, i27, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                                                                                            if (V0.isNull(r30)) {
                                                                                                                                            }
                                                                                                                                            fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                                                                            player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                                                                                                                                    if (V0.isNull(i5)) {
                                                                                                                                        fieldTranslations = null;
                                                                                                                                        team = new Team(i26, F02, F03, j2, i27, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                                                                                        if (V0.isNull(r30)) {
                                                                                                                                        }
                                                                                                                                        fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                                                                        player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                                                                    }
                                                                                                                                    fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                                                                                                                    team = new Team(i26, F02, F03, j2, i27, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                                                                                    if (V0.isNull(r30)) {
                                                                                                                                    }
                                                                                                                                    fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                                                                    player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i14 = r25;
                                                                                                                            }
                                                                                                                            sport = new Sport((int) V0.getLong(i13), V0.F0(i14));
                                                                                                                            i15 = r26;
                                                                                                                            if (V0.isNull(i15)) {
                                                                                                                            }
                                                                                                                            country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                                                                                                                            if (V0.isNull(i5)) {
                                                                                                                            }
                                                                                                                            fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                                                                                                            team = new Team(i26, F02, F03, j2, i27, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                                                                            if (V0.isNull(r30)) {
                                                                                                                            }
                                                                                                                            fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                                                            player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                                                        }
                                                                                                                        fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(i11) ? null : V0.F0(i11)), sz8Var.z(!V0.isNull(i12) ? null : V0.F0(i12)));
                                                                                                                        subTeam2 = new SubTeam(i282, F08, fieldTranslations2);
                                                                                                                        i13 = r24;
                                                                                                                        if (V0.isNull(i13)) {
                                                                                                                        }
                                                                                                                        sport = new Sport((int) V0.getLong(i13), V0.F0(i14));
                                                                                                                        i15 = r26;
                                                                                                                        if (V0.isNull(i15)) {
                                                                                                                        }
                                                                                                                        country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                                                                                                                        if (V0.isNull(i5)) {
                                                                                                                        }
                                                                                                                        fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                                                                                                        team = new Team(i26, F02, F03, j2, i27, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                                                                        if (V0.isNull(r30)) {
                                                                                                                        }
                                                                                                                        fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                                                        player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                                                    }
                                                                                                                }
                                                                                                                i12 = r23;
                                                                                                                int i2822 = (int) V0.getLong(i9);
                                                                                                                if (!V0.isNull(i10)) {
                                                                                                                }
                                                                                                                if (V0.isNull(i11)) {
                                                                                                                    fieldTranslations2 = null;
                                                                                                                    subTeam2 = new SubTeam(i2822, F08, fieldTranslations2);
                                                                                                                    i13 = r24;
                                                                                                                    if (V0.isNull(i13)) {
                                                                                                                    }
                                                                                                                    sport = new Sport((int) V0.getLong(i13), V0.F0(i14));
                                                                                                                    i15 = r26;
                                                                                                                    if (V0.isNull(i15)) {
                                                                                                                    }
                                                                                                                    country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                                                                                                                    if (V0.isNull(i5)) {
                                                                                                                    }
                                                                                                                    fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                                                                                                    team = new Team(i26, F02, F03, j2, i27, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                                                                    if (V0.isNull(r30)) {
                                                                                                                    }
                                                                                                                    fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                                                    player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                                                }
                                                                                                                fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(i11) ? null : V0.F0(i11)), sz8Var.z(!V0.isNull(i12) ? null : V0.F0(i12)));
                                                                                                                subTeam2 = new SubTeam(i2822, F08, fieldTranslations2);
                                                                                                                i13 = r24;
                                                                                                                if (V0.isNull(i13)) {
                                                                                                                }
                                                                                                                sport = new Sport((int) V0.getLong(i13), V0.F0(i14));
                                                                                                                i15 = r26;
                                                                                                                if (V0.isNull(i15)) {
                                                                                                                }
                                                                                                                country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                                                                                                                if (V0.isNull(i5)) {
                                                                                                                }
                                                                                                                fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                                                                                                team = new Team(i26, F02, F03, j2, i27, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                                                                if (V0.isNull(r30)) {
                                                                                                                }
                                                                                                                fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                                                player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                                            }
                                                                                                        }
                                                                                                        i11 = r22;
                                                                                                        i12 = r23;
                                                                                                        int i28222 = (int) V0.getLong(i9);
                                                                                                        if (!V0.isNull(i10)) {
                                                                                                        }
                                                                                                        if (V0.isNull(i11)) {
                                                                                                        }
                                                                                                        fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(i11) ? null : V0.F0(i11)), sz8Var.z(!V0.isNull(i12) ? null : V0.F0(i12)));
                                                                                                        subTeam2 = new SubTeam(i28222, F08, fieldTranslations2);
                                                                                                        i13 = r24;
                                                                                                        if (V0.isNull(i13)) {
                                                                                                        }
                                                                                                        sport = new Sport((int) V0.getLong(i13), V0.F0(i14));
                                                                                                        i15 = r26;
                                                                                                        if (V0.isNull(i15)) {
                                                                                                        }
                                                                                                        country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                                                                                                        if (V0.isNull(i5)) {
                                                                                                        }
                                                                                                        fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                                                                                        team = new Team(i26, F02, F03, j2, i27, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                                                        if (V0.isNull(r30)) {
                                                                                                        }
                                                                                                        fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                                        player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                                    }
                                                                                                    sz8Var = sz8Var3;
                                                                                                    fieldTranslations3 = new FieldTranslations(sz8Var.z(V0.isNull(i7) ? null : V0.F0(i7)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                                                                                                    subTeam = new SubTeam(i29, F07, fieldTranslations3);
                                                                                                    i9 = r20;
                                                                                                    if (V0.isNull(i9)) {
                                                                                                    }
                                                                                                    i11 = r22;
                                                                                                    i12 = r23;
                                                                                                    int i282222 = (int) V0.getLong(i9);
                                                                                                    if (!V0.isNull(i10)) {
                                                                                                    }
                                                                                                    if (V0.isNull(i11)) {
                                                                                                    }
                                                                                                    fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(i11) ? null : V0.F0(i11)), sz8Var.z(!V0.isNull(i12) ? null : V0.F0(i12)));
                                                                                                    subTeam2 = new SubTeam(i282222, F08, fieldTranslations2);
                                                                                                    i13 = r24;
                                                                                                    if (V0.isNull(i13)) {
                                                                                                    }
                                                                                                    sport = new Sport((int) V0.getLong(i13), V0.F0(i14));
                                                                                                    i15 = r26;
                                                                                                    if (V0.isNull(i15)) {
                                                                                                    }
                                                                                                    country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                                                                                                    if (V0.isNull(i5)) {
                                                                                                    }
                                                                                                    fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                                                                                    team = new Team(i26, F02, F03, j2, i27, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                                                    if (V0.isNull(r30)) {
                                                                                                    }
                                                                                                    fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                                    player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                                }
                                                                                            }
                                                                                            i8 = r19;
                                                                                            int i292 = (int) V0.getLong(i4);
                                                                                            if (V0.isNull(i6)) {
                                                                                            }
                                                                                            if (V0.isNull(i7)) {
                                                                                                sz8Var = sz8Var3;
                                                                                                fieldTranslations3 = null;
                                                                                                subTeam = new SubTeam(i292, F07, fieldTranslations3);
                                                                                                i9 = r20;
                                                                                                if (V0.isNull(i9)) {
                                                                                                }
                                                                                                i11 = r22;
                                                                                                i12 = r23;
                                                                                                int i2822222 = (int) V0.getLong(i9);
                                                                                                if (!V0.isNull(i10)) {
                                                                                                }
                                                                                                if (V0.isNull(i11)) {
                                                                                                }
                                                                                                fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(i11) ? null : V0.F0(i11)), sz8Var.z(!V0.isNull(i12) ? null : V0.F0(i12)));
                                                                                                subTeam2 = new SubTeam(i2822222, F08, fieldTranslations2);
                                                                                                i13 = r24;
                                                                                                if (V0.isNull(i13)) {
                                                                                                }
                                                                                                sport = new Sport((int) V0.getLong(i13), V0.F0(i14));
                                                                                                i15 = r26;
                                                                                                if (V0.isNull(i15)) {
                                                                                                }
                                                                                                country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                                                                                                if (V0.isNull(i5)) {
                                                                                                }
                                                                                                fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                                                                                team = new Team(i26, F02, F03, j2, i27, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                                                if (V0.isNull(r30)) {
                                                                                                }
                                                                                                fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                                player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                            }
                                                                                            sz8Var = sz8Var3;
                                                                                            fieldTranslations3 = new FieldTranslations(sz8Var.z(V0.isNull(i7) ? null : V0.F0(i7)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                                                                                            subTeam = new SubTeam(i292, F07, fieldTranslations3);
                                                                                            i9 = r20;
                                                                                            if (V0.isNull(i9)) {
                                                                                            }
                                                                                            i11 = r22;
                                                                                            i12 = r23;
                                                                                            int i28222222 = (int) V0.getLong(i9);
                                                                                            if (!V0.isNull(i10)) {
                                                                                            }
                                                                                            if (V0.isNull(i11)) {
                                                                                            }
                                                                                            fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(i11) ? null : V0.F0(i11)), sz8Var.z(!V0.isNull(i12) ? null : V0.F0(i12)));
                                                                                            subTeam2 = new SubTeam(i28222222, F08, fieldTranslations2);
                                                                                            i13 = r24;
                                                                                            if (V0.isNull(i13)) {
                                                                                            }
                                                                                            sport = new Sport((int) V0.getLong(i13), V0.F0(i14));
                                                                                            i15 = r26;
                                                                                            if (V0.isNull(i15)) {
                                                                                            }
                                                                                            country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                                                                                            if (V0.isNull(i5)) {
                                                                                            }
                                                                                            fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                                                                            team = new Team(i26, F02, F03, j2, i27, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                                            if (V0.isNull(r30)) {
                                                                                            }
                                                                                            fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                            player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                        }
                                                                                    } else {
                                                                                        i6 = r17;
                                                                                    }
                                                                                    i7 = r18;
                                                                                    i8 = r19;
                                                                                    int i2922 = (int) V0.getLong(i4);
                                                                                    if (V0.isNull(i6)) {
                                                                                    }
                                                                                    if (V0.isNull(i7)) {
                                                                                    }
                                                                                    sz8Var = sz8Var3;
                                                                                    fieldTranslations3 = new FieldTranslations(sz8Var.z(V0.isNull(i7) ? null : V0.F0(i7)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                                                                                    subTeam = new SubTeam(i2922, F07, fieldTranslations3);
                                                                                    i9 = r20;
                                                                                    if (V0.isNull(i9)) {
                                                                                    }
                                                                                    i11 = r22;
                                                                                    i12 = r23;
                                                                                    int i282222222 = (int) V0.getLong(i9);
                                                                                    if (!V0.isNull(i10)) {
                                                                                    }
                                                                                    if (V0.isNull(i11)) {
                                                                                    }
                                                                                    fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(i11) ? null : V0.F0(i11)), sz8Var.z(!V0.isNull(i12) ? null : V0.F0(i12)));
                                                                                    subTeam2 = new SubTeam(i282222222, F08, fieldTranslations2);
                                                                                    i13 = r24;
                                                                                    if (V0.isNull(i13)) {
                                                                                    }
                                                                                    sport = new Sport((int) V0.getLong(i13), V0.F0(i14));
                                                                                    i15 = r26;
                                                                                    if (V0.isNull(i15)) {
                                                                                    }
                                                                                    country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                                                                                    if (V0.isNull(i5)) {
                                                                                    }
                                                                                    fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                                                                    team = new Team(i26, F02, F03, j2, i27, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                                                                    if (V0.isNull(r30)) {
                                                                                    }
                                                                                    fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                                                                    player = new Player(i3, F0, j, team, fieldTranslations4);
                                                                                } else {
                                                                                    r27 = r27;
                                                                                }
                                                                            } else {
                                                                                r26 = r26;
                                                                            }
                                                                        } else {
                                                                            r25 = r25;
                                                                        }
                                                                    } else {
                                                                        r24 = r24;
                                                                    }
                                                                } else {
                                                                    r23 = r23;
                                                                }
                                                            } else {
                                                                r22 = r22;
                                                            }
                                                        } else {
                                                            r21 = r21;
                                                        }
                                                    } else {
                                                        r20 = r20;
                                                    }
                                                } else {
                                                    r19 = r19;
                                                }
                                            } else {
                                                r18 = r18;
                                            }
                                        } else {
                                            i3 = i25;
                                        }
                                        i5 = r28;
                                        r17 = r17;
                                        int i262 = (int) V0.getLong(r4);
                                        String F022 = V0.F0(r5);
                                        String F032 = V0.F0(r6);
                                        long j22 = V0.getLong(r7);
                                        int i272 = (int) V0.getLong(r9);
                                        if (V0.isNull(r10)) {
                                        }
                                        if (V0.isNull(r11)) {
                                        }
                                        if (V0.isNull(r12)) {
                                        }
                                        if (F06 == null) {
                                        }
                                        if (V0.isNull(r13)) {
                                        }
                                        if (((int) V0.getLong(i)) != 0) {
                                        }
                                        if (((int) V0.getLong(i2)) != 0) {
                                        }
                                        if (V0.isNull(i4)) {
                                        }
                                        i7 = r18;
                                        i8 = r19;
                                        int i29222 = (int) V0.getLong(i4);
                                        if (V0.isNull(i6)) {
                                        }
                                        if (V0.isNull(i7)) {
                                        }
                                        sz8Var = sz8Var3;
                                        fieldTranslations3 = new FieldTranslations(sz8Var.z(V0.isNull(i7) ? null : V0.F0(i7)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                                        subTeam = new SubTeam(i29222, F07, fieldTranslations3);
                                        i9 = r20;
                                        if (V0.isNull(i9)) {
                                        }
                                        i11 = r22;
                                        i12 = r23;
                                        int i2822222222 = (int) V0.getLong(i9);
                                        if (!V0.isNull(i10)) {
                                        }
                                        if (V0.isNull(i11)) {
                                        }
                                        fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(i11) ? null : V0.F0(i11)), sz8Var.z(!V0.isNull(i12) ? null : V0.F0(i12)));
                                        subTeam2 = new SubTeam(i2822222222, F08, fieldTranslations2);
                                        i13 = r24;
                                        if (V0.isNull(i13)) {
                                        }
                                        sport = new Sport((int) V0.getLong(i13), V0.F0(i14));
                                        i15 = r26;
                                        if (V0.isNull(i15)) {
                                        }
                                        country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                                        if (V0.isNull(i5)) {
                                        }
                                        fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                        team = new Team(i262, F022, F032, j22, i272, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                        if (V0.isNull(r30)) {
                                        }
                                        fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                        player = new Player(i3, F0, j, team, fieldTranslations4);
                                    } else {
                                        i3 = i25;
                                        i5 = r28;
                                        int i2622 = (int) V0.getLong(r4);
                                        String F0222 = V0.F0(r5);
                                        String F0322 = V0.F0(r6);
                                        long j222 = V0.getLong(r7);
                                        int i2722 = (int) V0.getLong(r9);
                                        if (V0.isNull(r10)) {
                                        }
                                        if (V0.isNull(r11)) {
                                        }
                                        if (V0.isNull(r12)) {
                                        }
                                        if (F06 == null) {
                                        }
                                        if (V0.isNull(r13)) {
                                        }
                                        if (((int) V0.getLong(i)) != 0) {
                                        }
                                        if (((int) V0.getLong(i2)) != 0) {
                                        }
                                        if (V0.isNull(i4)) {
                                        }
                                        i7 = r18;
                                        i8 = r19;
                                        int i292222 = (int) V0.getLong(i4);
                                        if (V0.isNull(i6)) {
                                        }
                                        if (V0.isNull(i7)) {
                                        }
                                        sz8Var = sz8Var3;
                                        fieldTranslations3 = new FieldTranslations(sz8Var.z(V0.isNull(i7) ? null : V0.F0(i7)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                                        subTeam = new SubTeam(i292222, F07, fieldTranslations3);
                                        i9 = r20;
                                        if (V0.isNull(i9)) {
                                        }
                                        i11 = r22;
                                        i12 = r23;
                                        int i28222222222 = (int) V0.getLong(i9);
                                        if (!V0.isNull(i10)) {
                                        }
                                        if (V0.isNull(i11)) {
                                        }
                                        fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(i11) ? null : V0.F0(i11)), sz8Var.z(!V0.isNull(i12) ? null : V0.F0(i12)));
                                        subTeam2 = new SubTeam(i28222222222, F08, fieldTranslations2);
                                        i13 = r24;
                                        if (V0.isNull(i13)) {
                                        }
                                        sport = new Sport((int) V0.getLong(i13), V0.F0(i14));
                                        i15 = r26;
                                        if (V0.isNull(i15)) {
                                        }
                                        country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                                        if (V0.isNull(i5)) {
                                        }
                                        fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                        team = new Team(i2622, F0222, F0322, j222, i2722, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                        if (V0.isNull(r30)) {
                                        }
                                        fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                        player = new Player(i3, F0, j, team, fieldTranslations4);
                                    }
                                }
                                i3 = i25;
                                i4 = r16;
                                i5 = r28;
                                int i26222 = (int) V0.getLong(r4);
                                String F02222 = V0.F0(r5);
                                String F03222 = V0.F0(r6);
                                long j2222 = V0.getLong(r7);
                                int i27222 = (int) V0.getLong(r9);
                                if (V0.isNull(r10)) {
                                }
                                if (V0.isNull(r11)) {
                                }
                                if (V0.isNull(r12)) {
                                }
                                if (F06 == null) {
                                }
                                if (V0.isNull(r13)) {
                                }
                                if (((int) V0.getLong(i)) != 0) {
                                }
                                if (((int) V0.getLong(i2)) != 0) {
                                }
                                if (V0.isNull(i4)) {
                                }
                                i7 = r18;
                                i8 = r19;
                                int i2922222 = (int) V0.getLong(i4);
                                if (V0.isNull(i6)) {
                                }
                                if (V0.isNull(i7)) {
                                }
                                sz8Var = sz8Var3;
                                fieldTranslations3 = new FieldTranslations(sz8Var.z(V0.isNull(i7) ? null : V0.F0(i7)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                                subTeam = new SubTeam(i2922222, F07, fieldTranslations3);
                                i9 = r20;
                                if (V0.isNull(i9)) {
                                }
                                i11 = r22;
                                i12 = r23;
                                int i282222222222 = (int) V0.getLong(i9);
                                if (!V0.isNull(i10)) {
                                }
                                if (V0.isNull(i11)) {
                                }
                                fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(i11) ? null : V0.F0(i11)), sz8Var.z(!V0.isNull(i12) ? null : V0.F0(i12)));
                                subTeam2 = new SubTeam(i282222222222, F08, fieldTranslations2);
                                i13 = r24;
                                if (V0.isNull(i13)) {
                                }
                                sport = new Sport((int) V0.getLong(i13), V0.F0(i14));
                                i15 = r26;
                                if (V0.isNull(i15)) {
                                }
                                country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                                if (V0.isNull(i5)) {
                                }
                                fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                                team = new Team(i26222, F02222, F03222, j2222, i27222, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                                if (V0.isNull(r30)) {
                                }
                                fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                                player = new Player(i3, F0, j, team, fieldTranslations4);
                            }
                        } else {
                            i = r14;
                        }
                        i2 = r15;
                        i3 = i25;
                        i4 = r16;
                        i5 = r28;
                        int i262222 = (int) V0.getLong(r4);
                        String F022222 = V0.F0(r5);
                        String F032222 = V0.F0(r6);
                        long j22222 = V0.getLong(r7);
                        int i272222 = (int) V0.getLong(r9);
                        if (V0.isNull(r10)) {
                        }
                        if (V0.isNull(r11)) {
                        }
                        if (V0.isNull(r12)) {
                        }
                        if (F06 == null) {
                        }
                        if (V0.isNull(r13)) {
                        }
                        if (((int) V0.getLong(i)) != 0) {
                        }
                        if (((int) V0.getLong(i2)) != 0) {
                        }
                        if (V0.isNull(i4)) {
                        }
                        i7 = r18;
                        i8 = r19;
                        int i29222222 = (int) V0.getLong(i4);
                        if (V0.isNull(i6)) {
                        }
                        if (V0.isNull(i7)) {
                        }
                        sz8Var = sz8Var3;
                        fieldTranslations3 = new FieldTranslations(sz8Var.z(V0.isNull(i7) ? null : V0.F0(i7)), sz8Var.z(V0.isNull(i8) ? null : V0.F0(i8)));
                        subTeam = new SubTeam(i29222222, F07, fieldTranslations3);
                        i9 = r20;
                        if (V0.isNull(i9)) {
                        }
                        i11 = r22;
                        i12 = r23;
                        int i2822222222222 = (int) V0.getLong(i9);
                        if (!V0.isNull(i10)) {
                        }
                        if (V0.isNull(i11)) {
                        }
                        fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(i11) ? null : V0.F0(i11)), sz8Var.z(!V0.isNull(i12) ? null : V0.F0(i12)));
                        subTeam2 = new SubTeam(i2822222222222, F08, fieldTranslations2);
                        i13 = r24;
                        if (V0.isNull(i13)) {
                        }
                        sport = new Sport((int) V0.getLong(i13), V0.F0(i14));
                        i15 = r26;
                        if (V0.isNull(i15)) {
                        }
                        country = new Country(!V0.isNull(i15) ? null : V0.F0(i15), !V0.isNull(i16) ? null : V0.F0(i16));
                        if (V0.isNull(i5)) {
                        }
                        fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i5) ? null : V0.F0(i5)), sz8Var.z(V0.isNull(r29) ? null : V0.F0(r29)));
                        team = new Team(i262222, F022222, F032222, j22222, i272222, F04, F05, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations);
                        if (V0.isNull(r30)) {
                        }
                        fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(r30) ? null : V0.F0(r30)), sz8Var.z(!V0.isNull(i17) ? null : V0.F0(i17)));
                        player = new Player(i3, F0, j, team, fieldTranslations4);
                    } else {
                        player = null;
                    }
                    V0.close();
                    return player;
                } finally {
                }
            case 9:
                return s02.M(utc.a, new s81(((e9i) obj2).a((((Integer) obj).intValue() * 150) + i20, 500), 5));
            case 10:
                return Boolean.valueOf(((List) obj).addAll(i20, (Collection) obj2));
            case 11:
                SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) obj2;
                Float f = (Float) obj;
                float floatValue = f.floatValue();
                int i30 = SofascoreSmallRatingView.w;
                sofascoreSmallRatingView.setText(String.format(Locale.US, floatValue > 9.9f ? "%.0f" : lnb.k(i20, "%.", InneractiveMediationDefs.GENDER_FEMALE), Arrays.copyOf(new Object[]{f}, 1)));
                sofascoreSmallRatingView.invalidate();
                return Unit.a;
            case 12:
                return a(obj);
            case 13:
                jwi jwiVar = (jwi) obj2;
                ((iwi) obj).getClass();
                return jwiVar.t(llf.c(i20, jwiVar.l.getYear(), jwiVar.m.getYear()));
            case 14:
                sz8 sz8Var4 = ((irj) obj2).d;
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                nlg V02 = glgVar2.V0("SELECT * FROM leagues WHERE id = ?");
                try {
                    V02.q(1, i20);
                    int r32 = w1a.r(V02, "id");
                    int r33 = w1a.r(V02, "name");
                    int r34 = w1a.r(V02, "userCount");
                    int r35 = w1a.r(V02, "hasEventPlayerStatistics");
                    int r36 = w1a.r(V02, "hasBoxScore");
                    int r37 = w1a.r(V02, "displayInverseHomeAwayTeams");
                    int r38 = w1a.r(V02, "groundType");
                    int r39 = w1a.r(V02, "tennisPoints");
                    int r40 = w1a.r(V02, InneractiveMediationDefs.KEY_GENDER);
                    int r41 = w1a.r(V02, "category_id");
                    int r42 = w1a.r(V02, "category_name");
                    int r43 = w1a.r(V02, "category_flag");
                    int r44 = w1a.r(V02, "category_sport_id");
                    int r45 = w1a.r(V02, "category_sport_slug");
                    int r46 = w1a.r(V02, "category_nameTranslation");
                    int r47 = w1a.r(V02, "category_shortNameTranslation");
                    int r48 = w1a.r(V02, "nameTranslation");
                    int r49 = w1a.r(V02, "shortNameTranslation");
                    if (V02.U0()) {
                        int i31 = (int) V02.getLong(r32);
                        String F09 = V02.isNull(r33) ? null : V02.F0(r33);
                        long j3 = V02.getLong(r34);
                        boolean z3 = ((int) V02.getLong(r35)) != 0;
                        Integer valueOf2 = V02.isNull(r36) ? null : Integer.valueOf((int) V02.getLong(r36));
                        Boolean valueOf3 = valueOf2 != null ? Boolean.valueOf(valueOf2.intValue() != 0) : null;
                        boolean z4 = ((int) V02.getLong(r37)) != 0;
                        String F010 = V02.isNull(r38) ? null : V02.F0(r38);
                        Integer valueOf4 = V02.isNull(r39) ? null : Integer.valueOf((int) V02.getLong(r39));
                        Gender b = V02.isNull(r40) ? null : irj.b(V02.F0(r40));
                        int i32 = (int) V02.getLong(r41);
                        String F011 = V02.F0(r42);
                        String F012 = V02.F0(r43);
                        Sport sport2 = new Sport((int) V02.getLong(r44), V02.F0(r45));
                        if (V02.isNull(r46) && V02.isNull(r47)) {
                            sz8Var2 = sz8Var4;
                            fieldTranslations5 = null;
                            Category category = new Category(i32, F011, F012, sport2, fieldTranslations5);
                            if (V02.isNull(r48)) {
                                i18 = r49;
                            } else {
                                i18 = r49;
                                if (V02.isNull(i18)) {
                                    fieldTranslations6 = null;
                                    uniqueTournament = new UniqueTournament(i31, F09, category, j3, z3, valueOf3, z4, F010, valueOf4, b, fieldTranslations6);
                                }
                            }
                            fieldTranslations6 = new FieldTranslations(sz8Var2.z(!V02.isNull(r48) ? null : V02.F0(r48)), sz8Var2.z(!V02.isNull(i18) ? null : V02.F0(i18)));
                            uniqueTournament = new UniqueTournament(i31, F09, category, j3, z3, valueOf3, z4, F010, valueOf4, b, fieldTranslations6);
                        }
                        sz8Var2 = sz8Var4;
                        fieldTranslations5 = new FieldTranslations(sz8Var2.z(V02.isNull(r46) ? null : V02.F0(r46)), sz8Var2.z(V02.isNull(r47) ? null : V02.F0(r47)));
                        Category category2 = new Category(i32, F011, F012, sport2, fieldTranslations5);
                        if (V02.isNull(r48)) {
                        }
                        fieldTranslations6 = new FieldTranslations(sz8Var2.z(!V02.isNull(r48) ? null : V02.F0(r48)), sz8Var2.z(!V02.isNull(i18) ? null : V02.F0(i18)));
                        uniqueTournament = new UniqueTournament(i31, F09, category2, j3, z3, valueOf3, z4, F010, valueOf4, b, fieldTranslations6);
                    } else {
                        uniqueTournament = null;
                    }
                    V02.close();
                    return uniqueTournament;
                } finally {
                }
            default:
                xxi xxiVar = (xxi) obj2;
                oil oilVar = (oil) obj;
                xxi xxiVar2 = oilVar.w;
                return (xxiVar2 == null || (tournamentRoundWrapper = xxiVar2.d) == null || tournamentRoundWrapper.getId() != i20) ? oilVar : oil.a(oilVar, null, null, null, null, null, false, null, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, xxiVar, null, null, 29360127);
        }
    }

    public /* synthetic */ tj(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ tj(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
