package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.AbstractC2082d0;
import com.facebook.react.R;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import com.twilio.voice.EventKeys;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lb.C5444x;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.C6835A;
import y0.z;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 =2\u00020\u0001:\u0004>?@=B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060 H\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u000eH\u0014¢\u0006\u0004\b&\u0010'J)\u0010)\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u0004\u0018\u00010+2\u0006\u0010\n\u001a\u00020\u0002H\u0004¢\u0006\u0004\b.\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u00101R\u001a\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u00106R4\u0010:\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010807j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u000108`98\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010/¨\u0006A"}, d2 = {"Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;", "Landroidx/customview/widget/a;", "Landroid/view/View;", "hostView", "", "originalFocus", "", "originalImportantForAccessibility", "<init>", "(Landroid/view/View;ZI)V", "host", "", "scheduleAccessibilityEventSender", "(Landroid/view/View;)V", "Ly0/z;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/View;Ly0/z;)V", "Landroid/view/accessibility/AccessibilityEvent;", "event", "onInitializeAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V", "action", "Landroid/os/Bundle;", "args", "performAccessibilityAction", "(Landroid/view/View;ILandroid/os/Bundle;)Z", "", C5444x.f55808b, "y", "getVirtualViewAt", "(FF)I", "", "virtualViewIds", "getVisibleVirtualViews", "(Ljava/util/List;)V", "virtualViewId", "node", "onPopulateNodeForVirtualView", "(ILy0/z;)V", "arguments", "onPerformActionForVirtualView", "(IILandroid/os/Bundle;)Z", "Ly0/A;", "getAccessibilityNodeProvider", "(Landroid/view/View;)Ly0/A;", "superGetAccessibilityNodeProvider", "Landroid/view/View;", "getHostView", "()Landroid/view/View;", "Landroid/os/Handler;", "accessibilityEventHandler", "Landroid/os/Handler;", "getAccessibilityEventHandler$annotations", "()V", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "accessibilityActionsMap", "Ljava/util/HashMap;", ViewProps.ACCESSIBILITY_LABELLED_BY, "Companion", "Role", "AccessibilityActionEvent", "AccessibilityRole", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactAccessibilityDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactAccessibilityDelegate.kt\ncom/facebook/react/uimanager/ReactAccessibilityDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1020:1\n1#2:1021\n384#3,7:1022\n*S KotlinDebug\n*F\n+ 1 ReactAccessibilityDelegate.kt\ncom/facebook/react/uimanager/ReactAccessibilityDelegate\n*L\n131#1:1022,7\n*E\n"})
/* loaded from: classes2.dex */
public class ReactAccessibilityDelegate extends androidx.customview.widget.a {
    private static final int SEND_EVENT = 1;

    @NotNull
    private static final String STATE_CHECKED = "checked";

    @NotNull
    private static final String STATE_DISABLED = "disabled";

    @NotNull
    private static final String STATE_SELECTED = "selected";

    @NotNull
    private static final String TAG = "ReactAccessibilityDelegate";
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;

    @NotNull
    public static final String TOP_ACCESSIBILITY_ACTION_EVENT = "topAccessibilityAction";

    @NotNull
    private static final String delimiter = ", ";
    private static final int delimiterLength = 2;

    @NotNull
    private final HashMap<Integer, String> accessibilityActionsMap;

    @NotNull
    private final Handler accessibilityEventHandler;

    @Nullable
    private View accessibilityLabelledBy;

    @NotNull
    private final View hostView;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, Integer> actionIdMap = MapsKt.mapOf(TuplesKt.to("activate", Integer.valueOf(z.a.f68223i.b())), TuplesKt.to("longpress", Integer.valueOf(z.a.f68224j.b())), TuplesKt.to("increment", Integer.valueOf(z.a.f68231q.b())), TuplesKt.to("decrement", Integer.valueOf(z.a.f68232r.b())), TuplesKt.to("expand", Integer.valueOf(z.a.f68237w.b())), TuplesKt.to(StackTraceHelper.COLLAPSE_KEY, Integer.valueOf(z.a.f68238x.b())));
    private static int customActionCounter = 1056964608;

    @NotNull
    private static final Map<String, Integer> customActionIdMap = new HashMap();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityActionEvent;", "Lcom/facebook/react/uimanager/events/Event;", "accessibilityEventData", "Lcom/facebook/react/bridge/WritableMap;", "surfaceId", "", "viewId", "<init>", "(Lcom/facebook/react/bridge/WritableMap;II)V", "getEventName", "", "getEventData", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccessibilityActionEvent extends Event<AccessibilityActionEvent> {

        @NotNull
        private final WritableMap accessibilityEventData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccessibilityActionEvent(@NotNull WritableMap accessibilityEventData, int i10, int i11) {
            super(i10, i11);
            Intrinsics.checkNotNullParameter(accessibilityEventData, "accessibilityEventData");
            this.accessibilityEventData = accessibilityEventData;
        }

        @Override // com.facebook.react.uimanager.events.Event
        @Nullable
        /* renamed from: getEventData, reason: from getter */
        public WritableMap getAccessibilityEventData() {
            return this.accessibilityEventData;
        }

