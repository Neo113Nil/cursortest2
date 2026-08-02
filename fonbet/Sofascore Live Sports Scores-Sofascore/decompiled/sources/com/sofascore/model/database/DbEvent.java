package com.sofascore.model.database;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.EventChanges;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.mvvm.model.VarInProgress;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.ljg;
import defpackage.vxd;
import defpackage.wv8;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\br\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010'\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010-\u0012\b\u0010.\u001a\u0004\u0018\u00010/\u0012\u001a\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0-\u0018\u000101\u0012\b\u00102\u001a\u0004\u0018\u00010\u001d\u0012\b\u00103\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b4\u00105J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010{\u001a\u00020\u0005HÆ\u0003J\u0010\u0010|\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010}\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\t\u0010~\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\n\u0010\u0081\u0001\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\n\u0010\u0084\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0012HÆ\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010JJ\n\u0010\u0087\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010#HÆ\u0003J\u0011\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\u0011\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\u0011\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010aJ\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010aJ\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010aJ\u0011\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010;J\u0012\u0010\u009b\u0001\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010-HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\u001e\u0010\u009d\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0-\u0018\u000101HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003Jâ\u0003\u0010 \u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\u001c\b\u0002\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0-\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0003\u0010¡\u0001J\u0017\u0010¢\u0001\u001a\u00020\u00102\n\u0010£\u0001\u001a\u0005\u0018\u00010¤\u0001HÖ\u0083\u0004J\u000b\u0010¥\u0001\u001a\u00020\u0007HÖ\u0081\u0004J\u000b\u0010¦\u0001\u001a\u00020\u001dHÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010<\u001a\u0004\b=\u0010;R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010<\u001a\u0004\b@\u0010;R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010<\u001a\u0004\bA\u0010;R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bB\u0010?R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010<\u001a\u0004\bC\u0010;R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010<\u001a\u0004\bD\u0010;R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010K\u001a\u0004\bI\u0010JR\u0016\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010?R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bM\u0010?R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010<\u001a\u0004\bN\u0010;R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010<\u001a\u0004\bS\u0010;R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010<\u001a\u0004\bV\u0010;R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010<\u001a\u0004\bW\u0010;R\u0015\u0010 \u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010<\u001a\u0004\bX\u0010;R\u0015\u0010!\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010<\u001a\u0004\bY\u0010;R\u0018\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0015\u0010$\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010<\u001a\u0004\b\\\u0010;R\u0015\u0010%\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010<\u001a\u0004\b]\u0010;R\u0015\u0010&\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010<\u001a\u0004\b^\u0010;R\u0013\u0010'\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b_\u0010UR\u0015\u0010(\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010b\u001a\u0004\b`\u0010aR\u0015\u0010)\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010b\u001a\u0004\bc\u0010aR\u0015\u0010*\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010b\u001a\u0004\bd\u0010aR\u001a\u0010+\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\be\u0010;R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0018\u0010.\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR%\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0-\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0018\u00102\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010UR\u0018\u00103\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010UR\u001a\u0010n\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010F\"\u0004\bp\u0010qR\u001a\u0010r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010?\"\u0004\bt\u0010uR\u001a\u0010v\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010H\"\u0004\bx\u0010y¨\u0006§\u0001"}, d2 = {"Lcom/sofascore/model/database/DbEvent;", "Ljava/io/Serializable;", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "Lcom/sofascore/model/mvvm/model/Season;", "status", "Lcom/sofascore/model/mvvm/model/Status;", "winnerCode", "", "aggregatedWinnerCode", "homeTeamId", "homeSubTeam1Id", "homeSubTeam2Id", "awayTeamId", "awaySubTeam1Id", "awaySubTeam2Id", "hasEventPlayerHeatMap", "", "startTimestamp", "", "endTimestamp", "id", "tournamentId", "uniqueTournamentId", "time", "Lcom/sofascore/model/mvvm/model/Time;", "changes", "Lcom/sofascore/model/mvvm/model/EventChanges;", "previousLegEventId", "lastPeriod", "", "homeRedCards", "awayRedCards", "currentBattingTeamId", "firstToServe", "yardDistance", "Lcom/sofascore/model/database/DbAmericanFootballDownDistance;", "bestOfSets", "bestOfLegs", "finalRound", "winType", "crowdsourcingDataDisplayEnabled", "crowdsourcingEnabled", "finalResultOnly", "streamContentId", "streamContentGeoRestrictions", "", "varInProgress", "Lcom/sofascore/model/mvvm/model/VarInProgress;", "eventFilters", "", "homeTeamSeed", "awayTeamSeed", "<init>", "(Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Status;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;ZJLjava/lang/Long;IILjava/lang/Integer;Lcom/sofascore/model/mvvm/model/Time;Lcom/sofascore/model/mvvm/model/EventChanges;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/database/DbAmericanFootballDownDistance;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Lcom/sofascore/model/mvvm/model/VarInProgress;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getSeason", "()Lcom/sofascore/model/mvvm/model/Season;", "getStatus", "()Lcom/sofascore/model/mvvm/model/Status;", "getWinnerCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAggregatedWinnerCode", "getHomeTeamId", "()I", "getHomeSubTeam1Id", "getHomeSubTeam2Id", "getAwayTeamId", "getAwaySubTeam1Id", "getAwaySubTeam2Id", "getHasEventPlayerHeatMap", "()Z", "getStartTimestamp", "()J", "getEndTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "getTournamentId", "getUniqueTournamentId", "getTime", "()Lcom/sofascore/model/mvvm/model/Time;", "getChanges", "()Lcom/sofascore/model/mvvm/model/EventChanges;", "getPreviousLegEventId", "getLastPeriod", "()Ljava/lang/String;", "getHomeRedCards", "getAwayRedCards", "getCurrentBattingTeamId", "getFirstToServe", "getYardDistance", "()Lcom/sofascore/model/database/DbAmericanFootballDownDistance;", "getBestOfSets", "getBestOfLegs", "getFinalRound", "getWinType", "getCrowdsourcingDataDisplayEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCrowdsourcingEnabled", "getFinalResultOnly", "getStreamContentId", "getStreamContentGeoRestrictions", "()Ljava/util/List;", "getVarInProgress", "()Lcom/sofascore/model/mvvm/model/VarInProgress;", "getEventFilters", "()Ljava/util/Map;", "getHomeTeamSeed", "getAwayTeamSeed", "hide", "getHide", "setHide", "(Z)V", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "getMute", "setMute", "(I)V", "lastUpdate", "getLastUpdate", "setLastUpdate", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "copy", "(Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Status;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;ZJLjava/lang/Long;IILjava/lang/Integer;Lcom/sofascore/model/mvvm/model/Time;Lcom/sofascore/model/mvvm/model/EventChanges;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/database/DbAmericanFootballDownDistance;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Lcom/sofascore/model/mvvm/model/VarInProgress;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/database/DbEvent;", "equals", "other", "", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbEvent implements Serializable {

    @Nullable
    private final Integer aggregatedWinnerCode;

    @Nullable
    private final Integer awayRedCards;

    @Nullable
    private final Integer awaySubTeam1Id;

    @Nullable
    private final Integer awaySubTeam2Id;
    private final int awayTeamId;

    @Nullable
    private final String awayTeamSeed;

    @Nullable
    private final Integer bestOfLegs;

    @Nullable
    private final Integer bestOfSets;

    @Nullable
    private final EventChanges changes;

    @Nullable
    private final Boolean crowdsourcingDataDisplayEnabled;

    @Nullable
    private final Boolean crowdsourcingEnabled;

    @Nullable
    private final Integer currentBattingTeamId;

    @Nullable
    private final Long endTimestamp;

    @Nullable
    private final Map<String, List<String>> eventFilters;

    @Nullable
    private final Boolean finalResultOnly;

    @Nullable
    private final Integer finalRound;

    @Nullable
    private final Integer firstToServe;
    private final boolean hasEventPlayerHeatMap;
    private boolean hide;

    @Nullable
    private final Integer homeRedCards;

    @Nullable
    private final Integer homeSubTeam1Id;

    @Nullable
    private final Integer homeSubTeam2Id;
    private final int homeTeamId;

    @Nullable
    private final String homeTeamSeed;
    private final int id;

    @Nullable
    private final String lastPeriod;
    private long lastUpdate;
    private int mute;

    @Nullable
    private final Integer previousLegEventId;

    @Nullable
    private final Season season;
    private final long startTimestamp;

    @NotNull
    private final Status status;

    @Nullable
    private final List<String> streamContentGeoRestrictions;

    @Nullable
    private final Integer streamContentId;

    @Nullable
    private final Time time;
    private final int tournamentId;

    @Nullable
    private final Integer uniqueTournamentId;

    @Nullable
    private final VarInProgress varInProgress;

    @Nullable
    private final String winType;

    @Nullable
    private final Integer winnerCode;

    @Nullable
    private final DbAmericanFootballDownDistance yardDistance;

    /* JADX WARN: Multi-variable type inference failed */
    public DbEvent(@Nullable Season season, @NotNull Status status, @Nullable Integer num, @Nullable Integer num2, int i, @Nullable Integer num3, @Nullable Integer num4, int i2, @Nullable Integer num5, @Nullable Integer num6, boolean z, long j, @Nullable Long l, int i3, int i4, @Nullable Integer num7, @Nullable Time time, @Nullable EventChanges eventChanges, @Nullable Integer num8, @Nullable String str, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable DbAmericanFootballDownDistance dbAmericanFootballDownDistance, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Integer num16, @Nullable List<String> list, @Nullable VarInProgress varInProgress, @Nullable Map<String, ? extends List<String>> map, @Nullable String str3, @Nullable String str4) {
        status.getClass();
        this.season = season;
        this.status = status;
        this.winnerCode = num;
        this.aggregatedWinnerCode = num2;
        this.homeTeamId = i;
        this.homeSubTeam1Id = num3;
        this.homeSubTeam2Id = num4;
        this.awayTeamId = i2;
        this.awaySubTeam1Id = num5;
        this.awaySubTeam2Id = num6;
        this.hasEventPlayerHeatMap = z;
        this.startTimestamp = j;
        this.endTimestamp = l;
        this.id = i3;
        this.tournamentId = i4;
        this.uniqueTournamentId = num7;
        this.time = time;
        this.changes = eventChanges;
        this.previousLegEventId = num8;
        this.lastPeriod = str;
        this.homeRedCards = num9;
        this.awayRedCards = num10;
        this.currentBattingTeamId = num11;
        this.firstToServe = num12;
        this.yardDistance = dbAmericanFootballDownDistance;
        this.bestOfSets = num13;
        this.bestOfLegs = num14;
        this.finalRound = num15;
        this.winType = str2;
        this.crowdsourcingDataDisplayEnabled = bool;
        this.crowdsourcingEnabled = bool2;
        this.finalResultOnly = bool3;
        this.streamContentId = num16;
        this.streamContentGeoRestrictions = list;
        this.varInProgress = varInProgress;
        this.eventFilters = map;
        this.homeTeamSeed = str3;
        this.awayTeamSeed = str4;
        this.mute = -1;
    }

    public static /* synthetic */ DbEvent copy$default(DbEvent dbEvent, Season season, Status status, Integer num, Integer num2, int i, Integer num3, Integer num4, int i2, Integer num5, Integer num6, boolean z, long j, Long l, int i3, int i4, Integer num7, Time time, EventChanges eventChanges, Integer num8, String str, Integer num9, Integer num10, Integer num11, Integer num12, DbAmericanFootballDownDistance dbAmericanFootballDownDistance, Integer num13, Integer num14, Integer num15, String str2, Boolean bool, Boolean bool2, Boolean bool3, Integer num16, List list, VarInProgress varInProgress, Map map, String str3, String str4, int i5, int i6, Object obj) {
        String str5;
        String str6;
        Integer num17;
        Integer num18;
        Integer num19;
        DbAmericanFootballDownDistance dbAmericanFootballDownDistance2;
        Integer num20;
        Integer num21;
        Integer num22;
        String str7;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Integer num23;
        List list2;
        VarInProgress varInProgress2;
        Map map2;
        int i7;
        int i8;
        Integer num24;
        Integer num25;
        boolean z2;
        long j2;
        Long l2;
        int i9;
        Integer num26;
        Time time2;
        EventChanges eventChanges2;
        Integer num27;
        String str8;
        Integer num28;
        Status status2;
        Integer num29;
        Integer num30;
        int i10;
        Integer num31;
        Integer num32;
        Season season2 = (i5 & 1) != 0 ? dbEvent.season : season;
        Status status3 = (i5 & 2) != 0 ? dbEvent.status : status;
        Integer num33 = (i5 & 4) != 0 ? dbEvent.winnerCode : num;
        Integer num34 = (i5 & 8) != 0 ? dbEvent.aggregatedWinnerCode : num2;
        int i11 = (i5 & 16) != 0 ? dbEvent.homeTeamId : i;
        Integer num35 = (i5 & 32) != 0 ? dbEvent.homeSubTeam1Id : num3;
        Integer num36 = (i5 & 64) != 0 ? dbEvent.homeSubTeam2Id : num4;
        int i12 = (i5 & 128) != 0 ? dbEvent.awayTeamId : i2;
        Integer num37 = (i5 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? dbEvent.awaySubTeam1Id : num5;
        Integer num38 = (i5 & 512) != 0 ? dbEvent.awaySubTeam2Id : num6;
        boolean z3 = (i5 & 1024) != 0 ? dbEvent.hasEventPlayerHeatMap : z;
        long j3 = (i5 & a.o) != 0 ? dbEvent.startTimestamp : j;
        Long l3 = (i5 & 4096) != 0 ? dbEvent.endTimestamp : l;
        Season season3 = season2;
        int i13 = (i5 & 8192) != 0 ? dbEvent.id : i3;
        int i14 = (i5 & 16384) != 0 ? dbEvent.tournamentId : i4;
        Integer num39 = (i5 & 32768) != 0 ? dbEvent.uniqueTournamentId : num7;
        Time time3 = (i5 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? dbEvent.time : time;
        EventChanges eventChanges3 = (i5 & 131072) != 0 ? dbEvent.changes : eventChanges;
        Integer num40 = (i5 & 262144) != 0 ? dbEvent.previousLegEventId : num8;
        String str9 = (i5 & 524288) != 0 ? dbEvent.lastPeriod : str;
        Integer num41 = (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? dbEvent.homeRedCards : num9;
        Integer num42 = (i5 & 2097152) != 0 ? dbEvent.awayRedCards : num10;
        Integer num43 = (i5 & 4194304) != 0 ? dbEvent.currentBattingTeamId : num11;
        Integer num44 = (i5 & 8388608) != 0 ? dbEvent.firstToServe : num12;
        DbAmericanFootballDownDistance dbAmericanFootballDownDistance3 = (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? dbEvent.yardDistance : dbAmericanFootballDownDistance;
        Integer num45 = (i5 & 33554432) != 0 ? dbEvent.bestOfSets : num13;
        Integer num46 = (i5 & 67108864) != 0 ? dbEvent.bestOfLegs : num14;
        Integer num47 = (i5 & 134217728) != 0 ? dbEvent.finalRound : num15;
        String str10 = (i5 & 268435456) != 0 ? dbEvent.winType : str2;
        Boolean bool7 = (i5 & 536870912) != 0 ? dbEvent.crowdsourcingDataDisplayEnabled : bool;
        Boolean bool8 = (i5 & 1073741824) != 0 ? dbEvent.crowdsourcingEnabled : bool2;
        Boolean bool9 = (i5 & Integer.MIN_VALUE) != 0 ? dbEvent.finalResultOnly : bool3;
        Integer num48 = (i6 & 1) != 0 ? dbEvent.streamContentId : num16;
        List list3 = (i6 & 2) != 0 ? dbEvent.streamContentGeoRestrictions : list;
        VarInProgress varInProgress3 = (i6 & 4) != 0 ? dbEvent.varInProgress : varInProgress;
        Map map3 = (i6 & 8) != 0 ? dbEvent.eventFilters : map;
        String str11 = (i6 & 16) != 0 ? dbEvent.homeTeamSeed : str3;
        if ((i6 & 32) != 0) {
            str6 = str11;
            str5 = dbEvent.awayTeamSeed;
            num18 = num43;
            num19 = num44;
            dbAmericanFootballDownDistance2 = dbAmericanFootballDownDistance3;
            num20 = num45;
            num21 = num46;
            num22 = num47;
            str7 = str10;
            bool4 = bool7;
            bool5 = bool8;
            bool6 = bool9;
            num23 = num48;
            list2 = list3;
            varInProgress2 = varInProgress3;
            map2 = map3;
            i7 = i14;
            num24 = num37;
            num25 = num38;
            z2 = z3;
            j2 = j3;
            l2 = l3;
            i9 = i13;
            num26 = num39;
            time2 = time3;
            eventChanges2 = eventChanges3;
            num27 = num40;
            str8 = str9;
            num28 = num41;
            num17 = num42;
            status2 = status3;
            num29 = num33;
            num30 = num34;
            i10 = i11;
            num31 = num35;
            num32 = num36;
            i8 = i12;
        } else {
            str5 = str4;
            str6 = str11;
            num17 = num42;
            num18 = num43;
            num19 = num44;
            dbAmericanFootballDownDistance2 = dbAmericanFootballDownDistance3;
            num20 = num45;
            num21 = num46;
            num22 = num47;
            str7 = str10;
            bool4 = bool7;
            bool5 = bool8;
            bool6 = bool9;
            num23 = num48;
            list2 = list3;
            varInProgress2 = varInProgress3;
            map2 = map3;
            i7 = i14;
            i8 = i12;
            num24 = num37;
            num25 = num38;
            z2 = z3;
            j2 = j3;
            l2 = l3;
            i9 = i13;
            num26 = num39;
            time2 = time3;
            eventChanges2 = eventChanges3;
            num27 = num40;
            str8 = str9;
            num28 = num41;
            status2 = status3;
            num29 = num33;
            num30 = num34;
            i10 = i11;
            num31 = num35;
            num32 = num36;
        }
        return dbEvent.copy(season3, status2, num29, num30, i10, num31, num32, i8, num24, num25, z2, j2, l2, i9, i7, num26, time2, eventChanges2, num27, str8, num28, num17, num18, num19, dbAmericanFootballDownDistance2, num20, num21, num22, str7, bool4, bool5, bool6, num23, list2, varInProgress2, map2, str6, str5);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Season getSeason() {
        return this.season;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getAwaySubTeam2Id() {
        return this.awaySubTeam2Id;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getHasEventPlayerHeatMap() {
        return this.hasEventPlayerHeatMap;
    }

    /* renamed from: component12, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /* renamed from: component14, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component15, reason: from getter */
    public final int getTournamentId() {
        return this.tournamentId;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Time getTime() {
        return this.time;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final EventChanges getChanges() {
        return this.changes;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getPreviousLegEventId() {
        return this.previousLegEventId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final String getLastPeriod() {
        return this.lastPeriod;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getHomeRedCards() {
        return this.homeRedCards;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getAwayRedCards() {
        return this.awayRedCards;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getCurrentBattingTeamId() {
        return this.currentBattingTeamId;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getFirstToServe() {
        return this.firstToServe;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final DbAmericanFootballDownDistance getYardDistance() {
        return this.yardDistance;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getBestOfSets() {
        return this.bestOfSets;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getBestOfLegs() {
        return this.bestOfLegs;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Integer getFinalRound() {
        return this.finalRound;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final String getWinType() {
        return this.winType;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getWinnerCode() {
        return this.winnerCode;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Boolean getCrowdsourcingDataDisplayEnabled() {
        return this.crowdsourcingDataDisplayEnabled;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Boolean getCrowdsourcingEnabled() {
        return this.crowdsourcingEnabled;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Boolean getFinalResultOnly() {
        return this.finalResultOnly;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Integer getStreamContentId() {
        return this.streamContentId;
    }

    @Nullable
    public final List<String> component34() {
        return this.streamContentGeoRestrictions;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final VarInProgress getVarInProgress() {
        return this.varInProgress;
    }

    @Nullable
    public final Map<String, List<String>> component36() {
        return this.eventFilters;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final String getHomeTeamSeed() {
        return this.homeTeamSeed;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final String getAwayTeamSeed() {
        return this.awayTeamSeed;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getAggregatedWinnerCode() {
        return this.aggregatedWinnerCode;
    }

    /* renamed from: component5, reason: from getter */
    public final int getHomeTeamId() {
        return this.homeTeamId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getHomeSubTeam1Id() {
        return this.homeSubTeam1Id;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getHomeSubTeam2Id() {
        return this.homeSubTeam2Id;
    }

    /* renamed from: component8, reason: from getter */
    public final int getAwayTeamId() {
        return this.awayTeamId;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getAwaySubTeam1Id() {
        return this.awaySubTeam1Id;
    }

    @NotNull
    public final DbEvent copy(@Nullable Season season, @NotNull Status status, @Nullable Integer winnerCode, @Nullable Integer aggregatedWinnerCode, int homeTeamId, @Nullable Integer homeSubTeam1Id, @Nullable Integer homeSubTeam2Id, int awayTeamId, @Nullable Integer awaySubTeam1Id, @Nullable Integer awaySubTeam2Id, boolean hasEventPlayerHeatMap, long startTimestamp, @Nullable Long endTimestamp, int id, int tournamentId, @Nullable Integer uniqueTournamentId, @Nullable Time time, @Nullable EventChanges changes, @Nullable Integer previousLegEventId, @Nullable String lastPeriod, @Nullable Integer homeRedCards, @Nullable Integer awayRedCards, @Nullable Integer currentBattingTeamId, @Nullable Integer firstToServe, @Nullable DbAmericanFootballDownDistance yardDistance, @Nullable Integer bestOfSets, @Nullable Integer bestOfLegs, @Nullable Integer finalRound, @Nullable String winType, @Nullable Boolean crowdsourcingDataDisplayEnabled, @Nullable Boolean crowdsourcingEnabled, @Nullable Boolean finalResultOnly, @Nullable Integer streamContentId, @Nullable List<String> streamContentGeoRestrictions, @Nullable VarInProgress varInProgress, @Nullable Map<String, ? extends List<String>> eventFilters, @Nullable String homeTeamSeed, @Nullable String awayTeamSeed) {
        status.getClass();
        return new DbEvent(season, status, winnerCode, aggregatedWinnerCode, homeTeamId, homeSubTeam1Id, homeSubTeam2Id, awayTeamId, awaySubTeam1Id, awaySubTeam2Id, hasEventPlayerHeatMap, startTimestamp, endTimestamp, id, tournamentId, uniqueTournamentId, time, changes, previousLegEventId, lastPeriod, homeRedCards, awayRedCards, currentBattingTeamId, firstToServe, yardDistance, bestOfSets, bestOfLegs, finalRound, winType, crowdsourcingDataDisplayEnabled, crowdsourcingEnabled, finalResultOnly, streamContentId, streamContentGeoRestrictions, varInProgress, eventFilters, homeTeamSeed, awayTeamSeed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbEvent)) {
            return false;
        }
        DbEvent dbEvent = (DbEvent) other;
        return Intrinsics.c(this.season, dbEvent.season) && Intrinsics.c(this.status, dbEvent.status) && Intrinsics.c(this.winnerCode, dbEvent.winnerCode) && Intrinsics.c(this.aggregatedWinnerCode, dbEvent.aggregatedWinnerCode) && this.homeTeamId == dbEvent.homeTeamId && Intrinsics.c(this.homeSubTeam1Id, dbEvent.homeSubTeam1Id) && Intrinsics.c(this.homeSubTeam2Id, dbEvent.homeSubTeam2Id) && this.awayTeamId == dbEvent.awayTeamId && Intrinsics.c(this.awaySubTeam1Id, dbEvent.awaySubTeam1Id) && Intrinsics.c(this.awaySubTeam2Id, dbEvent.awaySubTeam2Id) && this.hasEventPlayerHeatMap == dbEvent.hasEventPlayerHeatMap && this.startTimestamp == dbEvent.startTimestamp && Intrinsics.c(this.endTimestamp, dbEvent.endTimestamp) && this.id == dbEvent.id && this.tournamentId == dbEvent.tournamentId && Intrinsics.c(this.uniqueTournamentId, dbEvent.uniqueTournamentId) && Intrinsics.c(this.time, dbEvent.time) && Intrinsics.c(this.changes, dbEvent.changes) && Intrinsics.c(this.previousLegEventId, dbEvent.previousLegEventId) && Intrinsics.c(this.lastPeriod, dbEvent.lastPeriod) && Intrinsics.c(this.homeRedCards, dbEvent.homeRedCards) && Intrinsics.c(this.awayRedCards, dbEvent.awayRedCards) && Intrinsics.c(this.currentBattingTeamId, dbEvent.currentBattingTeamId) && Intrinsics.c(this.firstToServe, dbEvent.firstToServe) && Intrinsics.c(this.yardDistance, dbEvent.yardDistance) && Intrinsics.c(this.bestOfSets, dbEvent.bestOfSets) && Intrinsics.c(this.bestOfLegs, dbEvent.bestOfLegs) && Intrinsics.c(this.finalRound, dbEvent.finalRound) && Intrinsics.c(this.winType, dbEvent.winType) && Intrinsics.c(this.crowdsourcingDataDisplayEnabled, dbEvent.crowdsourcingDataDisplayEnabled) && Intrinsics.c(this.crowdsourcingEnabled, dbEvent.crowdsourcingEnabled) && Intrinsics.c(this.finalResultOnly, dbEvent.finalResultOnly) && Intrinsics.c(this.streamContentId, dbEvent.streamContentId) && Intrinsics.c(this.streamContentGeoRestrictions, dbEvent.streamContentGeoRestrictions) && Intrinsics.c(this.varInProgress, dbEvent.varInProgress) && Intrinsics.c(this.eventFilters, dbEvent.eventFilters) && Intrinsics.c(this.homeTeamSeed, dbEvent.homeTeamSeed) && Intrinsics.c(this.awayTeamSeed, dbEvent.awayTeamSeed);
    }

    @Nullable
    public final Integer getAggregatedWinnerCode() {
        return this.aggregatedWinnerCode;
    }

    @Nullable
    public final Integer getAwayRedCards() {
        return this.awayRedCards;
    }

    @Nullable
    public final Integer getAwaySubTeam1Id() {
        return this.awaySubTeam1Id;
    }

    @Nullable
    public final Integer getAwaySubTeam2Id() {
        return this.awaySubTeam2Id;
    }

    public final int getAwayTeamId() {
        return this.awayTeamId;
    }

    @Nullable
    public final String getAwayTeamSeed() {
        return this.awayTeamSeed;
    }

    @Nullable
    public final Integer getBestOfLegs() {
        return this.bestOfLegs;
    }

    @Nullable
    public final Integer getBestOfSets() {
        return this.bestOfSets;
    }

    @Nullable
    public final EventChanges getChanges() {
        return this.changes;
    }

    @Nullable
    public final Boolean getCrowdsourcingDataDisplayEnabled() {
        return this.crowdsourcingDataDisplayEnabled;
    }

    @Nullable
    public final Boolean getCrowdsourcingEnabled() {
        return this.crowdsourcingEnabled;
    }

    @Nullable
    public final Integer getCurrentBattingTeamId() {
        return this.currentBattingTeamId;
    }

    @Nullable
    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    public final Map<String, List<String>> getEventFilters() {
        return this.eventFilters;
    }

    @Nullable
    public final Boolean getFinalResultOnly() {
        return this.finalResultOnly;
    }

    @Nullable
    public final Integer getFinalRound() {
        return this.finalRound;
    }

    @Nullable
    public final Integer getFirstToServe() {
        return this.firstToServe;
    }

    public final boolean getHasEventPlayerHeatMap() {
        return this.hasEventPlayerHeatMap;
    }

    public final boolean getHide() {
        return this.hide;
    }

    @Nullable
    public final Integer getHomeRedCards() {
        return this.homeRedCards;
    }

    @Nullable
    public final Integer getHomeSubTeam1Id() {
        return this.homeSubTeam1Id;
    }

    @Nullable
    public final Integer getHomeSubTeam2Id() {
        return this.homeSubTeam2Id;
    }

    public final int getHomeTeamId() {
        return this.homeTeamId;
    }

    @Nullable
    public final String getHomeTeamSeed() {
        return this.homeTeamSeed;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getLastPeriod() {
        return this.lastPeriod;
    }

    public final long getLastUpdate() {
        return this.lastUpdate;
    }

    public final int getMute() {
        return this.mute;
    }

    @Nullable
    public final Integer getPreviousLegEventId() {
        return this.previousLegEventId;
    }

    @Nullable
    public final Season getSeason() {
        return this.season;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    @Nullable
    public final List<String> getStreamContentGeoRestrictions() {
        return this.streamContentGeoRestrictions;
    }

    @Nullable
    public final Integer getStreamContentId() {
        return this.streamContentId;
    }

    @Nullable
    public final Time getTime() {
        return this.time;
    }

    public final int getTournamentId() {
        return this.tournamentId;
    }

    @Nullable
    public final Integer getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    @Nullable
    public final VarInProgress getVarInProgress() {
        return this.varInProgress;
    }

    @Nullable
    public final String getWinType() {
        return this.winType;
    }

    @Nullable
    public final Integer getWinnerCode() {
        return this.winnerCode;
    }

    @Nullable
    public final DbAmericanFootballDownDistance getYardDistance() {
        return this.yardDistance;
    }

    public int hashCode() {
        Season season = this.season;
        int hashCode = (this.status.hashCode() + ((season == null ? 0 : season.hashCode()) * 31)) * 31;
        Integer num = this.winnerCode;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.aggregatedWinnerCode;
        int a = wv8.a(this.homeTeamId, (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        Integer num3 = this.homeSubTeam1Id;
        int hashCode3 = (a + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.homeSubTeam2Id;
        int a2 = wv8.a(this.awayTeamId, (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31, 31);
        Integer num5 = this.awaySubTeam1Id;
        int hashCode4 = (a2 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.awaySubTeam2Id;
        int c = ljg.c(dmi.e((hashCode4 + (num6 == null ? 0 : num6.hashCode())) * 31, 31, this.hasEventPlayerHeatMap), 31, this.startTimestamp);
        Long l = this.endTimestamp;
        int a3 = wv8.a(this.tournamentId, wv8.a(this.id, (c + (l == null ? 0 : l.hashCode())) * 31, 31), 31);
        Integer num7 = this.uniqueTournamentId;
        int hashCode5 = (a3 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Time time = this.time;
        int hashCode6 = (hashCode5 + (time == null ? 0 : time.hashCode())) * 31;
        EventChanges eventChanges = this.changes;
        int hashCode7 = (hashCode6 + (eventChanges == null ? 0 : eventChanges.hashCode())) * 31;
        Integer num8 = this.previousLegEventId;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str = this.lastPeriod;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num9 = this.homeRedCards;
        int hashCode10 = (hashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.awayRedCards;
        int hashCode11 = (hashCode10 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.currentBattingTeamId;
        int hashCode12 = (hashCode11 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.firstToServe;
        int hashCode13 = (hashCode12 + (num12 == null ? 0 : num12.hashCode())) * 31;
        DbAmericanFootballDownDistance dbAmericanFootballDownDistance = this.yardDistance;
        int hashCode14 = (hashCode13 + (dbAmericanFootballDownDistance == null ? 0 : dbAmericanFootballDownDistance.hashCode())) * 31;
        Integer num13 = this.bestOfSets;
        int hashCode15 = (hashCode14 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.bestOfLegs;
        int hashCode16 = (hashCode15 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.finalRound;
        int hashCode17 = (hashCode16 + (num15 == null ? 0 : num15.hashCode())) * 31;
        String str2 = this.winType;
        int hashCode18 = (hashCode17 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.crowdsourcingDataDisplayEnabled;
        int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.crowdsourcingEnabled;
        int hashCode20 = (hashCode19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.finalResultOnly;
        int hashCode21 = (hashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num16 = this.streamContentId;
        int hashCode22 = (hashCode21 + (num16 == null ? 0 : num16.hashCode())) * 31;
        List<String> list = this.streamContentGeoRestrictions;
        int hashCode23 = (hashCode22 + (list == null ? 0 : list.hashCode())) * 31;
        VarInProgress varInProgress = this.varInProgress;
        int hashCode24 = (hashCode23 + (varInProgress == null ? 0 : varInProgress.hashCode())) * 31;
        Map<String, List<String>> map = this.eventFilters;
        int hashCode25 = (hashCode24 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.homeTeamSeed;
        int hashCode26 = (hashCode25 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.awayTeamSeed;
        return hashCode26 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setHide(boolean z) {
        this.hide = z;
    }

    public final void setLastUpdate(long j) {
        this.lastUpdate = j;
    }

    public final void setMute(int i) {
        this.mute = i;
    }

    @NotNull
    public String toString() {
        Season season = this.season;
        Status status = this.status;
        Integer num = this.winnerCode;
        Integer num2 = this.aggregatedWinnerCode;
        int i = this.homeTeamId;
        Integer num3 = this.homeSubTeam1Id;
        Integer num4 = this.homeSubTeam2Id;
        int i2 = this.awayTeamId;
        Integer num5 = this.awaySubTeam1Id;
        Integer num6 = this.awaySubTeam2Id;
        boolean z = this.hasEventPlayerHeatMap;
        long j = this.startTimestamp;
        Long l = this.endTimestamp;
        int i3 = this.id;
        int i4 = this.tournamentId;
        Integer num7 = this.uniqueTournamentId;
        Time time = this.time;
        EventChanges eventChanges = this.changes;
        Integer num8 = this.previousLegEventId;
        String str = this.lastPeriod;
        Integer num9 = this.homeRedCards;
        Integer num10 = this.awayRedCards;
        Integer num11 = this.currentBattingTeamId;
        Integer num12 = this.firstToServe;
        DbAmericanFootballDownDistance dbAmericanFootballDownDistance = this.yardDistance;
        Integer num13 = this.bestOfSets;
        Integer num14 = this.bestOfLegs;
        Integer num15 = this.finalRound;
        String str2 = this.winType;
        Boolean bool = this.crowdsourcingDataDisplayEnabled;
        Boolean bool2 = this.crowdsourcingEnabled;
        Boolean bool3 = this.finalResultOnly;
        Integer num16 = this.streamContentId;
        List<String> list = this.streamContentGeoRestrictions;
        VarInProgress varInProgress = this.varInProgress;
        Map<String, List<String>> map = this.eventFilters;
        String str3 = this.homeTeamSeed;
        String str4 = this.awayTeamSeed;
        StringBuilder sb = new StringBuilder("DbEvent(season=");
        sb.append(season);
        sb.append(", status=");
        sb.append(status);
        sb.append(", winnerCode=");
        vxd.r(num, num2, ", aggregatedWinnerCode=", ", homeTeamId=", sb);
        sb.append(i);
        sb.append(", homeSubTeam1Id=");
        sb.append(num3);
        sb.append(", homeSubTeam2Id=");
        sb.append(num4);
        sb.append(", awayTeamId=");
        sb.append(i2);
        sb.append(", awaySubTeam1Id=");
        vxd.r(num5, num6, ", awaySubTeam2Id=", ", hasEventPlayerHeatMap=", sb);
        sb.append(z);
        sb.append(", startTimestamp=");
        sb.append(j);
        sb.append(", endTimestamp=");
        sb.append(l);
        sb.append(", id=");
        sb.append(i3);
        sb.append(", tournamentId=");
        sb.append(i4);
        sb.append(", uniqueTournamentId=");
        sb.append(num7);
        sb.append(", time=");
        sb.append(time);
        sb.append(", changes=");
        sb.append(eventChanges);
        fn0.x(num8, ", previousLegEventId=", ", lastPeriod=", str, sb);
        fn0.w(num9, num10, ", homeRedCards=", ", awayRedCards=", sb);
        fn0.w(num11, num12, ", currentBattingTeamId=", ", firstToServe=", sb);
        sb.append(", yardDistance=");
        sb.append(dbAmericanFootballDownDistance);
        sb.append(", bestOfSets=");
        sb.append(num13);
        fn0.w(num14, num15, ", bestOfLegs=", ", finalRound=", sb);
        sb.append(", winType=");
        sb.append(str2);
        sb.append(", crowdsourcingDataDisplayEnabled=");
        sb.append(bool);
        sb.append(", crowdsourcingEnabled=");
        sb.append(bool2);
        sb.append(", finalResultOnly=");
        sb.append(bool3);
        sb.append(", streamContentId=");
        sb.append(num16);
        sb.append(", streamContentGeoRestrictions=");
        sb.append(list);
        sb.append(", varInProgress=");
        sb.append(varInProgress);
        sb.append(", eventFilters=");
        sb.append(map);
        bf3.v(sb, ", homeTeamSeed=", str3, ", awayTeamSeed=", str4);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ DbEvent(Season season, Status status, Integer num, Integer num2, int i, Integer num3, Integer num4, int i2, Integer num5, Integer num6, boolean z, long j, Long l, int i3, int i4, Integer num7, Time time, EventChanges eventChanges, Integer num8, String str, Integer num9, Integer num10, Integer num11, Integer num12, DbAmericanFootballDownDistance dbAmericanFootballDownDistance, Integer num13, Integer num14, Integer num15, String str2, Boolean bool, Boolean bool2, Boolean bool3, Integer num16, List list, VarInProgress varInProgress, Map map, String str3, String str4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(season, status, num, num2, i, num3, num4, i2, num5, num6, z, j, l, i3, i4, num7, time, eventChanges, num8, str, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num9, (i5 & 2097152) != 0 ? null : num10, num11, num12, dbAmericanFootballDownDistance, num13, num14, num15, str2, bool, bool2, bool3, num16, list, varInProgress, map, str3, str4);
    }
}
