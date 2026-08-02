package com.zoho.livechat.android.modules.messages.ui.viewmodels;

import De.a;
import Kd.a;
import Ke.a;
import Od.c;
import Od.g;
import Od.h;
import Ph.AbstractC1440a0;
import Ph.AbstractC1455i;
import Ph.AbstractC1457j;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Re.f;
import Re.m;
import Re.o;
import Ye.d;
import a1.C1908a;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.crypto.tink.integration.android.b;
import com.google.gson.Gson;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.modules.conversations.data.local.entities.Bot;
import com.zoho.livechat.android.modules.conversations.domain.entities.LeaveMessageResponse;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.modules.messages.domain.entities.MessageProgress;
import com.zoho.livechat.android.modules.messages.domain.entities.MessageSyncData;
import com.zoho.livechat.android.modules.triggers.data.TriggersRepository;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.AbstractC3945n;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import com.zoho.salesiqembed.android.tracking.UTSUtil;
import ge.C4377a;
import ie.EnumC4544a;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import kotlinx.coroutines.flow.x;
import kotlinx.coroutines.flow.y;
import me.C5582a;
import od.t;
import og.AbstractC5895g;
import og.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.InterfaceC6064a;
import pd.s;
import rd.C6218a;
import re.AbstractC6235a;
import re.C6223E;
import re.C6224F;
import re.C6225G;
import re.C6228J;
import re.C6229K;
import re.C6232N;
import re.C6233O;
import re.C6239e;
import re.C6244j;
import re.C6247m;
import re.C6248n;
import re.C6249o;
import re.C6251q;
import td.C6461a;
import te.AbstractC6462a;
import uf.C6550a;
import we.b;
import we.d;
import we.e;
import wf.EnumC6745a;
import xe.C6822a;
import yf.C6882B;
import yf.C6884a;
import yf.C6885b;
import yf.C6886c;
import yf.C6887d;
import yf.C6888e;
import yf.C6890g;
import yf.j;
import yf.k;
import yf.l;
import yf.p;
import yf.r;
import yf.u;
import yf.v;
import yf.w;
import yf.y;

