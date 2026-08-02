package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.ironsource.mediationsdk.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lm8 implements kli {
    public ArrayList a;
    public ArrayList b;

    public void a(Node node) {
        xkg xkgVar;
        ArrayList arrayList;
        NodeList a = elg.a(node, "./Extension");
        int length = a.getLength();
        for (int i = 0; i < length; i++) {
            NodeList childNodes = a.item(i).getChildNodes();
            int length2 = childNodes.getLength();
            for (int i2 = 0; i2 < length2; i2++) {
                Node item = childNodes.item(i2);
                if (item.getNodeName().equals("offset")) {
                    Node namedItem = item.getAttributes().getNamedItem("isForced");
                    if (namedItem != null) {
                        namedItem.getNodeValue().equals("1");
                    }
                    Node namedItem2 = item.getAttributes().getNamedItem("skipoffset");
                    if (namedItem2 != null) {
                        namedItem2.getNodeValue();
                    }
                } else if (item.getNodeName().equals("sort")) {
                    Node namedItem3 = item.getAttributes().getNamedItem("rank");
                    if (namedItem3 != null) {
                        namedItem3.getNodeValue();
                    }
                } else if (item.getNodeName().equals("customisedScript")) {
                    item.getTextContent().getClass();
                } else if (item.getNodeName().equals("instanceCount")) {
                    try {
                        Integer.parseInt(item.getTextContent().trim());
                    } catch (NumberFormatException unused) {
                    }
                } else if (item.getNodeName().equals("SmartMetrics")) {
                    NodeList childNodes2 = item.getChildNodes();
                    if (childNodes2 != null && childNodes2.getLength() > 0 && this.a == null) {
                        this.a = new ArrayList();
                        int length3 = childNodes2.getLength();
                        for (int i3 = 0; i3 < length3; i3++) {
                            if (childNodes2.item(i3).getNodeName().equals("SmartMetric")) {
                                Node item2 = childNodes2.item(i3);
                                Node namedItem4 = item2.getAttributes().getNamedItem("name");
                                if (namedItem4 != null) {
                                    String nodeValue = namedItem4.getNodeValue();
                                    String trim = item2.getTextContent().trim();
                                    if (jig.a.contains(jig.a(nodeValue))) {
                                        xkgVar = new xkg();
                                        xkgVar.a = nodeValue;
                                        xkgVar.b = trim;
                                        xkgVar.c = xkg.e(nodeValue);
                                        if (xkgVar != null && (arrayList = this.a) != null) {
                                            arrayList.add(xkgVar);
                                        }
                                    }
                                }
                                xkgVar = null;
                                if (xkgVar != null) {
                                    arrayList.add(xkgVar);
                                }
                            }
                        }
                    }
                } else if (item.getNodeName().equals("SmartMacros")) {
                    NodeList childNodes3 = item.getChildNodes();
                    int length4 = childNodes3.getLength();
                    for (int i4 = 0; i4 < length4; i4++) {
                        Node item3 = childNodes3.item(i4);
                        if (item3.getNodeName().equals("statDomainID")) {
                            try {
                                Long.parseLong(item3.getTextContent().trim());
                            } catch (NumberFormatException unused2) {
                            }
                        } else if (item3.getNodeName().equals("networkID")) {
                            Long.parseLong(item3.getTextContent().trim());
                        } else if (item3.getNodeName().equals("templateID")) {
                            Long.parseLong(item3.getTextContent().trim());
                        } else if (item3.getNodeName().equals("advertiserID")) {
                            Long.parseLong(item3.getTextContent().trim());
                        } else if (item3.getNodeName().equals("campaignID")) {
                            Long.parseLong(item3.getTextContent().trim());
                        } else if (item3.getNodeName().equals("insertionID")) {
                            Long.parseLong(item3.getTextContent().trim());
                        } else if (item3.getNodeName().equals("siteID")) {
                            Long.parseLong(item3.getTextContent().trim());
                        } else if (item3.getNodeName().equals("pageID")) {
                            item3.getTextContent().getClass();
                        } else if (item3.getNodeName().equals("formatID")) {
                            Long.parseLong(item3.getTextContent().trim());
                        } else if (item3.getNodeName().equals("adBreakType")) {
                            Integer.parseInt(item3.getTextContent().trim());
                        } else if (item3.getNodeName().equals("target")) {
                            item3.getTextContent().getClass();
                        } else if (item3.getNodeName().equals("sessionID")) {
                            Long.parseLong(item3.getTextContent().trim());
                        } else if (item3.getNodeName().equals("baseUrl")) {
                            item3.getTextContent().getClass();
                        } else if (item3.getNodeName().equals(d.k)) {
                            Integer.parseInt(item3.getTextContent().trim());
                        } else if (item3.getNodeName().equals("videoPlayerWidth")) {
                            Integer.parseInt(item3.getTextContent().trim());
                        } else if (item3.getNodeName().equals("videoPlayerHeight")) {
                            Integer.parseInt(item3.getTextContent().trim());
                        } else if (item3.getNodeName().equals(Payload.RFR)) {
                            item3.getTextContent().getClass();
                        } else if (item3.getNodeName().equals("ip")) {
                            item3.getTextContent().getClass();
                        } else if (item3.getNodeName().equals("contentID")) {
                            item3.getTextContent().getClass();
                        } else if (item3.getNodeName().equals("contentProviderID")) {
                            item3.getTextContent().getClass();
                        }
                    }
                } else if (item.getNodeName().equals("RtbMacros")) {
                    NodeList childNodes4 = item.getChildNodes();
                    int length5 = childNodes4.getLength();
                    for (int i5 = 0; i5 < length5; i5++) {
                        Node item4 = childNodes4.item(i5);
                        if (item4.getNodeName().equals("AdvertiserId")) {
                            item4.getTextContent().getClass();
                        } else if (item4.getNodeName().equals("DspId")) {
                            item4.getTextContent().getClass();
                        } else if (item4.getNodeName().equals("BuyerId")) {
                            item4.getTextContent().getClass();
                        } else if (item4.getNodeName().equals("DealId")) {
                            item4.getTextContent().getClass();
                        } else if (item4.getNodeName().equals("AuctionId")) {
                            item4.getTextContent().getClass();
                        } else if (item4.getNodeName().equals("PublisherId")) {
                            item4.getTextContent().getClass();
                        } else if (item4.getNodeName().equals("BidLogTimeTicks")) {
                            item4.getTextContent().getClass();
                        } else if (item4.getNodeName().equals("EnvironmentType")) {
                            item4.getTextContent().getClass();
                        } else if (item4.getNodeName().equals("ImpressionHash")) {
                            item4.getTextContent().getClass();
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        NodeList a2 = elg.a(node, ".//AdVerifications");
        for (int i6 = 0; i6 < a2.getLength(); i6++) {
            NodeList a3 = elg.a(a2.item(i6), "./Verification");
            for (int i7 = 0; i7 < a3.getLength(); i7++) {
                lkg a4 = lkg.a(a3.item(i7));
                if (a4 != null) {
                    arrayList2.add(a4);
                }
            }
        }
        this.b = arrayList2;
    }

    @Override // defpackage.kli
    public List getCues(long j) {
        int c = lik.c(this.b, Long.valueOf(j), false);
        return c == -1 ? Collections.EMPTY_LIST : (List) this.a.get(c);
    }

    @Override // defpackage.kli
    public long getEventTime(int i) {
        ArrayList arrayList = this.b;
        qx9.r(i >= 0);
        qx9.r(i < arrayList.size());
        return ((Long) arrayList.get(i)).longValue();
    }

    @Override // defpackage.kli
    public int getEventTimeCount() {
        return this.b.size();
    }

    @Override // defpackage.kli
    public int getNextEventTimeIndex(long j) {
        int i;
        ArrayList arrayList = this.b;
        Long valueOf = Long.valueOf(j);
        int i2 = lik.a;
        int binarySearch = Collections.binarySearch(arrayList, valueOf);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = arrayList.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (((Comparable) arrayList.get(binarySearch)).compareTo(valueOf) == 0);
            i = binarySearch;
        }
        if (i < arrayList.size()) {
            return i;
        }
        return -1;
    }
}
