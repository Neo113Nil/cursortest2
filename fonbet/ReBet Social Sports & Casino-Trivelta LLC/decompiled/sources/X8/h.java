package X8;

import Y8.e;
import a9.C1924a;
import android.content.Context;
import android.util.AttributeSet;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.enums.RenditionType;
import com.giphy.sdk.core.network.response.MediaResponse;
import com.giphy.sdk.ui.views.GPHMediaView;
import com.giphy.sdk.ui.views.GifView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class h extends GPHMediaView {

    /* renamed from: G, reason: collision with root package name */
    public static final a f13644G = new a(null);

    /* renamed from: H, reason: collision with root package name */
    public static final RenditionType f13645H = RenditionType.fixedWidth;

    /* renamed from: C, reason: collision with root package name */
    public RenditionType f13646C;

    /* renamed from: D, reason: collision with root package name */
    public Y8.e f13647D;

    /* renamed from: E, reason: collision with root package name */
    public Media f13648E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f13649F;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Y8.e.values().length];
            try {
                iArr[Y8.e.f14092c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Y8.e.f14093d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Y8.e.f14094e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Y8.e.f14095f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ h(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final Unit G(h hVar, MediaResponse mediaResponse, Throwable th2) {
        hVar.f13648E = mediaResponse != null ? mediaResponse.getData() : null;
        hVar.H();
        if (th2 != null) {
            timber.log.a.a("Error while fetching GIF: %s", th2.getLocalizedMessage());
        }
        return Unit.INSTANCE;
    }

    public final void F() {
        int i10 = b.$EnumSwitchMapping$0[this.f13647D.ordinal()];
        if (i10 == 1) {
            setScaleType(com.facebook.drawee.drawable.r.f30527h);
            return;
        }
        if (i10 == 2) {
            setScaleType(com.facebook.drawee.drawable.r.f30524e);
        } else if (i10 == 3) {
            setScaleType(com.facebook.drawee.drawable.r.f30528i);
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            setScaleType(com.facebook.drawee.drawable.r.f30520a);
        }
    }

    public final void H() {
        h hVar;
        Media media = this.f13648E;
        if (media != null) {
            hVar = this;
            GifView.z(hVar, media, this.f13646C, null, 4, null);
        } else {
            hVar = this;
        }
        Media media2 = hVar.f13648E;
        setAspectRatio(media2 != null ? U8.g.c(media2) : getAspectRatio());
        if (hVar.f13649F) {
            return;
        }
        s();
    }

    public final void setAutoPlay(@Nullable Boolean bool) {
        if (bool != null) {
            this.f13649F = bool.booleanValue();
        }
    }

    public final void setMedia(@Nullable String str) {
        if (str == null) {
            return;
        }
        J8.a.f5957a.a(str, new Function2() { // from class: X8.g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit G10;
                G10 = h.G(h.this, (MediaResponse) obj, (Throwable) obj2);
                return G10;
            }
        });
    }

    public final void setRenditionType(@Nullable String str) {
        RenditionType renditionType;
        RenditionType[] values = RenditionType.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                renditionType = null;
                break;
            }
            renditionType = values[i10];
            if (Intrinsics.areEqual(renditionType.name(), C1924a.f15105a.b(str))) {
                break;
            } else {
                i10++;
            }
        }
        if (renditionType == null) {
            renditionType = f13645H;
        }
        this.f13646C = renditionType;
        H();
    }

    public final void setResizeMode(@Nullable String str) {
        e.a aVar = Y8.e.f14090a;
        Y8.e a10 = aVar.a(str);
        if (a10 == null) {
            a10 = aVar.b();
        }
        this.f13647D = a10;
        F();
        H();
    }

    public final void setShowCheckeredBackground(@Nullable Boolean bool) {
        setBackgroundVisible(bool != null ? bool.booleanValue() : true);
        H();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13646C = f13645H;
        this.f13647D = Y8.e.f14090a.b();
        this.f13649F = true;
        F();
    }
}
