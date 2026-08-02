package androidx.activity;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.afc;
import defpackage.cq3;
import defpackage.d6b;
import defpackage.de;
import defpackage.e6b;
import defpackage.e6g;
import defpackage.f8d;
import defpackage.g6b;
import defpackage.g8d;
import defpackage.gqd;
import defpackage.h5a;
import defpackage.h79;
import defpackage.hjg;
import defpackage.hzf;
import defpackage.i35;
import defpackage.i5k;
import defpackage.je;
import defpackage.joa;
import defpackage.jqd;
import defpackage.jzf;
import defpackage.li5;
import defpackage.ls8;
import defpackage.ly3;
import defpackage.mb3;
import defpackage.me;
import defpackage.nb3;
import defpackage.nqf;
import defpackage.nqg;
import defpackage.ob3;
import defpackage.oqg;
import defpackage.p6b;
import defpackage.pqg;
import defpackage.ptk;
import defpackage.qb3;
import defpackage.qge;
import defpackage.qqg;
import defpackage.qtk;
import defpackage.qzc;
import defpackage.rb3;
import defpackage.rge;
import defpackage.sb3;
import defpackage.stk;
import defpackage.ttk;
import defpackage.u6b;
import defpackage.ub3;
import defpackage.upd;
import defpackage.us5;
import defpackage.vb3;
import defpackage.vpd;
import defpackage.vqd;
import defpackage.vyc;
import defpackage.wx4;
import defpackage.xb3;
import defpackage.xd;
import defpackage.xpd;
import defpackage.y6b;
import defpackage.yb3;
import defpackage.yd;
import defpackage.yec;
import defpackage.yn3;
import defpackage.ypa;
import defpackage.yso;
import defpackage.zec;
import defpackage.zfc;
import defpackage.zpd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u008c\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 è\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\u00022\u00020\n2\u00020\u000b2\u00020\u00022\u00020\f2\u00020\u00022\u00020\r2\u00020\u0002:\bé\u0001¦\u0001ê\u0001ë\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u00122\b\b\u0001\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001a\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001a\u0010\u001eJ#\u0010\u001a\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\u001a\u0010!J#\u0010\"\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0004\b#\u0010\u000fJ\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b+\u0010*J)\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020/2\u0006\u0010,\u001a\u00020\u00182\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020/2\u0006\u0010,\u001a\u00020\u00182\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00182\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:2\u0006\u0010>\u001a\u00020\u0003H\u0016¢\u0006\u0004\b<\u0010?J'\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010A\u001a\u00020@H\u0017¢\u0006\u0004\b<\u0010BJ\u0017\u0010C\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\bC\u0010=J\u000f\u0010D\u001a\u00020\u0012H\u0016¢\u0006\u0004\bD\u0010\u000fJ\u000f\u0010E\u001a\u00020\u0012H\u0017¢\u0006\u0004\bE\u0010\u000fJ\u001f\u0010I\u001a\u00020\u00122\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\u0018H\u0017¢\u0006\u0004\bI\u0010JJ)\u0010I\u001a\u00020\u00122\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\u00182\b\u0010K\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\bI\u0010LJA\u0010R\u001a\u00020\u00122\u0006\u0010G\u001a\u00020M2\u0006\u0010H\u001a\u00020\u00182\b\u0010N\u001a\u0004\u0018\u00010F2\u0006\u0010O\u001a\u00020\u00182\u0006\u0010P\u001a\u00020\u00182\u0006\u0010Q\u001a\u00020\u0018H\u0017¢\u0006\u0004\bR\u0010SJK\u0010R\u001a\u00020\u00122\u0006\u0010G\u001a\u00020M2\u0006\u0010H\u001a\u00020\u00182\b\u0010N\u001a\u0004\u0018\u00010F2\u0006\u0010O\u001a\u00020\u00182\u0006\u0010P\u001a\u00020\u00182\u0006\u0010Q\u001a\u00020\u00182\b\u0010K\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\bR\u0010TJ)\u0010W\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u00182\u0006\u0010U\u001a\u00020\u00182\b\u0010V\u001a\u0004\u0018\u00010FH\u0015¢\u0006\u0004\bW\u0010XJ-\u0010^\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u00182\f\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0Y2\u0006\u0010]\u001a\u00020\\H\u0017¢\u0006\u0004\b^\u0010_JI\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000h\"\u0004\b\u0000\u0010`\"\u0004\b\u0001\u0010a2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010b2\u0006\u0010e\u001a\u00020d2\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00010f¢\u0006\u0004\bi\u0010jJA\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000h\"\u0004\b\u0000\u0010`\"\u0004\b\u0001\u0010a2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010b2\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00010f¢\u0006\u0004\bi\u0010kJ\u0017\u0010n\u001a\u00020\u00122\u0006\u0010m\u001a\u00020lH\u0017¢\u0006\u0004\bn\u0010oJ\u001b\u0010q\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020l0p¢\u0006\u0004\bq\u0010rJ\u001b\u0010s\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020l0p¢\u0006\u0004\bs\u0010rJ\u0017\u0010u\u001a\u00020\u00122\u0006\u0010t\u001a\u00020\u0018H\u0017¢\u0006\u0004\bu\u0010\u001bJ\u001b\u0010v\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180p¢\u0006\u0004\bv\u0010rJ\u001b\u0010w\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180p¢\u0006\u0004\bw\u0010rJ\u0017\u0010x\u001a\u00020\u00122\u0006\u0010G\u001a\u00020FH\u0015¢\u0006\u0004\bx\u0010yJ\u001b\u0010z\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020F0p¢\u0006\u0004\bz\u0010rJ\u001b\u0010{\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020F0p¢\u0006\u0004\b{\u0010rJ\u0017\u0010}\u001a\u00020\u00122\u0006\u0010|\u001a\u00020/H\u0017¢\u0006\u0004\b}\u0010~J\u001f\u0010}\u001a\u00020\u00122\u0006\u0010|\u001a\u00020/2\u0006\u0010m\u001a\u00020lH\u0017¢\u0006\u0004\b}\u0010\u007fJ\u001e\u0010\u0081\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010p¢\u0006\u0005\b\u0081\u0001\u0010rJ\u001e\u0010\u0082\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010p¢\u0006\u0005\b\u0082\u0001\u0010rJ\u001a\u0010\u0084\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020/H\u0017¢\u0006\u0005\b\u0084\u0001\u0010~J\"\u0010\u0084\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020/2\u0006\u0010m\u001a\u00020lH\u0017¢\u0006\u0005\b\u0084\u0001\u0010\u007fJ\u001c\u0010\u0087\u0001\u001a\u00020\u00122\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0017¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001e\u0010\u008a\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010p¢\u0006\u0005\b\u008a\u0001\u0010rJ\u001e\u0010\u008b\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010p¢\u0006\u0005\b\u008b\u0001\u0010rJ\u001e\u0010\u008d\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010p¢\u0006\u0005\b\u008d\u0001\u0010rJ\u001e\u0010\u008e\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010p¢\u0006\u0005\b\u008e\u0001\u0010rJ\u0019\u0010\u0090\u0001\u001a\u00020\u00122\u0007\u0010 \u001a\u00030\u008f\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0019\u0010\u0092\u0001\u001a\u00020\u00122\u0007\u0010 \u001a\u00030\u008f\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u0012H\u0015¢\u0006\u0005\b\u0093\u0001\u0010\u000fJ\u0019\u0010\u0095\u0001\u001a\u00020\u00122\u0007\u0010(\u001a\u00030\u0094\u0001¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0019\u0010\u0097\u0001\u001a\u00020\u00122\u0007\u0010(\u001a\u00030\u0094\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0096\u0001J\u0011\u0010\u0098\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0098\u0001\u0010\u000fR\u0018\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001f\u0010 \u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b \u0001\u0010¡\u0001\u0012\u0005\b¢\u0001\u0010\u000fR\u001c\u0010¤\u0001\u001a\u0005\u0018\u00010£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010§\u0001\u001a\u00030¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R!\u0010®\u0001\u001a\u00030©\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0018\u0010¯\u0001\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b¯\u0001\u0010`R\u0018\u0010±\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001c\u0010³\u0001\u001a\u00020d8\u0006¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R$\u0010¸\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0p0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R$\u0010º\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180p0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010¹\u0001R$\u0010»\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0p0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¹\u0001R%\u0010¼\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0080\u00010p0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010¹\u0001R%\u0010½\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0089\u00010p0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¹\u0001R%\u0010¾\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u00010p0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¹\u0001R\u001f\u0010¿\u0001\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010¹\u0001R\u0019\u0010À\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0019\u0010Â\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Á\u0001R!\u0010Ç\u0001\u001a\u00030Ã\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÄ\u0001\u0010«\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0019\u0010È\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010Á\u0001R!\u0010Í\u0001\u001a\u00030É\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÊ\u0001\u0010«\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R!\u0010Ò\u0001\u001a\u00030Î\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÏ\u0001\u0010«\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Ô\u0001\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÓ\u0001\u0010\u0016R\u0018\u0010Ø\u0001\u001a\u00030Õ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0018\u0010Û\u0001\u001a\u00030£\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u0018\u0010ß\u0001\u001a\u00030Ü\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÝ\u0001\u0010Þ\u0001R\u0018\u0010ã\u0001\u001a\u00030à\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bá\u0001\u0010â\u0001R\u0015\u0010ç\u0001\u001a\u00030ä\u00018F¢\u0006\b\u001a\u0006\bå\u0001\u0010æ\u0001¨\u0006ì\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "", "Lu6b;", "Lttk;", "Lh79;", "Lqqg;", "Lvpd;", "Lg8d;", "Lme;", "Lxpd;", "Lvqd;", "Lgqd;", "Lyec;", "<init>", "()V", "Landroid/os/Bundle;", "outState", "", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Lzpd;", "listener", "addOnContextAvailableListener", "(Lzpd;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Lzfc;", IronSourceConstants.EVENTS_PROVIDER, "addMenuProvider", "(Lzfc;)V", "owner", "(Lzfc;Lu6b;)V", "Le6b;", "state", "(Lzfc;Lu6b;Le6b;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", U3.f.f, "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", PlayerKt.VOLLEYBALL_OPPOSITE, "Lyd;", "contract", "Lje;", "registry", "Lxd;", "callback", "Lde;", "registerForActivityResult", "(Lyd;Lje;Lxd;)Lde;", "(Lyd;Lxd;)Lde;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lyn3;", "addOnConfigurationChangedListener", "(Lyn3;)V", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Lvyc;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroid/app/PictureInPictureUiState;", "pipState", "onPictureInPictureUiStateChanged", "(Landroid/app/PictureInPictureUiState;)V", "Lqge;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "Lhjg;", "addOnPictureInPictureUiStateChangedListener", "removeOnPictureInPictureUiStateChangedListener", "Lrge;", "enterPictureInPictureMode", "(Lrge;)V", "setPictureInPictureParams", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "Lcq3;", "contextAwareHelper", "Lcq3;", "Lafc;", "menuHostHelper", "Lafc;", "Loqg;", "savedStateRegistryController", "Loqg;", "getSavedStateRegistryController$annotations", "Lstk;", "_viewModelStore", "Lstk;", "Lvb3;", "reportFullyDrawnExecutor", "Lvb3;", "Lls8;", "fullyDrawnReporter$delegate", "Ljoa;", "getFullyDrawnReporter", "()Lls8;", "fullyDrawnReporter", "contentLayoutId", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Lje;", "getActivityResultRegistry", "()Lje;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onPictureInPictureUiStateChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Li35;", "onBackPressedInput$delegate", "getOnBackPressedInput", "()Li35;", "onBackPressedInput", "hasPictureInPictureSystemFeature", "Lqtk;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Lqtk;", "defaultViewModelProviderFactory", "Lupd;", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Lupd;", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Lg6b;", "getLifecycle", "()Lg6b;", "lifecycle", "getViewModelStore", "()Lstk;", "viewModelStore", "Lly3;", "getDefaultViewModelCreationExtras", "()Lly3;", "defaultViewModelCreationExtras", "Lf8d;", "getNavigationEventDispatcher", "()Lf8d;", "navigationEventDispatcher", "Lnqg;", "getSavedStateRegistry", "()Lnqg;", "savedStateRegistry", "Companion", "ub3", "xb3", "sb3", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ttk, h79, qqg, vpd, g8d, me, xpd, vqd, gqd, jqd, yec {

    @NotNull
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";

    @NotNull
    private static final sb3 Companion = new sb3();
    public static final /* synthetic */ int a = 0;

    @Nullable
    private stk _viewModelStore;

    @NotNull
    private final je activityResultRegistry;
    private int contentLayoutId;

    /* renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa fullyDrawnReporter;
    private boolean hasPictureInPictureSystemFeature;

    @NotNull
    private final AtomicInteger nextLocalRequestCode;

    /* renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa onBackPressedDispatcher;

    /* renamed from: onBackPressedInput$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa onBackPressedInput;

    @NotNull
    private final CopyOnWriteArrayList<yn3> onConfigurationChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<yn3> onMultiWindowModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<yn3> onNewIntentListeners;

    @NotNull
    private final CopyOnWriteArrayList<yn3> onPictureInPictureModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<yn3> onPictureInPictureUiStateChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<yn3> onTrimMemoryListeners;

    @NotNull
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    @NotNull
    private final vb3 reportFullyDrawnExecutor;

    @NotNull
    private final oqg savedStateRegistryController;

    @NotNull
    private final cq3 contextAwareHelper = new cq3();

    @NotNull
    private final afc menuHostHelper = new afc(new mb3(this, 0));

    public ComponentActivity() {
        final int i = 0;
        pqg pqgVar = new pqg(this, new e6g(this, 8));
        this.savedStateRegistryController = new oqg(pqgVar);
        this.reportFullyDrawnExecutor = new xb3(this);
        final int i2 = 1;
        this.fullyDrawnReporter = ypa.b(new nb3(this, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new yb3(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput = ypa.b(new nb3(this, 2));
        if (getLifecycle() == null) {
            a70.r("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        getLifecycle().a(new p6b(this) { // from class: pb3
            public final /* synthetic */ ComponentActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.p6b
            public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
                Window window;
                View peekDecorView;
                int i3 = i;
                ComponentActivity componentActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = ComponentActivity.a;
                        if (d6bVar == d6b.ON_STOP && (window = componentActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        ComponentActivity.d(componentActivity, u6bVar, d6bVar);
                        break;
                }
            }
        });
        getLifecycle().a(new p6b(this) { // from class: pb3
            public final /* synthetic */ ComponentActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.p6b
            public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
                Window window;
                View peekDecorView;
                int i3 = i2;
                ComponentActivity componentActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = ComponentActivity.a;
                        if (d6bVar == d6b.ON_STOP && (window = componentActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        ComponentActivity.d(componentActivity, u6bVar, d6bVar);
                        break;
                }
            }
        });
        getLifecycle().a(new nqf(this, i2));
        pqgVar.c();
        yso.y(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new qb3(this, i));
        addOnContextAvailableListener(new rb3(this, i));
        this.defaultViewModelProviderFactory = ypa.b(new nb3(this, 3));
        this.onBackPressedDispatcher = ypa.b(new nb3(this, 4));
    }

    public static final void access$ensureViewModelStore(ComponentActivity componentActivity) {
        if (componentActivity._viewModelStore == null) {
            ub3 ub3Var = (ub3) componentActivity.getLastNonConfigurationInstance();
            if (ub3Var != null) {
                componentActivity._viewModelStore = ub3Var.b;
            }
            if (componentActivity._viewModelStore == null) {
                componentActivity._viewModelStore = new stk();
            }
        }
    }

    public static final void d(ComponentActivity componentActivity, u6b u6bVar, d6b d6bVar) {
        if (d6bVar == d6b.ON_DESTROY) {
            componentActivity.contextAwareHelper.b = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            xb3 xb3Var = (xb3) componentActivity.reportFullyDrawnExecutor;
            ComponentActivity componentActivity2 = xb3Var.d;
            componentActivity2.getWindow().getDecorView().removeCallbacks(xb3Var);
            componentActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(xb3Var);
        }
    }

    public static final Bundle e(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        je jeVar = componentActivity.activityResultRegistry;
        jeVar.getClass();
        LinkedHashMap linkedHashMap = jeVar.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jeVar.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jeVar.g));
        return bundle;
    }

    public static final void g(ComponentActivity componentActivity, Context context) {
        context.getClass();
        Bundle a2 = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a2 != null) {
            je jeVar = componentActivity.activityResultRegistry;
            LinkedHashMap linkedHashMap = jeVar.b;
            LinkedHashMap linkedHashMap2 = jeVar.a;
            Bundle bundle = jeVar.g;
            ArrayList<Integer> integerArrayList = a2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                jeVar.d.addAll(stringArrayList2);
            }
            Bundle bundle2 = a2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        i5k.c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                jeVar.b.put(str3, Integer.valueOf(intValue));
            }
        }
    }

    public static final void h(upd updVar, ComponentActivity componentActivity, u6b u6bVar, d6b d6bVar) {
        if (d6bVar == d6b.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            updVar.d(onBackInvokedDispatcher);
        }
    }

    public static final ls8 i(ComponentActivity componentActivity) {
        return new ls8(componentActivity.reportFullyDrawnExecutor, new nb3(componentActivity, 0));
    }

    public static final void j(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!Intrinsics.c(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!Intrinsics.c(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        vb3 vb3Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((xb3) vb3Var).a(decorView);
        super.addContentView(view, params);
    }

    public void addMenuProvider(@NotNull zfc provider, @NotNull u6b owner) {
        provider.getClass();
        owner.getClass();
        afc afcVar = this.menuHostHelper;
        afcVar.b.add(provider);
        afcVar.a.run();
        g6b lifecycle = owner.getLifecycle();
        HashMap hashMap = afcVar.c;
        zec zecVar = (zec) hashMap.remove(provider);
        if (zecVar != null) {
            zecVar.a.d(zecVar.b);
            zecVar.b = null;
        }
        hashMap.put(provider, new zec(lifecycle, new ob3(4, afcVar, provider)));
    }

    @Override // defpackage.xpd
    public final void addOnConfigurationChangedListener(@NotNull yn3 listener) {
        listener.getClass();
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(@NotNull zpd listener) {
        listener.getClass();
        cq3 cq3Var = this.contextAwareHelper;
        cq3Var.getClass();
        ComponentActivity componentActivity = cq3Var.b;
        if (componentActivity != null) {
            listener.a(componentActivity);
        }
        cq3Var.a.add(listener);
    }

    @Override // defpackage.gqd
    public final void addOnMultiWindowModeChangedListener(@NotNull yn3 listener) {
        listener.getClass();
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(@NotNull yn3 listener) {
        listener.getClass();
        this.onNewIntentListeners.add(listener);
    }

    @Override // defpackage.jqd
    public final void addOnPictureInPictureModeChangedListener(@NotNull yn3 listener) {
        listener.getClass();
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    public final void addOnPictureInPictureUiStateChangedListener(@NotNull yn3 listener) {
        listener.getClass();
        this.onPictureInPictureUiStateChangedListeners.add(listener);
    }

    @Override // defpackage.vqd
    public final void addOnTrimMemoryListener(@NotNull yn3 listener) {
        listener.getClass();
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(@NotNull Runnable listener) {
        listener.getClass();
        this.onUserLeaveHintListeners.add(listener);
    }

    public final void enterPictureInPictureMode(@NotNull rge params) {
        throw null;
    }

    @Override // defpackage.me
    @NotNull
    public final je getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // defpackage.h79
    @NotNull
    public ly3 getDefaultViewModelCreationExtras() {
        qzc qzcVar = new qzc(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = qzcVar.a;
        if (application != null) {
            linkedHashMap.put(ptk.d, getApplication());
        }
        linkedHashMap.put(yso.l, this);
        linkedHashMap.put(yso.m, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(yso.n, extras);
        }
        return qzcVar;
    }

    @Override // defpackage.h79
    @NotNull
    public qtk getDefaultViewModelProviderFactory() {
        return (qtk) this.defaultViewModelProviderFactory.getValue();
    }

    @NotNull
    public ls8 getFullyDrawnReporter() {
        return (ls8) this.fullyDrawnReporter.getValue();
    }

    @wx4
    @Nullable
    public Object getLastCustomNonConfigurationInstance() {
        ub3 ub3Var = (ub3) getLastNonConfigurationInstance();
        if (ub3Var != null) {
            return ub3Var.a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, defpackage.u6b
    @NotNull
    public g6b getLifecycle() {
        return super.getLifecycle();
    }

    @Override // defpackage.g8d
    @NotNull
    public f8d getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b().c;
    }

    @Override // defpackage.vpd
    @NotNull
    public final upd getOnBackPressedDispatcher() {
        return (upd) this.onBackPressedDispatcher.getValue();
    }

    @Override // defpackage.qqg
    @NotNull
    public final nqg getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.ttk
    @NotNull
    public stk getViewModelStore() {
        if (getApplication() == null) {
            a70.r("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        stk stkVar = this._viewModelStore;
        if (stkVar == null) {
            ub3 ub3Var = (ub3) getLastNonConfigurationInstance();
            if (ub3Var != null) {
                this._viewModelStore = ub3Var.b;
            }
            stkVar = this._viewModelStore;
            if (stkVar == null) {
                stkVar = new stk();
                this._viewModelStore = stkVar;
            }
        }
        stkVar.getClass();
        return stkVar;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @wx4
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (this.activityResultRegistry.a(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    @wx4
    public void onBackPressed() {
        ((i35) this.onBackPressedInput.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        newConfig.getClass();
        super.onConfigurationChanged(newConfig);
        Iterator<yn3> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        cq3 cq3Var = this.contextAwareHelper;
        cq3Var.getClass();
        cq3Var.b = this;
        Iterator it = cq3Var.a.iterator();
        while (it.hasNext()) {
            ((zpd) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = jzf.b;
        hzf.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, @NotNull Menu menu) {
        menu.getClass();
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        afc afcVar = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = afcVar.b.iterator();
        while (it.hasNext()) {
            ((zfc) it.next()).d(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, @NotNull MenuItem item) {
        item.getClass();
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            Iterator it = this.menuHostHelper.b.iterator();
            while (it.hasNext()) {
                if (((zfc) it.next()).c(item)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, @NotNull Configuration newConfig) {
        newConfig.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<yn3> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                yn3 next = it.next();
                newConfig.getClass();
                next.accept(new vyc(isInMultiWindowMode));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<yn3> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, @NotNull Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((zfc) it.next()).a(menu);
        }
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, @NotNull Configuration newConfig) {
        newConfig.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<yn3> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                yn3 next = it.next();
                newConfig.getClass();
                next.accept(new qge(isInPictureInPictureMode));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(@NotNull PictureInPictureUiState pipState) {
        pipState.getClass();
        super.onPictureInPictureUiStateChanged(pipState);
        hjg b = li5.b(pipState);
        Iterator<yn3> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(b);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, @Nullable View view, @NotNull Menu menu) {
        menu.getClass();
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((zfc) it.next()).b(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @wx4
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        if (this.activityResultRegistry.a(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @wx4
    @Nullable
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        ub3 ub3Var;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        stk stkVar = this._viewModelStore;
        if (stkVar == null && (ub3Var = (ub3) getLastNonConfigurationInstance()) != null) {
            stkVar = ub3Var.b;
        }
        if (stkVar == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        ub3 ub3Var2 = new ub3();
        ub3Var2.a = onRetainCustomNonConfigurationInstance;
        ub3Var2.b = stkVar;
        return ub3Var2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        outState.getClass();
        if (getLifecycle() instanceof y6b) {
            g6b lifecycle = getLifecycle();
            lifecycle.getClass();
            ((y6b) lifecycle).i(e6b.c);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.b(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<yn3> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    @NotNull
    public final <I, O> de registerForActivityResult(@NotNull yd contract, @NotNull je registry, @NotNull xd callback) {
        contract.getClass();
        registry.getClass();
        callback.getClass();
        return registry.d("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // defpackage.yec
    public void removeMenuProvider(@NotNull zfc provider) {
        provider.getClass();
        this.menuHostHelper.a(provider);
    }

    @Override // defpackage.xpd
    public final void removeOnConfigurationChangedListener(@NotNull yn3 listener) {
        listener.getClass();
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(@NotNull zpd listener) {
        listener.getClass();
        cq3 cq3Var = this.contextAwareHelper;
        cq3Var.getClass();
        cq3Var.a.remove(listener);
    }

    @Override // defpackage.gqd
    public final void removeOnMultiWindowModeChangedListener(@NotNull yn3 listener) {
        listener.getClass();
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(@NotNull yn3 listener) {
        listener.getClass();
        this.onNewIntentListeners.remove(listener);
    }

    @Override // defpackage.jqd
    public final void removeOnPictureInPictureModeChangedListener(@NotNull yn3 listener) {
        listener.getClass();
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(@NotNull yn3 listener) {
        listener.getClass();
        this.onPictureInPictureUiStateChangedListeners.remove(listener);
    }

    @Override // defpackage.vqd
    public final void removeOnTrimMemoryListener(@NotNull yn3 listener) {
        listener.getClass();
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(@NotNull Runnable listener) {
        listener.getClass();
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (h5a.M()) {
                Trace.beginSection(h5a.U("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        vb3 vb3Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((xb3) vb3Var).a(decorView);
        super.setContentView(layoutResID);
    }

    public final void setPictureInPictureParams(@NotNull rge params) {
        throw null;
    }

    @Override // android.app.Activity
    @wx4
    public void startActivityForResult(@NotNull Intent intent, int requestCode) {
        intent.getClass();
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    @wx4
    public void startIntentSenderForResult(@NotNull IntentSender intent, int requestCode, @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        intent.getClass();
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // android.app.Activity
    @wx4
    public void startActivityForResult(@NotNull Intent intent, int requestCode, @Nullable Bundle options) {
        intent.getClass();
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    @wx4
    public void startIntentSenderForResult(@NotNull IntentSender intent, int requestCode, @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, @Nullable Bundle options) throws IntentSender.SendIntentException {
        intent.getClass();
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view) {
        initializeViewTreeOwners();
        vb3 vb3Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((xb3) vb3Var).a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        vb3 vb3Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((xb3) vb3Var).a(decorView);
        super.setContentView(view, params);
    }

    @NotNull
    public final <I, O> de registerForActivityResult(@NotNull yd contract, @NotNull xd callback) {
        contract.getClass();
        callback.getClass();
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    @wx4
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<yn3> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new vyc(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    @wx4
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<yn3> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new qge(isInPictureInPictureMode));
        }
    }

    @Override // defpackage.yec
    public void addMenuProvider(@NotNull zfc provider) {
        provider.getClass();
        afc afcVar = this.menuHostHelper;
        afcVar.b.add(provider);
        afcVar.a.run();
    }

    @Override // defpackage.yec
    public void addMenuProvider(@NotNull zfc provider, @NotNull u6b owner, @NotNull e6b state) {
        provider.getClass();
        owner.getClass();
        state.getClass();
        afc afcVar = this.menuHostHelper;
        afcVar.getClass();
        g6b lifecycle = owner.getLifecycle();
        HashMap hashMap = afcVar.c;
        zec zecVar = (zec) hashMap.remove(provider);
        if (zecVar != null) {
            zecVar.a.d(zecVar.b);
            zecVar.b = null;
        }
        hashMap.put(provider, new zec(lifecycle, new us5(3, afcVar, state, provider)));
    }
}
