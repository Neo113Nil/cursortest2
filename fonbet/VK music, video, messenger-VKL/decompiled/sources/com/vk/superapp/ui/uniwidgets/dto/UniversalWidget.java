package com.vk.superapp.ui.uniwidgets.dto;

import com.ironsource.B5;
import com.ironsource.C4504q2;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import com.vk.superapp.ui.uniwidgets.blocks.AvatarStackBlock;
import com.vk.superapp.ui.uniwidgets.blocks.BadgeBlock;
import com.vk.superapp.ui.uniwidgets.blocks.BaseBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ButtonBlock;
import com.vk.superapp.ui.uniwidgets.blocks.CounterBlock;
import com.vk.superapp.ui.uniwidgets.blocks.EmptyBlock;
import com.vk.superapp.ui.uniwidgets.blocks.FooterBlock;
import com.vk.superapp.ui.uniwidgets.blocks.HeaderBlock;
import com.vk.superapp.ui.uniwidgets.blocks.HorizontalAlignment;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ScrollItemBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TableBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TextBlock;
import com.vk.superapp.ui.uniwidgets.blocks.VerticalAlign;
import com.vk.superapp.ui.uniwidgets.blocks.WidgetColor;
import com.vk.superapp.ui.uniwidgets.dto.CardUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.CounterUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.GridUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.InformerUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.InternalUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.PlaceholderUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.ScrollUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.TableUniWidget;
import com.vk.superapp.ui.widgets.AdditionalHeaderIconBlock;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.SuperAppWidgetSize;
import com.vk.superapp.ui.widgets.WidgetBasePayload;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.drm0;
import xsna.dz5;
import xsna.epx;
import xsna.f370;
import xsna.go9;
import xsna.iah0;
import xsna.j5g;
import xsna.rdi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: UniversalWidget.kt */
/* loaded from: classes6.dex */
public abstract class UniversalWidget extends SuperAppWidget {
    public final String j;
    public final double k;
    public final WebAction l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidget.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CARD;
        public static final Type COUNTER;
        public static final Type GRID;
        public static final Type INFORMER;
        public static final Type INTERNAL;
        public static final Type PLACEHOLDER;
        public static final Type SCROLL;
        public static final Type TABLE;
        private final String typeName;

