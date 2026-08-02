package com.vk.catalog2.common.dto.api;

import android.os.Bundle;
import com.vk.search.params.api.SearchParams;
import com.vk.search.ui.api.SearchInputMethod;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.afa;
import xsna.ahn;
import xsna.asp;
import xsna.cyh0;
import xsna.dz2;
import xsna.e3a;
import xsna.f550;
import xsna.msy;
import xsna.o8;
import xsna.ozl;
import xsna.r6a;
import xsna.rsg0;
import xsna.set0;
import xsna.tj2;
import xsna.u96;
import xsna.wba;
import xsna.wga;
import xsna.x1c0;
import xsna.yfb;
import xsna.zrp;

/* compiled from: SearchRequestFactory.kt */
/* loaded from: classes16.dex */
public abstract class SearchRequestFactory extends u96 {
    public final wba c;
    public a d;
    public String e;
    public String f;
    public SearchParams g;
    public boolean h;
    public String i;
    public boolean j;
    public InputMethod k;
    public final Object l;
    public final Object m;
    public final Object n;
    public boolean o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchRequestFactory.kt */
    public static final class InputMethod {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InputMethod[] $VALUES;
        public static final a Companion;
        public static final InputMethod GoogleVoice;
        public static final InputMethod Keyboard;

        @ozl
        public static final InputMethod Marusia;
        public static final InputMethod Preset;
        public static final InputMethod QueryViewClick;
        public static final InputMethod Suggest;
        private final String apiName;

        /* compiled from: SearchRequestFactory.kt */
        public static final class a {
        }

        static {
            InputMethod inputMethod = new InputMethod("Keyboard", 0, "keyboard");
            Keyboard = inputMethod;
            InputMethod inputMethod2 = new InputMethod("GoogleVoice", 1, "google_speech_to_text");
            GoogleVoice = inputMethod2;
            InputMethod inputMethod3 = new InputMethod("Preset", 2, "preset_from_link");
            Preset = inputMethod3;
            InputMethod inputMethod4 = new InputMethod("Marusia", 3, "marusia_speech_to_text");
            Marusia = inputMethod4;
            InputMethod inputMethod5 = new InputMethod("Suggest", 4, "suggest");
            Suggest = inputMethod5;
            InputMethod inputMethod6 = new InputMethod("QueryViewClick", 5, "query_view_click");
            QueryViewClick = inputMethod6;
            InputMethod[] inputMethodArr = {inputMethod, inputMethod2, inputMethod3, inputMethod4, inputMethod5, inputMethod6};
            $VALUES = inputMethodArr;
            $ENTRIES = new asp(inputMethodArr);
            Companion = new a();
        }

        public InputMethod(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static InputMethod valueOf(String str) {
            return (InputMethod) Enum.valueOf(InputMethod.class, str);
        }

        public static InputMethod[] values() {
            return (InputMethod[]) $VALUES.clone();
        }

        public final String h() {
            return this.apiName;
        }
    }

    /* compiled from: SearchRequestFactory.kt */
    public interface a {
        String h();
    }

    /* compiled from: SearchRequestFactory.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchInputMethod.values().length];
            try {
                iArr[SearchInputMethod.Keyboard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchInputMethod.GoogleVoice.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchInputMethod.Preset.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchInputMethod.Suggest.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchInputMethod.QueryViewClick.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SearchInputMethod.Marusia.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SearchRequestFactory(wba wbaVar, a aVar, int i) {
        this(wbaVar, (i & 2) != 0 ? null : aVar, (Bundle) null);
    }

    @Override // xsna.gda
    public final q d(String str, String str2, String str3, boolean z, Integer num) {
        q h;
        if (str2 != null || num != null) {
            return g(str, str2);
        }
        String str4 = this.e;
        return (str4 == null || (h = h(str4, this.g, this.d, z)) == null) ? g0.b : h;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    public m1 g(String str, String str2) {
        if (this.o) {
            dz2 x = yfb.x(wga.d(k(), str == null ? "" : str, null, str2, null, null, null, 32762));
            ahn.D(x);
            return rsg0.T(x).U(new cyh0(new o8(1, (afa) this.n.getValue(), afa.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogSectionResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0, 10), 0)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        }
        r6a r6aVar = new r6a(this.c, str == null ? "" : str, str2, false, null, null, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
        ahn.D(r6aVar);
        return rsg0.y0(r6aVar, null, null, 3);
    }

    public q h(String str, SearchParams searchParams, a aVar, boolean z) {
        return i(str, z);
    }

    public abstract q i(String str, boolean z);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final e3a j() {
        return (e3a) this.m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public wga k() {
        return (wga) this.l.getValue();
    }

    public set0 l() {
        return null;
    }

    public boolean m() {
        return this.j;
    }

    public void n(boolean z) {
        this.j = z;
    }

    public final void o(SearchInputMethod searchInputMethod) {
        InputMethod inputMethod;
        switch (searchInputMethod == null ? -1 : b.$EnumSwitchMapping$0[searchInputMethod.ordinal()]) {
            case -1:
                inputMethod = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                inputMethod = InputMethod.Keyboard;
                break;
            case 2:
                inputMethod = InputMethod.GoogleVoice;
                break;
            case 3:
                inputMethod = InputMethod.Preset;
                break;
            case 4:
                inputMethod = InputMethod.Suggest;
                break;
            case 5:
                inputMethod = InputMethod.QueryViewClick;
                break;
            case 6:
                inputMethod = InputMethod.Marusia;
                break;
        }
        this.k = inputMethod;
    }

    public SearchRequestFactory(wba wbaVar, a aVar, Bundle bundle) {
        super(bundle);
        this.c = wbaVar;
        this.d = aVar;
        f550 f550Var = new f550(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = msy.a(lazyThreadSafetyMode, f550Var);
        this.m = msy.a(lazyThreadSafetyMode, new tj2(21));
        this.n = msy.a(lazyThreadSafetyMode, new x1c0(5));
    }
}
