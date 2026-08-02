package zendesk.core;

/* loaded from: classes5.dex */
class BlipsPermissions {
    private boolean behavioural;
    private boolean pathfinder;
    private boolean required;

    /* renamed from: zendesk.core.BlipsPermissions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$core$BlipsGroup;

        static {
            int[] iArr = new int[BlipsGroup.values().length];
            $SwitchMap$zendesk$core$BlipsGroup = iArr;
            try {
                iArr[BlipsGroup.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$core$BlipsGroup[BlipsGroup.BEHAVIOURAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$core$BlipsGroup[BlipsGroup.PATHFINDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BlipsPermissions(boolean z10, boolean z11, boolean z12) {
        this.required = z10;
        this.behavioural = z11;
        this.pathfinder = z12;
    }

    public boolean isEnabled(BlipsGroup blipsGroup) {
        int i10 = AnonymousClass1.$SwitchMap$zendesk$core$BlipsGroup[blipsGroup.ordinal()];
        if (i10 == 1) {
            return this.required;
        }
        if (i10 == 2) {
            return this.behavioural;
        }
        if (i10 != 3) {
            return false;
        }
        return this.pathfinder;
    }

    public BlipsPermissions() {
        this(false, false, false);
    }
}