@Keep
@Metadata(d1 = {"\u0000È\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0004ý\u0003þ\u0003B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJS\u0010\u0014\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J!\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\tJ\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010!\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J)\u0010'\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J1\u0010*\u001a\u00020\u00072\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010)\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010+J#\u0010.\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0082@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J'\u00100\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b0\u00101J+\u00107\u001a\u0004\u0018\u0001062\u000e\u00104\u001a\n\u0018\u000102j\u0004\u0018\u0001`32\b\u00105\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b9\u0010:JA\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040>2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00102\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010=\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b?\u0010@Jq\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040>2\u0006\u0010B\u001a\u00020A2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010C\u001a\u0004\u0018\u00010\u00042\b\u0010D\u001a\u0004\u0018\u00010\u00042\u0006\u0010;\u001a\u00020\u00102\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010E\u001a\u00020\u00102\b\b\u0002\u0010F\u001a\u00020\u00102\b\b\u0002\u0010=\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u001b\u0010I\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\bI\u0010:J\u0019\u0010L\u001a\u0004\u0018\u00010K2\b\u0010J\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u00102\b\u0010J\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u00102\b\u0010J\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bP\u0010OJ\r\u0010Q\u001a\u00020\u0007¢\u0006\u0004\bQ\u0010\u0003J\u001f\u0010R\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\bR\u0010\tJ\u0019\u0010T\u001a\u00020\u00072\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bT\u0010\u001aJ\u0017\u0010U\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bU\u0010\u001aJ\u0019\u0010V\u001a\u00020\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bV\u0010\u001aJ\u001f\u0010W\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bW\u0010XJ\u008d\u0001\u0010a\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010Y\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010]\u001a\u00020\u00102\b\b\u0002\u0010^\u001a\u00020\u00102\b\b\u0002\u0010`\u001a\u00020_2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012¢\u0006\u0004\ba\u0010bJ'\u0010c\u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\bc\u0010dJ'\u0010e\u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\be\u0010dJ%\u0010g\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010f\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\bg\u0010hJ\u0019\u0010i\u001a\u0004\u0018\u00010\f2\b\u0010\\\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bi\u0010jJ\u0015\u0010m\u001a\u00020l2\u0006\u0010k\u001a\u00020\u0004¢\u0006\u0004\bm\u0010nJ\u0015\u0010o\u001a\u00020l2\u0006\u0010k\u001a\u00020\u0004¢\u0006\u0004\bo\u0010nJ\u001f\u0010p\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010f\u001a\u00020\u0010¢\u0006\u0004\bp\u0010qJ-\u0010r\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\u00102\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\br\u0010sJ9\u0010t\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0007¢\u0006\u0004\bt\u0010uJ\u0015\u0010v\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bv\u0010\u001dJA\u0010{\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u00042\u0006\u0010w\u001a\u00020l2\b\u0010x\u001a\u0004\u0018\u00010\u00042\b\u0010y\u001a\u0004\u0018\u00010\u00042\u0006\u0010z\u001a\u00020\u0010¢\u0006\u0004\b{\u0010|J\u0017\u0010}\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b}\u0010jJ\r\u0010~\u001a\u00020\u0007¢\u0006\u0004\b~\u0010\u0003J\u001d\u0010\u007f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u007f\u0010:J+\u0010\u0083\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0007\u0010\u0080\u0001\u001a\u00020\u00042\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0007\u0010\u0080\u0001\u001a\u00020\u00042\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0086@ø\u0001\u0000¢\u0006\u0005\b\u0011\u0010\u0085\u0001J \u0010\u0086\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0007\u0010\u0080\u0001\u001a\u00020\u0004¢\u0006\u0005\b\u0086\u0001\u0010\tJ\u0018\u0010\u0087\u0001\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001e\u0010\u008b\u0001\u001a\u00020\u000e2\f\b\u0002\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001a\u0010\u008b\u0001\u001a\u00020\u000e2\b\u0010J\u001a\u0004\u0018\u00010\u0004¢\u0006\u0006\b\u008b\u0001\u0010\u008d\u0001J/\u0010\u0091\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u008f\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0018\u0010\u0093\u0001\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0006\b\u0093\u0001\u0010\u0088\u0001J\u008c\u0001\u0010\u009e\u0001\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0007\u0010\u0094\u0001\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u008f\u00012\u0007\u0010\u0095\u0001\u001a\u00020\u00042\f\b\u0002\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00012\f\b\u0002\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00012\f\b\u0002\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00012\u000b\b\u0002\u0010\u009c\u0001\u001a\u0004\u0018\u0001062\t\b\u0002\u0010\u009d\u0001\u001a\u00020\u0010¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J9\u0010 \u0001\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0007\u0010\u0094\u0001\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0#¢\u0006\u0006\b \u0001\u0010¡\u0001JJ\u0010¦\u0001\u001a\u00020\u00072\u0007\u0010¢\u0001\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u001d\u0010¥\u0001\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00040£\u0001j\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0004`¤\u0001¢\u0006\u0006\b¦\u0001\u0010§\u0001J+\u0010©\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0007\u0010\u0080\u0001\u001a\u00020\u00042\t\b\u0002\u0010¨\u0001\u001a\u00020\u0010¢\u0006\u0005\b©\u0001\u0010+J\u001f\u0010ª\u0001\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\u0004¢\u0006\u0005\bª\u0001\u0010\tJ\"\u0010©\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001¢\u0006\u0006\b©\u0001\u0010«\u0001J;\u0010\u00ad\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u0004¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J&\u0010¯\u0001\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00042\u0007\u0010\u0080\u0001\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0005\b¯\u0001\u0010dJ)\u0010±\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\t\u0010°\u0001\u001a\u0004\u0018\u00010lH\u0086@ø\u0001\u0000¢\u0006\u0006\b±\u0001\u0010²\u0001J\u001d\u0010³\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0005\b³\u0001\u0010:J\u001f\u0010´\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0005\b´\u0001\u0010\tJ\u001a\u0010·\u0001\u001a\u00020\u00072\b\u0010¶\u0001\u001a\u00030µ\u0001¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u000f\u0010¹\u0001\u001a\u00020\u0007¢\u0006\u0005\b¹\u0001\u0010\u0003J\u0016\u0010º\u0001\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0006\bº\u0001\u0010»\u0001J\u0017\u0010¼\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0005\b¼\u0001\u0010\u001aJt\u0010½\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040>2\u0006\u0010B\u001a\u00020A2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010C\u001a\u0004\u0018\u00010\u00042\b\u0010D\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00042\u0006\u0010;\u001a\u00020\u00102\b\b\u0002\u0010E\u001a\u00020\u00102\b\b\u0002\u0010F\u001a\u00020\u00102\b\b\u0002\u0010=\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u0017\u0010¿\u0001\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0005\b¿\u0001\u0010\u001aJ$\u0010Â\u0001\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010Á\u0001\u001a\u00030À\u0001¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J%\u0010Ä\u0001\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u00042\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u0001¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u001a\u0010È\u0001\u001a\u00020\u00102\b\u0010Ç\u0001\u001a\u00030Æ\u0001¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u000f\u0010Ê\u0001\u001a\u00020\u0007¢\u0006\u0005\bÊ\u0001\u0010\u0003J\"\u0010Í\u0001\u001a\u00020\u00072\b\u0010Ì\u0001\u001a\u00030Ë\u00012\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0006\bÍ\u0001\u0010Î\u0001JD\u0010Ò\u0001\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00042\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010Ñ\u0001\u001a\u00030Ð\u0001¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001R!\u0010Ù\u0001\u001a\u00030Ô\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001R!\u0010Þ\u0001\u001a\u00030Ú\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÛ\u0001\u0010Ö\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001R!\u0010ã\u0001\u001a\u00030ß\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bà\u0001\u0010Ö\u0001\u001a\u0006\bá\u0001\u0010â\u0001R!\u0010è\u0001\u001a\u00030ä\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bå\u0001\u0010Ö\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001R!\u0010í\u0001\u001a\u00030é\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bê\u0001\u0010Ö\u0001\u001a\u0006\bë\u0001\u0010ì\u0001R!\u0010ò\u0001\u001a\u00030î\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bï\u0001\u0010Ö\u0001\u001a\u0006\bð\u0001\u0010ñ\u0001R!\u0010÷\u0001\u001a\u00030ó\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bô\u0001\u0010Ö\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001R!\u0010ü\u0001\u001a\u00030ø\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bù\u0001\u0010Ö\u0001\u001a\u0006\bú\u0001\u0010û\u0001R!\u0010\u0081\u0002\u001a\u00030ý\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bþ\u0001\u0010Ö\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R!\u0010\u0086\u0002\u001a\u00030\u0082\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0083\u0002\u0010Ö\u0001\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002R \u0010{\u001a\u00030\u0087\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010Ö\u0001\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002R!\u0010\u008f\u0002\u001a\u00030\u008b\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008c\u0002\u0010Ö\u0001\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002R!\u0010\u00ad\u0001\u001a\u00030\u0090\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0091\u0002\u0010Ö\u0001\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R!\u0010\u0098\u0002\u001a\u00030\u0094\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0002\u0010Ö\u0001\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R!\u0010\u009d\u0002\u001a\u00030\u0099\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009a\u0002\u0010Ö\u0001\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R!\u0010¢\u0002\u001a\u00030\u009e\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009f\u0002\u0010Ö\u0001\u001a\u0006\b \u0002\u0010¡\u0002R!\u0010§\u0002\u001a\u00030£\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¤\u0002\u0010Ö\u0001\u001a\u0006\b¥\u0002\u0010¦\u0002R!\u0010¬\u0002\u001a\u00030¨\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b©\u0002\u0010Ö\u0001\u001a\u0006\bª\u0002\u0010«\u0002R!\u0010±\u0002\u001a\u00030\u00ad\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0002\u0010Ö\u0001\u001a\u0006\b¯\u0002\u0010°\u0002R!\u0010¶\u0002\u001a\u00030²\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b³\u0002\u0010Ö\u0001\u001a\u0006\b´\u0002\u0010µ\u0002R!\u0010Ä\u0001\u001a\u00030·\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¸\u0002\u0010Ö\u0001\u001a\u0006\b¹\u0002\u0010º\u0002R!\u0010¿\u0002\u001a\u00030»\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¼\u0002\u0010Ö\u0001\u001a\u0006\b½\u0002\u0010¾\u0002R!\u0010Ä\u0002\u001a\u00030À\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÁ\u0002\u0010Ö\u0001\u001a\u0006\bÂ\u0002\u0010Ã\u0002R \u0010e\u001a\u00030Å\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÆ\u0002\u0010Ö\u0001\u001a\u0006\bÇ\u0002\u0010È\u0002R!\u0010Í\u0002\u001a\u00030É\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÊ\u0002\u0010Ö\u0001\u001a\u0006\bË\u0002\u0010Ì\u0002R!\u0010\u009e\u0001\u001a\u00030Î\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÏ\u0002\u0010Ö\u0001\u001a\u0006\bÐ\u0002\u0010Ñ\u0002R!\u0010\u0091\u0001\u001a\u00030Ò\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÓ\u0002\u0010Ö\u0001\u001a\u0006\bÔ\u0002\u0010Õ\u0002R!\u0010Ú\u0002\u001a\u00030Ö\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b×\u0002\u0010Ö\u0001\u001a\u0006\bØ\u0002\u0010Ù\u0002R!\u0010ß\u0002\u001a\u00030Û\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÜ\u0002\u0010Ö\u0001\u001a\u0006\bÝ\u0002\u0010Þ\u0002R!\u0010ä\u0002\u001a\u00030à\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bá\u0002\u0010Ö\u0001\u001a\u0006\bâ\u0002\u0010ã\u0002R!\u0010©\u0001\u001a\u00030å\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bæ\u0002\u0010Ö\u0001\u001a\u0006\bç\u0002\u0010è\u0002R \u0010\u0011\u001a\u00030é\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bê\u0002\u0010Ö\u0001\u001a\u0006\bë\u0002\u0010ì\u0002R!\u0010\u0086\u0001\u001a\u00030í\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bî\u0002\u0010Ö\u0001\u001a\u0006\bï\u0002\u0010ð\u0002R \u0010a\u001a\u00030ñ\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bò\u0002\u0010Ö\u0001\u001a\u0006\bó\u0002\u0010ô\u0002R!\u0010¯\u0001\u001a\u00030õ\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bö\u0002\u0010Ö\u0001\u001a\u0006\b÷\u0002\u0010ø\u0002R!\u0010ý\u0002\u001a\u00030ù\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bú\u0002\u0010Ö\u0001\u001a\u0006\bû\u0002\u0010ü\u0002R!\u0010º\u0001\u001a\u00030þ\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÿ\u0002\u0010Ö\u0001\u001a\u0006\bº\u0001\u0010\u0080\u0003R \u0010\b\u001a\u00030\u0081\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0082\u0003\u0010Ö\u0001\u001a\u0006\b\u0083\u0003\u0010\u0084\u0003R!\u0010\u0089\u0003\u001a\u00030\u0085\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0086\u0003\u0010Ö\u0001\u001a\u0006\b\u0087\u0003\u0010\u0088\u0003R!\u0010\u008e\u0003\u001a\u00030\u008a\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0003\u0010Ö\u0001\u001a\u0006\b\u008c\u0003\u0010\u008d\u0003R!\u0010·\u0001\u001a\u00030\u008f\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0003\u0010Ö\u0001\u001a\u0006\b\u0091\u0003\u0010\u0092\u0003R!\u0010\u0097\u0003\u001a\u00030\u0093\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0094\u0003\u0010Ö\u0001\u001a\u0006\b\u0095\u0003\u0010\u0096\u0003R!\u0010\u009c\u0003\u001a\u00030\u0098\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0003\u0010Ö\u0001\u001a\u0006\b\u009a\u0003\u0010\u009b\u0003R \u0010G\u001a\u00030\u009d\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0003\u0010Ö\u0001\u001a\u0006\b\u009f\u0003\u0010 \u0003R!\u0010¥\u0003\u001a\u00030¡\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¢\u0003\u0010Ö\u0001\u001a\u0006\b£\u0003\u0010¤\u0003R!\u0010ª\u0003\u001a\u00030¦\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b§\u0003\u0010Ö\u0001\u001a\u0006\b¨\u0003\u0010©\u0003R!\u0010¯\u0003\u001a\u00030«\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¬\u0003\u0010Ö\u0001\u001a\u0006\b\u00ad\u0003\u0010®\u0003R\u001f\u0010²\u0003\u001a\n\u0012\u0005\u0012\u00030±\u00030°\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0003\u0010³\u0003R$\u0010µ\u0003\u001a\n\u0012\u0005\u0012\u00030±\u00030´\u00038\u0006¢\u0006\u0010\n\u0006\bµ\u0003\u0010¶\u0003\u001a\u0006\b·\u0003\u0010¸\u0003R\u001c\u0010º\u0003\u001a\u0005\u0018\u00010¹\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0003\u0010»\u0003R\u001c\u0010¼\u0003\u001a\u0005\u0018\u00010¹\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0003\u0010»\u0003R(\u0010¾\u0003\u001a\u0013\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010#0½\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0003\u0010¿\u0003R1\u0010Ä\u0003\u001a\u0013\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010#0À\u00038FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÁ\u0003\u0010Ö\u0001\u001a\u0006\bÂ\u0003\u0010Ã\u0003R\u001f\u0010Æ\u0003\u001a\n\u0012\u0005\u0012\u00030Å\u00030½\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0003\u0010¿\u0003R(\u0010É\u0003\u001a\n\u0012\u0005\u0012\u00030Å\u00030À\u00038FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÇ\u0003\u0010Ö\u0001\u001a\u0006\bÈ\u0003\u0010Ã\u0003R\u0019\u0010Ê\u0003\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0003\u0010Ë\u0003R+\u0010Ì\u0003\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÌ\u0003\u0010Í\u0003\u001a\u0006\bÌ\u0003\u0010Î\u0003\"\u0006\bÏ\u0003\u0010Ð\u0003R)\u0010Ñ\u0003\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÑ\u0003\u0010Ë\u0003\u001a\u0006\bÑ\u0003\u0010Ò\u0003\"\u0006\bÓ\u0003\u0010Ô\u0003R)\u0010Õ\u0003\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÕ\u0003\u0010Ë\u0003\u001a\u0006\bÕ\u0003\u0010Ò\u0003\"\u0006\bÖ\u0003\u0010Ô\u0003R%\u0010Ø\u0003\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030×\u00030#0½\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0003\u0010¿\u0003R.\u0010Û\u0003\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030×\u00030#0À\u00038FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÙ\u0003\u0010Ö\u0001\u001a\u0006\bÚ\u0003\u0010Ã\u0003R(\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0005\u0010Ü\u0003\u001a\u0006\bÝ\u0003\u0010Þ\u0003\"\u0005\bß\u0003\u0010\u001aR(\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0006\u0010Ü\u0003\u001a\u0006\bà\u0003\u0010Þ\u0003\"\u0005\bá\u0003\u0010\u001aR2\u0010â\u0003\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0½\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bâ\u0003\u0010¿\u0003\u001a\u0006\bã\u0003\u0010ä\u0003\"\u0006\bå\u0003\u0010æ\u0003R2\u0010ç\u0003\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040½\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bç\u0003\u0010¿\u0003\u001a\u0006\bè\u0003\u0010ä\u0003\"\u0006\bé\u0003\u0010æ\u0003R'\u0010\u001f\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u001f\u0010Ë\u0003\u001a\u0006\bê\u0003\u0010Ò\u0003\"\u0006\bë\u0003\u0010Ô\u0003R2\u0010ì\u0003\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040½\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bì\u0003\u0010¿\u0003\u001a\u0006\bí\u0003\u0010ä\u0003\"\u0006\bî\u0003\u0010æ\u0003R \u0010ð\u0003\u001a\t\u0012\u0004\u0012\u00020\u00040ï\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0003\u0010ñ\u0003R\u0018\u0010õ\u0003\u001a\u00030ò\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bó\u0003\u0010ô\u0003R\u0018\u0010ù\u0003\u001a\u00030ö\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b÷\u0003\u0010ø\u0003R\u0016\u0010ü\u0003\u001a\u0004\u0018\u00010\u001e8F¢\u0006\b\u001a\u0006\bú\u0003\u0010û\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006ÿ\u0003"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/ui/viewmodels/ChatViewModel;", "Landroidx/lifecycle/Q;", "<init>", "()V", "", "acknowledgementKey", "chatId", "", "refreshMessages", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/zoho/livechat/android/models/SalesIQChat;", "salesIQChat", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;", "message", "Lie/a;", "appStatus", "", "updateMessageStatus", "Lkotlin/Function1;", "onComplete", "sendPreChatFormQuestion", "(Lcom/zoho/livechat/android/models/SalesIQChat;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;Lie/a;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncTopSyncCompletionData", "conversationId", "loadMessages", "collectMessageDataTransferProgress", "(Ljava/lang/String;)V", "chat", "addInlineFormMessage", "(Lcom/zoho/livechat/android/models/SalesIQChat;)V", "Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message;", "dismissEditReplyLayoutInNextUpdate", "Lkotlin/Function0;", "addFormMessage", "(Lcom/zoho/livechat/android/models/SalesIQChat;Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message;ZLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "messages", "", "typingDelayInSeconds", "syncMessagesAsync", "(Ljava/util/List;Ljava/lang/Long;)V", "addStartTimer", "sendRefreshBroadCast", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lme/a$b;", "error", "invokeStartChatCallbackFailure", "(Ljava/lang/String;Lme/a$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleFormAndDepartmentStatusDiffersFallback", "(Lcom/zoho/livechat/android/models/SalesIQChat;Lie/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "stringBuilder", "filename", "Ljava/io/File;", "writeStringToFile", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/io/File;", "loadDraftIntoConversation", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasCustomChatId", "customActionName", "ignoreDepartmentValidation", "Lme/a;", "initiateVTSTriggerApi", "(Ljava/lang/String;ZLjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LRf/a;", "actionType", "senderId", "language", "shouldUseTriggerCache", "ignoreDelay", "initiateTrigger", "(LRf/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeStartChatCallback", "departmentId", "Lcom/zoho/livechat/android/modules/common/domain/entities/Form;", "getCurrentForm", "(Ljava/lang/String;)Lcom/zoho/livechat/android/modules/common/domain/entities/Form;", "isAllFormMessagesReceived", "(Ljava/lang/String;)Z", "isAllFormMessagesReceivedForTrigger", "resetMessageActionState", "setAndRefreshCurrentConversationData", "tag", "syncBrandStatus", "saveDraft", "mailTranscript", "sendPreChatFormQuestionAsync", "(Lcom/zoho/livechat/android/models/SalesIQChat;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;)V", "rChatId", "fromTime", "toTime", "messageUId", "isProactiveChat", "isInitialCall", "Lyf/y$a;", "syncType", "syncMessagesTranscript", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ZZLyf/y$a;Lkotlin/jvm/functions/Function1;)V", "getFirstMessage", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastMessage", "addPreviousMessageTime", "addMessage", "(Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessage", "(Ljava/lang/String;)Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;", StackTraceHelper.ID_KEY, "", "getMessagePositionUID", "(Ljava/lang/String;)I", "getMessagePositionById", "addMessageBlocking", "(Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;Z)V", "addMessageAsync", "(Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;ZLjava/lang/String;)V", "addFormMessageAsync", "(Lcom/zoho/livechat/android/models/SalesIQChat;Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message;ZLkotlin/jvm/functions/Function0;)V", "addInlineFormMessageAsync", "chatStatus", "attenderEmail", "attenderId", "isBotAttender", "startNewConversation", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "getQuestionBlocking", "getLastOperatorMessage", "getQuestion", "messageId", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$f;", "status", "updateMessageStatusAsync", "(Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$f;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelMessageTransfer", "retrySendingMessage", "(Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;)V", "Lcom/zoho/livechat/android/modules/core/domain/entities/Channel$Department;", "department", "getAppStatus", "(Lcom/zoho/livechat/android/modules/core/domain/entities/Channel$Department;)Lie/a;", "(Ljava/lang/String;)Lie/a;", "text", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;", "messageType", "sendContextMessage", "(Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;)V", "resendContextMessage", "visitorId", "clientMessageId", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment;", "attachment", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Extras;", "extras", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$RespondedMessage;", "respondedMessage", "file", "forceStopSending", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Extras;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$RespondedMessage;Ljava/io/File;Z)V", "sendAllAsSingleMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "encryptedConversationId", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "logs", "sendLog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "includeChainedMessages", "deleteMessage", "deleteMessageFromRemote", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;)V", "pageTitle", "leaveAsMissedConversation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "readMessage", "unreadCount", "updateUnreadCount", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endChatTimer", "join", "Lie/b;", "debugInfoData", "logDebugInfo", "(Lie/b;)V", "loadDraftIntoConversationAsync", "isFeedbackExpired", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFeedbackCardsIfExpired", "initiateTriggerApi", "(LRf/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeStartChatCallbackAsync", "LRe/f$a;", "type", "getStatusMessage", "(Ljava/lang/String;LRe/f$a;)Ljava/lang/String;", "updateMessageExtras", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Extras;)V", "Lwf/a;", "messageAction", "isActionEnabled", "(Lwf/a;)Z", "isMultipleChatRestrictedAsync", "Landroid/content/Context;", "context", "startCall", "(Landroid/content/Context;Lcom/zoho/livechat/android/models/SalesIQChat;)V", "questionId", "Lcom/zoho/livechat/android/modules/messages/ui/viewmodels/ChatViewModel$a;", "source", "reopenConversation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/ui/viewmodels/ChatViewModel$a;)V", "Luf/a;", "messagesRepository$delegate", "Lkotlin/Lazy;", "getMessagesRepository", "()Luf/a;", "messagesRepository", "LKe/a;", "conversationsRepository$delegate", "getConversationsRepository", "()LKe/a;", "conversationsRepository", "Lcom/zoho/livechat/android/modules/triggers/data/TriggersRepository;", "triggersRepository$delegate", "getTriggersRepository", "()Lcom/zoho/livechat/android/modules/triggers/data/TriggersRepository;", "triggersRepository", "Lge/a;", "commonRepository$delegate", "getCommonRepository", "()Lge/a;", "commonRepository", "LKd/a;", "brandRepository$delegate", "getBrandRepository", "()LKd/a;", "brandRepository", "LOd/g;", "syncBrandStatusUseCase$delegate", "getSyncBrandStatusUseCase", "()LOd/g;", "syncBrandStatusUseCase", "LOd/h;", "syncFormUseCase$delegate", "getSyncFormUseCase", "()LOd/h;", "syncFormUseCase", "LOd/a;", "clearFormUseCase$delegate", "getClearFormUseCase", "()LOd/a;", "clearFormUseCase", "LOd/c;", "getFormUseCase$delegate", "getGetFormUseCase", "()LOd/c;", "getFormUseCase", "LOd/b;", "getCurrentFormMessageUseCase$delegate", "getGetCurrentFormMessageUseCase", "()LOd/b;", "getCurrentFormMessageUseCase", "LRe/m;", "startNewConversation$delegate", "getStartNewConversation", "()LRe/m;", "LRe/f;", "getFlowMessage$delegate", "getGetFlowMessage", "()LRe/f;", "getFlowMessage", "LRe/i;", "leaveAsMissedConversation$delegate", "getLeaveAsMissedConversation", "()LRe/i;", "LRe/h;", "joinConversation$delegate", "getJoinConversation", "()LRe/h;", "joinConversation", "LRe/k;", "mailTranscriptUseCase$delegate", "getMailTranscriptUseCase", "()LRe/k;", "mailTranscriptUseCase", "LRe/l;", "saveDraftMessage$delegate", "getSaveDraftMessage", "()LRe/l;", "saveDraftMessage", "Lyf/a;", "addMessageUseCase$delegate", "getAddMessageUseCase", "()Lyf/a;", "addMessageUseCase", "Lyf/k;", "getMessagesUseCase$delegate", "getGetMessagesUseCase", "()Lyf/k;", "getMessagesUseCase", "Lyf/i;", "getMessageDataTransferProgressUseCase$delegate", "getGetMessageDataTransferProgressUseCase", "()Lyf/i;", "getMessageDataTransferProgressUseCase", "LRe/j;", "loadDraftMessageIntoConversationFromForms$delegate", "getLoadDraftMessageIntoConversationFromForms", "()LRe/j;", "loadDraftMessageIntoConversationFromForms", "Lyf/B;", "updateMessageExtras$delegate", "getUpdateMessageExtras", "()Lyf/B;", "Lyf/l;", "getTopAndBottomSyncCompletionData$delegate", "getGetTopAndBottomSyncCompletionData", "()Lyf/l;", "getTopAndBottomSyncCompletionData", "Lyf/j;", "getMessageUseCase$delegate", "getGetMessageUseCase", "()Lyf/j;", "getMessageUseCase", "Lyf/h;", "getLastMessage$delegate", "getGetLastMessage", "()Lyf/h;", "Lyf/x;", "syncMessage$delegate", "getSyncMessage", "()Lyf/x;", "syncMessage", "Lyf/w;", "sendMessage$delegate", "getSendMessage", "()Lyf/w;", "Lyf/v;", "sendContextMessage$delegate", "getSendContextMessage", "()Lyf/v;", "Lyf/u;", "sendAllMessageAsSingleMessage$delegate", "getSendAllMessageAsSingleMessage", "()Lyf/u;", "sendAllMessageAsSingleMessage", "Lyf/t;", "retrySendingMessageUseCase$delegate", "getRetrySendingMessageUseCase", "()Lyf/t;", "retrySendingMessageUseCase", "Lyf/r;", "resendContextMessageUseCase$delegate", "getResendContextMessageUseCase", "()Lyf/r;", "resendContextMessageUseCase", "Lyf/e;", "deleteMessage$delegate", "getDeleteMessage", "()Lyf/e;", "Lyf/D;", "updateMessageStatus$delegate", "getUpdateMessageStatus", "()Lyf/D;", "Lyf/c;", "cancelMessageTransfer$delegate", "getCancelMessageTransfer", "()Lyf/c;", "Lyf/y;", "syncMessagesTranscript$delegate", "getSyncMessagesTranscript", "()Lyf/y;", "Lyf/o;", "readMessage$delegate", "getReadMessage", "()Lyf/o;", "Lyf/b;", "addMessages$delegate", "getAddMessages", "()Lyf/b;", "addMessages", "Lyf/g;", "isFeedbackExpired$delegate", "()Lyf/g;", "Lyf/p;", "refreshMessages$delegate", "getRefreshMessages", "()Lyf/p;", "Lyf/F;", "updateMessageTypingStatus$delegate", "getUpdateMessageTypingStatus", "()Lyf/F;", "updateMessageTypingStatus", "Lyf/m;", "messageActionUseCases$delegate", "getMessageActionUseCases", "()Lyf/m;", "messageActionUseCases", "LGe/e;", "logDebugInfo$delegate", "getLogDebugInfo", "()LGe/e;", "LRe/o;", "updateConversation$delegate", "getUpdateConversation", "()LRe/o;", "updateConversation", "LSf/f;", "initiateVTSTrigger$delegate", "getInitiateVTSTrigger", "()LSf/f;", "initiateVTSTrigger", "LSf/e;", "initiateTrigger$delegate", "getInitiateTrigger", "()LSf/e;", "Lyf/d;", "deleteFeedbackCardsIfExpiredUseCase$delegate", "getDeleteFeedbackCardsIfExpiredUseCase", "()Lyf/d;", "deleteFeedbackCardsIfExpiredUseCase", "LRd/a;", "callsRepository$delegate", "getCallsRepository", "()LRd/a;", "callsRepository", "LXd/c;", "initiateCallUseCase$delegate", "getInitiateCallUseCase", "()LXd/c;", "initiateCallUseCase", "Lkotlinx/coroutines/flow/x;", "Lcom/zoho/livechat/android/modules/messages/ui/viewmodels/ChatViewModel$b;", "_uiEvents", "Lkotlinx/coroutines/flow/x;", "Lkotlinx/coroutines/flow/C;", "uiEvents", "Lkotlinx/coroutines/flow/C;", "getUiEvents", "()Lkotlinx/coroutines/flow/C;", "LPh/C0;", "messageLoadingJob", "LPh/C0;", "messageDataTransferProgressJob", "Lkotlinx/coroutines/flow/y;", "messagesMutableStateFlow", "Lkotlinx/coroutines/flow/y;", "Lkotlinx/coroutines/flow/L;", "messagesStateFlow$delegate", "getMessagesStateFlow", "()Lkotlinx/coroutines/flow/L;", "messagesStateFlow", "Lcom/zoho/livechat/android/modules/messages/domain/entities/MessageSyncData;", "messagesSyncDataMutableStateFlow", "messagesSyncDataStateFlow$delegate", "getMessagesSyncDataStateFlow", "messagesSyncDataStateFlow", "isMessagesApiInProgress", "Z", "isChatOpeningApiInProgress", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setChatOpeningApiInProgress", "(Ljava/lang/Boolean;)V", "isInitialTranscriptCallCompleted", "()Z", "setInitialTranscriptCallCompleted", "(Z)V", "isMessagesReceivedAfterFirstApi", "setMessagesReceivedAfterFirstApi", "Lcom/zoho/livechat/android/modules/messages/domain/entities/MessageProgress;", "messageDataTransferProgressMutableStateFlow", "messageDataTransferProgressStateFlow$delegate", "getMessageDataTransferProgressStateFlow", "messageDataTransferProgressStateFlow", "Ljava/lang/String;", "getAcknowledgementKey", "()Ljava/lang/String;", "setAcknowledgementKey", "getChatId", "setChatId", "currentEditMessage", "getCurrentEditMessage", "()Lkotlinx/coroutines/flow/y;", "setCurrentEditMessage", "(Lkotlinx/coroutines/flow/y;)V", "replyMessageUId", "getReplyMessageUId", "setReplyMessageUId", "getDismissEditReplyLayoutInNextUpdate", "setDismissEditReplyLayoutInNextUpdate", "originalMessageContent", "getOriginalMessageContent", "setOriginalMessageContent", "", "currentOnGoingReadMessageIds", "Ljava/util/Set;", "LPh/P;", "getAppScope", "()LPh/P;", "appScope", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "application", "getCurrentFormMessage", "()Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message;", "currentFormMessage", "a", b.f37029b, "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatViewModel.kt\ncom/zoho/livechat/android/modules/messages/ui/viewmodels/ChatViewModel\n+ 2 SalesIQResult.kt\ncom/zoho/livechat/android/modules/common/result/SalesIQResult\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,1735:1\n27#2,5:1736\n27#2,5:1825\n58#2,5:1830\n27#2,5:1839\n46#2,9:1844\n27#2,5:1853\n58#2,5:1860\n27#2,5:1865\n58#2,5:1870\n1#3:1741\n360#4,7:1742\n360#4,7:1749\n1863#4,2:1835\n1863#4,2:1837\n1863#4,2:1858\n108#5:1756\n80#5,22:1757\n108#5:1779\n80#5,22:1780\n108#5:1802\n80#5,22:1803\n*S KotlinDebug\n*F\n+ 1 ChatViewModel.kt\ncom/zoho/livechat/android/modules/messages/ui/viewmodels/ChatViewModel\n*L\n403#1:1736,5\n726#1:1825,5\n729#1:1830,5\n1171#1:1839,5\n1173#1:1844,9\n1219#1:1853,5\n1493#1:1860,5\n1500#1:1865,5\n1524#1:1870,5\n577#1:1742,7\n581#1:1749,7\n905#1:1835,2\n1113#1:1837,2\n1350#1:1858,2\n676#1:1756\n676#1:1757,22\n679#1:1779\n679#1:1780,22\n684#1:1802\n684#1:1803,22\n*E\n"})
/* loaded from: classes4.dex */
public final class ChatViewModel extends androidx.lifecycle.Q {

    @NotNull
    private final x _uiEvents;

    @Nullable
    private String acknowledgementKey;

    @Nullable
    private String chatId;

    @NotNull
    private y currentEditMessage;

    @NotNull
    private Set<String> currentOnGoingReadMessageIds;
    private boolean dismissEditReplyLayoutInNextUpdate;

    @Nullable
    private Boolean isChatOpeningApiInProgress;
    private boolean isInitialTranscriptCallCompleted;
    private boolean isMessagesApiInProgress;
    private boolean isMessagesReceivedAfterFirstApi;

    @Nullable
    private Ph.C0 messageDataTransferProgressJob;

    @NotNull
    private final y messageDataTransferProgressMutableStateFlow;

    /* renamed from: messageDataTransferProgressStateFlow$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy messageDataTransferProgressStateFlow;

    @Nullable
    private Ph.C0 messageLoadingJob;

    @NotNull
    private final y messagesMutableStateFlow;

    /* renamed from: messagesStateFlow$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy messagesStateFlow;

    @NotNull
    private final y messagesSyncDataMutableStateFlow;

    /* renamed from: messagesSyncDataStateFlow$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy messagesSyncDataStateFlow;

    @NotNull
    private y originalMessageContent;

    @NotNull
    private y replyMessageUId;

    @NotNull
    private final kotlinx.coroutines.flow.C uiEvents;

    /* renamed from: messagesRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy messagesRepository = LazyKt.lazy(C3901k0.f44042d);

    /* renamed from: conversationsRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy conversationsRepository = LazyKt.lazy(C3916s.f44075d);

    /* renamed from: triggersRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy triggersRepository = LazyKt.lazy(T0.f43919d);

    /* renamed from: commonRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy commonRepository = LazyKt.lazy(C3914r.f44072d);

    /* renamed from: brandRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy brandRepository = LazyKt.lazy(C3902l.f44043d);

    /* renamed from: syncBrandStatusUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncBrandStatusUseCase = LazyKt.lazy(new M0());

    /* renamed from: syncFormUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncFormUseCase = LazyKt.lazy(new N0());

    /* renamed from: clearFormUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy clearFormUseCase = LazyKt.lazy(new C3910p());

    /* renamed from: getFormUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getFormUseCase = LazyKt.lazy(new C());

    /* renamed from: getCurrentFormMessageUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getCurrentFormMessageUseCase = LazyKt.lazy(new C3930z());

    /* renamed from: startNewConversation$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy startNewConversation = LazyKt.lazy(new J0());

    /* renamed from: getFlowMessage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getFlowMessage = LazyKt.lazy(new B());

    /* renamed from: leaveAsMissedConversation$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy leaveAsMissedConversation = LazyKt.lazy(new Y());

    /* renamed from: joinConversation$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy joinConversation = LazyKt.lazy(new X());

    /* renamed from: mailTranscriptUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mailTranscriptUseCase = LazyKt.lazy(new C3895h0());

    /* renamed from: saveDraftMessage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy saveDraftMessage = LazyKt.lazy(new C3927x0());

    /* renamed from: addMessageUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy addMessageUseCase = LazyKt.lazy(new C3898j());

    /* renamed from: getMessagesUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getMessagesUseCase = LazyKt.lazy(new I());

    /* renamed from: getMessageDataTransferProgressUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getMessageDataTransferProgressUseCase = LazyKt.lazy(new G());

    /* renamed from: loadDraftMessageIntoConversationFromForms$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadDraftMessageIntoConversationFromForms = LazyKt.lazy(new C3885c0());

    /* renamed from: updateMessageExtras$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy updateMessageExtras = LazyKt.lazy(new V0());

    /* renamed from: getTopAndBottomSyncCompletionData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getTopAndBottomSyncCompletionData = LazyKt.lazy(new L());

    /* renamed from: getMessageUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getMessageUseCase = LazyKt.lazy(new H());

    /* renamed from: getLastMessage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getLastMessage = LazyKt.lazy(new D());

    /* renamed from: syncMessage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncMessage = LazyKt.lazy(new O0());

    /* renamed from: sendMessage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendMessage = LazyKt.lazy(new D0());

    /* renamed from: sendContextMessage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendContextMessage = LazyKt.lazy(new A0());

    /* renamed from: sendAllMessageAsSingleMessage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendAllMessageAsSingleMessage = LazyKt.lazy(new C3931z0());

    /* renamed from: retrySendingMessageUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy retrySendingMessageUseCase = LazyKt.lazy(new C3923v0());

    /* renamed from: resendContextMessageUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy resendContextMessageUseCase = LazyKt.lazy(new C3919t0());

    /* renamed from: deleteMessage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteMessage = LazyKt.lazy(new C3922v());

    /* renamed from: updateMessageStatus$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy updateMessageStatus = LazyKt.lazy(new X0());

    /* renamed from: cancelMessageTransfer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cancelMessageTransfer = LazyKt.lazy(new C3906n());

    /* renamed from: syncMessagesTranscript$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncMessagesTranscript = LazyKt.lazy(new Q0());

    /* renamed from: readMessage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy readMessage = LazyKt.lazy(new C3907n0());

    /* renamed from: addMessages$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy addMessages = LazyKt.lazy(new C3900k());

    /* renamed from: isFeedbackExpired$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isFeedbackExpired = LazyKt.lazy(new T());

    /* renamed from: refreshMessages$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy refreshMessages = LazyKt.lazy(new C3911p0());

    /* renamed from: updateMessageTypingStatus$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy updateMessageTypingStatus = LazyKt.lazy(new Z0());

    /* renamed from: messageActionUseCases$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy messageActionUseCases = LazyKt.lazy(new C3897i0());

    /* renamed from: logDebugInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logDebugInfo = LazyKt.lazy(new C3889e0());

    /* renamed from: updateConversation$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy updateConversation = LazyKt.lazy(new U0());

    /* renamed from: initiateVTSTrigger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy initiateVTSTrigger = LazyKt.lazy(new Q());

    /* renamed from: initiateTrigger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy initiateTrigger = LazyKt.lazy(new O());

    /* renamed from: deleteFeedbackCardsIfExpiredUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteFeedbackCardsIfExpiredUseCase = LazyKt.lazy(new C3920u());

    /* renamed from: callsRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy callsRepository = LazyKt.lazy(C3904m.f44045d);

    /* renamed from: initiateCallUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy initiateCallUseCase = LazyKt.lazy(new N());

    public static final class A extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f43747n;

        /* renamed from: p, reason: collision with root package name */
        public int f43749p;

        public A(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43747n = obj;
            this.f43749p |= Integer.MIN_VALUE;
            return ChatViewModel.this.getFirstMessage(null, null, this);
        }
    }

    public static final class A0 extends Lambda implements Function0 {
        public A0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v invoke() {
            return new v(ChatViewModel.this.getMessagesRepository());
        }
    }

    public static final class B extends Lambda implements Function0 {
        public B() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f invoke() {
            return new f(ChatViewModel.this.getConversationsRepository());
        }
    }

    public static final class B0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43752n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43753o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43754p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43755q;

        /* renamed from: r, reason: collision with root package name */
        public Object f43756r;

        /* renamed from: s, reason: collision with root package name */
        public Object f43757s;

        /* renamed from: t, reason: collision with root package name */
        public int f43758t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f43760v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f43761w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Message.g f43762x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B0(String str, String str2, Message.g gVar, Continuation continuation) {
            super(2, continuation);
            this.f43760v = str;
            this.f43761w = str2;
            this.f43762x = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new B0(this.f43760v, this.f43761w, this.f43762x, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((B0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0272, code lost:
        
            if (r1.b(r0, r3, r5, r4) != r10) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0240, code lost:
        
            if (r7.a(true, null, r0, r4) != r10) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x02bb, code lost:
        
            if (r1.loadDraftIntoConversation(r0, r4) != r10) goto L96;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a10;
            String str;
            C5582a c5582a;
            String str2;
            AbstractC6235a abstractC6235a;
            SalesIQChat salesIQChat;
            C5582a c5582a2;
            ChatViewModel chatViewModel;
            EnumC4544a a11;
            SalesIQChat salesIQChat2;
            C5582a c5582a3;
            ChatViewModel chatViewModel2;
            SalesIQChat chatWithAnyId;
            Channel.Department department;
            EnumC4544a enumC4544a;
            C5582a c5582a4;
            ChatViewModel chatViewModel3;
            Channel.Department department2;
            ChatViewModel chatViewModel4;
            ChatViewModel chatViewModel5;
            String str3;
            C5582a c5582a5;
            String str4;
            B0 b02 = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (b02.f43758t) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    String valueOf = String.valueOf(rd.b.f());
                    v sendContextMessage = ChatViewModel.this.getSendContextMessage();
                    String acknowledgementKey = ChatViewModel.this.getAcknowledgementKey();
                    String str5 = b02.f43760v;
                    String str6 = b02.f43761w;
                    Message.g gVar = b02.f43762x;
                    boolean f10 = d.f(a.IsOngoingConversationContextAutoReplyOn, false, 2, null);
                    b02.f43752n = valueOf;
                    b02.f43758t = 1;
                    a10 = sendContextMessage.a(acknowledgementKey, str5, str6, valueOf, gVar, f10, false, false, this);
                    b02 = this;
                    if (a10 != coroutine_suspended) {
                        str = valueOf;
                        c5582a = (C5582a) a10;
                        ChatViewModel chatViewModel6 = ChatViewModel.this;
                        String str7 = b02.f43760v;
                        if (c5582a.d()) {
                            ChatViewModel.sendRefreshBroadCast$default(chatViewModel6, str7, null, false, 6, null);
                        }
                        AbstractC6235a.c cVar = AbstractC6235a.c.Messages;
                        ChatViewModel chatViewModel7 = ChatViewModel.this;
                        str2 = b02.f43760v;
                        if (!c5582a.d()) {
                            C5582a.b c10 = c5582a.c();
                            if (c10 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c10, cVar)) == null) {
                                abstractC6235a = AbstractC6235a.b.f64114d;
                            }
                            Intrinsics.checkNotNull(c5582a.c(), "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                            if (!Intrinsics.areEqual(abstractC6235a, C6223E.f64097d)) {
                                if (!Intrinsics.areEqual(abstractC6235a, C6224F.f64098d)) {
                                    C6233O c6233o = C6233O.f64107d;
                                    if (!Intrinsics.areEqual(abstractC6235a, c6233o)) {
                                        if (Intrinsics.areEqual(abstractC6235a, C6225G.f64099d)) {
                                            SalesIQChat chatWithAnyId2 = LiveChatUtil.getChatWithAnyId(str2);
                                            Form.Message currentFormMessage = chatViewModel7.getCurrentFormMessage();
                                            if (chatWithAnyId2 != null && currentFormMessage != null) {
                                                C6884a addMessageUseCase = chatViewModel7.getAddMessageUseCase();
                                                b02.f43752n = c5582a;
                                                b02.f43753o = chatViewModel7;
                                                b02.f43754p = chatWithAnyId2;
                                                b02.f43758t = 8;
                                                if (C6884a.b(addMessageUseCase, chatWithAnyId2, currentFormMessage, false, b02, 4, null) != coroutine_suspended) {
                                                    salesIQChat = chatWithAnyId2;
                                                    c5582a2 = c5582a;
                                                    chatViewModel = chatViewModel7;
                                                    String chid = salesIQChat.getChid();
                                                    Intrinsics.checkNotNullExpressionValue(chid, "getChid(...)");
                                                    b02.f43752n = c5582a2;
                                                    b02.f43753o = null;
                                                    b02.f43754p = null;
                                                    b02.f43758t = 9;
                                                    break;
                                                }
                                            } else {
                                                LiveChatUtil.log("Chat or form message is null");
                                                LiveChatUtil.triggerChatListener("CHAT_ERROR", chatWithAnyId2, new b.a("Chat or form message is null"));
                                            }
                                        }
                                    } else {
                                        SalesIQChat chatWithAnyId3 = LiveChatUtil.getChatWithAnyId(str2);
                                        Channel.Department e10 = AbstractC3945n.e(chatWithAnyId3 != null ? chatWithAnyId3.getDeptid() : null);
                                        if (chatWithAnyId3 != null && (e10 != null || Intrinsics.areEqual(abstractC6235a, c6233o))) {
                                            if (e10 == null || (a11 = chatViewModel7.getAppStatus(e10)) == null) {
                                                a11 = EnumC4544a.Companion.a(d.m(a.OngoingConversationContextAppStatus, null, 2, null));
                                            }
                                            if (a11 != null) {
                                                yf.D updateMessageStatus = chatViewModel7.getUpdateMessageStatus();
                                                Message.f fVar = Message.f.Sending;
                                                b02.f43752n = str;
                                                b02.f43753o = c5582a;
                                                b02.f43754p = chatViewModel7;
                                                b02.f43755q = str2;
                                                b02.f43756r = chatWithAnyId3;
                                                b02.f43757s = a11;
                                                b02.f43758t = 4;
                                                if (updateMessageStatus.b(str2, str, fVar, b02) != coroutine_suspended) {
                                                    salesIQChat2 = chatWithAnyId3;
                                                    c5582a3 = c5582a;
                                                    chatViewModel2 = chatViewModel7;
                                                    chatViewModel2.getClearFormUseCase().b(a11);
                                                    h syncFormUseCase = chatViewModel2.getSyncFormUseCase();
                                                    b02.f43752n = str;
                                                    b02.f43753o = c5582a3;
                                                    b02.f43754p = chatViewModel2;
                                                    b02.f43755q = str2;
                                                    b02.f43756r = salesIQChat2;
                                                    b02.f43757s = a11;
                                                    b02.f43758t = 5;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    chatWithAnyId = LiveChatUtil.getChatWithAnyId(str2);
                                    Channel.Department e11 = AbstractC3945n.e(chatWithAnyId != null ? chatWithAnyId.getDeptid() : null);
                                    if (chatWithAnyId != null && e11 != null) {
                                        EnumC4544a appStatus = chatViewModel7.getAppStatus(e11);
                                        chatViewModel7.getClearFormUseCase().b(appStatus);
                                        h syncFormUseCase2 = chatViewModel7.getSyncFormUseCase();
                                        b02.f43752n = c5582a;
                                        b02.f43753o = chatViewModel7;
                                        b02.f43754p = chatWithAnyId;
                                        b02.f43755q = e11;
                                        b02.f43756r = appStatus;
                                        b02.f43758t = 2;
                                        if (syncFormUseCase2.a(true, null, appStatus, b02) != coroutine_suspended) {
                                            department = e11;
                                            enumC4544a = appStatus;
                                            c5582a4 = c5582a;
                                            chatViewModel3 = chatViewModel7;
                                            b02.f43752n = c5582a4;
                                            b02.f43753o = chatViewModel3;
                                            b02.f43754p = department;
                                            b02.f43755q = null;
                                            b02.f43756r = null;
                                            b02.f43758t = 3;
                                            if (chatViewModel3.handleFormAndDepartmentStatusDiffersFallback(chatWithAnyId, enumC4544a, b02) != coroutine_suspended) {
                                                department2 = department;
                                                chatViewModel4 = chatViewModel3;
                                                if (Intrinsics.areEqual(department2.isOnline(), Boxing.boxBoolean(true))) {
                                                    chatViewModel4._uiEvents.a(AbstractC3882b.d.f43975a);
                                                } else {
                                                    MobilistenUtil.z(t.f60850D4, 0, 2, null);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                chatViewModel7._uiEvents.a(AbstractC3882b.e.f43976a);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                case 1:
                    String str8 = (String) b02.f43752n;
                    ResultKt.throwOnFailure(obj);
                    str = str8;
                    a10 = obj;
                    c5582a = (C5582a) a10;
                    ChatViewModel chatViewModel62 = ChatViewModel.this;
                    String str72 = b02.f43760v;
                    if (c5582a.d()) {
                    }
                    AbstractC6235a.c cVar2 = AbstractC6235a.c.Messages;
                    ChatViewModel chatViewModel72 = ChatViewModel.this;
                    str2 = b02.f43760v;
                    if (!c5582a.d()) {
                    }
                    return Unit.INSTANCE;
                case 2:
                    enumC4544a = (EnumC4544a) b02.f43756r;
                    department = (Channel.Department) b02.f43755q;
                    chatWithAnyId = (SalesIQChat) b02.f43754p;
                    chatViewModel3 = (ChatViewModel) b02.f43753o;
                    c5582a4 = (C5582a) b02.f43752n;
                    ResultKt.throwOnFailure(obj);
                    b02.f43752n = c5582a4;
                    b02.f43753o = chatViewModel3;
                    b02.f43754p = department;
                    b02.f43755q = null;
                    b02.f43756r = null;
                    b02.f43758t = 3;
                    if (chatViewModel3.handleFormAndDepartmentStatusDiffersFallback(chatWithAnyId, enumC4544a, b02) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    department2 = (Channel.Department) b02.f43754p;
                    chatViewModel4 = (ChatViewModel) b02.f43753o;
                    ResultKt.throwOnFailure(obj);
                    if (Intrinsics.areEqual(department2.isOnline(), Boxing.boxBoolean(true))) {
                    }
                    return Unit.INSTANCE;
                case 4:
                    a11 = (EnumC4544a) b02.f43757s;
                    salesIQChat2 = (SalesIQChat) b02.f43756r;
                    str2 = (String) b02.f43755q;
                    chatViewModel2 = (ChatViewModel) b02.f43754p;
                    c5582a3 = (C5582a) b02.f43753o;
                    str = (String) b02.f43752n;
                    ResultKt.throwOnFailure(obj);
                    chatViewModel2.getClearFormUseCase().b(a11);
                    h syncFormUseCase3 = chatViewModel2.getSyncFormUseCase();
                    b02.f43752n = str;
                    b02.f43753o = c5582a3;
                    b02.f43754p = chatViewModel2;
                    b02.f43755q = str2;
                    b02.f43756r = salesIQChat2;
                    b02.f43757s = a11;
                    b02.f43758t = 5;
                    break;
                case 5:
                    a11 = (EnumC4544a) b02.f43757s;
                    salesIQChat2 = (SalesIQChat) b02.f43756r;
                    str2 = (String) b02.f43755q;
                    chatViewModel2 = (ChatViewModel) b02.f43754p;
                    c5582a3 = (C5582a) b02.f43753o;
                    str = (String) b02.f43752n;
                    ResultKt.throwOnFailure(obj);
                    ChatViewModel chatViewModel8 = chatViewModel2;
                    SalesIQChat salesIQChat3 = salesIQChat2;
                    chatViewModel5 = chatViewModel8;
                    b02.f43752n = str;
                    b02.f43753o = c5582a3;
                    b02.f43754p = chatViewModel5;
                    b02.f43755q = str2;
                    b02.f43756r = null;
                    b02.f43757s = null;
                    b02.f43758t = 6;
                    if (chatViewModel5.handleFormAndDepartmentStatusDiffersFallback(salesIQChat3, a11, b02) != coroutine_suspended) {
                        str3 = str2;
                        c5582a5 = c5582a3;
                        str4 = str;
                        yf.D updateMessageStatus2 = chatViewModel5.getUpdateMessageStatus();
                        Message.f fVar2 = Message.f.Sent;
                        b02.f43752n = c5582a5;
                        b02.f43753o = null;
                        b02.f43754p = null;
                        b02.f43755q = null;
                        b02.f43758t = 7;
                        break;
                    }
                    return coroutine_suspended;
                case 6:
                    str3 = (String) b02.f43755q;
                    chatViewModel5 = (ChatViewModel) b02.f43754p;
                    c5582a5 = (C5582a) b02.f43753o;
                    str4 = (String) b02.f43752n;
                    ResultKt.throwOnFailure(obj);
                    yf.D updateMessageStatus22 = chatViewModel5.getUpdateMessageStatus();
                    Message.f fVar22 = Message.f.Sent;
                    b02.f43752n = c5582a5;
                    b02.f43753o = null;
                    b02.f43754p = null;
                    b02.f43755q = null;
                    b02.f43758t = 7;
                    break;
                case 7:
                case 9:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 8:
                    salesIQChat = (SalesIQChat) b02.f43754p;
                    chatViewModel = (ChatViewModel) b02.f43753o;
                    c5582a2 = (C5582a) b02.f43752n;
                    ResultKt.throwOnFailure(obj);
                    String chid2 = salesIQChat.getChid();
                    Intrinsics.checkNotNullExpressionValue(chid2, "getChid(...)");
                    b02.f43752n = c5582a2;
                    b02.f43753o = null;
                    b02.f43754p = null;
                    b02.f43758t = 9;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final class C extends Lambda implements Function0 {
        public C() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return new c(ChatViewModel.this.getBrandRepository());
        }
    }

    public static final class C0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43764n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f43765o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ ArrayList f43766p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ ChatViewModel f43767q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f43768r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f43769s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f43770t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0(ArrayList arrayList, ChatViewModel chatViewModel, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.f43766p = arrayList;
            this.f43767q = chatViewModel;
            this.f43768r = str;
            this.f43769s = str2;
            this.f43770t = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C0 c02 = new C0(this.f43766p, this.f43767q, this.f43768r, this.f43769s, this.f43770t, continuation);
            c02.f43765o = obj;
            return c02;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m147constructorimpl;
            String str;
            Object a10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43764n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList = this.f43766p;
                    ChatViewModel chatViewModel = this.f43767q;
                    String str2 = this.f43768r;
                    String str3 = this.f43769s;
                    String str4 = this.f43770t;
                    Result.Companion companion = Result.INSTANCE;
                    long f10 = rd.b.f();
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                    }
                    Application e10 = MobilistenInitProvider.INSTANCE.e();
                    if (e10 == null || (str = e10.getString(t.f60983a)) == null) {
                        str = "app_logs.txt";
                    }
                    File writeStringToFile = chatViewModel.writeStringToFile(sb2, com.zoho.livechat.android.utils.y.INSTANCE.getFileName(str, f10));
                    if (sb2.length() > 0 && i.e(writeStringToFile) && writeStringToFile.length() > 0) {
                        long length = writeStringToFile.length();
                        w sendMessage = chatViewModel.getSendMessage();
                        String valueOf = String.valueOf(f10);
                        Message.g gVar = Message.g.File;
                        Message.Attachment attachment = new Message.Attachment(null, null, null, null, null, null, "text/plain", null, length, str, null, null, null, null, null, null, null, null, null, null, null, "text/plain", null, null, null, 31456447, null);
                        Message.Extras extras = new Message.Extras(writeStringToFile.getAbsolutePath(), writeStringToFile.getName(), length, 0L, null, wf.b.AppLogs, null, null, false, 472, null);
                        List listOf = CollectionsKt.listOf(writeStringToFile);
                        this.f43764n = 1;
                        a10 = sendMessage.a(str2, str3, str4, valueOf, null, (r33 & 32) != 0 ? null : null, (r33 & 64) != 0 ? Message.g.Text : gVar, (r33 & 128) != 0 ? null : attachment, (r33 & 256) != 0 ? null : extras, (r33 & 512) != 0 ? null : null, (r33 & 1024) != 0 ? null : listOf, (r33 & 2048) != 0 ? false : false, (r33 & 4096) != 0 ? false : false, this);
                        if (a10 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
                LiveChatUtil.log(m150exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class D extends Lambda implements Function0 {
        public D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.h invoke() {
            return new yf.h(ChatViewModel.this.getMessagesRepository());
        }
    }

    public static final class D0 extends Lambda implements Function0 {
        public D0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w invoke() {
            return new w(ChatViewModel.this.getMessagesRepository());
        }
    }

    public static final class E extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f43773n;

        /* renamed from: p, reason: collision with root package name */
        public int f43775p;

        public E(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43773n = obj;
            this.f43775p |= Integer.MIN_VALUE;
            return ChatViewModel.this.getLastMessage(null, null, this);
        }
    }

    public static final class E0 extends SuspendLambda implements Function2 {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ File f43776A;

        /* renamed from: n, reason: collision with root package name */
        public int f43777n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43779p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f43780q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f43781r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f43782s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f43783t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Message f43784u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f43785v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Message.g f43786w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Message.Attachment f43787x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Message.Extras f43788y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Message.RespondedMessage f43789z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public E0(String str, String str2, String str3, String str4, String str5, Message message, String str6, Message.g gVar, Message.Attachment attachment, Message.Extras extras, Message.RespondedMessage respondedMessage, File file, Continuation continuation) {
            super(2, continuation);
            this.f43779p = str;
            this.f43780q = str2;
            this.f43781r = str3;
            this.f43782s = str4;
            this.f43783t = str5;
            this.f43784u = message;
            this.f43785v = str6;
            this.f43786w = gVar;
            this.f43787x = attachment;
            this.f43788y = extras;
            this.f43789z = respondedMessage;
            this.f43776A = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new E0(this.f43779p, this.f43780q, this.f43781r, this.f43782s, this.f43783t, this.f43784u, this.f43785v, this.f43786w, this.f43787x, this.f43788y, this.f43789z, this.f43776A, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((E0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0059  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            Object a10;
            AbstractC6235a abstractC6235a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43777n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                w sendMessage = ChatViewModel.this.getSendMessage();
                String str = this.f43779p;
                String str2 = this.f43780q;
                String str3 = this.f43781r;
                String str4 = this.f43782s;
                String str5 = this.f43783t;
                if (str5 == null) {
                    Message message = this.f43784u;
                    if (message != null) {
                        str5 = message.getUniqueID();
                    } else {
                        str5 = null;
                        list = null;
                        String str6 = this.f43785v;
                        String str7 = str5;
                        Message.g gVar = this.f43786w;
                        List list2 = list;
                        Message.Attachment attachment = this.f43787x;
                        Message.Extras extras = this.f43788y;
                        Message.RespondedMessage respondedMessage = this.f43789z;
                        File file = this.f43776A;
                        List listOf = file == null ? CollectionsKt.listOf(file) : list2;
                        boolean e10 = i.e(this.f43784u);
                        boolean e11 = i.e(this.f43783t);
                        this.f43777n = 1;
                        a10 = sendMessage.a(str, str2, str3, str4, str7, str6, gVar, attachment, extras, respondedMessage, listOf, e10, e11, this);
                        if (a10 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                list = null;
                String str62 = this.f43785v;
                String str72 = str5;
                Message.g gVar2 = this.f43786w;
                List list22 = list;
                Message.Attachment attachment2 = this.f43787x;
                Message.Extras extras2 = this.f43788y;
                Message.RespondedMessage respondedMessage2 = this.f43789z;
                File file2 = this.f43776A;
                if (file2 == null) {
                }
                boolean e102 = i.e(this.f43784u);
                boolean e112 = i.e(this.f43783t);
                this.f43777n = 1;
                a10 = sendMessage.a(str, str2, str3, str4, str72, str62, gVar2, attachment2, extras2, respondedMessage2, listOf, e102, e112, this);
                if (a10 == coroutine_suspended) {
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a10 = obj;
            }
            C5582a c5582a = (C5582a) a10;
            AbstractC6235a.c cVar = AbstractC6235a.c.Messages;
            if (!c5582a.d()) {
                C5582a.b c10 = c5582a.c();
                if (c10 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c10, cVar)) == null) {
                    abstractC6235a = AbstractC6235a.b.f64114d;
                }
                C5582a.b c11 = c5582a.c();
                Intrinsics.checkNotNull(c11, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                if (!(c11.a() instanceof CancellationException) && !Intrinsics.areEqual(abstractC6235a, C6228J.f64102d)) {
                    if (abstractC6235a.a() == -1) {
                        abstractC6235a = C6229K.f64103d;
                    }
                    MobilistenUtil.z(abstractC6235a.b(), 0, 2, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class F extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43790n;

        public F(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new F(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((F) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43790n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                yf.h getLastMessage = ChatViewModel.this.getGetLastMessage();
                String acknowledgementKey = ChatViewModel.this.getAcknowledgementKey();
                String chatId = ChatViewModel.this.getChatId();
                this.f43790n = 1;
                obj = getLastMessage.b(acknowledgementKey, chatId, true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C5582a c5582a = (C5582a) obj;
            ChatViewModel chatViewModel = ChatViewModel.this;
            if (c5582a.d()) {
                chatViewModel._uiEvents.a(new AbstractC3882b.f((Message) c5582a.b()));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class F0 extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f43792n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43793o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43794p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43795q;

        /* renamed from: r, reason: collision with root package name */
        public Object f43796r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f43797s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f43798t;

        /* renamed from: v, reason: collision with root package name */
        public int f43800v;

        public F0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43798t = obj;
            this.f43800v |= Integer.MIN_VALUE;
            return ChatViewModel.this.sendPreChatFormQuestion(null, null, null, false, null, this);
        }
    }

    public static final class G extends Lambda implements Function0 {
        public G() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.i invoke() {
            return new yf.i(ChatViewModel.this.getMessagesRepository());
        }
    }

    public static final class G0 extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public int f43802n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Function1 f43803o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C5582a f43804p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public G0(Function1 function1, C5582a c5582a, Continuation continuation) {
            super(1, continuation);
            this.f43803o = function1;
            this.f43804p = c5582a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new G0(this.f43803o, this.f43804p, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f43802n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f43803o;
            if (function1 != null) {
                function1.invoke(Boxing.boxBoolean(this.f43804p.d()));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((G0) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class H extends Lambda implements Function0 {
        public H() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j invoke() {
            return new j(ChatViewModel.this.getMessagesRepository());
        }
    }

    public static final class H0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43806n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f43808p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Message f43809q;

        public static final class a extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ChatViewModel f43810d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChatViewModel chatViewModel) {
                super(1);
                this.f43810d = chatViewModel;
            }

            public final void a(boolean z10) {
                this.f43810d._uiEvents.a(new AbstractC3882b.i(z10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H0(SalesIQChat salesIQChat, Message message, Continuation continuation) {
            super(2, continuation);
            this.f43808p = salesIQChat;
            this.f43809q = message;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new H0(this.f43808p, this.f43809q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((H0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43806n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ChatViewModel chatViewModel = ChatViewModel.this;
                SalesIQChat salesIQChat = this.f43808p;
                Message message = this.f43809q;
                a aVar = new a(chatViewModel);
                this.f43806n = 1;
                if (chatViewModel.sendPreChatFormQuestion(salesIQChat, message, null, true, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class I extends Lambda implements Function0 {
        public I() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return new k(ChatViewModel.this.getMessagesRepository());
        }
    }

    public static final class I0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43812n;

        /* renamed from: o, reason: collision with root package name */
        public int f43813o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f43814p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Context f43815q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ChatViewModel f43816r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I0(SalesIQChat salesIQChat, Context context, ChatViewModel chatViewModel, Continuation continuation) {
            super(2, continuation);
            this.f43814p = salesIQChat;
            this.f43815q = context;
            this.f43816r = chatViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new I0(this.f43814p, this.f43815q, this.f43816r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((I0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b1, code lost:
        
            if (r3.S0(r14, r13) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        
            if (r14.a(r5, r4, null, r13) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
        
            if (r14 == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            I0 i02;
            e eVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43813o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f43814p.getVisitorid() != null) {
                    Td.e eVar2 = Td.e.f11456a;
                    Context context = this.f43815q;
                    SalesIQChat salesIQChat = this.f43814p;
                    this.f43813o = 1;
                    i02 = this;
                    obj = Td.e.j0(eVar2, context, salesIQChat, false, false, i02, 8, null);
                }
            } else if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
                i02 = this;
                eVar = (e) obj;
                ChatViewModel chatViewModel = i02.f43816r;
                SalesIQChat salesIQChat2 = i02.f43814p;
                if (eVar.d()) {
                    android.support.v4.media.session.b.a(eVar.b());
                    Xd.c initiateCallUseCase = chatViewModel.getInitiateCallUseCase();
                    String visitorid = salesIQChat2.getVisitorid();
                    Intrinsics.checkNotNull(visitorid);
                    String attenderName = salesIQChat2.getAttenderName();
                    i02.f43812n = eVar;
                    i02.f43813o = 2;
                }
                ChatViewModel chatViewModel2 = i02.f43816r;
                if (!eVar.d()) {
                }
            } else if (i10 == 2) {
                eVar = (e) this.f43812n;
                ResultKt.throwOnFailure(obj);
                i02 = this;
                ChatViewModel chatViewModel22 = i02.f43816r;
                if (!eVar.d()) {
                    we.d c10 = eVar.c();
                    Intrinsics.checkNotNull(c10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.ui.result.entities.SalesIQError");
                    if (Intrinsics.areEqual(c10, we.d.f67651e)) {
                        Td.e eVar3 = Td.e.f11456a;
                        String string = chatViewModel22.getApplication().getString(t.f61107s);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        i02.f43812n = eVar;
                        i02.f43813o = 3;
                    }
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class J extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f43817n;

        /* renamed from: p, reason: collision with root package name */
        public int f43819p;

        public J(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43817n = obj;
            this.f43819p |= Integer.MIN_VALUE;
            return ChatViewModel.this.getQuestion(null, this);
        }
    }

    public static final class J0 extends Lambda implements Function0 {
        public J0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m invoke() {
            return new m(ChatViewModel.this.getConversationsRepository());
        }
    }

    public static final class K extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43821n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43823p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(String str, Continuation continuation) {
            super(2, continuation);
            this.f43823p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new K(this.f43823p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((K) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
        
            if (r7 == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
        
            if (r7 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43821n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                k getMessagesUseCase = ChatViewModel.this.getGetMessagesUseCase();
                String str = this.f43823p;
                Message.g gVar = Message.g.Question;
                this.f43821n = 1;
                obj = getMessagesUseCase.a(null, str, gVar, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    List list = (List) obj;
                    if (list != null) {
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list != null) {
                            return (Message) CollectionsKt.first(list);
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj);
            }
            InterfaceC5321f interfaceC5321f = (InterfaceC5321f) ((C5582a) obj).b();
            if (interfaceC5321f != null) {
                this.f43821n = 2;
                obj = AbstractC5323h.r(interfaceC5321f, this);
            }
            return null;
        }
    }

    public static final class K0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43824n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43825o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43826p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43827q;

        /* renamed from: r, reason: collision with root package name */
        public Object f43828r;

        /* renamed from: s, reason: collision with root package name */
        public int f43829s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f43831u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f43832v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f43833w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f43834x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f43835y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f43836z;

        public static final class a extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ChatViewModel f43837d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChatViewModel chatViewModel) {
                super(0);
                this.f43837d = chatViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m120invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m120invoke() {
                this.f43837d._uiEvents.a(AbstractC3882b.c.f43974a);
            }
        }

        public static final class b extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public static final b f43838d = new b();

            public b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String str) {
                return Boolean.valueOf(Intrinsics.areEqual(str, "department"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K0(String str, String str2, int i10, boolean z10, String str3, String str4, Continuation continuation) {
            super(2, continuation);
            this.f43831u = str;
            this.f43832v = str2;
            this.f43833w = i10;
            this.f43834x = z10;
            this.f43835y = str3;
            this.f43836z = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new K0(this.f43831u, this.f43832v, this.f43833w, this.f43834x, this.f43835y, this.f43836z, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((K0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0268, code lost:
        
            if (r4.handleFormAndDepartmentStatusDiffersFallback(r2, r1, r23) == r0) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0256, code lost:
        
            if (r3 != r0) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x014f, code lost:
        
            if (r3.invokeStartChatCallback(r2, r23) != r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x00cf, code lost:
        
            if (r1 == r0) goto L88;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x01e1  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0228  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0139  */
        /* JADX WARN: Type inference failed for: r15v16 */
        /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.Set] */
        /* JADX WARN: Type inference failed for: r15v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            boolean z11;
            Object b10;
            C5582a c5582a;
            boolean z12;
            int i10;
            int i11;
            boolean z13;
            String str;
            String str2;
            ChatViewModel chatViewModel;
            AbstractC6235a abstractC6235a;
            String str3;
            C5582a c5582a2;
            AbstractC6235a abstractC6235a2;
            C5582a.b bVar;
            ?? r15;
            SalesIQChat chatWithAnyId;
            g syncBrandStatusUseCase;
            Md.a[] aVarArr;
            C5582a c5582a3;
            ChatViewModel chatViewModel2;
            String str4;
            SalesIQChat salesIQChat;
            EnumC4544a appStatus;
            String str5;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f43829s) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    m startNewConversation = ChatViewModel.this.getStartNewConversation();
                    String str6 = this.f43831u;
                    String str7 = this.f43832v;
                    Pe.a aVar = Pe.a.Chat;
                    int i12 = this.f43833w;
                    if (i12 == 5 || i12 == 6) {
                        z10 = true;
                        z11 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    boolean z14 = this.f43834x;
                    String str8 = this.f43835y;
                    String str9 = this.f43836z;
                    String n10 = C6218a.n();
                    a aVar2 = new a(ChatViewModel.this);
                    this.f43829s = 1;
                    b10 = m.b(startNewConversation, str6, null, str7, aVar, z10, z14, str8, str9, n10, null, null, aVar2, this, 1536, null);
                    break;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    b10 = obj;
                    c5582a = (C5582a) b10;
                    String str10 = this.f43831u;
                    ChatViewModel chatViewModel3 = ChatViewModel.this;
                    if (c5582a.d()) {
                        SalesIQChat chatFromConvID = LiveChatUtil.getChatFromConvID(str10);
                        if (chatFromConvID != null) {
                            i10 = 3;
                            if (chatFromConvID.getStatus() == 3) {
                                i11 = 2;
                                z13 = false;
                                str2 = null;
                                MobilistenUtil.A(AbstractC6462a.b(C6822a.m()), 0, 2, null);
                                Application e10 = MobilistenInitProvider.INSTANCE.e();
                                Intrinsics.checkNotNull(e10);
                                C1908a b11 = C1908a.b(e10);
                                Intent intent = new Intent("receivelivechat");
                                intent.putExtra("message", "refreshchat");
                                if (chatFromConvID != null || chatFromConvID.canShowQueue()) {
                                    z12 = true;
                                } else {
                                    z12 = true;
                                    intent.putExtra("StartWaitingTimer", true);
                                }
                                intent.putExtra("chid", chatFromConvID == null ? chatFromConvID.getChid() : str2);
                                intent.putExtra("conversation_id", str10);
                                b11.d(intent);
                                this.f43824n = c5582a;
                                this.f43829s = i11;
                                str = str2;
                                break;
                            }
                        } else {
                            i10 = 3;
                        }
                        i11 = 2;
                        z13 = false;
                        str2 = null;
                        Application e102 = MobilistenInitProvider.INSTANCE.e();
                        Intrinsics.checkNotNull(e102);
                        C1908a b112 = C1908a.b(e102);
                        Intent intent2 = new Intent("receivelivechat");
                        intent2.putExtra("message", "refreshchat");
                        if (chatFromConvID != null) {
                        }
                        z12 = true;
                        intent2.putExtra("chid", chatFromConvID == null ? chatFromConvID.getChid() : str2);
                        intent2.putExtra("conversation_id", str10);
                        b112.d(intent2);
                        this.f43824n = c5582a;
                        this.f43829s = i11;
                        str = str2;
                    } else {
                        z12 = true;
                        i10 = 3;
                        i11 = 2;
                        z13 = false;
                        str = null;
                    }
                    AbstractC6235a.c cVar = AbstractC6235a.c.Conversations;
                    chatViewModel = ChatViewModel.this;
                    String str11 = this.f43831u;
                    if (!c5582a.d()) {
                        C5582a.b c10 = c5582a.c();
                        if (c10 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c10, cVar)) == null) {
                            abstractC6235a = AbstractC6235a.b.f64114d;
                        }
                        C5582a.b c11 = c5582a.c();
                        Intrinsics.checkNotNull(c11, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                        this.f43824n = c5582a;
                        this.f43825o = chatViewModel;
                        this.f43826p = str11;
                        this.f43827q = c11;
                        this.f43828r = abstractC6235a;
                        this.f43829s = i10;
                        if (chatViewModel.invokeStartChatCallbackFailure(str11, c11, this) != coroutine_suspended) {
                            str3 = str11;
                            c5582a2 = c5582a;
                            abstractC6235a2 = abstractC6235a;
                            bVar = c11;
                            r15 = str;
                            if (!Intrinsics.areEqual(abstractC6235a2, C6239e.f64119d) || Intrinsics.areEqual(abstractC6235a2, C6244j.f64124d) || Intrinsics.areEqual(abstractC6235a2, C6249o.f64129d) || Intrinsics.areEqual(abstractC6235a2, C6251q.f64131d) || Intrinsics.areEqual(abstractC6235a2, C6248n.f64128d)) {
                                if (Intrinsics.areEqual(abstractC6235a2, C6248n.f64128d)) {
                                    De.a aVar3 = De.a.OngoingConversationContextRequestedMessages;
                                    Set n11 = d.n(aVar3, r15);
                                    HashSet hashSet = n11 instanceof HashSet ? (HashSet) n11 : r15;
                                    if (hashSet == null) {
                                        hashSet = new HashSet();
                                    }
                                    CollectionsKt.removeAll(hashSet, b.f43838d);
                                    Ge.h.c(d.s(aVar3, hashSet), z13, z12 ? 1 : 0, r15);
                                }
                                chatWithAnyId = LiveChatUtil.getChatWithAnyId(chatViewModel.getChatId());
                                syncBrandStatusUseCase = chatViewModel.getSyncBrandStatusUseCase();
                                aVarArr = new Md.a[]{Md.a.Chat};
                                this.f43824n = c5582a2;
                                this.f43825o = chatViewModel;
                                this.f43826p = chatWithAnyId;
                                this.f43827q = r15;
                                this.f43828r = r15;
                                this.f43829s = 4;
                                if (syncBrandStatusUseCase.b(aVarArr, this) != coroutine_suspended) {
                                    c5582a3 = c5582a2;
                                    chatViewModel2 = chatViewModel;
                                    str4 = r15;
                                    salesIQChat = chatWithAnyId;
                                    appStatus = chatViewModel2.getAppStatus(AbstractC3945n.e(salesIQChat == null ? salesIQChat.getDeptid() : str4));
                                    chatViewModel2.getClearFormUseCase().b(appStatus);
                                    h syncFormUseCase = chatViewModel2.getSyncFormUseCase();
                                    this.f43824n = c5582a3;
                                    this.f43825o = chatViewModel2;
                                    this.f43826p = salesIQChat;
                                    this.f43827q = appStatus;
                                    this.f43829s = 5;
                                    Object a10 = syncFormUseCase.a(z12, str4, appStatus, this);
                                    str5 = str4;
                                    break;
                                }
                            } else {
                                MobilistenUtil.z(abstractC6235a2.b(), z13 ? 1 : 0, i11, r15);
                                LiveChatUtil.triggerChatListener("CHAT_ERROR", LiveChatUtil.getChatFromConvID(str3), new b.a(bVar.c()));
                            }
                        }
                        return coroutine_suspended;
                    }
                    Te.a.f11572a.F(this.f43831u);
                    ChatViewModel.this.setChatOpeningApiInProgress(Boxing.boxBoolean(z13));
                    return Unit.INSTANCE;
                case 2:
                    c5582a = (C5582a) this.f43824n;
                    ResultKt.throwOnFailure(obj);
                    i10 = 3;
                    i11 = 2;
                    z13 = false;
                    str = null;
                    z12 = true;
                    AbstractC6235a.c cVar2 = AbstractC6235a.c.Conversations;
                    chatViewModel = ChatViewModel.this;
                    String str112 = this.f43831u;
                    if (!c5582a.d()) {
                    }
                    Te.a.f11572a.F(this.f43831u);
                    ChatViewModel.this.setChatOpeningApiInProgress(Boxing.boxBoolean(z13));
                    return Unit.INSTANCE;
                case 3:
                    abstractC6235a2 = (AbstractC6235a) this.f43828r;
                    bVar = (C5582a.b) this.f43827q;
                    str3 = (String) this.f43826p;
                    chatViewModel = (ChatViewModel) this.f43825o;
                    C5582a c5582a4 = (C5582a) this.f43824n;
                    ResultKt.throwOnFailure(obj);
                    z13 = false;
                    r15 = 0;
                    c5582a2 = c5582a4;
                    i11 = 2;
                    z12 = true;
                    if (Intrinsics.areEqual(abstractC6235a2, C6239e.f64119d)) {
                        break;
                    }
                    if (Intrinsics.areEqual(abstractC6235a2, C6248n.f64128d)) {
                    }
                    chatWithAnyId = LiveChatUtil.getChatWithAnyId(chatViewModel.getChatId());
                    syncBrandStatusUseCase = chatViewModel.getSyncBrandStatusUseCase();
                    aVarArr = new Md.a[]{Md.a.Chat};
                    this.f43824n = c5582a2;
                    this.f43825o = chatViewModel;
                    this.f43826p = chatWithAnyId;
                    this.f43827q = r15;
                    this.f43828r = r15;
                    this.f43829s = 4;
                    if (syncBrandStatusUseCase.b(aVarArr, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 4:
                    chatWithAnyId = (SalesIQChat) this.f43826p;
                    ChatViewModel chatViewModel4 = (ChatViewModel) this.f43825o;
                    c5582a3 = (C5582a) this.f43824n;
                    ResultKt.throwOnFailure(obj);
                    chatViewModel2 = chatViewModel4;
                    z13 = false;
                    str4 = null;
                    z12 = true;
                    salesIQChat = chatWithAnyId;
                    appStatus = chatViewModel2.getAppStatus(AbstractC3945n.e(salesIQChat == null ? salesIQChat.getDeptid() : str4));
                    chatViewModel2.getClearFormUseCase().b(appStatus);
                    h syncFormUseCase2 = chatViewModel2.getSyncFormUseCase();
                    this.f43824n = c5582a3;
                    this.f43825o = chatViewModel2;
                    this.f43826p = salesIQChat;
                    this.f43827q = appStatus;
                    this.f43829s = 5;
                    Object a102 = syncFormUseCase2.a(z12, str4, appStatus, this);
                    str5 = str4;
                    break;
                case 5:
                    appStatus = (EnumC4544a) this.f43827q;
                    salesIQChat = (SalesIQChat) this.f43826p;
                    chatViewModel2 = (ChatViewModel) this.f43825o;
                    c5582a3 = (C5582a) this.f43824n;
                    ResultKt.throwOnFailure(obj);
                    z13 = false;
                    str5 = null;
                    this.f43824n = c5582a3;
                    this.f43825o = str5;
                    this.f43826p = str5;
                    this.f43827q = str5;
                    this.f43829s = 6;
                    break;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    z13 = false;
                    Te.a.f11572a.F(this.f43831u);
                    ChatViewModel.this.setChatOpeningApiInProgress(Boxing.boxBoolean(z13));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final class L extends Lambda implements Function0 {
        public L() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l invoke() {
            return new l(ChatViewModel.this.getMessagesRepository());
        }
    }

    public static final class L0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43840n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43842p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L0(String str, Continuation continuation) {
            super(2, continuation);
            this.f43842p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new L0(this.f43842p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((L0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43840n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                g syncBrandStatusUseCase = ChatViewModel.this.getSyncBrandStatusUseCase();
                Md.a[] aVarArr = {Md.a.Chat};
                this.f43840n = 1;
                obj = syncBrandStatusUseCase.b(aVarArr, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ChatViewModel.this._uiEvents.a(new AbstractC3882b.C0630b(Md.a.Chat, ((C5582a) obj).d(), this.f43842p));
            return Unit.INSTANCE;
        }
    }

    public static final class M extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f43843n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43844o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43845p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43846q;

        /* renamed from: r, reason: collision with root package name */
        public Object f43847r;

        /* renamed from: s, reason: collision with root package name */
        public Object f43848s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f43849t;

        /* renamed from: v, reason: collision with root package name */
        public int f43851v;

        public M(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43849t = obj;
            this.f43851v |= Integer.MIN_VALUE;
            return ChatViewModel.this.handleFormAndDepartmentStatusDiffersFallback(null, null, this);
        }
    }

    public static final class M0 extends Lambda implements Function0 {
        public M0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return new g(ChatViewModel.this.getBrandRepository());
        }
    }

    public static final class N extends Lambda implements Function0 {
        public N() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Xd.c invoke() {
            return new Xd.c(ChatViewModel.this.getCallsRepository());
        }
    }

    public static final class N0 extends Lambda implements Function0 {
        public N0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return new h(ChatViewModel.this.getBrandRepository());
        }
    }

    public static final class O extends Lambda implements Function0 {
        public O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sf.e invoke() {
            return new Sf.e(ChatViewModel.this.getTriggersRepository());
        }
    }

    public static final class O0 extends Lambda implements Function0 {
        public O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.x invoke() {
            return new yf.x(ChatViewModel.this.getMessagesRepository());
        }
    }

    public static final class P extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43857n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43858o;

        /* renamed from: p, reason: collision with root package name */
        public int f43859p;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f43861r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Rf.a f43862s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f43863t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f43864u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f43865v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f43866w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f43867x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ boolean f43868y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f43869z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P(boolean z10, Rf.a aVar, String str, String str2, String str3, String str4, boolean z11, boolean z12, boolean z13, Continuation continuation) {
            super(2, continuation);
            this.f43861r = z10;
            this.f43862s = aVar;
            this.f43863t = str;
            this.f43864u = str2;
            this.f43865v = str3;
            this.f43866w = str4;
            this.f43867x = z11;
            this.f43868y = z12;
            this.f43869z = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new P(this.f43861r, this.f43862s, this.f43863t, this.f43864u, this.f43865v, this.f43866w, this.f43867x, this.f43868y, this.f43869z, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((P) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00b3, code lost:
        
            if (r0.invokeStartChatCallbackFailure(r2, r3, r18) == r15) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00b5, code lost:
        
            return r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
        
            if (r1.invokeStartChatCallback(r2, r18) == r15) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        
            if (r0 == r15) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object b10;
            C5582a c5582a;
            C5582a c5582a2;
            ChatViewModel chatViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43859p;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Sf.e initiateTrigger = ChatViewModel.this.getInitiateTrigger();
                boolean z10 = !this.f43861r;
                String a10 = ZohoSalesIQ.m.a(Uf.j.n());
                Rf.a aVar = this.f43862s;
                String str = this.f43863t;
                String str2 = this.f43864u;
                String str3 = this.f43865v;
                String str4 = this.f43866w;
                boolean z11 = this.f43867x;
                boolean z12 = this.f43868y;
                boolean z13 = this.f43869z;
                this.f43859p = 1;
                b10 = Sf.e.b(initiateTrigger, aVar, str, str2, str3, a10, str4, z11, false, z12, z13, z10, this, 128, null);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        chatViewModel = (ChatViewModel) this.f43858o;
                        c5582a2 = (C5582a) this.f43857n;
                        ResultKt.throwOnFailure(obj);
                        chatViewModel.setAcknowledgementKey(null);
                        Te.a.f11572a.F(this.f43865v);
                        return c5582a2;
                    }
                    c5582a = (C5582a) this.f43857n;
                    ResultKt.throwOnFailure(obj);
                    c5582a2 = c5582a;
                    chatViewModel = ChatViewModel.this;
                    String str5 = this.f43865v;
                    if (!c5582a2.d()) {
                        C5582a.b c10 = c5582a2.c();
                        Intrinsics.checkNotNull(c10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                        this.f43857n = c5582a2;
                        this.f43858o = chatViewModel;
                        this.f43859p = 3;
                    }
                    Te.a.f11572a.F(this.f43865v);
                    return c5582a2;
                }
                ResultKt.throwOnFailure(obj);
                b10 = obj;
            }
            c5582a = (C5582a) b10;
            ChatViewModel chatViewModel2 = ChatViewModel.this;
            String str6 = this.f43865v;
            if (c5582a.d()) {
                this.f43857n = c5582a;
                this.f43859p = 2;
            }
            c5582a2 = c5582a;
            chatViewModel = ChatViewModel.this;
            String str52 = this.f43865v;
            if (!c5582a2.d()) {
            }
            Te.a.f11572a.F(this.f43865v);
            return c5582a2;
        }
    }

    public static final class P0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43870n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43871o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43872p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43873q;

        /* renamed from: r, reason: collision with root package name */
        public int f43874r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f43875s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Long f43876t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ChatViewModel f43877u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List f43878v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P0(Long l10, ChatViewModel chatViewModel, List list, Continuation continuation) {
            super(2, continuation);
            this.f43876t = l10;
            this.f43877u = chatViewModel;
            this.f43878v = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            P0 p02 = new P0(this.f43876t, this.f43877u, this.f43878v, continuation);
            p02.f43875s = obj;
            return p02;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((P0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0199, code lost:
        
            if (yf.x.b(r0, r1, false, r3, 2, null) == r7) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00fd, code lost:
        
            if (r6.a(r14, r15, r13, r3) == r7) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
        
            if (r5.a(r1, r6, r3) == r7) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x016a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0199 -> B:9:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x015a -> B:21:0x015e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ph.P p10;
            Long l10;
            Unit unit;
            ChatViewModel chatViewModel;
            List list;
            Iterator it;
            Ph.P p11;
            ChatViewModel chatViewModel2;
            Long l11;
            Iterator it2;
            ChatViewModel chatViewModel3;
            boolean z10;
            Ph.P p12;
            ChatViewModel chatViewModel4;
            Long l12;
            Iterator it3;
            Message message;
            yf.F updateMessageTypingStatus;
            String chatId;
            String id2;
            char c10;
            Long typingDelay;
            P0 p02 = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = p02.f43874r;
            boolean z11 = true;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                p10 = (Ph.P) p02.f43875s;
                l10 = p02.f43876t;
                if (l10 == null) {
                    unit = null;
                    if (unit == null) {
                    }
                    return Unit.INSTANCE;
                }
                chatViewModel = p02.f43877u;
                list = p02.f43878v;
                C6885b addMessages = chatViewModel.getAddMessages();
                Boolean boxBoolean = Boxing.boxBoolean(true);
                p02.f43875s = p10;
                p02.f43870n = chatViewModel;
                p02.f43871o = list;
                p02.f43872p = l10;
                p02.f43874r = 1;
            } else if (i10 == 1) {
                l10 = (Long) p02.f43872p;
                list = (List) p02.f43871o;
                chatViewModel = (ChatViewModel) p02.f43870n;
                p10 = (Ph.P) p02.f43875s;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i10 == 2) {
                    message = (Message) p02.f43873q;
                    it = (Iterator) p02.f43872p;
                    l11 = (Long) p02.f43871o;
                    chatViewModel2 = (ChatViewModel) p02.f43870n;
                    p11 = (Ph.P) p02.f43875s;
                    ResultKt.throwOnFailure(obj);
                    z10 = true;
                    Message.Meta meta = message.getMeta();
                    long longValue = (meta == null || (typingDelay = meta.getTypingDelay()) == null) ? l11.longValue() : typingDelay.longValue();
                    p02.f43875s = p11;
                    p02.f43870n = chatViewModel2;
                    p02.f43871o = l11;
                    p02.f43872p = it;
                    p02.f43873q = message;
                    p02.f43874r = 3;
                    if (AbstractC1440a0.a(longValue * 1000, p02) != coroutine_suspended) {
                        it3 = it;
                        l12 = l11;
                        chatViewModel4 = chatViewModel2;
                        p12 = p11;
                        updateMessageTypingStatus = chatViewModel4.getUpdateMessageTypingStatus();
                        Message message2 = message;
                        chatId = message2.getChatId();
                        id2 = message2.getId();
                        p02.f43875s = p12;
                        p02.f43870n = chatViewModel4;
                        p02.f43871o = l12;
                        p02.f43872p = it3;
                        p02.f43873q = null;
                        c10 = 4;
                        p02.f43874r = 4;
                        p02 = this;
                        if (yf.F.b(updateMessageTypingStatus, chatId, id2, null, this, 4, null) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i10 == 3) {
                    message = (Message) p02.f43873q;
                    Iterator it4 = (Iterator) p02.f43872p;
                    Long l13 = (Long) p02.f43871o;
                    ChatViewModel chatViewModel5 = (ChatViewModel) p02.f43870n;
                    Ph.P p13 = (Ph.P) p02.f43875s;
                    ResultKt.throwOnFailure(obj);
                    z10 = true;
                    it3 = it4;
                    l12 = l13;
                    p12 = p13;
                    chatViewModel4 = chatViewModel5;
                    updateMessageTypingStatus = chatViewModel4.getUpdateMessageTypingStatus();
                    Message message22 = message;
                    chatId = message22.getChatId();
                    id2 = message22.getId();
                    p02.f43875s = p12;
                    p02.f43870n = chatViewModel4;
                    p02.f43871o = l12;
                    p02.f43872p = it3;
                    p02.f43873q = null;
                    c10 = 4;
                    p02.f43874r = 4;
                    p02 = this;
                    if (yf.F.b(updateMessageTypingStatus, chatId, id2, null, this, 4, null) != coroutine_suspended) {
                        it = it3;
                        l11 = l12;
                        chatViewModel2 = chatViewModel4;
                        p11 = p12;
                        z11 = z10;
                        if (!it.hasNext()) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Iterator it5 = (Iterator) p02.f43870n;
                    ChatViewModel chatViewModel6 = (ChatViewModel) p02.f43875s;
                    ResultKt.throwOnFailure(obj);
                    it2 = it5;
                    chatViewModel3 = chatViewModel6;
                    p02 = this;
                    if (it2.hasNext()) {
                        Message message3 = (Message) it2.next();
                        yf.x syncMessage = chatViewModel3.getSyncMessage();
                        p02.f43875s = chatViewModel3;
                        p02.f43870n = it2;
                        p02.f43871o = null;
                        p02.f43872p = null;
                        p02.f43874r = 5;
                    }
                    return Unit.INSTANCE;
                }
                Iterator it6 = (Iterator) p02.f43872p;
                Long l14 = (Long) p02.f43871o;
                ChatViewModel chatViewModel7 = (ChatViewModel) p02.f43870n;
                Ph.P p14 = (Ph.P) p02.f43875s;
                ResultKt.throwOnFailure(obj);
                p11 = p14;
                c10 = 4;
                z10 = true;
                chatViewModel2 = chatViewModel7;
                l11 = l14;
                it = it6;
                z11 = z10;
                if (!it.hasNext()) {
                    unit = Unit.INSTANCE;
                    if (unit == null) {
                        List list2 = p02.f43878v;
                        ChatViewModel chatViewModel8 = p02.f43877u;
                        it2 = list2.iterator();
                        chatViewModel3 = chatViewModel8;
                        if (it2.hasNext()) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                message = (Message) it.next();
                yf.F updateMessageTypingStatus2 = chatViewModel2.getUpdateMessageTypingStatus();
                String chatId2 = message.getChatId();
                String id3 = message.getId();
                z10 = z11;
                Boolean boxBoolean2 = Boxing.boxBoolean(z10);
                p02.f43875s = p11;
                p02.f43870n = chatViewModel2;
                p02.f43871o = l11;
                p02.f43872p = it;
                p02.f43873q = message;
                p02.f43874r = 2;
            }
            it = list.iterator();
            p11 = p10;
            chatViewModel2 = chatViewModel;
            l11 = l10;
            if (!it.hasNext()) {
            }
        }
    }

    public static final class Q extends Lambda implements Function0 {
        public Q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sf.f invoke() {
            return new Sf.f(ChatViewModel.this.getTriggersRepository());
        }
    }

    public static final class Q0 extends Lambda implements Function0 {
        public Q0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.y invoke() {
            return new yf.y(ChatViewModel.this.getMessagesRepository());
        }
    }

    public static final class R extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43881n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43882o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43883p;

        /* renamed from: q, reason: collision with root package name */
        public int f43884q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f43885r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ChatViewModel f43886s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f43887t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f43888u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f43889v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public R(String str, ChatViewModel chatViewModel, String str2, boolean z10, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f43885r = str;
            this.f43886s = chatViewModel;
            this.f43887t = str2;
            this.f43888u = z10;
            this.f43889v = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new R(this.f43885r, this.f43886s, this.f43887t, this.f43888u, this.f43889v, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((R) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00dc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            R r10;
            ChatViewModel chatViewModel;
            String str;
            C5582a c5582a;
            String str2;
            C5582a c5582a2;
            C5582a c5582a3;
            ChatViewModel chatViewModel2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43884q;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Bot bot = i.f(this.f43885r) ? UTSUtil.getBot(UTSUtil.EVENT_CUSTOM_ACTIONS, this.f43885r) : UTSUtil.getBot(UTSUtil.EVENT_WIDGET_INTERACTION, null);
                String id2 = bot != null ? bot.getId() : null;
                if (id2 == null) {
                    r10 = this;
                    C5582a b10 = C5582a.f56502b.b(new C5582a.b(we.d.f67628J.b(), null, null, 6, null));
                    Te.a.f11572a.F(r10.f43887t);
                    return b10;
                }
                ChatViewModel chatViewModel3 = this.f43886s;
                String str3 = this.f43887t;
                boolean z10 = this.f43888u;
                boolean z11 = this.f43889v;
                this.f43881n = chatViewModel3;
                this.f43882o = str3;
                this.f43884q = 1;
                r10 = this;
                Object a10 = chatViewModel3.getInitiateVTSTrigger().a(id2, str3, z10, !z11, r10);
                if (a10 != coroutine_suspended) {
                    chatViewModel = chatViewModel3;
                    obj = a10;
                    str = str3;
                }
                return coroutine_suspended;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5582a3 = (C5582a) this.f43883p;
                    str = (String) this.f43882o;
                    chatViewModel2 = (ChatViewModel) this.f43881n;
                    ResultKt.throwOnFailure(obj);
                    r10 = this;
                    chatViewModel2.setAcknowledgementKey(null);
                    c5582a = c5582a3;
                    Te.a.f11572a.F(str);
                    if (c5582a != null) {
                        return c5582a;
                    }
                    C5582a b102 = C5582a.f56502b.b(new C5582a.b(we.d.f67628J.b(), null, null, 6, null));
                    Te.a.f11572a.F(r10.f43887t);
                    return b102;
                }
                c5582a2 = (C5582a) this.f43883p;
                str2 = (String) this.f43882o;
                chatViewModel = (ChatViewModel) this.f43881n;
                ResultKt.throwOnFailure(obj);
                r10 = this;
                c5582a = c5582a2;
                str = str2;
                if (!c5582a.d()) {
                    C5582a.b c10 = c5582a.c();
                    Intrinsics.checkNotNull(c10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                    r10.f43881n = chatViewModel;
                    r10.f43882o = str;
                    r10.f43883p = c5582a;
                    r10.f43884q = 3;
                    if (chatViewModel.invokeStartChatCallbackFailure(str, c10, this) != coroutine_suspended) {
                        c5582a3 = c5582a;
                        chatViewModel2 = chatViewModel;
                        chatViewModel2.setAcknowledgementKey(null);
                        c5582a = c5582a3;
                    }
                    return coroutine_suspended;
                }
                Te.a.f11572a.F(str);
                if (c5582a != null) {
                }
                C5582a b1022 = C5582a.f56502b.b(new C5582a.b(we.d.f67628J.b(), null, null, 6, null));
                Te.a.f11572a.F(r10.f43887t);
                return b1022;
            }
            str = (String) this.f43882o;
            chatViewModel = (ChatViewModel) this.f43881n;
            ResultKt.throwOnFailure(obj);
            r10 = this;
            c5582a = (C5582a) obj;
            if (c5582a.d()) {
                r10.f43881n = chatViewModel;
                r10.f43882o = str;
                r10.f43883p = c5582a;
                r10.f43884q = 2;
                if (chatViewModel.invokeStartChatCallback(str, this) != coroutine_suspended) {
                    str2 = str;
                    c5582a2 = c5582a;
                    c5582a = c5582a2;
                    str = str2;
                }
                return coroutine_suspended;
            }
            if (!c5582a.d()) {
            }
            Te.a.f11572a.F(str);
            if (c5582a != null) {
            }
            C5582a b10222 = C5582a.f56502b.b(new C5582a.b(we.d.f67628J.b(), null, null, 6, null));
            Te.a.f11572a.F(r10.f43887t);
            return b10222;
        }
    }

    public static final class R0 extends SuspendLambda implements Function2 {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ boolean f43890A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ y.a f43891B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ Function1 f43892C;

        /* renamed from: D, reason: collision with root package name */
        public final /* synthetic */ boolean f43893D;

        /* renamed from: n, reason: collision with root package name */
        public Object f43894n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43895o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43896p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43897q;

        /* renamed from: r, reason: collision with root package name */
        public int f43898r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f43900t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f43901u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f43902v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f43903w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f43904x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Long f43905y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Long f43906z;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f43907n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Function1 f43908o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ MessageSyncData f43909p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ ChatViewModel f43910q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Function1 function1, MessageSyncData messageSyncData, ChatViewModel chatViewModel, Continuation continuation) {
                super(2, continuation);
                this.f43908o = function1;
                this.f43909p = messageSyncData;
                this.f43910q = chatViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f43908o, this.f43909p, this.f43910q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Ph.P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f43907n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1 function1 = this.f43908o;
                if (function1 != null) {
                    function1.invoke(Boxing.boxBoolean(true));
                }
                if (this.f43909p != null) {
                    this.f43910q.messagesSyncDataMutableStateFlow.setValue(((MessageSyncData) this.f43910q.messagesSyncDataMutableStateFlow.getValue()).copy(i.i(Boxing.boxBoolean(this.f43909p.getHasMoreDataAvailableAtBottom())), i.i(Boxing.boxBoolean(this.f43909p.isAllMessagesReceivedFromTop()))));
                }
                return Unit.INSTANCE;
            }
        }

        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f43911n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Function1 f43912o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Function1 function1, Continuation continuation) {
                super(2, continuation);
                this.f43912o = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f43912o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Ph.P p10, Continuation continuation) {
                return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f43911n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1 function1 = this.f43912o;
                if (function1 == null) {
                    return null;
                }
                function1.invoke(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public R0(String str, String str2, String str3, String str4, String str5, Long l10, Long l11, boolean z10, y.a aVar, Function1 function1, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f43900t = str;
            this.f43901u = str2;
            this.f43902v = str3;
            this.f43903w = str4;
            this.f43904x = str5;
            this.f43905y = l10;
            this.f43906z = l11;
            this.f43890A = z10;
            this.f43891B = aVar;
            this.f43892C = function1;
            this.f43893D = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new R0(this.f43900t, this.f43901u, this.f43902v, this.f43903w, this.f43904x, this.f43905y, this.f43906z, this.f43890A, this.f43891B, this.f43892C, this.f43893D, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((R0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ef, code lost:
        
            if (Ph.AbstractC1455i.g(r1, r6, r18) == r11) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
        
            if (Ph.AbstractC1455i.g(r4, r5, r18) == r11) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
        
            if (r0 == r11) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Continuation continuation;
            Object a10;
            C5582a c5582a;
            C5582a c5582a2;
            String str;
            AbstractC6235a abstractC6235a;
            C5582a.b c10;
            ChatViewModel chatViewModel;
            boolean z10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43898r;
            boolean z11 = true;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                yf.y syncMessagesTranscript = ChatViewModel.this.getSyncMessagesTranscript();
                String str2 = this.f43900t;
                String str3 = this.f43901u;
                String str4 = this.f43902v;
                String str5 = this.f43903w;
                String str6 = this.f43904x;
                Long l10 = this.f43905y;
                Long l11 = this.f43906z;
                boolean z12 = this.f43890A;
                y.a aVar = this.f43891B;
                this.f43898r = 1;
                continuation = null;
                a10 = syncMessagesTranscript.a(str2, str3, str4, str5, str6, l10, l11, z12, aVar, this);
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        c5582a = (C5582a) this.f43894n;
                        ResultKt.throwOnFailure(obj);
                        continuation = null;
                        c5582a2 = c5582a;
                        AbstractC6235a.c cVar = AbstractC6235a.c.Messages;
                        ChatViewModel chatViewModel2 = ChatViewModel.this;
                        str = this.f43900t;
                        Function1 function1 = this.f43892C;
                        if (!c5582a2.d()) {
                            C5582a.b c11 = c5582a2.c();
                            if (c11 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c11, cVar)) == null) {
                                abstractC6235a = AbstractC6235a.b.f64114d;
                            }
                            c10 = c5582a2.c();
                            Intrinsics.checkNotNull(c10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                            chatViewModel2.syncTopSyncCompletionData();
                            Ph.M0 c12 = C1452g0.c();
                            b bVar = new b(function1, continuation);
                            this.f43894n = c5582a2;
                            this.f43895o = str;
                            this.f43896p = c10;
                            this.f43897q = abstractC6235a;
                            this.f43898r = 3;
                        }
                        chatViewModel = ChatViewModel.this;
                        z10 = this.f43893D;
                        String str7 = this.f43901u;
                        String str8 = this.f43902v;
                        chatViewModel.isMessagesApiInProgress = false;
                        if (z10) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        chatViewModel = (ChatViewModel) this.f43895o;
                        ResultKt.throwOnFailure(obj);
                        chatViewModel.setMessagesReceivedAfterFirstApi(z11);
                        return Unit.INSTANCE;
                    }
                    abstractC6235a = (AbstractC6235a) this.f43897q;
                    c10 = (C5582a.b) this.f43896p;
                    str = (String) this.f43895o;
                    c5582a2 = (C5582a) this.f43894n;
                    ResultKt.throwOnFailure(obj);
                    continuation = null;
                    if (!Intrinsics.areEqual(abstractC6235a, C6232N.f64106d)) {
                        MobilistenUtil.z(abstractC6235a.b(), 0, 2, continuation);
                    }
                    LiveChatUtil.triggerChatListener("CHAT_ERROR", LiveChatUtil.getChatFromConvID(str), new b.c(c10.c()));
                    chatViewModel = ChatViewModel.this;
                    z10 = this.f43893D;
                    String str72 = this.f43901u;
                    String str82 = this.f43902v;
                    chatViewModel.isMessagesApiInProgress = false;
                    if (z10) {
                        chatViewModel.setInitialTranscriptCallCompleted(true);
                        if (chatViewModel.getIsMessagesReceivedAfterFirstApi()) {
                            chatViewModel.loadMessages(str72, str82);
                        }
                        this.f43894n = c5582a2;
                        this.f43895o = chatViewModel;
                        this.f43896p = continuation;
                        this.f43897q = continuation;
                        this.f43898r = 4;
                        if (AbstractC1440a0.a(1000L, this) != coroutine_suspended) {
                            z11 = true;
                            chatViewModel.setMessagesReceivedAfterFirstApi(z11);
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                a10 = obj;
                continuation = null;
            }
            c5582a = (C5582a) a10;
            Function1 function12 = this.f43892C;
            ChatViewModel chatViewModel3 = ChatViewModel.this;
            if (c5582a.d()) {
                MessageSyncData messageSyncData = (MessageSyncData) c5582a.b();
                Ph.M0 c13 = C1452g0.c();
                a aVar2 = new a(function12, messageSyncData, chatViewModel3, continuation);
                this.f43894n = c5582a;
                this.f43898r = 2;
            }
            c5582a2 = c5582a;
            AbstractC6235a.c cVar2 = AbstractC6235a.c.Messages;
            ChatViewModel chatViewModel22 = ChatViewModel.this;
            str = this.f43900t;
            Function1 function13 = this.f43892C;
            if (!c5582a2.d()) {
            }
            chatViewModel = ChatViewModel.this;
            z10 = this.f43893D;
            String str722 = this.f43901u;
            String str822 = this.f43902v;
            chatViewModel.isMessagesApiInProgress = false;
            if (z10) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class S extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43913n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f43914o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public S(String str, Continuation continuation) {
            super(2, continuation);
            this.f43914o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new S(this.f43914o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((S) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43913n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SalesIQChat chatWithAnyId = LiveChatUtil.getChatWithAnyId(this.f43914o);
                Te.a aVar = Te.a.f11572a;
                String str = this.f43914o;
                e b10 = chatWithAnyId != null ? e.f67680b.b(chatWithAnyId) : e.f67680b.a(we.d.f67649d);
                this.f43913n = 1;
                if (aVar.q0(str, b10, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class S0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43915n;

        /* renamed from: o, reason: collision with root package name */
        public int f43916o;

        public S0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new S0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((S0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChatViewModel chatViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43916o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                String chatId = ChatViewModel.this.getChatId();
                if (chatId != null) {
                    ChatViewModel chatViewModel2 = ChatViewModel.this;
                    l getTopAndBottomSyncCompletionData = chatViewModel2.getGetTopAndBottomSyncCompletionData();
                    this.f43915n = chatViewModel2;
                    this.f43916o = 1;
                    obj = getTopAndBottomSyncCompletionData.a(chatId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatViewModel = chatViewModel2;
                }
                return Unit.INSTANCE;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chatViewModel = (ChatViewModel) this.f43915n;
            ResultKt.throwOnFailure(obj);
            MessageSyncData messageSyncData = (MessageSyncData) ((C5582a) obj).b();
            chatViewModel.messagesSyncDataMutableStateFlow.setValue(MessageSyncData.copy$default((MessageSyncData) chatViewModel.messagesSyncDataMutableStateFlow.getValue(), false, i.i(messageSyncData != null ? Boxing.boxBoolean(messageSyncData.isAllMessagesReceivedFromTop()) : null), 1, null));
            return Unit.INSTANCE;
        }
    }

    public static final class T extends Lambda implements Function0 {
        public T() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6890g invoke() {
            return new C6890g(ChatViewModel.this.getMessagesRepository());
        }
    }

    public static final class T0 extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final T0 f43919d = new T0();

        public T0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TriggersRepository invoke() {
            TriggersRepository.a aVar = TriggersRepository.f44142g;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return aVar.a(e10);
        }
    }

    public static final class U extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f43920n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f43921o;

        /* renamed from: q, reason: collision with root package name */
        public int f43923q;

        public U(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43921o = obj;
            this.f43923q |= Integer.MIN_VALUE;
            return ChatViewModel.this.isFeedbackExpired(this);
        }
    }

    public static final class U0 extends Lambda implements Function0 {
        public U0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return new o(ChatViewModel.this.getConversationsRepository());
        }
    }

    public static final class V extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43925n;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f43927n;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Ph.P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f43927n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(LiveChatUtil.checkMultipleChatRestriction());
            }
        }

        public V(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new V(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((V) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43925n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Ph.L b10 = C1452g0.b();
                a aVar = new a(null);
                this.f43925n = 1;
                obj = AbstractC1455i.g(b10, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ChatViewModel.this._uiEvents.a(new AbstractC3882b.h(((Boolean) obj).booleanValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class V0 extends Lambda implements Function0 {
        public V0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6882B invoke() {
            return new C6882B(ChatViewModel.this.getMessagesRepository());
        }
    }

    public static final class W extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43929n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43931p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f43932q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public W(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f43931p = str;
            this.f43932q = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new W(this.f43931p, this.f43932q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((W) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43929n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Re.h joinConversation = ChatViewModel.this.getJoinConversation();
                String str = this.f43931p;
                String str2 = this.f43932q;
                this.f43929n = 1;
                if (joinConversation.a(str, str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class W0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43933n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43935p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Message.Extras f43936q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public W0(String str, Message.Extras extras, Continuation continuation) {
            super(2, continuation);
            this.f43935p = str;
            this.f43936q = extras;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new W0(this.f43935p, this.f43936q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((W0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43933n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                String chatId = ChatViewModel.this.getChatId();
                if (chatId != null) {
                    ChatViewModel chatViewModel = ChatViewModel.this;
                    String str = this.f43935p;
                    Message.Extras extras = this.f43936q;
                    C6882B updateMessageExtras = chatViewModel.getUpdateMessageExtras();
                    this.f43933n = 1;
                    if (updateMessageExtras.a(chatId, str, extras, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class X extends Lambda implements Function0 {
        public X() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.h invoke() {
            return new Re.h(ChatViewModel.this.getConversationsRepository());
        }
    }

    public static final class X0 extends Lambda implements Function0 {
        public X0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.D invoke() {
            return new yf.D(ChatViewModel.this.getMessagesRepository());
        }
    }

    public static final class Y extends Lambda implements Function0 {
        public Y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.i invoke() {
            return new Re.i(ChatViewModel.this.getConversationsRepository());
        }
    }

    public static final class Y0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43940n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43942p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f43943q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Message.f f43944r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Y0(String str, String str2, Message.f fVar, Continuation continuation) {
            super(2, continuation);
            this.f43942p = str;
            this.f43943q = str2;
            this.f43944r = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new Y0(this.f43942p, this.f43943q, this.f43944r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((Y0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43940n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                yf.D updateMessageStatus = ChatViewModel.this.getUpdateMessageStatus();
                String str = this.f43942p;
                String str2 = this.f43943q;
                Message.f fVar = this.f43944r;
                this.f43940n = 1;
                if (updateMessageStatus.b(str, str2, fVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Z extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43945n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43946o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43947p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43948q;

        /* renamed from: r, reason: collision with root package name */
        public Object f43949r;

        /* renamed from: s, reason: collision with root package name */
        public int f43950s;

        /* renamed from: t, reason: collision with root package name */
        public int f43951t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f43953v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f43954w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f43955x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f43956y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f43957z;

        public static final class a extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public static final a f43958d = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String str) {
                return Boolean.valueOf(Intrinsics.areEqual(str, "department"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Z(String str, String str2, String str3, String str4, String str5, Continuation continuation) {
            super(2, continuation);
            this.f43953v = str;
            this.f43954w = str2;
            this.f43955x = str3;
            this.f43956y = str4;
            this.f43957z = str5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new Z(this.f43953v, this.f43954w, this.f43955x, this.f43956y, this.f43957z, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((Z) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0216, code lost:
        
            if (r2.handleFormAndDepartmentStatusDiffersFallback(r1, r0, r15) == r10) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0204, code lost:
        
            if (r4.a(true, null, r0, r15) == r10) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0184, code lost:
        
            if (r2.a(r1, r4, r5, r15) == r10) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x01d7, code lost:
        
            if (r1.b(r4, r15) != r10) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x00e6, code lost:
        
            if (r3.invokeStartChatCallback(r4, r15) == r10) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00a7, code lost:
        
            if (r0 == r10) goto L80;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object b10;
            C5582a c5582a;
            String str;
            ChatViewModel chatViewModel;
            LeaveMessageResponse leaveMessageResponse;
            SalesIQChat chatFromConvID;
            int i10;
            C5582a c5582a2;
            ChatViewModel chatViewModel2;
            AbstractC6235a abstractC6235a;
            String str2;
            SalesIQChat chatWithAnyId;
            SalesIQChat salesIQChat;
            EnumC4544a appStatus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f43951t) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    Re.i leaveAsMissedConversation = ChatViewModel.this.getLeaveAsMissedConversation();
                    String str3 = this.f43953v;
                    String str4 = this.f43954w;
                    String str5 = this.f43955x;
                    String str6 = this.f43956y;
                    String str7 = this.f43957z;
                    this.f43951t = 1;
                    b10 = Re.i.b(leaveAsMissedConversation, str3, str4, str5, str6, str7, null, this, 32, null);
                    break;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    b10 = obj;
                    c5582a = (C5582a) b10;
                    str = this.f43954w;
                    chatViewModel = ChatViewModel.this;
                    if (c5582a.d()) {
                        leaveMessageResponse = (LeaveMessageResponse) c5582a.b();
                        chatFromConvID = LiveChatUtil.getChatFromConvID(str);
                        i10 = (!leaveMessageResponse.isConversationStarted() || chatFromConvID == null || chatFromConvID.canShowQueue()) ? 0 : 1;
                        this.f43945n = c5582a;
                        this.f43946o = str;
                        this.f43947p = chatViewModel;
                        this.f43948q = leaveMessageResponse;
                        this.f43949r = chatFromConvID;
                        this.f43950s = i10;
                        this.f43951t = 2;
                        break;
                    }
                    c5582a2 = c5582a;
                    AbstractC6235a.c cVar = AbstractC6235a.c.Conversations;
                    chatViewModel2 = ChatViewModel.this;
                    String str8 = this.f43954w;
                    String str9 = this.f43953v;
                    if (!c5582a2.d()) {
                        C5582a.b c10 = c5582a2.c();
                        if (c10 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c10, cVar)) == null) {
                            abstractC6235a = AbstractC6235a.b.f64114d;
                        }
                        C5582a.b c11 = c5582a2.c();
                        Intrinsics.checkNotNull(c11, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                        this.f43945n = c5582a2;
                        this.f43946o = chatViewModel2;
                        this.f43947p = str9;
                        this.f43948q = abstractC6235a;
                        this.f43949r = null;
                        this.f43951t = 3;
                        if (chatViewModel2.invokeStartChatCallbackFailure(str8, c11, this) != coroutine_suspended) {
                            str2 = str9;
                            if (Intrinsics.areEqual(abstractC6235a, C6247m.f64127d) && !Intrinsics.areEqual(abstractC6235a, C6244j.f64124d) && !Intrinsics.areEqual(abstractC6235a, C6249o.f64129d) && !Intrinsics.areEqual(abstractC6235a, C6251q.f64131d) && !Intrinsics.areEqual(abstractC6235a, C6248n.f64128d)) {
                                yf.D updateMessageStatus = chatViewModel2.getUpdateMessageStatus();
                                Message.g gVar = Message.g.Question;
                                Message.f fVar = Message.f.Failure;
                                this.f43945n = c5582a2;
                                this.f43946o = abstractC6235a;
                                this.f43947p = null;
                                this.f43948q = null;
                                this.f43951t = 7;
                                break;
                            } else {
                                if (Intrinsics.areEqual(abstractC6235a, C6248n.f64128d)) {
                                    De.a aVar = De.a.OngoingConversationContextRequestedMessages;
                                    Set n10 = d.n(aVar, null);
                                    HashSet hashSet = n10 instanceof HashSet ? (HashSet) n10 : null;
                                    if (hashSet == null) {
                                        hashSet = new HashSet();
                                    }
                                    CollectionsKt.removeAll(hashSet, a.f43958d);
                                    Ge.h.c(d.s(aVar, hashSet), false, 1, null);
                                }
                                chatWithAnyId = LiveChatUtil.getChatWithAnyId(str2);
                                g syncBrandStatusUseCase = chatViewModel2.getSyncBrandStatusUseCase();
                                Md.a[] aVarArr = {Md.a.Chat};
                                this.f43945n = c5582a2;
                                this.f43946o = chatViewModel2;
                                this.f43947p = chatWithAnyId;
                                this.f43948q = null;
                                this.f43951t = 4;
                                break;
                            }
                        }
                        return coroutine_suspended;
                    }
                    Te.a.f11572a.F(this.f43954w);
                    return Unit.INSTANCE;
                case 2:
                    i10 = this.f43950s;
                    chatFromConvID = (SalesIQChat) this.f43949r;
                    leaveMessageResponse = (LeaveMessageResponse) this.f43948q;
                    chatViewModel = (ChatViewModel) this.f43947p;
                    str = (String) this.f43946o;
                    c5582a = (C5582a) this.f43945n;
                    ResultKt.throwOnFailure(obj);
                    MobilistenUtil.A(AbstractC6462a.b(C6822a.m()), 0, 2, null);
                    chatViewModel.sendRefreshBroadCast(leaveMessageResponse.getChatId(), str, i10 != 0);
                    LiveChatUtil.triggerChatListener("CHAT_MISSED", chatFromConvID);
                    c5582a2 = c5582a;
                    AbstractC6235a.c cVar2 = AbstractC6235a.c.Conversations;
                    chatViewModel2 = ChatViewModel.this;
                    String str82 = this.f43954w;
                    String str92 = this.f43953v;
                    if (!c5582a2.d()) {
                    }
                    Te.a.f11572a.F(this.f43954w);
                    return Unit.INSTANCE;
                case 3:
                    abstractC6235a = (AbstractC6235a) this.f43948q;
                    str2 = (String) this.f43947p;
                    chatViewModel2 = (ChatViewModel) this.f43946o;
                    c5582a2 = (C5582a) this.f43945n;
                    ResultKt.throwOnFailure(obj);
                    if (Intrinsics.areEqual(abstractC6235a, C6247m.f64127d)) {
                        break;
                    }
                    if (Intrinsics.areEqual(abstractC6235a, C6248n.f64128d)) {
                    }
                    chatWithAnyId = LiveChatUtil.getChatWithAnyId(str2);
                    g syncBrandStatusUseCase2 = chatViewModel2.getSyncBrandStatusUseCase();
                    Md.a[] aVarArr2 = {Md.a.Chat};
                    this.f43945n = c5582a2;
                    this.f43946o = chatViewModel2;
                    this.f43947p = chatWithAnyId;
                    this.f43948q = null;
                    this.f43951t = 4;
                    break;
                case 4:
                    chatWithAnyId = (SalesIQChat) this.f43947p;
                    ChatViewModel chatViewModel3 = (ChatViewModel) this.f43946o;
                    C5582a c5582a3 = (C5582a) this.f43945n;
                    ResultKt.throwOnFailure(obj);
                    c5582a2 = c5582a3;
                    chatViewModel2 = chatViewModel3;
                    salesIQChat = chatWithAnyId;
                    appStatus = chatViewModel2.getAppStatus(AbstractC3945n.e(salesIQChat != null ? salesIQChat.getDeptid() : null));
                    chatViewModel2.getClearFormUseCase().b(appStatus);
                    h syncFormUseCase = chatViewModel2.getSyncFormUseCase();
                    this.f43945n = c5582a2;
                    this.f43946o = chatViewModel2;
                    this.f43947p = salesIQChat;
                    this.f43948q = appStatus;
                    this.f43951t = 5;
                    break;
                case 5:
                    appStatus = (EnumC4544a) this.f43948q;
                    salesIQChat = (SalesIQChat) this.f43947p;
                    chatViewModel2 = (ChatViewModel) this.f43946o;
                    c5582a2 = (C5582a) this.f43945n;
                    ResultKt.throwOnFailure(obj);
                    this.f43945n = c5582a2;
                    this.f43946o = null;
                    this.f43947p = null;
                    this.f43948q = null;
                    this.f43951t = 6;
                    break;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    Te.a.f11572a.F(this.f43954w);
                    return Unit.INSTANCE;
                case 7:
                    abstractC6235a = (AbstractC6235a) this.f43946o;
                    ResultKt.throwOnFailure(obj);
                    MobilistenUtil.z(abstractC6235a.b(), 0, 2, null);
                    Te.a.f11572a.F(this.f43954w);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final class Z0 extends Lambda implements Function0 {
        public Z0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.F invoke() {
            return new yf.F(ChatViewModel.this.getMessagesRepository());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$a, reason: case insensitive filesystem */
    public static final class EnumC3880a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC3880a[] $VALUES;
        public static final EnumC3880a ADD_MESSAGE_COMPLETE = new EnumC3880a("ADD_MESSAGE_COMPLETE", 0);
        public static final EnumC3880a SEND_MESSAGE = new EnumC3880a("SEND_MESSAGE", 1);
        public static final EnumC3880a REOPEN_CLICK = new EnumC3880a("REOPEN_CLICK", 2);

        private static final /* synthetic */ EnumC3880a[] $values() {
            return new EnumC3880a[]{ADD_MESSAGE_COMPLETE, SEND_MESSAGE, REOPEN_CLICK};
        }

        static {
            EnumC3880a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private EnumC3880a(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<EnumC3880a> getEntries() {
            return $ENTRIES;
        }

        public static EnumC3880a valueOf(String str) {
            return (EnumC3880a) Enum.valueOf(EnumC3880a.class, str);
        }

        public static EnumC3880a[] values() {
            return (EnumC3880a[]) $VALUES.clone();
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$a0, reason: case insensitive filesystem */
    public static final class C3881a0 extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f43960n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43961o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f43962p;

        /* renamed from: r, reason: collision with root package name */
        public int f43964r;

        public C3881a0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43962p = obj;
            this.f43964r |= Integer.MIN_VALUE;
            return ChatViewModel.this.loadDraftIntoConversation(null, this);
        }
    }

    public static final class a1 extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f43965n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43966o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f43967p;

        /* renamed from: r, reason: collision with root package name */
        public int f43969r;

        public a1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43967p = obj;
            this.f43969r |= Integer.MIN_VALUE;
            return ChatViewModel.this.updateUnreadCount(null, null, this);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b, reason: case insensitive filesystem */
    public static abstract class AbstractC3882b {

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b$a */
        public static final class a extends AbstractC3882b {

            /* renamed from: a, reason: collision with root package name */
            public final String f43970a;

            public a(String str) {
                super(null);
                this.f43970a = str;
            }

            public final String a() {
                return this.f43970a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f43970a, ((a) obj).f43970a);
            }

            public int hashCode() {
                String str = this.f43970a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "AddMessageComplete(tag=" + this.f43970a + ')';
            }
        }

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b$b, reason: collision with other inner class name */
        public static final class C0630b extends AbstractC3882b {

            /* renamed from: a, reason: collision with root package name */
            public final Md.a f43971a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f43972b;

            /* renamed from: c, reason: collision with root package name */
            public final String f43973c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0630b(Md.a component, boolean z10, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(component, "component");
                this.f43971a = component;
                this.f43972b = z10;
                this.f43973c = str;
            }

            public final String a() {
                return this.f43973c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0630b)) {
                    return false;
                }
                C0630b c0630b = (C0630b) obj;
                return this.f43971a == c0630b.f43971a && this.f43972b == c0630b.f43972b && Intrinsics.areEqual(this.f43973c, c0630b.f43973c);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.f43971a.hashCode() * 31;
                boolean z10 = this.f43972b;
                int i10 = z10;
                if (z10 != 0) {
                    i10 = 1;
                }
                int i11 = (hashCode + i10) * 31;
                String str = this.f43973c;
                return i11 + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "BrandStatusSynced(component=" + this.f43971a + ", isSuccess=" + this.f43972b + ", tag=" + this.f43973c + ')';
            }
        }

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b$c */
        public static final class c extends AbstractC3882b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f43974a = new c();

            public c() {
                super(null);
            }
        }

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b$d */
        public static final class d extends AbstractC3882b {

            /* renamed from: a, reason: collision with root package name */
            public static final d f43975a = new d();

            public d() {
                super(null);
            }
        }

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b$e */
        public static final class e extends AbstractC3882b {

            /* renamed from: a, reason: collision with root package name */
            public static final e f43976a = new e();

            public e() {
                super(null);
            }
        }

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b$f */
        public static final class f extends AbstractC3882b {

            /* renamed from: a, reason: collision with root package name */
            public final Message f43977a;

            public f(Message message) {
                super(null);
                this.f43977a = message;
            }

            public final Message a() {
                return this.f43977a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && Intrinsics.areEqual(this.f43977a, ((f) obj).f43977a);
            }

            public int hashCode() {
                Message message = this.f43977a;
                if (message == null) {
                    return 0;
                }
                return message.hashCode();
            }

            public String toString() {
                return "LastOperatorMessageReceived(message=" + this.f43977a + ')';
            }
        }

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b$g */
        public static final class g extends AbstractC3882b {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f43978a;

            /* renamed from: b, reason: collision with root package name */
            public final C5582a.b f43979b;

            public g(boolean z10, C5582a.b bVar) {
                super(null);
                this.f43978a = z10;
                this.f43979b = bVar;
            }

            public final C5582a.b a() {
                return this.f43979b;
            }

            public final boolean b() {
                return this.f43978a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.f43978a == gVar.f43978a && Intrinsics.areEqual(this.f43979b, gVar.f43979b);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            public int hashCode() {
                boolean z10 = this.f43978a;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                int i10 = r02 * 31;
                C5582a.b bVar = this.f43979b;
                return i10 + (bVar == null ? 0 : bVar.hashCode());
            }

            public String toString() {
                return "MailTranscriptComplete(isSuccess=" + this.f43978a + ", error=" + this.f43979b + ')';
            }
        }

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b$h */
        public static final class h extends AbstractC3882b {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f43980a;

            public h(boolean z10) {
                super(null);
                this.f43980a = z10;
            }

            public final boolean a() {
                return this.f43980a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.f43980a == ((h) obj).f43980a;
            }

            public int hashCode() {
                boolean z10 = this.f43980a;
                if (z10) {
                    return 1;
                }
                return z10 ? 1 : 0;
            }

            public String toString() {
                return "MultipleChatRestricted(isRestricted=" + this.f43980a + ')';
            }
        }

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b$i */
        public static final class i extends AbstractC3882b {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f43981a;

            public i(boolean z10) {
                super(null);
                this.f43981a = z10;
            }

            public final boolean a() {
                return this.f43981a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.f43981a == ((i) obj).f43981a;
            }

            public int hashCode() {
                boolean z10 = this.f43981a;
                if (z10) {
                    return 1;
                }
                return z10 ? 1 : 0;
            }

            public String toString() {
                return "PreChatFormQuestionComplete(isSuccess=" + this.f43981a + ')';
            }
        }

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b$j */
        public static abstract class j extends AbstractC3882b {

            /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b$j$a */
            public static final class a extends j {

                /* renamed from: a, reason: collision with root package name */
                public final EnumC3880a f43982a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(EnumC3880a source) {
                    super(null);
                    Intrinsics.checkNotNullParameter(source, "source");
                    this.f43982a = source;
                }

                public final EnumC3880a a() {
                    return this.f43982a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.f43982a == ((a) obj).f43982a;
                }

                public int hashCode() {
                    return this.f43982a.hashCode();
                }

                public String toString() {
                    return "Complete(source=" + this.f43982a + ')';
                }
            }

            /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b$j$b, reason: collision with other inner class name */
            public static final class C0631b extends j {

                /* renamed from: a, reason: collision with root package name */
                public final String f43983a;

                /* renamed from: b, reason: collision with root package name */
                public final int f43984b;

                /* renamed from: c, reason: collision with root package name */
                public final String f43985c;

                /* renamed from: d, reason: collision with root package name */
                public final EnumC3880a f43986d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0631b(String str, int i10, String str2, EnumC3880a source) {
                    super(null);
                    Intrinsics.checkNotNullParameter(source, "source");
                    this.f43983a = str;
                    this.f43984b = i10;
                    this.f43985c = str2;
                    this.f43986d = source;
                }

                public final String a() {
                    return this.f43983a;
                }

                public final int b() {
                    return this.f43984b;
                }

                public final String c() {
                    return this.f43985c;
                }

                public final EnumC3880a d() {
                    return this.f43986d;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0631b)) {
                        return false;
                    }
                    C0631b c0631b = (C0631b) obj;
                    return Intrinsics.areEqual(this.f43983a, c0631b.f43983a) && this.f43984b == c0631b.f43984b && Intrinsics.areEqual(this.f43985c, c0631b.f43985c) && this.f43986d == c0631b.f43986d;
                }

                public int hashCode() {
                    String str = this.f43983a;
                    int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.f43984b)) * 31;
                    String str2 = this.f43985c;
                    return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f43986d.hashCode();
                }

                public String toString() {
                    return "Error(chatId=" + this.f43983a + ", errorCode=" + this.f43984b + ", errorMessage=" + this.f43985c + ", source=" + this.f43986d + ')';
                }
            }

            /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b$j$c */
            public static final class c extends j {

                /* renamed from: a, reason: collision with root package name */
                public final EnumC3880a f43987a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(EnumC3880a source) {
                    super(null);
                    Intrinsics.checkNotNullParameter(source, "source");
                    this.f43987a = source;
                }

                public final EnumC3880a a() {
                    return this.f43987a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && this.f43987a == ((c) obj).f43987a;
                }

                public int hashCode() {
                    return this.f43987a.hashCode();
                }

                public String toString() {
                    return "Success(source=" + this.f43987a + ')';
                }
            }

            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public j() {
                super(null);
            }
        }

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b$k */
        public static final class k extends AbstractC3882b {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f43988a;

            public k(boolean z10) {
                super(null);
                this.f43988a = z10;
            }

            public final boolean a() {
                return this.f43988a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && this.f43988a == ((k) obj).f43988a;
            }

            public int hashCode() {
                boolean z10 = this.f43988a;
                if (z10) {
                    return 1;
                }
                return z10 ? 1 : 0;
            }

            public String toString() {
                return "RetrySendingFileSizeLimitExceeded(exceeded=" + this.f43988a + ')';
            }
        }

        public /* synthetic */ AbstractC3882b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC3882b() {
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$b0, reason: case insensitive filesystem */
    public static final class C3883b0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43989n;

        public C3883b0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3883b0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3883b0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43989n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                String chatId = ChatViewModel.this.getChatId();
                if (chatId != null) {
                    ChatViewModel chatViewModel = ChatViewModel.this;
                    this.f43989n = 1;
                    if (chatViewModel.loadDraftIntoConversation(chatId, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$c, reason: case insensitive filesystem */
    public static final class C3884c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f43991n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43992o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43993p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43994q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f43995r;

        /* renamed from: t, reason: collision with root package name */
        public int f43997t;

        public C3884c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43995r = obj;
            this.f43997t |= Integer.MIN_VALUE;
            return ChatViewModel.this.addFormMessage(null, null, false, null, this);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$c0, reason: case insensitive filesystem */
    public static final class C3885c0 extends Lambda implements Function0 {
        public C3885c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.j invoke() {
            return new Re.j(ChatViewModel.this.getConversationsRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$d, reason: case insensitive filesystem */
    public static final class C3886d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C3886d f43999d = new C3886d();

        public C3886d() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m121invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m121invoke();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$d0, reason: case insensitive filesystem */
    public static final class C3887d0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44000n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f44001o;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f44003q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f44004r;

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$d0$a */
        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ph.P f44005a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatViewModel f44006b;

            /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$d0$a$a, reason: collision with other inner class name */
            public static final class C0632a extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f44007n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ List f44008o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ ChatViewModel f44009p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0632a(List list, ChatViewModel chatViewModel, Continuation continuation) {
                    super(2, continuation);
                    this.f44008o = list;
                    this.f44009p = chatViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0632a(this.f44008o, this.f44009p, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Ph.P p10, Continuation continuation) {
                    return ((C0632a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object obj2;
                    Object next;
                    String uniqueID;
                    Message message;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f44007n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    List list = this.f44008o;
                    ChatViewModel chatViewModel = this.f44009p;
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            break;
                        }
                        next = it.next();
                        Message message2 = (Message) next;
                        if (Intrinsics.areEqual(message2.getUniqueID(), chatViewModel.getReplyMessageUId().getValue())) {
                            break;
                        }
                        uniqueID = message2.getUniqueID();
                        message = (Message) chatViewModel.getCurrentEditMessage().getValue();
                    } while (!Intrinsics.areEqual(uniqueID, message != null ? message.getUniqueID() : null));
                    obj2 = next;
                    Message message3 = (Message) obj2;
                    if (message3 != null ? Intrinsics.areEqual(message3.isDeleted(), Boxing.boxBoolean(true)) : false) {
                        this.f44009p.resetMessageActionState();
                    }
                    return Unit.INSTANCE;
                }
            }

            public a(Ph.P p10, ChatViewModel chatViewModel) {
                this.f44005a = p10;
                this.f44006b = chatViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, Continuation continuation) {
                AbstractC1459k.d(this.f44005a, null, null, new C0632a(list, this.f44006b, null), 3, null);
                this.f44006b.messagesMutableStateFlow.setValue(list);
                if (this.f44006b.getIsInitialTranscriptCallCompleted() && !this.f44006b.getIsMessagesReceivedAfterFirstApi()) {
                    this.f44006b.setMessagesReceivedAfterFirstApi(true);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3887d0(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f44003q = str;
            this.f44004r = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C3887d0 c3887d0 = ChatViewModel.this.new C3887d0(this.f44003q, this.f44004r, continuation);
            c3887d0.f44001o = obj;
            return c3887d0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3887d0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44000n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Ph.P p10 = (Ph.P) this.f44001o;
                C5582a b10 = ChatViewModel.this.getGetMessagesUseCase().b(this.f44003q, this.f44004r);
                ChatViewModel chatViewModel = ChatViewModel.this;
                if (b10.d()) {
                    InterfaceC5321f interfaceC5321f = (InterfaceC5321f) b10.b();
                    a aVar = new a(p10, chatViewModel);
                    this.f44001o = b10;
                    this.f44000n = 1;
                    if (interfaceC5321f.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$e, reason: case insensitive filesystem */
    public static final class C3888e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C3888e f44010d = new C3888e();

        public C3888e() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m122invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m122invoke();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$e0, reason: case insensitive filesystem */
    public static final class C3889e0 extends Lambda implements Function0 {
        public C3889e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ge.e invoke() {
            return new Ge.e(ChatViewModel.this.getCommonRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$f, reason: case insensitive filesystem */
    public static final class C3890f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44012n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f44014p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Form.Message f44015q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f44016r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Function0 f44017s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3890f(SalesIQChat salesIQChat, Form.Message message, boolean z10, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f44014p = salesIQChat;
            this.f44015q = message;
            this.f44016r = z10;
            this.f44017s = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3890f(this.f44014p, this.f44015q, this.f44016r, this.f44017s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3890f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44012n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ChatViewModel chatViewModel = ChatViewModel.this;
                SalesIQChat salesIQChat = this.f44014p;
                Form.Message message = this.f44015q;
                boolean z10 = this.f44016r;
                Function0 function0 = this.f44017s;
                this.f44012n = 1;
                if (chatViewModel.addFormMessage(salesIQChat, message, z10, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$f0, reason: case insensitive filesystem */
    public static final class C3891f0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44018n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ ie.b f44020p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3891f0(ie.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f44020p = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3891f0(this.f44020p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3891f0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44018n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Ge.e logDebugInfo = ChatViewModel.this.getLogDebugInfo();
                ie.b bVar = this.f44020p;
                this.f44018n = 1;
                if (logDebugInfo.a(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$g, reason: case insensitive filesystem */
    public static final class C3892g extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44021n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f44023p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3892g(SalesIQChat salesIQChat, Continuation continuation) {
            super(2, continuation);
            this.f44023p = salesIQChat;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3892g(this.f44023p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3892g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f44021n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ChatViewModel.this.addInlineFormMessage(this.f44023p);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$g0, reason: case insensitive filesystem */
    public static final class C3893g0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44024n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f44026p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3893g0(String str, Continuation continuation) {
            super(2, continuation);
            this.f44026p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3893g0(this.f44026p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3893g0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AbstractC6235a abstractC6235a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44024n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Re.k mailTranscriptUseCase = ChatViewModel.this.getMailTranscriptUseCase();
                String str = this.f44026p;
                this.f44024n = 1;
                obj = mailTranscriptUseCase.a(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C5582a c5582a = (C5582a) obj;
            if (c5582a.d()) {
                MobilistenUtil.z(t.f60840C0, 0, 2, null);
            }
            AbstractC6235a.c cVar = AbstractC6235a.c.Conversations;
            if (!c5582a.d()) {
                C5582a.b c10 = c5582a.c();
                if (c10 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c10, cVar)) == null) {
                    abstractC6235a = AbstractC6235a.b.f64114d;
                }
                Intrinsics.checkNotNull(c5582a.c(), "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                if (Intrinsics.areEqual(abstractC6235a, AbstractC6235a.d.f64115d)) {
                    MobilistenUtil.z(t.f60840C0, 0, 2, null);
                } else {
                    MobilistenUtil.z(t.f60834B0, 0, 2, null);
                }
            }
            ChatViewModel.this._uiEvents.a(new AbstractC3882b.g(c5582a.d(), c5582a.c()));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$h, reason: case insensitive filesystem */
    public static final class C3894h extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44027n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Message f44029p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f44030q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f44031r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f44032s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3894h(Message message, String str, boolean z10, String str2, Continuation continuation) {
            super(2, continuation);
            this.f44029p = message;
            this.f44030q = str;
            this.f44031r = z10;
            this.f44032s = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3894h(this.f44029p, this.f44030q, this.f44031r, this.f44032s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3894h) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            ?? r12;
            Object a10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44027n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                yf.x syncMessage = ChatViewModel.this.getSyncMessage();
                Message message = this.f44029p;
                String str = this.f44030q;
                ChatViewModel chatViewModel = ChatViewModel.this;
                boolean z10 = this.f44031r;
                if (i.e(str)) {
                    obj2 = coroutine_suspended;
                    message = Message.copy$default(message, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, chatViewModel.getMessage(str), null, null, null, null, false, false, false, false, false, null, Integer.MAX_VALUE, 1023, null);
                    chatViewModel.setDismissEditReplyLayoutInNextUpdate(z10);
                    r12 = 1;
                } else {
                    obj2 = coroutine_suspended;
                    r12 = 1;
                }
                this.f44027n = r12;
                a10 = syncMessage.a(message, r12, this);
                Object obj3 = obj2;
                if (a10 == obj3) {
                    return obj3;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a10 = obj;
            }
            C5582a c5582a = (C5582a) a10;
            ChatViewModel chatViewModel2 = ChatViewModel.this;
            Message message2 = this.f44029p;
            if (c5582a.d()) {
                ChatViewModel.sendRefreshBroadCast$default(chatViewModel2, message2.getChatId(), null, false, 6, null);
            }
            ChatViewModel.this._uiEvents.a(new AbstractC3882b.a(this.f44032s));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$h0, reason: case insensitive filesystem */
    public static final class C3895h0 extends Lambda implements Function0 {
        public C3895h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.k invoke() {
            return new Re.k(ChatViewModel.this.getConversationsRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$i, reason: case insensitive filesystem */
    public static final class C3896i extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44034n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Message f44036p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f44037q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3896i(Message message, boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f44036p = message;
            this.f44037q = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3896i(this.f44036p, this.f44037q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3896i) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44034n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            yf.x syncMessage = ChatViewModel.this.getSyncMessage();
            Message message = this.f44036p;
            ChatViewModel chatViewModel = ChatViewModel.this;
            if (i.e(chatViewModel.getReplyMessageUId().getValue())) {
                message = Message.copy$default(message, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, chatViewModel.getMessage((String) chatViewModel.getReplyMessageUId().getValue()), null, null, null, null, false, false, false, false, false, null, Integer.MAX_VALUE, 1023, null);
            }
            boolean z10 = this.f44037q;
            this.f44034n = 1;
            Object a10 = syncMessage.a(message, z10, this);
            return a10 == coroutine_suspended ? coroutine_suspended : a10;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$i0, reason: case insensitive filesystem */
    public static final class C3897i0 extends Lambda implements Function0 {
        public C3897i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.m invoke() {
            return new yf.m(ChatViewModel.this.getMessagesRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$j, reason: case insensitive filesystem */
    public static final class C3898j extends Lambda implements Function0 {
        public C3898j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6884a invoke() {
            return new C6884a(ChatViewModel.this.getMessagesRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$j0, reason: case insensitive filesystem */
    public static final class C3899j0 extends Lambda implements Function0 {
        public C3899j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.L invoke() {
            return AbstractC5323h.b(ChatViewModel.this.messageDataTransferProgressMutableStateFlow);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$k, reason: case insensitive filesystem */
    public static final class C3900k extends Lambda implements Function0 {
        public C3900k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6885b invoke() {
            return new C6885b(ChatViewModel.this.getMessagesRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$k0, reason: case insensitive filesystem */
    public static final class C3901k0 extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C3901k0 f44042d = new C3901k0();

        public C3901k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6550a invoke() {
            C6550a.C0924a c0924a = C6550a.f66357j;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return c0924a.a(e10);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$l, reason: case insensitive filesystem */
    public static final class C3902l extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C3902l f44043d = new C3902l();

        public C3902l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Kd.a invoke() {
            a.C0136a c0136a = Kd.a.f6469f;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return c0136a.a(e10);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$l0, reason: case insensitive filesystem */
    public static final class C3903l0 extends Lambda implements Function0 {
        public C3903l0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.L invoke() {
            return AbstractC5323h.b(ChatViewModel.this.messagesMutableStateFlow);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$m, reason: case insensitive filesystem */
    public static final class C3904m extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C3904m f44045d = new C3904m();

        public C3904m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Rd.a invoke() {
            return Rd.a.f10182d.a();
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$m0, reason: case insensitive filesystem */
    public static final class C3905m0 extends Lambda implements Function0 {
        public C3905m0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.L invoke() {
            return AbstractC5323h.b(ChatViewModel.this.messagesSyncDataMutableStateFlow);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$n, reason: case insensitive filesystem */
    public static final class C3906n extends Lambda implements Function0 {
        public C3906n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6886c invoke() {
            return new C6886c(ChatViewModel.this.getMessagesRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$n0, reason: case insensitive filesystem */
    public static final class C3907n0 extends Lambda implements Function0 {
        public C3907n0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.o invoke() {
            return new yf.o(ChatViewModel.this.getMessagesRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$o, reason: case insensitive filesystem */
    public static final class C3908o extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44049n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f44051p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f44052q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3908o(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f44051p = str;
            this.f44052q = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3908o(this.f44051p, this.f44052q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3908o) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44049n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C6886c cancelMessageTransfer = ChatViewModel.this.getCancelMessageTransfer();
                String str = this.f44051p;
                String str2 = this.f44052q;
                this.f44049n = 1;
                if (cancelMessageTransfer.a(str, str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$o0, reason: case insensitive filesystem */
    public static final class C3909o0 extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f44053n;

        /* renamed from: o, reason: collision with root package name */
        public Object f44054o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f44055p;

        /* renamed from: r, reason: collision with root package name */
        public int f44057r;

        public C3909o0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44055p = obj;
            this.f44057r |= Integer.MIN_VALUE;
            return ChatViewModel.this.readMessage(null, null, this);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$p, reason: case insensitive filesystem */
    public static final class C3910p extends Lambda implements Function0 {
        public C3910p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.a invoke() {
            return new Od.a(ChatViewModel.this.getBrandRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$p0, reason: case insensitive filesystem */
    public static final class C3911p0 extends Lambda implements Function0 {
        public C3911p0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p invoke() {
            return new p(ChatViewModel.this.getMessagesRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$q, reason: case insensitive filesystem */
    public static final class C3912q extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f44060n;

        /* renamed from: o, reason: collision with root package name */
        public int f44061o;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f44063q;

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$q$a */
        public static final class a extends Lambda implements Function2 {

            /* renamed from: d, reason: collision with root package name */
            public static final a f44064d = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(List old, List list) {
                boolean z10;
                Intrinsics.checkNotNullParameter(old, "old");
                Intrinsics.checkNotNullParameter(list, "new");
                if (old.size() == list.size()) {
                    List<MessageProgress> list2 = old;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        loop0: for (MessageProgress messageProgress : list2) {
                            List<MessageProgress> list3 = list;
                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                for (MessageProgress messageProgress2 : list3) {
                                    if (!Intrinsics.areEqual(messageProgress.getMessageId(), messageProgress2.getMessageId()) || messageProgress.getProgress() != messageProgress2.getProgress()) {
                                    }
                                }
                            }
                        }
                    }
                    z10 = true;
                    return Boolean.valueOf(z10);
                }
                z10 = false;
                return Boolean.valueOf(z10);
            }
        }

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$q$b */
        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f44065n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f44066o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ ChatViewModel f44067p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ChatViewModel chatViewModel, Continuation continuation) {
                super(2, continuation);
                this.f44067p = chatViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                b bVar = new b(this.f44067p, continuation);
                bVar.f44066o = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List list, Continuation continuation) {
                return ((b) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f44065n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f44067p.messageDataTransferProgressMutableStateFlow.setValue((List) this.f44066o);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3912q(String str, Continuation continuation) {
            super(2, continuation);
            this.f44063q = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3912q(this.f44063q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3912q) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44061o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C5582a a10 = ChatViewModel.this.getGetMessageDataTransferProgressUseCase().a(this.f44063q);
                ChatViewModel chatViewModel = ChatViewModel.this;
                if (a10.d()) {
                    InterfaceC5321f l10 = AbstractC5323h.l((InterfaceC5321f) a10.b(), a.f44064d);
                    b bVar = new b(chatViewModel, null);
                    this.f44060n = a10;
                    this.f44061o = 1;
                    if (AbstractC5323h.h(l10, bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$q0, reason: case insensitive filesystem */
    public static final class C3913q0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44068n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f44069o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f44070p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ ChatViewModel f44071q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3913q0(String str, String str2, ChatViewModel chatViewModel, Continuation continuation) {
            super(2, continuation);
            this.f44069o = str;
            this.f44070p = str2;
            this.f44071q = chatViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C3913q0(this.f44069o, this.f44070p, this.f44071q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3913q0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44068n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SalesIQChat chatFromConvID = LiveChatUtil.getChatFromConvID(this.f44069o);
                if (chatFromConvID == null) {
                    chatFromConvID = LiveChatUtil.getChat(this.f44070p);
                }
                if ((chatFromConvID != null ? chatFromConvID.getVisitorid() : null) == null) {
                    p refreshMessages = this.f44071q.getRefreshMessages();
                    String str = this.f44069o;
                    String str2 = this.f44070p;
                    this.f44068n = 1;
                    if (refreshMessages.a(str, str2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$r, reason: case insensitive filesystem */
    public static final class C3914r extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C3914r f44072d = new C3914r();

        public C3914r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4377a invoke() {
            C4377a.C0689a c0689a = C4377a.f47235d;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return c0689a.a(e10);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$r0, reason: case insensitive filesystem */
    public static final class C3915r0 implements InterfaceC6064a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EnumC3880a f44074b;

        public C3915r0(EnumC3880a enumC3880a) {
            this.f44074b = enumC3880a;
        }

        @Override // pd.InterfaceC6064a
        public void a(String str, int i10, String str2) {
            ChatViewModel.this._uiEvents.a(new AbstractC3882b.j.C0631b(str, i10, str2, this.f44074b));
        }

        @Override // pd.InterfaceC6064a
        public void onComplete() {
            ChatViewModel.this._uiEvents.a(new AbstractC3882b.j.a(this.f44074b));
        }

        @Override // pd.InterfaceC6064a
        public void onSuccess() {
            ChatViewModel.this._uiEvents.a(new AbstractC3882b.j.c(this.f44074b));
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$s, reason: case insensitive filesystem */
    public static final class C3916s extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C3916s f44075d = new C3916s();

        public C3916s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ke.a invoke() {
            a.C0137a c0137a = Ke.a.f6496j;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return c0137a.a(e10);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$s0, reason: case insensitive filesystem */
    public static final class C3917s0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f44076n;

        /* renamed from: o, reason: collision with root package name */
        public Object f44077o;

        /* renamed from: p, reason: collision with root package name */
        public Object f44078p;

        /* renamed from: q, reason: collision with root package name */
        public Object f44079q;

        /* renamed from: r, reason: collision with root package name */
        public Object f44080r;

        /* renamed from: s, reason: collision with root package name */
        public int f44081s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Message f44083u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3917s0(Message message, Continuation continuation) {
            super(2, continuation);
            this.f44083u = message;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3917s0(this.f44083u, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3917s0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x02a0, code lost:
        
            if (r2.loadDraftIntoConversation(r15, r14) != r0) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0251, code lost:
        
            if (r15.b(r2, r1, r5, r14) != r0) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x00c1, code lost:
        
            if (r15 == r0) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0234  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x021b  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0174  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ChatViewModel chatViewModel;
            AbstractC6235a abstractC6235a;
            C3917s0 c3917s0;
            C5582a c5582a;
            ChatViewModel chatViewModel2;
            SalesIQChat salesIQChat;
            EnumC4544a a10;
            ChatViewModel chatViewModel3;
            Message message;
            C5582a c5582a2;
            SalesIQChat salesIQChat2;
            SalesIQChat chatWithAnyId;
            Channel.Department e10;
            EnumC4544a appStatus;
            C5582a c5582a3;
            Channel.Department department;
            ChatViewModel chatViewModel4;
            h syncFormUseCase;
            SalesIQChat salesIQChat3;
            Message message2;
            ChatViewModel chatViewModel5;
            C5582a c5582a4;
            Message message3;
            C5582a c5582a5;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f44081s) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    r resendContextMessageUseCase = ChatViewModel.this.getResendContextMessageUseCase();
                    String chatId = this.f44083u.getChatId();
                    String id2 = this.f44083u.getId();
                    this.f44081s = 1;
                    obj = resendContextMessageUseCase.a(chatId, id2, this);
                    break;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    C5582a c5582a6 = (C5582a) obj;
                    ChatViewModel chatViewModel6 = ChatViewModel.this;
                    Message message4 = this.f44083u;
                    if (c5582a6.d()) {
                        ChatViewModel.sendRefreshBroadCast$default(chatViewModel6, message4.getChatId(), null, false, 6, null);
                    }
                    AbstractC6235a.c cVar = AbstractC6235a.c.Messages;
                    chatViewModel = ChatViewModel.this;
                    Message message5 = this.f44083u;
                    if (!c5582a6.d()) {
                        C5582a.b c10 = c5582a6.c();
                        if (c10 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c10, cVar)) == null) {
                            abstractC6235a = AbstractC6235a.b.f64114d;
                        }
                        Intrinsics.checkNotNull(c5582a6.c(), "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                        if (Intrinsics.areEqual(abstractC6235a, C6223E.f64097d)) {
                            chatViewModel._uiEvents.a(AbstractC3882b.e.f43976a);
                        } else if (Intrinsics.areEqual(abstractC6235a, C6224F.f64098d)) {
                            chatWithAnyId = LiveChatUtil.getChatWithAnyId(message5.getChatId());
                            e10 = AbstractC3945n.e(chatWithAnyId != null ? chatWithAnyId.getDeptid() : null);
                            if (chatWithAnyId != null && e10 != null) {
                                appStatus = chatViewModel.getAppStatus(e10);
                                chatViewModel.getClearFormUseCase().b(appStatus);
                                h syncFormUseCase2 = chatViewModel.getSyncFormUseCase();
                                this.f44076n = c5582a6;
                                this.f44077o = chatViewModel;
                                this.f44078p = chatWithAnyId;
                                this.f44079q = e10;
                                this.f44080r = appStatus;
                                this.f44081s = 2;
                                if (syncFormUseCase2.a(true, null, appStatus, this) != coroutine_suspended) {
                                    c5582a3 = c5582a6;
                                    this.f44076n = c5582a3;
                                    this.f44077o = chatViewModel;
                                    this.f44078p = e10;
                                    this.f44079q = null;
                                    this.f44080r = null;
                                    this.f44081s = 3;
                                    if (chatViewModel.handleFormAndDepartmentStatusDiffersFallback(chatWithAnyId, appStatus, this) != coroutine_suspended) {
                                        department = e10;
                                        chatViewModel4 = chatViewModel;
                                        if (Intrinsics.areEqual(department.isOnline(), Boxing.boxBoolean(true))) {
                                            chatViewModel4._uiEvents.a(AbstractC3882b.d.f43975a);
                                        } else {
                                            MobilistenUtil.z(t.f60850D4, 0, 2, null);
                                        }
                                    }
                                }
                                return coroutine_suspended;
                            }
                        } else {
                            C6233O c6233o = C6233O.f64107d;
                            if (Intrinsics.areEqual(abstractC6235a, c6233o)) {
                                SalesIQChat chatWithAnyId2 = LiveChatUtil.getChatWithAnyId(message5.getChatId());
                                Channel.Department e11 = AbstractC3945n.e(chatWithAnyId2 != null ? chatWithAnyId2.getDeptid() : null);
                                if (chatWithAnyId2 != null && (e11 != null || Intrinsics.areEqual(abstractC6235a, c6233o))) {
                                    if (e11 == null || (a10 = chatViewModel.getAppStatus(e11)) == null) {
                                        a10 = EnumC4544a.Companion.a(d.m(De.a.OngoingConversationContextAppStatus, null, 2, null));
                                    }
                                    if (a10 != null) {
                                        yf.D updateMessageStatus = chatViewModel.getUpdateMessageStatus();
                                        String chatId2 = message5.getChatId();
                                        String id3 = message5.getId();
                                        Message.f fVar = Message.f.Sending;
                                        this.f44076n = c5582a6;
                                        this.f44077o = chatViewModel;
                                        this.f44078p = message5;
                                        this.f44079q = chatWithAnyId2;
                                        this.f44080r = a10;
                                        this.f44081s = 4;
                                        if (updateMessageStatus.b(chatId2, id3, fVar, this) != coroutine_suspended) {
                                            chatViewModel3 = chatViewModel;
                                            message = message5;
                                            c5582a2 = c5582a6;
                                            salesIQChat2 = chatWithAnyId2;
                                            chatViewModel3.getClearFormUseCase().b(a10);
                                            syncFormUseCase = chatViewModel3.getSyncFormUseCase();
                                            this.f44076n = c5582a2;
                                            this.f44077o = chatViewModel3;
                                            this.f44078p = message;
                                            this.f44079q = salesIQChat2;
                                            this.f44080r = a10;
                                            this.f44081s = 5;
                                            if (syncFormUseCase.a(true, null, a10, this) != coroutine_suspended) {
                                                salesIQChat3 = salesIQChat2;
                                                message2 = message;
                                                chatViewModel5 = chatViewModel3;
                                                c5582a4 = c5582a2;
                                                this.f44076n = c5582a4;
                                                this.f44077o = chatViewModel5;
                                                this.f44078p = message2;
                                                this.f44079q = null;
                                                this.f44080r = null;
                                                this.f44081s = 6;
                                                if (chatViewModel5.handleFormAndDepartmentStatusDiffersFallback(salesIQChat3, a10, this) != coroutine_suspended) {
                                                    message3 = message2;
                                                    c5582a5 = c5582a4;
                                                    yf.D updateMessageStatus2 = chatViewModel5.getUpdateMessageStatus();
                                                    String chatId3 = message3.getChatId();
                                                    String id4 = message3.getId();
                                                    Message.f fVar2 = Message.f.Sent;
                                                    this.f44076n = c5582a5;
                                                    this.f44077o = null;
                                                    this.f44078p = null;
                                                    this.f44081s = 7;
                                                    break;
                                                }
                                            }
                                        }
                                        return coroutine_suspended;
                                    }
                                }
                            } else if (Intrinsics.areEqual(abstractC6235a, C6225G.f64099d)) {
                                SalesIQChat chatWithAnyId3 = LiveChatUtil.getChatWithAnyId(message5.getChatId());
                                Form.Message currentFormMessage = chatViewModel.getCurrentFormMessage();
                                if (chatWithAnyId3 == null || currentFormMessage == null) {
                                    LiveChatUtil.log("Chat or form message is null");
                                    LiveChatUtil.triggerChatListener("CHAT_ERROR", chatWithAnyId3, new b.a("Chat or form message is null"));
                                    return Unit.INSTANCE;
                                }
                                C6884a addMessageUseCase = chatViewModel.getAddMessageUseCase();
                                this.f44076n = c5582a6;
                                this.f44077o = chatViewModel;
                                this.f44078p = chatWithAnyId3;
                                this.f44081s = 8;
                                c3917s0 = this;
                                if (C6884a.b(addMessageUseCase, chatWithAnyId3, currentFormMessage, false, c3917s0, 4, null) != coroutine_suspended) {
                                    c5582a = c5582a6;
                                    chatViewModel2 = chatViewModel;
                                    salesIQChat = chatWithAnyId3;
                                    String chid = salesIQChat.getChid();
                                    Intrinsics.checkNotNullExpressionValue(chid, "getChid(...)");
                                    c3917s0.f44076n = c5582a;
                                    c3917s0.f44077o = null;
                                    c3917s0.f44078p = null;
                                    c3917s0.f44081s = 9;
                                    break;
                                }
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 2:
                    EnumC4544a enumC4544a = (EnumC4544a) this.f44080r;
                    Channel.Department department2 = (Channel.Department) this.f44079q;
                    chatWithAnyId = (SalesIQChat) this.f44078p;
                    ChatViewModel chatViewModel7 = (ChatViewModel) this.f44077o;
                    c5582a3 = (C5582a) this.f44076n;
                    ResultKt.throwOnFailure(obj);
                    appStatus = enumC4544a;
                    e10 = department2;
                    chatViewModel = chatViewModel7;
                    this.f44076n = c5582a3;
                    this.f44077o = chatViewModel;
                    this.f44078p = e10;
                    this.f44079q = null;
                    this.f44080r = null;
                    this.f44081s = 3;
                    if (chatViewModel.handleFormAndDepartmentStatusDiffersFallback(chatWithAnyId, appStatus, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    department = (Channel.Department) this.f44078p;
                    chatViewModel4 = (ChatViewModel) this.f44077o;
                    ResultKt.throwOnFailure(obj);
                    if (Intrinsics.areEqual(department.isOnline(), Boxing.boxBoolean(true))) {
                    }
                    return Unit.INSTANCE;
                case 4:
                    a10 = (EnumC4544a) this.f44080r;
                    salesIQChat2 = (SalesIQChat) this.f44079q;
                    message = (Message) this.f44078p;
                    chatViewModel3 = (ChatViewModel) this.f44077o;
                    c5582a2 = (C5582a) this.f44076n;
                    ResultKt.throwOnFailure(obj);
                    chatViewModel3.getClearFormUseCase().b(a10);
                    syncFormUseCase = chatViewModel3.getSyncFormUseCase();
                    this.f44076n = c5582a2;
                    this.f44077o = chatViewModel3;
                    this.f44078p = message;
                    this.f44079q = salesIQChat2;
                    this.f44080r = a10;
                    this.f44081s = 5;
                    if (syncFormUseCase.a(true, null, a10, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 5:
                    a10 = (EnumC4544a) this.f44080r;
                    SalesIQChat salesIQChat4 = (SalesIQChat) this.f44079q;
                    message2 = (Message) this.f44078p;
                    ChatViewModel chatViewModel8 = (ChatViewModel) this.f44077o;
                    c5582a4 = (C5582a) this.f44076n;
                    ResultKt.throwOnFailure(obj);
                    salesIQChat3 = salesIQChat4;
                    chatViewModel5 = chatViewModel8;
                    this.f44076n = c5582a4;
                    this.f44077o = chatViewModel5;
                    this.f44078p = message2;
                    this.f44079q = null;
                    this.f44080r = null;
                    this.f44081s = 6;
                    if (chatViewModel5.handleFormAndDepartmentStatusDiffersFallback(salesIQChat3, a10, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 6:
                    message3 = (Message) this.f44078p;
                    chatViewModel5 = (ChatViewModel) this.f44077o;
                    c5582a5 = (C5582a) this.f44076n;
                    ResultKt.throwOnFailure(obj);
                    yf.D updateMessageStatus22 = chatViewModel5.getUpdateMessageStatus();
                    String chatId32 = message3.getChatId();
                    String id42 = message3.getId();
                    Message.f fVar22 = Message.f.Sent;
                    this.f44076n = c5582a5;
                    this.f44077o = null;
                    this.f44078p = null;
                    this.f44081s = 7;
                    break;
                case 7:
                case 9:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 8:
                    salesIQChat = (SalesIQChat) this.f44078p;
                    chatViewModel2 = (ChatViewModel) this.f44077o;
                    c5582a = (C5582a) this.f44076n;
                    ResultKt.throwOnFailure(obj);
                    c3917s0 = this;
                    String chid2 = salesIQChat.getChid();
                    Intrinsics.checkNotNullExpressionValue(chid2, "getChid(...)");
                    c3917s0.f44076n = c5582a;
                    c3917s0.f44077o = null;
                    c3917s0.f44078p = null;
                    c3917s0.f44081s = 9;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$t, reason: case insensitive filesystem */
    public static final class C3918t extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44084n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f44086p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3918t(String str, Continuation continuation) {
            super(2, continuation);
            this.f44086p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3918t(this.f44086p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3918t) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44084n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C6887d deleteFeedbackCardsIfExpiredUseCase = ChatViewModel.this.getDeleteFeedbackCardsIfExpiredUseCase();
                String str = this.f44086p;
                this.f44084n = 1;
                if (deleteFeedbackCardsIfExpiredUseCase.a(str, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$t0, reason: case insensitive filesystem */
    public static final class C3919t0 extends Lambda implements Function0 {
        public C3919t0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final r invoke() {
            return new r(ChatViewModel.this.getMessagesRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$u, reason: case insensitive filesystem */
    public static final class C3920u extends Lambda implements Function0 {
        public C3920u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6887d invoke() {
            return new C6887d(ChatViewModel.this.getMessagesRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$u0, reason: case insensitive filesystem */
    public static final class C3921u0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44089n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Message f44091p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3921u0(Message message, Continuation continuation) {
            super(2, continuation);
            this.f44091p = message;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3921u0(this.f44091p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3921u0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AbstractC6235a abstractC6235a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44089n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                yf.t retrySendingMessageUseCase = ChatViewModel.this.getRetrySendingMessageUseCase();
                String chatId = this.f44091p.getChatId();
                String id2 = this.f44091p.getId();
                this.f44089n = 1;
                obj = retrySendingMessageUseCase.a(chatId, id2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C5582a c5582a = (C5582a) obj;
            ChatViewModel chatViewModel = ChatViewModel.this;
            if (c5582a.d()) {
                chatViewModel._uiEvents.a(new AbstractC3882b.k(((Boolean) c5582a.b()).booleanValue()));
            }
            AbstractC6235a.c cVar = AbstractC6235a.c.Messages;
            ChatViewModel chatViewModel2 = ChatViewModel.this;
            if (!c5582a.d()) {
                C5582a.b c10 = c5582a.c();
                if (c10 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c10, cVar)) == null) {
                    abstractC6235a = AbstractC6235a.b.f64114d;
                }
                C5582a.b c11 = c5582a.c();
                Intrinsics.checkNotNull(c11, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                chatViewModel2._uiEvents.a(new AbstractC3882b.k(false));
                if (!(c11.a() instanceof CancellationException) && !Intrinsics.areEqual(abstractC6235a, C6228J.f64102d)) {
                    if (abstractC6235a.a() == -1) {
                        abstractC6235a = C6229K.f64103d;
                    }
                    MobilistenUtil.z(abstractC6235a.b(), 0, 2, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$v, reason: case insensitive filesystem */
    public static final class C3922v extends Lambda implements Function0 {
        public C3922v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6888e invoke() {
            return new C6888e(ChatViewModel.this.getMessagesRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$v0, reason: case insensitive filesystem */
    public static final class C3923v0 extends Lambda implements Function0 {
        public C3923v0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.t invoke() {
            return new yf.t(ChatViewModel.this.getMessagesRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$w, reason: case insensitive filesystem */
    public static final class C3924w extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44094n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f44096p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f44097q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f44098r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3924w(String str, String str2, boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f44096p = str;
            this.f44097q = str2;
            this.f44098r = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3924w(this.f44096p, this.f44097q, this.f44098r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3924w) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44094n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C6888e deleteMessage = ChatViewModel.this.getDeleteMessage();
                String str = this.f44096p;
                String str2 = this.f44097q;
                boolean z10 = this.f44098r;
                this.f44094n = 1;
                if (deleteMessage.a(str, str2, z10, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$w0, reason: case insensitive filesystem */
    public static final class C3925w0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44099n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f44101p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3925w0(String str, Continuation continuation) {
            super(2, continuation);
            this.f44101p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3925w0(this.f44101p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3925w0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44099n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                String chatId = ChatViewModel.this.getChatId();
                if (chatId != null) {
                    ChatViewModel chatViewModel = ChatViewModel.this;
                    String str = this.f44101p;
                    Re.l saveDraftMessage = chatViewModel.getSaveDraftMessage();
                    this.f44099n = 1;
                    if (saveDraftMessage.a(chatId, str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$x, reason: case insensitive filesystem */
    public static final class C3926x extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44102n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f44104p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Message.g f44105q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3926x(String str, Message.g gVar, Continuation continuation) {
            super(2, continuation);
            this.f44104p = str;
            this.f44105q = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3926x(this.f44104p, this.f44105q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3926x) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44102n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C6888e deleteMessage = ChatViewModel.this.getDeleteMessage();
                String str = this.f44104p;
                Message.g gVar = this.f44105q;
                this.f44102n = 1;
                if (deleteMessage.c(str, gVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$x0, reason: case insensitive filesystem */
    public static final class C3927x0 extends Lambda implements Function0 {
        public C3927x0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.l invoke() {
            return new Re.l(ChatViewModel.this.getConversationsRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$y, reason: case insensitive filesystem */
    public static final class C3928y extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44107n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f44109p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f44110q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3928y(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f44109p = str;
            this.f44110q = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3928y(this.f44109p, this.f44110q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3928y) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5 != null ? r5.getUniqueID() : null, r1) != false) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44107n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C6888e deleteMessage = ChatViewModel.this.getDeleteMessage();
                String str = this.f44109p;
                String str2 = this.f44110q;
                this.f44107n = 1;
                obj = deleteMessage.b(str, str2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C5582a c5582a = (C5582a) obj;
            ChatViewModel chatViewModel = ChatViewModel.this;
            String str3 = this.f44110q;
            if (c5582a.d()) {
                if (!Intrinsics.areEqual(chatViewModel.getReplyMessageUId().getValue(), str3)) {
                    Message message = (Message) chatViewModel.getCurrentEditMessage().getValue();
                }
                chatViewModel.resetMessageActionState();
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$y0, reason: case insensitive filesystem */
    public static final class C3929y0 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44111n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f44113p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f44114q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f44115r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List f44116s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3929y0(String str, String str2, String str3, List list, Continuation continuation) {
            super(2, continuation);
            this.f44113p = str;
            this.f44114q = str2;
            this.f44115r = str3;
            this.f44116s = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatViewModel.this.new C3929y0(this.f44113p, this.f44114q, this.f44115r, this.f44116s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C3929y0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AbstractC6235a abstractC6235a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44111n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                u sendAllMessageAsSingleMessage = ChatViewModel.this.getSendAllMessageAsSingleMessage();
                String str = this.f44113p;
                String str2 = this.f44114q;
                String str3 = this.f44115r;
                List list = this.f44116s;
                this.f44111n = 1;
                obj = sendAllMessageAsSingleMessage.a(str, str2, str3, list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C5582a c5582a = (C5582a) obj;
            AbstractC6235a.c cVar = AbstractC6235a.c.Messages;
            if (!c5582a.d()) {
                C5582a.b c10 = c5582a.c();
                if (c10 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c10, cVar)) == null) {
                    abstractC6235a = AbstractC6235a.b.f64114d;
                }
                C5582a.b c11 = c5582a.c();
                Intrinsics.checkNotNull(c11, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                if (!(c11.a() instanceof CancellationException) && !Intrinsics.areEqual(abstractC6235a, C6228J.f64102d)) {
                    if (abstractC6235a.a() == -1) {
                        abstractC6235a = C6229K.f64103d;
                    }
                    MobilistenUtil.z(abstractC6235a.b(), 0, 2, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$z, reason: case insensitive filesystem */
    public static final class C3930z extends Lambda implements Function0 {
        public C3930z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.b invoke() {
            return new Od.b(ChatViewModel.this.getBrandRepository());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ChatViewModel$z0, reason: case insensitive filesystem */
    public static final class C3931z0 extends Lambda implements Function0 {
        public C3931z0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u invoke() {
            return new u(ChatViewModel.this.getMessagesRepository());
        }
    }

    public ChatViewModel() {
        x b10 = kotlinx.coroutines.flow.E.b(0, 16, null, 5, null);
        this._uiEvents = b10;
        this.uiEvents = AbstractC5323h.a(b10);
        this.messagesMutableStateFlow = kotlinx.coroutines.flow.N.a(CollectionsKt.emptyList());
        this.messagesStateFlow = LazyKt.lazy(new C3903l0());
        this.messagesSyncDataMutableStateFlow = kotlinx.coroutines.flow.N.a(new MessageSyncData(true, false, 2, null));
        this.messagesSyncDataStateFlow = LazyKt.lazy(new C3905m0());
        this.messageDataTransferProgressMutableStateFlow = kotlinx.coroutines.flow.N.a(CollectionsKt.emptyList());
        this.messageDataTransferProgressStateFlow = LazyKt.lazy(new C3899j0());
        this.currentEditMessage = kotlinx.coroutines.flow.N.a(null);
        this.replyMessageUId = kotlinx.coroutines.flow.N.a(null);
        this.originalMessageContent = kotlinx.coroutines.flow.N.a(null);
        this.currentOnGoingReadMessageIds = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addFormMessage(SalesIQChat salesIQChat, Form.Message message, boolean z10, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        C3884c c3884c;
        int i10;
        ChatViewModel chatViewModel;
        C5582a c5582a;
        SalesIQChat salesIQChat2;
        Function0<Unit> function02;
        if (continuation instanceof C3884c) {
            c3884c = (C3884c) continuation;
            int i11 = c3884c.f43997t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3884c.f43997t = i11 - Integer.MIN_VALUE;
                Object obj = c3884c.f43995r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3884c.f43997t;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (((String) this.replyMessageUId.getValue()) != null && !z10) {
                        this.dismissEditReplyLayoutInNextUpdate = false;
                    }
                    if (i.g(this.currentEditMessage.getValue())) {
                        C6884a addMessageUseCase = getAddMessageUseCase();
                        c3884c.f43991n = this;
                        c3884c.f43992o = salesIQChat;
                        c3884c.f43993p = function0;
                        c3884c.f43997t = 1;
                        obj = addMessageUseCase.a(salesIQChat, message, true, c3884c);
                        if (obj != coroutine_suspended) {
                            chatViewModel = this;
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function02 = (Function0) c3884c.f43993p;
                    salesIQChat2 = (SalesIQChat) c3884c.f43992o;
                    chatViewModel = (ChatViewModel) c3884c.f43991n;
                    ResultKt.throwOnFailure(obj);
                    sendRefreshBroadCast$default(chatViewModel, salesIQChat2.getChid(), null, false, 6, null);
                    function0 = function02;
                    function0.invoke();
                    return Unit.INSTANCE;
                }
                function0 = (Function0) c3884c.f43993p;
                salesIQChat = (SalesIQChat) c3884c.f43992o;
                ChatViewModel chatViewModel2 = (ChatViewModel) c3884c.f43991n;
                ResultKt.throwOnFailure(obj);
                chatViewModel = chatViewModel2;
                c5582a = (C5582a) obj;
                if (c5582a.d()) {
                    String chid = salesIQChat.getChid();
                    Intrinsics.checkNotNullExpressionValue(chid, "getChid(...)");
                    c3884c.f43991n = chatViewModel;
                    c3884c.f43992o = salesIQChat;
                    c3884c.f43993p = function0;
                    c3884c.f43994q = c5582a;
                    c3884c.f43997t = 2;
                    if (chatViewModel.loadDraftIntoConversation(chid, c3884c) != coroutine_suspended) {
                        salesIQChat2 = salesIQChat;
                        function02 = function0;
                        sendRefreshBroadCast$default(chatViewModel, salesIQChat2.getChid(), null, false, 6, null);
                        function0 = function02;
                    }
                    return coroutine_suspended;
                }
                function0.invoke();
                return Unit.INSTANCE;
            }
        }
        c3884c = new C3884c(continuation);
        Object obj2 = c3884c.f43995r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3884c.f43997t;
        if (i10 != 0) {
        }
        c5582a = (C5582a) obj2;
        if (c5582a.d()) {
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object addFormMessage$default(ChatViewModel chatViewModel, SalesIQChat salesIQChat, Form.Message message, boolean z10, Function0 function0, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            function0 = C3886d.f43999d;
        }
        return chatViewModel.addFormMessage(salesIQChat, message, z11, function0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addFormMessageAsync$default(ChatViewModel chatViewModel, SalesIQChat salesIQChat, Form.Message message, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            function0 = C3888e.f44010d;
        }
        chatViewModel.addFormMessageAsync(salesIQChat, message, z10, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
    
        if (r8.subSequence(r11, r10 + 1).toString().length() == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f5, code lost:
    
        if (r4.subSequence(r10, r8 + 1).toString().length() == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013a, code lost:
    
        if (r4.subSequence(r10, r8 + 1).toString().length() == 0) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addInlineFormMessage(SalesIQChat chat) {
        String str;
        String str2;
        boolean z10;
        String title;
        long f10 = rd.b.f();
        long j10 = f10 + 1;
        Message.Companion companion = Message.INSTANCE;
        String convID = chat.getConvID();
        Intrinsics.checkNotNullExpressionValue(convID, "getConvID(...)");
        String visitorid = chat.getVisitorid();
        String chid = chat.getChid();
        Intrinsics.checkNotNullExpressionValue(chid, "getChid(...)");
        Message.g gVar = Message.g.Text;
        Message.f fVar = Message.f.Sent;
        Gson j11 = Yd.a.j();
        com.google.gson.k kVar = new com.google.gson.k();
        kVar.n("hide_input", Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        Message b10 = companion.b(convID, visitorid, chid, gVar, fVar, j10, "", null, j10, j10, null, null, (Message.Meta) AbstractC5895g.a(j11, kVar, Message.Meta.class), null);
        Form currentForm = getCurrentForm(chat.getDeptid());
        if (chat.isTriggeredChat()) {
            str = chat.getAttenderName();
            boolean isBotAttender = chat.isBotAttender();
            str2 = chat.getAttenderid();
            z10 = isBotAttender;
        } else {
            str = null;
            str2 = null;
            z10 = false;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z11 = false;
            while (i10 <= length) {
                boolean z12 = Intrinsics.compare((int) str2.charAt(!z11 ? i10 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i10++;
                } else {
                    z11 = true;
                }
            }
        }
        str2 = "form_sender";
        String str3 = str2;
        if (str != null) {
            int length2 = str.length() - 1;
            int i11 = 0;
            boolean z13 = false;
            while (i11 <= length2) {
                boolean z14 = Intrinsics.compare((int) str.charAt(!z13 ? i11 : length2), 32) <= 0;
                if (z13) {
                    if (!z14) {
                        break;
                    } else {
                        length2--;
                    }
                } else if (z14) {
                    i11++;
                } else {
                    z13 = true;
                }
            }
        }
        if (i.e(currentForm)) {
            str = currentForm.getDisplayName();
        }
        if (str != null) {
            int length3 = str.length() - 1;
            int i12 = 0;
            boolean z15 = false;
            while (i12 <= length3) {
                boolean z16 = Intrinsics.compare((int) str.charAt(!z15 ? i12 : length3), 32) <= 0;
                if (z15) {
                    if (!z16) {
                        break;
                    } else {
                        length3--;
                    }
                } else if (z16) {
                    i12++;
                } else {
                    z15 = true;
                }
            }
        }
        str = getApplication().getString(t.f61034h1);
        Integer valueOf = Integer.valueOf(t.f61027g1);
        String title2 = currentForm != null ? currentForm.getTitle() : null;
        Integer num = (title2 == null || title2.length() == 0) ? valueOf : null;
        if (num != null) {
            String string = getApplication().getString(num.intValue());
            if (string != null) {
                title = string;
                Message copy$default = Message.copy$default(b10, null, null, null, null, Message.f.Sent, null, null, num, title, null, 0L, 0L, str3, null, new Message.b(str, og.m.b(str)), null, null, null, null, null, z10, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -1069457, 1023, null);
                ArrayList arrayList = new ArrayList();
                arrayList.add(copy$default);
                long j12 = f10 + 2;
                arrayList.add(Message.copy$default(copy$default, null, null, null, Message.g.InlineForm, null, String.valueOf(j12), null, Integer.valueOf(t.f61020f1), getApplication().getString(t.f61020f1), null, j12, j12, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, j12, null, null, null, null, null, false, false, false, false, false, null, -1073745321, 1023, null));
                syncMessagesAsync(arrayList, 1L);
            }
        }
        title = currentForm != null ? currentForm.getTitle() : null;
        Message copy$default2 = Message.copy$default(b10, null, null, null, null, Message.f.Sent, null, null, num, title, null, 0L, 0L, str3, null, new Message.b(str, og.m.b(str)), null, null, null, null, null, z10, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -1069457, 1023, null);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(copy$default2);
        long j122 = f10 + 2;
        arrayList2.add(Message.copy$default(copy$default2, null, null, null, Message.g.InlineForm, null, String.valueOf(j122), null, Integer.valueOf(t.f61020f1), getApplication().getString(t.f61020f1), null, j122, j122, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, j122, null, null, null, null, null, false, false, false, false, false, null, -1073745321, 1023, null));
        syncMessagesAsync(arrayList2, 1L);
    }

    public static /* synthetic */ Object addMessage$default(ChatViewModel chatViewModel, Message message, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return chatViewModel.addMessage(message, z10, continuation);
    }

    public static /* synthetic */ void addMessageAsync$default(ChatViewModel chatViewModel, Message message, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        chatViewModel.addMessageAsync(message, z10, str);
    }

    public static /* synthetic */ void addMessageBlocking$default(ChatViewModel chatViewModel, Message message, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        chatViewModel.addMessageBlocking(message, z10);
    }

    private final void collectMessageDataTransferProgress(String chatId) {
        Ph.C0 d10;
        Ph.C0 c02 = this.messageDataTransferProgressJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        d10 = AbstractC1459k.d(getAppScope(), null, null, new C3912q(chatId, null), 3, null);
        this.messageDataTransferProgressJob = d10;
    }

    public static /* synthetic */ void deleteMessage$default(ChatViewModel chatViewModel, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        chatViewModel.deleteMessage(str, str2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6884a getAddMessageUseCase() {
        return (C6884a) this.addMessageUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6885b getAddMessages() {
        return (C6885b) this.addMessages.getValue();
    }

    private final Ph.P getAppScope() {
        return C6461a.f65810a.e();
    }

    public static /* synthetic */ EnumC4544a getAppStatus$default(ChatViewModel chatViewModel, Channel.Department department, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            department = null;
        }
        return chatViewModel.getAppStatus(department);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application getApplication() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Kd.a getBrandRepository() {
        return (Kd.a) this.brandRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rd.a getCallsRepository() {
        return (Rd.a) this.callsRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6886c getCancelMessageTransfer() {
        return (C6886c) this.cancelMessageTransfer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Od.a getClearFormUseCase() {
        return (Od.a) this.clearFormUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4377a getCommonRepository() {
        return (C4377a) this.commonRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ke.a getConversationsRepository() {
        return (Ke.a) this.conversationsRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6887d getDeleteFeedbackCardsIfExpiredUseCase() {
        return (C6887d) this.deleteFeedbackCardsIfExpiredUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6888e getDeleteMessage() {
        return (C6888e) this.deleteMessage.getValue();
    }

    private final Od.b getGetCurrentFormMessageUseCase() {
        return (Od.b) this.getCurrentFormMessageUseCase.getValue();
    }

    private final f getGetFlowMessage() {
        return (f) this.getFlowMessage.getValue();
    }

    private final c getGetFormUseCase() {
        return (c) this.getFormUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yf.h getGetLastMessage() {
        return (yf.h) this.getLastMessage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yf.i getGetMessageDataTransferProgressUseCase() {
        return (yf.i) this.getMessageDataTransferProgressUseCase.getValue();
    }

    private final j getGetMessageUseCase() {
        return (j) this.getMessageUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k getGetMessagesUseCase() {
        return (k) this.getMessagesUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l getGetTopAndBottomSyncCompletionData() {
        return (l) this.getTopAndBottomSyncCompletionData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Xd.c getInitiateCallUseCase() {
        return (Xd.c) this.initiateCallUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sf.e getInitiateTrigger() {
        return (Sf.e) this.initiateTrigger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sf.f getInitiateVTSTrigger() {
        return (Sf.f) this.initiateVTSTrigger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Re.h getJoinConversation() {
        return (Re.h) this.joinConversation.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Re.i getLeaveAsMissedConversation() {
        return (Re.i) this.leaveAsMissedConversation.getValue();
    }

    private final Re.j getLoadDraftMessageIntoConversationFromForms() {
        return (Re.j) this.loadDraftMessageIntoConversationFromForms.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ge.e getLogDebugInfo() {
        return (Ge.e) this.logDebugInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Re.k getMailTranscriptUseCase() {
        return (Re.k) this.mailTranscriptUseCase.getValue();
    }

    private final yf.m getMessageActionUseCases() {
        return (yf.m) this.messageActionUseCases.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6550a getMessagesRepository() {
        return (C6550a) this.messagesRepository.getValue();
    }

    private final yf.o getReadMessage() {
        return (yf.o) this.readMessage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p getRefreshMessages() {
        return (p) this.refreshMessages.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r getResendContextMessageUseCase() {
        return (r) this.resendContextMessageUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yf.t getRetrySendingMessageUseCase() {
        return (yf.t) this.retrySendingMessageUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Re.l getSaveDraftMessage() {
        return (Re.l) this.saveDraftMessage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u getSendAllMessageAsSingleMessage() {
        return (u) this.sendAllMessageAsSingleMessage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v getSendContextMessage() {
        return (v) this.sendContextMessage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w getSendMessage() {
        return (w) this.sendMessage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getStartNewConversation() {
        return (m) this.startNewConversation.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g getSyncBrandStatusUseCase() {
        return (g) this.syncBrandStatusUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h getSyncFormUseCase() {
        return (h) this.syncFormUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yf.x getSyncMessage() {
        return (yf.x) this.syncMessage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yf.y getSyncMessagesTranscript() {
        return (yf.y) this.syncMessagesTranscript.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TriggersRepository getTriggersRepository() {
        return (TriggersRepository) this.triggersRepository.getValue();
    }

    private final o getUpdateConversation() {
        return (o) this.updateConversation.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6882B getUpdateMessageExtras() {
        return (C6882B) this.updateMessageExtras.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yf.D getUpdateMessageStatus() {
        return (yf.D) this.updateMessageStatus.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yf.F getUpdateMessageTypingStatus() {
        return (yf.F) this.updateMessageTypingStatus.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0113, code lost:
    
        if (r1 == r2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x04a5, code lost:
    
        if (r5.loadDraftIntoConversation(r0, r12) == r2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x046c, code lost:
    
        if (r5.loadDraftIntoConversation(r0, r12) == r2) goto L182;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleFormAndDepartmentStatusDiffersFallback(SalesIQChat salesIQChat, EnumC4544a enumC4544a, Continuation<? super Unit> continuation) {
        M m10;
        M m11;
        ChatViewModel chatViewModel;
        SalesIQChat salesIQChat2;
        EnumC4544a enumC4544a2;
        InterfaceC5321f interfaceC5321f;
        SalesIQChat salesIQChat3;
        Message message;
        boolean z10;
        String str;
        boolean z11;
        Channel.Department department;
        String str2;
        M m12;
        ChatViewModel chatViewModel2;
        SalesIQChat salesIQChat4;
        Message message2;
        Form.Message message3;
        HashSet hashSet;
        List<Form.Message> messages;
        EnumC4544a enumC4544a3;
        Form.Message message4;
        String str3;
        Form.Message.Meta.InputCard inputCard;
        Message.g gVar;
        Message.g gVar2;
        boolean z12;
        ChatViewModel chatViewModel3;
        Message message5;
        SalesIQChat salesIQChat5;
        Channel.Department department2;
        SalesIQChat salesIQChat6;
        boolean z13;
        ChatViewModel chatViewModel4;
        HashSet hashSet2;
        Form.Message.Meta.InputCard.a aVar;
        C5582a c5582a;
        AbstractC6235a abstractC6235a;
        C5582a c5582a2;
        String str4;
        String a10;
        if (continuation instanceof M) {
            m10 = (M) continuation;
            int i10 = m10.f43851v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                m10.f43851v = i10 - Integer.MIN_VALUE;
                m11 = m10;
                Object obj = m11.f43849t;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (m11.f43851v) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        k getMessagesUseCase = getGetMessagesUseCase();
                        String str5 = this.acknowledgementKey;
                        String str6 = this.chatId;
                        Message.g gVar3 = Message.g.Question;
                        m11.f43843n = this;
                        m11.f43844o = salesIQChat;
                        m11.f43845p = enumC4544a;
                        m11.f43851v = 1;
                        obj = getMessagesUseCase.a(str5, str6, gVar3, m11);
                        if (obj != coroutine_suspended) {
                            chatViewModel = this;
                            salesIQChat2 = salesIQChat;
                            enumC4544a2 = enumC4544a;
                            interfaceC5321f = (InterfaceC5321f) ((C5582a) obj).b();
                            if (interfaceC5321f != null) {
                                m11.f43843n = chatViewModel;
                                m11.f43844o = salesIQChat2;
                                m11.f43845p = enumC4544a2;
                                m11.f43851v = 2;
                                obj = AbstractC5323h.t(interfaceC5321f, m11);
                                break;
                            }
                            salesIQChat3 = salesIQChat2;
                            message = null;
                            if (salesIQChat3 == null) {
                                salesIQChat3 = LiveChatUtil.getChatWithAnyId(chatViewModel.acknowledgementKey);
                            }
                            Channel.Department e10 = AbstractC3945n.e(salesIQChat3 == null ? salesIQChat3.getDeptid() : null);
                            Form.Message message6 = (Form.Message) chatViewModel.getGetCurrentFormMessageUseCase().a().b();
                            if (message != null || salesIQChat3 == null) {
                                return Unit.INSTANCE;
                            }
                            Set n10 = d.n(De.a.OngoingConversationContextRequestedMessages, null);
                            HashSet hashSet3 = n10 instanceof HashSet ? (HashSet) n10 : null;
                            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                            Form form = enumC4544a2 != null ? (Form) chatViewModel.getGetFormUseCase().a(enumC4544a2).b() : null;
                            if (form != null && (messages = form.getMessages()) != null) {
                                for (Form.Message message7 : messages) {
                                    Form form2 = form;
                                    String handleFormAndDepartmentStatusDiffersFallback$getFieldValue = handleFormAndDepartmentStatusDiffersFallback$getFieldValue(salesIQChat3, chatViewModel, message7);
                                    if (hashSet3 != null) {
                                        Form.Message.Meta meta = message7.getMeta();
                                        if (meta == null || (inputCard = meta.getInputCard()) == null) {
                                            message4 = message7;
                                            enumC4544a3 = enumC4544a2;
                                        } else {
                                            message4 = message7;
                                            Form.Message.Meta.InputCard.a type = inputCard.getType();
                                            enumC4544a3 = enumC4544a2;
                                            if (type != null) {
                                                str3 = Form.Message.Meta.InputCard.a.Companion.a(type);
                                                if (hashSet3.contains(str3)) {
                                                    Form.Message.Meta meta2 = message4.getMeta();
                                                    if (!(meta2 != null ? Intrinsics.areEqual(meta2.isSkippable(), Boxing.boxBoolean(true)) : false)) {
                                                        if (i.f(handleFormAndDepartmentStatusDiffersFallback$getFieldValue)) {
                                                        }
                                                    }
                                                    form = form2;
                                                    enumC4544a2 = enumC4544a3;
                                                }
                                            }
                                        }
                                        str3 = null;
                                        if (hashSet3.contains(str3)) {
                                        }
                                    } else {
                                        enumC4544a3 = enumC4544a2;
                                    }
                                    booleanRef.element = true;
                                    form = form2;
                                    enumC4544a2 = enumC4544a3;
                                }
                            }
                            Form form3 = form;
                            EnumC4544a enumC4544a4 = enumC4544a2;
                            if (message6 == null && form3 != null) {
                                chatViewModel.addInlineFormMessage(salesIQChat3);
                                chatViewModel.updateMessageStatusAsync(message.getChatId(), message.getId(), Message.f.Sent);
                            } else if (booleanRef.element && message6 != null) {
                                LiveChatUtil.setFormContextStarted();
                                Ge.h.c(d.o(De.a.IsOngoingConversationContextAutoReplyOn, true), false, 1, null);
                                m11.f43843n = chatViewModel;
                                m11.f43844o = message;
                                m11.f43845p = salesIQChat3;
                                m11.f43846q = e10;
                                m11.f43847r = message6;
                                m11.f43848s = hashSet3;
                                m11.f43851v = 3;
                                HashSet hashSet4 = hashSet3;
                                ChatViewModel chatViewModel5 = chatViewModel;
                                z10 = false;
                                str = "getConvID(...)";
                                SalesIQChat salesIQChat7 = salesIQChat3;
                                z11 = true;
                                department = e10;
                                str2 = "CHAT_ERROR";
                                m12 = m11;
                                if (sendPreChatFormQuestion$default(chatViewModel5, salesIQChat7, message, enumC4544a4, false, null, m11, 16, null) != coroutine_suspended) {
                                    chatViewModel2 = chatViewModel5;
                                    salesIQChat4 = salesIQChat7;
                                    message2 = message;
                                    message3 = message6;
                                    hashSet = hashSet4;
                                    if (message3.getMeta() != null) {
                                        LiveChatUtil.log("Form meta is null");
                                        LiveChatUtil.triggerChatListener(str2, salesIQChat4, new b.a("Form meta is null"));
                                        return Unit.INSTANCE;
                                    }
                                    Form.Message.Meta.InputCard inputCard2 = message3.getMeta().getInputCard();
                                    Form.Message.Meta.InputCard.a type2 = inputCard2 != null ? inputCard2.getType() : null;
                                    String handleFormAndDepartmentStatusDiffersFallback$getFieldValue2 = handleFormAndDepartmentStatusDiffersFallback$getFieldValue(salesIQChat4, chatViewModel2, message3);
                                    if (((handleFormAndDepartmentStatusDiffersFallback$getFieldValue2 == null || handleFormAndDepartmentStatusDiffersFallback$getFieldValue2.length() == 0) ? z11 : z10) && Intrinsics.areEqual(message3.getMeta().isSkippable(), Boxing.boxBoolean(z11))) {
                                        gVar = Message.g.Skip;
                                        handleFormAndDepartmentStatusDiffersFallback$getFieldValue2 = "-";
                                    } else {
                                        gVar = Message.g.Text;
                                    }
                                    if (hashSet != null) {
                                        gVar2 = gVar;
                                        boolean z14 = z11;
                                        if (hashSet.contains(type2 != null ? Form.Message.Meta.InputCard.a.Companion.a(type2) : null) == z14) {
                                            z10 = z14;
                                        }
                                    } else {
                                        gVar2 = gVar;
                                    }
                                    if ((!z10 && !Intrinsics.areEqual(message3.getMeta().getFieldName(), "department")) || !i.f(handleFormAndDepartmentStatusDiffersFallback$getFieldValue2)) {
                                        salesIQChat6 = salesIQChat4;
                                        Message message8 = message2;
                                        ChatViewModel chatViewModel6 = chatViewModel2;
                                        m11 = m12;
                                        z13 = true;
                                        chatViewModel6.updateMessageStatusAsync(message8.getChatId(), message8.getId(), Message.f.Sent);
                                        C6884a addMessageUseCase = chatViewModel6.getAddMessageUseCase();
                                        m11.f43843n = chatViewModel6;
                                        m11.f43844o = salesIQChat6;
                                        m11.f43845p = hashSet;
                                        m11.f43846q = type2;
                                        m11.f43847r = null;
                                        m11.f43848s = null;
                                        m11.f43851v = 5;
                                        Object b10 = C6884a.b(addMessageUseCase, salesIQChat6, message3, false, m11, 4, null);
                                        if (b10 != coroutine_suspended) {
                                            chatViewModel4 = chatViewModel6;
                                            hashSet2 = hashSet;
                                            aVar = type2;
                                            obj = b10;
                                            c5582a2 = (C5582a) obj;
                                            if (c5582a2.d()) {
                                                String chid = salesIQChat6.getChid();
                                                Intrinsics.checkNotNullExpressionValue(chid, "getChid(...)");
                                                m11.f43843n = chatViewModel4;
                                                m11.f43844o = hashSet2;
                                                m11.f43845p = aVar;
                                                m11.f43846q = c5582a2;
                                                m11.f43851v = 6;
                                                break;
                                            }
                                            str4 = chatViewModel4.chatId;
                                            if (str4 != null) {
                                                Intrinsics.checkNotNull(str4);
                                                m11.f43843n = null;
                                                m11.f43844o = null;
                                                m11.f43845p = null;
                                                m11.f43846q = null;
                                                m11.f43851v = 7;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (salesIQChat4.getChid() == null) {
                                            LiveChatUtil.log("Chat Id is null");
                                            LiveChatUtil.triggerChatListener(str2, salesIQChat4, new b.a("Chat Id is null"));
                                            return Unit.INSTANCE;
                                        }
                                        String valueOf = String.valueOf(rd.b.f());
                                        v sendContextMessage = chatViewModel2.getSendContextMessage();
                                        String convID = salesIQChat4.getConvID();
                                        String chid2 = salesIQChat4.getChid();
                                        Intrinsics.checkNotNull(chid2);
                                        m12.f43843n = chatViewModel2;
                                        m12.f43844o = message2;
                                        m12.f43845p = salesIQChat4;
                                        m12.f43846q = department;
                                        m12.f43847r = null;
                                        m12.f43848s = null;
                                        m12.f43851v = 4;
                                        SalesIQChat salesIQChat8 = salesIQChat4;
                                        Message message9 = message2;
                                        Channel.Department department3 = department;
                                        ChatViewModel chatViewModel7 = chatViewModel2;
                                        z12 = true;
                                        Object a11 = sendContextMessage.a(convID, chid2, handleFormAndDepartmentStatusDiffersFallback$getFieldValue2, valueOf, gVar2, true, true, true, m12);
                                        if (a11 != coroutine_suspended) {
                                            chatViewModel3 = chatViewModel7;
                                            obj = a11;
                                            message5 = message9;
                                            salesIQChat5 = salesIQChat8;
                                            department2 = department3;
                                            c5582a = (C5582a) obj;
                                            if (c5582a.d()) {
                                                sendRefreshBroadCast$default(chatViewModel3, salesIQChat5.getChid(), salesIQChat5.getConvID(), false, 4, null);
                                            }
                                            AbstractC6235a.c cVar = AbstractC6235a.c.Messages;
                                            if (!c5582a.d()) {
                                                C5582a.b c10 = c5582a.c();
                                                if (c10 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c10, cVar)) == null) {
                                                    abstractC6235a = AbstractC6235a.b.f64114d;
                                                }
                                                Intrinsics.checkNotNull(c5582a.c(), "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                                                if (Intrinsics.areEqual(abstractC6235a, C6223E.f64097d)) {
                                                    if ((department2 != null ? department2.getId() : null) == null) {
                                                        LiveChatUtil.log("Department Id is null");
                                                        LiveChatUtil.triggerChatListener(str2, salesIQChat5, new b.a("Department Id is null"));
                                                        return Unit.INSTANCE;
                                                    }
                                                    if (Intrinsics.areEqual(department2.isOnline(), Boxing.boxBoolean(z12))) {
                                                        String convID2 = salesIQChat5.getConvID();
                                                        Intrinsics.checkNotNullExpressionValue(convID2, str);
                                                        chatViewModel3.startNewConversation(convID2, department2.getId(), salesIQChat5.getStatus(), salesIQChat5.getAttenderEmail(), salesIQChat5.getAttenderid(), salesIQChat5.isBotAttender());
                                                    } else {
                                                        String str7 = str;
                                                        if (message5.getContent() == null) {
                                                            LiveChatUtil.log("Question content is null");
                                                            LiveChatUtil.triggerChatListener(str2, salesIQChat5, new b.a("Question content is null"));
                                                            return Unit.INSTANCE;
                                                        }
                                                        String chid3 = salesIQChat5.getChid();
                                                        Intrinsics.checkNotNullExpressionValue(chid3, "getChid(...)");
                                                        String convID3 = salesIQChat5.getConvID();
                                                        Intrinsics.checkNotNullExpressionValue(convID3, str7);
                                                        chatViewModel3.leaveAsMissedConversation(chid3, convID3, department2.getId(), message5.getContent(), C6218a.n());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                ChatViewModel chatViewModel8 = chatViewModel;
                                SalesIQChat salesIQChat9 = salesIQChat3;
                                if ((e10 != null ? e10.getId() : null) == null) {
                                    LiveChatUtil.log("Department Id is null");
                                    LiveChatUtil.triggerChatListener("CHAT_ERROR", salesIQChat9, new b.a("Department Id is null"));
                                    return Unit.INSTANCE;
                                }
                                LiveChatUtil.setFormContextCompleted();
                                if (Intrinsics.areEqual(e10.isOnline(), Boxing.boxBoolean(true))) {
                                    String convID4 = salesIQChat9.getConvID();
                                    Intrinsics.checkNotNullExpressionValue(convID4, "getConvID(...)");
                                    chatViewModel8.startNewConversation(convID4, e10.getId(), salesIQChat9.getStatus(), salesIQChat9.getAttenderEmail(), salesIQChat9.getAttenderid(), salesIQChat9.isBotAttender());
                                } else {
                                    if (message.getContent() == null) {
                                        LiveChatUtil.log("Question content is null");
                                        LiveChatUtil.triggerChatListener("CHAT_ERROR", salesIQChat9, new b.a("Question content is null"));
                                    }
                                    String chid4 = salesIQChat9.getChid();
                                    Intrinsics.checkNotNullExpressionValue(chid4, "getChid(...)");
                                    String convID5 = salesIQChat9.getConvID();
                                    Intrinsics.checkNotNullExpressionValue(convID5, "getConvID(...)");
                                    String id2 = e10.getId();
                                    String content = message.getContent();
                                    Intrinsics.checkNotNull(content);
                                    chatViewModel8.leaveAsMissedConversation(chid4, convID5, id2, content, C6218a.n());
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    case 1:
                        enumC4544a2 = (EnumC4544a) m11.f43845p;
                        salesIQChat2 = (SalesIQChat) m11.f43844o;
                        chatViewModel = (ChatViewModel) m11.f43843n;
                        ResultKt.throwOnFailure(obj);
                        interfaceC5321f = (InterfaceC5321f) ((C5582a) obj).b();
                        if (interfaceC5321f != null) {
                        }
                        salesIQChat3 = salesIQChat2;
                        message = null;
                        if (salesIQChat3 == null) {
                        }
                        Channel.Department e102 = AbstractC3945n.e(salesIQChat3 == null ? salesIQChat3.getDeptid() : null);
                        Form.Message message62 = (Form.Message) chatViewModel.getGetCurrentFormMessageUseCase().a().b();
                        if (message != null) {
                        }
                        return Unit.INSTANCE;
                    case 2:
                        enumC4544a2 = (EnumC4544a) m11.f43845p;
                        salesIQChat2 = (SalesIQChat) m11.f43844o;
                        chatViewModel = (ChatViewModel) m11.f43843n;
                        ResultKt.throwOnFailure(obj);
                        List list = (List) obj;
                        if (list != null) {
                            SalesIQChat salesIQChat10 = salesIQChat2;
                            message = (Message) CollectionsKt.firstOrNull(list);
                            salesIQChat3 = salesIQChat10;
                            if (salesIQChat3 == null) {
                            }
                            Channel.Department e1022 = AbstractC3945n.e(salesIQChat3 == null ? salesIQChat3.getDeptid() : null);
                            Form.Message message622 = (Form.Message) chatViewModel.getGetCurrentFormMessageUseCase().a().b();
                            if (message != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        salesIQChat3 = salesIQChat2;
                        message = null;
                        if (salesIQChat3 == null) {
                        }
                        Channel.Department e10222 = AbstractC3945n.e(salesIQChat3 == null ? salesIQChat3.getDeptid() : null);
                        Form.Message message6222 = (Form.Message) chatViewModel.getGetCurrentFormMessageUseCase().a().b();
                        if (message != null) {
                        }
                        return Unit.INSTANCE;
                    case 3:
                        HashSet hashSet5 = (HashSet) m11.f43848s;
                        Form.Message message10 = (Form.Message) m11.f43847r;
                        Channel.Department department4 = (Channel.Department) m11.f43846q;
                        SalesIQChat salesIQChat11 = (SalesIQChat) m11.f43845p;
                        Message message11 = (Message) m11.f43844o;
                        ChatViewModel chatViewModel9 = (ChatViewModel) m11.f43843n;
                        ResultKt.throwOnFailure(obj);
                        str = "getConvID(...)";
                        message2 = message11;
                        str2 = "CHAT_ERROR";
                        z11 = true;
                        chatViewModel2 = chatViewModel9;
                        message3 = message10;
                        department = department4;
                        m12 = m11;
                        z10 = false;
                        hashSet = hashSet5;
                        salesIQChat4 = salesIQChat11;
                        if (message3.getMeta() != null) {
                        }
                        break;
                    case 4:
                        department2 = (Channel.Department) m11.f43846q;
                        salesIQChat5 = (SalesIQChat) m11.f43845p;
                        message5 = (Message) m11.f43844o;
                        ChatViewModel chatViewModel10 = (ChatViewModel) m11.f43843n;
                        ResultKt.throwOnFailure(obj);
                        str = "getConvID(...)";
                        str2 = "CHAT_ERROR";
                        z12 = true;
                        chatViewModel3 = chatViewModel10;
                        c5582a = (C5582a) obj;
                        if (c5582a.d()) {
                        }
                        AbstractC6235a.c cVar2 = AbstractC6235a.c.Messages;
                        if (!c5582a.d()) {
                        }
                        return Unit.INSTANCE;
                    case 5:
                        aVar = (Form.Message.Meta.InputCard.a) m11.f43846q;
                        hashSet2 = (HashSet) m11.f43845p;
                        SalesIQChat salesIQChat12 = (SalesIQChat) m11.f43844o;
                        ChatViewModel chatViewModel11 = (ChatViewModel) m11.f43843n;
                        ResultKt.throwOnFailure(obj);
                        salesIQChat6 = salesIQChat12;
                        chatViewModel4 = chatViewModel11;
                        z13 = true;
                        c5582a2 = (C5582a) obj;
                        if (c5582a2.d()) {
                        }
                        str4 = chatViewModel4.chatId;
                        if (str4 != null) {
                        }
                        return Unit.INSTANCE;
                    case 6:
                        aVar = (Form.Message.Meta.InputCard.a) m11.f43845p;
                        hashSet2 = (HashSet) m11.f43844o;
                        chatViewModel4 = (ChatViewModel) m11.f43843n;
                        ResultKt.throwOnFailure(obj);
                        z13 = true;
                        De.a aVar2 = De.a.OngoingConversationContextRequestedMessages;
                        if (hashSet2 == null) {
                            hashSet2 = new HashSet();
                        }
                        if (aVar != null && (a10 = Form.Message.Meta.InputCard.a.Companion.a(aVar)) != null) {
                            hashSet2.add(a10);
                        }
                        d.s(aVar2, hashSet2).b(z13);
                        str4 = chatViewModel4.chatId;
                        if (str4 != null) {
                        }
                        return Unit.INSTANCE;
                    case 7:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        m10 = new M(continuation);
        m11 = m10;
        Object obj2 = m11.f43849t;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (m11.f43851v) {
        }
    }

    private static final String handleFormAndDepartmentStatusDiffersFallback$getFieldValue(SalesIQChat salesIQChat, ChatViewModel chatViewModel, Form.Message message) {
        Form.Message.Meta.InputCard inputCard;
        Form.Message.Meta meta = message.getMeta();
        Form.Message.Meta.InputCard.a type = (meta == null || (inputCard = meta.getInputCard()) == null) ? null : inputCard.getType();
        if (type == Form.Message.Meta.InputCard.a.VisitorName) {
            String m10 = d.m(De.a.VisitorName, null, 2, null);
            if (LiveChatUtil.isAnnonVisitorbyName(m10)) {
                return null;
            }
            return m10;
        }
        if (type == Form.Message.Meta.InputCard.a.VisitorEmail) {
            return d.m(De.a.VisitorEmail, null, 2, null);
        }
        if (type == Form.Message.Meta.InputCard.a.VisitorPhone) {
            return d.m(De.a.VisitorPhone, null, 2, null);
        }
        Form.Message.Meta meta2 = message.getMeta();
        if (Intrinsics.areEqual(meta2 != null ? meta2.getFieldName() : null, "department")) {
            String departmentName = salesIQChat.getDepartmentName();
            if (i.f(departmentName)) {
                return departmentName;
            }
            return null;
        }
        if (type == Form.Message.Meta.InputCard.a.Campaign) {
            De.a aVar = De.a.IsCampaignSuggestionsSubscribed;
            if (d.c(aVar)) {
                return chatViewModel.getApplication().getString(d.f(aVar, false, 2, null) ? t.f60978Z0 : t.f60972Y0);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initiateTrigger(Rf.a aVar, String str, String str2, String str3, boolean z10, String str4, boolean z11, boolean z12, boolean z13, Continuation<? super C5582a> continuation) {
        return AbstractC1455i.g(C1452g0.b(), new P(z13, aVar, str4, str2, str, str3, z10, z11, z12, null), continuation);
    }

    public static /* synthetic */ Object initiateTrigger$default(ChatViewModel chatViewModel, Rf.a aVar, String str, String str2, String str3, boolean z10, String str4, boolean z11, boolean z12, boolean z13, Continuation continuation, int i10, Object obj) {
        boolean z14;
        ChatViewModel chatViewModel2;
        Rf.a aVar2;
        String str5;
        String str6;
        String str7;
        boolean z15;
        Continuation continuation2;
        String str8 = (i10 & 32) != 0 ? null : str4;
        boolean z16 = (i10 & 64) != 0 ? false : z11;
        boolean z17 = (i10 & 128) != 0 ? false : z12;
        if ((i10 & 256) != 0) {
            z14 = false;
            aVar2 = aVar;
            str5 = str;
            str6 = str2;
            str7 = str3;
            z15 = z10;
            continuation2 = continuation;
            chatViewModel2 = chatViewModel;
        } else {
            z14 = z13;
            chatViewModel2 = chatViewModel;
            aVar2 = aVar;
            str5 = str;
            str6 = str2;
            str7 = str3;
            z15 = z10;
            continuation2 = continuation;
        }
        return chatViewModel2.initiateTrigger(aVar2, str5, str6, str7, z15, str8, z16, z17, z14, continuation2);
    }

    public static /* synthetic */ Object initiateTriggerApi$default(ChatViewModel chatViewModel, Rf.a aVar, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, Continuation continuation, int i10, Object obj) {
        boolean z14;
        ChatViewModel chatViewModel2;
        Rf.a aVar2;
        String str5;
        String str6;
        String str7;
        boolean z15;
        Continuation continuation2;
        String str8 = (i10 & 16) != 0 ? null : str4;
        boolean z16 = (i10 & 64) != 0 ? false : z11;
        boolean z17 = (i10 & 128) != 0 ? false : z12;
        if ((i10 & 256) != 0) {
            z14 = false;
            aVar2 = aVar;
            str5 = str;
            str6 = str2;
            str7 = str3;
            z15 = z10;
            continuation2 = continuation;
            chatViewModel2 = chatViewModel;
        } else {
            z14 = z13;
            chatViewModel2 = chatViewModel;
            aVar2 = aVar;
            str5 = str;
            str6 = str2;
            str7 = str3;
            z15 = z10;
            continuation2 = continuation;
        }
        return chatViewModel2.initiateTriggerApi(aVar2, str5, str6, str7, str8, z15, z16, z17, z14, continuation2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initiateVTSTriggerApi(String str, boolean z10, String str2, boolean z11, Continuation<? super C5582a> continuation) {
        return AbstractC1455i.g(C1452g0.b(), new R(str2, this, str, z10, z11, null), continuation);
    }

    public static /* synthetic */ Object initiateVTSTriggerApi$default(ChatViewModel chatViewModel, String str, boolean z10, String str2, boolean z11, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return chatViewModel.initiateVTSTriggerApi(str, z10, str3, z11, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object invokeStartChatCallback(String str, Continuation<? super Unit> continuation) {
        SalesIQChat chatWithAnyId = LiveChatUtil.getChatWithAnyId(str);
        Object q02 = Te.a.f11572a.q0(str, chatWithAnyId != null ? e.f67680b.b(chatWithAnyId) : e.f67680b.a(we.d.f67649d), continuation);
        return q02 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? q02 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object invokeStartChatCallbackFailure(String str, C5582a.b bVar, Continuation<? super Unit> continuation) {
        Te.a aVar = Te.a.f11572a;
        e.a aVar2 = e.f67680b;
        Integer b10 = bVar.b();
        Object q02 = aVar.q0(str, aVar2.a(new d.b(b10 != null ? b10.intValue() : -1, bVar.c())), continuation);
        return q02 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? q02 : Unit.INSTANCE;
    }

    private final C6890g isFeedbackExpired() {
        return (C6890g) this.isFeedbackExpired.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadDraftIntoConversation(String str, Continuation<? super Unit> continuation) {
        C3881a0 c3881a0;
        int i10;
        ChatViewModel chatViewModel;
        String uniqueID;
        if (continuation instanceof C3881a0) {
            c3881a0 = (C3881a0) continuation;
            int i11 = c3881a0.f43964r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3881a0.f43964r = i11 - Integer.MIN_VALUE;
                Object obj = c3881a0.f43962p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3881a0.f43964r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Re.j loadDraftMessageIntoConversationFromForms = getLoadDraftMessageIntoConversationFromForms();
                    c3881a0.f43960n = this;
                    c3881a0.f43961o = str;
                    c3881a0.f43964r = 1;
                    obj = loadDraftMessageIntoConversationFromForms.a(str, c3881a0);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatViewModel = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) c3881a0.f43961o;
                    ChatViewModel chatViewModel2 = (ChatViewModel) c3881a0.f43960n;
                    ResultKt.throwOnFailure(obj);
                    chatViewModel = chatViewModel2;
                }
                String str2 = str;
                Message message = (Message) chatViewModel.currentEditMessage.getValue();
                uniqueID = message == null ? message.getUniqueID() : null;
                if (uniqueID != null || uniqueID.length() == 0) {
                    sendRefreshBroadCast$default(chatViewModel, str2, null, false, 6, null);
                }
                return Unit.INSTANCE;
            }
        }
        c3881a0 = new C3881a0(continuation);
        Object obj2 = c3881a0.f43962p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3881a0.f43964r;
        if (i10 != 0) {
        }
        String str22 = str;
        Message message2 = (Message) chatViewModel.currentEditMessage.getValue();
        if (message2 == null) {
        }
        if (uniqueID != null) {
        }
        sendRefreshBroadCast$default(chatViewModel, str22, null, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadMessages(String conversationId, String chatId) {
        Ph.C0 d10;
        Ph.C0 c02 = this.messageLoadingJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        d10 = AbstractC1459k.d(androidx.lifecycle.S.a(this), C1452g0.b(), null, new C3887d0(conversationId, chatId, null), 2, null);
        this.messageLoadingJob = d10;
    }

    public static /* synthetic */ void mailTranscript$default(ChatViewModel chatViewModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        chatViewModel.mailTranscript(str);
    }

    private final void refreshMessages(String acknowledgementKey, String chatId) {
        AbstractC1459k.d(getAppScope(), null, null, new C3913q0(acknowledgementKey, chatId, this, null), 3, null);
    }

    public static /* synthetic */ void sendContextMessage$default(ChatViewModel chatViewModel, String str, String str2, Message.g gVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            gVar = Message.g.Text;
        }
        chatViewModel.sendContextMessage(str, str2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x021c, code lost:
    
        if (r2.c(r6, r3) != r4) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0202, code lost:
    
        if (r2.b(r5, r6, r8, r3) == r4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0146, code lost:
    
        if (r2.a(r5, true, r3) == r4) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendPreChatFormQuestion(SalesIQChat salesIQChat, Message message, EnumC4544a enumC4544a, boolean z10, Function1<? super Boolean, Unit> function1, Continuation<? super Unit> continuation) {
        F0 f02;
        Object coroutine_suspended;
        int i10;
        SalesIQChat salesIQChat2;
        Message message2;
        EnumC4544a enumC4544a2;
        Function1<? super Boolean, Unit> function12;
        ChatViewModel chatViewModel;
        Object a10;
        SalesIQChat salesIQChat3;
        Message message3;
        Function1<? super Boolean, Unit> function13;
        ChatViewModel chatViewModel2;
        String str;
        C5582a c5582a;
        ChatViewModel chatViewModel3;
        boolean z11;
        C5582a c5582a2;
        Function1<? super Boolean, Unit> function14;
        C5582a c5582a3;
        boolean z12 = z10;
        if (continuation instanceof F0) {
            f02 = (F0) continuation;
            int i11 = f02.f43800v;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f02.f43800v = i11 - Integer.MIN_VALUE;
                Object obj = f02.f43798t;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = f02.f43800v;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    LiveChatUtil.log("sendPreChatFormQuestion-viewModel " + Log.getStackTraceString(new Throwable()));
                    if (z12) {
                        yf.x syncMessage = getSyncMessage();
                        Message copy$default = Message.copy$default(message, null, null, null, null, Message.f.Sending, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -17, 1023, null);
                        f02.f43792n = this;
                        salesIQChat2 = salesIQChat;
                        f02.f43793o = salesIQChat2;
                        message2 = message;
                        f02.f43794p = message2;
                        enumC4544a2 = enumC4544a;
                        f02.f43795q = enumC4544a2;
                        function12 = function1;
                        f02.f43796r = function12;
                        f02.f43797s = z12;
                        f02.f43800v = 1;
                    } else {
                        salesIQChat2 = salesIQChat;
                        message2 = message;
                        enumC4544a2 = enumC4544a;
                        function12 = function1;
                    }
                    chatViewModel = this;
                } else if (i10 == 1) {
                    z12 = f02.f43797s;
                    Function1<? super Boolean, Unit> function15 = (Function1) f02.f43796r;
                    EnumC4544a enumC4544a3 = (EnumC4544a) f02.f43795q;
                    message2 = (Message) f02.f43794p;
                    SalesIQChat salesIQChat4 = (SalesIQChat) f02.f43793o;
                    ChatViewModel chatViewModel4 = (ChatViewModel) f02.f43792n;
                    ResultKt.throwOnFailure(obj);
                    enumC4544a2 = enumC4544a3;
                    salesIQChat2 = salesIQChat4;
                    chatViewModel = chatViewModel4;
                    function12 = function15;
                } else if (i10 == 2) {
                    z12 = f02.f43797s;
                    Function1<? super Boolean, Unit> function16 = (Function1) f02.f43795q;
                    message3 = (Message) f02.f43794p;
                    salesIQChat3 = (SalesIQChat) f02.f43793o;
                    chatViewModel2 = (ChatViewModel) f02.f43792n;
                    ResultKt.throwOnFailure(obj);
                    function13 = function16;
                    c5582a = (C5582a) obj;
                    if (c5582a.d()) {
                        String convID = salesIQChat3 != null ? salesIQChat3.getConvID() : null;
                        if (convID != null) {
                            Te.a aVar = Te.a.f11572a;
                            e a11 = e.f67680b.a(we.d.f67673x);
                            f02.f43792n = chatViewModel2;
                            f02.f43793o = message3;
                            f02.f43794p = function13;
                            f02.f43795q = c5582a;
                            f02.f43797s = z12;
                            f02.f43800v = 3;
                            if (aVar.q0(convID, a11, f02) != coroutine_suspended) {
                                chatViewModel3 = chatViewModel2;
                                chatViewModel2 = chatViewModel3;
                            }
                            return coroutine_suspended;
                        }
                    }
                    z11 = z12;
                    c5582a2 = c5582a;
                    function14 = function13;
                    if (z11) {
                    }
                    c5582a3 = c5582a2;
                    C6461a c6461a = C6461a.f65810a;
                    G0 g02 = new G0(function14, c5582a2, null);
                    f02.f43792n = c5582a3;
                    f02.f43793o = null;
                    f02.f43794p = null;
                    f02.f43795q = null;
                    f02.f43800v = 5;
                } else if (i10 == 3) {
                    z12 = f02.f43797s;
                    c5582a = (C5582a) f02.f43795q;
                    function13 = (Function1) f02.f43794p;
                    message3 = (Message) f02.f43793o;
                    chatViewModel3 = (ChatViewModel) f02.f43792n;
                    ResultKt.throwOnFailure(obj);
                    chatViewModel2 = chatViewModel3;
                    z11 = z12;
                    c5582a2 = c5582a;
                    function14 = function13;
                    if (z11) {
                        yf.D updateMessageStatus = chatViewModel2.getUpdateMessageStatus();
                        String chatId = message3.getChatId();
                        String id2 = message3.getId();
                        Message.f fVar = c5582a2.d() ? Message.f.Sent : Message.f.Failure;
                        f02.f43792n = function14;
                        f02.f43793o = c5582a2;
                        f02.f43794p = c5582a2;
                        f02.f43795q = null;
                        f02.f43800v = 4;
                    }
                    c5582a3 = c5582a2;
                    C6461a c6461a2 = C6461a.f65810a;
                    G0 g022 = new G0(function14, c5582a2, null);
                    f02.f43792n = c5582a3;
                    f02.f43793o = null;
                    f02.f43794p = null;
                    f02.f43795q = null;
                    f02.f43800v = 5;
                } else {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    c5582a2 = (C5582a) f02.f43794p;
                    c5582a3 = (C5582a) f02.f43793o;
                    function14 = (Function1) f02.f43792n;
                    ResultKt.throwOnFailure(obj);
                    C6461a c6461a22 = C6461a.f65810a;
                    G0 g0222 = new G0(function14, c5582a2, null);
                    f02.f43792n = c5582a3;
                    f02.f43793o = null;
                    f02.f43794p = null;
                    f02.f43795q = null;
                    f02.f43800v = 5;
                }
                h syncFormUseCase = chatViewModel.getSyncFormUseCase();
                String content = message2.getContent();
                if (enumC4544a2 == null) {
                    if (salesIQChat2 == null || (str = salesIQChat2.getConvID()) == null) {
                        str = chatViewModel.acknowledgementKey;
                    }
                    enumC4544a2 = com.zoho.livechat.android.modules.brand.ui.helpers.a.w(str, salesIQChat2 != null ? salesIQChat2.getDeptid() : null, salesIQChat2 != null && salesIQChat2.isTriggeredChat());
                }
                f02.f43792n = chatViewModel;
                f02.f43793o = salesIQChat2;
                f02.f43794p = message2;
                f02.f43795q = function12;
                f02.f43796r = null;
                f02.f43797s = z12;
                f02.f43800v = 2;
                a10 = syncFormUseCase.a(true, content, enumC4544a2, f02);
                if (a10 != coroutine_suspended) {
                    salesIQChat3 = salesIQChat2;
                    message3 = message2;
                    function13 = function12;
                    chatViewModel2 = chatViewModel;
                    obj = a10;
                    c5582a = (C5582a) obj;
                    if (c5582a.d()) {
                    }
                    z11 = z12;
                    c5582a2 = c5582a;
                    function14 = function13;
                    if (z11) {
                    }
                    c5582a3 = c5582a2;
                    C6461a c6461a222 = C6461a.f65810a;
                    G0 g02222 = new G0(function14, c5582a2, null);
                    f02.f43792n = c5582a3;
                    f02.f43793o = null;
                    f02.f43794p = null;
                    f02.f43795q = null;
                    f02.f43800v = 5;
                }
                return coroutine_suspended;
            }
        }
        f02 = new F0(continuation);
        Object obj2 = f02.f43798t;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = f02.f43800v;
        if (i10 != 0) {
        }
        h syncFormUseCase2 = chatViewModel.getSyncFormUseCase();
        String content2 = message2.getContent();
        if (enumC4544a2 == null) {
        }
        f02.f43792n = chatViewModel;
        f02.f43793o = salesIQChat2;
        f02.f43794p = message2;
        f02.f43795q = function12;
        f02.f43796r = null;
        f02.f43797s = z12;
        f02.f43800v = 2;
        a10 = syncFormUseCase2.a(true, content2, enumC4544a2, f02);
        if (a10 != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object sendPreChatFormQuestion$default(ChatViewModel chatViewModel, SalesIQChat salesIQChat, Message message, EnumC4544a enumC4544a, boolean z10, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            enumC4544a = null;
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        if ((i10 & 16) != 0) {
            function1 = null;
        }
        return chatViewModel.sendPreChatFormQuestion(salesIQChat, message, enumC4544a, z10, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendRefreshBroadCast(String chatId, String acknowledgementKey, boolean addStartTimer) {
        if (chatId == null && acknowledgementKey == null) {
            return;
        }
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        C1908a b10 = C1908a.b(e10);
        Intent intent = new Intent("receivelivechat");
        intent.putExtra("message", "refreshchat");
        if (chatId != null) {
            intent.putExtra("chid", chatId);
        }
        if (acknowledgementKey != null) {
            intent.putExtra("conversation_id", acknowledgementKey);
        }
        if ((addStartTimer ? intent : null) != null) {
            intent.putExtra("StartWaitingTimer", true);
        }
        b10.d(intent);
    }

    public static /* synthetic */ void sendRefreshBroadCast$default(ChatViewModel chatViewModel, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        chatViewModel.sendRefreshBroadCast(str, str2, z10);
    }

    public static /* synthetic */ void syncBrandStatus$default(ChatViewModel chatViewModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        chatViewModel.syncBrandStatus(str);
    }

    private final void syncMessagesAsync(List<Message> messages, Long typingDelayInSeconds) {
        if (this.currentEditMessage.getValue() == null) {
            AbstractC1459k.d(getAppScope(), null, null, new P0(typingDelayInSeconds, this, messages, null), 3, null);
        }
    }

    public static /* synthetic */ void syncMessagesAsync$default(ChatViewModel chatViewModel, List list, Long l10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            l10 = null;
        }
        chatViewModel.syncMessagesAsync(list, l10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void syncMessagesTranscript$default(ChatViewModel chatViewModel, String str, String str2, String str3, String str4, Long l10, Long l11, String str5, boolean z10, boolean z11, y.a aVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            l10 = null;
        }
        if ((i10 & 32) != 0) {
            l11 = null;
        }
        if ((i10 & 64) != 0) {
            str5 = null;
        }
        if ((i10 & 128) != 0) {
            z10 = false;
        }
        if ((i10 & 256) != 0) {
            z11 = false;
        }
        if ((i10 & 512) != 0) {
            aVar = y.a.Top;
        }
        if ((i10 & 1024) != 0) {
            function1 = null;
        }
        chatViewModel.syncMessagesTranscript(str, str2, str3, str4, l10, l11, str5, z10, z11, aVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncTopSyncCompletionData() {
        AbstractC1459k.d(getAppScope(), null, null, new S0(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File writeStringToFile(StringBuilder stringBuilder, String filename) {
        Object m147constructorimpl;
        File fileFromDisk = com.zoho.livechat.android.utils.y.INSTANCE.getFileFromDisk(filename);
        try {
            Result.Companion companion = Result.INSTANCE;
            fileFromDisk.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileFromDisk, true));
            bufferedWriter.append((CharSequence) stringBuilder);
            bufferedWriter.newLine();
            bufferedWriter.close();
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return fileFromDisk;
    }

    @JvmOverloads
    public final void addFormMessageAsync(@NotNull SalesIQChat chat, @NotNull Form.Message message) {
        Intrinsics.checkNotNullParameter(chat, "chat");
        Intrinsics.checkNotNullParameter(message, "message");
        addFormMessageAsync$default(this, chat, message, false, null, 12, null);
    }

    public final void addInlineFormMessageAsync(@NotNull SalesIQChat chat) {
        Intrinsics.checkNotNullParameter(chat, "chat");
        AbstractC1459k.d(getAppScope(), null, null, new C3892g(chat, null), 3, null);
    }

    @Nullable
    public final Object addMessage(@NotNull Message message, boolean z10, @NotNull Continuation<? super Unit> continuation) {
        if (!i.g(this.currentEditMessage.getValue())) {
            return Unit.INSTANCE;
        }
        Object a10 = getSyncMessage().a(i.e(this.replyMessageUId.getValue()) ? Message.copy$default(message, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, getMessage((String) this.replyMessageUId.getValue()), null, null, null, null, false, false, false, false, false, null, Integer.MAX_VALUE, 1023, null) : message, z10, continuation);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }

    @JvmOverloads
    public final void addMessageAsync(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        addMessageAsync$default(this, message, false, null, 6, null);
    }

    public final void addMessageBlocking(@NotNull Message message, boolean addPreviousMessageTime) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i.g(this.currentEditMessage.getValue())) {
            AbstractC1457j.b(null, new C3896i(message, addPreviousMessageTime, null), 1, null);
        }
    }

    public final void cancelMessageTransfer(@NotNull String chatId, @NotNull String messageId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new C3908o(chatId, messageId, null), 3, null);
    }

    public final void deleteFeedbackCardsIfExpired(@NotNull String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        AbstractC1459k.d(getAppScope(), null, null, new C3918t(chatId, null), 3, null);
    }

    public final void deleteMessage(@NotNull String chatId, @NotNull String messageId, boolean includeChainedMessages) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new C3924w(chatId, messageId, includeChainedMessages, null), 3, null);
    }

    public final void deleteMessageFromRemote(@NotNull String conversationId, @NotNull String messageUId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(messageUId, "messageUId");
        AbstractC1459k.d(getAppScope(), null, null, new C3928y(conversationId, messageUId, null), 3, null);
    }

    @Nullable
    public final Object endChatTimer(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object b10 = o.b(getUpdateConversation(), str, null, Boxing.boxLong(0L), Boxing.boxLong(0L), null, continuation, 16, null);
        return b10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b10 : Unit.INSTANCE;
    }

    @Nullable
    public final String getAcknowledgementKey() {
        return this.acknowledgementKey;
    }

    @NotNull
    public final EnumC4544a getAppStatus(@Nullable Channel.Department department) {
        if (department != null) {
            EnumC4544a enumC4544a = Intrinsics.areEqual(department.isOnline(), Boolean.TRUE) ? EnumC4544a.Online : EnumC4544a.Offline;
            if (enumC4544a != null) {
                return enumC4544a;
            }
        }
        return Ye.d.f(De.a.AppChatStatus, false, 2, null) ? EnumC4544a.Online : EnumC4544a.Offline;
    }

    @Nullable
    public final String getChatId() {
        return this.chatId;
    }

    @NotNull
    public final kotlinx.coroutines.flow.y getCurrentEditMessage() {
        return this.currentEditMessage;
    }

    @Nullable
    public final Form getCurrentForm(@Nullable String departmentId) {
        return (Form) getGetFormUseCase().a(getAppStatus(departmentId)).b();
    }

    @Nullable
    public final Form.Message getCurrentFormMessage() {
        return (Form.Message) getGetCurrentFormMessageUseCase().a().b();
    }

    public final boolean getDismissEditReplyLayoutInNextUpdate() {
        return this.dismissEditReplyLayoutInNextUpdate;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFirstMessage(@Nullable String str, @NotNull String str2, @NotNull Continuation<? super Message> continuation) {
        A a10;
        int i10;
        if (continuation instanceof A) {
            a10 = (A) continuation;
            int i11 = a10.f43749p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a10.f43749p = i11 - Integer.MIN_VALUE;
                Object obj = a10.f43747n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = a10.f43749p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    j getMessageUseCase = getGetMessageUseCase();
                    Message.e eVar = Message.e.Top;
                    a10.f43749p = 1;
                    obj = getMessageUseCase.a(str, str2, eVar, a10);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((C5582a) obj).b();
            }
        }
        a10 = new A(continuation);
        Object obj2 = a10.f43747n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = a10.f43749p;
        if (i10 != 0) {
        }
        return ((C5582a) obj2).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getLastMessage(@Nullable String str, @NotNull String str2, @NotNull Continuation<? super Message> continuation) {
        E e10;
        int i10;
        if (continuation instanceof E) {
            e10 = (E) continuation;
            int i11 = e10.f43775p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                e10.f43775p = i11 - Integer.MIN_VALUE;
                Object obj = e10.f43773n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = e10.f43775p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    j getMessageUseCase = getGetMessageUseCase();
                    Message.e eVar = Message.e.Bottom;
                    e10.f43775p = 1;
                    obj = getMessageUseCase.a(str, str2, eVar, e10);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((C5582a) obj).b();
            }
        }
        e10 = new E(continuation);
        Object obj2 = e10.f43773n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = e10.f43775p;
        if (i10 != 0) {
        }
        return ((C5582a) obj2).b();
    }

    public final void getLastOperatorMessage() {
        AbstractC1459k.d(androidx.lifecycle.S.a(this), C1452g0.b(), null, new F(null), 2, null);
    }

    @Nullable
    public final Message getMessage(@Nullable String messageUId) {
        List list = (List) getMessagesStateFlow().getValue();
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Message message = (Message) next;
            if (Intrinsics.areEqual(message != null ? message.getUniqueID() : null, messageUId)) {
                obj = next;
                break;
            }
        }
        return (Message) obj;
    }

    @NotNull
    public final kotlinx.coroutines.flow.L getMessageDataTransferProgressStateFlow() {
        return (kotlinx.coroutines.flow.L) this.messageDataTransferProgressStateFlow.getValue();
    }

    public final int getMessagePositionById(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        List list = (List) getMessagesStateFlow().getValue();
        Integer num = null;
        if (list != null) {
            Iterator it = list.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                Message message = (Message) it.next();
                if (Intrinsics.areEqual(message != null ? message.getId() : null, id2)) {
                    break;
                }
                i10++;
            }
            num = Integer.valueOf(i10);
        }
        return i.l(num, -1);
    }

    public final int getMessagePositionUID(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        List list = (List) getMessagesStateFlow().getValue();
        Integer num = null;
        if (list != null) {
            Iterator it = list.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                Message message = (Message) it.next();
                if (Intrinsics.areEqual(message != null ? message.getUniqueID() : null, id2)) {
                    break;
                }
                i10++;
            }
            num = Integer.valueOf(i10);
        }
        return i.l(num, -1);
    }

    @NotNull
    public final kotlinx.coroutines.flow.L getMessagesStateFlow() {
        return (kotlinx.coroutines.flow.L) this.messagesStateFlow.getValue();
    }

    @NotNull
    public final kotlinx.coroutines.flow.L getMessagesSyncDataStateFlow() {
        return (kotlinx.coroutines.flow.L) this.messagesSyncDataStateFlow.getValue();
    }

    @NotNull
    public final kotlinx.coroutines.flow.y getOriginalMessageContent() {
        return this.originalMessageContent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getQuestion(@NotNull String str, @NotNull Continuation<? super Message> continuation) {
        J j10;
        int i10;
        InterfaceC5321f interfaceC5321f;
        if (continuation instanceof J) {
            j10 = (J) continuation;
            int i11 = j10.f43819p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j10.f43819p = i11 - Integer.MIN_VALUE;
                Object obj = j10.f43817n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = j10.f43819p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    k getMessagesUseCase = getGetMessagesUseCase();
                    Message.g gVar = Message.g.Question;
                    j10.f43819p = 1;
                    obj = getMessagesUseCase.a(null, str, gVar, j10);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        List list = (List) obj;
                        if (list != null) {
                            return (Message) CollectionsKt.firstOrNull(list);
                        }
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                interfaceC5321f = (InterfaceC5321f) ((C5582a) obj).b();
                if (interfaceC5321f != null) {
                    j10.f43819p = 2;
                    obj = AbstractC5323h.t(interfaceC5321f, j10);
                }
                return null;
            }
        }
        j10 = new J(continuation);
        Object obj2 = j10.f43817n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = j10.f43819p;
        if (i10 != 0) {
        }
        interfaceC5321f = (InterfaceC5321f) ((C5582a) obj2).b();
        if (interfaceC5321f != null) {
        }
        return null;
    }

    @Nullable
    public final Message getQuestionBlocking(@NotNull String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return (Message) AbstractC1455i.e(C1452g0.b(), new K(chatId, null));
    }

    @NotNull
    public final kotlinx.coroutines.flow.y getReplyMessageUId() {
        return this.replyMessageUId;
    }

    @NotNull
    public final String getStatusMessage(@Nullable String chatId, @NotNull f.a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        f getFlowMessage = getGetFlowMessage();
        if (chatId == null) {
            chatId = this.chatId;
        }
        if (chatId == null) {
            chatId = "";
        }
        String str = (String) getFlowMessage.a(chatId, type).b();
        return str == null ? "" : str;
    }

    @NotNull
    public final kotlinx.coroutines.flow.C getUiEvents() {
        return this.uiEvents;
    }

    @Nullable
    public final Object initiateTriggerApi(@NotNull Rf.a aVar, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z10, boolean z11, boolean z12, boolean z13, @NotNull Continuation<? super C5582a> continuation) {
        return (UTSUtil.isTrackingEnabled() && (str4 == null || str4.length() == 0)) ? initiateVTSTriggerApi(str, z10, str4, z13, continuation) : initiateTrigger(aVar, str, str2, str3, z10, str4, z11, z12, z13, continuation);
    }

    public final void invokeStartChatCallbackAsync(@NotNull String acknowledgementKey) {
        Intrinsics.checkNotNullParameter(acknowledgementKey, "acknowledgementKey");
        AbstractC1459k.d(getAppScope(), null, null, new S(acknowledgementKey, null), 3, null);
    }

    public final boolean isActionEnabled(@NotNull EnumC6745a messageAction) {
        Intrinsics.checkNotNullParameter(messageAction, "messageAction");
        return i.i((Boolean) getMessageActionUseCases().a(messageAction).b());
    }

    public final boolean isAllFormMessagesReceived(@Nullable String departmentId) {
        EnumC4544a appStatus = getAppStatus(departmentId);
        Form form = (Form) getGetFormUseCase().a(appStatus).b();
        return (C6822a.C(appStatus) && form == null && getCurrentFormMessage() == null) || Form.INSTANCE.b(form, this.acknowledgementKey) || Form.Message.INSTANCE.b(getCurrentFormMessage(), this.acknowledgementKey);
    }

    public final boolean isAllFormMessagesReceivedForTrigger(@Nullable String departmentId) {
        EnumC4544a appStatus = getAppStatus(departmentId);
        Form form = (Form) getGetFormUseCase().a(appStatus).b();
        return (C6822a.C(appStatus) && form == null && getCurrentFormMessage() == null) || Form.INSTANCE.c(form, true, this.acknowledgementKey) || Form.Message.INSTANCE.b(getCurrentFormMessage(), this.acknowledgementKey);
    }

    @Nullable
    /* renamed from: isChatOpeningApiInProgress, reason: from getter */
    public final Boolean getIsChatOpeningApiInProgress() {
        return this.isChatOpeningApiInProgress;
    }

    /* renamed from: isInitialTranscriptCallCompleted, reason: from getter */
    public final boolean getIsInitialTranscriptCallCompleted() {
        return this.isInitialTranscriptCallCompleted;
    }

    /* renamed from: isMessagesReceivedAfterFirstApi, reason: from getter */
    public final boolean getIsMessagesReceivedAfterFirstApi() {
        return this.isMessagesReceivedAfterFirstApi;
    }

    public final void isMultipleChatRestrictedAsync() {
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new V(null), 3, null);
    }

    public final void join(@NotNull String chatId, @NotNull String conversationId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        AbstractC1459k.d(getAppScope(), null, null, new W(chatId, conversationId, null), 3, null);
    }

    public final void leaveAsMissedConversation(@NotNull String chatId, @NotNull String acknowledgementKey, @NotNull String departmentId, @NotNull String message, @Nullable String pageTitle) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(acknowledgementKey, "acknowledgementKey");
        Intrinsics.checkNotNullParameter(departmentId, "departmentId");
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC1459k.d(getAppScope(), null, null, new Z(chatId, acknowledgementKey, departmentId, message, pageTitle, null), 3, null);
    }

    public final void loadDraftIntoConversationAsync() {
        AbstractC1459k.d(getAppScope(), null, null, new C3883b0(null), 3, null);
    }

    public final void logDebugInfo(@NotNull ie.b debugInfoData) {
        Intrinsics.checkNotNullParameter(debugInfoData, "debugInfoData");
        AbstractC1459k.d(getAppScope(), null, null, new C3891f0(debugInfoData, null), 3, null);
    }

    public final void mailTranscript(@Nullable String conversationId) {
        if (conversationId == null) {
            return;
        }
        MobilistenUtil.z(t.f60890K2, 0, 2, null);
        AbstractC1459k.d(getAppScope(), null, null, new C3893g0(conversationId, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readMessage(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        C3909o0 c3909o0;
        int i10;
        ChatViewModel chatViewModel;
        if (continuation instanceof C3909o0) {
            c3909o0 = (C3909o0) continuation;
            int i11 = c3909o0.f44057r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3909o0.f44057r = i11 - Integer.MIN_VALUE;
                Object obj = c3909o0.f44055p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3909o0.f44057r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.currentOnGoingReadMessageIds.contains(str2)) {
                        this.currentOnGoingReadMessageIds.add(str2);
                        yf.o readMessage = getReadMessage();
                        c3909o0.f44053n = this;
                        c3909o0.f44054o = str2;
                        c3909o0.f44057r = 1;
                        obj = readMessage.a(str, str2, c3909o0);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatViewModel = this;
                    }
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) c3909o0.f44054o;
                chatViewModel = (ChatViewModel) c3909o0.f44053n;
                ResultKt.throwOnFailure(obj);
                chatViewModel.currentOnGoingReadMessageIds.remove(str2);
                return Unit.INSTANCE;
            }
        }
        c3909o0 = new C3909o0(continuation);
        Object obj2 = c3909o0.f44055p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3909o0.f44057r;
        if (i10 != 0) {
        }
        chatViewModel.currentOnGoingReadMessageIds.remove(str2);
        return Unit.INSTANCE;
    }

    public final void reopenConversation(@Nullable String message, @Nullable String visitorId, @Nullable String questionId, @Nullable String chatId, @NotNull EnumC3880a source) {
        Intrinsics.checkNotNullParameter(source, "source");
        new s(message, visitorId, questionId, chatId, new C3915r0(source)).a();
    }

    public final void resendContextMessage(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC1459k.d(getAppScope(), null, null, new C3917s0(message, null), 3, null);
    }

    public final void resetMessageActionState() {
        this.currentEditMessage.setValue(null);
        this.replyMessageUId.setValue(null);
    }

    public final void retrySendingMessage(@NotNull Message message) {
        Ph.C0 d10;
        List<String> chainedMessageIds;
        Intrinsics.checkNotNullParameter(message, "message");
        d10 = AbstractC1459k.d(getAppScope(), null, null, new C3921u0(message, null), 3, null);
        if (!message.isChainedMessage()) {
            HashMap uploadJobs = com.zoho.livechat.android.utils.Q.f44444C;
            Intrinsics.checkNotNullExpressionValue(uploadJobs, "uploadJobs");
            uploadJobs.put(this.chatId + '_' + message.getId(), d10);
            return;
        }
        Message.Extras extras = message.getExtras();
        if (extras == null || (chainedMessageIds = extras.getChainedMessageIds()) == null) {
            return;
        }
        for (String str : chainedMessageIds) {
            HashMap uploadJobs2 = com.zoho.livechat.android.utils.Q.f44444C;
            Intrinsics.checkNotNullExpressionValue(uploadJobs2, "uploadJobs");
            uploadJobs2.put(message.getChatId() + '_' + str, d10);
        }
    }

    public final void saveDraft(@Nullable String message) {
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new C3925w0(message, null), 3, null);
    }

    public final void sendAllAsSingleMessage(@Nullable String acknowledgementKey, @NotNull String chatId, @NotNull String visitorId, @NotNull List<Message> messages) {
        Ph.C0 d10;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(visitorId, "visitorId");
        Intrinsics.checkNotNullParameter(messages, "messages");
        d10 = AbstractC1459k.d(getAppScope(), null, null, new C3929y0(acknowledgementKey, chatId, visitorId, messages, null), 3, null);
        for (Message message : messages) {
            HashMap uploadJobs = com.zoho.livechat.android.utils.Q.f44444C;
            Intrinsics.checkNotNullExpressionValue(uploadJobs, "uploadJobs");
            uploadJobs.put(chatId + '_' + message.getId(), d10);
        }
    }

    public final void sendContextMessage(@NotNull String chatId, @Nullable String text, @NotNull Message.g messageType) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        AbstractC1459k.d(getAppScope(), null, null, new B0(chatId, text, messageType, null), 3, null);
    }

    public final void sendLog(@NotNull String encryptedConversationId, @Nullable String acknowledgementKey, @NotNull String chatId, @NotNull ArrayList<String> logs) {
        Intrinsics.checkNotNullParameter(encryptedConversationId, "encryptedConversationId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(logs, "logs");
        AbstractC1459k.d(androidx.lifecycle.S.a(this), C1452g0.b(), null, new C0(logs, this, acknowledgementKey, chatId, encryptedConversationId, null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void sendMessage(@Nullable String acknowledgementKey, @NotNull String chatId, @NotNull String visitorId, @Nullable String message, @NotNull Message.g messageType, @NotNull String clientMessageId, @Nullable Message.Attachment attachment, @Nullable Message.Extras extras, @Nullable Message.RespondedMessage respondedMessage, @Nullable File file, boolean forceStopSending) {
        ChatViewModel chatViewModel;
        Ph.C0 d10;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(visitorId, "visitorId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(clientMessageId, "clientMessageId");
        if (forceStopSending) {
            chatViewModel = this;
        } else {
            String str = (String) this.replyMessageUId.getValue();
            Message message2 = (Message) this.currentEditMessage.getValue();
            Ph.P appScope = getAppScope();
            E0 e02 = new E0(acknowledgementKey, chatId, visitorId, clientMessageId, str, message2, message, messageType, attachment, extras, respondedMessage, file, null);
            chatViewModel = this;
            d10 = AbstractC1459k.d(appScope, null, null, e02, 3, null);
            if ((file == 0 ? attachment : file) != null) {
            }
        }
        if (chatViewModel.replyMessageUId.getValue() != null && !chatViewModel.dismissEditReplyLayoutInNextUpdate) {
            chatViewModel.replyMessageUId.setValue(null);
        }
        chatViewModel.currentEditMessage.setValue(null);
    }

    public final void sendPreChatFormQuestionAsync(@Nullable SalesIQChat salesIQChat, @NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC1459k.d(getAppScope(), null, null, new H0(salesIQChat, message, null), 3, null);
    }

    public final void setAcknowledgementKey(@Nullable String str) {
        this.acknowledgementKey = str;
    }

    public final void setAndRefreshCurrentConversationData(@Nullable String acknowledgementKey, @NotNull String chatId) {
        boolean z10;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        boolean z11 = true;
        if (!(this.acknowledgementKey == null && i.f(acknowledgementKey)) && Intrinsics.areEqual(acknowledgementKey, this.acknowledgementKey)) {
            z10 = false;
        } else {
            this.acknowledgementKey = acknowledgementKey;
            z10 = true;
        }
        String str = this.chatId;
        if (str == null || !Intrinsics.areEqual(chatId, str)) {
            this.chatId = chatId;
        } else {
            z11 = z10;
        }
        if (z11) {
            syncTopSyncCompletionData();
            refreshMessages(acknowledgementKey, chatId);
            loadMessages(acknowledgementKey, chatId);
            collectMessageDataTransferProgress(chatId);
        }
    }

    public final void setChatId(@Nullable String str) {
        this.chatId = str;
    }

    public final void setChatOpeningApiInProgress(@Nullable Boolean bool) {
        this.isChatOpeningApiInProgress = bool;
    }

    public final void setCurrentEditMessage(@NotNull kotlinx.coroutines.flow.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<set-?>");
        this.currentEditMessage = yVar;
    }

    public final void setDismissEditReplyLayoutInNextUpdate(boolean z10) {
        this.dismissEditReplyLayoutInNextUpdate = z10;
    }

    public final void setInitialTranscriptCallCompleted(boolean z10) {
        this.isInitialTranscriptCallCompleted = z10;
    }

    public final void setMessagesReceivedAfterFirstApi(boolean z10) {
        this.isMessagesReceivedAfterFirstApi = z10;
    }

    public final void setOriginalMessageContent(@NotNull kotlinx.coroutines.flow.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<set-?>");
        this.originalMessageContent = yVar;
    }

    public final void setReplyMessageUId(@NotNull kotlinx.coroutines.flow.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<set-?>");
        this.replyMessageUId = yVar;
    }

    public final void startCall(@NotNull Context context, @NotNull SalesIQChat chat) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(chat, "chat");
        AbstractC1459k.d(getAppScope(), null, null, new I0(chat, context, this, null), 3, null);
    }

    public final void startNewConversation(@NotNull String acknowledgementKey, @NotNull String departmentId, int chatStatus, @Nullable String attenderEmail, @Nullable String attenderId, boolean isBotAttender) {
        Intrinsics.checkNotNullParameter(acknowledgementKey, "acknowledgementKey");
        Intrinsics.checkNotNullParameter(departmentId, "departmentId");
        this.isChatOpeningApiInProgress = Boolean.TRUE;
        AbstractC1459k.d(getAppScope(), null, null, new K0(acknowledgementKey, departmentId, chatStatus, isBotAttender, attenderEmail, attenderId, null), 3, null);
    }

    public final void syncBrandStatus(@Nullable String tag) {
        AbstractC1459k.d(getAppScope(), null, null, new L0(tag, null), 3, null);
    }

    public final void syncMessagesTranscript(@Nullable String acknowledgementKey, @Nullable String conversationId, @NotNull String chatId, @Nullable String rChatId, @Nullable Long fromTime, @Nullable Long toTime, @Nullable String messageUId, boolean isProactiveChat, boolean isInitialCall, @NotNull y.a syncType, @Nullable Function1<? super Boolean, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(syncType, "syncType");
        if (!C6218a.c0() || this.isMessagesApiInProgress) {
            return;
        }
        this.isMessagesApiInProgress = true;
        AbstractC1459k.d(getAppScope(), null, null, new R0(acknowledgementKey, conversationId, chatId, rChatId, messageUId, fromTime, toTime, isProactiveChat, syncType, onComplete, isInitialCall, null), 3, null);
    }

    public final void updateMessageExtras(@NotNull String messageId, @Nullable Message.Extras extras) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new W0(messageId, extras, null), 3, null);
    }

    @Nullable
    public final Object updateMessageStatus(@NotNull String str, @NotNull String str2, @NotNull Message.f fVar, @NotNull Continuation<? super Unit> continuation) {
        Object b10 = getUpdateMessageStatus().b(str, str2, fVar, continuation);
        return b10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b10 : Unit.INSTANCE;
    }

    public final void updateMessageStatusAsync(@NotNull String chatId, @NotNull String messageId, @NotNull Message.f status) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(status, "status");
        AbstractC1459k.d(getAppScope(), null, null, new Y0(chatId, messageId, status, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateUnreadCount(@NotNull String str, @Nullable Integer num, @NotNull Continuation<? super Unit> continuation) {
        a1 a1Var;
        int i10;
        String str2;
        ChatViewModel chatViewModel;
        C5582a c5582a;
        if (continuation instanceof a1) {
            a1Var = (a1) continuation;
            int i11 = a1Var.f43969r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a1Var.f43969r = i11 - Integer.MIN_VALUE;
                a1 a1Var2 = a1Var;
                Object obj = a1Var2.f43967p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = a1Var2.f43969r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    o updateConversation = getUpdateConversation();
                    a1Var2.f43965n = this;
                    a1Var2.f43966o = str;
                    a1Var2.f43969r = 1;
                    str2 = str;
                    obj = o.b(updateConversation, str2, num, null, null, null, a1Var2, 28, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatViewModel = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = (String) a1Var2.f43966o;
                    ChatViewModel chatViewModel2 = (ChatViewModel) a1Var2.f43965n;
                    ResultKt.throwOnFailure(obj);
                    str2 = str3;
                    chatViewModel = chatViewModel2;
                }
                c5582a = (C5582a) obj;
                if (c5582a.d()) {
                    sendRefreshBroadCast$default(chatViewModel, str2, null, false, 6, null);
                }
                return Unit.INSTANCE;
            }
        }
        a1Var = new a1(continuation);
        a1 a1Var22 = a1Var;
        Object obj2 = a1Var22.f43967p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = a1Var22.f43969r;
        if (i10 != 0) {
        }
        c5582a = (C5582a) obj2;
        if (c5582a.d()) {
        }
        return Unit.INSTANCE;
    }

    @JvmOverloads
    public final void addFormMessageAsync(@NotNull SalesIQChat chat, @NotNull Form.Message message, boolean z10) {
        Intrinsics.checkNotNullParameter(chat, "chat");
        Intrinsics.checkNotNullParameter(message, "message");
        addFormMessageAsync$default(this, chat, message, z10, null, 8, null);
    }

    @JvmOverloads
    public final void addMessageAsync(@NotNull Message message, boolean z10) {
        Intrinsics.checkNotNullParameter(message, "message");
        addMessageAsync$default(this, message, z10, null, 4, null);
    }

    public final void deleteMessage(@NotNull String chatId, @NotNull Message.g messageType) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new C3926x(chatId, messageType, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isFeedbackExpired(@NotNull Continuation<? super Boolean> continuation) {
        U u10;
        int i10;
        String str;
        Function2 function2;
        if (continuation instanceof U) {
            u10 = (U) continuation;
            int i11 = u10.f43923q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                u10.f43923q = i11 - Integer.MIN_VALUE;
                Object obj = u10.f43921o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = u10.f43923q;
                Boolean bool = null;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String str2 = this.chatId;
                    if (str2 != null) {
                        C6890g isFeedbackExpired = isFeedbackExpired();
                        u10.f43920n = str2;
                        u10.f43923q = 1;
                        Object a10 = isFeedbackExpired.a(u10);
                        if (a10 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = str2;
                        obj = a10;
                    }
                    return Boxing.boxBoolean(i.i(bool));
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) u10.f43920n;
                ResultKt.throwOnFailure(obj);
                function2 = (Function2) ((C5582a) obj).b();
                if (function2 != null) {
                    bool = (Boolean) function2.invoke(Boxing.boxBoolean(true), str);
                }
                return Boxing.boxBoolean(i.i(bool));
            }
        }
        u10 = new U(continuation);
        Object obj2 = u10.f43921o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = u10.f43923q;
        Boolean bool2 = null;
        if (i10 != 0) {
        }
        function2 = (Function2) ((C5582a) obj2).b();
        if (function2 != null) {
        }
        return Boxing.boxBoolean(i.i(bool2));
    }

    @JvmOverloads
    public final void addFormMessageAsync(@NotNull SalesIQChat chat, @NotNull Form.Message message, boolean dismissEditReplyLayoutInNextUpdate, @NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(chat, "chat");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new C3890f(chat, message, dismissEditReplyLayoutInNextUpdate, onComplete, null), 3, null);
    }

    @JvmOverloads
    public final void addMessageAsync(@NotNull Message message, boolean dismissEditReplyLayoutInNextUpdate, @Nullable String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        String str = (String) this.replyMessageUId.getValue();
        if (str != null && !dismissEditReplyLayoutInNextUpdate) {
            this.dismissEditReplyLayoutInNextUpdate = false;
        }
        if (i.g(this.currentEditMessage.getValue())) {
            AbstractC1459k.d(androidx.lifecycle.S.a(this), C1452g0.b(), null, new C3894h(message, str, dismissEditReplyLayoutInNextUpdate, tag, null), 2, null);
        }
    }

    @NotNull
    public final EnumC4544a getAppStatus(@Nullable String departmentId) {
        return getAppStatus(AbstractC3945n.e(departmentId));
    }
}
