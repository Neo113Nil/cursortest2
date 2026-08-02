package vf;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.y;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import og.AbstractC5896h;
import og.i;
import og.j;
import og.m;

/* loaded from: classes4.dex */
public abstract class c {
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01bd, code lost:
    
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r7, (java.lang.CharSequence) "image", false, 2, (java.lang.Object) null) == true) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x02bb, code lost:
    
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) com.zoho.livechat.android.modules.messages.domain.entities.Message.g.Audio.getStringValue(), false, 2, r8) == r7) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MessageEntity a(String str, String str2, SalesIQChat salesIQChat, Message.g gVar, String str3, String str4, String str5, Object obj, String str6, String str7, String str8, Boolean bool, String str9, Object obj2, String str10, Hashtable hashtable) {
        SalesIQChat salesIQChat2;
        String str11;
        String stringValue;
        long j10;
        String str12;
        List list;
        String str13;
        String str14;
        Object valueOf;
        Object obj3;
        Object obj4;
        Object obj5;
        String u10;
        String str15;
        List list2;
        Unit unit;
        List list3;
        k kVar;
        String str16;
        String str17;
        String str18;
        List list4;
        String str19;
        List list5;
        k kVar2;
        long j11;
        String str20;
        String str21;
        String str22;
        long j12;
        long j13;
        String str23;
        String str24;
        String str25;
        Message.g gVar2;
        String str26;
        String str27;
        File file;
        String str28;
        boolean z10;
        Object obj6;
        int i10;
        String str29;
        String str30;
        Object m147constructorimpl;
        Throwable m150exceptionOrNullimpl;
        long longValue;
        Long longOrNull;
        String f10;
        int i11;
        Object obj7;
        String f11;
        String f12;
        h r10;
        String str31 = null;
        if (salesIQChat == null) {
            String chatid = str2 == null ? LiveChatUtil.getChatid(str) : str2;
            salesIQChat2 = chatid != null ? LiveChatUtil.getChat(chatid) : null;
        } else {
            salesIQChat2 = salesIQChat;
        }
        Map map = obj2 instanceof Map ? (Map) obj2 : null;
        if (str3 == null) {
            str11 = null;
        } else if (!StringsKt.startsWith$default(str3, "LD", false, 2, (Object) null) || (str11 = (String) CollectionsKt.lastOrNull(StringsKt.split$default((CharSequence) str3, new String[]{"_"}, false, 0, 6, (Object) null))) == null) {
            str11 = str3;
        }
        Hashtable hashtable2 = hashtable == null ? null : hashtable;
        if (gVar == null || (stringValue = gVar.getStringValue()) == null) {
            stringValue = Message.g.Text.getStringValue();
        }
        if (map != null) {
            if (map.containsKey("resource_type")) {
                stringValue = String.valueOf(map.get("resource_type"));
            } else if (Intrinsics.areEqual(map.get("is_question"), Boolean.TRUE)) {
                stringValue = Message.g.Question.getStringValue();
            } else {
                Object obj8 = map.get("card_data");
                Map map2 = obj8 instanceof Map ? (Map) obj8 : null;
                String valueOf2 = String.valueOf(map2 != null ? map2.get("type") : null);
                Message.g gVar3 = Message.g.Location;
                if (Intrinsics.areEqual(valueOf2, gVar3.getStringValue())) {
                    stringValue = gVar3.getStringValue();
                } else {
                    String b10 = b(map);
                    if (b10 != null) {
                        stringValue = b10;
                    }
                }
            }
            Unit unit2 = Unit.INSTANCE;
        }
        if (obj != null) {
            if (obj instanceof String) {
                Gson j14 = Yd.a.j();
                k kVar3 = new k();
                String str32 = (String) obj;
                list2 = m.c(str32);
                Unit unit3 = Unit.INSTANCE;
                kVar3.p("text", str32);
                str15 = j14.u(kVar3);
                str12 = null;
                j10 = -1;
            } else {
                h B10 = Yd.a.j().B(obj);
                if (B10 != null) {
                    Intrinsics.checkNotNull(B10);
                    str15 = obj.toString();
                    k d10 = AbstractC5896h.d(B10);
                    if (d10 == null || (r10 = d10.r("mode")) == null) {
                        unit = null;
                    } else {
                        Intrinsics.checkNotNull(r10);
                        Gson j15 = Yd.a.j();
                        k d11 = AbstractC5896h.d(B10);
                        Intrinsics.checkNotNull(d11);
                        str15 = j15.u(d(d11));
                        unit = Unit.INSTANCE;
                    }
                    String str33 = "info";
                    if (unit == null) {
                        Gson j16 = Yd.a.j();
                        k d12 = AbstractC5896h.d(B10);
                        if (d12 != null) {
                            j10 = -1;
                            h r11 = d12.r("fName");
                            if (r11 != null && (f12 = AbstractC5896h.f(r11)) != null) {
                                d12.p("name", f12);
                                Unit unit4 = Unit.INSTANCE;
                            }
                            h r12 = d12.r("blurimg");
                            if (r12 != null && (f11 = AbstractC5896h.f(r12)) != null) {
                                String a10 = m.a(f11);
                                if (a10 != null) {
                                    f11 = a10;
                                }
                                d12.p("blur_image", f11);
                                Unit unit5 = Unit.INSTANCE;
                            }
                            h r13 = d12.r("dim");
                            if (r13 != null) {
                                Intrinsics.checkNotNull(r13);
                                k d13 = AbstractC5896h.d(r13);
                                if (d13 != null) {
                                    d12.m("dimensions", d13);
                                    Unit unit6 = Unit.INSTANCE;
                                }
                            }
                            h r14 = d12.r("content");
                            if (r14 == null) {
                                r14 = d12.r("extn");
                            }
                            if (r14 == null || (f10 = AbstractC5896h.f(r14)) == null) {
                                str16 = str15;
                                str17 = "/";
                            } else {
                                d12.p("type", f10);
                                String str34 = (String) CollectionsKt.firstOrNull(StringsKt.split$default((CharSequence) f10, new String[]{"/"}, false, 0, 6, (Object) null));
                                if (str34 != null) {
                                    str16 = str15;
                                    str17 = "/";
                                    i11 = 2;
                                    obj7 = null;
                                } else {
                                    str16 = str15;
                                    str17 = "/";
                                    i11 = 2;
                                    obj7 = null;
                                }
                                if ((str34 == null || !StringsKt.contains$default((CharSequence) str34, (CharSequence) "audio", false, i11, obj7)) && (str34 == null || !StringsKt.contains$default((CharSequence) str34, (CharSequence) "video", false, i11, obj7))) {
                                    str33 = Message.g.File.getStringValue();
                                    Unit unit7 = Unit.INSTANCE;
                                }
                                str33 = str34;
                                Unit unit72 = Unit.INSTANCE;
                            }
                            h r15 = d12.r("comment");
                            if (r15 != null) {
                                Intrinsics.checkNotNull(r15);
                                Gson j17 = Yd.a.j();
                                k kVar4 = new k();
                                String f13 = AbstractC5896h.f(r15);
                                List c10 = m.c(f13);
                                Unit unit8 = Unit.INSTANCE;
                                kVar4.p("comment", f13);
                                str18 = j17.u(kVar4);
                                list4 = c10;
                            } else {
                                str18 = str16;
                                list4 = null;
                            }
                            h r16 = d12.r("type");
                            String f14 = r16 != null ? AbstractC5896h.f(r16) : null;
                            h r17 = d12.r("name");
                            String f15 = r17 != null ? AbstractC5896h.f(r17) : null;
                            long j18 = 0;
                            if (((i.e(f14) && i.e(f15)) ? d12 : null) != null) {
                                Intrinsics.checkNotNull(f14);
                                String str35 = (String) CollectionsKt.firstOrNull(StringsKt.split$default((CharSequence) f14, new String[]{str17}, false, 0, 6, (Object) null));
                                Me.a aVar = Me.a.f7650a;
                                Intrinsics.checkNotNull(f15);
                                h r18 = d12.r("msgid");
                                if (r18 == null || (str27 = AbstractC5896h.f(r18)) == null) {
                                    str27 = str8;
                                }
                                String a11 = aVar.a(f15, String.valueOf(str27));
                                File fileFromDisk = y.INSTANCE.getFileFromDisk(a11);
                                String absolutePath = fileFromDisk.getAbsolutePath();
                                long length = fileFromDisk.length();
                                if (str35 != null) {
                                    file = fileFromDisk;
                                    str19 = str18;
                                    str28 = a11;
                                    obj6 = null;
                                    z10 = true;
                                    if (StringsKt.contains$default((CharSequence) str35, (CharSequence) Message.g.Image.getStringValue(), false, 2, (Object) null)) {
                                        list5 = list4;
                                        i10 = 2;
                                        if ((!(str35 == null && StringsKt.contains$default((CharSequence) str35, (CharSequence) Message.g.Video.getStringValue(), false, i10, obj6) == z10) && (str35 == null || StringsKt.contains$default((CharSequence) str35, (CharSequence) Message.g.Audio.getStringValue(), false, i10, obj6) != z10)) || length <= 0) {
                                            kVar2 = d12;
                                            j11 = -1;
                                            str35 = str35;
                                        } else {
                                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                            try {
                                                Result.Companion companion = Result.INSTANCE;
                                                mediaMetadataRetriever.setDataSource(MobilistenInitProvider.INSTANCE.e(), Uri.fromFile(file));
                                                str30 = mediaMetadataRetriever.extractMetadata(9);
                                                try {
                                                    m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    Result.Companion companion2 = Result.INSTANCE;
                                                    m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                                    m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                                    if (m150exceptionOrNullimpl != null) {
                                                    }
                                                    if (str30 != null) {
                                                    }
                                                    if (longValue == -1) {
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                str30 = null;
                                            }
                                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                            if (m150exceptionOrNullimpl != null) {
                                                str33 = Message.g.File.getStringValue();
                                                LiveChatUtil.log(m150exceptionOrNullimpl);
                                            }
                                            longValue = (str30 != null || (longOrNull = StringsKt.toLongOrNull(str30)) == null) ? -1L : longOrNull.longValue();
                                            if (longValue == -1) {
                                                kVar2 = d12;
                                                long j19 = longValue / 1000;
                                                j11 = longValue;
                                                long j20 = 60;
                                                long j21 = j19 / j20;
                                                long j22 = j19 % j20;
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(j21 < 10 ? "0" : "");
                                                sb2.append(j21);
                                                String sb3 = sb2.toString();
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append(j22 < 10 ? "0" : "");
                                                sb4.append(j22);
                                                str29 = sb3 + ':' + sb4.toString();
                                                str35 = str35;
                                                gVar2 = str35 == null ? Message.g.Companion.a(str35) : null;
                                                if (gVar2 != null) {
                                                    f15 = str28;
                                                    str20 = str29;
                                                    str21 = absolutePath;
                                                    j18 = length;
                                                } else {
                                                    str23 = str28;
                                                    str24 = absolutePath;
                                                    str25 = str33;
                                                    j13 = length;
                                                    j12 = j11;
                                                    str22 = str29;
                                                    gVar2.getStringValue();
                                                    if (((str24 != null && str23 == null && str22 == null) ? null : kVar2) == null) {
                                                        str26 = Yd.a.j().v(new Message.Extras(str24, str23, j13, j12, str22, null, null, null, false, 480, null));
                                                        Unit unit9 = Unit.INSTANCE;
                                                    } else {
                                                        str26 = null;
                                                    }
                                                    str15 = str19;
                                                    kVar = kVar2;
                                                    str33 = str25;
                                                    str12 = str26;
                                                    list3 = list5;
                                                }
                                            } else {
                                                j11 = longValue;
                                                kVar2 = d12;
                                            }
                                        }
                                        str29 = null;
                                        if (str35 == null) {
                                        }
                                        if (gVar2 != null) {
                                        }
                                    }
                                } else {
                                    file = fileFromDisk;
                                    str19 = str18;
                                    str28 = a11;
                                    z10 = true;
                                    obj6 = null;
                                }
                                if (str35 != null) {
                                    list5 = list4;
                                    i10 = 2;
                                } else {
                                    list5 = list4;
                                    i10 = 2;
                                }
                                if (str35 == null || StringsKt.contains$default((CharSequence) str35, (CharSequence) Message.g.Video.getStringValue(), false, i10, obj6) != z10) {
                                    kVar2 = d12;
                                    str35 = Message.g.File.getStringValue();
                                    j11 = -1;
                                    str29 = null;
                                    if (str35 == null) {
                                    }
                                    if (gVar2 != null) {
                                    }
                                }
                                if (str35 == null) {
                                }
                                kVar2 = d12;
                                j11 = -1;
                                str35 = str35;
                                str29 = null;
                                if (str35 == null) {
                                }
                                if (gVar2 != null) {
                                }
                            } else {
                                str19 = str18;
                                list5 = list4;
                                kVar2 = d12;
                                j11 = -1;
                                str20 = null;
                                str21 = null;
                            }
                            str23 = f15;
                            gVar2 = Message.g.Companion.a(str33);
                            str24 = str21;
                            j12 = j11;
                            str22 = str20;
                            str25 = str33;
                            j13 = j18;
                            gVar2.getStringValue();
                            if (((str24 != null && str23 == null && str22 == null) ? null : kVar2) == null) {
                            }
                            str15 = str19;
                            kVar = kVar2;
                            str33 = str25;
                            str12 = str26;
                            list3 = list5;
                        } else {
                            j10 = -1;
                            str12 = null;
                            list3 = null;
                            kVar = null;
                        }
                        String u11 = j16.u(kVar);
                        Unit unit10 = Unit.INSTANCE;
                        list2 = list3;
                        str31 = u11;
                    } else {
                        j10 = -1;
                        str12 = null;
                        str31 = null;
                        list2 = null;
                    }
                    stringValue = str33;
                    Unit unit11 = Unit.INSTANCE;
                } else {
                    j10 = -1;
                    str15 = null;
                    str12 = null;
                    str31 = null;
                    list2 = null;
                }
            }
            str13 = str15;
            str14 = str31;
            list = list2;
        } else {
            j10 = -1;
            str12 = null;
            list = null;
            str13 = null;
            str14 = null;
        }
        String str36 = stringValue;
        long s10 = i.s(str8);
        boolean parseBoolean = Boolean.parseBoolean(String.valueOf(hashtable2 != null ? hashtable2.get("isedited") : null));
        boolean parseBoolean2 = Boolean.parseBoolean(String.valueOf(hashtable2 != null ? hashtable2.get("isdeleted") : null));
        String valueOf3 = String.valueOf(salesIQChat2 != null ? salesIQChat2.getConvID() : null);
        String valueOf4 = String.valueOf(str2 == null ? salesIQChat2 != null ? salesIQChat2.getVisitorid() : null : str2);
        String valueOf5 = String.valueOf(str2 == null ? salesIQChat2 != null ? salesIQChat2.getChid() : null : str2);
        String rchatid = salesIQChat2 != null ? salesIQChat2.getRchatid() : null;
        int ordinal = Message.f.Companion.a("sent").ordinal();
        String obj9 = (str6 == null ? Long.valueOf(s10) : str6).toString();
        if (str7 == null || (valueOf = StringsKt.replace$default(str7, "%", "_", false, 4, (Object) null)) == null) {
            valueOf = Long.valueOf(s10);
        }
        String obj10 = valueOf.toString();
        String u12 = str13 != null ? i.u(str13) : null;
        String v10 = list != null ? Yd.a.j().v(list) : null;
        String v11 = (str4 == null || (u10 = i.u(str4)) == null) ? null : Yd.a.j().v(new Message.b(u10, m.b(u10)));
        String u13 = Yd.a.j().u(Yd.a.j().B(map));
        boolean isBotSender = str11 != null ? LiveChatUtil.isBotSender(str11) : false;
        String u14 = str12 == null ? hashtable2 != null ? Yd.a.j().u(Yd.a.j().B(hashtable2)) : null : str12;
        if (hashtable2 == null || (obj3 = hashtable2.get("lmsgtime")) == null) {
            obj3 = hashtable2 != null ? hashtable2.get("lt") : null;
        }
        MessageEntity.Time time = new MessageEntity.Time(s10, s10, i.q(String.valueOf(obj3), j10), 0L, 0L, j.c(s10, null, null, 3, null), 24, null);
        if (parseBoolean) {
            time = MessageEntity.Time.copy$default(time, 0L, 0L, 0L, i.q((hashtable2 == null || (obj5 = hashtable2.get("time")) == null) ? null : obj5.toString(), -1L), 0L, null, 55, null);
        } else if (parseBoolean2) {
            time = MessageEntity.Time.copy$default(time, 0L, 0L, 0L, 0L, i.q((hashtable2 == null || (obj4 = hashtable2.get("time")) == null) ? null : obj4.toString(), -1L), null, 47, null);
        }
        MessageEntity.Time time2 = time;
        Gson j23 = Yd.a.j();
        Object obj11 = hashtable2 != null ? hashtable2.get("reply_to") : null;
        Hashtable hashtable3 = obj11 instanceof Hashtable ? (Hashtable) obj11 : null;
        return new MessageEntity(valueOf3, valueOf4, valueOf5, rchatid, null, str36, Integer.valueOf(ordinal), obj9, obj10, str13, u12, v10, str11, v11, str14, u13, null, isBotSender, null, null, Boolean.valueOf(parseBoolean), Boolean.valueOf(parseBoolean2), j23.v(hashtable3 != null ? f(hashtable3, str, str2, null, salesIQChat) : null), null, Intrinsics.areEqual(str11, LiveChatUtil.getAnnonID()), u14, time2, 8912896, null);
    }

    public static final String b(Map map) {
        Object obj;
        Map hashMap = map.get("input_card") != null ? (Map) map.get("input_card") : map.get("display_card") != null ? (Map) map.get("display_card") : new HashMap();
        if (Intrinsics.areEqual(hashMap != null ? hashMap.get("type") : null, Message.g.Video.getStringValue())) {
            return Message.g.WidgetVideo.getStringValue();
        }
        if (Intrinsics.areEqual(hashMap != null ? hashMap.get("type") : null, Message.g.Location.getStringValue())) {
            return Message.g.WidgetLocation.getStringValue();
        }
        if (Intrinsics.areEqual(hashMap != null ? hashMap.get("type") : null, Message.g.File.getStringValue())) {
            return Message.g.WidgetFileUpload.getStringValue();
        }
        if (hashMap == null || (obj = hashMap.get("type")) == null) {
            return null;
        }
        return obj.toString();
    }

    public static final long c(Map map) {
        Object obj = map.get("origin_time");
        if (obj == null) {
            Object obj2 = map.get("time");
            if (obj2 == null && (obj2 = map.get("t")) == null) {
                Object obj3 = map.get(EventKeys.DATA);
                Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                obj = map2 != null ? map2.get("time") : null;
            } else {
                obj = obj2;
            }
        }
        return i.q(String.valueOf(obj), -1L);
    }

    public static final k d(k kVar) {
        h r10 = kVar.r("opruser");
        if (r10 != null) {
            k d10 = AbstractC5896h.d(r10);
            kVar.m("operation_user", d10 != null ? j(d10) : null);
            kVar.v("opruser");
        }
        h r11 = kVar.r("transferdetails");
        if (r11 != null) {
            k d11 = AbstractC5896h.d(r11);
            kVar.m("transfer_to", d11 != null ? j(d11) : null);
            kVar.v("transferdetails");
        }
        h r12 = kVar.r("userlist");
        if (r12 != null) {
            k d12 = AbstractC5896h.d(r12);
            kVar.m("user_list", d12 != null ? j(d12) : null);
            kVar.v("userlist");
        }
        return kVar;
    }

    public static final MessageEntity e(Hashtable hashtable, String str) {
        Intrinsics.checkNotNullParameter(hashtable, "<this>");
        return h(hashtable, str, null, null, null, 14, null);
    }

    public static final MessageEntity f(Hashtable hashtable, String str, String str2, String str3, SalesIQChat salesIQChat) {
        Intrinsics.checkNotNullParameter(hashtable, "<this>");
        return g(MapsKt.toMap(hashtable), str, str2, str3, salesIQChat);
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x026e, code lost:
    
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r4, (java.lang.CharSequence) "image", false, 2, (java.lang.Object) null) == true) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0283, code lost:
    
        if (kotlin.text.StringsKt.contains$default(r4, "audio", r11, 2, r15) == r5) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0376, code lost:
    
        if (kotlin.text.StringsKt.contains$default(r2, com.zoho.livechat.android.modules.messages.domain.entities.Message.g.Audio.getStringValue(), r4, 2, r5) == r0) goto L200;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x045f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MessageEntity g(Map map, String str, String str2, String str3, SalesIQChat salesIQChat) {
        SalesIQChat salesIQChat2;
        String str4;
        SalesIQChat salesIQChat3;
        String str5;
        Map map2;
        long j10;
        String str6;
        List list;
        String str7;
        String str8;
        String str9;
        String str10;
        Object valueOf;
        boolean z10;
        String str11;
        String str12;
        MessageEntity.Time time;
        MessageEntity.Time copy$default;
        String u10;
        String str13;
        List list2;
        Unit unit;
        String str14;
        k kVar;
        List list3;
        String str15;
        String str16;
        String str17;
        String str18;
        k kVar2;
        long j11;
        String str19;
        String str20;
        long j12;
        String str21;
        String str22;
        String str23;
        Message.g gVar;
        String str24;
        Object valueOf2;
        File file;
        String str25;
        boolean z11;
        boolean z12;
        Object obj;
        int i10;
        String str26;
        String str27;
        Object m147constructorimpl;
        Throwable m150exceptionOrNullimpl;
        long longValue;
        String str28;
        String str29;
        Long longOrNull;
        String f10;
        boolean z13;
        boolean z14;
        Object obj2;
        String f11;
        String f12;
        h r10;
        String str30;
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (salesIQChat == null) {
            String chatid = str2 == null ? LiveChatUtil.getChatid(str) : str2;
            salesIQChat2 = chatid != null ? LiveChatUtil.getChat(chatid) : null;
        } else {
            salesIQChat2 = salesIQChat;
        }
        Object obj3 = map.get("msglist");
        ArrayList arrayList = obj3 instanceof ArrayList ? (ArrayList) obj3 : null;
        Object obj4 = arrayList != null ? arrayList.get(0) : null;
        if (obj4 == null) {
            obj4 = map;
        }
        Map map3 = obj4 instanceof Map ? (Map) obj4 : null;
        if (map3 == null) {
            map3 = new HashMap();
        }
        Map map4 = map3;
        Object obj5 = map.get("message_type");
        if (obj5 == null) {
            obj5 = map.get("type");
        }
        String obj6 = obj5 != null ? obj5.toString() : null;
        String stringValue = (obj6 == null || !TextUtils.isDigitsOnly(obj6)) ? obj6 : Message.g.Text.getStringValue();
        if (stringValue == null) {
            stringValue = Message.g.Text.getStringValue();
        }
        Object obj7 = map.get("dname");
        String obj8 = obj7 != null ? obj7.toString() : null;
        Object obj9 = map.get("meta");
        Map map5 = obj9 instanceof Map ? (Map) obj9 : null;
        Object obj10 = map.get("sender");
        if (obj10 == null) {
            obj10 = map.get("user_id");
        }
        if (obj10 == null || (str4 = obj10.toString()) == null) {
            str4 = null;
        } else if (StringsKt.startsWith$default(str4, "LD", false, 2, (Object) null) && (str30 = (String) CollectionsKt.lastOrNull(StringsKt.split$default((CharSequence) str4, new String[]{"_"}, false, 0, 6, (Object) null))) != null) {
            str4 = str30;
        }
        if (map5 != null) {
            if (map5.containsKey("resource_type")) {
                stringValue = String.valueOf(map5.get("resource_type"));
            } else if (Intrinsics.areEqual(map5.get("is_question"), Boolean.TRUE)) {
                stringValue = Message.g.Question.getStringValue();
            } else {
                Object obj11 = map5.get("card_data");
                Map map6 = obj11 instanceof Map ? (Map) obj11 : null;
                String valueOf3 = String.valueOf(map6 != null ? map6.get("type") : null);
                Message.g gVar2 = Message.g.Location;
                if (Intrinsics.areEqual(valueOf3, gVar2.getStringValue())) {
                    stringValue = gVar2.getStringValue();
                } else {
                    String b10 = b(map5);
                    if (b10 != null) {
                        stringValue = b10;
                    }
                }
            }
            Unit unit2 = Unit.INSTANCE;
        }
        Object obj12 = map.get("msg");
        if (obj12 == null && (obj12 = map.get("text")) == null && (obj12 = map.get("om")) == null) {
            obj12 = map.get("rmsg");
        }
        String str31 = str4;
        if (obj12 != null) {
            j10 = -1;
            if (obj12 instanceof String) {
                Object obj13 = map.get("module");
                if (!StringsKt.equals("MEDIA", obj13 != null ? obj13.toString() : null, true)) {
                    Gson j13 = Yd.a.j();
                    k kVar3 = new k();
                    String str32 = (String) obj12;
                    list2 = m.c(str32);
                    Unit unit3 = Unit.INSTANCE;
                    kVar3.p("text", str32);
                    str13 = j13.u(kVar3);
                    salesIQChat3 = salesIQChat2;
                    str5 = obj8;
                    map2 = map5;
                    str6 = null;
                    str14 = null;
                    str7 = str13;
                    str8 = str14;
                    list = list2;
                }
            }
            h B10 = Yd.a.j().B(obj12);
            if (B10 != null) {
                Intrinsics.checkNotNull(B10);
                String obj14 = obj12.toString();
                k d10 = AbstractC5896h.d(B10);
                if (d10 == null || (r10 = d10.r("mode")) == null) {
                    unit = null;
                } else {
                    Intrinsics.checkNotNull(r10);
                    Gson j14 = Yd.a.j();
                    k d11 = AbstractC5896h.d(B10);
                    Intrinsics.checkNotNull(d11);
                    obj14 = j14.u(d(d11));
                    unit = Unit.INSTANCE;
                }
                String str33 = "info";
                if (unit == null) {
                    Gson j15 = Yd.a.j();
                    k d12 = AbstractC5896h.d(B10);
                    if (d12 != null) {
                        h r11 = d12.r("fName");
                        if (r11 != null && (f12 = AbstractC5896h.f(r11)) != null) {
                            d12.p("name", f12);
                            Unit unit4 = Unit.INSTANCE;
                        }
                        h r12 = d12.r("blurimg");
                        if (r12 == null || (f11 = AbstractC5896h.f(r12)) == null) {
                            str15 = obj14;
                        } else {
                            String a10 = m.a(f11);
                            if (a10 != null) {
                                f11 = a10;
                            }
                            str15 = obj14;
                            d12.p("blur_image", f11);
                            Unit unit5 = Unit.INSTANCE;
                        }
                        h r13 = d12.r("dim");
                        if (r13 != null) {
                            Intrinsics.checkNotNull(r13);
                            k d13 = AbstractC5896h.d(r13);
                            if (d13 != null) {
                                d12.m("dimensions", d13);
                                Unit unit6 = Unit.INSTANCE;
                            }
                        }
                        h r14 = d12.r("content");
                        if (r14 == null) {
                            r14 = d12.r("extn");
                        }
                        if (r14 == null || (f10 = AbstractC5896h.f(r14)) == null) {
                            salesIQChat3 = salesIQChat2;
                            str5 = obj8;
                            str16 = "/";
                        } else {
                            d12.p("type", f10);
                            String str34 = (String) CollectionsKt.firstOrNull(StringsKt.split$default((CharSequence) f10, new String[]{"/"}, false, 0, 6, (Object) null));
                            if (str34 != null) {
                                salesIQChat3 = salesIQChat2;
                                str5 = obj8;
                                str16 = "/";
                                z14 = false;
                                obj2 = null;
                                z13 = true;
                            } else {
                                salesIQChat3 = salesIQChat2;
                                str5 = obj8;
                                str16 = "/";
                                z13 = true;
                                z14 = false;
                                obj2 = null;
                            }
                            int i11 = str34 != null ? 2 : 2;
                            if (str34 == null || StringsKt.contains$default(str34, "video", z14, i11, obj2) != z13) {
                                str33 = Message.g.File.getStringValue();
                                Unit unit7 = Unit.INSTANCE;
                            }
                            str33 = str34;
                            Unit unit72 = Unit.INSTANCE;
                        }
                        h r15 = d12.r("comment");
                        if (r15 != null) {
                            Intrinsics.checkNotNull(r15);
                            Gson j16 = Yd.a.j();
                            k kVar4 = new k();
                            String f13 = AbstractC5896h.f(r15);
                            list3 = m.c(f13);
                            Unit unit8 = Unit.INSTANCE;
                            kVar4.p("comment", f13);
                            str17 = j16.u(kVar4);
                        } else {
                            str17 = str15;
                            list3 = null;
                        }
                        h r16 = d12.r("type");
                        String f14 = r16 != null ? AbstractC5896h.f(r16) : null;
                        h r17 = d12.r("name");
                        String f15 = r17 != null ? AbstractC5896h.f(r17) : null;
                        if (((i.e(f14) && i.e(f15)) ? d12 : null) != null) {
                            Intrinsics.checkNotNull(f14);
                            String str35 = (String) CollectionsKt.firstOrNull(StringsKt.split$default((CharSequence) f14, new String[]{str16}, false, 0, 6, (Object) null));
                            Me.a aVar = Me.a.f7650a;
                            Intrinsics.checkNotNull(f15);
                            h r18 = d12.r("msgid");
                            if (r18 == null || (valueOf2 = AbstractC5896h.f(r18)) == null) {
                                valueOf2 = Long.valueOf(c(map));
                            }
                            String a11 = aVar.a(f15, valueOf2.toString());
                            File fileFromDisk = y.INSTANCE.getFileFromDisk(a11);
                            str20 = fileFromDisk.getAbsolutePath();
                            j11 = fileFromDisk.length();
                            if (str35 != null) {
                                file = fileFromDisk;
                                str18 = str17;
                                str25 = a11;
                                z12 = false;
                                obj = null;
                                z11 = true;
                                if (StringsKt.contains$default((CharSequence) str35, (CharSequence) Message.g.Image.getStringValue(), false, 2, (Object) null)) {
                                    kVar2 = d12;
                                    i10 = 2;
                                    if ((!(str35 == null && StringsKt.contains$default(str35, Message.g.Video.getStringValue(), z12, i10, obj) == z11) && (str35 == null || StringsKt.contains$default(str35, Message.g.Audio.getStringValue(), z12, i10, obj) != z11)) || j11 <= 0) {
                                        map2 = map5;
                                        j12 = -1;
                                        str35 = str35;
                                    } else {
                                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                        try {
                                            Result.Companion companion = Result.INSTANCE;
                                            mediaMetadataRetriever.setDataSource(MobilistenInitProvider.INSTANCE.e(), Uri.fromFile(file));
                                            str27 = mediaMetadataRetriever.extractMetadata(9);
                                            try {
                                                m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                Result.Companion companion2 = Result.INSTANCE;
                                                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                                if (m150exceptionOrNullimpl != null) {
                                                }
                                                if (str27 != null) {
                                                }
                                                if (longValue == -1) {
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            str27 = null;
                                        }
                                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                        if (m150exceptionOrNullimpl != null) {
                                            str33 = Message.g.File.getStringValue();
                                            LiveChatUtil.log(m150exceptionOrNullimpl);
                                        }
                                        longValue = (str27 != null || (longOrNull = StringsKt.toLongOrNull(str27)) == null) ? -1L : longOrNull.longValue();
                                        if (longValue == -1) {
                                            j12 = longValue;
                                            long j17 = j12 / 1000;
                                            long j18 = 60;
                                            map2 = map5;
                                            long j19 = j17 / j18;
                                            long j20 = j17 % j18;
                                            StringBuilder sb2 = new StringBuilder();
                                            if (j19 < 10) {
                                                str28 = str35;
                                                str29 = "0";
                                            } else {
                                                str28 = str35;
                                                str29 = "";
                                            }
                                            sb2.append(str29);
                                            sb2.append(j19);
                                            String sb3 = sb2.toString();
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(j20 < 10 ? "0" : "");
                                            sb4.append(j20);
                                            str26 = sb3 + ':' + sb4.toString();
                                            str35 = str28;
                                            gVar = str35 == null ? Message.g.Companion.a(str35) : null;
                                            if (gVar != null) {
                                                str19 = str26;
                                                f15 = str25;
                                            } else {
                                                str21 = str26;
                                                str23 = str20;
                                                str22 = str25;
                                                long j21 = j12;
                                                long j22 = j11;
                                                gVar.getStringValue();
                                                if (((str23 != null && str22 == null && str21 == null) ? null : kVar2) == null) {
                                                    str24 = Yd.a.j().v(new Message.Extras(str23, str22, j22, j21, str21, null, null, null, false, 480, null));
                                                    Unit unit9 = Unit.INSTANCE;
                                                } else {
                                                    str24 = null;
                                                }
                                                str6 = str24;
                                                obj14 = str18;
                                                kVar = kVar2;
                                            }
                                        } else {
                                            j12 = longValue;
                                            map2 = map5;
                                        }
                                    }
                                    str26 = null;
                                    if (str35 == null) {
                                    }
                                    if (gVar != null) {
                                    }
                                }
                            } else {
                                file = fileFromDisk;
                                str18 = str17;
                                str25 = a11;
                                z11 = true;
                                z12 = false;
                                obj = null;
                            }
                            if (str35 != null) {
                                kVar2 = d12;
                                i10 = 2;
                            } else {
                                kVar2 = d12;
                                i10 = 2;
                            }
                            if (str35 == null || StringsKt.contains$default(str35, Message.g.Video.getStringValue(), z12, i10, obj) != z11) {
                                map2 = map5;
                                str35 = Message.g.File.getStringValue();
                                j12 = -1;
                                str26 = null;
                                if (str35 == null) {
                                }
                                if (gVar != null) {
                                }
                            }
                            if (str35 == null) {
                            }
                            map2 = map5;
                            j12 = -1;
                            str35 = str35;
                            str26 = null;
                            if (str35 == null) {
                            }
                            if (gVar != null) {
                            }
                        } else {
                            str18 = str17;
                            kVar2 = d12;
                            map2 = map5;
                            j11 = 0;
                            str19 = null;
                            str20 = null;
                            j12 = -1;
                        }
                        str22 = f15;
                        str21 = str19;
                        gVar = obj6 != null ? Message.g.Companion.a(obj6) : Message.g.Text;
                        str23 = str20;
                        long j212 = j12;
                        long j222 = j11;
                        gVar.getStringValue();
                        if (((str23 != null && str22 == null && str21 == null) ? null : kVar2) == null) {
                        }
                        str6 = str24;
                        obj14 = str18;
                        kVar = kVar2;
                    } else {
                        salesIQChat3 = salesIQChat2;
                        str5 = obj8;
                        map2 = map5;
                        kVar = null;
                        str6 = null;
                        list3 = null;
                    }
                    String u11 = j15.u(kVar);
                    Unit unit10 = Unit.INSTANCE;
                    list2 = list3;
                    str14 = u11;
                    str13 = obj14;
                } else {
                    salesIQChat3 = salesIQChat2;
                    str5 = obj8;
                    map2 = map5;
                    str13 = obj14;
                    str6 = null;
                    list2 = null;
                    str14 = null;
                }
                stringValue = str33;
                Unit unit11 = Unit.INSTANCE;
                str7 = str13;
                str8 = str14;
                list = list2;
            } else {
                salesIQChat3 = salesIQChat2;
                str5 = obj8;
                map2 = map5;
                str13 = null;
                str6 = null;
                list2 = null;
                str14 = null;
                str7 = str13;
                str8 = str14;
                list = list2;
            }
        } else {
            salesIQChat3 = salesIQChat2;
            str5 = obj8;
            map2 = map5;
            j10 = -1;
            str6 = null;
            list = null;
            str7 = null;
            str8 = null;
        }
        String str36 = stringValue;
        if (str3 == null) {
            Object obj15 = map.get("msguid");
            str9 = obj15 != null ? obj15.toString() : null;
        } else {
            str9 = str3;
        }
        long c10 = c(map);
        boolean parseBoolean = Boolean.parseBoolean(String.valueOf(map.get("isedited")));
        boolean parseBoolean2 = Boolean.parseBoolean(String.valueOf(map.get("isdeleted")));
        Object obj16 = map4.get("acknowledgement_key");
        if (obj16 == null) {
            obj16 = salesIQChat3 != null ? salesIQChat3.getConvID() : null;
        }
        String valueOf4 = String.valueOf(obj16);
        Object obj17 = map4.get("conversation_id");
        if (obj17 == null) {
            obj17 = salesIQChat3 != null ? salesIQChat3.getVisitorid() : null;
        }
        String valueOf5 = String.valueOf(obj17);
        Object obj18 = map4.get("chat_id");
        if (obj18 == null) {
            obj18 = salesIQChat3 != null ? salesIQChat3.getChid() : null;
        }
        String valueOf6 = String.valueOf(obj18);
        String rchatid = salesIQChat3 != null ? salesIQChat3.getRchatid() : null;
        Message.f.a aVar2 = Message.f.Companion;
        Object obj19 = map.get("status");
        if (obj19 == null || (str10 = obj19.toString()) == null) {
            str10 = "sent";
        }
        int ordinal = aVar2.a(str10).ordinal();
        Object obj20 = map.get("msgid");
        if (obj20 == null) {
            obj20 = Long.valueOf(c(map));
        }
        String obj21 = obj20.toString();
        if (str9 == null || (valueOf = StringsKt.replace$default(str9, "%", "_", false, 4, (Object) null)) == null) {
            valueOf = Long.valueOf(c(map));
        }
        String obj22 = valueOf.toString();
        String u12 = str7 != null ? i.u(str7) : null;
        String v10 = list != null ? Yd.a.j().v(list) : null;
        if (str5 == null || (u10 = i.u(str5)) == null) {
            z10 = parseBoolean;
            str11 = null;
        } else {
            z10 = parseBoolean;
            str11 = Yd.a.j().v(new Message.b(u10, m.b(u10)));
        }
        String u13 = Yd.a.j().u(Yd.a.j().B(map2));
        boolean isBotSender = str31 != null ? LiveChatUtil.isBotSender(str31) : false;
        if (str6 == null) {
            Object obj23 = map.get("extras");
            str12 = obj23 != null ? Yd.a.j().u(Yd.a.j().B(obj23)) : null;
        } else {
            str12 = str6;
        }
        Object obj24 = map.get("lmsgtime");
        if (obj24 == null) {
            obj24 = map.get("lt");
        }
        MessageEntity.Time time2 = new MessageEntity.Time(c10, c10, i.q(String.valueOf(obj24), j10), 0L, 0L, j.c(c10, null, null, 3, null), 24, null);
        if (z10) {
            copy$default = MessageEntity.Time.copy$default(time2, 0L, 0L, 0L, i.q(String.valueOf(map.get("time")), -1L), 0L, null, 55, null);
        } else {
            if (!parseBoolean2) {
                time = time2;
                Gson j23 = Yd.a.j();
                Object obj25 = map.get("reply_to");
                Hashtable hashtable = !(obj25 instanceof Hashtable) ? (Hashtable) obj25 : null;
                return new MessageEntity(valueOf4, valueOf5, valueOf6, rchatid, null, str36, Integer.valueOf(ordinal), obj21, obj22, str7, u12, v10, str31, str11, str8, u13, null, isBotSender, null, null, Boolean.valueOf(z10), Boolean.valueOf(parseBoolean2), j23.v(hashtable == null ? f(hashtable, str, str2, null, salesIQChat) : null), null, Intrinsics.areEqual(str31, LiveChatUtil.getAnnonID()), str12, time, 8912896, null);
            }
            copy$default = MessageEntity.Time.copy$default(time2, 0L, 0L, 0L, 0L, i.q(String.valueOf(map.get("time")), -1L), null, 47, null);
        }
        time = copy$default;
        Gson j232 = Yd.a.j();
        Object obj252 = map.get("reply_to");
        if (!(obj252 instanceof Hashtable)) {
        }
        return new MessageEntity(valueOf4, valueOf5, valueOf6, rchatid, null, str36, Integer.valueOf(ordinal), obj21, obj22, str7, u12, v10, str31, str11, str8, u13, null, isBotSender, null, null, Boolean.valueOf(z10), Boolean.valueOf(parseBoolean2), j232.v(hashtable == null ? f(hashtable, str, str2, null, salesIQChat) : null), null, Intrinsics.areEqual(str31, LiveChatUtil.getAnnonID()), str12, time, 8912896, null);
    }

    public static /* synthetic */ MessageEntity h(Hashtable hashtable, String str, String str2, String str3, SalesIQChat salesIQChat, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            salesIQChat = null;
        }
        return f(hashtable, str, str2, str3, salesIQChat);
    }

    public static /* synthetic */ MessageEntity i(Map map, String str, String str2, String str3, SalesIQChat salesIQChat, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            salesIQChat = null;
        }
        return g(map, str, str2, str3, salesIQChat);
    }

    public static final k j(k kVar) {
        h r10 = kVar.r("dname");
        if (r10 != null) {
            kVar.p("name", AbstractC5896h.f(r10));
        }
        h r11 = kVar.r("lsuid");
        if (r11 != null) {
            kVar.p(StackTraceHelper.ID_KEY, AbstractC5896h.f(r11));
        }
        h r12 = kVar.r("transfername");
        if (r12 != null) {
            kVar.p("name", AbstractC5896h.f(r12));
        }
        h r13 = kVar.r("transferid");
        if (r13 != null) {
            kVar.p(StackTraceHelper.ID_KEY, AbstractC5896h.f(r13));
        }
        h r14 = kVar.r("image_fkey");
        if (r14 != null) {
            kVar.p("image_file_key", AbstractC5896h.f(r14));
        }
        return kVar;
    }
}
