package com.vk.ecomm.market.marketitem.api;

/* compiled from: MarketLogicException.kt */
/* loaded from: classes18.dex */
public abstract class MarketLogicException extends Exception {
    public static final /* synthetic */ int b = 0;

    /* compiled from: MarketLogicException.kt */
    public static final class MarketAccessDenied extends MarketLogicException {
        public MarketAccessDenied() {
            super(0);
        }
    }

    /* compiled from: MarketLogicException.kt */
    public static final class MarketDisabled extends MarketLogicException {
        public MarketDisabled() {
            super(0);
        }
    }

    /* compiled from: MarketLogicException.kt */
    public static final class MarketServicesDisabled extends MarketLogicException {
        public MarketServicesDisabled() {
            super(0);
        }
    }

    /* compiled from: MarketLogicException.kt */
    public static final class a {
        public static MarketLogicException a(Integer num) {
            if (num != null && num.intValue() == 1525) {
                return new MarketDisabled();
            }
            if (num != null && num.intValue() == 1526) {
                return new MarketServicesDisabled();
            }
            if (num != null && num.intValue() == 15) {
                return new MarketAccessDenied();
            }
            return null;
        }
    }

    public /* synthetic */ MarketLogicException(int i) {
        this();
    }

    private MarketLogicException() {
    }
}