        @Override // com.facebook.react.uimanager.events.Event
        @NotNull
        public String getEventName() {
            return ReactAccessibilityDelegate.TOP_ACCESSIBILITY_ACTION_EVENT;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b+\b\u0086\u0081\u0002\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001+B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006,"}, d2 = {"Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BUTTON", "DROPDOWNLIST", "TOGGLEBUTTON", "LINK", "SEARCH", "IMAGE", "IMAGEBUTTON", "KEYBOARDKEY", "TEXT", "ADJUSTABLE", "SUMMARY", "HEADER", "ALERT", "CHECKBOX", "COMBOBOX", "MENU", "MENUBAR", "MENUITEM", "PROGRESSBAR", "RADIO", "RADIOGROUP", "SCROLLBAR", "SPINBUTTON", "SWITCH", "TAB", "TABLIST", "TIMER", "LIST", "GRID", "PAGER", "SCROLLVIEW", "HORIZONTALSCROLLVIEW", "VIEWGROUP", "WEBVIEW", "DRAWERLAYOUT", "SLIDINGDRAWER", "ICONMENU", "TOOLBAR", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccessibilityRole {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccessibilityRole[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final AccessibilityRole NONE = new AccessibilityRole("NONE", 0);
        public static final AccessibilityRole BUTTON = new AccessibilityRole("BUTTON", 1);
        public static final AccessibilityRole DROPDOWNLIST = new AccessibilityRole("DROPDOWNLIST", 2);
        public static final AccessibilityRole TOGGLEBUTTON = new AccessibilityRole("TOGGLEBUTTON", 3);
        public static final AccessibilityRole LINK = new AccessibilityRole("LINK", 4);
        public static final AccessibilityRole SEARCH = new AccessibilityRole("SEARCH", 5);
        public static final AccessibilityRole IMAGE = new AccessibilityRole("IMAGE", 6);
        public static final AccessibilityRole IMAGEBUTTON = new AccessibilityRole("IMAGEBUTTON", 7);
        public static final AccessibilityRole KEYBOARDKEY = new AccessibilityRole("KEYBOARDKEY", 8);
        public static final AccessibilityRole TEXT = new AccessibilityRole("TEXT", 9);
        public static final AccessibilityRole ADJUSTABLE = new AccessibilityRole("ADJUSTABLE", 10);
        public static final AccessibilityRole SUMMARY = new AccessibilityRole("SUMMARY", 11);
        public static final AccessibilityRole HEADER = new AccessibilityRole("HEADER", 12);
        public static final AccessibilityRole ALERT = new AccessibilityRole("ALERT", 13);
        public static final AccessibilityRole CHECKBOX = new AccessibilityRole("CHECKBOX", 14);
        public static final AccessibilityRole COMBOBOX = new AccessibilityRole("COMBOBOX", 15);
        public static final AccessibilityRole MENU = new AccessibilityRole("MENU", 16);
        public static final AccessibilityRole MENUBAR = new AccessibilityRole("MENUBAR", 17);
        public static final AccessibilityRole MENUITEM = new AccessibilityRole("MENUITEM", 18);
        public static final AccessibilityRole PROGRESSBAR = new AccessibilityRole("PROGRESSBAR", 19);
        public static final AccessibilityRole RADIO = new AccessibilityRole("RADIO", 20);
        public static final AccessibilityRole RADIOGROUP = new AccessibilityRole("RADIOGROUP", 21);
        public static final AccessibilityRole SCROLLBAR = new AccessibilityRole("SCROLLBAR", 22);
        public static final AccessibilityRole SPINBUTTON = new AccessibilityRole("SPINBUTTON", 23);
        public static final AccessibilityRole SWITCH = new AccessibilityRole("SWITCH", 24);
        public static final AccessibilityRole TAB = new AccessibilityRole("TAB", 25);
        public static final AccessibilityRole TABLIST = new AccessibilityRole("TABLIST", 26);
        public static final AccessibilityRole TIMER = new AccessibilityRole("TIMER", 27);
        public static final AccessibilityRole LIST = new AccessibilityRole("LIST", 28);
        public static final AccessibilityRole GRID = new AccessibilityRole("GRID", 29);
        public static final AccessibilityRole PAGER = new AccessibilityRole("PAGER", 30);
        public static final AccessibilityRole SCROLLVIEW = new AccessibilityRole("SCROLLVIEW", 31);
        public static final AccessibilityRole HORIZONTALSCROLLVIEW = new AccessibilityRole("HORIZONTALSCROLLVIEW", 32);
        public static final AccessibilityRole VIEWGROUP = new AccessibilityRole("VIEWGROUP", 33);
        public static final AccessibilityRole WEBVIEW = new AccessibilityRole("WEBVIEW", 34);
        public static final AccessibilityRole DRAWERLAYOUT = new AccessibilityRole("DRAWERLAYOUT", 35);
        public static final AccessibilityRole SLIDINGDRAWER = new AccessibilityRole("SLIDINGDRAWER", 36);
        public static final AccessibilityRole ICONMENU = new AccessibilityRole("ICONMENU", 37);
        public static final AccessibilityRole TOOLBAR = new AccessibilityRole("TOOLBAR", 38);

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole$Companion;", "", "<init>", "()V", "getValue", "", ViewProps.ROLE, "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", "fromValue", EventKeys.VALUE_KEY, "fromRole", "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", "fromViewTag", "view", "Landroid/view/View;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                static {
                    int[] iArr = new int[AccessibilityRole.values().length];
                    try {
                        iArr[AccessibilityRole.BUTTON.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AccessibilityRole.DROPDOWNLIST.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AccessibilityRole.TOGGLEBUTTON.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[AccessibilityRole.SEARCH.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[AccessibilityRole.IMAGE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[AccessibilityRole.IMAGEBUTTON.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[AccessibilityRole.KEYBOARDKEY.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[AccessibilityRole.TEXT.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[AccessibilityRole.ADJUSTABLE.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[AccessibilityRole.CHECKBOX.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[AccessibilityRole.RADIO.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[AccessibilityRole.SPINBUTTON.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[AccessibilityRole.SWITCH.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[AccessibilityRole.LIST.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[AccessibilityRole.GRID.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[AccessibilityRole.SCROLLVIEW.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[AccessibilityRole.HORIZONTALSCROLLVIEW.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[AccessibilityRole.PAGER.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[AccessibilityRole.DRAWERLAYOUT.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[AccessibilityRole.SLIDINGDRAWER.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[AccessibilityRole.ICONMENU.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[AccessibilityRole.VIEWGROUP.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[AccessibilityRole.WEBVIEW.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[AccessibilityRole.NONE.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[AccessibilityRole.LINK.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[AccessibilityRole.SUMMARY.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[AccessibilityRole.HEADER.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[AccessibilityRole.ALERT.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[AccessibilityRole.COMBOBOX.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[AccessibilityRole.MENU.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[AccessibilityRole.MENUBAR.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[AccessibilityRole.MENUITEM.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[AccessibilityRole.PROGRESSBAR.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[AccessibilityRole.RADIOGROUP.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[AccessibilityRole.SCROLLBAR.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[AccessibilityRole.TAB.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[AccessibilityRole.TABLIST.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[AccessibilityRole.TIMER.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[AccessibilityRole.TOOLBAR.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[Role.values().length];
                    try {
                        iArr2[Role.ALERT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr2[Role.BUTTON.ordinal()] = 2;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr2[Role.CHECKBOX.ordinal()] = 3;
                    } catch (NoSuchFieldError unused42) {
                    }
                    try {
                        iArr2[Role.COMBOBOX.ordinal()] = 4;
                    } catch (NoSuchFieldError unused43) {
                    }
                    try {
                        iArr2[Role.GRID.ordinal()] = 5;
                    } catch (NoSuchFieldError unused44) {
                    }
                    try {
                        iArr2[Role.HEADING.ordinal()] = 6;
                    } catch (NoSuchFieldError unused45) {
                    }
                    try {
                        iArr2[Role.IMG.ordinal()] = 7;
                    } catch (NoSuchFieldError unused46) {
                    }
                    try {
                        iArr2[Role.LINK.ordinal()] = 8;
                    } catch (NoSuchFieldError unused47) {
                    }
                    try {
                        iArr2[Role.LIST.ordinal()] = 9;
                    } catch (NoSuchFieldError unused48) {
                    }
                    try {
                        iArr2[Role.MENU.ordinal()] = 10;
                    } catch (NoSuchFieldError unused49) {
                    }
                    try {
                        iArr2[Role.MENUBAR.ordinal()] = 11;
                    } catch (NoSuchFieldError unused50) {
                    }
                    try {
                        iArr2[Role.MENUITEM.ordinal()] = 12;
                    } catch (NoSuchFieldError unused51) {
                    }
                    try {
                        iArr2[Role.NONE.ordinal()] = 13;
                    } catch (NoSuchFieldError unused52) {
                    }
                    try {
                        iArr2[Role.PROGRESSBAR.ordinal()] = 14;
                    } catch (NoSuchFieldError unused53) {
                    }
                    try {
                        iArr2[Role.RADIO.ordinal()] = 15;
                    } catch (NoSuchFieldError unused54) {
                    }
                    try {
                        iArr2[Role.RADIOGROUP.ordinal()] = 16;
                    } catch (NoSuchFieldError unused55) {
                    }
                    try {
                        iArr2[Role.SCROLLBAR.ordinal()] = 17;
                    } catch (NoSuchFieldError unused56) {
                    }
                    try {
                        iArr2[Role.SEARCHBOX.ordinal()] = 18;
                    } catch (NoSuchFieldError unused57) {
                    }
                    try {
                        iArr2[Role.SLIDER.ordinal()] = 19;
                    } catch (NoSuchFieldError unused58) {
                    }
                    try {
                        iArr2[Role.SPINBUTTON.ordinal()] = 20;
                    } catch (NoSuchFieldError unused59) {
                    }
                    try {
                        iArr2[Role.SUMMARY.ordinal()] = 21;
                    } catch (NoSuchFieldError unused60) {
                    }
                    try {
                        iArr2[Role.SWITCH.ordinal()] = 22;
                    } catch (NoSuchFieldError unused61) {
                    }
                    try {
                        iArr2[Role.TAB.ordinal()] = 23;
                    } catch (NoSuchFieldError unused62) {
                    }
                    try {
                        iArr2[Role.TABLIST.ordinal()] = 24;
                    } catch (NoSuchFieldError unused63) {
                    }
                    try {
                        iArr2[Role.TIMER.ordinal()] = 25;
                    } catch (NoSuchFieldError unused64) {
                    }
                    try {
                        iArr2[Role.TOOLBAR.ordinal()] = 26;
                    } catch (NoSuchFieldError unused65) {
                    }
                    $EnumSwitchMapping$1 = iArr2;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @Nullable
            public final AccessibilityRole fromRole(@NotNull Role role) {
                Intrinsics.checkNotNullParameter(role, "role");
                switch (WhenMappings.$EnumSwitchMapping$1[role.ordinal()]) {
                    case 1:
                        return AccessibilityRole.ALERT;
                    case 2:
                        return AccessibilityRole.BUTTON;
                    case 3:
                        return AccessibilityRole.CHECKBOX;
                    case 4:
                        return AccessibilityRole.COMBOBOX;
                    case 5:
                        return AccessibilityRole.GRID;
                    case 6:
                        return AccessibilityRole.HEADER;
                    case 7:
                        return AccessibilityRole.IMAGE;
                    case 8:
                        return AccessibilityRole.LINK;
                    case 9:
                        return AccessibilityRole.LIST;
                    case 10:
                        return AccessibilityRole.MENU;
                    case 11:
                        return AccessibilityRole.MENUBAR;
                    case 12:
                        return AccessibilityRole.MENUITEM;
                    case 13:
                        return AccessibilityRole.NONE;
                    case 14:
                        return AccessibilityRole.PROGRESSBAR;
                    case 15:
                        return AccessibilityRole.RADIO;
                    case 16:
                        return AccessibilityRole.RADIOGROUP;
                    case 17:
                        return AccessibilityRole.SCROLLBAR;
                    case 18:
                        return AccessibilityRole.SEARCH;
                    case 19:
                        return AccessibilityRole.ADJUSTABLE;
                    case 20:
                        return AccessibilityRole.SPINBUTTON;
                    case 21:
                        return AccessibilityRole.SUMMARY;
                    case 22:
                        return AccessibilityRole.SWITCH;
                    case 23:
                        return AccessibilityRole.TAB;
                    case 24:
                        return AccessibilityRole.TABLIST;
                    case 25:
                        return AccessibilityRole.TIMER;
                    case 26:
                        return AccessibilityRole.TOOLBAR;
                    default:
                        return null;
                }
            }

            @JvmStatic
            @NotNull
            public final AccessibilityRole fromValue(@Nullable String value) {
                if (value == null) {
                    return AccessibilityRole.NONE;
                }
                for (AccessibilityRole accessibilityRole : AccessibilityRole.getEntries()) {
                    if (StringsKt.equals(accessibilityRole.name(), value, true)) {
                        return accessibilityRole;
                    }
                }
                throw new IllegalArgumentException("Invalid accessibility role value: " + value);
            }

            @JvmStatic
            @Nullable
            public final AccessibilityRole fromViewTag(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                Role role = (Role) view.getTag(R.id.role);
                return role != null ? fromRole(role) : (AccessibilityRole) view.getTag(R.id.accessibility_role);
            }

            @JvmStatic
            @NotNull
            public final String getValue(@NotNull AccessibilityRole role) {
                Intrinsics.checkNotNullParameter(role, "role");
                switch (WhenMappings.$EnumSwitchMapping$0[role.ordinal()]) {
                    case 1:
                        return "android.widget.Button";
                    case 2:
                        return "android.widget.Spinner";
                    case 3:
                        return "android.widget.ToggleButton";
                    case 4:
                        return "android.widget.EditText";
                    case 5:
                        return "android.widget.ImageView";
                    case 6:
                        return "android.widget.ImageButton";
                    case 7:
                        return "android.inputmethodservice.Keyboard$Key";
                    case 8:
                        return "android.widget.TextView";
                    case 9:
                        return "android.widget.SeekBar";
                    case 10:
                        return "android.widget.CheckBox";
                    case 11:
                        return "android.widget.RadioButton";
                    case 12:
                        return "android.widget.SpinButton";
                    case 13:
                        return "android.widget.Switch";
                    case 14:
                        return "android.widget.AbsListView";
                    case 15:
                        return "android.widget.GridView";
                    case 16:
                        return "android.widget.ScrollView";
                    case 17:
                        return "android.widget.HorizontalScrollView";
                    case 18:
                        return "androidx.viewpager.widget.ViewPager";
                    case 19:
                        return "androidx.drawerlayout.widget.DrawerLayout";
                    case 20:
                        return "android.widget.SlidingDrawer";
                    case 21:
                        return "com.android.internal.view.menu.IconMenuView";
                    case 22:
                        return "android.view.ViewGroup";
                    case 23:
                        return "android.webkit.WebView";
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                        return "android.view.View";
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ AccessibilityRole[] $values() {
            return new AccessibilityRole[]{NONE, BUTTON, DROPDOWNLIST, TOGGLEBUTTON, LINK, SEARCH, IMAGE, IMAGEBUTTON, KEYBOARDKEY, TEXT, ADJUSTABLE, SUMMARY, HEADER, ALERT, CHECKBOX, COMBOBOX, MENU, MENUBAR, MENUITEM, PROGRESSBAR, RADIO, RADIOGROUP, SCROLLBAR, SPINBUTTON, SWITCH, TAB, TABLIST, TIMER, LIST, GRID, PAGER, SCROLLVIEW, HORIZONTALSCROLLVIEW, VIEWGROUP, WEBVIEW, DRAWERLAYOUT, SLIDINGDRAWER, ICONMENU, TOOLBAR};
        }

        static {
            AccessibilityRole[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        private AccessibilityRole(String str, int i10) {
        }

        @JvmStatic
        @Nullable
        public static final AccessibilityRole fromRole(@NotNull Role role) {
            return INSTANCE.fromRole(role);
        }

        @JvmStatic
        @NotNull
        public static final AccessibilityRole fromValue(@Nullable String str) {
            return INSTANCE.fromValue(str);
        }

        @JvmStatic
        @Nullable
        public static final AccessibilityRole fromViewTag(@NotNull View view) {
            return INSTANCE.fromViewTag(view);
        }

        @NotNull
        public static EnumEntries<AccessibilityRole> getEntries() {
            return $ENTRIES;
        }

        @JvmStatic
        @NotNull
        public static final String getValue(@NotNull AccessibilityRole accessibilityRole) {
            return INSTANCE.getValue(accessibilityRole);
        }

        public static AccessibilityRole valueOf(String str) {
            return (AccessibilityRole) Enum.valueOf(AccessibilityRole.class, str);
        }

        public static AccessibilityRole[] values() {
            return (AccessibilityRole[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ)\u0010\"\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b&\u0010\u000eJ#\u0010'\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b'\u0010%J\u0019\u0010(\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b(\u0010\u000eJ#\u0010)\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b)\u0010%J\u0019\u0010*\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b*\u0010\u000eJ\u001b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b+\u0010,J#\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u00101R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0018028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00101R\u0016\u00106\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u00109\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0018088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00104R\u0014\u0010:\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00107R\u0014\u0010;\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u00107R\u0014\u0010<\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00101R\u0014\u0010=\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u00107R\u0014\u0010>\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u00101R\u0014\u0010?\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u00101R\u0014\u0010@\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u00101¨\u0006A"}, d2 = {"Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;", "", "<init>", "()V", "Ly0/z;", "info", "Lcom/facebook/react/bridge/ReadableMap;", ViewProps.ACCESSIBILITY_STATE, "", "setState", "(Ly0/z;Lcom/facebook/react/bridge/ReadableMap;)V", "node", "", "hasStateDescription", "(Ly0/z;)Z", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "removeFinalDelimiter", "(Ljava/lang/StringBuilder;)Ljava/lang/String;", "Landroid/view/View;", "view", "originalFocus", "", "originalImportantForAccessibility", "setDelegate", "(Landroid/view/View;ZI)V", "resetDelegate", "nodeInfo", "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", ViewProps.ROLE, "Landroid/content/Context;", "context", "setRole", "(Ly0/z;Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;Landroid/content/Context;)V", "hasNonActionableSpeakingDescendants", "(Ly0/z;Landroid/view/View;)Z", "hasValidRangeInfo", "isSpeakingNode", "hasText", "isAccessibilityFocusable", "isActionableForAccessibility", "createNodeInfoFromView", "(Landroid/view/View;)Ly0/z;", "", "getTalkbackDescription", "(Landroid/view/View;Ly0/z;)Ljava/lang/CharSequence;", "TOP_ACCESSIBILITY_ACTION_EVENT", "Ljava/lang/String;", "", "actionIdMap", "Ljava/util/Map;", "TAG", "customActionCounter", "I", "", "customActionIdMap", "TIMEOUT_SEND_ACCESSIBILITY_EVENT", "SEND_EVENT", "delimiter", "delimiterLength", "STATE_DISABLED", "STATE_SELECTED", "STATE_CHECKED", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nReactAccessibilityDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactAccessibilityDelegate.kt\ncom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1020:1\n1761#2,3:1021\n*S KotlinDebug\n*F\n+ 1 ReactAccessibilityDelegate.kt\ncom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion\n*L\n894#1:1021,3\n*E\n"})
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AccessibilityRole.values().length];
                try {
                    iArr[AccessibilityRole.LINK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AccessibilityRole.IMAGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AccessibilityRole.IMAGEBUTTON.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AccessibilityRole.BUTTON.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AccessibilityRole.TOGGLEBUTTON.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AccessibilityRole.SUMMARY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AccessibilityRole.HEADER.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AccessibilityRole.ALERT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[AccessibilityRole.COMBOBOX.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[AccessibilityRole.MENU.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[AccessibilityRole.MENUBAR.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[AccessibilityRole.MENUITEM.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[AccessibilityRole.PROGRESSBAR.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[AccessibilityRole.RADIOGROUP.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[AccessibilityRole.SCROLLBAR.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[AccessibilityRole.SPINBUTTON.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[AccessibilityRole.TAB.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[AccessibilityRole.TABLIST.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[AccessibilityRole.TIMER.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[AccessibilityRole.TOOLBAR.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean hasStateDescription(y0.z node) {
            if (node == null) {
                return false;
            }
            CharSequence H10 = node.H();
            return !(H10 == null || H10.length() == 0) || node.R() || hasValidRangeInfo(node);
        }

        private final String removeFinalDelimiter(StringBuilder builder) {
            int length = builder.length();
            if (length > 0) {
                builder.delete(length - 2, length);
            }
            String sb2 = builder.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            return sb2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setState(y0.z info, ReadableMap accessibilityState) {
            ReadableMapKeySetIterator keySetIterator = accessibilityState.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                Dynamic dynamic = accessibilityState.getDynamic(nextKey);
                if (Intrinsics.areEqual(nextKey, ReactAccessibilityDelegate.STATE_SELECTED) && dynamic.getType() == ReadableType.Boolean) {
                    info.U0(dynamic.asBoolean());
                } else if (Intrinsics.areEqual(nextKey, ReactAccessibilityDelegate.STATE_DISABLED) && dynamic.getType() == ReadableType.Boolean) {
                    info.C0(!dynamic.asBoolean());
                } else if (Intrinsics.areEqual(nextKey, ReactAccessibilityDelegate.STATE_CHECKED) && dynamic.getType() == ReadableType.Boolean) {
                    boolean asBoolean = dynamic.asBoolean();
                    info.u0(true);
                    info.v0(asBoolean);
                }
            }
        }

        @JvmStatic
        @Nullable
        public final y0.z createNodeInfoFromView(@Nullable View view) {
            if (view == null) {
                return null;
            }
            y0.z j02 = y0.z.j0();
            try {
                AbstractC2082d0.Y(view, j02);
                return j02;
            } catch (NullPointerException unused) {
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final CharSequence getTalkbackDescription(@NotNull View view, @Nullable y0.z info) {
            Intrinsics.checkNotNullParameter(view, "view");
            y0.z createNodeInfoFromView = info == null ? createNodeInfoFromView(view) : y0.z.l0(info);
            if (createNodeInfoFromView == null) {
                return null;
            }
            CharSequence w10 = createNodeInfoFromView.w();
            CharSequence J10 = createNodeInfoFromView.J();
            boolean z10 = J10 == null || J10.length() == 0;
            boolean z11 = view instanceof EditText;
            StringBuilder sb2 = new StringBuilder();
            if (w10 != null && w10.length() != 0 && (!z11 || z10)) {
                sb2.append(w10);
                return sb2;
            }
            if (!z10) {
                sb2.append(J10);
                return sb2;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                y0.z j02 = y0.z.j0();
                AbstractC2082d0.Y(childAt, j02);
                if (isSpeakingNode(j02, childAt) && !isAccessibilityFocusable(j02, childAt)) {
                    Intrinsics.checkNotNull(childAt);
                    CharSequence talkbackDescription = getTalkbackDescription(childAt, null);
                    if (talkbackDescription != null && talkbackDescription.length() != 0) {
                        sb3.append(((Object) talkbackDescription) + ReactAccessibilityDelegate.delimiter);
                    }
                }
            }
            return removeFinalDelimiter(sb3);
        }

        @JvmStatic
        public final boolean hasNonActionableSpeakingDescendants(@Nullable y0.z node, @Nullable View view) {
            if (node != null && view != null && (view instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt != null) {
                        y0.z j02 = y0.z.j0();
                        AbstractC2082d0.Y(childAt, j02);
                        if (j02.i0() && !isAccessibilityFocusable(j02, childAt) && isSpeakingNode(j02, childAt)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @JvmStatic
        public final boolean hasText(@Nullable y0.z node) {
            if (node == null || node.u() != null) {
                return false;
            }
            CharSequence J10 = node.J();
            if (J10 != null && J10.length() != 0) {
                return true;
            }
            CharSequence w10 = node.w();
            if (w10 != null && w10.length() != 0) {
                return true;
            }
            CharSequence B10 = node.B();
            return (B10 == null || B10.length() == 0) ? false : true;
        }

        @JvmStatic
        public final boolean hasValidRangeInfo(@Nullable y0.z node) {
            z.h F10;
            if (node == null || (F10 = node.F()) == null) {
                return false;
            }
            float b10 = F10.b();
            float c10 = F10.c();
            float a10 = F10.a();
            return b10 - c10 > 0.0f && a10 >= c10 && a10 <= b10;
        }

        @JvmStatic
        public final boolean isAccessibilityFocusable(@Nullable y0.z node, @Nullable View view) {
            if (node == null || view == null || !node.i0()) {
                return false;
            }
            return node.d0() || isActionableForAccessibility(node);
        }

        @JvmStatic
        public final boolean isActionableForAccessibility(@Nullable y0.z node) {
            if (node == null) {
                return false;
            }
            if (node.T() || node.b0() || node.X()) {
                return true;
            }
            List i10 = node.i();
            Intrinsics.checkNotNullExpressionValue(i10, "getActionList(...)");
            List<z.a> list = i10;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (z.a aVar : list) {
                if (Intrinsics.areEqual(aVar, z.a.f68223i) || Intrinsics.areEqual(aVar, z.a.f68224j) || Intrinsics.areEqual(aVar, z.a.f68219e)) {
                    return true;
                }
            }
            return false;
        }

        @JvmStatic
        public final boolean isSpeakingNode(@Nullable y0.z node, @Nullable View view) {
            int x10;
            if (node == null || view == null || (x10 = AbstractC2082d0.x(view)) == 4 || (x10 == 2 && node.r() <= 0)) {
                return false;
            }
            return hasText(node) || hasStateDescription(node) || node.R() || hasNonActionableSpeakingDescendants(node, view);
        }

        @JvmStatic
        public final void resetDelegate(@NotNull View view, boolean originalFocus, int originalImportantForAccessibility) {
            Intrinsics.checkNotNullParameter(view, "view");
            AbstractC2082d0.l0(view, new ReactAccessibilityDelegate(view, originalFocus, originalImportantForAccessibility));
        }

        @JvmStatic
        public final void setDelegate(@NotNull View view, boolean originalFocus, int originalImportantForAccessibility) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (AbstractC2082d0.N(view)) {
                return;
            }
            if (view.getTag(R.id.accessibility_role) == null && view.getTag(R.id.accessibility_state) == null && view.getTag(R.id.accessibility_actions) == null && view.getTag(R.id.react_test_id) == null && view.getTag(R.id.accessibility_collection_item) == null && view.getTag(R.id.accessibility_links) == null && view.getTag(R.id.role) == null) {
                return;
            }
            AbstractC2082d0.l0(view, new ReactAccessibilityDelegate(view, originalFocus, originalImportantForAccessibility));
        }

        @JvmStatic
        public final void setRole(@NotNull y0.z nodeInfo, @Nullable AccessibilityRole role, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(nodeInfo, "nodeInfo");
            Intrinsics.checkNotNullParameter(context, "context");
            if (role == null) {
                role = AccessibilityRole.NONE;
            }
            nodeInfo.w0(AccessibilityRole.INSTANCE.getValue(role));
            switch (WhenMappings.$EnumSwitchMapping$0[role.ordinal()]) {
                case 1:
                    nodeInfo.R0(context.getString(R.string.link_description));
                    break;
                case 2:
                    nodeInfo.R0(context.getString(R.string.image_description));
                    break;
                case 3:
                    nodeInfo.R0(context.getString(R.string.imagebutton_description));
                    nodeInfo.x0(true);
                    break;
                case 4:
                    nodeInfo.x0(true);
                    break;
                case 5:
                    nodeInfo.x0(true);
                    nodeInfo.u0(true);
                    break;
                case 6:
                    nodeInfo.R0(context.getString(R.string.summary_description));
                    break;
                case 7:
                    nodeInfo.H0(true);
                    break;
                case 8:
                    nodeInfo.R0(context.getString(R.string.alert_description));
                    break;
                case 9:
                    nodeInfo.R0(context.getString(R.string.combobox_description));
                    break;
                case 10:
                    nodeInfo.R0(context.getString(R.string.menu_description));
                    break;
                case 11:
                    nodeInfo.R0(context.getString(R.string.menubar_description));
                    break;
                case 12:
                    nodeInfo.R0(context.getString(R.string.menuitem_description));
                    break;
                case 13:
                    nodeInfo.R0(context.getString(R.string.progressbar_description));
                    break;
                case 14:
                    nodeInfo.R0(context.getString(R.string.radiogroup_description));
                    break;
                case 15:
                    nodeInfo.R0(context.getString(R.string.scrollbar_description));
                    break;
                case 16:
                    nodeInfo.R0(context.getString(R.string.spinbutton_description));
                    break;
                case 17:
                    nodeInfo.R0(context.getString(R.string.rn_tab_description));
                    break;
                case 18:
                    nodeInfo.R0(context.getString(R.string.tablist_description));
                    break;
                case 19:
                    nodeInfo.R0(context.getString(R.string.timer_description));
                    break;
                case 20:
                    nodeInfo.R0(context.getString(R.string.toolbar_description));
                    break;
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\bE\b\u0086\u0081\u0002\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001EB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bD¨\u0006F"}, d2 = {"Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", "", "<init>", "(Ljava/lang/String;I)V", "ALERT", "ALERTDIALOG", "APPLICATION", "ARTICLE", "BANNER", "BUTTON", "CELL", "CHECKBOX", "COLUMNHEADER", "COMBOBOX", "COMPLEMENTARY", "CONTENTINFO", "DEFINITION", "DIALOG", "DIRECTORY", "DOCUMENT", "FEED", "FIGURE", "FORM", "GRID", "GROUP", "HEADING", "IMG", "LINK", "LIST", "LISTITEM", "LOG", "MAIN", "MARQUEE", "MATH", "MENU", "MENUBAR", "MENUITEM", "METER", "NAVIGATION", "NONE", "NOTE", "OPTION", "PRESENTATION", "PROGRESSBAR", "RADIO", "RADIOGROUP", "REGION", "ROW", "ROWGROUP", "ROWHEADER", "SCROLLBAR", "SEARCHBOX", "SEPARATOR", "SLIDER", "SPINBUTTON", "STATUS", "SUMMARY", "SWITCH", "TAB", "TABLE", "TABLIST", "TABPANEL", "TERM", "TIMER", "TOOLBAR", "TOOLTIP", "TREE", "TREEGRID", "TREEITEM", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Role {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Role[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final Role ALERT = new Role("ALERT", 0);
        public static final Role ALERTDIALOG = new Role("ALERTDIALOG", 1);
        public static final Role APPLICATION = new Role("APPLICATION", 2);
        public static final Role ARTICLE = new Role("ARTICLE", 3);
        public static final Role BANNER = new Role("BANNER", 4);
        public static final Role BUTTON = new Role("BUTTON", 5);
        public static final Role CELL = new Role("CELL", 6);
        public static final Role CHECKBOX = new Role("CHECKBOX", 7);
        public static final Role COLUMNHEADER = new Role("COLUMNHEADER", 8);
        public static final Role COMBOBOX = new Role("COMBOBOX", 9);
        public static final Role COMPLEMENTARY = new Role("COMPLEMENTARY", 10);
        public static final Role CONTENTINFO = new Role("CONTENTINFO", 11);
        public static final Role DEFINITION = new Role("DEFINITION", 12);
        public static final Role DIALOG = new Role("DIALOG", 13);
        public static final Role DIRECTORY = new Role("DIRECTORY", 14);
        public static final Role DOCUMENT = new Role("DOCUMENT", 15);
        public static final Role FEED = new Role("FEED", 16);
        public static final Role FIGURE = new Role("FIGURE", 17);
        public static final Role FORM = new Role("FORM", 18);
        public static final Role GRID = new Role("GRID", 19);
        public static final Role GROUP = new Role("GROUP", 20);
        public static final Role HEADING = new Role("HEADING", 21);
        public static final Role IMG = new Role("IMG", 22);
        public static final Role LINK = new Role("LINK", 23);
        public static final Role LIST = new Role("LIST", 24);
        public static final Role LISTITEM = new Role("LISTITEM", 25);
        public static final Role LOG = new Role("LOG", 26);
        public static final Role MAIN = new Role("MAIN", 27);
        public static final Role MARQUEE = new Role("MARQUEE", 28);
        public static final Role MATH = new Role("MATH", 29);
        public static final Role MENU = new Role("MENU", 30);
        public static final Role MENUBAR = new Role("MENUBAR", 31);
        public static final Role MENUITEM = new Role("MENUITEM", 32);
        public static final Role METER = new Role("METER", 33);
        public static final Role NAVIGATION = new Role("NAVIGATION", 34);
        public static final Role NONE = new Role("NONE", 35);
        public static final Role NOTE = new Role("NOTE", 36);
        public static final Role OPTION = new Role("OPTION", 37);
        public static final Role PRESENTATION = new Role("PRESENTATION", 38);
        public static final Role PROGRESSBAR = new Role("PROGRESSBAR", 39);
        public static final Role RADIO = new Role("RADIO", 40);
        public static final Role RADIOGROUP = new Role("RADIOGROUP", 41);
        public static final Role REGION = new Role("REGION", 42);
        public static final Role ROW = new Role("ROW", 43);
        public static final Role ROWGROUP = new Role("ROWGROUP", 44);
        public static final Role ROWHEADER = new Role("ROWHEADER", 45);
        public static final Role SCROLLBAR = new Role("SCROLLBAR", 46);
        public static final Role SEARCHBOX = new Role("SEARCHBOX", 47);
        public static final Role SEPARATOR = new Role("SEPARATOR", 48);
        public static final Role SLIDER = new Role("SLIDER", 49);
        public static final Role SPINBUTTON = new Role("SPINBUTTON", 50);
        public static final Role STATUS = new Role("STATUS", 51);
        public static final Role SUMMARY = new Role("SUMMARY", 52);
        public static final Role SWITCH = new Role("SWITCH", 53);
        public static final Role TAB = new Role("TAB", 54);
        public static final Role TABLE = new Role("TABLE", 55);
        public static final Role TABLIST = new Role("TABLIST", 56);
        public static final Role TABPANEL = new Role("TABPANEL", 57);
        public static final Role TERM = new Role("TERM", 58);
        public static final Role TIMER = new Role("TIMER", 59);
        public static final Role TOOLBAR = new Role("TOOLBAR", 60);
        public static final Role TOOLTIP = new Role("TOOLTIP", 61);
        public static final Role TREE = new Role("TREE", 62);
        public static final Role TREEGRID = new Role("TREEGRID", 63);
        public static final Role TREEITEM = new Role("TREEITEM", 64);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role$Companion;", "", "<init>", "()V", "fromValue", "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", EventKeys.VALUE_KEY, "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @Nullable
            public final Role fromValue(@Nullable String value) {
                for (Role role : Role.getEntries()) {
                    if (StringsKt.equals(role.name(), value, true)) {
                        return role;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Role[] $values() {
            return new Role[]{ALERT, ALERTDIALOG, APPLICATION, ARTICLE, BANNER, BUTTON, CELL, CHECKBOX, COLUMNHEADER, COMBOBOX, COMPLEMENTARY, CONTENTINFO, DEFINITION, DIALOG, DIRECTORY, DOCUMENT, FEED, FIGURE, FORM, GRID, GROUP, HEADING, IMG, LINK, LIST, LISTITEM, LOG, MAIN, MARQUEE, MATH, MENU, MENUBAR, MENUITEM, METER, NAVIGATION, NONE, NOTE, OPTION, PRESENTATION, PROGRESSBAR, RADIO, RADIOGROUP, REGION, ROW, ROWGROUP, ROWHEADER, SCROLLBAR, SEARCHBOX, SEPARATOR, SLIDER, SPINBUTTON, STATUS, SUMMARY, SWITCH, TAB, TABLE, TABLIST, TABPANEL, TERM, TIMER, TOOLBAR, TOOLTIP, TREE, TREEGRID, TREEITEM};
        }

        static {
            Role[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        private Role(String str, int i10) {
        }

        @JvmStatic
        @Nullable
        public static final Role fromValue(@Nullable String str) {
            return INSTANCE.fromValue(str);
        }

        @NotNull
        public static EnumEntries<Role> getEntries() {
            return $ENTRIES;
        }

        public static Role valueOf(String str) {
            return (Role) Enum.valueOf(Role.class, str);
        }

        public static Role[] values() {
            return (Role[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactAccessibilityDelegate(@NotNull View hostView, boolean z10, int i10) {
        super(hostView);
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.hostView = hostView;
        this.accessibilityEventHandler = new Handler() { // from class: com.facebook.react.uimanager.ReactAccessibilityDelegate$accessibilityEventHandler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                View view = (View) msg.obj;
                if (view != null) {
                    view.sendAccessibilityEvent(4);
                }
            }
        };
        this.accessibilityActionsMap = new HashMap<>();
        hostView.setFocusable(z10);
        hostView.setImportantForAccessibility(i10);
    }

    @JvmStatic
    @Nullable
    public static final y0.z createNodeInfoFromView(@Nullable View view) {
        return INSTANCE.createNodeInfoFromView(view);
    }

    private static /* synthetic */ void getAccessibilityEventHandler$annotations() {
    }

    @JvmStatic
    @Nullable
    public static final CharSequence getTalkbackDescription(@NotNull View view, @Nullable y0.z zVar) {
        return INSTANCE.getTalkbackDescription(view, zVar);
    }

    @JvmStatic
    public static final boolean hasNonActionableSpeakingDescendants(@Nullable y0.z zVar, @Nullable View view) {
        return INSTANCE.hasNonActionableSpeakingDescendants(zVar, view);
    }

    @JvmStatic
    public static final boolean hasText(@Nullable y0.z zVar) {
        return INSTANCE.hasText(zVar);
    }

    @JvmStatic
    public static final boolean hasValidRangeInfo(@Nullable y0.z zVar) {
        return INSTANCE.hasValidRangeInfo(zVar);
    }

    @JvmStatic
    public static final boolean isAccessibilityFocusable(@Nullable y0.z zVar, @Nullable View view) {
        return INSTANCE.isAccessibilityFocusable(zVar, view);
    }

    @JvmStatic
    public static final boolean isActionableForAccessibility(@Nullable y0.z zVar) {
        return INSTANCE.isActionableForAccessibility(zVar);
    }

    @JvmStatic
    public static final boolean isSpeakingNode(@Nullable y0.z zVar, @Nullable View view) {
        return INSTANCE.isSpeakingNode(zVar, view);
    }

    @JvmStatic
    public static final void resetDelegate(@NotNull View view, boolean z10, int i10) {
        INSTANCE.resetDelegate(view, z10, i10);
    }

    private final void scheduleAccessibilityEventSender(View host) {
        if (this.accessibilityEventHandler.hasMessages(1, host)) {
            this.accessibilityEventHandler.removeMessages(1, host);
        }
        Message obtainMessage = this.accessibilityEventHandler.obtainMessage(1, host);
        Intrinsics.checkNotNullExpressionValue(obtainMessage, "obtainMessage(...)");
        this.accessibilityEventHandler.sendMessageDelayed(obtainMessage, 200L);
    }

    @JvmStatic
    public static final void setDelegate(@NotNull View view, boolean z10, int i10) {
        INSTANCE.setDelegate(view, z10, i10);
    }

    @JvmStatic
    public static final void setRole(@NotNull y0.z zVar, @Nullable AccessibilityRole accessibilityRole, @NotNull Context context) {
        INSTANCE.setRole(zVar, accessibilityRole, context);
    }

    @Override // androidx.customview.widget.a, androidx.core.view.C2075a
    @Nullable
    public C6835A getAccessibilityNodeProvider(@NotNull View host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return null;
    }

    @NotNull
    public final View getHostView() {
        return this.hostView;
    }

    @Override // androidx.customview.widget.a
    public int getVirtualViewAt(float x10, float y10) {
        return Integer.MIN_VALUE;
    }

    @Override // androidx.customview.widget.a
    public void getVisibleVirtualViews(@NotNull List<Integer> virtualViewIds) {
        Intrinsics.checkNotNullParameter(virtualViewIds, "virtualViewIds");
    }

    @Override // androidx.customview.widget.a, androidx.core.view.C2075a
    public void onInitializeAccessibilityEvent(@NotNull View host, @NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        super.onInitializeAccessibilityEvent(host, event);
        ReadableMap readableMap = (ReadableMap) host.getTag(R.id.accessibility_value);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            ReadableType type = dynamic.getType();
            ReadableType readableType = ReadableType.Number;
            if (type == readableType && dynamic2.getType() == readableType && dynamic3.getType() == readableType) {
                int asInt = dynamic.asInt();
                int asInt2 = dynamic2.asInt();
                int asInt3 = dynamic3.asInt();
                if (asInt3 <= asInt || asInt2 < asInt || asInt3 < asInt2) {
                    return;
                }
                event.setItemCount(asInt3 - asInt);
                event.setCurrentItemIndex(asInt2);
            }
        }
    }

    @Override // androidx.customview.widget.a, androidx.core.view.C2075a
    public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull y0.z info) {
        int intValue;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (host.getTag(R.id.accessibility_state_expanded) != null) {
            Object tag = host.getTag(R.id.accessibility_state_expanded);
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Boolean");
            info.a(((Boolean) tag).booleanValue() ? PKIFailureInfo.signerNotTrusted : PKIFailureInfo.transactionIdInUse);
        }
        AccessibilityRole fromViewTag = AccessibilityRole.INSTANCE.fromViewTag(host);
        String str = (String) host.getTag(R.id.accessibility_hint);
        if (fromViewTag != null) {
            Companion companion = INSTANCE;
            Context context = host.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            companion.setRole(info, fromViewTag, context);
        }
        if (str != null) {
            info.a1(str);
        }
        Object tag2 = host.getTag(R.id.labelled_by);
        if (tag2 != null) {
            View rootView = host.getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
            View findView = ReactFindViewUtil.findView(rootView, (String) tag2);
            this.accessibilityLabelledBy = findView;
            if (findView != null) {
                info.K0(findView);
            }
        }
        ReadableMap readableMap = (ReadableMap) host.getTag(R.id.accessibility_state);
        if (readableMap != null) {
            INSTANCE.setState(info, readableMap);
        }
        ReadableArray readableArray = (ReadableArray) host.getTag(R.id.accessibility_actions);
        ReadableMap readableMap2 = (ReadableMap) host.getTag(R.id.accessibility_collection_item);
        if (readableMap2 != null) {
            info.z0(z.g.a(readableMap2.getInt("rowIndex"), readableMap2.getInt("rowSpan"), readableMap2.getInt("columnIndex"), readableMap2.getInt("columnSpan"), readableMap2.getBoolean("heading")));
        }
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = readableArray.getMap(i10);
                if (map == null || !map.hasKey("name")) {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
                String string = map.getString("name");
                String str2 = map.hasKey(AnnotatedPrivateKey.LABEL) ? (String) S7.a.c(map.getString(AnnotatedPrivateKey.LABEL)) : "";
                Integer num = actionIdMap.get(string);
                if (num != null) {
                    intValue = num.intValue();
                } else {
                    Map<String, Integer> map2 = customActionIdMap;
                    Integer num2 = map2.get(string);
                    if (num2 == null) {
                        int i11 = customActionCounter;
                        customActionCounter = i11 + 1;
                        num2 = Integer.valueOf(i11);
                        map2.put(string, num2);
                    }
                    intValue = num2.intValue();
                }
                this.accessibilityActionsMap.put(Integer.valueOf(intValue), string);
                info.b(new z.a(intValue, str2));
            }
        }
        ReadableMap readableMap3 = (ReadableMap) host.getTag(R.id.accessibility_value);
        if (readableMap3 != null && readableMap3.hasKey("min") && readableMap3.hasKey("now") && readableMap3.hasKey("max")) {
            Dynamic dynamic = readableMap3.getDynamic("min");
            Dynamic dynamic2 = readableMap3.getDynamic("now");
            Dynamic dynamic3 = readableMap3.getDynamic("max");
            ReadableType type = dynamic.getType();
            ReadableType readableType = ReadableType.Number;
            if (type == readableType && dynamic2.getType() == readableType && dynamic3.getType() == readableType) {
                int asInt = dynamic.asInt();
                int asInt2 = dynamic2.asInt();
                int asInt3 = dynamic3.asInt();
                if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                    info.Q0(z.h.d(0, asInt, asInt3, asInt2));
                }
            }
        }
        String str3 = (String) host.getTag(R.id.react_test_id);
        if (str3 != null) {
            info.c1(str3);
        }
        CharSequence w10 = info.w();
        boolean z10 = w10 == null || w10.length() == 0;
        CharSequence J10 = info.J();
        boolean z11 = z10 && (J10 == null || J10.length() == 0);
        boolean z12 = (readableArray == null && readableMap == null && tag2 == null && fromViewTag == null) ? false : true;
        if (z11 && z12) {
            info.A0(INSTANCE.getTalkbackDescription(host, info));
        }
    }

    @Override // androidx.customview.widget.a
    public boolean onPerformActionForVirtualView(int virtualViewId, int action, @Nullable Bundle arguments) {
        return false;
    }

    @Override // androidx.customview.widget.a
    public void onPopulateNodeForVirtualView(int virtualViewId, @NotNull y0.z node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.A0("");
        node.s0(new Rect(0, 0, 1, 1));
    }

    @Override // androidx.core.view.C2075a
    public boolean performAccessibilityAction(@NotNull View host, int action, @Nullable Bundle args) {
        Intrinsics.checkNotNullParameter(host, "host");
        if (action == 524288) {
            host.setTag(R.id.accessibility_state_expanded, Boolean.FALSE);
        }
        if (action == 262144) {
            host.setTag(R.id.accessibility_state_expanded, Boolean.TRUE);
        }
        if (!this.accessibilityActionsMap.containsKey(Integer.valueOf(action))) {
            return super.performAccessibilityAction(host, action, args);
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("actionName", this.accessibilityActionsMap.get(Integer.valueOf(action)));
        Context context = host.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        if (reactContext.hasActiveReactInstance()) {
            int id2 = host.getId();
            int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
            UIManager uIManager = UIManagerHelper.getUIManager(reactContext, ViewUtil.getUIManagerType(id2));
            if (uIManager != null) {
                uIManager.getEventDispatcher().dispatchEvent(new AccessibilityActionEvent(createMap, surfaceId, id2));
            }
        } else {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        AccessibilityRole accessibilityRole = (AccessibilityRole) host.getTag(R.id.accessibility_role);
        ReadableMap readableMap = (ReadableMap) host.getTag(R.id.accessibility_value);
        if (accessibilityRole != AccessibilityRole.ADJUSTABLE) {
            return true;
        }
        if (action != z.a.f68231q.b() && action != z.a.f68232r.b()) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey("text")) {
            scheduleAccessibilityEventSender(host);
        }
        return super.performAccessibilityAction(host, action, args);
    }

    @Nullable
    public final C6835A superGetAccessibilityNodeProvider(@NotNull View host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return super.getAccessibilityNodeProvider(host);
    }
}