        static {
            Type type = new Type("SCROLL", 0, "scroll");
            SCROLL = type;
            Type type2 = new Type("INFORMER", 1, "informer");
            INFORMER = type2;
            Type type3 = new Type("COUNTER", 2, "counter");
            COUNTER = type3;
            Type type4 = new Type(SignalingProtocol.KEY_GRID, 3, "grid");
            GRID = type4;
            Type type5 = new Type("INTERNAL", 4, "internal");
            INTERNAL = type5;
            Type type6 = new Type("CARD", 5, "card");
            CARD = type6;
            Type type7 = new Type("PLACEHOLDER", 6, "placeholder");
            PLACEHOLDER = type7;
            Type type8 = new Type("TABLE", 7, B5.R);
            TABLE = type8;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type(String str, int i, String str2) {
            this.typeName = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String h() {
            return this.typeName;
        }
    }

    /* compiled from: UniversalWidget.kt */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:410:0x0a29, code lost:
        
            if (r8 != null) goto L398;
         */
        /* JADX WARN: Code restructure failed: missing block: B:419:0x0a0a, code lost:
        
            if (r4 != null) goto L387;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:307:0x0857  */
        /* JADX WARN: Removed duplicated region for block: B:311:0x0862  */
        /* JADX WARN: Removed duplicated region for block: B:319:0x0847  */
        /* JADX WARN: Type inference failed for: r11v10 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r11v9, types: [com.vk.superapp.api.dto.widgets.actions.WebAction] */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static UniversalWidget a(JSONObject jSONObject, WidgetObjects widgetObjects) {
            ArrayList arrayList;
            WebImage webImage;
            ArrayList arrayList2;
            List x;
            TableUniWidget.b bVar;
            String str;
            JSONArray jSONArray;
            int i;
            String str2;
            int i2;
            String str3;
            String str4;
            TableUniWidget.b bVar2;
            String str5;
            int i3;
            String str6;
            int i4;
            int i5;
            String str7;
            String str8;
            JSONArray jSONArray2;
            String str9;
            ImageBlock.Style.Size size;
            Enum r4;
            ImageBlock.Style.Outline outline;
            Enum r8;
            Object obj;
            WidgetObjects widgetObjects2;
            ImageBlock imageBlock;
            TableBlock tableBlock;
            JSONObject jSONObject2;
            JSONArray jSONArray3;
            String str10;
            int i6;
            Class cls;
            Object obj2;
            JSONObject optJSONObject;
            String str11;
            CardUniWidget.Animation animation;
            BaseBlock a;
            Object obj3;
            ArrayList arrayList3;
            CounterBlock.Order order;
            ArrayList arrayList4;
            String str12;
            JSONArray jSONArray4;
            CounterBlock counterBlock;
            String str13;
            Object obj4;
            Object obj5;
            ImageBlock.Style.Size size2;
            Object obj6;
            ArrayList arrayList5;
            JSONArray jSONArray5;
            int i7;
            TextBlock textBlock;
            BadgeBlock badgeBlock;
            ScrollItemBlock scrollItemBlock;
            String optString;
            String str14 = "type";
            String g0 = (jSONObject == null || (optString = jSONObject.optString("type")) == null) ? null : drm0.g0(optString, "universal_", optString);
            boolean f = epx.f(g0, Type.SCROLL.h());
            String str15 = "title";
            BaseBlock baseBlock = EmptyBlock.b;
            if (f) {
                ScrollUniWidget.CREATOR.getClass();
                String string = jSONObject.getString("type");
                WidgetIds.CREATOR.getClass();
                WidgetIds a2 = WidgetIds.a.a(jSONObject);
                WidgetSettings.CREATOR.getClass();
                WidgetSettings a3 = WidgetSettings.a.a(jSONObject);
                String optString2 = jSONObject.optString("action_title");
                QueueSettings.CREATOR.getClass();
                QueueSettings a4 = QueueSettings.a.a(jSONObject);
                ScrollUniWidget.Payload.a aVar = ScrollUniWidget.Payload.CREATOR;
                JSONObject jSONObject3 = jSONObject.getJSONObject("payload");
                aVar.getClass();
                BaseBlock d = d(jSONObject3);
                BaseBlock c = c(jSONObject3, widgetObjects);
                BaseBlock baseBlock2 = c != null ? c : baseBlock;
                ScrollItemBlock.Style.a aVar2 = ScrollItemBlock.Style.CREATOR;
                JSONObject jSONObject4 = jSONObject3.getJSONObject("root_style");
                aVar2.getClass();
                String optString3 = jSONObject4.optString("size");
                Object obj7 = ScrollItemBlock.Size.REGULAR;
                if (optString3 != null) {
                    try {
                        obj4 = Enum.valueOf(ScrollItemBlock.Size.class, optString3.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                        obj4 = null;
                    }
                    if (obj4 != null) {
                        obj7 = obj4;
                    }
                }
                ScrollItemBlock.Size size3 = (ScrollItemBlock.Size) obj7;
                String optString4 = jSONObject4.optString("align");
                Object obj8 = HorizontalAlignment.CENTER;
                if (optString4 != null) {
                    try {
                        obj5 = Enum.valueOf(HorizontalAlignment.class, optString4.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused2) {
                        obj5 = null;
                    }
                    if (obj5 != null) {
                        obj8 = obj5;
                    }
                }
                HorizontalAlignment horizontalAlignment = (HorizontalAlignment) obj8;
                String string2 = jSONObject4.getJSONObject("image").getString("type");
                int i8 = ScrollItemBlock.Style.a.C1908a.$EnumSwitchMapping$0[size3.ordinal()];
                if (i8 == 1) {
                    size2 = ImageBlock.Style.Size.MEDIUM;
                } else if (i8 == 2) {
                    size2 = ImageBlock.Style.Size.LARGE;
                } else {
                    if (i8 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    size2 = ImageBlock.Style.Size.EXTRA_LARGE;
                }
                ImageBlock.Style style = new ImageBlock.Style(size2, string2);
                TextBlock.Style.a aVar3 = TextBlock.Style.CREATOR;
                JSONObject optJSONObject2 = jSONObject4.optJSONObject("title");
                aVar3.getClass();
                TextBlock.Style b = TextBlock.Style.a.b(optJSONObject2);
                TextBlock.Style b2 = TextBlock.Style.a.b(jSONObject4.optJSONObject("description"));
                JSONObject optJSONObject3 = jSONObject4.optJSONObject("badge");
                String string3 = optJSONObject3 != null ? optJSONObject3.getString("align") : null;
                Object obj9 = HorizontalAlignment.RIGHT;
                if (string3 != null) {
                    try {
                        obj6 = Enum.valueOf(HorizontalAlignment.class, string3.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused3) {
                        obj6 = null;
                    }
                    if (obj6 != null) {
                        obj9 = obj6;
                    }
                }
                ScrollItemBlock.Style style2 = new ScrollItemBlock.Style(size3, horizontalAlignment, style, b, b2, (HorizontalAlignment) obj9);
                JSONArray jSONArray6 = jSONObject3.getJSONArray("items");
                if (jSONArray6 != null) {
                    arrayList5 = new ArrayList(jSONArray6.length());
                    int length = jSONArray6.length();
                    int i9 = 0;
                    while (i9 < length) {
                        JSONObject optJSONObject4 = jSONArray6.optJSONObject(i9);
                        if (optJSONObject4 != null) {
                            ScrollItemBlock.CREATOR.getClass();
                            JSONObject optJSONObject5 = optJSONObject4.optJSONObject("title");
                            String string4 = optJSONObject5 != null ? optJSONObject5.getString("value") : null;
                            if (string4 == null || string4.length() == 0) {
                                jSONArray5 = jSONArray6;
                                i7 = length;
                                textBlock = null;
                            } else {
                                jSONArray5 = jSONArray6;
                                i7 = length;
                                textBlock = new TextBlock(string4, style2.e);
                            }
                            JSONObject optJSONObject6 = optJSONObject4.optJSONObject("description");
                            String string5 = optJSONObject6 != null ? optJSONObject6.getString("value") : null;
                            TextBlock textBlock2 = (string5 == null || string5.length() == 0) ? null : new TextBlock(string5, style2.f);
                            JSONObject jSONObject5 = optJSONObject4.getJSONObject("image");
                            ImageBlock.CREATOR.getClass();
                            ImageBlock a5 = ImageBlock.a.a(jSONObject5, widgetObjects, style2.d);
                            if (a5 == null) {
                                scrollItemBlock = null;
                            } else {
                                JSONObject optJSONObject7 = optJSONObject4.optJSONObject("badge");
                                if (optJSONObject7 != null) {
                                    BadgeBlock.CREATOR.getClass();
                                    badgeBlock = BadgeBlock.a.a(optJSONObject7, style2.g);
                                } else {
                                    badgeBlock = null;
                                }
                                scrollItemBlock = new ScrollItemBlock(a5, textBlock, textBlock2, badgeBlock, WebAction.a.a(optJSONObject4.optJSONObject("action"), null));
                            }
                            arrayList5.add(scrollItemBlock);
                        } else {
                            jSONArray5 = jSONArray6;
                            i7 = length;
                        }
                        i9++;
                        jSONArray6 = jSONArray5;
                        length = i7;
                    }
                } else {
                    arrayList5 = null;
                }
                List V = arrayList5 != null ? j5g.V(arrayList5) : null;
                if (V == null || V.isEmpty()) {
                    throw new NullPointerException("Failed to parse items");
                }
                JSONObject optJSONObject8 = jSONObject3.optJSONObject("action");
                WebAction a6 = optJSONObject8 != null ? WebAction.a.a(optJSONObject8, null) : null;
                WidgetBasePayload.CREATOR.getClass();
                return new ScrollUniWidget(a2, string, a4, a3, optString2, new ScrollUniWidget.Payload(a6, d, style2, V, baseBlock2, WidgetBasePayload.a.a(jSONObject3)));
            }
            Class cls2 = HorizontalAlignment.class;
            String str16 = "align";
            String str17 = "subtitle";
            if (epx.f(g0, Type.COUNTER.h())) {
                CounterUniWidget.CREATOR.getClass();
                String string6 = jSONObject.getString("type");
                WidgetIds.CREATOR.getClass();
                WidgetIds a7 = WidgetIds.a.a(jSONObject);
                WidgetSettings.CREATOR.getClass();
                WidgetSettings a8 = WidgetSettings.a.a(jSONObject);
                String optString5 = jSONObject.optString("action_title");
                QueueSettings.CREATOR.getClass();
                QueueSettings a9 = QueueSettings.a.a(jSONObject);
                CounterUniWidget.Payload.a aVar4 = CounterUniWidget.Payload.CREATOR;
                JSONObject jSONObject6 = jSONObject.getJSONObject("payload");
                aVar4.getClass();
                String optString6 = jSONObject6.optString("header_title");
                WebImage.a aVar5 = WebImage.CREATOR;
                JSONArray optJSONArray = jSONObject6.optJSONArray("header_icon");
                aVar5.getClass();
                WebImage a10 = WebImage.a.a(optJSONArray);
                String optString7 = jSONObject6.optString("additional_header");
                HeaderBlock.a aVar6 = HeaderBlock.CREATOR;
                WebImageSize f2 = a10.f(iah0.a(24));
                String str18 = f2 != null ? f2.b : null;
                aVar6.getClass();
                BaseBlock a11 = HeaderBlock.a.a(str18, optString6, optString7);
                JSONObject jSONObject7 = jSONObject6.getJSONObject("root_style");
                CounterBlock.Order.a aVar7 = CounterBlock.Order.Companion;
                String string7 = jSONObject7.getString(C4504q2.u);
                aVar7.getClass();
                CounterBlock.Order[] values = CounterBlock.Order.values();
                int length2 = values.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        order = null;
                        break;
                    }
                    order = values[i10];
                    str13 = order.str;
                    if (epx.f(str13, string7)) {
                        break;
                    }
                    i10++;
                }
                if (order == null) {
                    order = CounterBlock.Order.CLASSIC;
                }
                CounterBlock.Order order2 = order;
                TextBlock.Style.a aVar8 = TextBlock.Style.CREATOR;
                String str19 = "counter";
                JSONObject optJSONObject9 = jSONObject7.optJSONObject("counter");
                aVar8.getClass();
                TextBlock.Style b3 = TextBlock.Style.a.b(optJSONObject9);
                TextBlock.Style b4 = TextBlock.Style.a.b(jSONObject7.optJSONObject("title"));
                TextBlock.Style b5 = TextBlock.Style.a.b(jSONObject7.optJSONObject("subtitle"));
                JSONArray jSONArray7 = jSONObject6.getJSONArray("items");
                if (jSONArray7 != null) {
                    arrayList4 = new ArrayList(jSONArray7.length());
                    int length3 = jSONArray7.length();
                    int i11 = 0;
                    while (i11 < length3) {
                        JSONObject optJSONObject10 = jSONArray7.optJSONObject(i11);
                        if (optJSONObject10 != null) {
                            CounterBlock.CREATOR.getClass();
                            jSONArray4 = jSONArray7;
                            JSONObject optJSONObject11 = optJSONObject10.optJSONObject(str19);
                            String string8 = optJSONObject11 != null ? optJSONObject11.getString("value") : null;
                            str12 = str19;
                            TextBlock textBlock3 = string8 != null ? new TextBlock(string8, b3) : null;
                            JSONObject optJSONObject12 = optJSONObject10.optJSONObject("title");
                            String string9 = optJSONObject12 != null ? optJSONObject12.getString("value") : null;
                            TextBlock textBlock4 = string9 != null ? new TextBlock(string9, b4) : null;
                            JSONObject optJSONObject13 = optJSONObject10.optJSONObject("subtitle");
                            String string10 = optJSONObject13 != null ? optJSONObject13.getString("value") : null;
                            TextBlock textBlock5 = string10 != null ? new TextBlock(string10, b5) : null;
                            if (textBlock3 == null && textBlock4 == null && textBlock5 == null) {
                                counterBlock = null;
                            } else {
                                JSONObject optJSONObject14 = optJSONObject10.optJSONObject("action");
                                counterBlock = new CounterBlock(order2, textBlock3, textBlock4, textBlock5, optJSONObject14 != null ? WebAction.a.a(optJSONObject14, null) : null);
                            }
                            arrayList4.add(counterBlock);
                        } else {
                            str12 = str19;
                            jSONArray4 = jSONArray7;
                        }
                        i11++;
                        jSONArray7 = jSONArray4;
                        str19 = str12;
                    }
                } else {
                    arrayList4 = null;
                }
                List V2 = arrayList4 != null ? j5g.V(arrayList4) : null;
                if (V2 == null || V2.isEmpty()) {
                    throw new NullPointerException("Failed to parse items");
                }
                BaseBlock c2 = c(jSONObject6, widgetObjects);
                BaseBlock baseBlock3 = c2 != null ? c2 : baseBlock;
                WebAction b6 = b(jSONObject6);
                WidgetBasePayload.CREATOR.getClass();
                return new CounterUniWidget(a7, string6, a9, a8, optString5, new CounterUniWidget.Payload(b6, a11, V2, baseBlock3, WidgetBasePayload.a.a(jSONObject6)));
            }
            if (epx.f(g0, Type.GRID.h())) {
                GridUniWidget.CREATOR.getClass();
                String string11 = jSONObject.getString("type");
                WidgetIds.CREATOR.getClass();
                WidgetIds a12 = WidgetIds.a.a(jSONObject);
                WidgetSettings.CREATOR.getClass();
                WidgetSettings a13 = WidgetSettings.a.a(jSONObject);
                String optString8 = jSONObject.optString("action_title");
                QueueSettings.CREATOR.getClass();
                QueueSettings a14 = QueueSettings.a.a(jSONObject);
                GridUniWidget.Payload.a aVar9 = GridUniWidget.Payload.CREATOR;
                JSONObject jSONObject8 = jSONObject.getJSONObject("payload");
                aVar9.getClass();
                String optString9 = jSONObject8.optString("header_title");
                WebImage.a aVar10 = WebImage.CREATOR;
                JSONArray optJSONArray2 = jSONObject8.optJSONArray("header_icon");
                aVar10.getClass();
                WebImage a15 = WebImage.a.a(optJSONArray2);
                String optString10 = jSONObject8.optString("additional_header");
                HeaderBlock.a aVar11 = HeaderBlock.CREATOR;
                WebImageSize f3 = a15.f(iah0.a(24));
                String str20 = f3 != null ? f3.b : null;
                aVar11.getClass();
                BaseBlock a16 = HeaderBlock.a.a(str20, optString9, optString10);
                String string12 = jSONObject8.getJSONObject("root_style").getString("size");
                Object obj10 = GridUniWidget.Size.MEDIUM;
                if (string12 != null) {
                    try {
                        obj3 = Enum.valueOf(GridUniWidget.Size.class, string12.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused4) {
                        obj3 = null;
                    }
                    if (obj3 != null) {
                        obj10 = obj3;
                    }
                }
                GridUniWidget.Size size4 = (GridUniWidget.Size) obj10;
                ImageBlock.Style style3 = new ImageBlock.Style(ImageBlock.Style.Size.LARGE, ImageBlock.Style.Outline.SQUARE, null, 4, null);
                JSONArray jSONArray8 = jSONObject8.getJSONArray("items");
                if (jSONArray8 != null) {
                    arrayList3 = new ArrayList(jSONArray8.length());
                    int length4 = jSONArray8.length();
                    for (int i12 = 0; i12 < length4; i12++) {
                        JSONObject optJSONObject15 = jSONArray8.optJSONObject(i12);
                        if (optJSONObject15 != null) {
                            ImageBlock.CREATOR.getClass();
                            arrayList3.add(ImageBlock.a.a(optJSONObject15, widgetObjects, style3));
                        }
                    }
                } else {
                    arrayList3 = null;
                }
                List V3 = arrayList3 != null ? j5g.V(arrayList3) : null;
                if (V3 == null || V3.isEmpty()) {
                    throw new NullPointerException("Failed to parse items");
                }
                BaseBlock c3 = c(jSONObject8, widgetObjects);
                BaseBlock baseBlock4 = c3 != null ? c3 : baseBlock;
                WebAction b7 = b(jSONObject8);
                WidgetBasePayload.CREATOR.getClass();
                return new GridUniWidget(a12, string11, a14, a13, optString8, new GridUniWidget.Payload(b7, size4, a16, V3, baseBlock4, WidgetBasePayload.a.a(jSONObject8)));
            }
            if (epx.f(g0, Type.INTERNAL.h())) {
                InternalUniWidget.CREATOR.getClass();
                String string13 = jSONObject.getString("type");
                WidgetIds.CREATOR.getClass();
                WidgetIds a17 = WidgetIds.a.a(jSONObject);
                WidgetSettings.CREATOR.getClass();
                WidgetSettings a18 = WidgetSettings.a.a(jSONObject);
                String optString11 = jSONObject.optString("action_title");
                QueueSettings.CREATOR.getClass();
                QueueSettings a19 = QueueSettings.a.a(jSONObject);
                InternalUniWidget.Payload.a aVar12 = InternalUniWidget.Payload.CREATOR;
                JSONObject jSONObject9 = jSONObject.getJSONObject("payload");
                aVar12.getClass();
                InternalUniWidget.Style.a aVar13 = InternalUniWidget.Style.CREATOR;
                JSONObject jSONObject10 = jSONObject9.getJSONObject("root_style");
                aVar13.getClass();
                TextBlock.Style.a aVar14 = TextBlock.Style.CREATOR;
                JSONObject jSONObject11 = jSONObject10.getJSONObject("title");
                aVar14.getClass();
                InternalUniWidget.Style style4 = new InternalUniWidget.Style(TextBlock.Style.a.b(jSONObject11), TextBlock.Style.a.b(jSONObject10.getJSONObject("subtitle")));
                String string14 = jSONObject9.getJSONObject("title").getString("value");
                WebImage.a aVar15 = WebImage.CREATOR;
                JSONArray optJSONArray3 = jSONObject9.optJSONArray("header_icon");
                aVar15.getClass();
                WebImage a20 = WebImage.a.a(optJSONArray3);
                String optString12 = jSONObject9.optString("additional_header");
                if (string14.length() == 0) {
                    a = baseBlock;
                } else {
                    HeaderBlock.a aVar16 = HeaderBlock.CREATOR;
                    WebImageSize f4 = a20.f(iah0.a(24));
                    String str21 = f4 != null ? f4.b : null;
                    aVar16.getClass();
                    a = HeaderBlock.a.a(str21, string14, optString12);
                }
                BaseBlock c4 = c(jSONObject9, widgetObjects);
                BaseBlock baseBlock5 = c4 != null ? c4 : baseBlock;
                WebAction b8 = b(jSONObject9);
                JSONObject optJSONObject16 = jSONObject9.optJSONObject("subtitle");
                String optString13 = optJSONObject16 != null ? optJSONObject16.optString("value") : null;
                WidgetBasePayload.CREATOR.getClass();
                return new InternalUniWidget(a17, string13, a19, a18, optString11, new InternalUniWidget.Payload(b8, a, (optString13 == null || optString13.length() == 0) ? baseBlock : new TextBlock(optString13, style4.c), baseBlock5, style4, WidgetBasePayload.a.a(jSONObject9)));
            }
            if (epx.f(g0, Type.CARD.h())) {
                CardUniWidget.a aVar17 = CardUniWidget.CREATOR;
                aVar17.getClass();
                String string15 = jSONObject.getString("type");
                WidgetIds.CREATOR.getClass();
                WidgetIds a21 = WidgetIds.a.a(jSONObject);
                WidgetSettings.CREATOR.getClass();
                WidgetSettings a22 = WidgetSettings.a.a(jSONObject);
                String optString14 = jSONObject.optString("action_title");
                QueueSettings.CREATOR.getClass();
                QueueSettings a23 = QueueSettings.a.a(jSONObject);
                CardUniWidget.Payload.a aVar18 = CardUniWidget.Payload.CREATOR;
                JSONObject jSONObject12 = jSONObject.getJSONObject("payload");
                aVar18.getClass();
                JSONObject jSONObject13 = jSONObject12.getJSONObject("root_style");
                TextBlock.Style.a aVar19 = TextBlock.Style.CREATOR;
                JSONObject optJSONObject17 = jSONObject13.optJSONObject("title");
                aVar19.getClass();
                TextBlock.Style b9 = TextBlock.Style.a.b(optJSONObject17);
                TextBlock.Style b10 = TextBlock.Style.a.b(jSONObject13.optJSONObject("subtitle"));
                TextBlock.Style b11 = TextBlock.Style.a.b(jSONObject13.optJSONObject("second_subtitle"));
                BaseBlock d2 = d(jSONObject12);
                WebAction b12 = b(jSONObject12);
                ImageBlock.a aVar20 = ImageBlock.CREATOR;
                JSONObject jSONObject14 = jSONObject12.getJSONObject("image");
                ImageBlock.Style style5 = new ImageBlock.Style(null, null, null, 7, null);
                aVar20.getClass();
                ImageBlock a24 = ImageBlock.a.a(jSONObject14, widgetObjects, style5);
                if (a24 == null) {
                    throw new NullPointerException("Failed to parse image");
                }
                boolean optBoolean = jSONObject13.optBoolean("image_padding", false);
                BaseBlock a25 = CardUniWidget.a.a(aVar17, jSONObject12, "title", b9);
                BaseBlock a26 = CardUniWidget.a.a(aVar17, jSONObject12, "subtitle", b10);
                BaseBlock a27 = CardUniWidget.a.a(aVar17, jSONObject12, "second_subtitle", b11);
                BaseBlock c5 = c(jSONObject12, widgetObjects);
                BaseBlock baseBlock6 = c5 != null ? c5 : baseBlock;
                WidgetBasePayload.CREATOR.getClass();
                WidgetBasePayload a28 = WidgetBasePayload.a.a(jSONObject12);
                AdditionalHeaderIconBlock additionalHeaderIconBlock = a28.e;
                CardUniWidget.CardData cardData = new CardUniWidget.CardData(d2, a24, a25, a26, a27, baseBlock6, new ImageBlock(additionalHeaderIconBlock != null ? additionalHeaderIconBlock.b : null, new ImageBlock.Style(ImageBlock.Style.Size.SMALL, null, null, 6, null), additionalHeaderIconBlock != null ? additionalHeaderIconBlock.c : null, (String) null, 8, (zcl) null));
                if (jSONObject12.has("animation")) {
                    CardUniWidget.Animation.a aVar21 = CardUniWidget.Animation.CREATOR;
                    JSONObject jSONObject15 = jSONObject12.getJSONObject("animation");
                    aVar21.getClass();
                    animation = new CardUniWidget.Animation(jSONObject15.optString("url"), jSONObject15.optInt("repeat_count", -1));
                } else {
                    animation = null;
                }
                return new CardUniWidget(a21, string15, a23, a22, optString14, new CardUniWidget.Payload(b12, cardData, optBoolean, a28, animation));
            }
            String str22 = "value";
            if (epx.f(g0, Type.PLACEHOLDER.h())) {
                PlaceholderUniWidget.CREATOR.getClass();
                String string16 = jSONObject.getString("type");
                WidgetIds.CREATOR.getClass();
                WidgetIds a29 = WidgetIds.a.a(jSONObject);
                WidgetSettings.CREATOR.getClass();
                WidgetSettings a30 = WidgetSettings.a.a(jSONObject);
                String optString15 = jSONObject.optString("action_title");
                QueueSettings.CREATOR.getClass();
                QueueSettings a31 = QueueSettings.a.a(jSONObject);
                PlaceholderUniWidget.Payload.a aVar22 = PlaceholderUniWidget.Payload.CREATOR;
                JSONObject jSONObject16 = jSONObject.getJSONObject("payload");
                aVar22.getClass();
                JSONObject jSONObject17 = jSONObject16.getJSONObject("root_style");
                TextBlock.Style.a aVar23 = TextBlock.Style.CREATOR;
                JSONObject jSONObject18 = jSONObject17.getJSONObject("title");
                aVar23.getClass();
                TextBlock.Style b13 = TextBlock.Style.a.b(jSONObject18);
                ButtonBlock.Style style6 = ButtonBlock.Style.OUTLINE_TEXT;
                BaseBlock d3 = d(jSONObject16);
                WebAction b14 = b(jSONObject16);
                TextBlock.a aVar24 = TextBlock.CREATOR;
                JSONObject jSONObject19 = jSONObject16.getJSONObject("title");
                aVar24.getClass();
                TextBlock a32 = TextBlock.a.a(jSONObject19, b13);
                if (a32 == null) {
                    throw new NullPointerException("Failed to parse title");
                }
                ButtonBlock.a aVar25 = ButtonBlock.CREATOR;
                JSONObject optJSONObject18 = jSONObject16.optJSONObject("button");
                aVar25.getClass();
                BaseBlock a33 = ButtonBlock.a.a(optJSONObject18, style6);
                BaseBlock baseBlock7 = a33 != null ? a33 : baseBlock;
                BaseBlock c6 = c(jSONObject16, widgetObjects);
                BaseBlock baseBlock8 = c6 != null ? c6 : baseBlock;
                WidgetBasePayload.CREATOR.getClass();
                WidgetBasePayload a34 = WidgetBasePayload.a.a(jSONObject16);
                AdditionalHeaderIconBlock additionalHeaderIconBlock2 = a34.e;
                return new PlaceholderUniWidget(a29, string16, a31, a30, optString15, new PlaceholderUniWidget.Payload(b14, new PlaceholderUniWidget.DataBlocks(d3, a32, baseBlock7, baseBlock8, new ImageBlock(additionalHeaderIconBlock2 != null ? additionalHeaderIconBlock2.b : null, new ImageBlock.Style(ImageBlock.Style.Size.SMALL, null, null, 6, null), additionalHeaderIconBlock2 != null ? additionalHeaderIconBlock2.c : null, (String) null, 8, (zcl) null)), a34));
            }
            if (!epx.f(g0, Type.TABLE.h())) {
                if (!epx.f(g0, Type.INFORMER.h())) {
                    throw new IllegalArgumentException(go9.b("Unexpected universal type: ", g0));
                }
                InformerUniWidget.CREATOR.getClass();
                return InformerUniWidget.a.a(jSONObject, widgetObjects);
            }
            TableUniWidget.CREATOR.getClass();
            String string17 = jSONObject.getString("type");
            WidgetIds.CREATOR.getClass();
            WidgetIds a35 = WidgetIds.a.a(jSONObject);
            WidgetSettings.CREATOR.getClass();
            WidgetSettings a36 = WidgetSettings.a.a(jSONObject);
            String optString16 = jSONObject.optString("action_title");
            QueueSettings.CREATOR.getClass();
            QueueSettings a37 = QueueSettings.a.a(jSONObject);
            TableUniWidget.Payload.a aVar26 = TableUniWidget.Payload.CREATOR;
            JSONObject jSONObject20 = jSONObject.getJSONObject("payload");
            aVar26.getClass();
            JSONObject jSONObject21 = jSONObject20.getJSONObject("root_style");
            JSONArray jSONArray9 = jSONObject21.getJSONArray("columns");
            if (jSONArray9 != null) {
                arrayList = new ArrayList(jSONArray9.length());
                int length5 = jSONArray9.length();
                int i13 = 0;
                while (i13 < length5) {
                    int i14 = length5;
                    JSONObject optJSONObject19 = jSONArray9.optJSONObject(i13);
                    if (optJSONObject19 != null) {
                        TableBlock.Style.CREATOR.getClass();
                        jSONArray3 = jSONArray9;
                        String str23 = str16;
                        i6 = i13;
                        String optString17 = optJSONObject19.optString(str23);
                        Object obj11 = HorizontalAlignment.CENTER;
                        if (optString17 == null) {
                            str10 = str23;
                            cls = cls2;
                        } else {
                            str10 = str23;
                            try {
                                String upperCase = optString17.toUpperCase(Locale.US);
                                cls = cls2;
                                try {
                                    obj2 = Enum.valueOf(cls, upperCase);
                                } catch (IllegalArgumentException unused5) {
                                    obj2 = null;
                                    if (obj2 != null) {
                                    }
                                    HorizontalAlignment horizontalAlignment2 = (HorizontalAlignment) obj11;
                                    cls2 = cls;
                                    optJSONObject = optJSONObject19.optJSONObject("image");
                                    ImageBlock.Style.a aVar27 = ImageBlock.Style.CREATOR;
                                    if (optJSONObject == null) {
                                    }
                                    aVar27.getClass();
                                    ImageBlock.Style a38 = ImageBlock.Style.a.a(str11, optJSONObject);
                                    TextBlock.Style.a aVar28 = TextBlock.Style.CREATOR;
                                    JSONObject optJSONObject20 = optJSONObject19.optJSONObject("title");
                                    aVar28.getClass();
                                    arrayList.add(new TableBlock.Style(horizontalAlignment2, a38, TextBlock.Style.a.b(optJSONObject20), TextBlock.Style.a.b(optJSONObject19.optJSONObject("subtitle"))));
                                    i13 = i6 + 1;
                                    length5 = i14;
                                    jSONArray9 = jSONArray3;
                                    str16 = str10;
                                    jSONObject21 = jSONObject2;
                                }
                            } catch (IllegalArgumentException unused6) {
                                cls = cls2;
                            }
                            if (obj2 != null) {
                                obj11 = obj2;
                            }
                        }
                        HorizontalAlignment horizontalAlignment22 = (HorizontalAlignment) obj11;
                        cls2 = cls;
                        optJSONObject = optJSONObject19.optJSONObject("image");
                        ImageBlock.Style.a aVar272 = ImageBlock.Style.CREATOR;
                        if (optJSONObject == null) {
                            jSONObject2 = jSONObject21;
                            str11 = optJSONObject.optString("size");
                        } else {
                            jSONObject2 = jSONObject21;
                            str11 = null;
                        }
                        aVar272.getClass();
                        ImageBlock.Style a382 = ImageBlock.Style.a.a(str11, optJSONObject);
                        TextBlock.Style.a aVar282 = TextBlock.Style.CREATOR;
                        JSONObject optJSONObject202 = optJSONObject19.optJSONObject("title");
                        aVar282.getClass();
                        arrayList.add(new TableBlock.Style(horizontalAlignment22, a382, TextBlock.Style.a.b(optJSONObject202), TextBlock.Style.a.b(optJSONObject19.optJSONObject("subtitle"))));
                    } else {
                        jSONObject2 = jSONObject21;
                        jSONArray3 = jSONArray9;
                        str10 = str16;
                        i6 = i13;
                    }
                    i13 = i6 + 1;
                    length5 = i14;
                    jSONArray9 = jSONArray3;
                    str16 = str10;
                    jSONObject21 = jSONObject2;
                }
            } else {
                arrayList = null;
            }
            JSONObject jSONObject22 = jSONObject21;
            TableUniWidget.b bVar3 = arrayList == null ? null : new TableUniWidget.b(arrayList);
            String optString18 = jSONObject20.optString("header_title");
            WebImage.a aVar29 = WebImage.CREATOR;
            JSONArray optJSONArray4 = jSONObject20.optJSONArray("header_icon");
            aVar29.getClass();
            WebImage a39 = WebImage.a.a(optJSONArray4);
            String optString19 = jSONObject20.optString("additional_header");
            HeaderBlock.a aVar30 = HeaderBlock.CREATOR;
            WebImageSize f5 = a39.f(iah0.a(24));
            String str24 = f5 != null ? f5.b : null;
            aVar30.getClass();
            BaseBlock a40 = HeaderBlock.a.a(str24, optString18, optString19);
            JSONObject optJSONObject21 = jSONObject20.optJSONObject("action");
            WebAction a41 = optJSONObject21 != null ? WebAction.a.a(optJSONObject21, null) : null;
            JSONArray jSONArray10 = jSONObject20.getJSONArray("items");
            if (jSONArray10 != null) {
                arrayList2 = new ArrayList(jSONArray10.length());
                int length6 = jSONArray10.length();
                int i15 = 0;
                while (i15 < length6) {
                    JSONArray optJSONArray5 = jSONArray10.optJSONArray(i15);
                    if (optJSONArray5 != null) {
                        ArrayList arrayList6 = new ArrayList(optJSONArray5.length());
                        int length7 = optJSONArray5.length();
                        jSONArray = jSONArray10;
                        int i16 = 0;
                        while (i16 < length7) {
                            int i17 = length6;
                            JSONObject optJSONObject22 = optJSONArray5.optJSONObject(i16);
                            if (optJSONObject22 != null) {
                                i4 = i15;
                                if (i16 >= bVar3.a.size()) {
                                    bVar2 = bVar3;
                                    str5 = str14;
                                    i3 = i16;
                                    str6 = str17;
                                    i5 = length7;
                                    str7 = str15;
                                    str8 = str22;
                                    tableBlock = null;
                                    jSONArray2 = optJSONArray5;
                                } else {
                                    TableBlock.a aVar31 = TableBlock.CREATOR;
                                    TableBlock.Style style7 = (TableBlock.Style) bVar3.a.get(i16);
                                    aVar31.getClass();
                                    bVar2 = bVar3;
                                    JSONObject optJSONObject23 = optJSONObject22.optJSONObject(str15);
                                    i3 = i16;
                                    String str25 = str22;
                                    if (optJSONObject23 != null) {
                                        jSONArray2 = optJSONArray5;
                                        str9 = optJSONObject23.getString(str25);
                                    } else {
                                        jSONArray2 = optJSONArray5;
                                        str9 = null;
                                    }
                                    TextBlock.Style.a aVar32 = TextBlock.Style.CREATOR;
                                    i5 = length7;
                                    JSONObject optJSONObject24 = optJSONObject23 != null ? optJSONObject23.optJSONObject(TtmlNode.TAG_STYLE) : null;
                                    str7 = str15;
                                    TextBlock.Style style8 = style7.d;
                                    aVar32.getClass();
                                    TextBlock textBlock6 = (str9 == null || str9.length() == 0) ? null : new TextBlock(str9, TextBlock.Style.a.a(optJSONObject24, style8));
                                    JSONObject optJSONObject25 = optJSONObject22.optJSONObject(str17);
                                    String string18 = optJSONObject25 != null ? optJSONObject25.getString(str25) : null;
                                    TextBlock textBlock7 = (string18 == null || string18.length() == 0) ? null : new TextBlock(string18, TextBlock.Style.a.a(optJSONObject25 != null ? optJSONObject25.optJSONObject(TtmlNode.TAG_STYLE) : null, style7.e));
                                    JSONObject optJSONObject26 = optJSONObject22.optJSONObject("image");
                                    ImageBlock.Style.a aVar33 = ImageBlock.Style.CREATOR;
                                    ImageBlock.Style style9 = style7.c;
                                    aVar33.getClass();
                                    if (optJSONObject26 == null) {
                                        str5 = str14;
                                        str8 = str25;
                                        str6 = str17;
                                    } else {
                                        String A = f370.A("size", optJSONObject26);
                                        String A2 = f370.A(str14, optJSONObject26);
                                        str5 = str14;
                                        String A3 = f370.A("vertical_align", optJSONObject26);
                                        str8 = str25;
                                        ImageBlock.Style.Size size5 = style9.b;
                                        if (A == null) {
                                            size = size5;
                                            str6 = str17;
                                        } else {
                                            size = size5;
                                            str6 = str17;
                                            try {
                                                r4 = Enum.valueOf(ImageBlock.Style.Size.class, A.toUpperCase(Locale.US));
                                            } catch (IllegalArgumentException unused7) {
                                                r4 = null;
                                            }
                                        }
                                        r4 = size;
                                        ImageBlock.Style.Size size6 = (ImageBlock.Style.Size) r4;
                                        ImageBlock.Style.Outline outline2 = style9.c;
                                        if (A2 == null) {
                                            outline = outline2;
                                        } else {
                                            outline = outline2;
                                            try {
                                                r8 = Enum.valueOf(ImageBlock.Style.Outline.class, A2.toUpperCase(Locale.US));
                                            } catch (IllegalArgumentException unused8) {
                                                r8 = null;
                                            }
                                        }
                                        r8 = outline;
                                        ImageBlock.Style.Outline outline3 = (ImageBlock.Style.Outline) r8;
                                        Object obj12 = style9.d;
                                        if (A3 != null) {
                                            try {
                                                obj = Enum.valueOf(VerticalAlign.class, A3.toUpperCase(Locale.US));
                                            } catch (IllegalArgumentException unused9) {
                                                obj = null;
                                            }
                                            if (obj != null) {
                                                obj12 = obj;
                                            }
                                        }
                                        style9 = new ImageBlock.Style(size6, outline3, (VerticalAlign) obj12);
                                    }
                                    if (optJSONObject26 != null) {
                                        ImageBlock.CREATOR.getClass();
                                        widgetObjects2 = widgetObjects;
                                        imageBlock = ImageBlock.a.a(optJSONObject26, widgetObjects2, style9);
                                    } else {
                                        widgetObjects2 = widgetObjects;
                                        imageBlock = null;
                                    }
                                    AvatarStackBlock.a aVar34 = AvatarStackBlock.CREATOR;
                                    JSONObject optJSONObject27 = optJSONObject22.optJSONObject("user_stack");
                                    aVar34.getClass();
                                    AvatarStackBlock a42 = AvatarStackBlock.a.a(optJSONObject27, widgetObjects2);
                                    tableBlock = (imageBlock == null && textBlock6 == null && textBlock7 == null && a42 == null) ? null : new TableBlock(imageBlock, textBlock6, textBlock7, a42, WebAction.a.a(optJSONObject22.optJSONObject("action"), null), style7.b);
                                }
                                arrayList6.add(tableBlock);
                            } else {
                                bVar2 = bVar3;
                                str5 = str14;
                                i3 = i16;
                                str6 = str17;
                                i4 = i15;
                                i5 = length7;
                                str7 = str15;
                                str8 = str22;
                                jSONArray2 = optJSONArray5;
                            }
                            i16 = i3 + 1;
                            length6 = i17;
                            i15 = i4;
                            bVar3 = bVar2;
                            optJSONArray5 = jSONArray2;
                            str14 = str5;
                            length7 = i5;
                            str15 = str7;
                            str22 = str8;
                            str17 = str6;
                        }
                        bVar = bVar3;
                        str = str14;
                        i = length6;
                        str2 = str17;
                        i2 = i15;
                        str3 = str15;
                        str4 = str22;
                        List V4 = j5g.V(arrayList6);
                        arrayList2.add(V4.isEmpty() ? null : new TableRow((List<TableBlock>) V4));
                    } else {
                        bVar = bVar3;
                        str = str14;
                        jSONArray = jSONArray10;
                        i = length6;
                        str2 = str17;
                        i2 = i15;
                        str3 = str15;
                        str4 = str22;
                    }
                    i15 = i2 + 1;
                    jSONArray10 = jSONArray;
                    length6 = i;
                    bVar3 = bVar;
                    str14 = str;
                    str15 = str3;
                    str22 = str4;
                    str17 = str2;
                }
                webImage = null;
            } else {
                webImage = null;
                arrayList2 = null;
            }
            if (arrayList2 == null || (x = rdi.x(j5g.V(arrayList2))) == null) {
                throw new NullPointerException("Failed to parse items");
            }
            ArrayList E = dz5.E(jSONObject22.getJSONArray("sizes"));
            if (E == null) {
                throw new NullPointerException("Failed to parse sizes");
            }
            BaseBlock c7 = c(jSONObject20, widgetObjects);
            BaseBlock baseBlock9 = c7 != null ? c7 : baseBlock;
            WidgetBasePayload.CREATOR.getClass();
            WidgetBasePayload a43 = WidgetBasePayload.a.a(jSONObject20);
            AdditionalHeaderIconBlock additionalHeaderIconBlock3 = a43.e;
            return new TableUniWidget(a35, string17, a37, a36, optString16, new TableUniWidget.Payload(a41, new TableUniWidget.TableData(a40, E, x, baseBlock9, new ImageBlock(additionalHeaderIconBlock3 != null ? additionalHeaderIconBlock3.b : webImage, new ImageBlock.Style(ImageBlock.Style.Size.SMALL, null, null, 6, null), (WebAction) (additionalHeaderIconBlock3 != null ? additionalHeaderIconBlock3.c : webImage), (String) null, 8, (zcl) null)), a43));
        }

        public static WebAction b(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("action");
            if (optJSONObject != null) {
                return WebAction.a.a(optJSONObject, null);
            }
            return null;
        }

        public static FooterBlock c(JSONObject jSONObject, WidgetObjects widgetObjects) {
            JSONObject optJSONObject = jSONObject.optJSONObject("footer");
            if (optJSONObject != null) {
                String string = optJSONObject.getString("type");
                JSONObject jSONObject2 = optJSONObject.getJSONObject("payload");
                if (string != null) {
                    int hashCode = string.hashCode();
                    if (hashCode != -2026357524) {
                        if (hashCode != 1703237703) {
                            if (hashCode == 1934806292 && string.equals("user_stack")) {
                                FooterBlock.FooterStack.CREATOR.getClass();
                                String string2 = jSONObject2.getString("description");
                                AvatarStackBlock.CREATOR.getClass();
                                AvatarStackBlock a = AvatarStackBlock.a.a(jSONObject2, widgetObjects);
                                if (a != null) {
                                    return new FooterBlock.FooterStack("user_stack", new TextBlock(string2, new TextBlock.Style(WidgetColor.TEXT_SECONDARY, null, 2, null)), a);
                                }
                            }
                        } else if (string.equals("accent_button")) {
                            FooterBlock.FooterButton.CREATOR.getClass();
                            String string3 = jSONObject2.getJSONObject("title").getString("value");
                            TextBlock.Style.a aVar = TextBlock.Style.CREATOR;
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("title");
                            aVar.getClass();
                            TextBlock.Style b = TextBlock.Style.a.b(jSONObject3);
                            WebAction a2 = WebAction.a.a(jSONObject2.getJSONObject("action"), null);
                            if (a2 != null && string3 != null && string3.length() != 0) {
                                return new FooterBlock.FooterButton("accent_button", new TextBlock(string3, b), a2);
                            }
                        }
                    } else if (string.equals("text_and_button")) {
                        FooterBlock.FooterTextButton.CREATOR.getClass();
                        String D = f370.D(jSONObject2.getJSONObject("text"), "value");
                        if (D != null) {
                            JSONObject jSONObject4 = jSONObject2.getJSONObject("button");
                            WebAction a3 = WebAction.a.a(jSONObject4.optJSONObject("action"), null);
                            String D2 = f370.D(jSONObject4.getJSONObject("title"), "value");
                            if (D2 != null) {
                                return new FooterBlock.FooterTextButton("text_and_button", new TextBlock(D, new TextBlock.Style(WidgetColor.TEXT_SECONDARY, null, 2, null)), new ButtonBlock(D2, null, a3, ButtonBlock.Style.PRIMARY));
                            }
                        }
                    }
                }
            }
            return null;
        }

        public static BaseBlock d(JSONObject jSONObject) {
            String optString = jSONObject.optString("header_title");
            WebImage.a aVar = WebImage.CREATOR;
            JSONArray optJSONArray = jSONObject.optJSONArray("header_icon");
            aVar.getClass();
            WebImage a = WebImage.a.a(optJSONArray);
            String optString2 = jSONObject.optString("additional_header");
            HeaderBlock.a aVar2 = HeaderBlock.CREATOR;
            WebImageSize f = a.f(iah0.a(24));
            String str = f != null ? f.b : null;
            aVar2.getClass();
            return HeaderBlock.a.a(str, optString, optString2);
        }
    }

    public UniversalWidget(WidgetIds widgetIds, String str, String str2, QueueSettings queueSettings, WidgetSettings widgetSettings, double d, WebAction webAction, WebAction webAction2, String str3) {
        super(widgetIds, str, str2, SuperAppWidgetSize.REGULAR, queueSettings, widgetSettings, d, null, null, 384, null);
        this.j = str2;
        this.k = d;
        this.l = webAction;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public abstract WidgetIds d();

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final double f() {
        return this.k;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String r() {
        return this.j;
    }
}
