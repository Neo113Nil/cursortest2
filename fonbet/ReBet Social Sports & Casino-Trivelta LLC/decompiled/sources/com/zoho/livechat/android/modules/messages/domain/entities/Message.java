package com.zoho.livechat.android.modules.messages.domain.entities;

import android.text.Spannable;
import android.text.TextUtils;
import android.util.Patterns;
import androidx.annotation.Keep;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.reflect.TypeToken;
import com.twilio.voice.EventGroupType;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.utils.C3941j;
import io.agora.rtc2.internal.AudioRoutingController;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import og.AbstractC5891c;
import og.AbstractC5896h;
import og.i;
import og.j;
import og.m;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0003\b\u009b\u0001\b\u0087\b\u0018\u0000 ½\u00012\u00020\u0001:\u001a¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001Ç\u0001È\u0001É\u0001Ê\u0001BÝ\u0003\b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\u0010\u0012\b\b\u0002\u0010,\u001a\u00020\u0010\u0012\b\b\u0002\u0010-\u001a\u00020\u0010\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0000\u0012\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00105\u001a\u00020\u001f\u0012\b\b\u0002\u00106\u001a\u00020\u001f\u0012\b\b\u0002\u00107\u001a\u00020\u001f\u0012\b\b\u0002\u00108\u001a\u00020\u001f\u0012\b\b\u0002\u00109\u001a\u00020\u001f\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u001f¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u001f¢\u0006\u0004\b?\u0010>J\r\u0010@\u001a\u00020\u001f¢\u0006\u0004\b@\u0010>J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010BJ\u0010\u0010D\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bD\u0010BJ\u0010\u0010E\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bI\u0010BJ\u0010\u0010J\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010BJ\u0012\u0010K\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u0010BJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u0010BJ\u0010\u0010O\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bQ\u0010PJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u0010BJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u0010BJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bX\u0010BJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0012\u0010]\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\b_\u0010>J\u0012\u0010`\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0012\u0010b\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bb\u0010aJ\u0012\u0010c\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bc\u0010aJ\u0012\u0010d\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bd\u0010aJ\u0012\u0010e\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0012\u0010g\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0012\u0010i\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bi\u0010jJ\u0010\u0010k\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bk\u0010PJ\u0010\u0010l\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bl\u0010PJ\u0010\u0010m\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bm\u0010PJ\u0012\u0010n\u001a\u0004\u0018\u00010\u0000HÆ\u0003¢\u0006\u0004\bn\u0010oJ\u0018\u0010p\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/HÆ\u0003¢\u0006\u0004\bp\u0010qJ\u0012\u0010r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\br\u0010BJ\u0012\u0010s\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bs\u0010WJ\u0012\u0010t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bt\u0010BJ\u0010\u0010u\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bu\u0010>J\u0010\u0010v\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bv\u0010>J\u0010\u0010w\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bw\u0010>J\u0010\u0010x\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bx\u0010>J\u0010\u0010y\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\by\u0010>J\u0012\u0010z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bz\u0010BJî\u0003\u0010{\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010+\u001a\u00020\u00102\b\b\u0002\u0010,\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00102\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00105\u001a\u00020\u001f2\b\b\u0002\u00106\u001a\u00020\u001f2\b\b\u0002\u00107\u001a\u00020\u001f2\b\b\u0002\u00108\u001a\u00020\u001f2\b\b\u0002\u00109\u001a\u00020\u001f2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b{\u0010|J\u0010\u0010}\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b}\u0010BJ\u0010\u0010~\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b~\u0010\u007fJ\u001e\u0010\u0081\u0001\u001a\u00020\u001f2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0003\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010BR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0004\u0010\u0083\u0001\u001a\u0005\b\u0085\u0001\u0010BR\u001c\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010\u0083\u0001\u001a\u0005\b\u0086\u0001\u0010BR\u001c\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010FR&\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b\t\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010H\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001c\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\n\u0010\u0083\u0001\u001a\u0005\b\u008d\u0001\u0010BR\u001c\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010\u0083\u0001\u001a\u0005\b\u008e\u0001\u0010BR\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\r\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010LR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010\u0083\u0001\u001a\u0005\b\u0091\u0001\u0010BR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010\u0083\u0001\u001a\u0005\b\u0092\u0001\u0010BR\u001c\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010PR\u001c\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010\u0093\u0001\u001a\u0005\b\u0095\u0001\u0010PR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010\u0083\u0001\u001a\u0005\b\u0096\u0001\u0010BR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010\u0083\u0001\u001a\u0005\b\u0097\u0001\u0010BR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u0010UR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010\u009a\u0001\u001a\u0005\b\u009b\u0001\u0010WR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010\u0083\u0001\u001a\u0005\b\u009c\u0001\u0010BR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010ZR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010\\R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010^R\u001b\u0010 \u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b \u0010£\u0001\u001a\u0004\b \u0010>R\u001d\u0010!\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b!\u0010¤\u0001\u001a\u0004\b!\u0010aR\u001d\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\"\u0010¤\u0001\u001a\u0004\b\"\u0010aR\u001d\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b#\u0010¤\u0001\u001a\u0004\b#\u0010aR\u001d\u0010$\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b$\u0010¤\u0001\u001a\u0004\b$\u0010aR\u001e\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010¥\u0001\u001a\u0005\b¦\u0001\u0010fR\u001e\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010§\u0001\u001a\u0005\b¨\u0001\u0010hR\u001e\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010©\u0001\u001a\u0005\bª\u0001\u0010jR\u001c\u0010+\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b+\u0010\u0093\u0001\u001a\u0005\b«\u0001\u0010PR\u001c\u0010,\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010\u0093\u0001\u001a\u0005\b¬\u0001\u0010PR\u001c\u0010-\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b-\u0010\u0093\u0001\u001a\u0005\b\u00ad\u0001\u0010PR\u001e\u0010.\u001a\u0004\u0018\u00010\u00008\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b.\u0010®\u0001\u001a\u0005\b¯\u0001\u0010oR$\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b1\u0010°\u0001\u001a\u0005\b±\u0001\u0010qR\u001b\u00102\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b2\u0010\u0083\u0001\u001a\u0005\b²\u0001\u0010BR\u001b\u00103\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u000e\n\u0005\b3\u0010\u009a\u0001\u001a\u0005\b³\u0001\u0010WR\u001b\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b4\u0010\u0083\u0001\u001a\u0005\b´\u0001\u0010BR\u0018\u00105\u001a\u00020\u001f8\u0006¢\u0006\r\n\u0005\b5\u0010£\u0001\u001a\u0004\b5\u0010>R\u0018\u00106\u001a\u00020\u001f8\u0006¢\u0006\r\n\u0005\b6\u0010£\u0001\u001a\u0004\b6\u0010>R\u0018\u00107\u001a\u00020\u001f8\u0006¢\u0006\r\n\u0005\b7\u0010£\u0001\u001a\u0004\b7\u0010>R\u0019\u00108\u001a\u00020\u001f8\u0006¢\u0006\u000e\n\u0005\b8\u0010£\u0001\u001a\u0005\bµ\u0001\u0010>R\u0019\u00109\u001a\u00020\u001f8\u0006¢\u0006\u000e\n\u0005\b9\u0010£\u0001\u001a\u0005\b¶\u0001\u0010>R(\u0010:\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b:\u0010\u0083\u0001\u001a\u0005\b·\u0001\u0010B\"\u0006\b¸\u0001\u0010¹\u0001R\u0013\u0010»\u0001\u001a\u00020\u001f8F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010>R\u0013\u0010¼\u0001\u001a\u00020\u001f8F¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010>¨\u0006Ë\u0001"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;", "", "", "acknowledgementKey", "conversationId", "chatId", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;", "messageType", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$f;", "status", StackTraceHelper.ID_KEY, "uniqueID", "", "messageStringResourceId", "content", "comment", "", "serverTime", "clientTime", "sender", "senderName", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$b;", "displayName", "sequenceId", "rChatId", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment;", "attachment", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta;", "meta", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$RespondedMessage;", "respondedMessage", "", "isBot", "isRead", "isTyping", "isEdited", "isDeleted", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$d;", "mode", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage;", "infoMessage", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Extras;", "extras", "editedTime", "deletedTime", "previousMessageTime", "replyTo", "", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$c;", "markdowns", "rawContent", "consecutiveDeletedCount", "timeDifferenceContent", "isFirstMessage", "isLastMessage", "isRightAligned", "canShowSenderAvatar", "canShowSenderName", "formattedClientTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$b;Ljava/lang/Long;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$RespondedMessage;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$d;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Extras;JJJLcom/zoho/livechat/android/modules/messages/domain/entities/Message;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZZZZZLjava/lang/String;)V", "isInputCard", "()Z", "isUnImplementedCard", "isDepartmentForm", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;", "component5", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$f;", "component6", "component7", "component8", "()Ljava/lang/Integer;", "component9", "component10", "component11", "()J", "component12", "component13", "component14", "component15", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$b;", "component16", "()Ljava/lang/Long;", "component17", "component18", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment;", "component19", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta;", "component20", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$RespondedMessage;", "component21", "component22", "()Ljava/lang/Boolean;", "component23", "component24", "component25", "component26", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$d;", "component27", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage;", "component28", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Extras;", "component29", "component30", "component31", "component32", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;", "component33", "()Ljava/util/List;", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$b;Ljava/lang/Long;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$RespondedMessage;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$d;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Extras;JJJLcom/zoho/livechat/android/modules/messages/domain/entities/Message;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZZZZZLjava/lang/String;)Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAcknowledgementKey", "getConversationId", "getChatId", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;", "getMessageType", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$f;", "getStatus", "setStatus", "(Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$f;)V", "getId", "getUniqueID", "Ljava/lang/Integer;", "getMessageStringResourceId", "getContent", "getComment", "J", "getServerTime", "getClientTime", "getSender", "getSenderName", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$b;", "getDisplayName", "Ljava/lang/Long;", "getSequenceId", "getRChatId", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment;", "getAttachment", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta;", "getMeta", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$RespondedMessage;", "getRespondedMessage", "Z", "Ljava/lang/Boolean;", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$d;", "getMode", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage;", "getInfoMessage", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Extras;", "getExtras", "getEditedTime", "getDeletedTime", "getPreviousMessageTime", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;", "getReplyTo", "Ljava/util/List;", "getMarkdowns", "getRawContent", "getConsecutiveDeletedCount", "getTimeDifferenceContent", "getCanShowSenderAvatar", "getCanShowSenderName", "getFormattedClientTime", "setFormattedClientTime", "(Ljava/lang/String;)V", "getHasComment", "hasComment", "isChainedMessage", "Companion", "Attachment", "a", com.google.crypto.tink.integration.android.b.f37029b, "Extras", "InfoMessage", "c", "Meta", W9.d.f13160a, com.bumptech.glide.gifdecoder.e.f29601m, "RespondedMessage", "f", "g", "User", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Message {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Gb.c("acknowledgement_key")
    @Nullable
    private final String acknowledgementKey;

    @Gb.c("attachment")
    @Nullable
    private final Attachment attachment;
    private final boolean canShowSenderAvatar;
    private final boolean canShowSenderName;

    @Gb.c("chat_id")
    @NotNull
    private final String chatId;

    @Gb.c("client_time")
    private final long clientTime;

    @Gb.c("comment")
    @Nullable
    private final String comment;

    @Nullable
    private final Long consecutiveDeletedCount;

    @Gb.c("message")
    @Nullable
    private final String content;

    @Gb.c("conversation_id")
    @Nullable
    private final String conversationId;

    @Gb.c("deleted_time")
    private final long deletedTime;

    @Gb.c("display_name")
    @Nullable
    private final b displayName;

    @Gb.c("edited_time")
    private final long editedTime;

    @Gb.c("extras")
    @Nullable
    private final Extras extras;

    @Nullable
    private String formattedClientTime;

    @Gb.c("message_id")
    @NotNull
    private final String id;

    @Gb.c("info_message")
    @Nullable
    private final InfoMessage infoMessage;

    @Gb.c("is_bot")
    private final boolean isBot;

    @Gb.c("is_deleted")
    @Nullable
    private final Boolean isDeleted;

    @Gb.c("is_edited")
    @Nullable
    private final Boolean isEdited;
    private final boolean isFirstMessage;
    private final boolean isLastMessage;

    @Gb.c("read_status")
    @Nullable
    private final Boolean isRead;
    private final boolean isRightAligned;

    @Gb.c("is_typing")
    @Nullable
    private final Boolean isTyping;

    @Gb.c("markdowns")
    @Nullable
    private final List<c> markdowns;

    @Gb.c("message_string_resource_id")
    @Nullable
    private final Integer messageStringResourceId;

    @Gb.c("message_type")
    @NotNull
    private final g messageType;

    @Gb.c("meta")
    @Nullable
    private final Meta meta;

    @Gb.c("mode")
    @Nullable
    private final d mode;

    @Gb.c("previous_message_time")
    private final long previousMessageTime;

    @Gb.c("r_chat_id")
    @Nullable
    private final String rChatId;

    @Nullable
    private final String rawContent;

    @Gb.c("reply_to")
    @Nullable
    private final Message replyTo;

    @Gb.c("responded_message")
    @Nullable
    private final RespondedMessage respondedMessage;

    @Gb.c("sender")
    @Nullable
    private final String sender;

    @Gb.c("sender_name")
    @Nullable
    private final String senderName;

    @Gb.c("sequence_id")
    @Nullable
    private final Long sequenceId;

    @Gb.c("server_time")
    private final long serverTime;

    @Gb.c("status")
    @NotNull
    private f status;

    @Nullable
    private final String timeDifferenceContent;

    @Gb.c("message_uid")
    @NotNull
    private final String uniqueID;

    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\bT\b\u0087\b\u0018\u00002\u00020\u0001:\u0002rsB±\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010&J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010&J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010&J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010&J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010&J\u0010\u0010/\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010&J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010&J\u0012\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b9\u00108J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010&J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010&J\u0012\u0010<\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b@\u0010?J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010&J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010&J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010&J\u0012\u0010D\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bF\u0010?Jº\u0002\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bI\u0010&J\u0010\u0010J\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\bJ\u0010KJ\u001a\u0010M\u001a\u00020 2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bM\u0010NR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010O\u001a\u0004\bQ\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010R\u001a\u0004\bS\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010O\u001a\u0004\bT\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010O\u001a\u0004\bU\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010O\u001a\u0004\bV\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010O\u001a\u0004\bW\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010O\u001a\u0004\bX\u0010&R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010Y\u001a\u0004\bZ\u00100R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010O\u001a\u0004\b[\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\b\\\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010]\u001a\u0004\b^\u00104R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010_\u001a\u0004\b`\u00106R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010a\u001a\u0004\bb\u00108R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010a\u001a\u0004\bc\u00108R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010O\u001a\u0004\bd\u0010&R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010O\u001a\u0004\be\u0010&R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010f\u001a\u0004\bg\u0010=R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010h\u001a\u0004\bi\u0010?R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010h\u001a\u0004\bj\u0010?R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010O\u001a\u0004\bk\u0010&R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010O\u001a\u0004\bl\u0010&R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010O\u001a\u0004\bm\u0010&R\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010n\u001a\u0004\b!\u0010ER$\u0010\"\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010h\u001a\u0004\bo\u0010?\"\u0004\bp\u0010q¨\u0006t"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment;", "", "", "mode", "chatId", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment$a;", "attachmentType", "fileId", StackTraceHelper.ID_KEY, "attachmentId", "content", "blurImage", "", "size", "fileName", EventKeys.URL, "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment$Dimension;", "dimensions", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;", "operationUser", "Lcom/google/gson/k;", "userList", "transferDetails", "hideEmailView", "ratingMessage", "", "rating", "messageTime", "time", "userId", "type", "rejectedUsers", "", "isFeedbackCardExpired", "feedbackTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment$Dimension;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;Lcom/google/gson/k;Lcom/google/gson/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment$a;", "component4", "component5", "component6", "component7", "component8", "component9", "()J", "component10", "component11", "component12", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment$Dimension;", "component13", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;", "component14", "()Lcom/google/gson/k;", "component15", "component16", "component17", "component18", "()Ljava/lang/Integer;", "component19", "()Ljava/lang/Long;", "component20", "component21", "component22", "component23", "component24", "()Ljava/lang/Boolean;", "component25", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment$Dimension;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;Lcom/google/gson/k;Lcom/google/gson/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMode", "getChatId", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment$a;", "getAttachmentType", "getFileId", "getId", "getAttachmentId", "getContent", "getBlurImage", "J", "getSize", "getFileName", "getUrl", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment$Dimension;", "getDimensions", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;", "getOperationUser", "Lcom/google/gson/k;", "getUserList", "getTransferDetails", "getHideEmailView", "getRatingMessage", "Ljava/lang/Integer;", "getRating", "Ljava/lang/Long;", "getMessageTime", "getTime", "getUserId", "getType", "getRejectedUsers", "Ljava/lang/Boolean;", "getFeedbackTime", "setFeedbackTime", "(Ljava/lang/Long;)V", "a", "Dimension", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Attachment {

        @Gb.c("attachment_id")
        @Nullable
        private final String attachmentId;

        @Gb.c("att_type")
        @Nullable
        private final a attachmentType;

        @Gb.c("blur_image")
        @Nullable
        private final String blurImage;

        @Gb.c("chatid")
        @Nullable
        private final String chatId;

        @Gb.c("content")
        @Nullable
        private final String content;

        @Gb.c("dimensions")
        @Nullable
        private final Dimension dimensions;

        @Gb.c("feedback_time")
        @Nullable
        private Long feedbackTime;

        @Gb.c("fileId")
        @Nullable
        private final String fileId;

        @Gb.c("name")
        @Nullable
        private final String fileName;

        @Gb.c("hideemailview")
        @Nullable
        private final String hideEmailView;

        @Gb.c(StackTraceHelper.ID_KEY)
        @Nullable
        private final String id;

        @Gb.c("is_feedback_card_expired")
        @Nullable
        private final Boolean isFeedbackCardExpired;

        @Gb.c("msg_time")
        @Nullable
        private final Long messageTime;

        @Gb.c("mode")
        @Nullable
        private final String mode;

        @Gb.c("operation_user")
        @Nullable
        private final User operationUser;

        @Gb.c("rating")
        @Nullable
        private final Integer rating;

        @Gb.c("ratingmessage")
        @Nullable
        private final String ratingMessage;

        @Gb.c("rejected_users")
        @Nullable
        private final String rejectedUsers;

        @Gb.c("size")
        private final long size;

        @Gb.c("time")
        @Nullable
        private final Long time;

        @Gb.c("transferdetails")
        @Nullable
        private final k transferDetails;

        @Gb.c("type")
        @Nullable
        private final String type;

        @Gb.c(EventKeys.URL)
        @Nullable
        private final String url;

        @Gb.c("userid")
        @Nullable
        private final String userId;

        @Gb.c("user_list")
        @Nullable
        private final k userList;

        @Keep
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment$Dimension;", "", "height", "", "width", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getHeight", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getWidth", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Attachment$Dimension;", "equals", "", "other", "hashCode", "", "toString", "", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Dimension {

            @Gb.c("height")
            @Nullable
            private final Double height;

            @Gb.c("width")
            @Nullable
            private final Double width;

            public Dimension(@Nullable Double d10, @Nullable Double d11) {
                this.height = d10;
                this.width = d11;
            }

            public static /* synthetic */ Dimension copy$default(Dimension dimension, Double d10, Double d11, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    d10 = dimension.height;
                }
                if ((i10 & 2) != 0) {
                    d11 = dimension.width;
                }
                return dimension.copy(d10, d11);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final Double getHeight() {
                return this.height;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final Double getWidth() {
                return this.width;
            }

            @NotNull
            public final Dimension copy(@Nullable Double height, @Nullable Double width) {
                return new Dimension(height, width);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dimension)) {
                    return false;
                }
                Dimension dimension = (Dimension) other;
                return Intrinsics.areEqual((Object) this.height, (Object) dimension.height) && Intrinsics.areEqual((Object) this.width, (Object) dimension.width);
            }

            @Nullable
            public final Double getHeight() {
                return this.height;
            }

            @Nullable
            public final Double getWidth() {
                return this.width;
            }

            public int hashCode() {
                Double d10 = this.height;
                int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
                Double d11 = this.width;
                return hashCode + (d11 != null ? d11.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Dimension(height=" + this.height + ", width=" + this.width + ')';
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;

            @Gb.c("voice_note")
            public static final a VoiceNote = new a("VoiceNote", 0);

            @Gb.c("chat_attachment")
            public static final a ChatAttachment = new a("ChatAttachment", 1);

            private static final /* synthetic */ a[] $values() {
                return new a[]{VoiceNote, ChatAttachment};
            }

            static {
                a[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            private a(String str, int i10) {
            }

            @NotNull
            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        public Attachment() {
            this(null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
        }

        public static /* synthetic */ Attachment copy$default(Attachment attachment, String str, String str2, a aVar, String str3, String str4, String str5, String str6, String str7, long j10, String str8, String str9, Dimension dimension, User user, k kVar, k kVar2, String str10, String str11, Integer num, Long l10, Long l11, String str12, String str13, String str14, Boolean bool, Long l12, int i10, Object obj) {
            Long l13;
            Boolean bool2;
            String str15 = (i10 & 1) != 0 ? attachment.mode : str;
            String str16 = (i10 & 2) != 0 ? attachment.chatId : str2;
            a aVar2 = (i10 & 4) != 0 ? attachment.attachmentType : aVar;
            String str17 = (i10 & 8) != 0 ? attachment.fileId : str3;
            String str18 = (i10 & 16) != 0 ? attachment.id : str4;
            String str19 = (i10 & 32) != 0 ? attachment.attachmentId : str5;
            String str20 = (i10 & 64) != 0 ? attachment.content : str6;
            String str21 = (i10 & 128) != 0 ? attachment.blurImage : str7;
            long j11 = (i10 & 256) != 0 ? attachment.size : j10;
            String str22 = (i10 & 512) != 0 ? attachment.fileName : str8;
            String str23 = (i10 & 1024) != 0 ? attachment.url : str9;
            Dimension dimension2 = (i10 & 2048) != 0 ? attachment.dimensions : dimension;
            User user2 = (i10 & 4096) != 0 ? attachment.operationUser : user;
            String str24 = str15;
            k kVar3 = (i10 & 8192) != 0 ? attachment.userList : kVar;
            k kVar4 = (i10 & 16384) != 0 ? attachment.transferDetails : kVar2;
            String str25 = (i10 & 32768) != 0 ? attachment.hideEmailView : str10;
            String str26 = (i10 & PKIFailureInfo.notAuthorized) != 0 ? attachment.ratingMessage : str11;
            Integer num2 = (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? attachment.rating : num;
            Long l14 = (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? attachment.messageTime : l10;
            Long l15 = (i10 & PKIFailureInfo.signerNotTrusted) != 0 ? attachment.time : l11;
            String str27 = (i10 & PKIFailureInfo.badCertTemplate) != 0 ? attachment.userId : str12;
            String str28 = (i10 & PKIFailureInfo.badSenderNonce) != 0 ? attachment.type : str13;
            String str29 = (i10 & 4194304) != 0 ? attachment.rejectedUsers : str14;
            Boolean bool3 = (i10 & 8388608) != 0 ? attachment.isFeedbackCardExpired : bool;
            if ((i10 & 16777216) != 0) {
                bool2 = bool3;
                l13 = attachment.feedbackTime;
            } else {
                l13 = l12;
                bool2 = bool3;
            }
            return attachment.copy(str24, str16, aVar2, str17, str18, str19, str20, str21, j11, str22, str23, dimension2, user2, kVar3, kVar4, str25, str26, num2, l14, l15, str27, str28, str29, bool2, l13);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMode() {
            return this.mode;
        }

        @Nullable
        /* renamed from: component10, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        @Nullable
        /* renamed from: component11, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        /* renamed from: component12, reason: from getter */
        public final Dimension getDimensions() {
            return this.dimensions;
        }

        @Nullable
        /* renamed from: component13, reason: from getter */
        public final User getOperationUser() {
            return this.operationUser;
        }

        @Nullable
        /* renamed from: component14, reason: from getter */
        public final k getUserList() {
            return this.userList;
        }

        @Nullable
        /* renamed from: component15, reason: from getter */
        public final k getTransferDetails() {
            return this.transferDetails;
        }

        @Nullable
        /* renamed from: component16, reason: from getter */
        public final String getHideEmailView() {
            return this.hideEmailView;
        }

        @Nullable
        /* renamed from: component17, reason: from getter */
        public final String getRatingMessage() {
            return this.ratingMessage;
        }

        @Nullable
        /* renamed from: component18, reason: from getter */
        public final Integer getRating() {
            return this.rating;
        }

        @Nullable
        /* renamed from: component19, reason: from getter */
        public final Long getMessageTime() {
            return this.messageTime;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getChatId() {
            return this.chatId;
        }

        @Nullable
        /* renamed from: component20, reason: from getter */
        public final Long getTime() {
            return this.time;
        }

        @Nullable
        /* renamed from: component21, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @Nullable
        /* renamed from: component22, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @Nullable
        /* renamed from: component23, reason: from getter */
        public final String getRejectedUsers() {
            return this.rejectedUsers;
        }

        @Nullable
        /* renamed from: component24, reason: from getter */
        public final Boolean getIsFeedbackCardExpired() {
            return this.isFeedbackCardExpired;
        }

        @Nullable
        /* renamed from: component25, reason: from getter */
        public final Long getFeedbackTime() {
            return this.feedbackTime;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final a getAttachmentType() {
            return this.attachmentType;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getFileId() {
            return this.fileId;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getAttachmentId() {
            return this.attachmentId;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final String getBlurImage() {
            return this.blurImage;
        }

        /* renamed from: component9, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        @NotNull
        public final Attachment copy(@Nullable String mode, @Nullable String chatId, @Nullable a attachmentType, @Nullable String fileId, @Nullable String id2, @Nullable String attachmentId, @Nullable String content, @Nullable String blurImage, long size, @Nullable String fileName, @Nullable String url, @Nullable Dimension dimensions, @Nullable User operationUser, @Nullable k userList, @Nullable k transferDetails, @Nullable String hideEmailView, @Nullable String ratingMessage, @Nullable Integer rating, @Nullable Long messageTime, @Nullable Long time, @Nullable String userId, @Nullable String type, @Nullable String rejectedUsers, @Nullable Boolean isFeedbackCardExpired, @Nullable Long feedbackTime) {
            return new Attachment(mode, chatId, attachmentType, fileId, id2, attachmentId, content, blurImage, size, fileName, url, dimensions, operationUser, userList, transferDetails, hideEmailView, ratingMessage, rating, messageTime, time, userId, type, rejectedUsers, isFeedbackCardExpired, feedbackTime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) other;
            return Intrinsics.areEqual(this.mode, attachment.mode) && Intrinsics.areEqual(this.chatId, attachment.chatId) && this.attachmentType == attachment.attachmentType && Intrinsics.areEqual(this.fileId, attachment.fileId) && Intrinsics.areEqual(this.id, attachment.id) && Intrinsics.areEqual(this.attachmentId, attachment.attachmentId) && Intrinsics.areEqual(this.content, attachment.content) && Intrinsics.areEqual(this.blurImage, attachment.blurImage) && this.size == attachment.size && Intrinsics.areEqual(this.fileName, attachment.fileName) && Intrinsics.areEqual(this.url, attachment.url) && Intrinsics.areEqual(this.dimensions, attachment.dimensions) && Intrinsics.areEqual(this.operationUser, attachment.operationUser) && Intrinsics.areEqual(this.userList, attachment.userList) && Intrinsics.areEqual(this.transferDetails, attachment.transferDetails) && Intrinsics.areEqual(this.hideEmailView, attachment.hideEmailView) && Intrinsics.areEqual(this.ratingMessage, attachment.ratingMessage) && Intrinsics.areEqual(this.rating, attachment.rating) && Intrinsics.areEqual(this.messageTime, attachment.messageTime) && Intrinsics.areEqual(this.time, attachment.time) && Intrinsics.areEqual(this.userId, attachment.userId) && Intrinsics.areEqual(this.type, attachment.type) && Intrinsics.areEqual(this.rejectedUsers, attachment.rejectedUsers) && Intrinsics.areEqual(this.isFeedbackCardExpired, attachment.isFeedbackCardExpired) && Intrinsics.areEqual(this.feedbackTime, attachment.feedbackTime);
        }

        @Nullable
        public final String getAttachmentId() {
            return this.attachmentId;
        }

        @Nullable
        public final a getAttachmentType() {
            return this.attachmentType;
        }

        @Nullable
        public final String getBlurImage() {
            return this.blurImage;
        }

        @Nullable
        public final String getChatId() {
            return this.chatId;
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final Dimension getDimensions() {
            return this.dimensions;
        }

        @Nullable
        public final Long getFeedbackTime() {
            return this.feedbackTime;
        }

        @Nullable
        public final String getFileId() {
            return this.fileId;
        }

        @Nullable
        public final String getFileName() {
            return this.fileName;
        }

        @Nullable
        public final String getHideEmailView() {
            return this.hideEmailView;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final Long getMessageTime() {
            return this.messageTime;
        }

        @Nullable
        public final String getMode() {
            return this.mode;
        }

        @Nullable
        public final User getOperationUser() {
            return this.operationUser;
        }

        @Nullable
        public final Integer getRating() {
            return this.rating;
        }

        @Nullable
        public final String getRatingMessage() {
            return this.ratingMessage;
        }

        @Nullable
        public final String getRejectedUsers() {
            return this.rejectedUsers;
        }

        public final long getSize() {
            return this.size;
        }

        @Nullable
        public final Long getTime() {
            return this.time;
        }

        @Nullable
        public final k getTransferDetails() {
            return this.transferDetails;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        public final String getUserId() {
            return this.userId;
        }

        @Nullable
        public final k getUserList() {
            return this.userList;
        }

        public int hashCode() {
            String str = this.mode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.chatId;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            a aVar = this.attachmentType;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str3 = this.fileId;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.id;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.attachmentId;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.content;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.blurImage;
            int hashCode8 = (((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + Long.hashCode(this.size)) * 31;
            String str8 = this.fileName;
            int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.url;
            int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Dimension dimension = this.dimensions;
            int hashCode11 = (hashCode10 + (dimension == null ? 0 : dimension.hashCode())) * 31;
            User user = this.operationUser;
            int hashCode12 = (hashCode11 + (user == null ? 0 : user.hashCode())) * 31;
            k kVar = this.userList;
            int hashCode13 = (hashCode12 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            k kVar2 = this.transferDetails;
            int hashCode14 = (hashCode13 + (kVar2 == null ? 0 : kVar2.hashCode())) * 31;
            String str10 = this.hideEmailView;
            int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.ratingMessage;
            int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
            Integer num = this.rating;
            int hashCode17 = (hashCode16 + (num == null ? 0 : num.hashCode())) * 31;
            Long l10 = this.messageTime;
            int hashCode18 = (hashCode17 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.time;
            int hashCode19 = (hashCode18 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str12 = this.userId;
            int hashCode20 = (hashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.type;
            int hashCode21 = (hashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.rejectedUsers;
            int hashCode22 = (hashCode21 + (str14 == null ? 0 : str14.hashCode())) * 31;
            Boolean bool = this.isFeedbackCardExpired;
            int hashCode23 = (hashCode22 + (bool == null ? 0 : bool.hashCode())) * 31;
            Long l12 = this.feedbackTime;
            return hashCode23 + (l12 != null ? l12.hashCode() : 0);
        }

        @Nullable
        public final Boolean isFeedbackCardExpired() {
            return this.isFeedbackCardExpired;
        }

        public final void setFeedbackTime(@Nullable Long l10) {
            this.feedbackTime = l10;
        }

        @NotNull
        public String toString() {
            return "Attachment(mode=" + this.mode + ", chatId=" + this.chatId + ", attachmentType=" + this.attachmentType + ", fileId=" + this.fileId + ", id=" + this.id + ", attachmentId=" + this.attachmentId + ", content=" + this.content + ", blurImage=" + this.blurImage + ", size=" + this.size + ", fileName=" + this.fileName + ", url=" + this.url + ", dimensions=" + this.dimensions + ", operationUser=" + this.operationUser + ", userList=" + this.userList + ", transferDetails=" + this.transferDetails + ", hideEmailView=" + this.hideEmailView + ", ratingMessage=" + this.ratingMessage + ", rating=" + this.rating + ", messageTime=" + this.messageTime + ", time=" + this.time + ", userId=" + this.userId + ", type=" + this.type + ", rejectedUsers=" + this.rejectedUsers + ", isFeedbackCardExpired=" + this.isFeedbackCardExpired + ", feedbackTime=" + this.feedbackTime + ')';
        }

        public Attachment(@Nullable String str, @Nullable String str2, @Nullable a aVar, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, long j10, @Nullable String str8, @Nullable String str9, @Nullable Dimension dimension, @Nullable User user, @Nullable k kVar, @Nullable k kVar2, @Nullable String str10, @Nullable String str11, @Nullable Integer num, @Nullable Long l10, @Nullable Long l11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable Boolean bool, @Nullable Long l12) {
            this.mode = str;
            this.chatId = str2;
            this.attachmentType = aVar;
            this.fileId = str3;
            this.id = str4;
            this.attachmentId = str5;
            this.content = str6;
            this.blurImage = str7;
            this.size = j10;
            this.fileName = str8;
            this.url = str9;
            this.dimensions = dimension;
            this.operationUser = user;
            this.userList = kVar;
            this.transferDetails = kVar2;
            this.hideEmailView = str10;
            this.ratingMessage = str11;
            this.rating = num;
            this.messageTime = l10;
            this.time = l11;
            this.userId = str12;
            this.type = str13;
            this.rejectedUsers = str14;
            this.isFeedbackCardExpired = bool;
            this.feedbackTime = l12;
        }

        public /* synthetic */ Attachment(String str, String str2, a aVar, String str3, String str4, String str5, String str6, String str7, long j10, String str8, String str9, Dimension dimension, User user, k kVar, k kVar2, String str10, String str11, Integer num, Long l10, Long l11, String str12, String str13, String str14, Boolean bool, Long l12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7, (i10 & 256) != 0 ? 0L : j10, (i10 & 512) != 0 ? null : str8, (i10 & 1024) != 0 ? null : str9, (i10 & 2048) != 0 ? null : dimension, (i10 & 4096) != 0 ? null : user, (i10 & 8192) != 0 ? null : kVar, (i10 & 16384) != 0 ? null : kVar2, (i10 & 32768) != 0 ? null : str10, (i10 & PKIFailureInfo.notAuthorized) != 0 ? null : str11, (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? null : num, (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? null : l10, (i10 & PKIFailureInfo.signerNotTrusted) != 0 ? null : l11, (i10 & PKIFailureInfo.badCertTemplate) != 0 ? null : str12, (i10 & PKIFailureInfo.badSenderNonce) != 0 ? null : str13, (i10 & 4194304) != 0 ? null : str14, (i10 & 8388608) != 0 ? Boolean.FALSE : bool, (i10 & 16777216) != 0 ? null : l12);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J|\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0013J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b/\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b\f\u0010\u001cR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b\u000f\u0010 ¨\u00067"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Extras;", "", "", "localFilePath", "localFileName", "", "localFileSize", "mediaDuration", "mediaDurationText", "Lwf/b;", "uploadFileType", "", "isTriggerChatInvite", "", "chainedMessageIds", "isMediaMetaDataRetrieverFailed", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lwf/b;Ljava/lang/Boolean;Ljava/util/List;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "component5", "component6", "()Lwf/b;", "component7", "()Ljava/lang/Boolean;", "component8", "()Ljava/util/List;", "component9", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lwf/b;Ljava/lang/Boolean;Ljava/util/List;Z)Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Extras;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLocalFilePath", "getLocalFileName", "J", "getLocalFileSize", "getMediaDuration", "getMediaDurationText", "Lwf/b;", "getUploadFileType", "Ljava/lang/Boolean;", "Ljava/util/List;", "getChainedMessageIds", "Z", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Extras {

        @Gb.c("chained_message_ids")
        @Nullable
        private final List<String> chainedMessageIds;
        private final boolean isMediaMetaDataRetrieverFailed;

        @Gb.c("is_trigger_chat_invite")
        @Nullable
        private final Boolean isTriggerChatInvite;

        @Gb.c("local_file_name")
        @Nullable
        private final String localFileName;

        @Gb.c("local_file_path")
        @Nullable
        private final String localFilePath;

        @Gb.c("local_file_size")
        private final long localFileSize;

        @Gb.c("media_duration")
        private final long mediaDuration;

        @Gb.c("media_duration_text")
        @Nullable
        private final String mediaDurationText;

        @Gb.c("upload_file_type")
        @Nullable
        private final wf.b uploadFileType;

        public Extras() {
            this(null, null, 0L, 0L, null, null, null, null, false, 511, null);
        }

        public static /* synthetic */ Extras copy$default(Extras extras, String str, String str2, long j10, long j11, String str3, wf.b bVar, Boolean bool, List list, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = extras.localFilePath;
            }
            if ((i10 & 2) != 0) {
                str2 = extras.localFileName;
            }
            if ((i10 & 4) != 0) {
                j10 = extras.localFileSize;
            }
            if ((i10 & 8) != 0) {
                j11 = extras.mediaDuration;
            }
            if ((i10 & 16) != 0) {
                str3 = extras.mediaDurationText;
            }
            if ((i10 & 32) != 0) {
                bVar = extras.uploadFileType;
            }
            if ((i10 & 64) != 0) {
                bool = extras.isTriggerChatInvite;
            }
            if ((i10 & 128) != 0) {
                list = extras.chainedMessageIds;
            }
            if ((i10 & 256) != 0) {
                z10 = extras.isMediaMetaDataRetrieverFailed;
            }
            boolean z11 = z10;
            Boolean bool2 = bool;
            String str4 = str3;
            long j12 = j11;
            long j13 = j10;
            return extras.copy(str, str2, j13, j12, str4, bVar, bool2, list, z11);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getLocalFilePath() {
            return this.localFilePath;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getLocalFileName() {
            return this.localFileName;
        }

        /* renamed from: component3, reason: from getter */
        public final long getLocalFileSize() {
            return this.localFileSize;
        }

        /* renamed from: component4, reason: from getter */
        public final long getMediaDuration() {
            return this.mediaDuration;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getMediaDurationText() {
            return this.mediaDurationText;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final wf.b getUploadFileType() {
            return this.uploadFileType;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final Boolean getIsTriggerChatInvite() {
            return this.isTriggerChatInvite;
        }

        @Nullable
        public final List<String> component8() {
            return this.chainedMessageIds;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsMediaMetaDataRetrieverFailed() {
            return this.isMediaMetaDataRetrieverFailed;
        }

        @NotNull
        public final Extras copy(@Nullable String localFilePath, @Nullable String localFileName, long localFileSize, long mediaDuration, @Nullable String mediaDurationText, @Nullable wf.b uploadFileType, @Nullable Boolean isTriggerChatInvite, @Nullable List<String> chainedMessageIds, boolean isMediaMetaDataRetrieverFailed) {
            return new Extras(localFilePath, localFileName, localFileSize, mediaDuration, mediaDurationText, uploadFileType, isTriggerChatInvite, chainedMessageIds, isMediaMetaDataRetrieverFailed);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Extras)) {
                return false;
            }
            Extras extras = (Extras) other;
            return Intrinsics.areEqual(this.localFilePath, extras.localFilePath) && Intrinsics.areEqual(this.localFileName, extras.localFileName) && this.localFileSize == extras.localFileSize && this.mediaDuration == extras.mediaDuration && Intrinsics.areEqual(this.mediaDurationText, extras.mediaDurationText) && this.uploadFileType == extras.uploadFileType && Intrinsics.areEqual(this.isTriggerChatInvite, extras.isTriggerChatInvite) && Intrinsics.areEqual(this.chainedMessageIds, extras.chainedMessageIds) && this.isMediaMetaDataRetrieverFailed == extras.isMediaMetaDataRetrieverFailed;
        }

        @Nullable
        public final List<String> getChainedMessageIds() {
            return this.chainedMessageIds;
        }

        @Nullable
        public final String getLocalFileName() {
            return this.localFileName;
        }

        @Nullable
        public final String getLocalFilePath() {
            return this.localFilePath;
        }

        public final long getLocalFileSize() {
            return this.localFileSize;
        }

        public final long getMediaDuration() {
            return this.mediaDuration;
        }

        @Nullable
        public final String getMediaDurationText() {
            return this.mediaDurationText;
        }

        @Nullable
        public final wf.b getUploadFileType() {
            return this.uploadFileType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.localFilePath;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.localFileName;
            int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.localFileSize)) * 31) + Long.hashCode(this.mediaDuration)) * 31;
            String str3 = this.mediaDurationText;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            wf.b bVar = this.uploadFileType;
            int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Boolean bool = this.isTriggerChatInvite;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<String> list = this.chainedMessageIds;
            int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
            boolean z10 = this.isMediaMetaDataRetrieverFailed;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode6 + i10;
        }

        public final boolean isMediaMetaDataRetrieverFailed() {
            return this.isMediaMetaDataRetrieverFailed;
        }

        @Nullable
        public final Boolean isTriggerChatInvite() {
            return this.isTriggerChatInvite;
        }

        @NotNull
        public String toString() {
            return "Extras(localFilePath=" + this.localFilePath + ", localFileName=" + this.localFileName + ", localFileSize=" + this.localFileSize + ", mediaDuration=" + this.mediaDuration + ", mediaDurationText=" + this.mediaDurationText + ", uploadFileType=" + this.uploadFileType + ", isTriggerChatInvite=" + this.isTriggerChatInvite + ", chainedMessageIds=" + this.chainedMessageIds + ", isMediaMetaDataRetrieverFailed=" + this.isMediaMetaDataRetrieverFailed + ')';
        }

        public Extras(@Nullable String str, @Nullable String str2, long j10, long j11, @Nullable String str3, @Nullable wf.b bVar, @Nullable Boolean bool, @Nullable List<String> list, boolean z10) {
            this.localFilePath = str;
            this.localFileName = str2;
            this.localFileSize = j10;
            this.mediaDuration = j11;
            this.mediaDurationText = str3;
            this.uploadFileType = bVar;
            this.isTriggerChatInvite = bool;
            this.chainedMessageIds = list;
            this.isMediaMetaDataRetrieverFailed = z10;
        }

        public /* synthetic */ Extras(String str, String str2, long j10, long j11, String str3, wf.b bVar, Boolean bool, List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? 0L : j10, (i10 & 8) != 0 ? -1L : j11, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : bVar, (i10 & 64) != 0 ? null : bool, (i10 & 128) != 0 ? null : list, (i10 & 256) != 0 ? false : z10);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB-\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$RespondedMessage;", "", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;", "type", EventKeys.VALUE_KEY, "", StackTraceHelper.ID_KEY, "<init>", "(Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;", "component2", "()Ljava/lang/Object;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;Ljava/lang/Object;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$RespondedMessage;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;", "getType", "Ljava/lang/Object;", "getValue", "Ljava/lang/String;", "getId", "Value", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RespondedMessage {

        @Gb.c(StackTraceHelper.ID_KEY)
        @Nullable
        private final String id;

        @Gb.c("type")
        @Nullable
        private final g type;

        @Gb.c(EventKeys.VALUE_KEY)
        @Nullable
        private final Object value;

        @Keep
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ(\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$RespondedMessage$Value;", "", "", EventKeys.VALUE_KEY, AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$RespondedMessage$Value;", "toString", "Ljava/lang/String;", "getValue", "getLabel", "Companion", "a", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Value {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Gb.c(AnnotatedPrivateKey.LABEL)
            @Nullable
            private final String label;

            @Gb.c(EventKeys.VALUE_KEY)
            @Nullable
            private final String value;

            /* renamed from: com.zoho.livechat.android.modules.messages.domain.entities.Message$RespondedMessage$Value$a, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final List a(List list) {
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((Value) obj).getLabel() != null) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String label = ((Value) it.next()).getLabel();
                        if (label == null) {
                            label = "";
                        }
                        arrayList2.add(label);
                    }
                    return arrayList2;
                }

                public Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Value() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Value copy$default(Value value, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = value.value;
                }
                if ((i10 & 2) != 0) {
                    str2 = value.label;
                }
                return value.copy(str, str2);
            }

            @JvmStatic
            @NotNull
            public static final List<String> getLabels(@NotNull List<Value> list) {
                return INSTANCE.a(list);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            @NotNull
            public final Value copy(@Nullable String value, @Nullable String label) {
                return new Value(value, label);
            }

            public boolean equals(@Nullable Object other) {
                String str;
                if (!(other instanceof Value) || (str = this.value) == null) {
                    return false;
                }
                Value value = (Value) other;
                return Intrinsics.areEqual(str, value.value) && Intrinsics.areEqual(this.label, value.label);
            }

            @Nullable
            public final String getLabel() {
                return this.label;
            }

            @Nullable
            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                String str = this.value;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.label;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Value(value=" + this.value + ", label=" + this.label + ')';
            }

            public Value(@Nullable String str, @Nullable String str2) {
                this.value = str;
                this.label = str2;
            }

            public /* synthetic */ Value(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
            }
        }

        @JvmOverloads
        public RespondedMessage() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ RespondedMessage copy$default(RespondedMessage respondedMessage, g gVar, Object obj, String str, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                gVar = respondedMessage.type;
            }
            if ((i10 & 2) != 0) {
                obj = respondedMessage.value;
            }
            if ((i10 & 4) != 0) {
                str = respondedMessage.id;
            }
            return respondedMessage.copy(gVar, obj, str);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final g getType() {
            return this.type;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final RespondedMessage copy(@Nullable g type, @Nullable Object value, @Nullable String id2) {
            return new RespondedMessage(type, value, id2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RespondedMessage)) {
                return false;
            }
            RespondedMessage respondedMessage = (RespondedMessage) other;
            return this.type == respondedMessage.type && Intrinsics.areEqual(this.value, respondedMessage.value) && Intrinsics.areEqual(this.id, respondedMessage.id);
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final g getType() {
            return this.type;
        }

        @Nullable
        public final Object getValue() {
            return this.value;
        }

        public int hashCode() {
            g gVar = this.type;
            int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
            Object obj = this.value;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            String str = this.id;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "RespondedMessage(type=" + this.type + ", value=" + this.value + ", id=" + this.id + ')';
        }

        @JvmOverloads
        public RespondedMessage(@Nullable g gVar) {
            this(gVar, null, null, 6, null);
        }

        @JvmOverloads
        public RespondedMessage(@Nullable g gVar, @Nullable Object obj) {
            this(gVar, obj, null, 4, null);
        }

        @JvmOverloads
        public RespondedMessage(@Nullable g gVar, @Nullable Object obj, @Nullable String str) {
            this.type = gVar;
            this.value = obj;
            this.id = str;
        }

        public /* synthetic */ RespondedMessage(g gVar, Object obj, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : gVar, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? null : str);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;", "", "name", "", StackTraceHelper.ID_KEY, "lsuid", "imageFileKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getImageFileKey", "getLsuid", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class User {

        @Gb.c(StackTraceHelper.ID_KEY)
        @Nullable
        private final String id;

        @Gb.c(alternate = {"image_fkey"}, value = "image_file_key")
        @Nullable
        private final String imageFileKey;

        @Gb.c("lsuid")
        @Nullable
        private final String lsuid;

        @Gb.c(alternate = {"dname", "operatorname"}, value = "name")
        @Nullable
        private final String name;

        public User(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.name = str;
            this.id = str2;
            this.lsuid = str3;
            this.imageFileKey = str4;
        }

        public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = user.name;
            }
            if ((i10 & 2) != 0) {
                str2 = user.id;
            }
            if ((i10 & 4) != 0) {
                str3 = user.lsuid;
            }
            if ((i10 & 8) != 0) {
                str4 = user.imageFileKey;
            }
            return user.copy(str, str2, str3, str4);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getLsuid() {
            return this.lsuid;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getImageFileKey() {
            return this.imageFileKey;
        }

        @NotNull
        public final User copy(@Nullable String name, @Nullable String id2, @Nullable String lsuid, @Nullable String imageFileKey) {
            return new User(name, id2, lsuid, imageFileKey);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return Intrinsics.areEqual(this.name, user.name) && Intrinsics.areEqual(this.id, user.id) && Intrinsics.areEqual(this.lsuid, user.lsuid) && Intrinsics.areEqual(this.imageFileKey, user.imageFileKey);
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getImageFileKey() {
            return this.imageFileKey;
        }

        @Nullable
        public final String getLsuid() {
            return this.lsuid;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.id;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.lsuid;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.imageFileKey;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "User(name=" + this.name + ", id=" + this.id + ", lsuid=" + this.lsuid + ", imageFileKey=" + this.imageFileKey + ')';
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.messages.domain.entities.Message$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Message a(Message message, Attachment attachment) {
            Intrinsics.checkNotNullParameter(message, "<this>");
            Intrinsics.checkNotNullParameter(attachment, "attachment");
            return Message.copy$default(message, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, attachment, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -131073, 1023, null);
        }

        public final Message b(String acknowledgementKey, String str, String chatId, g messageType, f status, long j10, String uniqueID, String str2, long j11, long j12, String str3, String str4, Meta meta, Integer num) {
            Intrinsics.checkNotNullParameter(acknowledgementKey, "acknowledgementKey");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(messageType, "messageType");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
            return new Message(acknowledgementKey, str, chatId, messageType, status, String.valueOf(j10), uniqueID, num, str2, null, j11, j12, str3, str4, new b(str4, m.b(str4)), null, null, null, meta, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, j.c(j12, null, null, 3, null), -294912, 511, null);
        }

        public final Message c(String acknowledgementKey, String str, String chatId, g messageType, f status, long j10, String uniqueID, String str2, long j11, long j12, String str3, String str4, RespondedMessage respondedMessage) {
            Intrinsics.checkNotNullParameter(acknowledgementKey, "acknowledgementKey");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(messageType, "messageType");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
            return new Message(acknowledgementKey, str, chatId, messageType, status, String.valueOf(j10), uniqueID, null, str2, null, j11, j12, str3, str4, new b(str4, m.b(str4)), null, null, null, null, respondedMessage, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, j.c(j12, null, null, 3, null), -557056, 511, null);
        }

        public final Message d(String str, String str2, String chatId, g messageType, f status, long j10, String uniqueID, String str3, long j11, long j12, String str4, String str5, Integer num) {
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(messageType, "messageType");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
            return new Message(str, str2, chatId, messageType, status, String.valueOf(j10), uniqueID, num, str3, null, j11, j12, str4, str5, new b(str5, m.b(str5)), null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, j.c(j12, null, null, 3, null), -32768, 511, null);
        }

        public Companion() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f43717a = new a(null);

        @Gb.c("has_reactions")
        private final boolean hasReactions;

        @Gb.c("text")
        @Nullable
        private final String text;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                return new b(name, m.b(name));
            }

            public a() {
            }
        }

        public b(String str, boolean z10) {
            this.text = str;
            this.hasReactions = z10;
        }

        public static /* synthetic */ b c(b bVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.text;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.hasReactions;
            }
            return bVar.b(str, z10);
        }

        public final Spannable a() {
            return Vf.b.i().a(this);
        }

        public final b b(String str, boolean z10) {
            return new b(str, z10);
        }

        public final boolean d() {
            return this.hasReactions;
        }

        public final String e() {
            return this.text;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.text, bVar.text) && this.hasReactions == bVar.hasReactions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            boolean z10 = this.hasReactions;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "DisplayName(text=" + this.text + ", hasReactions=" + this.hasReactions + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;

        @Gb.c("emojis")
        public static final c Emojis = new c("Emojis", 0);

        @Gb.c("link")
        public static final c Link = new c("Link", 1);

        @Gb.c("blockquote")
        public static final c Blockquote = new c("Blockquote", 2);

        @Gb.c("heading")
        public static final c Heading = new c("Heading", 3);

        @Gb.c("codeblock")
        public static final c CodeBlock = new c("CodeBlock", 4);

        @Gb.c("quote")
        public static final c Quote = new c("Quote", 5);

        @Gb.c("bold")
        public static final c Bold = new c("Bold", 6);

        @Gb.c("underline")
        public static final c Underline = new c("Underline", 7);

        @Gb.c("italic")
        public static final c Italic = new c("Italic", 8);

        @Gb.c("strike")
        public static final c Strike = new c("Strike", 9);

        @Gb.c("bullet")
        public static final c Bullet = new c("Bullet", 10);

        private static final /* synthetic */ c[] $values() {
            return new c[]{Emojis, Link, Blockquote, Heading, CodeBlock, Quote, Bold, Underline, Italic, Strike, Bullet};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private c(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;

        @Gb.c("trigger")
        public static final d Trigger = new d("Trigger", 0);

        private static final /* synthetic */ d[] $values() {
            return new d[]{Trigger};
        }

        static {
            d[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private d(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ e[] $VALUES;
        public static final e Top = new e("Top", 0);
        public static final e Bottom = new e("Bottom", 1);

        private static final /* synthetic */ e[] $values() {
            return new e[]{Top, Bottom};
        }

        static {
            e[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private e(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<e> getEntries() {
            return $ENTRIES;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ f[] $VALUES;

        @NotNull
        public static final a Companion;

        @Gb.c("sending")
        public static final f Sending = new f("Sending", 0);

        @Gb.c("uploading")
        public static final f Uploading = new f("Uploading", 1);

        @Gb.c("sent")
        public static final f Sent = new f("Sent", 2);

        @Gb.c("failure")
        public static final f Failure = new f("Failure", 3);

        @Gb.c("wms_failure")
        public static final f WmsFailure = new f("WmsFailure", 4);

        @Gb.c("waiting_for_wms")
        public static final f WaitingForWms = new f("WaitingForWms", 5);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            public final f a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                switch (value.hashCode()) {
                    case 3526552:
                        if (value.equals("sent")) {
                            return f.Sent;
                        }
                        break;
                    case 538834856:
                        if (value.equals("wms_failure")) {
                            return f.WmsFailure;
                        }
                        break;
                    case 1239105089:
                        if (value.equals("uploading")) {
                            return f.Uploading;
                        }
                        break;
                    case 1979923290:
                        if (value.equals("sending")) {
                            return f.Sending;
                        }
                        break;
                }
                return f.Failure;
            }

            public final boolean b(f fVar) {
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                return fVar == f.Failure || fVar == f.WmsFailure;
            }

            public a() {
            }
        }

        private static final /* synthetic */ f[] $values() {
            return new f[]{Sending, Uploading, Sent, Failure, WmsFailure, WaitingForWms};
        }

        static {
            f[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            Companion = new a(null);
        }

        private f(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<f> getEntries() {
            return $ENTRIES;
        }

        @JvmStatic
        public static final boolean isFailed(@NotNull f fVar) {
            return Companion.b(fVar);
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class g {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ g[] $VALUES;

        @Gb.c("article")
        public static final g Article;

        @Gb.c("audio")
        public static final g Audio;

        @Gb.c("campaign")
        public static final g Campaign;

        @NotNull
        public static final a Companion;

        @Gb.c(EventGroupType.FEEDBACK_EVENT_GROUP)
        public static final g Feedback;

        @Gb.c("file")
        public static final g File;

        @Gb.c("ignore")
        public static final g Ignore;

        @Gb.c("image")
        public static final g Image;

        @Gb.c("info")
        public static final g InfoMessage;

        @Gb.c("inline_form")
        public static final g InlineForm;

        @Gb.c("load_more")
        public static final g LoadMore;

        @Gb.c("location")
        public static final g Location;

        @Gb.c("question")
        public static final g Question;

        @Gb.c("reopen_question")
        public static final g ReopenQuestion;

        @Gb.c("applogs")
        public static final g RequestLog;

        @Gb.c("skip")
        public static final g Skip;

        @Gb.c("text")
        public static final g Text;

        @Gb.c("video")
        public static final g Video;

        @Gb.c("visitor_email")
        public static final g VisitorEmail;

        @Gb.c("visitor_name")
        public static final g VisitorName;

        @Gb.c("visitor_phone")
        public static final g VisitorPhone;

        @Gb.c("articles")
        public static final g WidgetArticles;

        @Gb.c("calendar")
        public static final g WidgetCalendar;

        @Gb.c("company")
        public static final g WidgetCompany;

        @Gb.c("date-timeslots")
        public static final g WidgetDateTimeslots;

        @Gb.c("widget_file_upload")
        public static final g WidgetFileUpload;

        @Gb.c("happiness-rating")
        public static final g WidgetHappinessRating;

        @Gb.c("images")
        public static final g WidgetImage;

        @Gb.c("drop-down")
        public static final g WidgetInputDropdown;

        @Gb.c("email")
        public static final g WidgetInputEmail;

        @Gb.c("name")
        public static final g WidgetInputName;

        @Gb.c("password")
        public static final g WidgetInputPassword;

        @Gb.c("tel")
        public static final g WidgetInputTelephone;

        @Gb.c(EventKeys.URL)
        public static final g WidgetInputUrl;

        @Gb.c("like")
        public static final g WidgetLikeRating;

        @Gb.c("links")
        public static final g WidgetLinks;

        @Gb.c("widget_location")
        public static final g WidgetLocation;

        @Gb.c("multiple-select")
        public static final g WidgetMultiSelect;

        @Gb.c("multiple-product")
        public static final g WidgetMultipleProduct;

        @Gb.c("range-calendar")
        public static final g WidgetRangeCalendar;

        @Gb.c("range-slider")
        public static final g WidgetRangeSlider;

        @Gb.c("single-product")
        public static final g WidgetSingleProduct;

        @Gb.c("select")
        public static final g WidgetSingleSelection;

        @Gb.c("slider")
        public static final g WidgetSlider;

        @Gb.c("star-rating")
        public static final g WidgetStarRating;

        @Gb.c("suggestions")
        public static final g WidgetSuggestions;

        @Gb.c("timeslots")
        public static final g WidgetTimeslots;

        @Gb.c("widget_video")
        public static final g WidgetVideo;

        @NotNull
        private static final List<g> nonDeletableMessageTypes;

        @NotNull
        private static final List<g> nonEditableMessageTypes;

        @NotNull
        private static final List<g> visitorMessageTypes;

        @NotNull
        private final String stringValue;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final g a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                g gVar = g.Question;
                if (Intrinsics.areEqual(value, gVar.getStringValue())) {
                    return gVar;
                }
                g gVar2 = g.Text;
                if (!Intrinsics.areEqual(value, gVar2.getStringValue())) {
                    g gVar3 = g.Image;
                    if (Intrinsics.areEqual(value, gVar3.getStringValue())) {
                        return gVar3;
                    }
                    g gVar4 = g.Audio;
                    if (Intrinsics.areEqual(value, gVar4.getStringValue())) {
                        return gVar4;
                    }
                    g gVar5 = g.Video;
                    if (Intrinsics.areEqual(value, gVar5.getStringValue())) {
                        return gVar5;
                    }
                    g gVar6 = g.File;
                    if (Intrinsics.areEqual(value, gVar6.getStringValue())) {
                        return gVar6;
                    }
                    g gVar7 = g.InfoMessage;
                    if (Intrinsics.areEqual(value, gVar7.getStringValue())) {
                        return gVar7;
                    }
                    g gVar8 = g.Feedback;
                    if (Intrinsics.areEqual(value, gVar8.getStringValue())) {
                        return gVar8;
                    }
                    g gVar9 = g.RequestLog;
                    if (Intrinsics.areEqual(value, gVar9.getStringValue())) {
                        return gVar9;
                    }
                    g gVar10 = g.InlineForm;
                    if (Intrinsics.areEqual(value, gVar10.getStringValue())) {
                        return gVar10;
                    }
                    g gVar11 = g.Article;
                    if (Intrinsics.areEqual(value, gVar11.getStringValue())) {
                        return gVar11;
                    }
                    g gVar12 = g.WidgetSingleSelection;
                    if (Intrinsics.areEqual(value, gVar12.getStringValue())) {
                        return gVar12;
                    }
                    g gVar13 = g.WidgetHappinessRating;
                    if (Intrinsics.areEqual(value, gVar13.getStringValue())) {
                        return gVar13;
                    }
                    g gVar14 = g.WidgetLikeRating;
                    if (Intrinsics.areEqual(value, gVar14.getStringValue())) {
                        return gVar14;
                    }
                    g gVar15 = g.WidgetMultiSelect;
                    if (Intrinsics.areEqual(value, gVar15.getStringValue())) {
                        return gVar15;
                    }
                    g gVar16 = g.WidgetCalendar;
                    if (Intrinsics.areEqual(value, gVar16.getStringValue())) {
                        return gVar16;
                    }
                    g gVar17 = g.WidgetStarRating;
                    if (Intrinsics.areEqual(value, gVar17.getStringValue())) {
                        return gVar17;
                    }
                    g gVar18 = g.WidgetRangeCalendar;
                    if (Intrinsics.areEqual(value, gVar18.getStringValue())) {
                        return gVar18;
                    }
                    g gVar19 = g.WidgetTimeslots;
                    if (Intrinsics.areEqual(value, gVar19.getStringValue())) {
                        return gVar19;
                    }
                    g gVar20 = g.WidgetDateTimeslots;
                    if (Intrinsics.areEqual(value, gVar20.getStringValue())) {
                        return gVar20;
                    }
                    g gVar21 = g.WidgetLocation;
                    if (Intrinsics.areEqual(value, gVar21.getStringValue())) {
                        return gVar21;
                    }
                    g gVar22 = g.WidgetSlider;
                    if (Intrinsics.areEqual(value, gVar22.getStringValue())) {
                        return gVar22;
                    }
                    g gVar23 = g.WidgetRangeSlider;
                    if (Intrinsics.areEqual(value, gVar23.getStringValue())) {
                        return gVar23;
                    }
                    g gVar24 = g.WidgetInputName;
                    if (Intrinsics.areEqual(value, gVar24.getStringValue()) ? true : Intrinsics.areEqual(value, "visitor_name")) {
                        return gVar24;
                    }
                    g gVar25 = g.WidgetInputEmail;
                    if (Intrinsics.areEqual(value, gVar25.getStringValue())) {
                        return gVar25;
                    }
                    g gVar26 = g.WidgetInputTelephone;
                    if (Intrinsics.areEqual(value, gVar26.getStringValue())) {
                        return gVar26;
                    }
                    g gVar27 = g.WidgetInputUrl;
                    if (Intrinsics.areEqual(value, gVar27.getStringValue())) {
                        return gVar27;
                    }
                    g gVar28 = g.WidgetInputDropdown;
                    if (Intrinsics.areEqual(value, gVar28.getStringValue())) {
                        return gVar28;
                    }
                    g gVar29 = g.WidgetInputPassword;
                    if (Intrinsics.areEqual(value, gVar29.getStringValue())) {
                        return gVar29;
                    }
                    g gVar30 = g.WidgetImage;
                    if (Intrinsics.areEqual(value, gVar30.getStringValue())) {
                        return gVar30;
                    }
                    g gVar31 = g.WidgetLinks;
                    if (Intrinsics.areEqual(value, gVar31.getStringValue())) {
                        return gVar31;
                    }
                    g gVar32 = g.WidgetArticles;
                    if (Intrinsics.areEqual(value, gVar32.getStringValue())) {
                        return gVar32;
                    }
                    g gVar33 = g.WidgetSingleProduct;
                    if (Intrinsics.areEqual(value, gVar33.getStringValue())) {
                        return gVar33;
                    }
                    g gVar34 = g.WidgetMultipleProduct;
                    if (Intrinsics.areEqual(value, gVar34.getStringValue())) {
                        return gVar34;
                    }
                    g gVar35 = g.WidgetSuggestions;
                    if (Intrinsics.areEqual(value, gVar35.getStringValue())) {
                        return gVar35;
                    }
                    g gVar36 = g.WidgetVideo;
                    if (Intrinsics.areEqual(value, gVar36.getStringValue())) {
                        return gVar36;
                    }
                    g gVar37 = g.ReopenQuestion;
                    if (Intrinsics.areEqual(value, gVar37.getStringValue())) {
                        return gVar37;
                    }
                    g gVar38 = g.WidgetFileUpload;
                    if (Intrinsics.areEqual(value, gVar38.getStringValue())) {
                        return gVar38;
                    }
                }
                return gVar2;
            }

            public final boolean b(g type) {
                Intrinsics.checkNotNullParameter(type, "type");
                return g.visitorMessageTypes.contains(type);
            }

            public a() {
            }
        }

        private static final /* synthetic */ g[] $values() {
            return new g[]{Question, Text, Image, Audio, Video, File, InfoMessage, Feedback, RequestLog, InlineForm, Article, WidgetCompany, WidgetSingleSelection, WidgetHappinessRating, WidgetLikeRating, WidgetMultiSelect, WidgetCalendar, WidgetStarRating, WidgetRangeCalendar, WidgetTimeslots, WidgetDateTimeslots, WidgetLocation, WidgetSlider, WidgetRangeSlider, WidgetInputName, WidgetInputEmail, WidgetInputTelephone, WidgetInputUrl, WidgetInputDropdown, WidgetInputPassword, WidgetImage, WidgetLinks, WidgetArticles, WidgetSingleProduct, WidgetMultipleProduct, WidgetSuggestions, WidgetVideo, WidgetFileUpload, Location, Skip, ReopenQuestion, LoadMore, Ignore, VisitorName, VisitorEmail, VisitorPhone, Campaign};
        }

        static {
            g gVar = new g("Question", 0, "question");
            Question = gVar;
            g gVar2 = new g("Text", 1, "text");
            Text = gVar2;
            g gVar3 = new g("Image", 2, "image");
            Image = gVar3;
            g gVar4 = new g("Audio", 3, "audio");
            Audio = gVar4;
            g gVar5 = new g("Video", 4, "video");
            Video = gVar5;
            g gVar6 = new g("File", 5, "file");
            File = gVar6;
            InfoMessage = new g("InfoMessage", 6, "info");
            Feedback = new g("Feedback", 7, EventGroupType.FEEDBACK_EVENT_GROUP);
            RequestLog = new g("RequestLog", 8, "applogs");
            InlineForm = new g("InlineForm", 9, "inline_form");
            Article = new g("Article", 10, "article");
            WidgetCompany = new g("WidgetCompany", 11, "company");
            WidgetSingleSelection = new g("WidgetSingleSelection", 12, "select");
            WidgetHappinessRating = new g("WidgetHappinessRating", 13, "happiness-rating");
            WidgetLikeRating = new g("WidgetLikeRating", 14, "like");
            WidgetMultiSelect = new g("WidgetMultiSelect", 15, "multiple-select");
            WidgetCalendar = new g("WidgetCalendar", 16, "calendar");
            WidgetStarRating = new g("WidgetStarRating", 17, "star-rating");
            WidgetRangeCalendar = new g("WidgetRangeCalendar", 18, "range-calendar");
            WidgetTimeslots = new g("WidgetTimeslots", 19, "timeslots");
            WidgetDateTimeslots = new g("WidgetDateTimeslots", 20, "date-timeslots");
            WidgetLocation = new g("WidgetLocation", 21, "widget_location");
            WidgetSlider = new g("WidgetSlider", 22, "slider");
            WidgetRangeSlider = new g("WidgetRangeSlider", 23, "range-slider");
            WidgetInputName = new g("WidgetInputName", 24, "name");
            WidgetInputEmail = new g("WidgetInputEmail", 25, "email");
            WidgetInputTelephone = new g("WidgetInputTelephone", 26, "tel");
            WidgetInputUrl = new g("WidgetInputUrl", 27, EventKeys.URL);
            WidgetInputDropdown = new g("WidgetInputDropdown", 28, "drop-down");
            WidgetInputPassword = new g("WidgetInputPassword", 29, "password");
            WidgetImage = new g("WidgetImage", 30, "images");
            WidgetLinks = new g("WidgetLinks", 31, "links");
            WidgetArticles = new g("WidgetArticles", 32, "articles");
            WidgetSingleProduct = new g("WidgetSingleProduct", 33, "single-product");
            WidgetMultipleProduct = new g("WidgetMultipleProduct", 34, "multiple-product");
            WidgetSuggestions = new g("WidgetSuggestions", 35, "suggestions");
            WidgetVideo = new g("WidgetVideo", 36, "widget_video");
            WidgetFileUpload = new g("WidgetFileUpload", 37, "widget_file_upload");
            g gVar7 = new g("Location", 38, "location");
            Location = gVar7;
            Skip = new g("Skip", 39, "skip");
            ReopenQuestion = new g("ReopenQuestion", 40, "reopen_question");
            LoadMore = new g("LoadMore", 41, "load_more");
            Ignore = new g("Ignore", 42, "ignore");
            VisitorName = new g("VisitorName", 43, "visitor_name");
            VisitorEmail = new g("VisitorEmail", 44, "visitor_email");
            VisitorPhone = new g("VisitorPhone", 45, "visitor_phone");
            Campaign = new g("Campaign", 46, "campaign");
            g[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            Companion = new a(null);
            visitorMessageTypes = CollectionsKt.listOf((Object[]) new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7});
            nonEditableMessageTypes = CollectionsKt.listOf((Object[]) new g[]{gVar, gVar3, gVar4, gVar5, gVar6});
            nonDeletableMessageTypes = CollectionsKt.listOf(gVar);
        }

        private g(String str, int i10, String str2) {
            this.stringValue = str2;
        }

        @JvmStatic
        @NotNull
        public static final g from(@NotNull String str) {
            return Companion.a(str);
        }

        @NotNull
        public static EnumEntries<g> getEntries() {
            return $ENTRIES;
        }

        @JvmStatic
        public static final boolean isVisitorMessageType(@NotNull g gVar) {
            return Companion.b(gVar);
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }

        @NotNull
        public final String getStringValue() {
            return this.stringValue;
        }

        public final boolean isDeletable() {
            return !nonDeletableMessageTypes.contains(this);
        }

        public final boolean isEditable() {
            return !nonEditableMessageTypes.contains(this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2) {
        this(str, str2, chatId, messageType, status, id2, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -64, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @JvmStatic
    @NotNull
    public static final Message addAttachment(@NotNull Message message, @NotNull Attachment attachment) {
        return INSTANCE.a(message, attachment);
    }

    public static /* synthetic */ Message copy$default(Message message, String str, String str2, String str3, g gVar, f fVar, String str4, String str5, Integer num, String str6, String str7, long j10, long j11, String str8, String str9, b bVar, Long l10, String str10, Attachment attachment, Meta meta, RespondedMessage respondedMessage, boolean z10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, d dVar, InfoMessage infoMessage, Extras extras, long j12, long j13, long j14, Message message2, List list, String str11, Long l11, String str12, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str13, int i10, int i11, Object obj) {
        String str14 = (i10 & 1) != 0 ? message.acknowledgementKey : str;
        String str15 = (i10 & 2) != 0 ? message.conversationId : str2;
        String str16 = (i10 & 4) != 0 ? message.chatId : str3;
        g gVar2 = (i10 & 8) != 0 ? message.messageType : gVar;
        f fVar2 = (i10 & 16) != 0 ? message.status : fVar;
        String str17 = (i10 & 32) != 0 ? message.id : str4;
        String str18 = (i10 & 64) != 0 ? message.uniqueID : str5;
        Integer num2 = (i10 & 128) != 0 ? message.messageStringResourceId : num;
        String str19 = (i10 & 256) != 0 ? message.content : str6;
        String str20 = (i10 & 512) != 0 ? message.comment : str7;
        long j15 = (i10 & 1024) != 0 ? message.serverTime : j10;
        String str21 = str14;
        String str22 = str15;
        long j16 = (i10 & 2048) != 0 ? message.clientTime : j11;
        return message.copy(str21, str22, str16, gVar2, fVar2, str17, str18, num2, str19, str20, j15, j16, (i10 & 4096) != 0 ? message.sender : str8, (i10 & 8192) != 0 ? message.senderName : str9, (i10 & 16384) != 0 ? message.displayName : bVar, (i10 & 32768) != 0 ? message.sequenceId : l10, (i10 & PKIFailureInfo.notAuthorized) != 0 ? message.rChatId : str10, (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? message.attachment : attachment, (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? message.meta : meta, (i10 & PKIFailureInfo.signerNotTrusted) != 0 ? message.respondedMessage : respondedMessage, (i10 & PKIFailureInfo.badCertTemplate) != 0 ? message.isBot : z10, (i10 & PKIFailureInfo.badSenderNonce) != 0 ? message.isRead : bool, (i10 & 4194304) != 0 ? message.isTyping : bool2, (i10 & 8388608) != 0 ? message.isEdited : bool3, (i10 & 16777216) != 0 ? message.isDeleted : bool4, (i10 & 33554432) != 0 ? message.mode : dVar, (i10 & AudioRoutingController.DEVICE_OUT_USB_HEADSET) != 0 ? message.infoMessage : infoMessage, (i10 & 134217728) != 0 ? message.extras : extras, (i10 & 268435456) != 0 ? message.editedTime : j12, (i10 & PKIFailureInfo.duplicateCertReq) != 0 ? message.deletedTime : j13, (i10 & 1073741824) != 0 ? message.previousMessageTime : j14, (i10 & Integer.MIN_VALUE) != 0 ? message.replyTo : message2, (i11 & 1) != 0 ? message.markdowns : list, (i11 & 2) != 0 ? message.rawContent : str11, (i11 & 4) != 0 ? message.consecutiveDeletedCount : l11, (i11 & 8) != 0 ? message.timeDifferenceContent : str12, (i11 & 16) != 0 ? message.isFirstMessage : z11, (i11 & 32) != 0 ? message.isLastMessage : z12, (i11 & 64) != 0 ? message.isRightAligned : z13, (i11 & 128) != 0 ? message.canShowSenderAvatar : z14, (i11 & 256) != 0 ? message.canShowSenderName : z15, (i11 & 512) != 0 ? message.formattedClientTime : str13);
    }

    @JvmStatic
    @NotNull
    public static final Message newInstance(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull g gVar, @NotNull f fVar, long j10, @NotNull String str4, @Nullable String str5, long j11, long j12, @Nullable String str6, @Nullable String str7, @Nullable Meta meta, @Nullable Integer num) {
        return INSTANCE.b(str, str2, str3, gVar, fVar, j10, str4, str5, j11, j12, str6, str7, meta, num);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAcknowledgementKey() {
        return this.acknowledgementKey;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* renamed from: component11, reason: from getter */
    public final long getServerTime() {
        return this.serverTime;
    }

    /* renamed from: component12, reason: from getter */
    public final long getClientTime() {
        return this.clientTime;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getSender() {
        return this.sender;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getSenderName() {
        return this.senderName;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final b getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Long getSequenceId() {
        return this.sequenceId;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getRChatId() {
        return this.rChatId;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Attachment getAttachment() {
        return this.attachment;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final RespondedMessage getRespondedMessage() {
        return this.respondedMessage;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsBot() {
        return this.isBot;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Boolean getIsRead() {
        return this.isRead;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Boolean getIsTyping() {
        return this.isTyping;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Boolean getIsEdited() {
        return this.isEdited;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Boolean getIsDeleted() {
        return this.isDeleted;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final d getMode() {
        return this.mode;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final InfoMessage getInfoMessage() {
        return this.infoMessage;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Extras getExtras() {
        return this.extras;
    }

    /* renamed from: component29, reason: from getter */
    public final long getEditedTime() {
        return this.editedTime;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component30, reason: from getter */
    public final long getDeletedTime() {
        return this.deletedTime;
    }

    /* renamed from: component31, reason: from getter */
    public final long getPreviousMessageTime() {
        return this.previousMessageTime;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Message getReplyTo() {
        return this.replyTo;
    }

    @Nullable
    public final List<c> component33() {
        return this.markdowns;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final String getRawContent() {
        return this.rawContent;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Long getConsecutiveDeletedCount() {
        return this.consecutiveDeletedCount;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final String getTimeDifferenceContent() {
        return this.timeDifferenceContent;
    }

    /* renamed from: component37, reason: from getter */
    public final boolean getIsFirstMessage() {
        return this.isFirstMessage;
    }

    /* renamed from: component38, reason: from getter */
    public final boolean getIsLastMessage() {
        return this.isLastMessage;
    }

    /* renamed from: component39, reason: from getter */
    public final boolean getIsRightAligned() {
        return this.isRightAligned;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final g getMessageType() {
        return this.messageType;
    }

    /* renamed from: component40, reason: from getter */
    public final boolean getCanShowSenderAvatar() {
        return this.canShowSenderAvatar;
    }

    /* renamed from: component41, reason: from getter */
    public final boolean getCanShowSenderName() {
        return this.canShowSenderName;
    }

    @Nullable
    /* renamed from: component42, reason: from getter */
    public final String getFormattedClientTime() {
        return this.formattedClientTime;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final f getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getUniqueID() {
        return this.uniqueID;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getMessageStringResourceId() {
        return this.messageStringResourceId;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final Message copy(@Nullable String acknowledgementKey, @Nullable String conversationId, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer messageStringResourceId, @Nullable String content, @Nullable String comment, long serverTime, long clientTime, @Nullable String sender, @Nullable String senderName, @Nullable b displayName, @Nullable Long sequenceId, @Nullable String rChatId, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean isBot, @Nullable Boolean isRead, @Nullable Boolean isTyping, @Nullable Boolean isEdited, @Nullable Boolean isDeleted, @Nullable d mode, @Nullable InfoMessage infoMessage, @Nullable Extras extras, long editedTime, long deletedTime, long previousMessageTime, @Nullable Message replyTo, @Nullable List<? extends c> markdowns, @Nullable String rawContent, @Nullable Long consecutiveDeletedCount, @Nullable String timeDifferenceContent, boolean isFirstMessage, boolean isLastMessage, boolean isRightAligned, boolean canShowSenderAvatar, boolean canShowSenderName, @Nullable String formattedClientTime) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
        return new Message(acknowledgementKey, conversationId, chatId, messageType, status, id2, uniqueID, messageStringResourceId, content, comment, serverTime, clientTime, sender, senderName, displayName, sequenceId, rChatId, attachment, meta, respondedMessage, isBot, isRead, isTyping, isEdited, isDeleted, mode, infoMessage, extras, editedTime, deletedTime, previousMessageTime, replyTo, markdowns, rawContent, consecutiveDeletedCount, timeDifferenceContent, isFirstMessage, isLastMessage, isRightAligned, canShowSenderAvatar, canShowSenderName, formattedClientTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        return Intrinsics.areEqual(this.acknowledgementKey, message.acknowledgementKey) && Intrinsics.areEqual(this.conversationId, message.conversationId) && Intrinsics.areEqual(this.chatId, message.chatId) && this.messageType == message.messageType && this.status == message.status && Intrinsics.areEqual(this.id, message.id) && Intrinsics.areEqual(this.uniqueID, message.uniqueID) && Intrinsics.areEqual(this.messageStringResourceId, message.messageStringResourceId) && Intrinsics.areEqual(this.content, message.content) && Intrinsics.areEqual(this.comment, message.comment) && this.serverTime == message.serverTime && this.clientTime == message.clientTime && Intrinsics.areEqual(this.sender, message.sender) && Intrinsics.areEqual(this.senderName, message.senderName) && Intrinsics.areEqual(this.displayName, message.displayName) && Intrinsics.areEqual(this.sequenceId, message.sequenceId) && Intrinsics.areEqual(this.rChatId, message.rChatId) && Intrinsics.areEqual(this.attachment, message.attachment) && Intrinsics.areEqual(this.meta, message.meta) && Intrinsics.areEqual(this.respondedMessage, message.respondedMessage) && this.isBot == message.isBot && Intrinsics.areEqual(this.isRead, message.isRead) && Intrinsics.areEqual(this.isTyping, message.isTyping) && Intrinsics.areEqual(this.isEdited, message.isEdited) && Intrinsics.areEqual(this.isDeleted, message.isDeleted) && this.mode == message.mode && Intrinsics.areEqual(this.infoMessage, message.infoMessage) && Intrinsics.areEqual(this.extras, message.extras) && this.editedTime == message.editedTime && this.deletedTime == message.deletedTime && this.previousMessageTime == message.previousMessageTime && Intrinsics.areEqual(this.replyTo, message.replyTo) && Intrinsics.areEqual(this.markdowns, message.markdowns) && Intrinsics.areEqual(this.rawContent, message.rawContent) && Intrinsics.areEqual(this.consecutiveDeletedCount, message.consecutiveDeletedCount) && Intrinsics.areEqual(this.timeDifferenceContent, message.timeDifferenceContent) && this.isFirstMessage == message.isFirstMessage && this.isLastMessage == message.isLastMessage && this.isRightAligned == message.isRightAligned && this.canShowSenderAvatar == message.canShowSenderAvatar && this.canShowSenderName == message.canShowSenderName && Intrinsics.areEqual(this.formattedClientTime, message.formattedClientTime);
    }

    @Nullable
    public final String getAcknowledgementKey() {
        return this.acknowledgementKey;
    }

    @Nullable
    public final Attachment getAttachment() {
        return this.attachment;
    }

    public final boolean getCanShowSenderAvatar() {
        return this.canShowSenderAvatar;
    }

    public final boolean getCanShowSenderName() {
        return this.canShowSenderName;
    }

    @NotNull
    public final String getChatId() {
        return this.chatId;
    }

    public final long getClientTime() {
        return this.clientTime;
    }

    @Nullable
    public final String getComment() {
        return this.comment;
    }

    @Nullable
    public final Long getConsecutiveDeletedCount() {
        return this.consecutiveDeletedCount;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getConversationId() {
        return this.conversationId;
    }

    public final long getDeletedTime() {
        return this.deletedTime;
    }

    @Nullable
    public final b getDisplayName() {
        return this.displayName;
    }

    public final long getEditedTime() {
        return this.editedTime;
    }

    @Nullable
    public final Extras getExtras() {
        return this.extras;
    }

    @Nullable
    public final String getFormattedClientTime() {
        return this.formattedClientTime;
    }

    public final boolean getHasComment() {
        return i.f(this.comment);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final InfoMessage getInfoMessage() {
        return this.infoMessage;
    }

    @Nullable
    public final List<c> getMarkdowns() {
        return this.markdowns;
    }

    @Nullable
    public final Integer getMessageStringResourceId() {
        return this.messageStringResourceId;
    }

    @NotNull
    public final g getMessageType() {
        return this.messageType;
    }

    @Nullable
    public final Meta getMeta() {
        return this.meta;
    }

    @Nullable
    public final d getMode() {
        return this.mode;
    }

    public final long getPreviousMessageTime() {
        return this.previousMessageTime;
    }

    @Nullable
    public final String getRChatId() {
        return this.rChatId;
    }

    @Nullable
    public final String getRawContent() {
        return this.rawContent;
    }

    @Nullable
    public final Message getReplyTo() {
        return this.replyTo;
    }

    @Nullable
    public final RespondedMessage getRespondedMessage() {
        return this.respondedMessage;
    }

    @Nullable
    public final String getSender() {
        return this.sender;
    }

    @Nullable
    public final String getSenderName() {
        return this.senderName;
    }

    @Nullable
    public final Long getSequenceId() {
        return this.sequenceId;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    @NotNull
    public final f getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTimeDifferenceContent() {
        return this.timeDifferenceContent;
    }

    @NotNull
    public final String getUniqueID() {
        return this.uniqueID;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.acknowledgementKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.conversationId;
        int hashCode2 = (((((((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.chatId.hashCode()) * 31) + this.messageType.hashCode()) * 31) + this.status.hashCode()) * 31) + this.id.hashCode()) * 31) + this.uniqueID.hashCode()) * 31;
        Integer num = this.messageStringResourceId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.content;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.comment;
        int hashCode5 = (((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Long.hashCode(this.serverTime)) * 31) + Long.hashCode(this.clientTime)) * 31;
        String str5 = this.sender;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.senderName;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        b bVar = this.displayName;
        int hashCode8 = (hashCode7 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Long l10 = this.sequenceId;
        int hashCode9 = (hashCode8 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str7 = this.rChatId;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Attachment attachment = this.attachment;
        int hashCode11 = (hashCode10 + (attachment == null ? 0 : attachment.hashCode())) * 31;
        Meta meta = this.meta;
        int hashCode12 = (hashCode11 + (meta == null ? 0 : meta.hashCode())) * 31;
        RespondedMessage respondedMessage = this.respondedMessage;
        int hashCode13 = (hashCode12 + (respondedMessage == null ? 0 : respondedMessage.hashCode())) * 31;
        boolean z10 = this.isBot;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode13 + i10) * 31;
        Boolean bool = this.isRead;
        int hashCode14 = (i11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isTyping;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isEdited;
        int hashCode16 = (hashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isDeleted;
        int hashCode17 = (hashCode16 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        d dVar = this.mode;
        int hashCode18 = (hashCode17 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        InfoMessage infoMessage = this.infoMessage;
        int hashCode19 = (hashCode18 + (infoMessage == null ? 0 : infoMessage.hashCode())) * 31;
        Extras extras = this.extras;
        int hashCode20 = (((((((hashCode19 + (extras == null ? 0 : extras.hashCode())) * 31) + Long.hashCode(this.editedTime)) * 31) + Long.hashCode(this.deletedTime)) * 31) + Long.hashCode(this.previousMessageTime)) * 31;
        Message message = this.replyTo;
        int hashCode21 = (hashCode20 + (message == null ? 0 : message.hashCode())) * 31;
        List<c> list = this.markdowns;
        int hashCode22 = (hashCode21 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.rawContent;
        int hashCode23 = (hashCode22 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l11 = this.consecutiveDeletedCount;
        int hashCode24 = (hashCode23 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str9 = this.timeDifferenceContent;
        int hashCode25 = (hashCode24 + (str9 == null ? 0 : str9.hashCode())) * 31;
        boolean z11 = this.isFirstMessage;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (hashCode25 + i12) * 31;
        boolean z12 = this.isLastMessage;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.isRightAligned;
        int i16 = z13;
        if (z13 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z14 = this.canShowSenderAvatar;
        int i18 = z14;
        if (z14 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z15 = this.canShowSenderName;
        int i20 = (i19 + (z15 ? 1 : z15 ? 1 : 0)) * 31;
        String str10 = this.formattedClientTime;
        return i20 + (str10 != null ? str10.hashCode() : 0);
    }

    public final boolean isBot() {
        return this.isBot;
    }

    public final boolean isChainedMessage() {
        Extras extras = this.extras;
        return AbstractC5891c.d(extras != null ? extras.getChainedMessageIds() : null);
    }

    @Nullable
    public final Boolean isDeleted() {
        return this.isDeleted;
    }

    public final boolean isDepartmentForm() {
        Meta meta = this.meta;
        return (meta != null ? Intrinsics.areEqual(meta.isFormMessage(), Boolean.TRUE) : false) && this.meta.getSuggestions() != null;
    }

    @Nullable
    public final Boolean isEdited() {
        return this.isEdited;
    }

    public final boolean isFirstMessage() {
        return this.isFirstMessage;
    }

    public final boolean isInputCard() {
        Meta.InputCard inputCard;
        if (!this.isBot) {
            return false;
        }
        Meta meta = this.meta;
        return (((meta == null || (inputCard = meta.getInputCard()) == null) ? null : inputCard.getType()) == null || isUnImplementedCard()) ? false : true;
    }

    public final boolean isLastMessage() {
        return this.isLastMessage;
    }

    @Nullable
    public final Boolean isRead() {
        return this.isRead;
    }

    public final boolean isRightAligned() {
        return this.isRightAligned;
    }

    @Nullable
    public final Boolean isTyping() {
        return this.isTyping;
    }

    public final boolean isUnImplementedCard() {
        Meta.InputCard inputCard;
        Meta meta = this.meta;
        return ((meta == null || (inputCard = meta.getInputCard()) == null) ? null : inputCard.getType()) == g.WidgetCompany;
    }

    public final void setFormattedClientTime(@Nullable String str) {
        this.formattedClientTime = str;
    }

    public final void setStatus(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.status = fVar;
    }

    @NotNull
    public String toString() {
        return "Message(acknowledgementKey=" + this.acknowledgementKey + ", conversationId=" + this.conversationId + ", chatId=" + this.chatId + ", messageType=" + this.messageType + ", status=" + this.status + ", id=" + this.id + ", uniqueID=" + this.uniqueID + ", messageStringResourceId=" + this.messageStringResourceId + ", content=" + this.content + ", comment=" + this.comment + ", serverTime=" + this.serverTime + ", clientTime=" + this.clientTime + ", sender=" + this.sender + ", senderName=" + this.senderName + ", displayName=" + this.displayName + ", sequenceId=" + this.sequenceId + ", rChatId=" + this.rChatId + ", attachment=" + this.attachment + ", meta=" + this.meta + ", respondedMessage=" + this.respondedMessage + ", isBot=" + this.isBot + ", isRead=" + this.isRead + ", isTyping=" + this.isTyping + ", isEdited=" + this.isEdited + ", isDeleted=" + this.isDeleted + ", mode=" + this.mode + ", infoMessage=" + this.infoMessage + ", extras=" + this.extras + ", editedTime=" + this.editedTime + ", deletedTime=" + this.deletedTime + ", previousMessageTime=" + this.previousMessageTime + ", replyTo=" + this.replyTo + ", markdowns=" + this.markdowns + ", rawContent=" + this.rawContent + ", consecutiveDeletedCount=" + this.consecutiveDeletedCount + ", timeDifferenceContent=" + this.timeDifferenceContent + ", isFirstMessage=" + this.isFirstMessage + ", isLastMessage=" + this.isLastMessage + ", isRightAligned=" + this.isRightAligned + ", canShowSenderAvatar=" + this.canShowSenderAvatar + ", canShowSenderName=" + this.canShowSenderName + ", formattedClientTime=" + this.formattedClientTime + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -128, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    @JvmStatic
    @NotNull
    public static final Message newInstance(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull g gVar, @NotNull f fVar, long j10, @NotNull String str4, @Nullable String str5, long j11, long j12, @Nullable String str6, @Nullable String str7, @Nullable RespondedMessage respondedMessage) {
        return INSTANCE.c(str, str2, str3, gVar, fVar, j10, str4, str5, j11, j12, str6, str7, respondedMessage);
    }

    @Keep
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bn\b\u0087\b\u0018\u00002\u00020\u0001:\u0010\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001BÉ\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000e\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0015\u0012\b\u0010!\u001a\u0004\u0018\u00010\n\u0012\b\u0010\"\u001a\u0004\u0018\u00010\n\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010-\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bB\u00105J\u0012\u0010C\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bE\u00105J\u0018\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bF\u0010=J\u0012\u0010G\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bG\u00105J\u0012\u0010H\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bH\u0010DJ\u0012\u0010I\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bK\u0010JJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bL\u0010DJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bM\u0010DJ\u0012\u0010N\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bN\u00109J\u0012\u0010O\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bO\u00109J\u0012\u0010P\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bP\u0010?J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bQ\u0010DJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bR\u00105J\u0012\u0010S\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bS\u0010DJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bT\u0010DJ\u0012\u0010U\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bW\u00105J\u0012\u0010X\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bX\u0010DJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bY\u0010DJ\u0010\u0010Z\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bZ\u0010[J\u008e\u0003\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010-\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b^\u0010DJ\u0010\u0010_\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b_\u0010`J\u001a\u0010b\u001a\u00020\u00062\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bb\u0010cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010d\u001a\u0004\be\u00101R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010f\u001a\u0004\bg\u00103R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010h\u001a\u0004\bi\u00105R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010j\u001a\u0004\bk\u00107R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010l\u001a\u0004\bm\u00109R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010n\u001a\u0004\bo\u0010;R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010p\u001a\u0004\bq\u0010=R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010r\u001a\u0004\bs\u0010?R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010t\u001a\u0004\bu\u0010AR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010h\u001a\u0004\b\u0014\u00105R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010v\u001a\u0004\bw\u0010DR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010h\u001a\u0004\b\u0017\u00105R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010p\u001a\u0004\bx\u0010=R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010h\u001a\u0004\by\u00105R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010v\u001a\u0004\bz\u0010DR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010{\u001a\u0004\b|\u0010JR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010{\u001a\u0004\b}\u0010JR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010v\u001a\u0004\b~\u0010DR\u001c\u0010 \u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010v\u001a\u0004\b\u007f\u0010DR\u001d\u0010!\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b!\u0010l\u001a\u0005\b\u0080\u0001\u00109R\u001d\u0010\"\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\"\u0010l\u001a\u0005\b\u0081\u0001\u00109R\u001d\u0010#\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\r\n\u0004\b#\u0010r\u001a\u0005\b\u0082\u0001\u0010?R\u001d\u0010$\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\r\n\u0004\b$\u0010v\u001a\u0005\b\u0083\u0001\u0010DR\u001d\u0010%\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\r\n\u0004\b%\u0010h\u001a\u0005\b\u0084\u0001\u00105R\u001d\u0010&\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\r\n\u0004\b&\u0010v\u001a\u0005\b\u0085\u0001\u0010DR\u001d\u0010'\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\r\n\u0004\b'\u0010v\u001a\u0005\b\u0086\u0001\u0010DR\u001e\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010VR\u001d\u0010*\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\r\n\u0004\b*\u0010h\u001a\u0005\b\u0089\u0001\u00105R\u001d\u0010+\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\r\n\u0004\b+\u0010v\u001a\u0005\b\u008a\u0001\u0010DR\u001d\u0010,\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\r\n\u0004\b,\u0010v\u001a\u0005\b\u008b\u0001\u0010DR\u001c\u0010-\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b-\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010[¨\u0006\u0096\u0001"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta;", "", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard;", "displayCard", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$InputCard;", "inputCard", "", "canHandOff", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$HandOffConfiguration;", "handOffConfiguration", "", "typingDelay", "", "version", "", "suggestions", "Lcom/google/gson/h;", "operationUser", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$CardData;", "cardData", "isSkippable", "", "action", "isFormMessage", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$a;", "campaignSuggestions", "hideInput", "resourceType", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;", "creator", "lastModifier", "resourceTitle", "behaviour", "lastModifiedTime", "createdTime", "userList", "mode", "allowTyping", "resourceId", "fieldName", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$b;", "metaType", "hasCustomMessage", "format", "type", "hideCustomMessage", "<init>", "(Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$InputCard;Ljava/lang/Boolean;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$HandOffConfiguration;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Lcom/google/gson/h;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$CardData;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/google/gson/h;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$b;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard;", "component2", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$InputCard;", "component3", "()Ljava/lang/Boolean;", "component4", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$HandOffConfiguration;", "component5", "()Ljava/lang/Long;", "component6", "()Ljava/lang/Integer;", "component7", "()Ljava/util/List;", "component8", "()Lcom/google/gson/h;", "component9", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$CardData;", "component10", "component11", "()Ljava/lang/String;", "component12", "component13", "component14", "component15", "component16", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$b;", "component28", "component29", "component30", "component31", "()Z", "copy", "(Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$InputCard;Ljava/lang/Boolean;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$HandOffConfiguration;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Lcom/google/gson/h;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$CardData;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/google/gson/h;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$b;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Z)Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard;", "getDisplayCard", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$InputCard;", "getInputCard", "Ljava/lang/Boolean;", "getCanHandOff", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$HandOffConfiguration;", "getHandOffConfiguration", "Ljava/lang/Long;", "getTypingDelay", "Ljava/lang/Integer;", "getVersion", "Ljava/util/List;", "getSuggestions", "Lcom/google/gson/h;", "getOperationUser", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$CardData;", "getCardData", "Ljava/lang/String;", "getAction", "getCampaignSuggestions", "getHideInput", "getResourceType", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;", "getCreator", "getLastModifier", "getResourceTitle", "getBehaviour", "getLastModifiedTime", "getCreatedTime", "getUserList", "getMode", "getAllowTyping", "getResourceId", "getFieldName", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$b;", "getMetaType", "getHasCustomMessage", "getFormat", "getType", "Z", "getHideCustomMessage", "Action", "a", "CardData", "DisplayCard", "Element", "HandOffConfiguration", "InputCard", com.google.crypto.tink.integration.android.b.f37029b, "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Meta {

        @Gb.c("action")
        @Nullable
        private final String action;

        @Gb.c("allow_typing")
        @Nullable
        private final Boolean allowTyping;

        @Gb.c("behaviour")
        @Nullable
        private final String behaviour;

        @Gb.c("campaign_suggestions")
        @Nullable
        private final List<a> campaignSuggestions;

        @Gb.c("hand_off")
        @Nullable
        private final Boolean canHandOff;

        @Gb.c("card_data")
        @Nullable
        private final CardData cardData;

        @Gb.c("created_time")
        @Nullable
        private final Long createdTime;

        @Gb.c("creator")
        @Nullable
        private final User creator;

        @Gb.c("display_card")
        @Nullable
        private final DisplayCard displayCard;

        @Gb.c("field_name")
        @Nullable
        private final String fieldName;

        @Gb.c("format")
        @Nullable
        private final String format;

        @Gb.c("handoff_config")
        @Nullable
        private final HandOffConfiguration handOffConfiguration;

        @Gb.c("has_custom_message")
        @Nullable
        private final Boolean hasCustomMessage;

        @Gb.c("hide_custom_message")
        private final boolean hideCustomMessage;

        @Gb.c("hide_input")
        @Nullable
        private final Boolean hideInput;

        @Gb.c("input_card")
        @Nullable
        private final InputCard inputCard;

        @Gb.c("form_msg")
        @Nullable
        private final Boolean isFormMessage;

        @Gb.c("skippable")
        @Nullable
        private final Boolean isSkippable;

        @Gb.c("last_modified_time")
        @Nullable
        private final Long lastModifiedTime;

        @Gb.c("last_modifier")
        @Nullable
        private final User lastModifier;

        @Gb.c("meta_type")
        @Nullable
        private final b metaType;

        @Gb.c("mode")
        @Nullable
        private final String mode;

        @Gb.c("operation_user")
        @Nullable
        private final h operationUser;

        @Gb.c(StackTraceHelper.ID_KEY)
        @Nullable
        private final String resourceId;

        @Gb.c("title")
        @Nullable
        private final String resourceTitle;

        @Gb.c("resource_type")
        @Nullable
        private final String resourceType;

        @Gb.c("suggestions")
        @Nullable
        private final List<Object> suggestions;

        @Gb.c("type")
        @Nullable
        private final String type;

        @Gb.c("typing_delay")
        @Nullable
        private final Long typingDelay;

        @Gb.c("user_list")
        @Nullable
        private final h userList;

        @Gb.c("version")
        @Nullable
        private final Integer version;

        @Keep
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$Action;", "", AnnotatedPrivateKey.LABEL, "", "name", "type", "link", "clientActionName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientActionName", "()Ljava/lang/String;", "getLabel", "getLink", "getName", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Action {

            @Gb.c("clientaction_name")
            @Nullable
            private final String clientActionName;

            @Gb.c(AnnotatedPrivateKey.LABEL)
            @Nullable
            private final String label;

            @Gb.c("link")
            @Nullable
            private final String link;

            @Gb.c("name")
            @Nullable
            private final String name;

            @Gb.c("type")
            @Nullable
            private final String type;

            public Action(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
                this.label = str;
                this.name = str2;
                this.type = str3;
                this.link = str4;
                this.clientActionName = str5;
            }

            public static /* synthetic */ Action copy$default(Action action, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = action.label;
                }
                if ((i10 & 2) != 0) {
                    str2 = action.name;
                }
                if ((i10 & 4) != 0) {
                    str3 = action.type;
                }
                if ((i10 & 8) != 0) {
                    str4 = action.link;
                }
                if ((i10 & 16) != 0) {
                    str5 = action.clientActionName;
                }
                String str6 = str5;
                String str7 = str3;
                return action.copy(str, str2, str7, str4, str6);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @Nullable
            /* renamed from: component3, reason: from getter */
            public final String getType() {
                return this.type;
            }

            @Nullable
            /* renamed from: component4, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            @Nullable
            /* renamed from: component5, reason: from getter */
            public final String getClientActionName() {
                return this.clientActionName;
            }

            @NotNull
            public final Action copy(@Nullable String label, @Nullable String name, @Nullable String type, @Nullable String link, @Nullable String clientActionName) {
                return new Action(label, name, type, link, clientActionName);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Action)) {
                    return false;
                }
                Action action = (Action) other;
                return Intrinsics.areEqual(this.label, action.label) && Intrinsics.areEqual(this.name, action.name) && Intrinsics.areEqual(this.type, action.type) && Intrinsics.areEqual(this.link, action.link) && Intrinsics.areEqual(this.clientActionName, action.clientActionName);
            }

            @Nullable
            public final String getClientActionName() {
                return this.clientActionName;
            }

            @Nullable
            public final String getLabel() {
                return this.label;
            }

            @Nullable
            public final String getLink() {
                return this.link;
            }

            @Nullable
            public final String getName() {
                return this.name;
            }

            @Nullable
            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                String str = this.label;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.name;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.type;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.link;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.clientActionName;
                return hashCode4 + (str5 != null ? str5.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Action(label=" + this.label + ", name=" + this.name + ", type=" + this.type + ", link=" + this.link + ", clientActionName=" + this.clientActionName + ')';
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$CardData;", "", "type", "", EventKeys.VALUE_KEY, "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$CardData$Value;", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$CardData$Value;)V", "getType", "()Ljava/lang/String;", "getValue", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$CardData$Value;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Value", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CardData {

            @Gb.c("type")
            @Nullable
            private final String type;

            @Gb.c(EventKeys.VALUE_KEY)
            @Nullable
            private final Value value;

            @Keep
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$CardData$Value;", "", "image", "", "latitude", "longitude", "state", "street", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getLatitude", "getLongitude", "getState", "getStreet", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Value {

                @Gb.c("image")
                @Nullable
                private final String image;

                @Gb.c("lat")
                @Nullable
                private final String latitude;

                @Gb.c("lng")
                @Nullable
                private final String longitude;

                @Gb.c("state")
                @Nullable
                private final String state;

                @Gb.c("street")
                @Nullable
                private final String street;

                public Value(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
                    this.image = str;
                    this.latitude = str2;
                    this.longitude = str3;
                    this.state = str4;
                    this.street = str5;
                }

                public static /* synthetic */ Value copy$default(Value value, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = value.image;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = value.latitude;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = value.longitude;
                    }
                    if ((i10 & 8) != 0) {
                        str4 = value.state;
                    }
                    if ((i10 & 16) != 0) {
                        str5 = value.street;
                    }
                    String str6 = str5;
                    String str7 = str3;
                    return value.copy(str, str2, str7, str4, str6);
                }

                @Nullable
                /* renamed from: component1, reason: from getter */
                public final String getImage() {
                    return this.image;
                }

                @Nullable
                /* renamed from: component2, reason: from getter */
                public final String getLatitude() {
                    return this.latitude;
                }

                @Nullable
                /* renamed from: component3, reason: from getter */
                public final String getLongitude() {
                    return this.longitude;
                }

                @Nullable
                /* renamed from: component4, reason: from getter */
                public final String getState() {
                    return this.state;
                }

                @Nullable
                /* renamed from: component5, reason: from getter */
                public final String getStreet() {
                    return this.street;
                }

                @NotNull
                public final Value copy(@Nullable String image, @Nullable String latitude, @Nullable String longitude, @Nullable String state, @Nullable String street) {
                    return new Value(image, latitude, longitude, state, street);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Value)) {
                        return false;
                    }
                    Value value = (Value) other;
                    return Intrinsics.areEqual(this.image, value.image) && Intrinsics.areEqual(this.latitude, value.latitude) && Intrinsics.areEqual(this.longitude, value.longitude) && Intrinsics.areEqual(this.state, value.state) && Intrinsics.areEqual(this.street, value.street);
                }

                @Nullable
                public final String getImage() {
                    return this.image;
                }

                @Nullable
                public final String getLatitude() {
                    return this.latitude;
                }

                @Nullable
                public final String getLongitude() {
                    return this.longitude;
                }

                @Nullable
                public final String getState() {
                    return this.state;
                }

                @Nullable
                public final String getStreet() {
                    return this.street;
                }

                public int hashCode() {
                    String str = this.image;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.latitude;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.longitude;
                    int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.state;
                    int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    String str5 = this.street;
                    return hashCode4 + (str5 != null ? str5.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "Value(image=" + this.image + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", state=" + this.state + ", street=" + this.street + ')';
                }
            }

            public CardData(@Nullable String str, @Nullable Value value) {
                this.type = str;
                this.value = value;
            }

            public static /* synthetic */ CardData copy$default(CardData cardData, String str, Value value, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = cardData.type;
                }
                if ((i10 & 2) != 0) {
                    value = cardData.value;
                }
                return cardData.copy(str, value);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final Value getValue() {
                return this.value;
            }

            @NotNull
            public final CardData copy(@Nullable String type, @Nullable Value value) {
                return new CardData(type, value);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CardData)) {
                    return false;
                }
                CardData cardData = (CardData) other;
                return Intrinsics.areEqual(this.type, cardData.type) && Intrinsics.areEqual(this.value, cardData.value);
            }

            @Nullable
            public final String getType() {
                return this.type;
            }

            @Nullable
            public final Value getValue() {
                return this.value;
            }

            public int hashCode() {
                String str = this.type;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Value value = this.value;
                return hashCode + (value != null ? value.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "CardData(type=" + this.type + ", value=" + this.value + ')';
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JK\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$Element;", "", StackTraceHelper.ID_KEY, "", "image", "title", "subTitle", "actions", "", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$Action;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getImage", "getSubTitle", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Element {

            @Gb.c("actions")
            @Nullable
            private final List<Action> actions;

            @Gb.c(StackTraceHelper.ID_KEY)
            @Nullable
            private final String id;

            @Gb.c("image")
            @Nullable
            private final String image;

            @Gb.c("subtitle")
            @Nullable
            private final String subTitle;

            @Gb.c("title")
            @Nullable
            private final String title;

            public Element(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<Action> list) {
                this.id = str;
                this.image = str2;
                this.title = str3;
                this.subTitle = str4;
                this.actions = list;
            }

            public static /* synthetic */ Element copy$default(Element element, String str, String str2, String str3, String str4, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = element.id;
                }
                if ((i10 & 2) != 0) {
                    str2 = element.image;
                }
                if ((i10 & 4) != 0) {
                    str3 = element.title;
                }
                if ((i10 & 8) != 0) {
                    str4 = element.subTitle;
                }
                if ((i10 & 16) != 0) {
                    list = element.actions;
                }
                List list2 = list;
                String str5 = str3;
                return element.copy(str, str2, str5, str4, list2);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            @Nullable
            /* renamed from: component3, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @Nullable
            /* renamed from: component4, reason: from getter */
            public final String getSubTitle() {
                return this.subTitle;
            }

            @Nullable
            public final List<Action> component5() {
                return this.actions;
            }

            @NotNull
            public final Element copy(@Nullable String id2, @Nullable String image, @Nullable String title, @Nullable String subTitle, @Nullable List<Action> actions) {
                return new Element(id2, image, title, subTitle, actions);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Element)) {
                    return false;
                }
                Element element = (Element) other;
                return Intrinsics.areEqual(this.id, element.id) && Intrinsics.areEqual(this.image, element.image) && Intrinsics.areEqual(this.title, element.title) && Intrinsics.areEqual(this.subTitle, element.subTitle) && Intrinsics.areEqual(this.actions, element.actions);
            }

            @Nullable
            public final List<Action> getActions() {
                return this.actions;
            }

            @Nullable
            public final String getId() {
                return this.id;
            }

            @Nullable
            public final String getImage() {
                return this.image;
            }

            @Nullable
            public final String getSubTitle() {
                return this.subTitle;
            }

            @Nullable
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.id;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.image;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.title;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.subTitle;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                List<Action> list = this.actions;
                return hashCode4 + (list != null ? list.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Element(id=" + this.id + ", image=" + this.image + ", title=" + this.title + ", subTitle=" + this.subTitle + ", actions=" + this.actions + ')';
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$HandOffConfiguration;", "", "type", "", "text", "acknowledgement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcknowledgement", "()Ljava/lang/String;", "getText", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class HandOffConfiguration {

            @Gb.c("ack")
            @NotNull
            private final String acknowledgement;

            @Gb.c("text")
            @Nullable
            private final String text;

            @Gb.c("type")
            @Nullable
            private final String type;

            public HandOffConfiguration(@Nullable String str, @Nullable String str2, @NotNull String acknowledgement) {
                Intrinsics.checkNotNullParameter(acknowledgement, "acknowledgement");
                this.type = str;
                this.text = str2;
                this.acknowledgement = acknowledgement;
            }

            public static /* synthetic */ HandOffConfiguration copy$default(HandOffConfiguration handOffConfiguration, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = handOffConfiguration.type;
                }
                if ((i10 & 2) != 0) {
                    str2 = handOffConfiguration.text;
                }
                if ((i10 & 4) != 0) {
                    str3 = handOffConfiguration.acknowledgement;
                }
                return handOffConfiguration.copy(str, str2, str3);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getAcknowledgement() {
                return this.acknowledgement;
            }

            @NotNull
            public final HandOffConfiguration copy(@Nullable String type, @Nullable String text, @NotNull String acknowledgement) {
                Intrinsics.checkNotNullParameter(acknowledgement, "acknowledgement");
                return new HandOffConfiguration(type, text, acknowledgement);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HandOffConfiguration)) {
                    return false;
                }
                HandOffConfiguration handOffConfiguration = (HandOffConfiguration) other;
                return Intrinsics.areEqual(this.type, handOffConfiguration.type) && Intrinsics.areEqual(this.text, handOffConfiguration.text) && Intrinsics.areEqual(this.acknowledgement, handOffConfiguration.acknowledgement);
            }

            @NotNull
            public final String getAcknowledgement() {
                return this.acknowledgement;
            }

            @Nullable
            public final String getText() {
                return this.text;
            }

            @Nullable
            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                String str = this.type;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.text;
                return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.acknowledgement.hashCode();
            }

            @NotNull
            public String toString() {
                return "HandOffConfiguration(type=" + this.type + ", text=" + this.text + ", acknowledgement=" + this.acknowledgement + ')';
            }
        }

        public static final class a {

            @Gb.c("string_resource_id")
            @Nullable
            private final Integer stringResourceId;

            @Gb.c("text")
            @Nullable
            private final String text;

            public a(Integer num, String str) {
                this.stringResourceId = num;
                this.text = str;
            }

            public final Integer a() {
                return this.stringResourceId;
            }

            public final String b() {
                return this.text;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class b {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ b[] $VALUES;

            @Gb.c("content_moderation_warning")
            public static final b ContentModerationWaring = new b("ContentModerationWaring", 0);

            @Gb.c("content_moderation_close")
            public static final b ContentModerationClose = new b("ContentModerationClose", 1);

            @Gb.c("content_moderation_block")
            public static final b ContentModerationBlock = new b("ContentModerationBlock", 2);

            private static final /* synthetic */ b[] $values() {
                return new b[]{ContentModerationWaring, ContentModerationClose, ContentModerationBlock};
            }

            static {
                b[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            private b(String str, int i10) {
            }

            @NotNull
            public static EnumEntries<b> getEntries() {
                return $ENTRIES;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }
        }

        public Meta(@Nullable DisplayCard displayCard, @Nullable InputCard inputCard, @Nullable Boolean bool, @Nullable HandOffConfiguration handOffConfiguration, @Nullable Long l10, @Nullable Integer num, @Nullable List<? extends Object> list, @Nullable h hVar, @Nullable CardData cardData, @Nullable Boolean bool2, @Nullable String str, @Nullable Boolean bool3, @Nullable List<a> list2, @Nullable Boolean bool4, @Nullable String str2, @Nullable User user, @Nullable User user2, @Nullable String str3, @Nullable String str4, @Nullable Long l11, @Nullable Long l12, @Nullable h hVar2, @Nullable String str5, @Nullable Boolean bool5, @Nullable String str6, @Nullable String str7, @Nullable b bVar, @Nullable Boolean bool6, @Nullable String str8, @Nullable String str9, boolean z10) {
            this.displayCard = displayCard;
            this.inputCard = inputCard;
            this.canHandOff = bool;
            this.handOffConfiguration = handOffConfiguration;
            this.typingDelay = l10;
            this.version = num;
            this.suggestions = list;
            this.operationUser = hVar;
            this.cardData = cardData;
            this.isSkippable = bool2;
            this.action = str;
            this.isFormMessage = bool3;
            this.campaignSuggestions = list2;
            this.hideInput = bool4;
            this.resourceType = str2;
            this.creator = user;
            this.lastModifier = user2;
            this.resourceTitle = str3;
            this.behaviour = str4;
            this.lastModifiedTime = l11;
            this.createdTime = l12;
            this.userList = hVar2;
            this.mode = str5;
            this.allowTyping = bool5;
            this.resourceId = str6;
            this.fieldName = str7;
            this.metaType = bVar;
            this.hasCustomMessage = bool6;
            this.format = str8;
            this.type = str9;
            this.hideCustomMessage = z10;
        }

        public static /* synthetic */ Meta copy$default(Meta meta, DisplayCard displayCard, InputCard inputCard, Boolean bool, HandOffConfiguration handOffConfiguration, Long l10, Integer num, List list, h hVar, CardData cardData, Boolean bool2, String str, Boolean bool3, List list2, Boolean bool4, String str2, User user, User user2, String str3, String str4, Long l11, Long l12, h hVar2, String str5, Boolean bool5, String str6, String str7, b bVar, Boolean bool6, String str8, String str9, boolean z10, int i10, Object obj) {
            boolean z11;
            String str10;
            DisplayCard displayCard2 = (i10 & 1) != 0 ? meta.displayCard : displayCard;
            InputCard inputCard2 = (i10 & 2) != 0 ? meta.inputCard : inputCard;
            Boolean bool7 = (i10 & 4) != 0 ? meta.canHandOff : bool;
            HandOffConfiguration handOffConfiguration2 = (i10 & 8) != 0 ? meta.handOffConfiguration : handOffConfiguration;
            Long l13 = (i10 & 16) != 0 ? meta.typingDelay : l10;
            Integer num2 = (i10 & 32) != 0 ? meta.version : num;
            List list3 = (i10 & 64) != 0 ? meta.suggestions : list;
            h hVar3 = (i10 & 128) != 0 ? meta.operationUser : hVar;
            CardData cardData2 = (i10 & 256) != 0 ? meta.cardData : cardData;
            Boolean bool8 = (i10 & 512) != 0 ? meta.isSkippable : bool2;
            String str11 = (i10 & 1024) != 0 ? meta.action : str;
            Boolean bool9 = (i10 & 2048) != 0 ? meta.isFormMessage : bool3;
            List list4 = (i10 & 4096) != 0 ? meta.campaignSuggestions : list2;
            Boolean bool10 = (i10 & 8192) != 0 ? meta.hideInput : bool4;
            DisplayCard displayCard3 = displayCard2;
            String str12 = (i10 & 16384) != 0 ? meta.resourceType : str2;
            User user3 = (i10 & 32768) != 0 ? meta.creator : user;
            User user4 = (i10 & PKIFailureInfo.notAuthorized) != 0 ? meta.lastModifier : user2;
            String str13 = (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? meta.resourceTitle : str3;
            String str14 = (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? meta.behaviour : str4;
            Long l14 = (i10 & PKIFailureInfo.signerNotTrusted) != 0 ? meta.lastModifiedTime : l11;
            Long l15 = (i10 & PKIFailureInfo.badCertTemplate) != 0 ? meta.createdTime : l12;
            h hVar4 = (i10 & PKIFailureInfo.badSenderNonce) != 0 ? meta.userList : hVar2;
            String str15 = (i10 & 4194304) != 0 ? meta.mode : str5;
            Boolean bool11 = (i10 & 8388608) != 0 ? meta.allowTyping : bool5;
            String str16 = (i10 & 16777216) != 0 ? meta.resourceId : str6;
            String str17 = (i10 & 33554432) != 0 ? meta.fieldName : str7;
            b bVar2 = (i10 & AudioRoutingController.DEVICE_OUT_USB_HEADSET) != 0 ? meta.metaType : bVar;
            Boolean bool12 = (i10 & 134217728) != 0 ? meta.hasCustomMessage : bool6;
            String str18 = (i10 & 268435456) != 0 ? meta.format : str8;
            String str19 = (i10 & PKIFailureInfo.duplicateCertReq) != 0 ? meta.type : str9;
            if ((i10 & 1073741824) != 0) {
                str10 = str19;
                z11 = meta.hideCustomMessage;
            } else {
                z11 = z10;
                str10 = str19;
            }
            return meta.copy(displayCard3, inputCard2, bool7, handOffConfiguration2, l13, num2, list3, hVar3, cardData2, bool8, str11, bool9, list4, bool10, str12, user3, user4, str13, str14, l14, l15, hVar4, str15, bool11, str16, str17, bVar2, bool12, str18, str10, z11);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final DisplayCard getDisplayCard() {
            return this.displayCard;
        }

        @Nullable
        /* renamed from: component10, reason: from getter */
        public final Boolean getIsSkippable() {
            return this.isSkippable;
        }

        @Nullable
        /* renamed from: component11, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @Nullable
        /* renamed from: component12, reason: from getter */
        public final Boolean getIsFormMessage() {
            return this.isFormMessage;
        }

        @Nullable
        public final List<a> component13() {
            return this.campaignSuggestions;
        }

        @Nullable
        /* renamed from: component14, reason: from getter */
        public final Boolean getHideInput() {
            return this.hideInput;
        }

        @Nullable
        /* renamed from: component15, reason: from getter */
        public final String getResourceType() {
            return this.resourceType;
        }

        @Nullable
        /* renamed from: component16, reason: from getter */
        public final User getCreator() {
            return this.creator;
        }

        @Nullable
        /* renamed from: component17, reason: from getter */
        public final User getLastModifier() {
            return this.lastModifier;
        }

        @Nullable
        /* renamed from: component18, reason: from getter */
        public final String getResourceTitle() {
            return this.resourceTitle;
        }

        @Nullable
        /* renamed from: component19, reason: from getter */
        public final String getBehaviour() {
            return this.behaviour;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final InputCard getInputCard() {
            return this.inputCard;
        }

        @Nullable
        /* renamed from: component20, reason: from getter */
        public final Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        @Nullable
        /* renamed from: component21, reason: from getter */
        public final Long getCreatedTime() {
            return this.createdTime;
        }

        @Nullable
        /* renamed from: component22, reason: from getter */
        public final h getUserList() {
            return this.userList;
        }

        @Nullable
        /* renamed from: component23, reason: from getter */
        public final String getMode() {
            return this.mode;
        }

        @Nullable
        /* renamed from: component24, reason: from getter */
        public final Boolean getAllowTyping() {
            return this.allowTyping;
        }

        @Nullable
        /* renamed from: component25, reason: from getter */
        public final String getResourceId() {
            return this.resourceId;
        }

        @Nullable
        /* renamed from: component26, reason: from getter */
        public final String getFieldName() {
            return this.fieldName;
        }

        @Nullable
        /* renamed from: component27, reason: from getter */
        public final b getMetaType() {
            return this.metaType;
        }

        @Nullable
        /* renamed from: component28, reason: from getter */
        public final Boolean getHasCustomMessage() {
            return this.hasCustomMessage;
        }

        @Nullable
        /* renamed from: component29, reason: from getter */
        public final String getFormat() {
            return this.format;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Boolean getCanHandOff() {
            return this.canHandOff;
        }

        @Nullable
        /* renamed from: component30, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component31, reason: from getter */
        public final boolean getHideCustomMessage() {
            return this.hideCustomMessage;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final HandOffConfiguration getHandOffConfiguration() {
            return this.handOffConfiguration;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Long getTypingDelay() {
            return this.typingDelay;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final Integer getVersion() {
            return this.version;
        }

        @Nullable
        public final List<Object> component7() {
            return this.suggestions;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final h getOperationUser() {
            return this.operationUser;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final CardData getCardData() {
            return this.cardData;
        }

        @NotNull
        public final Meta copy(@Nullable DisplayCard displayCard, @Nullable InputCard inputCard, @Nullable Boolean canHandOff, @Nullable HandOffConfiguration handOffConfiguration, @Nullable Long typingDelay, @Nullable Integer version, @Nullable List<? extends Object> suggestions, @Nullable h operationUser, @Nullable CardData cardData, @Nullable Boolean isSkippable, @Nullable String action, @Nullable Boolean isFormMessage, @Nullable List<a> campaignSuggestions, @Nullable Boolean hideInput, @Nullable String resourceType, @Nullable User creator, @Nullable User lastModifier, @Nullable String resourceTitle, @Nullable String behaviour, @Nullable Long lastModifiedTime, @Nullable Long createdTime, @Nullable h userList, @Nullable String mode, @Nullable Boolean allowTyping, @Nullable String resourceId, @Nullable String fieldName, @Nullable b metaType, @Nullable Boolean hasCustomMessage, @Nullable String format, @Nullable String type, boolean hideCustomMessage) {
            return new Meta(displayCard, inputCard, canHandOff, handOffConfiguration, typingDelay, version, suggestions, operationUser, cardData, isSkippable, action, isFormMessage, campaignSuggestions, hideInput, resourceType, creator, lastModifier, resourceTitle, behaviour, lastModifiedTime, createdTime, userList, mode, allowTyping, resourceId, fieldName, metaType, hasCustomMessage, format, type, hideCustomMessage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Meta)) {
                return false;
            }
            Meta meta = (Meta) other;
            return Intrinsics.areEqual(this.displayCard, meta.displayCard) && Intrinsics.areEqual(this.inputCard, meta.inputCard) && Intrinsics.areEqual(this.canHandOff, meta.canHandOff) && Intrinsics.areEqual(this.handOffConfiguration, meta.handOffConfiguration) && Intrinsics.areEqual(this.typingDelay, meta.typingDelay) && Intrinsics.areEqual(this.version, meta.version) && Intrinsics.areEqual(this.suggestions, meta.suggestions) && Intrinsics.areEqual(this.operationUser, meta.operationUser) && Intrinsics.areEqual(this.cardData, meta.cardData) && Intrinsics.areEqual(this.isSkippable, meta.isSkippable) && Intrinsics.areEqual(this.action, meta.action) && Intrinsics.areEqual(this.isFormMessage, meta.isFormMessage) && Intrinsics.areEqual(this.campaignSuggestions, meta.campaignSuggestions) && Intrinsics.areEqual(this.hideInput, meta.hideInput) && Intrinsics.areEqual(this.resourceType, meta.resourceType) && Intrinsics.areEqual(this.creator, meta.creator) && Intrinsics.areEqual(this.lastModifier, meta.lastModifier) && Intrinsics.areEqual(this.resourceTitle, meta.resourceTitle) && Intrinsics.areEqual(this.behaviour, meta.behaviour) && Intrinsics.areEqual(this.lastModifiedTime, meta.lastModifiedTime) && Intrinsics.areEqual(this.createdTime, meta.createdTime) && Intrinsics.areEqual(this.userList, meta.userList) && Intrinsics.areEqual(this.mode, meta.mode) && Intrinsics.areEqual(this.allowTyping, meta.allowTyping) && Intrinsics.areEqual(this.resourceId, meta.resourceId) && Intrinsics.areEqual(this.fieldName, meta.fieldName) && this.metaType == meta.metaType && Intrinsics.areEqual(this.hasCustomMessage, meta.hasCustomMessage) && Intrinsics.areEqual(this.format, meta.format) && Intrinsics.areEqual(this.type, meta.type) && this.hideCustomMessage == meta.hideCustomMessage;
        }

        @Nullable
        public final String getAction() {
            return this.action;
        }

        @Nullable
        public final Boolean getAllowTyping() {
            return this.allowTyping;
        }

        @Nullable
        public final String getBehaviour() {
            return this.behaviour;
        }

        @Nullable
        public final List<a> getCampaignSuggestions() {
            return this.campaignSuggestions;
        }

        @Nullable
        public final Boolean getCanHandOff() {
            return this.canHandOff;
        }

        @Nullable
        public final CardData getCardData() {
            return this.cardData;
        }

        @Nullable
        public final Long getCreatedTime() {
            return this.createdTime;
        }

        @Nullable
        public final User getCreator() {
            return this.creator;
        }

        @Nullable
        public final DisplayCard getDisplayCard() {
            return this.displayCard;
        }

        @Nullable
        public final String getFieldName() {
            return this.fieldName;
        }

        @Nullable
        public final String getFormat() {
            return this.format;
        }

        @Nullable
        public final HandOffConfiguration getHandOffConfiguration() {
            return this.handOffConfiguration;
        }

        @Nullable
        public final Boolean getHasCustomMessage() {
            return this.hasCustomMessage;
        }

        public final boolean getHideCustomMessage() {
            return this.hideCustomMessage;
        }

        @Nullable
        public final Boolean getHideInput() {
            return this.hideInput;
        }

        @Nullable
        public final InputCard getInputCard() {
            return this.inputCard;
        }

        @Nullable
        public final Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        @Nullable
        public final User getLastModifier() {
            return this.lastModifier;
        }

        @Nullable
        public final b getMetaType() {
            return this.metaType;
        }

        @Nullable
        public final String getMode() {
            return this.mode;
        }

        @Nullable
        public final h getOperationUser() {
            return this.operationUser;
        }

        @Nullable
        public final String getResourceId() {
            return this.resourceId;
        }

        @Nullable
        public final String getResourceTitle() {
            return this.resourceTitle;
        }

        @Nullable
        public final String getResourceType() {
            return this.resourceType;
        }

        @Nullable
        public final List<Object> getSuggestions() {
            return this.suggestions;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @Nullable
        public final Long getTypingDelay() {
            return this.typingDelay;
        }

        @Nullable
        public final h getUserList() {
            return this.userList;
        }

        @Nullable
        public final Integer getVersion() {
            return this.version;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            DisplayCard displayCard = this.displayCard;
            int hashCode = (displayCard == null ? 0 : displayCard.hashCode()) * 31;
            InputCard inputCard = this.inputCard;
            int hashCode2 = (hashCode + (inputCard == null ? 0 : inputCard.hashCode())) * 31;
            Boolean bool = this.canHandOff;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            HandOffConfiguration handOffConfiguration = this.handOffConfiguration;
            int hashCode4 = (hashCode3 + (handOffConfiguration == null ? 0 : handOffConfiguration.hashCode())) * 31;
            Long l10 = this.typingDelay;
            int hashCode5 = (hashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Integer num = this.version;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            List<Object> list = this.suggestions;
            int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            h hVar = this.operationUser;
            int hashCode8 = (hashCode7 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            CardData cardData = this.cardData;
            int hashCode9 = (hashCode8 + (cardData == null ? 0 : cardData.hashCode())) * 31;
            Boolean bool2 = this.isSkippable;
            int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.action;
            int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool3 = this.isFormMessage;
            int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            List<a> list2 = this.campaignSuggestions;
            int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Boolean bool4 = this.hideInput;
            int hashCode14 = (hashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str2 = this.resourceType;
            int hashCode15 = (hashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
            User user = this.creator;
            int hashCode16 = (hashCode15 + (user == null ? 0 : user.hashCode())) * 31;
            User user2 = this.lastModifier;
            int hashCode17 = (hashCode16 + (user2 == null ? 0 : user2.hashCode())) * 31;
            String str3 = this.resourceTitle;
            int hashCode18 = (hashCode17 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.behaviour;
            int hashCode19 = (hashCode18 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l11 = this.lastModifiedTime;
            int hashCode20 = (hashCode19 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.createdTime;
            int hashCode21 = (hashCode20 + (l12 == null ? 0 : l12.hashCode())) * 31;
            h hVar2 = this.userList;
            int hashCode22 = (hashCode21 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31;
            String str5 = this.mode;
            int hashCode23 = (hashCode22 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool5 = this.allowTyping;
            int hashCode24 = (hashCode23 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            String str6 = this.resourceId;
            int hashCode25 = (hashCode24 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.fieldName;
            int hashCode26 = (hashCode25 + (str7 == null ? 0 : str7.hashCode())) * 31;
            b bVar = this.metaType;
            int hashCode27 = (hashCode26 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Boolean bool6 = this.hasCustomMessage;
            int hashCode28 = (hashCode27 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            String str8 = this.format;
            int hashCode29 = (hashCode28 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.type;
            int hashCode30 = (hashCode29 + (str9 != null ? str9.hashCode() : 0)) * 31;
            boolean z10 = this.hideCustomMessage;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode30 + i10;
        }

        @Nullable
        public final Boolean isFormMessage() {
            return this.isFormMessage;
        }

        @Nullable
        public final Boolean isSkippable() {
            return this.isSkippable;
        }

        @NotNull
        public String toString() {
            return "Meta(displayCard=" + this.displayCard + ", inputCard=" + this.inputCard + ", canHandOff=" + this.canHandOff + ", handOffConfiguration=" + this.handOffConfiguration + ", typingDelay=" + this.typingDelay + ", version=" + this.version + ", suggestions=" + this.suggestions + ", operationUser=" + this.operationUser + ", cardData=" + this.cardData + ", isSkippable=" + this.isSkippable + ", action=" + this.action + ", isFormMessage=" + this.isFormMessage + ", campaignSuggestions=" + this.campaignSuggestions + ", hideInput=" + this.hideInput + ", resourceType=" + this.resourceType + ", creator=" + this.creator + ", lastModifier=" + this.lastModifier + ", resourceTitle=" + this.resourceTitle + ", behaviour=" + this.behaviour + ", lastModifiedTime=" + this.lastModifiedTime + ", createdTime=" + this.createdTime + ", userList=" + this.userList + ", mode=" + this.mode + ", allowTyping=" + this.allowTyping + ", resourceId=" + this.resourceId + ", fieldName=" + this.fieldName + ", metaType=" + this.metaType + ", hasCustomMessage=" + this.hasCustomMessage + ", format=" + this.format + ", type=" + this.type + ", hideCustomMessage=" + this.hideCustomMessage + ')';
        }

        @Keep
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001:\u0007XYZ[\\]^B¿\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010!J\u0012\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010!J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010!J\u0018\u00104\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b4\u0010'J\u0012\u00105\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b7\u00101Jè\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010!J\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020\u00152\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010%R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010'R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bI\u0010'R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bJ\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bK\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bL\u0010!R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\bN\u0010-R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\bP\u0010/R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010Q\u001a\u0004\b\u0016\u00101R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bR\u0010!R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bS\u0010!R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010G\u001a\u0004\bT\u0010'R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010U\u001a\u0004\bV\u00106R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010Q\u001a\u0004\bW\u00101¨\u0006_"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard;", "", "", "image", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$a;", "imagePosition", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;", "type", "", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$Element;", "elements", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Link;", "links", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$Action;", "actions", EventKeys.URL, "description", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles;", "articles", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$InputValidation;", "validation", "", "isHideLabel", "title", "subTitle", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Phrase;", "phrases", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$LinkInfo;", "linkInfo", "autoplay", "<init>", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$a;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$InputValidation;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$LinkInfo;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$a;", "component3", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "component9", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles;", "component10", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$InputValidation;", "component11", "()Ljava/lang/Boolean;", "component12", "component13", "component14", "component15", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$LinkInfo;", "component16", "copy", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$a;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$InputValidation;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$LinkInfo;Ljava/lang/Boolean;)Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$a;", "getImagePosition", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;", "getType", "Ljava/util/List;", "getElements", "getLinks", "getActions", "getUrl", "getDescription", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles;", "getArticles", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$InputValidation;", "getValidation", "Ljava/lang/Boolean;", "getTitle", "getSubTitle", "getPhrases", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$LinkInfo;", "getLinkInfo", "getAutoplay", "Articles", "ArticlesDeserializeAdapter", "a", "InputValidation", "Link", "LinkInfo", "Phrase", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DisplayCard {

            @Gb.c("actions")
            @Nullable
            private final List<Action> actions;

            @Gb.c("articles")
            @Gb.b(ArticlesDeserializeAdapter.class)
            @Nullable
            private final Articles articles;

            @Gb.c("autoplay")
            @Nullable
            private final Boolean autoplay;

            @Gb.c("description")
            @Nullable
            private final String description;

            @Gb.c("elements")
            @Nullable
            private final List<Element> elements;

            @Gb.c("image")
            @Nullable
            private final String image;

            @Gb.c("image_position")
            @Nullable
            private final a imagePosition;

            @Gb.c("hide_label")
            @Nullable
            private final Boolean isHideLabel;

            @Gb.c("link_info")
            @Nullable
            private final LinkInfo linkInfo;

            @Gb.c("links")
            @Nullable
            private final List<Link> links;

            @Gb.c("phrases")
            @Nullable
            private final List<Phrase> phrases;

            @Gb.c("subtitle")
            @Nullable
            private final String subTitle;

            @Gb.c("title")
            @Nullable
            private final String title;

            @Gb.c("type")
            @Nullable
            private final g type;

            @Gb.c(EventKeys.URL)
            @Nullable
            private final String url;

            @Gb.c("validate")
            @Nullable
            private final InputValidation validation;

            @Keep
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles;", "", "()V", "NewObject", "OldObject", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles$NewObject;", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles$OldObject;", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static abstract class Articles {

                @Keep
                @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles$NewObject;", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles;", "list", "", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles$NewObject$Article;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Article", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class NewObject extends Articles {

                    @Nullable
                    private final List<Article> list;

                    @Keep
                    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles$NewObject$Article;", "", StackTraceHelper.ID_KEY, "", "text", "type", EventKeys.URL, "languageCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLanguageCode", "getText", "getType", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final /* data */ class Article {

                        @Gb.c(StackTraceHelper.ID_KEY)
                        @Nullable
                        private final String id;

                        @Gb.c("language_code")
                        @Nullable
                        private final String languageCode;

                        @Gb.c("text")
                        @Nullable
                        private final String text;

                        @Gb.c("type")
                        @Nullable
                        private final String type;

                        @Gb.c(EventKeys.URL)
                        @Nullable
                        private final String url;

                        public Article() {
                            this(null, null, null, null, null, 31, null);
                        }

                        public static /* synthetic */ Article copy$default(Article article, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
                            if ((i10 & 1) != 0) {
                                str = article.id;
                            }
                            if ((i10 & 2) != 0) {
                                str2 = article.text;
                            }
                            if ((i10 & 4) != 0) {
                                str3 = article.type;
                            }
                            if ((i10 & 8) != 0) {
                                str4 = article.url;
                            }
                            if ((i10 & 16) != 0) {
                                str5 = article.languageCode;
                            }
                            String str6 = str5;
                            String str7 = str3;
                            return article.copy(str, str2, str7, str4, str6);
                        }

                        @Nullable
                        /* renamed from: component1, reason: from getter */
                        public final String getId() {
                            return this.id;
                        }

                        @Nullable
                        /* renamed from: component2, reason: from getter */
                        public final String getText() {
                            return this.text;
                        }

                        @Nullable
                        /* renamed from: component3, reason: from getter */
                        public final String getType() {
                            return this.type;
                        }

                        @Nullable
                        /* renamed from: component4, reason: from getter */
                        public final String getUrl() {
                            return this.url;
                        }

                        @Nullable
                        /* renamed from: component5, reason: from getter */
                        public final String getLanguageCode() {
                            return this.languageCode;
                        }

                        @NotNull
                        public final Article copy(@Nullable String id2, @Nullable String text, @Nullable String type, @Nullable String url, @Nullable String languageCode) {
                            return new Article(id2, text, type, url, languageCode);
                        }

                        public boolean equals(@Nullable Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof Article)) {
                                return false;
                            }
                            Article article = (Article) other;
                            return Intrinsics.areEqual(this.id, article.id) && Intrinsics.areEqual(this.text, article.text) && Intrinsics.areEqual(this.type, article.type) && Intrinsics.areEqual(this.url, article.url) && Intrinsics.areEqual(this.languageCode, article.languageCode);
                        }

                        @Nullable
                        public final String getId() {
                            return this.id;
                        }

                        @Nullable
                        public final String getLanguageCode() {
                            return this.languageCode;
                        }

                        @Nullable
                        public final String getText() {
                            return this.text;
                        }

                        @Nullable
                        public final String getType() {
                            return this.type;
                        }

                        @Nullable
                        public final String getUrl() {
                            return this.url;
                        }

                        public int hashCode() {
                            String str = this.id;
                            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                            String str2 = this.text;
                            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                            String str3 = this.type;
                            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                            String str4 = this.url;
                            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                            String str5 = this.languageCode;
                            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
                        }

                        @NotNull
                        public String toString() {
                            return "Article(id=" + this.id + ", text=" + this.text + ", type=" + this.type + ", url=" + this.url + ", languageCode=" + this.languageCode + ')';
                        }

                        public Article(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
                            this.id = str;
                            this.text = str2;
                            this.type = str3;
                            this.url = str4;
                            this.languageCode = str5;
                        }

                        public /* synthetic */ Article(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
                        }
                    }

                    public NewObject(@Nullable List<Article> list) {
                        super(null);
                        this.list = list;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ NewObject copy$default(NewObject newObject, List list, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            list = newObject.list;
                        }
                        return newObject.copy(list);
                    }

                    @Nullable
                    public final List<Article> component1() {
                        return this.list;
                    }

                    @NotNull
                    public final NewObject copy(@Nullable List<Article> list) {
                        return new NewObject(list);
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof NewObject) && Intrinsics.areEqual(this.list, ((NewObject) other).list);
                    }

                    @Nullable
                    public final List<Article> getList() {
                        return this.list;
                    }

                    public int hashCode() {
                        List<Article> list = this.list;
                        if (list == null) {
                            return 0;
                        }
                        return list.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "NewObject(list=" + this.list + ')';
                    }
                }

                @Keep
                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles$OldObject;", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles;", "", "Lcom/google/gson/k;", "list", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles$OldObject;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getList", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class OldObject extends Articles {

                    @Nullable
                    private final List<k> list;

                    public OldObject(@Nullable List<k> list) {
                        super(null);
                        this.list = list;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ OldObject copy$default(OldObject oldObject, List list, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            list = oldObject.list;
                        }
                        return oldObject.copy(list);
                    }

                    @Nullable
                    public final List<k> component1() {
                        return this.list;
                    }

                    @NotNull
                    public final OldObject copy(@Nullable List<k> list) {
                        return new OldObject(list);
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof OldObject) && Intrinsics.areEqual(this.list, ((OldObject) other).list);
                    }

                    @Nullable
                    public final List<k> getList() {
                        return this.list;
                    }

                    public int hashCode() {
                        List<k> list = this.list;
                        if (list == null) {
                            return 0;
                        }
                        return list.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "OldObject(list=" + this.list + ')';
                    }
                }

                public /* synthetic */ Articles(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Articles() {
                }
            }

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$ArticlesDeserializeAdapter;", "Lcom/google/gson/g;", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles;", "<init>", "()V", "Lcom/google/gson/h;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/f;", "context", "a", "(Lcom/google/gson/h;Ljava/lang/reflect/Type;Lcom/google/gson/f;)Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Articles;", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ArticlesDeserializeAdapter implements com.google.gson.g {
                @Override // com.google.gson.g
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Articles deserialize(h json, Type typeOfT, com.google.gson.f context) {
                    com.google.gson.e c10;
                    k d10;
                    h r10;
                    if (json == null || (c10 = AbstractC5896h.c(json)) == null) {
                        return null;
                    }
                    h hVar = (h) CollectionsKt.firstOrNull(c10);
                    if (i.f((hVar == null || (d10 = AbstractC5896h.d(hVar)) == null || (r10 = d10.r("type")) == null) ? null : AbstractC5896h.f(r10))) {
                        return new Articles.NewObject(context != null ? (List) context.a(c10, new TypeToken<List<? extends Articles.NewObject.Article>>() { // from class: com.zoho.livechat.android.modules.messages.domain.entities.Message$Meta$DisplayCard$ArticlesDeserializeAdapter$deserialize$1$articlesList$1
                        }.getType()) : null);
                    }
                    return new Articles.OldObject(context != null ? (List) context.a(c10, new TypeToken<List<? extends k>>() { // from class: com.zoho.livechat.android.modules.messages.domain.entities.Message$Meta$DisplayCard$ArticlesDeserializeAdapter$deserialize$1$articlesList$2
                    }.getType()) : null);
                }
            }

            @Keep
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0003R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$InputValidation;", "", "format", "", "error", "(Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getFormat", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "validate", "message", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Message.kt\ncom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$InputValidation\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 CharSequence.kt\nandroidx/core/text/CharSequenceKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1047:1\n108#2:1048\n80#2,22:1049\n108#2:1071\n80#2,22:1072\n108#2:1094\n80#2,22:1095\n108#2:1118\n80#2,22:1119\n108#2:1152\n80#2,22:1153\n108#2:1175\n80#2,22:1176\n108#2:1210\n80#2,22:1211\n108#2:1233\n80#2,22:1234\n28#3:1117\n28#3:1198\n739#4,9:1141\n739#4,9:1199\n37#5,2:1150\n37#5,2:1208\n*S KotlinDebug\n*F\n+ 1 Message.kt\ncom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$InputValidation\n*L\n576#1:1048\n576#1:1049,22\n582#1:1071\n582#1:1072,22\n586#1:1094\n586#1:1095,22\n590#1:1118\n590#1:1119,22\n602#1:1152\n602#1:1153,22\n603#1:1175\n603#1:1176,22\n618#1:1210\n618#1:1211,22\n619#1:1233\n619#1:1234,22\n586#1:1117\n608#1:1198\n601#1:1141,9\n617#1:1199,9\n601#1:1150,2\n617#1:1208,2\n*E\n"})
            public static final /* data */ class InputValidation {

                @Gb.c("error")
                @NotNull
                private final String error;

                @Gb.c("format")
                @NotNull
                private final String format;

                public InputValidation(@NotNull String format, @NotNull String error) {
                    Intrinsics.checkNotNullParameter(format, "format");
                    Intrinsics.checkNotNullParameter(error, "error");
                    this.format = format;
                    this.error = error;
                }

                public static /* synthetic */ InputValidation copy$default(InputValidation inputValidation, String str, String str2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = inputValidation.format;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = inputValidation.error;
                    }
                    return inputValidation.copy(str, str2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getFormat() {
                    return this.format;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getError() {
                    return this.error;
                }

                @NotNull
                public final InputValidation copy(@NotNull String format, @NotNull String error) {
                    Intrinsics.checkNotNullParameter(format, "format");
                    Intrinsics.checkNotNullParameter(error, "error");
                    return new InputValidation(format, error);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof InputValidation)) {
                        return false;
                    }
                    InputValidation inputValidation = (InputValidation) other;
                    return Intrinsics.areEqual(this.format, inputValidation.format) && Intrinsics.areEqual(this.error, inputValidation.error);
                }

                @NotNull
                public final String getError() {
                    return this.error;
                }

                @NotNull
                public final String getFormat() {
                    return this.format;
                }

                public int hashCode() {
                    return (this.format.hashCode() * 31) + this.error.hashCode();
                }

                @NotNull
                public String toString() {
                    return "InputValidation(format=" + this.format + ", error=" + this.error + ')';
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Removed duplicated region for block: B:138:0x0170  */
                /* JADX WARN: Removed duplicated region for block: B:152:0x01a9  */
                /* JADX WARN: Removed duplicated region for block: B:214:0x025c  */
                /* JADX WARN: Removed duplicated region for block: B:228:0x0295  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean validate(@NotNull String message) {
                    int n10;
                    int i10;
                    List emptyList;
                    int length;
                    int i11;
                    int length2;
                    int i12;
                    int n11;
                    int i13;
                    List emptyList2;
                    int length3;
                    int i14;
                    int length4;
                    int i15;
                    Intrinsics.checkNotNullParameter(message, "message");
                    String str = this.format;
                    switch (str.hashCode()) {
                        case -1034364087:
                            if (str.equals("number")) {
                                int length5 = message.length() - 1;
                                int i16 = 0;
                                boolean z10 = false;
                                while (i16 <= length5) {
                                    boolean z11 = Intrinsics.compare((int) message.charAt(!z10 ? i16 : length5), 32) <= 0;
                                    if (z10) {
                                        if (!z11) {
                                            return TextUtils.isDigitsOnly(message.subSequence(i16, length5 + 1).toString());
                                        }
                                        length5--;
                                    } else if (z11) {
                                        i16++;
                                    } else {
                                        z10 = true;
                                    }
                                }
                                return TextUtils.isDigitsOnly(message.subSequence(i16, length5 + 1).toString());
                            }
                            break;
                        case -595482705:
                            if (str.equals("phoneno")) {
                                Pattern compile = Pattern.compile("((?:\\+?\\d{1,3}[-. ]*)?(?:[(]?\\d{3}[-. )]*\\d{3}[-. ]*\\d{4,5}(?: *x\\d+)?|\\d{8,11}))");
                                int length6 = message.length() - 1;
                                int i17 = 0;
                                boolean z12 = false;
                                while (i17 <= length6) {
                                    boolean z13 = Intrinsics.compare((int) message.charAt(!z12 ? i17 : length6), 32) <= 0;
                                    if (z12) {
                                        if (!z13) {
                                            return compile.matcher(message.subSequence(i17, length6 + 1).toString()).matches();
                                        }
                                        length6--;
                                    } else if (z13) {
                                        i17++;
                                    } else {
                                        z12 = true;
                                    }
                                }
                                return compile.matcher(message.subSequence(i17, length6 + 1).toString()).matches();
                            }
                            break;
                        case 3373707:
                            if (str.equals("name")) {
                                return true;
                            }
                            break;
                        case 96619420:
                            if (str.equals("email")) {
                                Pattern pattern = Patterns.EMAIL_ADDRESS;
                                int length7 = message.length() - 1;
                                int i18 = 0;
                                boolean z14 = false;
                                while (i18 <= length7) {
                                    boolean z15 = Intrinsics.compare((int) message.charAt(!z14 ? i18 : length7), 32) <= 0;
                                    if (z14) {
                                        if (!z15) {
                                            return pattern.matcher(message.subSequence(i18, length7 + 1).toString()).matches();
                                        }
                                        length7--;
                                    } else if (z15) {
                                        i18++;
                                    } else {
                                        z14 = true;
                                    }
                                }
                                return pattern.matcher(message.subSequence(i18, length7 + 1).toString()).matches();
                            }
                            break;
                        case 1224335515:
                            if (str.equals("website")) {
                                Pattern pattern2 = Patterns.WEB_URL;
                                int length8 = message.length() - 1;
                                int i19 = 0;
                                boolean z16 = false;
                                while (i19 <= length8) {
                                    boolean z17 = Intrinsics.compare((int) message.charAt(!z16 ? i19 : length8), 32) <= 0;
                                    if (z16) {
                                        if (!z17) {
                                            return pattern2.matcher(message.subSequence(i19, length8 + 1).toString()).matches();
                                        }
                                        length8--;
                                    } else if (z17) {
                                        i19++;
                                    } else {
                                        z16 = true;
                                    }
                                }
                                return pattern2.matcher(message.subSequence(i19, length8 + 1).toString()).matches();
                            }
                            break;
                    }
                    C3941j c3941j = new C3941j(C3941j.f44550c);
                    if (c3941j.b(this.format)) {
                        String a10 = c3941j.a(1);
                        Intrinsics.checkNotNull(a10);
                        if (StringsKt.contains$default((CharSequence) a10, (CharSequence) "-", false, 2, (Object) null)) {
                            List<String> split = new Regex("-").split(a10, 0);
                            if (!split.isEmpty()) {
                                ListIterator<String> listIterator = split.listIterator(split.size());
                                while (listIterator.hasPrevious()) {
                                    if (listIterator.previous().length() != 0) {
                                        emptyList2 = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                                        String[] strArr = (String[]) emptyList2.toArray(new String[0]);
                                        String str2 = strArr[0];
                                        length3 = str2.length() - 1;
                                        i14 = 0;
                                        boolean z18 = false;
                                        while (i14 <= length3) {
                                            boolean z19 = Intrinsics.compare((int) str2.charAt(!z18 ? i14 : length3), 32) <= 0;
                                            if (z18) {
                                                if (z19) {
                                                    length3--;
                                                } else {
                                                    i13 = i.n(str2.subSequence(i14, length3 + 1).toString());
                                                    String str3 = strArr[1];
                                                    length4 = str3.length() - 1;
                                                    i15 = 0;
                                                    boolean z20 = false;
                                                    while (i15 <= length4) {
                                                        boolean z21 = Intrinsics.compare((int) str3.charAt(!z20 ? i15 : length4), 32) <= 0;
                                                        if (z20) {
                                                            if (z21) {
                                                                length4--;
                                                            } else {
                                                                n11 = i.n(str3.subSequence(i15, length4 + 1).toString());
                                                            }
                                                        } else if (z21) {
                                                            i15++;
                                                        } else {
                                                            z20 = true;
                                                        }
                                                    }
                                                    n11 = i.n(str3.subSequence(i15, length4 + 1).toString());
                                                }
                                            } else if (z19) {
                                                i14++;
                                            } else {
                                                z18 = true;
                                            }
                                        }
                                        i13 = i.n(str2.subSequence(i14, length3 + 1).toString());
                                        String str32 = strArr[1];
                                        length4 = str32.length() - 1;
                                        i15 = 0;
                                        boolean z202 = false;
                                        while (i15 <= length4) {
                                        }
                                        n11 = i.n(str32.subSequence(i15, length4 + 1).toString());
                                    }
                                }
                            }
                            emptyList2 = CollectionsKt.emptyList();
                            String[] strArr2 = (String[]) emptyList2.toArray(new String[0]);
                            String str22 = strArr2[0];
                            length3 = str22.length() - 1;
                            i14 = 0;
                            boolean z182 = false;
                            while (i14 <= length3) {
                            }
                            i13 = i.n(str22.subSequence(i14, length3 + 1).toString());
                            String str322 = strArr2[1];
                            length4 = str322.length() - 1;
                            i15 = 0;
                            boolean z2022 = false;
                            while (i15 <= length4) {
                            }
                            n11 = i.n(str322.subSequence(i15, length4 + 1).toString());
                        } else {
                            n11 = i.n(a10);
                            i13 = 0;
                        }
                        return TextUtils.isDigitsOnly(message) && message.length() >= i13 && message.length() <= n11;
                    }
                    C3941j c3941j2 = new C3941j(C3941j.f44551d);
                    if (!c3941j2.b(this.format)) {
                        return true;
                    }
                    String a11 = c3941j2.a(1);
                    Intrinsics.checkNotNull(a11);
                    if (StringsKt.contains$default((CharSequence) a11, (CharSequence) "-", false, 2, (Object) null)) {
                        List<String> split2 = new Regex("-").split(a11, 0);
                        if (!split2.isEmpty()) {
                            ListIterator<String> listIterator2 = split2.listIterator(split2.size());
                            while (listIterator2.hasPrevious()) {
                                if (listIterator2.previous().length() != 0) {
                                    emptyList = CollectionsKt.take(split2, listIterator2.nextIndex() + 1);
                                    String[] strArr3 = (String[]) emptyList.toArray(new String[0]);
                                    String str4 = strArr3[0];
                                    length = str4.length() - 1;
                                    i11 = 0;
                                    boolean z22 = false;
                                    while (i11 <= length) {
                                        boolean z23 = Intrinsics.compare((int) str4.charAt(!z22 ? i11 : length), 32) <= 0;
                                        if (z22) {
                                            if (z23) {
                                                length--;
                                            } else {
                                                i10 = i.n(str4.subSequence(i11, length + 1).toString());
                                                String str5 = strArr3[1];
                                                length2 = str5.length() - 1;
                                                i12 = 0;
                                                boolean z24 = false;
                                                while (i12 <= length2) {
                                                    boolean z25 = Intrinsics.compare((int) str5.charAt(!z24 ? i12 : length2), 32) <= 0;
                                                    if (z24) {
                                                        if (z25) {
                                                            length2--;
                                                        } else {
                                                            n10 = i.n(str5.subSequence(i12, length2 + 1).toString());
                                                        }
                                                    } else if (z25) {
                                                        i12++;
                                                    } else {
                                                        z24 = true;
                                                    }
                                                }
                                                n10 = i.n(str5.subSequence(i12, length2 + 1).toString());
                                            }
                                        } else if (z23) {
                                            i11++;
                                        } else {
                                            z22 = true;
                                        }
                                    }
                                    i10 = i.n(str4.subSequence(i11, length + 1).toString());
                                    String str52 = strArr3[1];
                                    length2 = str52.length() - 1;
                                    i12 = 0;
                                    boolean z242 = false;
                                    while (i12 <= length2) {
                                    }
                                    n10 = i.n(str52.subSequence(i12, length2 + 1).toString());
                                }
                            }
                        }
                        emptyList = CollectionsKt.emptyList();
                        String[] strArr32 = (String[]) emptyList.toArray(new String[0]);
                        String str42 = strArr32[0];
                        length = str42.length() - 1;
                        i11 = 0;
                        boolean z222 = false;
                        while (i11 <= length) {
                        }
                        i10 = i.n(str42.subSequence(i11, length + 1).toString());
                        String str522 = strArr32[1];
                        length2 = str522.length() - 1;
                        i12 = 0;
                        boolean z2422 = false;
                        while (i12 <= length2) {
                        }
                        n10 = i.n(str522.subSequence(i12, length2 + 1).toString());
                    } else {
                        n10 = i.n(a11);
                        i10 = 0;
                    }
                    int length9 = message.length();
                    return i10 <= length9 && length9 <= n10;
                }
            }

            @Keep
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$LinkInfo;", "", "thumbnailUrl", "", "title", "favIconLink", "providerUrl", "providerName", EventKeys.URL, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFavIconLink", "()Ljava/lang/String;", "getProviderName", "getProviderUrl", "getThumbnailUrl", "getTitle", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class LinkInfo {

                @Gb.c("favicon_link")
                @Nullable
                private final String favIconLink;

                @Gb.c("provider_name")
                @Nullable
                private final String providerName;

                @Gb.c("provider_url")
                @Nullable
                private final String providerUrl;

                @Gb.c("thumbnail_url")
                @Nullable
                private final String thumbnailUrl;

                @Gb.c("title")
                @Nullable
                private final String title;

                @Gb.c(EventKeys.URL)
                @Nullable
                private final String url;

                public LinkInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
                    this.thumbnailUrl = str;
                    this.title = str2;
                    this.favIconLink = str3;
                    this.providerUrl = str4;
                    this.providerName = str5;
                    this.url = str6;
                }

                public static /* synthetic */ LinkInfo copy$default(LinkInfo linkInfo, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = linkInfo.thumbnailUrl;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = linkInfo.title;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = linkInfo.favIconLink;
                    }
                    if ((i10 & 8) != 0) {
                        str4 = linkInfo.providerUrl;
                    }
                    if ((i10 & 16) != 0) {
                        str5 = linkInfo.providerName;
                    }
                    if ((i10 & 32) != 0) {
                        str6 = linkInfo.url;
                    }
                    String str7 = str5;
                    String str8 = str6;
                    return linkInfo.copy(str, str2, str3, str4, str7, str8);
                }

                @Nullable
                /* renamed from: component1, reason: from getter */
                public final String getThumbnailUrl() {
                    return this.thumbnailUrl;
                }

                @Nullable
                /* renamed from: component2, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @Nullable
                /* renamed from: component3, reason: from getter */
                public final String getFavIconLink() {
                    return this.favIconLink;
                }

                @Nullable
                /* renamed from: component4, reason: from getter */
                public final String getProviderUrl() {
                    return this.providerUrl;
                }

                @Nullable
                /* renamed from: component5, reason: from getter */
                public final String getProviderName() {
                    return this.providerName;
                }

                @Nullable
                /* renamed from: component6, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                @NotNull
                public final LinkInfo copy(@Nullable String thumbnailUrl, @Nullable String title, @Nullable String favIconLink, @Nullable String providerUrl, @Nullable String providerName, @Nullable String url) {
                    return new LinkInfo(thumbnailUrl, title, favIconLink, providerUrl, providerName, url);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof LinkInfo)) {
                        return false;
                    }
                    LinkInfo linkInfo = (LinkInfo) other;
                    return Intrinsics.areEqual(this.thumbnailUrl, linkInfo.thumbnailUrl) && Intrinsics.areEqual(this.title, linkInfo.title) && Intrinsics.areEqual(this.favIconLink, linkInfo.favIconLink) && Intrinsics.areEqual(this.providerUrl, linkInfo.providerUrl) && Intrinsics.areEqual(this.providerName, linkInfo.providerName) && Intrinsics.areEqual(this.url, linkInfo.url);
                }

                @Nullable
                public final String getFavIconLink() {
                    return this.favIconLink;
                }

                @Nullable
                public final String getProviderName() {
                    return this.providerName;
                }

                @Nullable
                public final String getProviderUrl() {
                    return this.providerUrl;
                }

                @Nullable
                public final String getThumbnailUrl() {
                    return this.thumbnailUrl;
                }

                @Nullable
                public final String getTitle() {
                    return this.title;
                }

                @Nullable
                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    String str = this.thumbnailUrl;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.title;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.favIconLink;
                    int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.providerUrl;
                    int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    String str5 = this.providerName;
                    int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                    String str6 = this.url;
                    return hashCode5 + (str6 != null ? str6.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "LinkInfo(thumbnailUrl=" + this.thumbnailUrl + ", title=" + this.title + ", favIconLink=" + this.favIconLink + ", providerUrl=" + this.providerUrl + ", providerName=" + this.providerName + ", url=" + this.url + ')';
                }
            }

            @Keep
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Phrase;", "", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Phrase {

                @Gb.c("text")
                @Nullable
                private final String text;

                public Phrase(@Nullable String str) {
                    this.text = str;
                }

                public static /* synthetic */ Phrase copy$default(Phrase phrase, String str, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = phrase.text;
                    }
                    return phrase.copy(str);
                }

                @Nullable
                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                @NotNull
                public final Phrase copy(@Nullable String text) {
                    return new Phrase(text);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Phrase) && Intrinsics.areEqual(this.text, ((Phrase) other).text);
                }

                @Nullable
                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    String str = this.text;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Phrase(text=" + this.text + ')';
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class a {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ a[] $VALUES;

                @Gb.c("fit")
                public static final a Fit = new a("Fit", 0);

                @Gb.c("fill")
                public static final a Fill = new a("Fill", 1);

                private static final /* synthetic */ a[] $values() {
                    return new a[]{Fit, Fill};
                }

                static {
                    a[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = EnumEntriesKt.enumEntries($values);
                }

                private a(String str, int i10) {
                }

                @NotNull
                public static EnumEntries<a> getEntries() {
                    return $ENTRIES;
                }

                public static a valueOf(String str) {
                    return (a) Enum.valueOf(a.class, str);
                }

                public static a[] values() {
                    return (a[]) $VALUES.clone();
                }
            }

            public DisplayCard(@Nullable String str, @Nullable a aVar, @Nullable g gVar, @Nullable List<Element> list, @Nullable List<Link> list2, @Nullable List<Action> list3, @Nullable String str2, @Nullable String str3, @Nullable Articles articles, @Nullable InputValidation inputValidation, @Nullable Boolean bool, @Nullable String str4, @Nullable String str5, @Nullable List<Phrase> list4, @Nullable LinkInfo linkInfo, @Nullable Boolean bool2) {
                this.image = str;
                this.imagePosition = aVar;
                this.type = gVar;
                this.elements = list;
                this.links = list2;
                this.actions = list3;
                this.url = str2;
                this.description = str3;
                this.articles = articles;
                this.validation = inputValidation;
                this.isHideLabel = bool;
                this.title = str4;
                this.subTitle = str5;
                this.phrases = list4;
                this.linkInfo = linkInfo;
                this.autoplay = bool2;
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            @Nullable
            /* renamed from: component10, reason: from getter */
            public final InputValidation getValidation() {
                return this.validation;
            }

            @Nullable
            /* renamed from: component11, reason: from getter */
            public final Boolean getIsHideLabel() {
                return this.isHideLabel;
            }

            @Nullable
            /* renamed from: component12, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @Nullable
            /* renamed from: component13, reason: from getter */
            public final String getSubTitle() {
                return this.subTitle;
            }

            @Nullable
            public final List<Phrase> component14() {
                return this.phrases;
            }

            @Nullable
            /* renamed from: component15, reason: from getter */
            public final LinkInfo getLinkInfo() {
                return this.linkInfo;
            }

            @Nullable
            /* renamed from: component16, reason: from getter */
            public final Boolean getAutoplay() {
                return this.autoplay;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final a getImagePosition() {
                return this.imagePosition;
            }

            @Nullable
            /* renamed from: component3, reason: from getter */
            public final g getType() {
                return this.type;
            }

            @Nullable
            public final List<Element> component4() {
                return this.elements;
            }

            @Nullable
            public final List<Link> component5() {
                return this.links;
            }

            @Nullable
            public final List<Action> component6() {
                return this.actions;
            }

            @Nullable
            /* renamed from: component7, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            @Nullable
            /* renamed from: component8, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @Nullable
            /* renamed from: component9, reason: from getter */
            public final Articles getArticles() {
                return this.articles;
            }

            @NotNull
            public final DisplayCard copy(@Nullable String image, @Nullable a imagePosition, @Nullable g type, @Nullable List<Element> elements, @Nullable List<Link> links, @Nullable List<Action> actions, @Nullable String url, @Nullable String description, @Nullable Articles articles, @Nullable InputValidation validation, @Nullable Boolean isHideLabel, @Nullable String title, @Nullable String subTitle, @Nullable List<Phrase> phrases, @Nullable LinkInfo linkInfo, @Nullable Boolean autoplay) {
                return new DisplayCard(image, imagePosition, type, elements, links, actions, url, description, articles, validation, isHideLabel, title, subTitle, phrases, linkInfo, autoplay);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplayCard)) {
                    return false;
                }
                DisplayCard displayCard = (DisplayCard) other;
                return Intrinsics.areEqual(this.image, displayCard.image) && this.imagePosition == displayCard.imagePosition && this.type == displayCard.type && Intrinsics.areEqual(this.elements, displayCard.elements) && Intrinsics.areEqual(this.links, displayCard.links) && Intrinsics.areEqual(this.actions, displayCard.actions) && Intrinsics.areEqual(this.url, displayCard.url) && Intrinsics.areEqual(this.description, displayCard.description) && Intrinsics.areEqual(this.articles, displayCard.articles) && Intrinsics.areEqual(this.validation, displayCard.validation) && Intrinsics.areEqual(this.isHideLabel, displayCard.isHideLabel) && Intrinsics.areEqual(this.title, displayCard.title) && Intrinsics.areEqual(this.subTitle, displayCard.subTitle) && Intrinsics.areEqual(this.phrases, displayCard.phrases) && Intrinsics.areEqual(this.linkInfo, displayCard.linkInfo) && Intrinsics.areEqual(this.autoplay, displayCard.autoplay);
            }

            @Nullable
            public final List<Action> getActions() {
                return this.actions;
            }

            @Nullable
            public final Articles getArticles() {
                return this.articles;
            }

            @Nullable
            public final Boolean getAutoplay() {
                return this.autoplay;
            }

            @Nullable
            public final String getDescription() {
                return this.description;
            }

            @Nullable
            public final List<Element> getElements() {
                return this.elements;
            }

            @Nullable
            public final String getImage() {
                return this.image;
            }

            @Nullable
            public final a getImagePosition() {
                return this.imagePosition;
            }

            @Nullable
            public final LinkInfo getLinkInfo() {
                return this.linkInfo;
            }

            @Nullable
            public final List<Link> getLinks() {
                return this.links;
            }

            @Nullable
            public final List<Phrase> getPhrases() {
                return this.phrases;
            }

            @Nullable
            public final String getSubTitle() {
                return this.subTitle;
            }

            @Nullable
            public final String getTitle() {
                return this.title;
            }

            @Nullable
            public final g getType() {
                return this.type;
            }

            @Nullable
            public final String getUrl() {
                return this.url;
            }

            @Nullable
            public final InputValidation getValidation() {
                return this.validation;
            }

            public int hashCode() {
                String str = this.image;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                a aVar = this.imagePosition;
                int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                g gVar = this.type;
                int hashCode3 = (hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
                List<Element> list = this.elements;
                int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
                List<Link> list2 = this.links;
                int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
                List<Action> list3 = this.actions;
                int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
                String str2 = this.url;
                int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Articles articles = this.articles;
                int hashCode9 = (hashCode8 + (articles == null ? 0 : articles.hashCode())) * 31;
                InputValidation inputValidation = this.validation;
                int hashCode10 = (hashCode9 + (inputValidation == null ? 0 : inputValidation.hashCode())) * 31;
                Boolean bool = this.isHideLabel;
                int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str4 = this.title;
                int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.subTitle;
                int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
                List<Phrase> list4 = this.phrases;
                int hashCode14 = (hashCode13 + (list4 == null ? 0 : list4.hashCode())) * 31;
                LinkInfo linkInfo = this.linkInfo;
                int hashCode15 = (hashCode14 + (linkInfo == null ? 0 : linkInfo.hashCode())) * 31;
                Boolean bool2 = this.autoplay;
                return hashCode15 + (bool2 != null ? bool2.hashCode() : 0);
            }

            @Nullable
            public final Boolean isHideLabel() {
                return this.isHideLabel;
            }

            @NotNull
            public String toString() {
                return "DisplayCard(image=" + this.image + ", imagePosition=" + this.imagePosition + ", type=" + this.type + ", elements=" + this.elements + ", links=" + this.links + ", actions=" + this.actions + ", url=" + this.url + ", description=" + this.description + ", articles=" + this.articles + ", validation=" + this.validation + ", isHideLabel=" + this.isHideLabel + ", title=" + this.title + ", subTitle=" + this.subTitle + ", phrases=" + this.phrases + ", linkInfo=" + this.linkInfo + ", autoplay=" + this.autoplay + ')';
            }

            @Keep
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Link;", "", "text", "", EventKeys.URL, "icon", "target", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Link$Target;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Link$Target;)V", "getIcon", "()Ljava/lang/String;", "getTarget", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Link$Target;", "getText", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Target", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Link {

                @Gb.c("icon")
                @Nullable
                private final String icon;

                @Gb.c("target")
                @NotNull
                private final Target target;

                @Gb.c("text")
                @Nullable
                private final String text;

                @Gb.c(EventKeys.URL)
                @Nullable
                private final String url;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                @Keep
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$DisplayCard$Link$Target;", "", "(Ljava/lang/String;I)V", "Self", "NewWindow", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Target {
                    private static final /* synthetic */ EnumEntries $ENTRIES;
                    private static final /* synthetic */ Target[] $VALUES;

                    @Gb.c("_self")
                    public static final Target Self = new Target("Self", 0);

                    @Gb.c("_blank")
                    public static final Target NewWindow = new Target("NewWindow", 1);

                    private static final /* synthetic */ Target[] $values() {
                        return new Target[]{Self, NewWindow};
                    }

                    static {
                        Target[] $values = $values();
                        $VALUES = $values;
                        $ENTRIES = EnumEntriesKt.enumEntries($values);
                    }

                    private Target(String str, int i10) {
                    }

                    @NotNull
                    public static EnumEntries<Target> getEntries() {
                        return $ENTRIES;
                    }

                    public static Target valueOf(String str) {
                        return (Target) Enum.valueOf(Target.class, str);
                    }

                    public static Target[] values() {
                        return (Target[]) $VALUES.clone();
                    }
                }

                public Link(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull Target target) {
                    Intrinsics.checkNotNullParameter(target, "target");
                    this.text = str;
                    this.url = str2;
                    this.icon = str3;
                    this.target = target;
                }

                public static /* synthetic */ Link copy$default(Link link, String str, String str2, String str3, Target target, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = link.text;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = link.url;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = link.icon;
                    }
                    if ((i10 & 8) != 0) {
                        target = link.target;
                    }
                    return link.copy(str, str2, str3, target);
                }

                @Nullable
                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                @Nullable
                /* renamed from: component2, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                @Nullable
                /* renamed from: component3, reason: from getter */
                public final String getIcon() {
                    return this.icon;
                }

                @NotNull
                /* renamed from: component4, reason: from getter */
                public final Target getTarget() {
                    return this.target;
                }

                @NotNull
                public final Link copy(@Nullable String text, @Nullable String url, @Nullable String icon, @NotNull Target target) {
                    Intrinsics.checkNotNullParameter(target, "target");
                    return new Link(text, url, icon, target);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Link)) {
                        return false;
                    }
                    Link link = (Link) other;
                    return Intrinsics.areEqual(this.text, link.text) && Intrinsics.areEqual(this.url, link.url) && Intrinsics.areEqual(this.icon, link.icon) && this.target == link.target;
                }

                @Nullable
                public final String getIcon() {
                    return this.icon;
                }

                @NotNull
                public final Target getTarget() {
                    return this.target;
                }

                @Nullable
                public final String getText() {
                    return this.text;
                }

                @Nullable
                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    String str = this.text;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.url;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.icon;
                    return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.target.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Link(text=" + this.text + ", url=" + this.url + ", icon=" + this.icon + ", target=" + this.target + ')';
                }

                public /* synthetic */ Link(String str, String str2, String str3, Target target, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, str2, str3, (i10 & 8) != 0 ? Target.Self : target);
                }
            }
        }

        @Keep
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bd\b\u0087\b\u0018\u00002\u00020\u0001B»\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\f\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u0010-J\u0012\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b8\u00107J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010)J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010)J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010)J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010)J\u0012\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b=\u0010/J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003¢\u0006\u0004\b>\u0010-J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b?\u0010-J\u0010\u0010@\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b@\u00104J\u0010\u0010A\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bA\u00104J\u0010\u0010B\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bB\u00104J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010)J\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010)J\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u0010)J\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u0010)J\u0012\u0010G\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u0010)J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u0010)J\u0012\u0010I\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bI\u00107J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010)J\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u0010)Jø\u0002\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bN\u0010)J\u0010\u0010O\u001a\u00020\fHÖ\u0001¢\u0006\u0004\bO\u00104J\u001a\u0010Q\u001a\u00020\u00102\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bQ\u0010RR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010)R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010U\u001a\u0004\bV\u0010+R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010W\u001a\u0004\bX\u0010-R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010Y\u001a\u0004\bZ\u0010/R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010W\u001a\u0004\b[\u0010-R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\\\u001a\u0004\b]\u00102R\u001a\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010^\u001a\u0004\b_\u00104R\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010^\u001a\u0004\b`\u00104R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010a\u001a\u0004\b\u0011\u00107R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010a\u001a\u0004\b\u0012\u00107R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010S\u001a\u0004\bb\u0010)R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010S\u001a\u0004\bc\u0010)R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010S\u001a\u0004\bd\u0010)R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\be\u0010)R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010Y\u001a\u0004\bf\u0010/R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010W\u001a\u0004\bg\u0010-R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010W\u001a\u0004\bh\u0010-R\u001a\u0010\u001a\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010^\u001a\u0004\bi\u00104R\u001a\u0010\u001b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010^\u001a\u0004\bj\u00104R\u001a\u0010\u001c\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010^\u001a\u0004\bk\u00104R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010S\u001a\u0004\bl\u0010)R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010S\u001a\u0004\bm\u0010)R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010S\u001a\u0004\bn\u0010)R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010S\u001a\u0004\bo\u0010)R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010S\u001a\u0004\bp\u0010)R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010S\u001a\u0004\bq\u0010)R\u001c\u0010#\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010a\u001a\u0004\b#\u00107R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010S\u001a\u0004\br\u0010)R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010S\u001a\u0004\bs\u0010)¨\u0006t"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$InputCard;", "", "", ReactTextInputShadowNode.PROP_PLACEHOLDER, "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;", "type", "", "error", "Lcom/google/gson/h;", "options", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$Element;", "elements", "", "level", "maximumSelection", "minimumSelection", "", "isTime", "isTimeZone", "to", "from", "format", "timeFormat", "timeSlots", EventKeys.VALUES_KEY, "allowedFileExtensions", "minimumLimit", "maximumLimit", "maximumLength", "radius", AnnotatedPrivateKey.LABEL, "latitude", "longitude", EventKeys.VALUE_KEY, "countryCode", "isMultiple", "selectLabel", "defaultValue", "<init>", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;Ljava/util/List;Lcom/google/gson/h;Ljava/util/List;Ljava/lang/Integer;IILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/h;Ljava/util/List;Ljava/util/List;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;", "component3", "()Ljava/util/List;", "component4", "()Lcom/google/gson/h;", "component5", "component6", "()Ljava/lang/Integer;", "component7", "()I", "component8", "component9", "()Ljava/lang/Boolean;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "copy", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;Ljava/util/List;Lcom/google/gson/h;Ljava/util/List;Ljava/lang/Integer;IILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/h;Ljava/util/List;Ljava/util/List;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$Meta$InputCard;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlaceholder", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$g;", "getType", "Ljava/util/List;", "getError", "Lcom/google/gson/h;", "getOptions", "getElements", "Ljava/lang/Integer;", "getLevel", "I", "getMaximumSelection", "getMinimumSelection", "Ljava/lang/Boolean;", "getTo", "getFrom", "getFormat", "getTimeFormat", "getTimeSlots", "getValues", "getAllowedFileExtensions", "getMinimumLimit", "getMaximumLimit", "getMaximumLength", "getRadius", "getLabel", "getLatitude", "getLongitude", "getValue", "getCountryCode", "getSelectLabel", "getDefaultValue", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InputCard {

            @Gb.c("allowed_formats")
            @Nullable
            private final List<String> allowedFileExtensions;

            @Gb.c("country_code")
            @Nullable
            private final String countryCode;

            @Gb.c("default_value")
            @Nullable
            private final String defaultValue;

            @Gb.c("elements")
            @Nullable
            private final List<Element> elements;

            @Gb.c("error")
            @Nullable
            private final List<String> error;

            @Gb.c("format")
            @Nullable
            private final String format;

            @Gb.c("from")
            @Nullable
            private final String from;

            @Gb.c("multiple")
            @Nullable
            private final Boolean isMultiple;

            @Gb.c("time")
            @Nullable
            private final Boolean isTime;

            @Gb.c("tz")
            @Nullable
            private final Boolean isTimeZone;

            @Gb.c(AnnotatedPrivateKey.LABEL)
            @Nullable
            private final String label;

            @Gb.c("lat")
            @Nullable
            private final String latitude;

            @Gb.c("level")
            @Nullable
            private final Integer level;

            @Gb.c("lng")
            @Nullable
            private final String longitude;

            @Gb.c("maxlength")
            private final int maximumLength;

            @Gb.c("max")
            private final int maximumLimit;

            @Gb.c("max_selection")
            private final int maximumSelection;

            @Gb.c("min")
            private final int minimumLimit;

            @Gb.c("min_selection")
            private final int minimumSelection;

            @Gb.c("options")
            @Nullable
            private final h options;

            @Gb.c(ReactTextInputShadowNode.PROP_PLACEHOLDER)
            @Nullable
            private final String placeholder;

            @Gb.c("radius")
            @Nullable
            private final String radius;

            @Gb.c("select_label")
            @Nullable
            private final String selectLabel;

            @Gb.c("timeformat")
            @Nullable
            private final String timeFormat;

            @Gb.c("slots")
            @Nullable
            private final h timeSlots;

            @Gb.c("to")
            @Nullable
            private final String to;

            @Gb.c("type")
            @Nullable
            private final g type;

            @Gb.c(EventKeys.VALUE_KEY)
            @Nullable
            private final String value;

            @Gb.c(EventKeys.VALUES_KEY)
            @NotNull
            private final List<Object> values;

            public InputCard(@Nullable String str, @Nullable g gVar, @Nullable List<String> list, @Nullable h hVar, @Nullable List<Element> list2, @Nullable Integer num, int i10, int i11, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable h hVar2, @NotNull List<? extends Object> values, @Nullable List<String> list3, int i12, int i13, int i14, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Boolean bool3, @Nullable String str12, @Nullable String str13) {
                Intrinsics.checkNotNullParameter(values, "values");
                this.placeholder = str;
                this.type = gVar;
                this.error = list;
                this.options = hVar;
                this.elements = list2;
                this.level = num;
                this.maximumSelection = i10;
                this.minimumSelection = i11;
                this.isTime = bool;
                this.isTimeZone = bool2;
                this.to = str2;
                this.from = str3;
                this.format = str4;
                this.timeFormat = str5;
                this.timeSlots = hVar2;
                this.values = values;
                this.allowedFileExtensions = list3;
                this.minimumLimit = i12;
                this.maximumLimit = i13;
                this.maximumLength = i14;
                this.radius = str6;
                this.label = str7;
                this.latitude = str8;
                this.longitude = str9;
                this.value = str10;
                this.countryCode = str11;
                this.isMultiple = bool3;
                this.selectLabel = str12;
                this.defaultValue = str13;
            }

            public static /* synthetic */ InputCard copy$default(InputCard inputCard, String str, g gVar, List list, h hVar, List list2, Integer num, int i10, int i11, Boolean bool, Boolean bool2, String str2, String str3, String str4, String str5, h hVar2, List list3, List list4, int i12, int i13, int i14, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool3, String str12, String str13, int i15, Object obj) {
                String str14;
                String str15;
                String str16 = (i15 & 1) != 0 ? inputCard.placeholder : str;
                g gVar2 = (i15 & 2) != 0 ? inputCard.type : gVar;
                List list5 = (i15 & 4) != 0 ? inputCard.error : list;
                h hVar3 = (i15 & 8) != 0 ? inputCard.options : hVar;
                List list6 = (i15 & 16) != 0 ? inputCard.elements : list2;
                Integer num2 = (i15 & 32) != 0 ? inputCard.level : num;
                int i16 = (i15 & 64) != 0 ? inputCard.maximumSelection : i10;
                int i17 = (i15 & 128) != 0 ? inputCard.minimumSelection : i11;
                Boolean bool4 = (i15 & 256) != 0 ? inputCard.isTime : bool;
                Boolean bool5 = (i15 & 512) != 0 ? inputCard.isTimeZone : bool2;
                String str17 = (i15 & 1024) != 0 ? inputCard.to : str2;
                String str18 = (i15 & 2048) != 0 ? inputCard.from : str3;
                String str19 = (i15 & 4096) != 0 ? inputCard.format : str4;
                String str20 = (i15 & 8192) != 0 ? inputCard.timeFormat : str5;
                String str21 = str16;
                h hVar4 = (i15 & 16384) != 0 ? inputCard.timeSlots : hVar2;
                List list7 = (i15 & 32768) != 0 ? inputCard.values : list3;
                List list8 = (i15 & PKIFailureInfo.notAuthorized) != 0 ? inputCard.allowedFileExtensions : list4;
                int i18 = (i15 & PKIFailureInfo.unsupportedVersion) != 0 ? inputCard.minimumLimit : i12;
                int i19 = (i15 & PKIFailureInfo.transactionIdInUse) != 0 ? inputCard.maximumLimit : i13;
                int i20 = (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? inputCard.maximumLength : i14;
                String str22 = (i15 & PKIFailureInfo.badCertTemplate) != 0 ? inputCard.radius : str6;
                String str23 = (i15 & PKIFailureInfo.badSenderNonce) != 0 ? inputCard.label : str7;
                String str24 = (i15 & 4194304) != 0 ? inputCard.latitude : str8;
                String str25 = (i15 & 8388608) != 0 ? inputCard.longitude : str9;
                String str26 = (i15 & 16777216) != 0 ? inputCard.value : str10;
                String str27 = (i15 & 33554432) != 0 ? inputCard.countryCode : str11;
                Boolean bool6 = (i15 & AudioRoutingController.DEVICE_OUT_USB_HEADSET) != 0 ? inputCard.isMultiple : bool3;
                String str28 = (i15 & 134217728) != 0 ? inputCard.selectLabel : str12;
                if ((i15 & 268435456) != 0) {
                    str15 = str28;
                    str14 = inputCard.defaultValue;
                } else {
                    str14 = str13;
                    str15 = str28;
                }
                return inputCard.copy(str21, gVar2, list5, hVar3, list6, num2, i16, i17, bool4, bool5, str17, str18, str19, str20, hVar4, list7, list8, i18, i19, i20, str22, str23, str24, str25, str26, str27, bool6, str15, str14);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            @Nullable
            /* renamed from: component10, reason: from getter */
            public final Boolean getIsTimeZone() {
                return this.isTimeZone;
            }

            @Nullable
            /* renamed from: component11, reason: from getter */
            public final String getTo() {
                return this.to;
            }

            @Nullable
            /* renamed from: component12, reason: from getter */
            public final String getFrom() {
                return this.from;
            }

            @Nullable
            /* renamed from: component13, reason: from getter */
            public final String getFormat() {
                return this.format;
            }

            @Nullable
            /* renamed from: component14, reason: from getter */
            public final String getTimeFormat() {
                return this.timeFormat;
            }

            @Nullable
            /* renamed from: component15, reason: from getter */
            public final h getTimeSlots() {
                return this.timeSlots;
            }

            @NotNull
            public final List<Object> component16() {
                return this.values;
            }

            @Nullable
            public final List<String> component17() {
                return this.allowedFileExtensions;
            }

            /* renamed from: component18, reason: from getter */
            public final int getMinimumLimit() {
                return this.minimumLimit;
            }

            /* renamed from: component19, reason: from getter */
            public final int getMaximumLimit() {
                return this.maximumLimit;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final g getType() {
                return this.type;
            }

            /* renamed from: component20, reason: from getter */
            public final int getMaximumLength() {
                return this.maximumLength;
            }

            @Nullable
            /* renamed from: component21, reason: from getter */
            public final String getRadius() {
                return this.radius;
            }

            @Nullable
            /* renamed from: component22, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            @Nullable
            /* renamed from: component23, reason: from getter */
            public final String getLatitude() {
                return this.latitude;
            }

            @Nullable
            /* renamed from: component24, reason: from getter */
            public final String getLongitude() {
                return this.longitude;
            }

            @Nullable
            /* renamed from: component25, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            @Nullable
            /* renamed from: component26, reason: from getter */
            public final String getCountryCode() {
                return this.countryCode;
            }

            @Nullable
            /* renamed from: component27, reason: from getter */
            public final Boolean getIsMultiple() {
                return this.isMultiple;
            }

            @Nullable
            /* renamed from: component28, reason: from getter */
            public final String getSelectLabel() {
                return this.selectLabel;
            }

            @Nullable
            /* renamed from: component29, reason: from getter */
            public final String getDefaultValue() {
                return this.defaultValue;
            }

            @Nullable
            public final List<String> component3() {
                return this.error;
            }

            @Nullable
            /* renamed from: component4, reason: from getter */
            public final h getOptions() {
                return this.options;
            }

            @Nullable
            public final List<Element> component5() {
                return this.elements;
            }

            @Nullable
            /* renamed from: component6, reason: from getter */
            public final Integer getLevel() {
                return this.level;
            }

            /* renamed from: component7, reason: from getter */
            public final int getMaximumSelection() {
                return this.maximumSelection;
            }

            /* renamed from: component8, reason: from getter */
            public final int getMinimumSelection() {
                return this.minimumSelection;
            }

            @Nullable
            /* renamed from: component9, reason: from getter */
            public final Boolean getIsTime() {
                return this.isTime;
            }

            @NotNull
            public final InputCard copy(@Nullable String placeholder, @Nullable g type, @Nullable List<String> error, @Nullable h options, @Nullable List<Element> elements, @Nullable Integer level, int maximumSelection, int minimumSelection, @Nullable Boolean isTime, @Nullable Boolean isTimeZone, @Nullable String to, @Nullable String from, @Nullable String format, @Nullable String timeFormat, @Nullable h timeSlots, @NotNull List<? extends Object> values, @Nullable List<String> allowedFileExtensions, int minimumLimit, int maximumLimit, int maximumLength, @Nullable String radius, @Nullable String label, @Nullable String latitude, @Nullable String longitude, @Nullable String value, @Nullable String countryCode, @Nullable Boolean isMultiple, @Nullable String selectLabel, @Nullable String defaultValue) {
                Intrinsics.checkNotNullParameter(values, "values");
                return new InputCard(placeholder, type, error, options, elements, level, maximumSelection, minimumSelection, isTime, isTimeZone, to, from, format, timeFormat, timeSlots, values, allowedFileExtensions, minimumLimit, maximumLimit, maximumLength, radius, label, latitude, longitude, value, countryCode, isMultiple, selectLabel, defaultValue);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InputCard)) {
                    return false;
                }
                InputCard inputCard = (InputCard) other;
                return Intrinsics.areEqual(this.placeholder, inputCard.placeholder) && this.type == inputCard.type && Intrinsics.areEqual(this.error, inputCard.error) && Intrinsics.areEqual(this.options, inputCard.options) && Intrinsics.areEqual(this.elements, inputCard.elements) && Intrinsics.areEqual(this.level, inputCard.level) && this.maximumSelection == inputCard.maximumSelection && this.minimumSelection == inputCard.minimumSelection && Intrinsics.areEqual(this.isTime, inputCard.isTime) && Intrinsics.areEqual(this.isTimeZone, inputCard.isTimeZone) && Intrinsics.areEqual(this.to, inputCard.to) && Intrinsics.areEqual(this.from, inputCard.from) && Intrinsics.areEqual(this.format, inputCard.format) && Intrinsics.areEqual(this.timeFormat, inputCard.timeFormat) && Intrinsics.areEqual(this.timeSlots, inputCard.timeSlots) && Intrinsics.areEqual(this.values, inputCard.values) && Intrinsics.areEqual(this.allowedFileExtensions, inputCard.allowedFileExtensions) && this.minimumLimit == inputCard.minimumLimit && this.maximumLimit == inputCard.maximumLimit && this.maximumLength == inputCard.maximumLength && Intrinsics.areEqual(this.radius, inputCard.radius) && Intrinsics.areEqual(this.label, inputCard.label) && Intrinsics.areEqual(this.latitude, inputCard.latitude) && Intrinsics.areEqual(this.longitude, inputCard.longitude) && Intrinsics.areEqual(this.value, inputCard.value) && Intrinsics.areEqual(this.countryCode, inputCard.countryCode) && Intrinsics.areEqual(this.isMultiple, inputCard.isMultiple) && Intrinsics.areEqual(this.selectLabel, inputCard.selectLabel) && Intrinsics.areEqual(this.defaultValue, inputCard.defaultValue);
            }

            @Nullable
            public final List<String> getAllowedFileExtensions() {
                return this.allowedFileExtensions;
            }

            @Nullable
            public final String getCountryCode() {
                return this.countryCode;
            }

            @Nullable
            public final String getDefaultValue() {
                return this.defaultValue;
            }

            @Nullable
            public final List<Element> getElements() {
                return this.elements;
            }

            @Nullable
            public final List<String> getError() {
                return this.error;
            }

            @Nullable
            public final String getFormat() {
                return this.format;
            }

            @Nullable
            public final String getFrom() {
                return this.from;
            }

            @Nullable
            public final String getLabel() {
                return this.label;
            }

            @Nullable
            public final String getLatitude() {
                return this.latitude;
            }

            @Nullable
            public final Integer getLevel() {
                return this.level;
            }

            @Nullable
            public final String getLongitude() {
                return this.longitude;
            }

            public final int getMaximumLength() {
                return this.maximumLength;
            }

            public final int getMaximumLimit() {
                return this.maximumLimit;
            }

            public final int getMaximumSelection() {
                return this.maximumSelection;
            }

            public final int getMinimumLimit() {
                return this.minimumLimit;
            }

            public final int getMinimumSelection() {
                return this.minimumSelection;
            }

            @Nullable
            public final h getOptions() {
                return this.options;
            }

            @Nullable
            public final String getPlaceholder() {
                return this.placeholder;
            }

            @Nullable
            public final String getRadius() {
                return this.radius;
            }

            @Nullable
            public final String getSelectLabel() {
                return this.selectLabel;
            }

            @Nullable
            public final String getTimeFormat() {
                return this.timeFormat;
            }

            @Nullable
            public final h getTimeSlots() {
                return this.timeSlots;
            }

            @Nullable
            public final String getTo() {
                return this.to;
            }

            @Nullable
            public final g getType() {
                return this.type;
            }

            @Nullable
            public final String getValue() {
                return this.value;
            }

            @NotNull
            public final List<Object> getValues() {
                return this.values;
            }

            public int hashCode() {
                String str = this.placeholder;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                g gVar = this.type;
                int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
                List<String> list = this.error;
                int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                h hVar = this.options;
                int hashCode4 = (hashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
                List<Element> list2 = this.elements;
                int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
                Integer num = this.level;
                int hashCode6 = (((((hashCode5 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.maximumSelection)) * 31) + Integer.hashCode(this.minimumSelection)) * 31;
                Boolean bool = this.isTime;
                int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.isTimeZone;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                String str2 = this.to;
                int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.from;
                int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.format;
                int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.timeFormat;
                int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
                h hVar2 = this.timeSlots;
                int hashCode13 = (((hashCode12 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31) + this.values.hashCode()) * 31;
                List<String> list3 = this.allowedFileExtensions;
                int hashCode14 = (((((((hashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31) + Integer.hashCode(this.minimumLimit)) * 31) + Integer.hashCode(this.maximumLimit)) * 31) + Integer.hashCode(this.maximumLength)) * 31;
                String str6 = this.radius;
                int hashCode15 = (hashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.label;
                int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.latitude;
                int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.longitude;
                int hashCode18 = (hashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.value;
                int hashCode19 = (hashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.countryCode;
                int hashCode20 = (hashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
                Boolean bool3 = this.isMultiple;
                int hashCode21 = (hashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                String str12 = this.selectLabel;
                int hashCode22 = (hashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.defaultValue;
                return hashCode22 + (str13 != null ? str13.hashCode() : 0);
            }

            @Nullable
            public final Boolean isMultiple() {
                return this.isMultiple;
            }

            @Nullable
            public final Boolean isTime() {
                return this.isTime;
            }

            @Nullable
            public final Boolean isTimeZone() {
                return this.isTimeZone;
            }

            @NotNull
            public String toString() {
                return "InputCard(placeholder=" + this.placeholder + ", type=" + this.type + ", error=" + this.error + ", options=" + this.options + ", elements=" + this.elements + ", level=" + this.level + ", maximumSelection=" + this.maximumSelection + ", minimumSelection=" + this.minimumSelection + ", isTime=" + this.isTime + ", isTimeZone=" + this.isTimeZone + ", to=" + this.to + ", from=" + this.from + ", format=" + this.format + ", timeFormat=" + this.timeFormat + ", timeSlots=" + this.timeSlots + ", values=" + this.values + ", allowedFileExtensions=" + this.allowedFileExtensions + ", minimumLimit=" + this.minimumLimit + ", maximumLimit=" + this.maximumLimit + ", maximumLength=" + this.maximumLength + ", radius=" + this.radius + ", label=" + this.label + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", value=" + this.value + ", countryCode=" + this.countryCode + ", isMultiple=" + this.isMultiple + ", selectLabel=" + this.selectLabel + ", defaultValue=" + this.defaultValue + ')';
            }

            public /* synthetic */ InputCard(String str, g gVar, List list, h hVar, List list2, Integer num, int i10, int i11, Boolean bool, Boolean bool2, String str2, String str3, String str4, String str5, h hVar2, List list3, List list4, int i12, int i13, int i14, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool3, String str12, String str13, int i15, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, gVar, list, hVar, list2, num, (i15 & 64) != 0 ? 0 : i10, (i15 & 128) != 0 ? 1 : i11, bool, bool2, str2, str3, str4, str5, hVar2, (i15 & 32768) != 0 ? CollectionsKt.emptyList() : list3, list4, i12, i13, i14, str6, str7, str8, str9, str10, str11, bool3, str12, str13);
            }
        }

        public /* synthetic */ Meta(DisplayCard displayCard, InputCard inputCard, Boolean bool, HandOffConfiguration handOffConfiguration, Long l10, Integer num, List list, h hVar, CardData cardData, Boolean bool2, String str, Boolean bool3, List list2, Boolean bool4, String str2, User user, User user2, String str3, String str4, Long l11, Long l12, h hVar2, String str5, Boolean bool5, String str6, String str7, b bVar, Boolean bool6, String str8, String str9, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(displayCard, inputCard, bool, handOffConfiguration, l10, num, list, hVar, cardData, bool2, str, bool3, list2, bool4, str2, user, user2, str3, str4, l11, l12, hVar2, str5, bool5, str6, str7, bVar, bool6, str8, str9, (i10 & 1073741824) != 0 ? false : z10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -256, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    @JvmStatic
    @NotNull
    public static final Message newInstance(@Nullable String str, @Nullable String str2, @NotNull String str3, @NotNull g gVar, @NotNull f fVar, long j10, @NotNull String str4, @Nullable String str5, long j11, long j12, @Nullable String str6, @Nullable String str7, @Nullable Integer num) {
        return INSTANCE.d(str, str2, str3, gVar, fVar, j10, str4, str5, j11, j12, str6, str7, num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -512, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -1024, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -2048, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -4096, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -8192, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -16384, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -32768, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -65536, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -131072, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    @Keep
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u00049:;<B\u008d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0099\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u00105\u001a\u0004\u0018\u00010\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001f¨\u0006="}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage;", "", "message", "", "mode", "time", "userList", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;", "operationUser", "transferTo", "joinUrl", "startUrl", "operation", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Operation;", "media", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Media;", "transferMessage", "department", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Department;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Operation;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Media;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Department;)V", "getDepartment", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Department;", "getJoinUrl", "()Ljava/lang/String;", "getMedia", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Media;", "getMessage", "getMode", "getOperation", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Operation;", "getOperationUser", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;", "getStartUrl", "getTime", "getTransferMessage", "getTransferTo", "getUserList", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "getTransferMessageIfConfEnabled", "hashCode", "", "toString", "Department", "Media", "Mode", "Operation", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InfoMessage {

        @Gb.c("department")
        @Nullable
        private final Department department;

        @Gb.c("join_url")
        @Nullable
        private final String joinUrl;

        @Gb.c("media")
        @Nullable
        private final Media media;

        @Gb.c("message")
        @Nullable
        private final String message;

        @Gb.c("mode")
        @Nullable
        private final String mode;

        @Gb.c(alternate = {"operation"}, value = "opr")
        @Nullable
        private final Operation operation;

        @Gb.c(alternate = {"opruser"}, value = "operation_user")
        @Nullable
        private final User operationUser;

        @Gb.c("start_url")
        @Nullable
        private final String startUrl;

        @Gb.c("time")
        @Nullable
        private final String time;

        @Gb.c("transfer_message")
        @Nullable
        private final String transferMessage;

        @Gb.c("transfer_to")
        @Nullable
        private final User transferTo;

        @Gb.c("user_list")
        @Nullable
        private final User userList;

        @Keep
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Department;", "", StackTraceHelper.ID_KEY, "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Department {

            @Gb.c(StackTraceHelper.ID_KEY)
            @Nullable
            private final String id;

            @Gb.c("name")
            @Nullable
            private final String name;

            /* JADX WARN: Multi-variable type inference failed */
            public Department() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Department copy$default(Department department, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = department.id;
                }
                if ((i10 & 2) != 0) {
                    str2 = department.name;
                }
                return department.copy(str, str2);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final Department copy(@Nullable String id2, @Nullable String name) {
                return new Department(id2, name);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Department)) {
                    return false;
                }
                Department department = (Department) other;
                return Intrinsics.areEqual(this.id, department.id) && Intrinsics.areEqual(this.name, department.name);
            }

            @Nullable
            public final String getId() {
                return this.id;
            }

            @Nullable
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                String str = this.id;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.name;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Department(id=" + this.id + ", name=" + this.name + ')';
            }

            public Department(@Nullable String str, @Nullable String str2) {
                this.id = str;
                this.name = str2;
            }

            public /* synthetic */ Department(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013¨\u0006&"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Media;", "", "", "visitorAccess", "", "duration", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Media$a;", "type", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;", "operationUser", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Media$a;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Media$a;", "component4", "()Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Media$a;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;)Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Media;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getVisitorAccess", "Ljava/lang/String;", "getDuration", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Media$a;", "getType", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$User;", "getOperationUser", "a", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Media {

            @Gb.c("duration")
            @Nullable
            private final String duration;

            @Gb.c(alternate = {"oprusr"}, value = "operation_user")
            @Nullable
            private final User operationUser;

            @Gb.c("type")
            @Nullable
            private final a type;

            @Gb.c("visitoraccess")
            @Nullable
            private final Boolean visitorAccess;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class a {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ a[] $VALUES;

                @Gb.c("audio")
                public static final a Audio = new a("Audio", 0);

                @Gb.c("screen_share")
                public static final a ScreenShare = new a("ScreenShare", 1);

                @Gb.c("screen_view")
                public static final a ScreenShareRequest = new a("ScreenShareRequest", 2);

                private static final /* synthetic */ a[] $values() {
                    return new a[]{Audio, ScreenShare, ScreenShareRequest};
                }

                static {
                    a[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = EnumEntriesKt.enumEntries($values);
                }

                private a(String str, int i10) {
                }

                @NotNull
                public static EnumEntries<a> getEntries() {
                    return $ENTRIES;
                }

                public static a valueOf(String str) {
                    return (a) Enum.valueOf(a.class, str);
                }

                public static a[] values() {
                    return (a[]) $VALUES.clone();
                }
            }

            public Media(@Nullable Boolean bool, @Nullable String str, @Nullable a aVar, @Nullable User user) {
                this.visitorAccess = bool;
                this.duration = str;
                this.type = aVar;
                this.operationUser = user;
            }

            public static /* synthetic */ Media copy$default(Media media, Boolean bool, String str, a aVar, User user, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bool = media.visitorAccess;
                }
                if ((i10 & 2) != 0) {
                    str = media.duration;
                }
                if ((i10 & 4) != 0) {
                    aVar = media.type;
                }
                if ((i10 & 8) != 0) {
                    user = media.operationUser;
                }
                return media.copy(bool, str, aVar, user);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final Boolean getVisitorAccess() {
                return this.visitorAccess;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getDuration() {
                return this.duration;
            }

            @Nullable
            /* renamed from: component3, reason: from getter */
            public final a getType() {
                return this.type;
            }

            @Nullable
            /* renamed from: component4, reason: from getter */
            public final User getOperationUser() {
                return this.operationUser;
            }

            @NotNull
            public final Media copy(@Nullable Boolean visitorAccess, @Nullable String duration, @Nullable a type, @Nullable User operationUser) {
                return new Media(visitorAccess, duration, type, operationUser);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Media)) {
                    return false;
                }
                Media media = (Media) other;
                return Intrinsics.areEqual(this.visitorAccess, media.visitorAccess) && Intrinsics.areEqual(this.duration, media.duration) && this.type == media.type && Intrinsics.areEqual(this.operationUser, media.operationUser);
            }

            @Nullable
            public final String getDuration() {
                return this.duration;
            }

            @Nullable
            public final User getOperationUser() {
                return this.operationUser;
            }

            @Nullable
            public final a getType() {
                return this.type;
            }

            @Nullable
            public final Boolean getVisitorAccess() {
                return this.visitorAccess;
            }

            public int hashCode() {
                Boolean bool = this.visitorAccess;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                String str = this.duration;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                a aVar = this.type;
                int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                User user = this.operationUser;
                return hashCode3 + (user != null ? user.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Media(visitorAccess=" + this.visitorAccess + ", duration=" + this.duration + ", type=" + this.type + ", operationUser=" + this.operationUser + ')';
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Keep
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Mode;", "", EventKeys.VALUE_KEY, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AddSupportRepresentative", "AcceptTransfer", "AcceptForward", "ForwardSupport", "JoinSupport", "ReOpen", "EndChat", "MissedChat", "ChatMissed", "BotTransferMissed", "ChatMonitorJoin", "Transfer", "Invite", "Media", "ChatClosed", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Mode {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Mode[] $VALUES;

            @NotNull
            private final String value;
            public static final Mode AddSupportRepresentative = new Mode("AddSupportRepresentative", 0, "ADDSUPPORTREP");
            public static final Mode AcceptTransfer = new Mode("AcceptTransfer", 1, "ACCEPT_TRANSFER");
            public static final Mode AcceptForward = new Mode("AcceptForward", 2, "ACCEPT_FORWARD");
            public static final Mode ForwardSupport = new Mode("ForwardSupport", 3, "FORWARD_SUPPORT");
            public static final Mode JoinSupport = new Mode("JoinSupport", 4, "JOIN_SUPPORT");
            public static final Mode ReOpen = new Mode("ReOpen", 5, "REOPEN");
            public static final Mode EndChat = new Mode("EndChat", 6, "END_CHAT");
            public static final Mode MissedChat = new Mode("MissedChat", 7, "MISSED_CHAT");
            public static final Mode ChatMissed = new Mode("ChatMissed", 8, "CHAT_MISSED");
            public static final Mode BotTransferMissed = new Mode("BotTransferMissed", 9, "bot_transfer_missed");
            public static final Mode ChatMonitorJoin = new Mode("ChatMonitorJoin", 10, "CHATMONITOR_JOIN");
            public static final Mode Transfer = new Mode("Transfer", 11, "TRANSFER");
            public static final Mode Invite = new Mode("Invite", 12, "invite");
            public static final Mode Media = new Mode("Media", 13, "media");
            public static final Mode ChatClosed = new Mode("ChatClosed", 14, "chatclosed");

            private static final /* synthetic */ Mode[] $values() {
                return new Mode[]{AddSupportRepresentative, AcceptTransfer, AcceptForward, ForwardSupport, JoinSupport, ReOpen, EndChat, MissedChat, ChatMissed, BotTransferMissed, ChatMonitorJoin, Transfer, Invite, Media, ChatClosed};
            }

            static {
                Mode[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            private Mode(String str, int i10, String str2) {
                this.value = str2;
            }

            @NotNull
            public static EnumEntries<Mode> getEntries() {
                return $ENTRIES;
            }

            public static Mode valueOf(String str) {
                return (Mode) Enum.valueOf(Mode.class, str);
            }

            public static Mode[] values() {
                return (Mode[]) $VALUES.clone();
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/Message$InfoMessage$Operation;", "", "(Ljava/lang/String;I)V", "ScreenShareRequest", "ScreenShareJoinRequest", "CallEnd", "CallReject", "CallMissed", "CallCancel", "ConvertChat", "MonitorEnd", "MonitorJoin", "MonitorConversationJoin", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Operation {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Operation[] $VALUES;

            @Gb.c("request")
            public static final Operation ScreenShareRequest = new Operation("ScreenShareRequest", 0);

            @Gb.c("share")
            public static final Operation ScreenShareJoinRequest = new Operation("ScreenShareJoinRequest", 1);

            @Gb.c("call_end")
            public static final Operation CallEnd = new Operation("CallEnd", 2);

            @Gb.c("call_reject")
            public static final Operation CallReject = new Operation("CallReject", 3);

            @Gb.c("call_miss")
            public static final Operation CallMissed = new Operation("CallMissed", 4);

            @Gb.c("call_cancel")
            public static final Operation CallCancel = new Operation("CallCancel", 5);

            @Gb.c("convert_chat")
            public static final Operation ConvertChat = new Operation("ConvertChat", 6);

            @Gb.c("monitor_end")
            public static final Operation MonitorEnd = new Operation("MonitorEnd", 7);

            @Gb.c("monitor_join")
            public static final Operation MonitorJoin = new Operation("MonitorJoin", 8);

            @Gb.c("monitor_conversation_join")
            public static final Operation MonitorConversationJoin = new Operation("MonitorConversationJoin", 9);

            private static final /* synthetic */ Operation[] $values() {
                return new Operation[]{ScreenShareRequest, ScreenShareJoinRequest, CallEnd, CallReject, CallMissed, CallCancel, ConvertChat, MonitorEnd, MonitorJoin, MonitorConversationJoin};
            }

            static {
                Operation[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            private Operation(String str, int i10) {
            }

            @NotNull
            public static EnumEntries<Operation> getEntries() {
                return $ENTRIES;
            }

            public static Operation valueOf(String str) {
                return (Operation) Enum.valueOf(Operation.class, str);
            }

            public static Operation[] values() {
                return (Operation[]) $VALUES.clone();
            }
        }

        public InfoMessage(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable User user, @Nullable User user2, @Nullable User user3, @Nullable String str4, @Nullable String str5, @Nullable Operation operation, @Nullable Media media, @Nullable String str6, @Nullable Department department) {
            this.message = str;
            this.mode = str2;
            this.time = str3;
            this.userList = user;
            this.operationUser = user2;
            this.transferTo = user3;
            this.joinUrl = str4;
            this.startUrl = str5;
            this.operation = operation;
            this.media = media;
            this.transferMessage = str6;
            this.department = department;
        }

        public static /* synthetic */ InfoMessage copy$default(InfoMessage infoMessage, String str, String str2, String str3, User user, User user2, User user3, String str4, String str5, Operation operation, Media media, String str6, Department department, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = infoMessage.message;
            }
            if ((i10 & 2) != 0) {
                str2 = infoMessage.mode;
            }
            if ((i10 & 4) != 0) {
                str3 = infoMessage.time;
            }
            if ((i10 & 8) != 0) {
                user = infoMessage.userList;
            }
            if ((i10 & 16) != 0) {
                user2 = infoMessage.operationUser;
            }
            if ((i10 & 32) != 0) {
                user3 = infoMessage.transferTo;
            }
            if ((i10 & 64) != 0) {
                str4 = infoMessage.joinUrl;
            }
            if ((i10 & 128) != 0) {
                str5 = infoMessage.startUrl;
            }
            if ((i10 & 256) != 0) {
                operation = infoMessage.operation;
            }
            if ((i10 & 512) != 0) {
                media = infoMessage.media;
            }
            if ((i10 & 1024) != 0) {
                str6 = infoMessage.transferMessage;
            }
            if ((i10 & 2048) != 0) {
                department = infoMessage.department;
            }
            String str7 = str6;
            Department department2 = department;
            Operation operation2 = operation;
            Media media2 = media;
            String str8 = str4;
            String str9 = str5;
            User user4 = user2;
            User user5 = user3;
            return infoMessage.copy(str, str2, str3, user, user4, user5, str8, str9, operation2, media2, str7, department2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component10, reason: from getter */
        public final Media getMedia() {
            return this.media;
        }

        @Nullable
        /* renamed from: component11, reason: from getter */
        public final String getTransferMessage() {
            return this.transferMessage;
        }

        @Nullable
        /* renamed from: component12, reason: from getter */
        public final Department getDepartment() {
            return this.department;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getMode() {
            return this.mode;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getTime() {
            return this.time;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final User getUserList() {
            return this.userList;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final User getOperationUser() {
            return this.operationUser;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final User getTransferTo() {
            return this.transferTo;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final String getJoinUrl() {
            return this.joinUrl;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final String getStartUrl() {
            return this.startUrl;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final Operation getOperation() {
            return this.operation;
        }

        @NotNull
        public final InfoMessage copy(@Nullable String message, @Nullable String mode, @Nullable String time, @Nullable User userList, @Nullable User operationUser, @Nullable User transferTo, @Nullable String joinUrl, @Nullable String startUrl, @Nullable Operation operation, @Nullable Media media, @Nullable String transferMessage, @Nullable Department department) {
            return new InfoMessage(message, mode, time, userList, operationUser, transferTo, joinUrl, startUrl, operation, media, transferMessage, department);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoMessage)) {
                return false;
            }
            InfoMessage infoMessage = (InfoMessage) other;
            return Intrinsics.areEqual(this.message, infoMessage.message) && Intrinsics.areEqual(this.mode, infoMessage.mode) && Intrinsics.areEqual(this.time, infoMessage.time) && Intrinsics.areEqual(this.userList, infoMessage.userList) && Intrinsics.areEqual(this.operationUser, infoMessage.operationUser) && Intrinsics.areEqual(this.transferTo, infoMessage.transferTo) && Intrinsics.areEqual(this.joinUrl, infoMessage.joinUrl) && Intrinsics.areEqual(this.startUrl, infoMessage.startUrl) && this.operation == infoMessage.operation && Intrinsics.areEqual(this.media, infoMessage.media) && Intrinsics.areEqual(this.transferMessage, infoMessage.transferMessage) && Intrinsics.areEqual(this.department, infoMessage.department);
        }

        @Nullable
        public final Department getDepartment() {
            return this.department;
        }

        @Nullable
        public final String getJoinUrl() {
            return this.joinUrl;
        }

        @Nullable
        public final Media getMedia() {
            return this.media;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final String getMode() {
            return this.mode;
        }

        @Nullable
        public final Operation getOperation() {
            return this.operation;
        }

        @Nullable
        public final User getOperationUser() {
            return this.operationUser;
        }

        @Nullable
        public final String getStartUrl() {
            return this.startUrl;
        }

        @Nullable
        public final String getTime() {
            return this.time;
        }

        @Nullable
        public final String getTransferMessage() {
            return this.transferMessage;
        }

        @Nullable
        public final String getTransferMessageIfConfEnabled() {
            String str = this.transferMessage;
            if (str == null || !Intrinsics.areEqual(System.getProperty("use_custom_transfer_info_message", Constants.CASEFIRST_FALSE), "true")) {
                return null;
            }
            return str;
        }

        @Nullable
        public final User getTransferTo() {
            return this.transferTo;
        }

        @Nullable
        public final User getUserList() {
            return this.userList;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.mode;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.time;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            User user = this.userList;
            int hashCode4 = (hashCode3 + (user == null ? 0 : user.hashCode())) * 31;
            User user2 = this.operationUser;
            int hashCode5 = (hashCode4 + (user2 == null ? 0 : user2.hashCode())) * 31;
            User user3 = this.transferTo;
            int hashCode6 = (hashCode5 + (user3 == null ? 0 : user3.hashCode())) * 31;
            String str4 = this.joinUrl;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.startUrl;
            int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Operation operation = this.operation;
            int hashCode9 = (hashCode8 + (operation == null ? 0 : operation.hashCode())) * 31;
            Media media = this.media;
            int hashCode10 = (hashCode9 + (media == null ? 0 : media.hashCode())) * 31;
            String str6 = this.transferMessage;
            int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Department department = this.department;
            return hashCode11 + (department != null ? department.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "InfoMessage(message=" + this.message + ", mode=" + this.mode + ", time=" + this.time + ", userList=" + this.userList + ", operationUser=" + this.operationUser + ", transferTo=" + this.transferTo + ", joinUrl=" + this.joinUrl + ", startUrl=" + this.startUrl + ", operation=" + this.operation + ", media=" + this.media + ", transferMessage=" + this.transferMessage + ", department=" + this.department + ')';
        }

        public /* synthetic */ InfoMessage(String str, String str2, String str3, User user, User user2, User user3, String str4, String str5, Operation operation, Media media, String str6, Department department, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, user, user2, user3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : str5, (i10 & 256) != 0 ? null : operation, (i10 & 512) != 0 ? null : media, (i10 & 1024) != 0 ? null : str6, (i10 & 2048) != 0 ? null : department);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -262144, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -524288, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -1048576, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -2097152, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -4194304, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -8388608, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -16777216, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -33554432, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -67108864, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, infoMessage, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -134217728, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage, @Nullable Extras extras) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, infoMessage, extras, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -268435456, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage, @Nullable Extras extras, long j12) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, infoMessage, extras, j12, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -536870912, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage, @Nullable Extras extras, long j12, long j13) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, infoMessage, extras, j12, j13, 0L, null, null, null, null, null, false, false, false, false, false, null, -1073741824, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage, @Nullable Extras extras, long j12, long j13, long j14) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, infoMessage, extras, j12, j13, j14, null, null, null, null, null, false, false, false, false, false, null, Integer.MIN_VALUE, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage, @Nullable Extras extras, long j12, long j13, long j14, @Nullable Message message) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, infoMessage, extras, j12, j13, j14, message, null, null, null, null, false, false, false, false, false, null, 0, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage, @Nullable Extras extras, long j12, long j13, long j14, @Nullable Message message, @Nullable List<? extends c> list) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, infoMessage, extras, j12, j13, j14, message, list, null, null, null, false, false, false, false, false, null, 0, 1022, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage, @Nullable Extras extras, long j12, long j13, long j14, @Nullable Message message, @Nullable List<? extends c> list, @Nullable String str8) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, infoMessage, extras, j12, j13, j14, message, list, str8, null, null, false, false, false, false, false, null, 0, 1020, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage, @Nullable Extras extras, long j12, long j13, long j14, @Nullable Message message, @Nullable List<? extends c> list, @Nullable String str8, @Nullable Long l11) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, infoMessage, extras, j12, j13, j14, message, list, str8, l11, null, false, false, false, false, false, null, 0, 1016, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage, @Nullable Extras extras, long j12, long j13, long j14, @Nullable Message message, @Nullable List<? extends c> list, @Nullable String str8, @Nullable Long l11, @Nullable String str9) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, infoMessage, extras, j12, j13, j14, message, list, str8, l11, str9, false, false, false, false, false, null, 0, 1008, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage, @Nullable Extras extras, long j12, long j13, long j14, @Nullable Message message, @Nullable List<? extends c> list, @Nullable String str8, @Nullable Long l11, @Nullable String str9, boolean z11) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, infoMessage, extras, j12, j13, j14, message, list, str8, l11, str9, z11, false, false, false, false, null, 0, 992, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage, @Nullable Extras extras, long j12, long j13, long j14, @Nullable Message message, @Nullable List<? extends c> list, @Nullable String str8, @Nullable Long l11, @Nullable String str9, boolean z11, boolean z12) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, infoMessage, extras, j12, j13, j14, message, list, str8, l11, str9, z11, z12, false, false, false, null, 0, 960, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage, @Nullable Extras extras, long j12, long j13, long j14, @Nullable Message message, @Nullable List<? extends c> list, @Nullable String str8, @Nullable Long l11, @Nullable String str9, boolean z11, boolean z12, boolean z13) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, infoMessage, extras, j12, j13, j14, message, list, str8, l11, str9, z11, z12, z13, false, false, null, 0, 896, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage, @Nullable Extras extras, long j12, long j13, long j14, @Nullable Message message, @Nullable List<? extends c> list, @Nullable String str8, @Nullable Long l11, @Nullable String str9, boolean z11, boolean z12, boolean z13, boolean z14) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, infoMessage, extras, j12, j13, j14, message, list, str8, l11, str9, z11, z12, z13, z14, false, null, 0, 768, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage, @Nullable Extras extras, long j12, long j13, long j14, @Nullable Message message, @Nullable List<? extends c> list, @Nullable String str8, @Nullable Long l11, @Nullable String str9, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this(str, str2, chatId, messageType, status, id2, uniqueID, num, str3, str4, j10, j11, str5, str6, bVar, l10, str7, attachment, meta, respondedMessage, z10, bool, bool2, bool3, bool4, dVar, infoMessage, extras, j12, j13, j14, message, list, str8, l11, str9, z11, z12, z13, z14, z15, null, 0, 512, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull String id2) {
        this(str, str2, chatId, messageType, null, id2, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -48, 1023, null);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public Message(@Nullable String str, @Nullable String str2, @NotNull String chatId, @NotNull g messageType, @NotNull f status, @NotNull String id2, @NotNull String uniqueID, @Nullable Integer num, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable String str5, @Nullable String str6, @Nullable b bVar, @Nullable Long l10, @Nullable String str7, @Nullable Attachment attachment, @Nullable Meta meta, @Nullable RespondedMessage respondedMessage, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable d dVar, @Nullable InfoMessage infoMessage, @Nullable Extras extras, long j12, long j13, long j14, @Nullable Message message, @Nullable List<? extends c> list, @Nullable String str8, @Nullable Long l11, @Nullable String str9, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @Nullable String str10) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
        this.acknowledgementKey = str;
        this.conversationId = str2;
        this.chatId = chatId;
        this.messageType = messageType;
        this.status = status;
        this.id = id2;
        this.uniqueID = uniqueID;
        this.messageStringResourceId = num;
        this.content = str3;
        this.comment = str4;
        this.serverTime = j10;
        this.clientTime = j11;
        this.sender = str5;
        this.senderName = str6;
        this.displayName = bVar;
        this.sequenceId = l10;
        this.rChatId = str7;
        this.attachment = attachment;
        this.meta = meta;
        this.respondedMessage = respondedMessage;
        this.isBot = z10;
        this.isRead = bool;
        this.isTyping = bool2;
        this.isEdited = bool3;
        this.isDeleted = bool4;
        this.mode = dVar;
        this.infoMessage = infoMessage;
        this.extras = extras;
        this.editedTime = j12;
        this.deletedTime = j13;
        this.previousMessageTime = j14;
        this.replyTo = message;
        this.markdowns = list;
        this.rawContent = str8;
        this.consecutiveDeletedCount = l11;
        this.timeDifferenceContent = str9;
        this.isFirstMessage = z11;
        this.isLastMessage = z12;
        this.isRightAligned = z13;
        this.canShowSenderAvatar = z14;
        this.canShowSenderName = z15;
        this.formattedClientTime = str10;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Message(java.lang.String r52, java.lang.String r53, java.lang.String r54, com.zoho.livechat.android.modules.messages.domain.entities.Message.g r55, com.zoho.livechat.android.modules.messages.domain.entities.Message.f r56, java.lang.String r57, java.lang.String r58, java.lang.Integer r59, java.lang.String r60, java.lang.String r61, long r62, long r64, java.lang.String r66, java.lang.String r67, com.zoho.livechat.android.modules.messages.domain.entities.Message.b r68, java.lang.Long r69, java.lang.String r70, com.zoho.livechat.android.modules.messages.domain.entities.Message.Attachment r71, com.zoho.livechat.android.modules.messages.domain.entities.Message.Meta r72, com.zoho.livechat.android.modules.messages.domain.entities.Message.RespondedMessage r73, boolean r74, java.lang.Boolean r75, java.lang.Boolean r76, java.lang.Boolean r77, java.lang.Boolean r78, com.zoho.livechat.android.modules.messages.domain.entities.Message.d r79, com.zoho.livechat.android.modules.messages.domain.entities.Message.InfoMessage r80, com.zoho.livechat.android.modules.messages.domain.entities.Message.Extras r81, long r82, long r84, long r86, com.zoho.livechat.android.modules.messages.domain.entities.Message r88, java.util.List r89, java.lang.String r90, java.lang.Long r91, java.lang.String r92, boolean r93, boolean r94, boolean r95, boolean r96, boolean r97, java.lang.String r98, int r99, int r100, kotlin.jvm.internal.DefaultConstructorMarker r101) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zoho.livechat.android.modules.messages.domain.entities.Message.<init>(java.lang.String, java.lang.String, java.lang.String, com.zoho.livechat.android.modules.messages.domain.entities.Message$g, com.zoho.livechat.android.modules.messages.domain.entities.Message$f, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, com.zoho.livechat.android.modules.messages.domain.entities.Message$b, java.lang.Long, java.lang.String, com.zoho.livechat.android.modules.messages.domain.entities.Message$Attachment, com.zoho.livechat.android.modules.messages.domain.entities.Message$Meta, com.zoho.livechat.android.modules.messages.domain.entities.Message$RespondedMessage, boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, com.zoho.livechat.android.modules.messages.domain.entities.Message$d, com.zoho.livechat.android.modules.messages.domain.entities.Message$InfoMessage, com.zoho.livechat.android.modules.messages.domain.entities.Message$Extras, long, long, long, com.zoho.livechat.android.modules.messages.domain.entities.Message, java.util.List, java.lang.String, java.lang.Long, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
